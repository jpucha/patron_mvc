-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `megamaxi_bdd` DEFAULT CHARACTER SET utf8 ;
USE `megamaxi_bdd` ;

-- -----------------------------------------------------
-- Table `mydb`.`Proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `megamaxi_bdd`.`Proveedor` (
  `idProveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `cantidadEntregaAlMes` DOUBLE NULL,
  PRIMARY KEY (`idProveedor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `megamaxi_bdd`.`Categoria` (
  `idCategoria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(256) NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `megamaxi_bdd`.`Producto` (
  `idProducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `cantidad` INT NULL,
  `precio` DOUBLE NULL,
  `total` DOUBLE NULL,
  `unidadesEnExistencia` INT NULL,
  `idProveedor` INT NULL,
  `idCategoria` INT NULL,
  `fechaCaducidad` INT NULL,
  `materialPlastico` CHAR(1) NULL,
  `materialMetal` CHAR(1) NULL,
  `importado` CHAR(1) NULL,
  `tipoCarne` VARCHAR(45) NULL,
  `pesoKg` DOUBLE NULL,
  `capacidadEnvaseMl` DOUBLE NULL,
  `esLacteo` CHAR(1) NULL,
  `fechaEntrega` DATE NULL,
  `precioComercializacion` DOUBLE NULL,
  PRIMARY KEY (`idProducto`),
  INDEX `idProveedorFk_idx` (`idProveedor` ASC) VISIBLE,
  INDEX `idCateroriaFk_idx` (`idCategoria` ASC) VISIBLE,
  CONSTRAINT `idProveedorFk`
    FOREIGN KEY (`idProveedor`)
    REFERENCES `megamaxi_bdd`.`Proveedor` (`idProveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idCateroriaFk`
    FOREIGN KEY (`idCategoria`)
    REFERENCES `megamaxi_bdd`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `megamaxi_bdd` ;