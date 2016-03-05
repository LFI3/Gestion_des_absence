-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mer 11 Novembre 2015 à 20:00
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `reservationsalle`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE IF NOT EXISTS `administrateur` (
  `login` varchar(40) COLLATE utf8_bin NOT NULL,
  `password` varchar(40) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`login`,`password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `administrateur`
--

INSERT INTO `administrateur` (`login`, `password`) VALUES
(' ', '1'),
('BB', 'BB'),
('hachem', '1234');

-- --------------------------------------------------------

--
-- Structure de la table `affectation`
--

CREATE TABLE IF NOT EXISTS `affectation` (
  `numEnseignant` varchar(8) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `numFormation` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`numEnseignant`,`numFormation`),
  KEY `f200_idx` (`numFormation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `affectation`
--

INSERT INTO `affectation` (`numEnseignant`, `numFormation`) VALUES
('09510910', 1),
('09510912', 1),
('09510910', 2),
('09510912', 2),
('09510922', 3),
('09510933', 4),
('09510944', 5);

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

CREATE TABLE IF NOT EXISTS `classe` (
  `numClasse` int(11) NOT NULL AUTO_INCREMENT,
  `nomClasse` varchar(45) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`numClasse`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=7 ;

--
-- Contenu de la table `classe`
--

INSERT INTO `classe` (`numClasse`, `nomClasse`) VALUES
(1, 'lfi1'),
(2, 'lfi2');

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

CREATE TABLE IF NOT EXISTS `enseignant` (
  `cin` varchar(8) COLLATE utf8_bin NOT NULL,
  `nom` varchar(45) COLLATE utf8_bin NOT NULL,
  `prenom` varchar(45) COLLATE utf8_bin NOT NULL,
  `adresse` varchar(45) COLLATE utf8_bin NOT NULL,
  `diplome` varchar(45) COLLATE utf8_bin NOT NULL,
  `responsable` varchar(45) COLLATE utf8_bin NOT NULL DEFAULT 'non',
  `login` varchar(45) COLLATE utf8_bin NOT NULL,
  `password` varchar(45) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`cin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `enseignant`
--

INSERT INTO `enseignant` (`cin`, `nom`, `prenom`, `adresse`, `diplome`, `responsable`, `login`, `password`) VALUES
('09510910', 'ben yahya', 'sadek', 'tunis', 'informatique', 'oui', 'sadek', '0000'),
('09510912', 'rokbeni', 'hmida', 'mahdia', 'informatique', 'non', 'hmida', '1111'),
('09510922', 'moussa', 'fawzi', 'tunis', 'IA', 'non', 'fawzi', '2222'),
('09510933', 'hammouda', 'atef', 'tunis', ' C', 'non', 'atef', '3333'),
('09510944', 'mrabet', 'laila', 'tunis', 'anglais', 'oui', 'laila', '4444'),
('09510955', 'chargui', 'latifa', 'tunis', 'Francais', 'oui', 'latifa', '5555'),
('09510966', 'guesmi', 'afif', 'borj el amri', 'Math', 'non', 'afif', '6666');

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE IF NOT EXISTS `etudiant` (
  `numEtudiant` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) COLLATE utf8_bin NOT NULL,
  `prenom` varchar(45) COLLATE utf8_bin NOT NULL,
  `adresse` varchar(45) COLLATE utf8_bin NOT NULL,
  `numClasse` int(11) DEFAULT NULL,
  `login` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`numEtudiant`),
  UNIQUE KEY `numEtudiant` (`numEtudiant`),
  KEY `numClasse` (`numClasse`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=26 ;

--
-- Contenu de la table `etudiant`
--

INSERT INTO `etudiant` (`numEtudiant`, `nom`, `prenom`, `adresse`, `numClasse`, `login`, `password`) VALUES
(2, 'guesmi', 'hachem', 'borj el amri', 1, 'hachem', '1234'),
(21, 'sdfds', 'sdfs', 'sdf', 1, 'derbeli', '1234'),
(22, 'AA', 'AA', 'AA', 1, 'BB', 'BB'),
(23, 'nejib', 'hammemi', 'mahdia', 2, 'nejib', '789'),
(24, 'ezf', 'eqg', 'qsg', 2, 'aa', 'aa'),
(25, 'fghdf', 'dg', 'gggggggggg', 1, '123', '147');

-- --------------------------------------------------------

--
-- Structure de la table `formation`
--

CREATE TABLE IF NOT EXISTS `formation` (
  `numFormation` int(11) NOT NULL,
  `nomFormation` varchar(45) COLLATE utf8_bin NOT NULL,
  `numResponsable` varchar(8) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`numFormation`),
  KEY `f1_idx` (`numResponsable`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `formation`
--

INSERT INTO `formation` (`numFormation`, `nomFormation`, `numResponsable`) VALUES
(1, 'java', '09510910'),
(2, 'php', '09510912'),
(3, 'anglais', '09510944'),
(4, 'francais', '09510955'),
(5, 'xml', '09510910'),
(6, 'analyse', '09510966');

-- --------------------------------------------------------

--
-- Structure de la table `ordinateur`
--

CREATE TABLE IF NOT EXISTS `ordinateur` (
  `numOrdinateur` int(11) NOT NULL,
  `marque` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `modele` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`numOrdinateur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `ordinateur`
--

INSERT INTO `ordinateur` (`numOrdinateur`, `marque`, `modele`) VALUES
(1, 'Dell', 'inspiron5550'),
(2, 'lenovo', 'g50'),
(3, 'hp', '5070');

-- --------------------------------------------------------

--
-- Structure de la table `planing`
--

CREATE TABLE IF NOT EXISTS `planing` (
  `numPlaning` int(4) NOT NULL AUTO_INCREMENT,
  `numEnseignant` varchar(8) COLLATE utf8_bin DEFAULT NULL,
  `numClasse` int(11) DEFAULT NULL,
  `numSalle` int(11) DEFAULT NULL,
  `numFormation` int(11) DEFAULT NULL,
  `date` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `heure` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `numOrdinateur` int(11) DEFAULT NULL,
  `numProjecteur` int(11) DEFAULT NULL,
  PRIMARY KEY (`numPlaning`),
  KEY `f1_idx` (`numEnseignant`),
  KEY `f11_idx` (`numClasse`),
  KEY `f12_idx` (`numFormation`),
  KEY `f13_idx` (`numSalle`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=78 ;

--
-- Contenu de la table `planing`
--

INSERT INTO `planing` (`numPlaning`, `numEnseignant`, `numClasse`, `numSalle`, `numFormation`, `date`, `heure`, `numOrdinateur`, `numProjecteur`) VALUES
(66, '09510912', 1, 1, 1, 'lundi', '08:00--10:00', 0, 0),
(67, '09510912', 1, 2, 1, 'mardi', '08:00--10:00', 0, 0),
(68, '09510912', 1, 1, 2, 'mercredi', '08:00--10:00', 0, 0),
(69, '09510912', 1, 5, 1, 'jeudi', '08:00--10:00', 0, 0),
(70, '09510912', 1, 1, 2, 'vendredi', '08:00--10:00', 2, 0),
(71, '09510910', 1, 1, 1, 'jeudi', '10:00--12:00', 0, 0),
(72, '09510910', 1, 1, 1, 'vendredi', '10:00--12:00', 2, 1),
(73, '09510922', 1, 1, 3, 'lundi', '10:00--12:00', 0, 0),
(74, '09510922', 1, 1, 3, 'mardi', '10:00--12:00', 0, 0),
(75, '09510933', 1, 1, 4, 'lundi', '14:00--16:00', 0, 0),
(76, '09510933', 1, 1, 4, 'samedi', '16:00--18:00', 0, 0),
(77, '09510933', 1, 1, 4, 'mardi', '14:00--16:00', 0, 0);

-- --------------------------------------------------------

--
-- Structure de la table `projecteur`
--

CREATE TABLE IF NOT EXISTS `projecteur` (
  `numProjecteur` int(11) NOT NULL,
  `marque` varchar(45) COLLATE utf8_bin NOT NULL,
  `modele` varchar(45) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`numProjecteur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `projecteur`
--

INSERT INTO `projecteur` (`numProjecteur`, `marque`, `modele`) VALUES
(1, 'ma1', 'mo1'),
(2, 'ma1', 'mo2'),
(3, 'ma2', 'mo11');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
  `numReservation` int(11) NOT NULL AUTO_INCREMENT,
  `numEnseignant` varchar(8) COLLATE utf8_bin DEFAULT NULL,
  `numSalle` int(11) DEFAULT NULL,
  `numPortable` int(11) DEFAULT NULL,
  `numProjecteur` int(11) DEFAULT NULL,
  `numClasse` int(11) DEFAULT NULL,
  `numFormation` int(11) DEFAULT NULL,
  `date` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `heure` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`numReservation`),
  KEY `f1_idx` (`numEnseignant`),
  KEY `f2_idx` (`numSalle`),
  KEY `f3_idx` (`numPortable`),
  KEY `f5_idx` (`numClasse`),
  KEY `f4_idx` (`numProjecteur`),
  KEY `f7_idx` (`numFormation`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=38 ;

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

CREATE TABLE IF NOT EXISTS `salle` (
  `numSalle` int(11) NOT NULL AUTO_INCREMENT,
  `capacite` int(11) NOT NULL,
  PRIMARY KEY (`numSalle`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=6 ;

--
-- Contenu de la table `salle`
--

INSERT INTO `salle` (`numSalle`, `capacite`) VALUES
(1, 23),
(2, 20),
(3, 50),
(4, 50),
(5, 200);

-- --------------------------------------------------------

--
-- Structure de la table `theme`
--

CREATE TABLE IF NOT EXISTS `theme` (
  `nomTheme` varchar(45) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`nomTheme`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `theme`
--

INSERT INTO `theme` (`nomTheme`) VALUES
('theme44');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `affectation`
--
ALTER TABLE `affectation`
  ADD CONSTRAINT `f200` FOREIGN KEY (`numFormation`) REFERENCES `formation` (`numFormation`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `f201` FOREIGN KEY (`numEnseignant`) REFERENCES `enseignant` (`cin`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD CONSTRAINT `1` FOREIGN KEY (`numClasse`) REFERENCES `classe` (`numClasse`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `formation`
--
ALTER TABLE `formation`
  ADD CONSTRAINT `f33` FOREIGN KEY (`numResponsable`) REFERENCES `enseignant` (`cin`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `planing`
--
ALTER TABLE `planing`
  ADD CONSTRAINT `f11` FOREIGN KEY (`numClasse`) REFERENCES `classe` (`numClasse`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `f12` FOREIGN KEY (`numFormation`) REFERENCES `formation` (`numFormation`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `f13` FOREIGN KEY (`numSalle`) REFERENCES `salle` (`numSalle`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `f14` FOREIGN KEY (`numEnseignant`) REFERENCES `enseignant` (`cin`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `f1` FOREIGN KEY (`numEnseignant`) REFERENCES `enseignant` (`cin`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `f2` FOREIGN KEY (`numSalle`) REFERENCES `salle` (`numSalle`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `f6` FOREIGN KEY (`numClasse`) REFERENCES `classe` (`numClasse`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `f7` FOREIGN KEY (`numFormation`) REFERENCES `formation` (`numFormation`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
