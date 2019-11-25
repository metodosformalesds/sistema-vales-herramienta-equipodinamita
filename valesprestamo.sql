-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.18 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para valesprestamo
CREATE DATABASE IF NOT EXISTS `valesprestamo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `valesprestamo`;

-- Volcando estructura para tabla valesprestamo.herramientas
CREATE TABLE IF NOT EXISTS `herramientas` (
  `numInventario` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `caracteristicas` text,
  `cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`numInventario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla valesprestamo.herramientas: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `herramientas` DISABLE KEYS */;
INSERT INTO `herramientas` (`numInventario`, `nombre`, `caracteristicas`, `cantidad`) VALUES
	(1, 'Resistencia 20k ohms', 'Componente electrónico diseñado para introducir una resistencia eléctrica determinada entre dos puntos de un circuito eléctrico.', 5),
	(2, 'Pinzas Perras', 'Pinzas para cortar.', 12),
	(3, 'Cable Ethernet', 'Cable de conexión de red.', 12),
	(4, 'Banana Caiman', 'Cable', 100),
	(5, 'Transistor', 'Dispositivo electrónico semiconductor utilizado para entregar una señal de salida en respuesta a una señal de entrada.', 100),
	(6, 'Push Button', 'Botón que permite el flujo de corriente si es presionado.', 20),
	(7, 'Capacitor', 'Dispositivo que almacena energía sustentando un campo eléctrico.', 25),
	(8, 'Cable banana-caimán', 'Cable de conexion.', 31),
	(9, 'Cable banana-banana', 'Cable de conexion.', 200);
/*!40000 ALTER TABLE `herramientas` ENABLE KEYS */;

-- Volcando estructura para tabla valesprestamo.maquinaria
CREATE TABLE IF NOT EXISTS `maquinaria` (
  `numSerie` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL DEFAULT '',
  `numMaquina` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`numSerie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla valesprestamo.maquinaria: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `maquinaria` DISABLE KEYS */;
INSERT INTO `maquinaria` (`numSerie`, `Nombre`, `numMaquina`) VALUES
	(1, 'Torno', 1),
	(2, 'CNC', 2);
/*!40000 ALTER TABLE `maquinaria` ENABLE KEYS */;

-- Volcando estructura para tabla valesprestamo.valeherramienta
CREATE TABLE IF NOT EXISTS `valeherramienta` (
  `Folio` int(11) NOT NULL DEFAULT '0',
  `HoraEntrada` time DEFAULT NULL,
  `HoraSalida` time DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `NombreDocente` varchar(50) DEFAULT NULL,
  `Clase` varchar(50) DEFAULT NULL,
  `NomPrac` varchar(50) DEFAULT NULL,
  `idHerramienta` int(11) DEFAULT NULL,
  `NumLab` varchar(50) DEFAULT NULL,
  `Observaciones` text,
  `MatriculaEntrega` int(11) DEFAULT NULL,
  `MatriculaRecibe` int(11) DEFAULT '0',
  `Estatus` varchar(50) DEFAULT NULL,
  `NombreSolicitante` varchar(50) DEFAULT NULL,
  `MatriculaSolicitante` int(11) DEFAULT NULL,
  KEY `FK_valeherramienta_herramientas` (`idHerramienta`),
  CONSTRAINT `FK_valeherramienta_herramientas` FOREIGN KEY (`idHerramienta`) REFERENCES `herramientas` (`numInventario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla valesprestamo.valeherramienta: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `valeherramienta` DISABLE KEYS */;
INSERT INTO `valeherramienta` (`Folio`, `HoraEntrada`, `HoraSalida`, `Fecha`, `NombreDocente`, `Clase`, `NomPrac`, `idHerramienta`, `NumLab`, `Observaciones`, `MatriculaEntrega`, `MatriculaRecibe`, `Estatus`, `NombreSolicitante`, `MatriculaSolicitante`) VALUES
	(1, '19:57:07', '00:00:00', '2019-11-22', 'Carlos Ponce', 'Electronica', 'Sensores', 8, 'D1-105', 'NA', 169818, 0, 'Activo', 'Gustavo Cerna', 169837),
	(1, '19:57:07', '00:00:00', '2019-11-22', 'Carlos Ponce', 'Electronica', 'Sensores', 5, 'D1-105', 'NA', 169818, 0, 'Finalizado', 'Gustavo Cerna', 169837),
	(1, '19:57:07', '00:00:00', '2019-11-22', 'Carlos Ponce', 'Electronica', 'Sensores', 1, 'D1-105', 'NA', 169818, 0, 'Activo', 'Gustavo Cerna', 169837),
	(2, '19:57:07', '00:00:00', '2019-11-22', 'Carlos Fuentes', 'Circuitos III', 'Circuitos Unidos', 1, 'D1-107', 'NA', 169837, 0, 'Finalizado', 'Leandro Carrijo', 169822),
	(2, '19:57:07', '00:00:00', '2019-11-22', 'Carlos Fuentes', 'Circuitos III', 'Circuitos Unidos', 4, 'D1-107', 'NA', 169837, 0, 'Finalizado', 'Leandro Carrijo', 169822),
	(2, '19:57:07', '00:00:00', '2019-11-22', 'Carlos Fuentes', 'Circuitos III', 'Circuitos Unidos', 6, 'D1-107', 'NA', 169837, 0, 'Finalizado', 'Leandro Carrijo', 169822),
	(2, '19:57:07', '00:00:00', '2019-11-22', 'Carlos Fuentes', 'Circuitos III', 'Circuitos Unidos', 5, 'D1-107', 'NA', 169837, 0, 'Finalizado', 'Leandro Carrijo', 169822),
	(3, '11:52:38', '00:00:00', '2019-11-23', 'Alan Ponce', 'Programacion II', 'Herencia', 3, 'D2-105', 'NA', 169837, 0, 'Activo', 'Edgar Reyes', 169818);
/*!40000 ALTER TABLE `valeherramienta` ENABLE KEYS */;

-- Volcando estructura para tabla valesprestamo.valemaquinaria
CREATE TABLE IF NOT EXISTS `valemaquinaria` (
  `Folio` int(11) DEFAULT '0',
  `HoraEntrada` time DEFAULT NULL,
  `HoraSalida` time DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `NombreDocente` varchar(50) DEFAULT NULL,
  `condicionInicial` varchar(50) DEFAULT NULL,
  `condicionFinal` varchar(50) DEFAULT NULL,
  `NombreSolicitante` varchar(50) DEFAULT NULL,
  `MatriculaSolicitante` int(11) DEFAULT '0',
  `MatriculaEntrega` int(11) DEFAULT '0',
  `MatriculaRecibe` int(11) DEFAULT '0',
  `idSerie` int(11) DEFAULT '0',
  `Estatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla valesprestamo.valemaquinaria: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `valemaquinaria` DISABLE KEYS */;
INSERT INTO `valemaquinaria` (`Folio`, `HoraEntrada`, `HoraSalida`, `Fecha`, `NombreDocente`, `condicionInicial`, `condicionFinal`, `NombreSolicitante`, `MatriculaSolicitante`, `MatriculaEntrega`, `MatriculaRecibe`, `idSerie`, `Estatus`) VALUES
	(1, '14:50:38', '02:26:50', '2019-11-24', 'Carlos Ponce', 'Sucia', 'Sucia', 'Hector Sanchez', 169840, 169818, 169818, 1, 'Activo');
/*!40000 ALTER TABLE `valemaquinaria` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
