-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Medico` (
  `crm` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `especialidade` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`crm`));


-- -----------------------------------------------------
-- Table `mydb`.`Paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Paciente` (
  `cpf` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  `idade` INT NOT NULL,
  `Medico_cpf` INT NOT NULL,
  PRIMARY KEY (`cpf`),
  CONSTRAINT `fk_Paciente_Medico`
    FOREIGN KEY (`Medico_cpf`)
    REFERENCES `mydb`.`Medico` (`crm`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `mydb`.`Tratamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tratamento` (
  `idTratamento` INT NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `data` DATE NOT NULL,
  `preco` FLOAT NOT NULL,
  `Paciente_cpf` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idTratamento`),
  CONSTRAINT `fk_Tratamento_Paciente1`
    FOREIGN KEY (`Paciente_cpf`)
    REFERENCES `mydb`.`Paciente` (`cpf`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `mydb`.`Pagamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Pagamento` (
  `idPagamento` INT NOT NULL,
  `parcelas` INT NOT NULL,
  `forma` VARCHAR(45) NOT NULL,
  `data` DATE NOT NULL,
  `pago` TINYINT NOT NULL,
  `Tratamento_idTratamento` INT NOT NULL,
  PRIMARY KEY (`idPagamento`, `Tratamento_idTratamento`),
  CONSTRAINT `fk_Pagamento_Tratamento1`
    FOREIGN KEY (`Tratamento_idTratamento`)
    REFERENCES `mydb`.`Tratamento` (`idTratamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `mydb`.`Medico_has_Tratamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Medico_has_Tratamento` (
  `Medico_crm` INT NOT NULL,
  `Tratamento_idTratamento` INT NOT NULL,
  PRIMARY KEY (`Medico_crm`, `Tratamento_idTratamento`),
  CONSTRAINT `fk_Medico_has_Tratamento_Medico1`
    FOREIGN KEY (`Medico_crm`)
    REFERENCES `mydb`.`Medico` (`crm`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Medico_has_Tratamento_Tratamento1`
    FOREIGN KEY (`Tratamento_idTratamento`)
    REFERENCES `mydb`.`Tratamento` (`idTratamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
