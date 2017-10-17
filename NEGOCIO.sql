--
-- Database: `omc`
--
CREATE DATABASE IF NOT EXISTS `omc`; 

-- --------------------------------------------------------

--
-- Table structure for table `NEGOCIO`
--

	CREATE TABLE `negocio` (
	  `CD_NGOCO` bigint(11) NOT NULL,
	  `TP_HISTO_NGOCO` varchar(2) NOT NULL,
	  `NM_CIA` varchar(100) NOT NULL,
	  `CD_RAMO` bigint(11) NOT NULL,	  
	  `CD_MDUPR` bigint(11) NOT NULL,
	  `DS_MDUPR` varchar(100) NOT NULL,
	  `DT_EMISSAO` date NOT NULL,
	  `DT_INICIO_VIGEN` date NOT NULL,
	  `DT_FIM_VIGEN` date NOT NULL,
	  `CD_SITUC_NGOCO` varchar(100) NOT NULL,
	  `CD_ESTPL` bigint(11) NOT NULL,
	  `DT_VIGEN_PROPOR` date NOT NULL,
	  `CD_GRP_PRDUT` bigint(11) NOT NULL,
	  `DS_GRP_PRDUT` varchar(100) NOT NULL,
	  `CD_PLACA` varchar(100) NOT NULL,
	  `CD_CHASSI` varchar(100) NOT NULL,
	  `NR_ITSEG` bigint(11) NOT NULL,
	  `CD_CORRETOR` bigint(11) NOT NULL,
	  `NM_CORRETOR` varchar(100) NOT NULL,
	  `CD_SUCURSAL` bigint(11) NOT NULL,
	  `NM_SUCURSAL` varchar(100) NOT NULL,
	  `ST_NEGOCIO` varchar(100) NOT NULL,
	  `CD_ENDOSSO` bigint(11) NOT NULL,
	  `CD_CLIEN` bigint(11) NOT NULL
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `NEGOCIO`
--
ALTER TABLE `NEGOCIO`  ADD PRIMARY KEY (`CD_NGOCO`, TP_HISTO_NGOCO);


-- ALTER TABLE `NEGOCIO`  MODIFY `CD_NGOCO` bigint(11) NOT NULL AUTO_INCREMENT;


	INSERT INTO `negocio`
	(`CD_NGOCO`, TP_HISTO_NGOCO, `NM_CIA`, `CD_RAMO`, `CD_MDUPR`, `DS_MDUPR`, `DT_EMISSAO`, `DT_INICIO_VIGEN`, `DT_FIM_VIGEN`, `CD_SITUC_NGOCO`, `CD_ESTPL`, `DT_VIGEN_PROPOR`, `CD_GRP_PRDUT`, `DS_GRP_PRDUT`, `CD_PLACA`, `CD_CHASSI`, `NR_ITSEG`, `CD_CORRETOR`, `NM_CORRETOR`, `CD_SUCURSAL`, `NM_SUCURSAL`, `ST_NEGOCIO`, `CD_ENDOSSO`, `CD_CLIEN`) 
	VALUES 
	(1, '0','CIA',1,1,'Auto',now(),now(),now(),1,1,now(),1,'desc grupo protudo','xxx5544','x1x1x1x1x1x1x1x1',1,1,'teste',1,'teste','A',1,1)


select * from negocio;