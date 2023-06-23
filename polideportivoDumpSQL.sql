-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema polideportivo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema polideportivo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `polideportivo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `polideportivo` ;

-- -----------------------------------------------------
-- Table `polideportivo`.`estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `polideportivo`.`estado` (
  `id` INT NOT NULL,
  `tipo` VARCHAR(20) NOT NULL,
  INDEX `idx_estado_id` (`id` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `polideportivo`.`tipoevento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `polideportivo`.`tipoevento` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  INDEX `idx_tipoevento_id` (`id` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `polideportivo`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `polideportivo`.`user` (
  `idusers` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `apellido` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `dni` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idusers`),
  UNIQUE INDEX `dni_UNIQUE` (`dni` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 10
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `polideportivo`.`evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `polideportivo`.`evento` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  `descripcion` VARCHAR(500) NOT NULL,
  `fechaInicio` DATE NULL DEFAULT NULL,
  `fechaFin` DATE NULL DEFAULT NULL,
  `finesLucro` TINYINT(1) NOT NULL,
  `tipo` INT NOT NULL,
  `estado` INT NOT NULL,
  `userId` INT NOT NULL,
  INDEX `tipoevento_idx` (`tipo` ASC) VISIBLE,
  INDEX `estadofk_idx` (`estado` ASC) VISIBLE,
  INDEX `fk_user` (`userId` ASC) VISIBLE,
  CONSTRAINT `estadofk`
    FOREIGN KEY (`estado`)
    REFERENCES `polideportivo`.`estado` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_estado`
    FOREIGN KEY (`estado`)
    REFERENCES `polideportivo`.`estado` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tipo`
    FOREIGN KEY (`tipo`)
    REFERENCES `polideportivo`.`tipoevento` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_user`
    FOREIGN KEY (`userId`)
    REFERENCES `polideportivo`.`user` (`idusers`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
