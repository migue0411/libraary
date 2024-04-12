-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 18-11-2021 a las 06:56:41
-- Versión del servidor: 8.0.21
-- Versión de PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `book`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `account`
--

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
  `username` varchar(20) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  `sec_q` varchar(25) DEFAULT NULL,
  `sec_ans` varchar(25) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `book_id` varchar(10) DEFAULT NULL,
  `name` varchar(40) DEFAULT NULL,
  `isbn` varchar(20) DEFAULT NULL,
  `publisher` varchar(30) DEFAULT NULL,
  `edition` varchar(10) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `issuebook`
--

DROP TABLE IF EXISTS `issuebook`;
CREATE TABLE IF NOT EXISTS `issuebook` (
  `book_id` varchar(10) DEFAULT NULL,
  `student_id` varchar(10) DEFAULT NULL,
  `bname` varchar(40) DEFAULT NULL,
  `sname` varchar(40) DEFAULT NULL,
  `branch` varchar(10) DEFAULT NULL,
  `dateOfIssue` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `returnbook`
--

DROP TABLE IF EXISTS `returnbook`;
CREATE TABLE IF NOT EXISTS `returnbook` (
  `book_id` varchar(10) DEFAULT NULL,
  `student_id` varchar(10) DEFAULT NULL,
  `bname` varchar(40) DEFAULT NULL,
  `sname` varchar(40) DEFAULT NULL,
  `branch` varchar(10) DEFAULT NULL,
  `dateOfIssue` varchar(30) DEFAULT NULL,
  `dateOfReturn` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `student_id` varchar(10) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL,
  `father` varchar(25) DEFAULT NULL,
  `branch` varchar(10) DEFAULT NULL,
  `year` varchar(10) DEFAULT NULL,
  `semester` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
