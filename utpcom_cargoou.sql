-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 20, 2024 at 01:06 AM
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
  `usuCre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuMod` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fecCre` datetime NOT NULL,
  `fecMod` datetime NOT NULL,
  PRIMARY KEY (`id_bus`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`id_bus`, `placa`, `color`, `estBus`, `numAsi`, `usuCre`, `usuMod`, `fecCre`, `fecMod`) VALUES
(1, 'ABC123', 'ROJO', 'ACT', 40, 'root@localhost', 'root@localhost', '2023-12-12 16:29:27', '2023-12-12 16:29:27');

--
-- Triggers `bus`
--
DROP TRIGGER IF EXISTS `T01I_bus`;
DELIMITER $$
CREATE TRIGGER `T01I_bus` BEFORE INSERT ON `bus` FOR EACH ROW BEGIN
set new.usuCre = USER();
set new.fecCre = NOW();
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `T02U_bus`;
DELIMITER $$
CREATE TRIGGER `T02U_bus` BEFORE UPDATE ON `bus` FOR EACH ROW BEGIN
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;

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
  `usuCre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuMod` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fecCre` datetime NOT NULL,
  `fecMod` datetime NOT NULL,
  PRIMARY KEY (`id_conductor`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Triggers `conductor`
--
DROP TRIGGER IF EXISTS `T01I_conductor`;
DELIMITER $$
CREATE TRIGGER `T01I_conductor` BEFORE INSERT ON `conductor` FOR EACH ROW BEGIN
set new.usuCre = USER();
set new.fecCre = NOW();
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `T02U_conductor`;
DELIMITER $$
CREATE TRIGGER `T02U_conductor` BEFORE UPDATE ON `conductor` FOR EACH ROW BEGIN
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `correo`
--

DROP TABLE IF EXISTS `correo`;
CREATE TABLE IF NOT EXISTS `correo` (
  `id_correo` int(11) NOT NULL AUTO_INCREMENT,
  `codCorreo` char(8) COLLATE utf8mb4_unicode_ci NOT NULL,
  `titCorreo` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `emiCorreo` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `desCorreo` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `asuCorreo` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `menCorreo` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fecCre` datetime NOT NULL,
  `fecMod` datetime NOT NULL,
  `usuCre` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuMod` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_correo`)
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
  `usuCre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuMod` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fecCre` datetime NOT NULL,
  `fecMod` datetime NOT NULL,
  `obsviaje` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_detviaje`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Triggers `detviaje`
--
DROP TRIGGER IF EXISTS `T01I_detviaje`;
DELIMITER $$
CREATE TRIGGER `T01I_detviaje` BEFORE INSERT ON `detviaje` FOR EACH ROW BEGIN
set new.usuCre = USER();
set new.fecCre = NOW();
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `T02U_detviaje`;
DELIMITER $$
CREATE TRIGGER `T02U_detviaje` BEFORE UPDATE ON `detviaje` FOR EACH ROW BEGIN
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
CREATE TABLE IF NOT EXISTS `horario` (
  `id_horario` int(11) NOT NULL,
  `horSalida` time DEFAULT NULL,
  `usuCre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuMod` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fecCre` datetime NOT NULL,
  `fecMod` datetime NOT NULL,
  `estHorari` char(3) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id_horario`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Triggers `horario`
--
DROP TRIGGER IF EXISTS `T01I_horario`;
DELIMITER $$
CREATE TRIGGER `T01I_horario` BEFORE INSERT ON `horario` FOR EACH ROW BEGIN
set new.usuCre = USER();
set new.fecCre = NOW();
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `T02U_horario`;
DELIMITER $$
CREATE TRIGGER `T02U_horario` BEFORE UPDATE ON `horario` FOR EACH ROW BEGIN
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;

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
  `usuCre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuMod` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fecCre` datetime NOT NULL,
  `fecMod` datetime NOT NULL,
  PRIMARY KEY (`id_pasajero`),
  UNIQUE KEY `Card` (`id_persona`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Triggers `pasajero`
--
DROP TRIGGER IF EXISTS `T01I_pasajero`;
DELIMITER $$
CREATE TRIGGER `T01I_pasajero` BEFORE INSERT ON `pasajero` FOR EACH ROW BEGIN
set new.usuCre = USER();
set new.fecCre = NOW();
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `T02U_pasajero`;
DELIMITER $$
CREATE TRIGGER `T02U_pasajero` BEFORE UPDATE ON `pasajero` FOR EACH ROW BEGIN
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
  `id_persona` int(11) NOT NULL AUTO_INCREMENT,
  `nomPerson` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuCre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuMod` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fecCre` datetime NOT NULL,
  `fecMod` datetime NOT NULL,
  `apePerson` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `estPerson` varchar(3) COLLATE utf8mb4_unicode_ci NOT NULL,
  `corPerson` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `edaPerson` int(2) NOT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Triggers `persona`
--
DROP TRIGGER IF EXISTS `T01I_persona`;
DELIMITER $$
CREATE TRIGGER `T01I_persona` BEFORE INSERT ON `persona` FOR EACH ROW BEGIN
set new.usuCre = USER();
set new.fecCre = NOW();
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `T02U_persona`;
DELIMITER $$
CREATE TRIGGER `T02U_persona` BEFORE UPDATE ON `persona` FOR EACH ROW BEGIN
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;

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
  `usuCre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuMod` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fecCre` datetime NOT NULL,
  `fecMod` datetime NOT NULL,
  PRIMARY KEY (`id_ruta`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Triggers `ruta`
--
DROP TRIGGER IF EXISTS `T01I_ruta`;
DELIMITER $$
CREATE TRIGGER `T01I_ruta` BEFORE INSERT ON `ruta` FOR EACH ROW BEGIN
set new.usuCre = USER();
set new.fecCre = NOW();
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `T02U_ruta`;
DELIMITER $$
CREATE TRIGGER `T02U_ruta` BEFORE UPDATE ON `ruta` FOR EACH ROW BEGIN
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `codRol` char(3) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_persona` int(11) NOT NULL,
  `usuCre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuMod` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fecCre` datetime NOT NULL,
  `fecMod` datetime NOT NULL,
  `estUsuari` char(3) COLLATE utf8mb4_unicode_ci NOT NULL,
  `codUsuari` char(8) COLLATE utf8mb4_unicode_ci NOT NULL,
  `claUsuari` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `codRol`, `id_persona`, `usuCre`, `usuMod`, `fecCre`, `fecMod`, `estUsuari`, `codUsuari`, `claUsuari`) VALUES
(1, 'SUP', 1, 'root@localhost', 'root@localhost', '2023-12-12 16:29:02', '2023-12-12 17:35:21', 'ACT', 'WNORIEGA', '123456');

--
-- Triggers `usuario`
--
DROP TRIGGER IF EXISTS `T01I_usuario`;
DELIMITER $$
CREATE TRIGGER `T01I_usuario` BEFORE INSERT ON `usuario` FOR EACH ROW BEGIN
set new.usuCre = USER();
set new.fecCre = NOW();
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `T02U_usuario`;
DELIMITER $$
CREATE TRIGGER `T02U_usuario` BEFORE UPDATE ON `usuario` FOR EACH ROW BEGIN
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;

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
  `usuCre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuMod` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fecCre` datetime NOT NULL,
  `fecMod` datetime NOT NULL,
  `estViaje` char(3) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_viaje`),
  KEY `BusCode` (`id_bus`),
  KEY `RouteCode` (`id_ruta`),
  KEY `ScheduleCode` (`id_horario`),
  KEY `DriverCode` (`id_conductor`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Triggers `viaje`
--
DROP TRIGGER IF EXISTS `T01I_viaje`;
DELIMITER $$
CREATE TRIGGER `T01I_viaje` BEFORE INSERT ON `viaje` FOR EACH ROW BEGIN
set new.usuCre = USER();
set new.fecCre = NOW();
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `T02U_viaje`;
DELIMITER $$
CREATE TRIGGER `T02U_viaje` BEFORE UPDATE ON `viaje` FOR EACH ROW BEGIN
set new.usuMod = USER();
set new.fecMod = NOW();
END
$$
DELIMITER ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
