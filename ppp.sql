-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 17-10-2021 a las 22:14:54
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `ppp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clave`
--

CREATE TABLE IF NOT EXISTS `clave` (
  `clave` varchar(100) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `clave`
--

INSERT INTO `clave` (`clave`) VALUES
('ppp');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `nombre` varchar(500) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(500) COLLATE utf8_spanish_ci NOT NULL,
  `ci` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`ci`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingredientes`
--

CREATE TABLE IF NOT EXISTS `ingredientes` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `id_mp` tinyint(4) NOT NULL,
  `id_produc` tinyint(4) NOT NULL,
  `cantidad` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_mp` (`id_mp`,`id_produc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia_prima`
--

CREATE TABLE IF NOT EXISTS `materia_prima` (
  `nombre` varchar(500) COLLATE utf8_spanish_ci NOT NULL,
  `precio` double NOT NULL,
  `uni_med` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `nombre` varchar(500) COLLATE utf8_spanish_ci NOT NULL,
  `cantidad` int(11) NOT NULL,
  `uni_med` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `cant_mayor` int(11) NOT NULL,
  `transporte_prod` double NOT NULL,
  `mano_prod` double NOT NULL,
  `mano_venta` double NOT NULL,
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
