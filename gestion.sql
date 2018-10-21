-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 05 juil. 2018 à 13:47
-- Version du serveur :  5.7.19
-- Version de PHP :  7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestion`
--

-- --------------------------------------------------------

--
-- Structure de la table `autres`
--

DROP TABLE IF EXISTS `autres`;
CREATE TABLE IF NOT EXISTS `autres` (
  `bonneref` int(11) NOT NULL,
  `coderef` int(11) NOT NULL,
  `Designation` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Quantite` int(11) NOT NULL,
  PRIMARY KEY (`bonneref`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `autres`
--

INSERT INTO `autres` (`bonneref`, `coderef`, `Designation`, `Quantite`) VALUES
(100, 101, 'autre', 3);

-- --------------------------------------------------------

--
-- Structure de la table `bon`
--

DROP TABLE IF EXISTS `bon`;
CREATE TABLE IF NOT EXISTS `bon` (
  `Identifiant` int(11) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Ville` varchar(50) NOT NULL,
  `Region` varchar(50) NOT NULL,
  `Numero_auto` varchar(50) NOT NULL,
  `Montant` double NOT NULL,
  `Date` datetime NOT NULL,
  `Etat` int(11) NOT NULL,
  PRIMARY KEY (`Identifiant`,`Nom`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `bon`
--

INSERT INTO `bon` (`Identifiant`, `Nom`, `Ville`, `Region`, `Numero_auto`, `Montant`, `Date`, `Etat`) VALUES
(1444, 'sencode', 'dakar', 'dakar', '1200', 10000, '2018-06-04 00:00:00', 1);

-- --------------------------------------------------------

--
-- Structure de la table `connection`
--

DROP TABLE IF EXISTS `connection`;
CREATE TABLE IF NOT EXISTS `connection` (
  `Identifiant` int(11) NOT NULL AUTO_INCREMENT,
  `Travail` varchar(50) NOT NULL,
  `Login` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  PRIMARY KEY (`Identifiant`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `connection`
--

INSERT INTO `connection` (`Identifiant`, `Travail`, `Login`, `Password`) VALUES
(1, 'Administrateur', 'admin', 'gestock'),
(9, 'Secretaire', 'amad', 'amad'),
(10, 'Secretaire', 'sougou', '404065');

-- --------------------------------------------------------

--
-- Structure de la table `depense`
--

DROP TABLE IF EXISTS `depense`;
CREATE TABLE IF NOT EXISTS `depense` (
  `Identifiant` int(11) NOT NULL AUTO_INCREMENT,
  `Montant` double NOT NULL,
  `Commentaire` text NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`Identifiant`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

DROP TABLE IF EXISTS `facture`;
CREATE TABLE IF NOT EXISTS `facture` (
  `Identifiant` int(11) NOT NULL AUTO_INCREMENT,
  `Montant` double NOT NULL,
  `Date` datetime NOT NULL,
  `Etat` int(11) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  PRIMARY KEY (`Identifiant`)
) ENGINE=MyISAM AUTO_INCREMENT=81 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `facture`
--

INSERT INTO `facture` (`Identifiant`, `Montant`, `Date`, `Etat`, `Nom`, `Prenom`) VALUES
(71, 42000, '2018-06-04 16:21:54', 1, 'diallo', 'babacar'),
(72, 10000, '2018-06-04 16:29:07', 1, 'dfgh', 'ghj'),
(73, 15000, '2018-06-04 16:34:34', 1, 'dfgh', 'dfgh'),
(74, 10000, '2018-06-21 15:56:09', 0, 'diop', 'ndiqye'),
(75, 10000, '2018-06-21 15:56:34', 0, 'diop', 'ndiqye'),
(76, 10000, '2018-06-21 15:57:33', 0, 'diop', 'ndiqye'),
(77, 237710, '2018-06-21 20:31:57', 1, 'rzetjh', 'dgfhj'),
(78, 237710, '2018-06-21 20:32:06', 1, 'rzetjh', 'dgfhj'),
(79, 3954015, '2018-06-21 20:33:33', 0, 'rhfgj', 'regthyjukl'),
(80, 21, '2018-06-21 20:34:26', 0, 'efrghtjk', 'dfgrhjkl:');

-- --------------------------------------------------------

--
-- Structure de la table `garnitures`
--

DROP TABLE IF EXISTS `garnitures`;
CREATE TABLE IF NOT EXISTS `garnitures` (
  `bonneref` int(11) NOT NULL,
  `coderef` int(11) NOT NULL,
  `Designation` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Quantite` int(11) NOT NULL,
  PRIMARY KEY (`bonneref`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `garnitures`
--

INSERT INTO `garnitures` (`bonneref`, `coderef`, `Designation`, `Quantite`) VALUES
(1919, 1945, 'garniture', 8);

-- --------------------------------------------------------

--
-- Structure de la table `partenaires`
--

DROP TABLE IF EXISTS `partenaires`;
CREATE TABLE IF NOT EXISTS `partenaires` (
  `Identifiant` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Ville` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Region` varchar(100) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`Identifiant`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `partenaires`
--

INSERT INTO `partenaires` (`Identifiant`, `Nom`, `Ville`, `Region`) VALUES
(9, 'sencode', 'dakar', 'dakar');

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `personne`;
CREATE TABLE IF NOT EXISTS `personne` (
  `Identifiant` int(11) NOT NULL AUTO_INCREMENT,
  `Date` date NOT NULL,
  PRIMARY KEY (`Identifiant`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `pieces`
--

DROP TABLE IF EXISTS `pieces`;
CREATE TABLE IF NOT EXISTS `pieces` (
  `bonneref` int(11) NOT NULL,
  `coderef` int(11) NOT NULL,
  `Designation` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Quantite` int(11) NOT NULL,
  PRIMARY KEY (`bonneref`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `pieces`
--

INSERT INTO `pieces` (`bonneref`, `coderef`, `Designation`, `Quantite`) VALUES
(90, 65, 'dre', 22);

-- --------------------------------------------------------

--
-- Structure de la table `solde`
--

DROP TABLE IF EXISTS `solde`;
CREATE TABLE IF NOT EXISTS `solde` (
  `Identifiant` int(11) NOT NULL AUTO_INCREMENT,
  `Montant` double NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`Identifiant`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `solde`
--

INSERT INTO `solde` (`Identifiant`, `Montant`, `Date`) VALUES
(5, 77000, '2018-06-04'),
(6, 475420, '2018-06-21'),
(7, 0, '2018-07-03');

-- --------------------------------------------------------

--
-- Structure de la table `utiljour`
--

DROP TABLE IF EXISTS `utiljour`;
CREATE TABLE IF NOT EXISTS `utiljour` (
  `Identifiant` int(11) NOT NULL AUTO_INCREMENT,
  `Login` varchar(50) NOT NULL,
  `Motdepasse` varchar(50) NOT NULL,
  `Date_Ent` datetime NOT NULL,
  `Date_Sorti` datetime NOT NULL,
  PRIMARY KEY (`Identifiant`)
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `utiljour`
--

INSERT INTO `utiljour` (`Identifiant`, `Login`, `Motdepasse`, `Date_Ent`, `Date_Sorti`) VALUES
(9, 'amad', 'amad', '2018-06-21 15:23:50', '2018-06-21 16:01:37'),
(10, 'sougou', '404065', '2018-06-21 15:54:04', '2018-06-21 16:09:58'),
(11, 'sougou', '404065', '2018-06-21 16:06:41', '2018-06-21 20:32:15'),
(12, 'amad', 'amad', '2018-06-21 20:30:45', '2018-06-21 20:36:21'),
(13, 'amad', 'amad', '2018-06-21 20:33:05', '2018-07-02 19:31:32'),
(14, 'amad', 'amad', '2018-07-02 19:31:21', '2018-07-02 22:05:58'),
(15, 'amad', 'amad', '2018-07-02 22:05:34', '2018-07-02 22:15:49'),
(16, 'amad', 'amad', '2018-07-02 22:07:13', '2018-07-03 14:23:49'),
(17, 'amad', 'amad', '2018-07-02 22:15:40', '2018-07-05 14:44:55'),
(18, 'amad', 'amad', '2018-07-03 13:45:46', '2018-05-08 14:55:00'),
(19, 'amad', 'amad', '2018-07-03 14:23:27', '2018-05-08 14:55:00'),
(20, 'amad', 'amad', '2018-07-04 11:11:46', '2018-05-08 14:55:00'),
(21, 'amad', 'amad', '2018-07-05 04:11:28', '2018-05-08 14:55:00'),
(22, 'amad', 'amad', '2018-07-05 09:43:37', '2018-05-08 14:55:00'),
(23, 'amad', 'amad', '2018-07-05 14:43:13', '2018-05-08 14:55:00'),
(24, 'amad', 'amad', '2018-07-05 14:45:02', '2018-05-08 14:55:00');

-- --------------------------------------------------------

--
-- Structure de la table `venteau`
--

DROP TABLE IF EXISTS `venteau`;
CREATE TABLE IF NOT EXISTS `venteau` (
  `Identifiant` int(11) NOT NULL AUTO_INCREMENT,
  `bonneref` int(11) NOT NULL,
  `coderef` int(11) NOT NULL,
  `Designation` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Prix_unitaire` double NOT NULL,
  `Quantite` int(11) NOT NULL,
  `Total` double NOT NULL,
  `IDr` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Etat` varchar(50) NOT NULL,
  PRIMARY KEY (`Identifiant`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `ventegar`
--

DROP TABLE IF EXISTS `ventegar`;
CREATE TABLE IF NOT EXISTS `ventegar` (
  `Identifiant` int(11) NOT NULL AUTO_INCREMENT,
  `bonneref` int(11) NOT NULL,
  `coderef` int(11) NOT NULL,
  `Designation` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Prix_unitaire` double NOT NULL,
  `Quantite` int(11) NOT NULL,
  `Total` double NOT NULL,
  `IDr` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Etat` varchar(50) NOT NULL,
  PRIMARY KEY (`Identifiant`)
) ENGINE=MyISAM AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ventegar`
--

INSERT INTO `ventegar` (`Identifiant`, `bonneref`, `coderef`, `Designation`, `Prix_unitaire`, `Quantite`, `Total`, `IDr`, `Date`, `Etat`) VALUES
(33, 1919, 1945, 'garniture', 5000, 3, 15000, 73, '2018-06-04', 'facture'),
(34, 1919, 1945, 'garniture', 8455, 4, 33820, 74, '2018-06-04', 'facture');

-- --------------------------------------------------------

--
-- Structure de la table `ventepieces`
--

DROP TABLE IF EXISTS `ventepieces`;
CREATE TABLE IF NOT EXISTS `ventepieces` (
  `Identifiant` int(11) NOT NULL AUTO_INCREMENT,
  `bonneref` int(11) NOT NULL,
  `coderef` int(11) NOT NULL,
  `Designation` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Prix_unitaire` double NOT NULL,
  `Quantite` int(11) NOT NULL,
  `Total` double NOT NULL,
  `IDr` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Etat` varchar(50) NOT NULL,
  PRIMARY KEY (`Identifiant`)
) ENGINE=MyISAM AUTO_INCREMENT=85 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ventepieces`
--

INSERT INTO `ventepieces` (`Identifiant`, `bonneref`, `coderef`, `Designation`, `Prix_unitaire`, `Quantite`, `Total`, `IDr`, `Date`, `Etat`) VALUES
(77, 100, 101, 'freudo', 5000, 2, 10000, 71, '2018-06-04', 'facture'),
(78, 500, 501, 'freudo', 8000, 4, 32000, 71, '2018-06-04', 'facture'),
(79, 500, 501, 'freudo', 5000, 2, 10000, 72, '2018-06-04', 'facture'),
(80, 100, 101, 'freudo', 10000, 1, 10000, 1444, '2018-06-04', 'pret'),
(81, 90, 65, 'dre', 10000, 1, 10000, 74, '2018-06-21', 'pret'),
(82, 90, 65, 'dre', 47542, 5, 237710, 77, '2018-06-21', 'facture'),
(83, 90, 65, 'dre', 87867, 45, 3954015, 79, '2018-06-21', 'pret'),
(84, 90, 65, 'dre', 3, 7, 21, 80, '2018-06-21', 'pret');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
