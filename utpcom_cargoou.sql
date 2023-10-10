-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 10, 2023 at 11:00 PM
-- Server version: 5.7.40
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `utpcom_cargoou`
--
CREATE DATABASE IF NOT EXISTS `utpcom_cargoou` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `utpcom_cargoou`;

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

DROP TABLE IF EXISTS `bus`;
CREATE TABLE IF NOT EXISTS `bus` (
  `id_bus` int(11) NOT NULL,
  `placa` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `color` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estBus` char(3) COLLATE utf8mb4_unicode_ci NOT NULL,
  `numAsi` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_bus`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `conductor`
--

DROP TABLE IF EXISTS `conductor`;
CREATE TABLE IF NOT EXISTS `conductor` (
  `id_conductor` int(11) NOT NULL,
  `codConduc` char(8) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id_persona` int(11) DEFAULT NULL,
  `calConduc` int(2) DEFAULT NULL,
  `numLicConduc` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id_conductor`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `detviaje`
--

DROP TABLE IF EXISTS `detviaje`;
CREATE TABLE IF NOT EXISTS `detviaje` (
  `id_detviaje` int(11) NOT NULL AUTO_INCREMENT,
  `id_viaje` int(11) NOT NULL,
  `id_pasajero` int(11) NOT NULL,
  `asiento` varchar(6) COLLATE utf8mb4_unicode_ci NOT NULL,
  `estado` char(3) COLLATE utf8mb4_unicode_ci NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `obsviaje` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_detviaje`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
CREATE TABLE IF NOT EXISTS `horario` (
  `id_horario` int(11) NOT NULL,
  `horSalida` time DEFAULT NULL,
  `estHorari` char(3) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id_horario`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pasajero`
--

DROP TABLE IF EXISTS `pasajero`;
CREATE TABLE IF NOT EXISTS `pasajero` (
  `id_pasajero` int(11) NOT NULL,
  `codPasaje` char(8) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id_persona` int(11) DEFAULT NULL,
  `codTarjet` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `numViajes` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pasajero`),
  UNIQUE KEY `Card` (`id_persona`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
  `id_persona` int(11) NOT NULL AUTO_INCREMENT,
  `nomPerson` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apePerson` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `estPerson` varchar(3) COLLATE utf8mb4_unicode_ci NOT NULL,
  `corPerson` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `edaPerson` int(2) NOT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ruta`
--

DROP TABLE IF EXISTS `ruta`;
CREATE TABLE IF NOT EXISTS `ruta` (
  `id_ruta` int(11) NOT NULL,
  `lugInicia` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `lugFinal` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `numParade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_ruta`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `codRol` char(3) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_persona` int(11) NOT NULL,
  `estUsuari` char(3) COLLATE utf8mb4_unicode_ci NOT NULL,
  `codUsuari` char(8) COLLATE utf8mb4_unicode_ci NOT NULL,
  `claUsuari` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `viaje`
--

DROP TABLE IF EXISTS `viaje`;
CREATE TABLE IF NOT EXISTS `viaje` (
  `id_viaje` int(11) NOT NULL,
  `id_bus` int(11) DEFAULT NULL,
  `id_ruta` int(11) DEFAULT NULL,
  `id_horario` int(11) DEFAULT NULL,
  `id_conductor` int(11) DEFAULT NULL,
  `preViaje` decimal(10,2) DEFAULT NULL,
  `estViaje` char(3) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_viaje`),
  KEY `BusCode` (`id_bus`),
  KEY `RouteCode` (`id_ruta`),
  KEY `ScheduleCode` (`id_horario`),
  KEY `DriverCode` (`id_conductor`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
