-- MySQL Script generated by MySQL Workbench
-- Wed Nov 22 02:03:02 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Acesso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Acesso` (
  `cpf` VARCHAR(11) NOT NULL,
  `qtdacesso` INT NULL,
  `matricula` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`matricula`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Intrutor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Intrutor` (
  `cpf` CHAR(11) NOT NULL,
  `nome` VARCHAR(45) NULL,
  `espec` VARCHAR(45) NULL,
  PRIMARY KEY (`cpf`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `Nome` VARCHAR(15) NOT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `matricula` VARCHAR(5) NULL,
  `idade` INT NULL,
  `Acesso_matricula` VARCHAR(5) NOT NULL,
  `Intrutor_cpf` CHAR(11) NOT NULL,
  PRIMARY KEY (`cpf`),
  INDEX `fk_Cliente_Acesso1_idx` (`Acesso_matricula` ASC) VISIBLE,
  INDEX `fk_Cliente_Intrutor1_idx` (`Intrutor_cpf` ASC) VISIBLE,
  CONSTRAINT `fk_Cliente_Acesso1`
    FOREIGN KEY (`Acesso_matricula`)
    REFERENCES `mydb`.`Acesso` (`matricula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cliente_Intrutor1`
    FOREIGN KEY (`Intrutor_cpf`)
    REFERENCES `mydb`.`Intrutor` (`cpf`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
