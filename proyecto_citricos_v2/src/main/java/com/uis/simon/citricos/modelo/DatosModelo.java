package com.uis.simon.citricos.modelo;

public class DatosModelo {
	int fechaFinal;
	int largo;
	int ancho;
	int TipoSuel;
	double tempMax;
	double tempMin;
	double cantNit;
	double cantPot;
	double cantFos;
	int frecRieEne;
	int cantRieEne;
	int frecRieFeb;
	int cantRieFeb;
	int frecRieMar;
	int cantRieMar;
	int frecRieAbr;
	int cantRieAbr;
	int frecRieMay;
	int cantRieMay;
	int frecRieJun;
	int cantRieJun;
	int frecRieJul;
	int cantRieJul;
	int frecRieAgo;
	int cantRieAgo;
	int frecRieSep;
	int cantRieSep;
	int frecRieOct;
	int cantRieOct;
	int frecRieNov;
	int cantRieNov;
	int frecRieDic;
	int cantRieDic;
	
	int freclluvEne;
	int canDiasMesEne;
	int freclluvFeb;
	int canDiasMesFeb;
	int freclluvMar;
	int canDiasMesMar;
	int freclluvAbr;
	int canDiasMesAbr;
	int freclluvMay;
	int canDiasMesMay;
	int freclluvJun;
	int canDiasMesJun;
	int freclluvJul;
	int canDiasMesJul;
	int freclluvAgo;
	int canDiasMesAgo;
	int freclluvSep;
	int canDiasMesSep;
	int freclluvOct;
	int canDiasMesOct;
	int freclluvNov;
	int canDiasMesNov;
	int freclluvDic;
	int canDiasMesDic;
	

	public DatosModelo() {
		super();
	}

	

	public DatosModelo(int fechaFinal,int largo, int ancho, int tipoSuel, double tempMax, double tempMin, double cantNit,
			double cantPot, double cantFos, int frecRieEne, int cantRieEne, int frecRieFeb, int cantRieFeb,
			int frecRieMar, int cantRieMar, int frecRieAbr, int cantRieAbr, int frecRieMay, int cantRieMay,
			int frecRieJun, int cantRieJun, int frecRieJul, int cantRieJul, int frecRieAgo, int cantRieAgo,
			int frecRieSep, int cantRieSep, int frecRieOct, int cantRieOct, int frecRieNov, int cantRieNov,
			int frecRieDic, int cantRieDic, int freclluvEne, int canDiasMesEne, int freclluvFeb, int canDiasMesFeb,
			int freclluvMar, int canDiasMesMar, int freclluvAbr, int canDiasMesAbr, int freclluvMay, int canDiasMesMay,
			int freclluvJun, int canDiasMesJun, int freclluvJul, int canDiasMesJul, int freclluvAgo, int canDiasMesAgo,
			int freclluvSep, int canDiasMesSep, int freclluvOct, int canDiasMesOct, int freclluvNov, int canDiasMesNov,
			int freclluvDic, int canDiasMesDic) {
		super();
		this.fechaFinal = fechaFinal;
		this.largo = largo;
		this.ancho = ancho;
		TipoSuel = tipoSuel;
		this.tempMax = tempMax;
		this.tempMin = tempMin;
		this.cantNit = cantNit;
		this.cantPot = cantPot;
		this.cantFos = cantFos;
		this.frecRieEne = frecRieEne;
		this.cantRieEne = cantRieEne;
		this.frecRieFeb = frecRieFeb;
		this.cantRieFeb = cantRieFeb;
		this.frecRieMar = frecRieMar;
		this.cantRieMar = cantRieMar;
		this.frecRieAbr = frecRieAbr;
		this.cantRieAbr = cantRieAbr;
		this.frecRieMay = frecRieMay;
		this.cantRieMay = cantRieMay;
		this.frecRieJun = frecRieJun;
		this.cantRieJun = cantRieJun;
		this.frecRieJul = frecRieJul;
		this.cantRieJul = cantRieJul;
		this.frecRieAgo = frecRieAgo;
		this.cantRieAgo = cantRieAgo;
		this.frecRieSep = frecRieSep;
		this.cantRieSep = cantRieSep;
		this.frecRieOct = frecRieOct;
		this.cantRieOct = cantRieOct;
		this.frecRieNov = frecRieNov;
		this.cantRieNov = cantRieNov;
		this.frecRieDic = frecRieDic;
		this.cantRieDic = cantRieDic;
		this.freclluvEne = freclluvEne;
		this.canDiasMesEne = canDiasMesEne;
		this.freclluvFeb = freclluvFeb;
		this.canDiasMesFeb = canDiasMesFeb;
		this.freclluvMar = freclluvMar;
		this.canDiasMesMar = canDiasMesMar;
		this.freclluvAbr = freclluvAbr;
		this.canDiasMesAbr = canDiasMesAbr;
		this.freclluvMay = freclluvMay;
		this.canDiasMesMay = canDiasMesMay;
		this.freclluvJun = freclluvJun;
		this.canDiasMesJun = canDiasMesJun;
		this.freclluvJul = freclluvJul;
		this.canDiasMesJul = canDiasMesJul;
		this.freclluvAgo = freclluvAgo;
		this.canDiasMesAgo = canDiasMesAgo;
		this.freclluvSep = freclluvSep;
		this.canDiasMesSep = canDiasMesSep;
		this.freclluvOct = freclluvOct;
		this.canDiasMesOct = canDiasMesOct;
		this.freclluvNov = freclluvNov;
		this.canDiasMesNov = canDiasMesNov;
		this.freclluvDic = freclluvDic;
		this.canDiasMesDic = canDiasMesDic;
	}

	public int getFechaFinal(){
		return fechaFinal;
	}

	public void setFechaFinal(int fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public int getLargo() {
		return largo;
	}


	public void setLargo(int largo) {
		this.largo = largo;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getTipoSuel() {
		return TipoSuel;
	}


	public void setTipoSuel(int tipoSuel) {
		TipoSuel = tipoSuel;
	}


	public double getTempMax() {
		return tempMax;
	}


	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}


	public double getTempMin() {
		return tempMin;
	}


	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}


	public double getCantNit() {
		return cantNit;
	}


	public void setCantNit(double cantNit) {
		this.cantNit = cantNit;
	}


	public double getCantPot() {
		return cantPot;
	}


	public void setCantPot(double cantPot) {
		this.cantPot = cantPot;
	}


	public double getCantFos() {
		return cantFos;
	}


	public void setCantFos(double cantFos) {
		this.cantFos = cantFos;
	}


	public int getFrecRieEne() {
		return frecRieEne;
	}


	public void setFrecRieEne(int frecRieEne) {
		this.frecRieEne = frecRieEne;
	}


	public int getCantRieEne() {
		return cantRieEne;
	}


	public void setCantRieEne(int cantRieEne) {
		this.cantRieEne = cantRieEne;
	}


	public int getFrecRieFeb() {
		return frecRieFeb;
	}


	public void setFrecRieFeb(int frecRieFeb) {
		this.frecRieFeb = frecRieFeb;
	}


	public int getCantRieFeb() {
		return cantRieFeb;
	}


	public void setCantRieFeb(int cantRieFeb) {
		this.cantRieFeb = cantRieFeb;
	}


	public int getFrecRieMar() {
		return frecRieMar;
	}


	public void setFrecRieMar(int frecRieMar) {
		this.frecRieMar = frecRieMar;
	}


	public int getCantRieMar() {
		return cantRieMar;
	}


	public void setCantRieMar(int cantRieMar) {
		this.cantRieMar = cantRieMar;
	}


	public int getFrecRieAbr() {
		return frecRieAbr;
	}


	public void setFrecRieAbr(int frecRieAbr) {
		this.frecRieAbr = frecRieAbr;
	}


	public int getCantRieAbr() {
		return cantRieAbr;
	}


	public void setCantRieAbr(int cantRieAbr) {
		this.cantRieAbr = cantRieAbr;
	}


	public int getFrecRieMay() {
		return frecRieMay;
	}


	public void setFrecRieMay(int frecRieMay) {
		this.frecRieMay = frecRieMay;
	}


	public int getCantRieMay() {
		return cantRieMay;
	}


	public void setCantRieMay(int cantRieMay) {
		this.cantRieMay = cantRieMay;
	}


	public int getFrecRieJun() {
		return frecRieJun;
	}


	public void setFrecRieJun(int frecRieJun) {
		this.frecRieJun = frecRieJun;
	}


	public int getCantRieJun() {
		return cantRieJun;
	}


	public void setCantRieJun(int cantRieJun) {
		this.cantRieJun = cantRieJun;
	}


	public int getFrecRieJul() {
		return frecRieJul;
	}


	public void setFrecRieJul(int frecRieJul) {
		this.frecRieJul = frecRieJul;
	}


	public int getCantRieJul() {
		return cantRieJul;
	}


	public void setCantRieJul(int cantRieJul) {
		this.cantRieJul = cantRieJul;
	}


	public int getFrecRieAgo() {
		return frecRieAgo;
	}


	public void setFrecRieAgo(int frecRieAgo) {
		this.frecRieAgo = frecRieAgo;
	}


	public int getCantRieAgo() {
		return cantRieAgo;
	}


	public void setCantRieAgo(int cantRieAgo) {
		this.cantRieAgo = cantRieAgo;
	}


	public int getFrecRieSep() {
		return frecRieSep;
	}


	public void setFrecRieSep(int frecRieSep) {
		this.frecRieSep = frecRieSep;
	}


	public int getCantRieSep() {
		return cantRieSep;
	}


	public void setCantRieSep(int cantRieSep) {
		this.cantRieSep = cantRieSep;
	}


	public int getFrecRieOct() {
		return frecRieOct;
	}


	public void setFrecRieOct(int frecRieOct) {
		this.frecRieOct = frecRieOct;
	}


	public int getCantRieOct() {
		return cantRieOct;
	}


	public void setCantRieOct(int cantRieOct) {
		this.cantRieOct = cantRieOct;
	}


	public int getFrecRieNov() {
		return frecRieNov;
	}


	public void setFrecRieNov(int frecRieNov) {
		this.frecRieNov = frecRieNov;
	}


	public int getCantRieNov() {
		return cantRieNov;
	}


	public void setCantRieNov(int cantRieNov) {
		this.cantRieNov = cantRieNov;
	}


	public int getFrecRieDic() {
		return frecRieDic;
	}


	public void setFrecRieDic(int frecRieDic) {
		this.frecRieDic = frecRieDic;
	}


	public int getCantRieDic() {
		return cantRieDic;
	}


	public void setCantRieDic(int cantRieDic) {
		this.cantRieDic = cantRieDic;
	}


	public int getFreclluvEne() {
		return freclluvEne;
	}


	public void setFreclluvEne(int freclluvEne) {
		this.freclluvEne = freclluvEne;
	}


	public int getCanDiasMesEne() {
		return canDiasMesEne;
	}


	public void setCanDiasMesEne(int canDiasMesEne) {
		this.canDiasMesEne = canDiasMesEne;
	}


	public int getFreclluvFeb() {
		return freclluvFeb;
	}


	public void setFreclluvFeb(int freclluvFeb) {
		this.freclluvFeb = freclluvFeb;
	}


	public int getCanDiasMesFeb() {
		return canDiasMesFeb;
	}


	public void setCanDiasMesFeb(int canDiasMesFeb) {
		this.canDiasMesFeb = canDiasMesFeb;
	}


	public int getFreclluvMar() {
		return freclluvMar;
	}


	public void setFreclluvMar(int freclluvMar) {
		this.freclluvMar = freclluvMar;
	}


	public int getCanDiasMesMar() {
		return canDiasMesMar;
	}


	public void setCanDiasMesMar(int canDiasMesMar) {
		this.canDiasMesMar = canDiasMesMar;
	}


	public int getFreclluvAbr() {
		return freclluvAbr;
	}


	public void setFreclluvAbr(int freclluvAbr) {
		this.freclluvAbr = freclluvAbr;
	}


	public int getCanDiasMesAbr() {
		return canDiasMesAbr;
	}


	public void setCanDiasMesAbr(int canDiasMesAbr) {
		this.canDiasMesAbr = canDiasMesAbr;
	}


	public int getFreclluvMay() {
		return freclluvMay;
	}


	public void setFreclluvMay(int freclluvMay) {
		this.freclluvMay = freclluvMay;
	}


	public int getCanDiasMesMay() {
		return canDiasMesMay;
	}


	public void setCanDiasMesMay(int canDiasMesMay) {
		this.canDiasMesMay = canDiasMesMay;
	}


	public int getFreclluvJun() {
		return freclluvJun;
	}


	public void setFreclluvJun(int freclluvJun) {
		this.freclluvJun = freclluvJun;
	}


	public int getCanDiasMesJun() {
		return canDiasMesJun;
	}


	public void setCanDiasMesJun(int canDiasMesJun) {
		this.canDiasMesJun = canDiasMesJun;
	}


	public int getFreclluvJul() {
		return freclluvJul;
	}


	public void setFreclluvJul(int freclluvJul) {
		this.freclluvJul = freclluvJul;
	}


	public int getCanDiasMesJul() {
		return canDiasMesJul;
	}


	public void setCanDiasMesJul(int canDiasMesJul) {
		this.canDiasMesJul = canDiasMesJul;
	}


	public int getFreclluvAgo() {
		return freclluvAgo;
	}


	public void setFreclluvAgo(int freclluvAgo) {
		this.freclluvAgo = freclluvAgo;
	}


	public int getCanDiasMesAgo() {
		return canDiasMesAgo;
	}


	public void setCanDiasMesAgo(int canDiasMesAgo) {
		this.canDiasMesAgo = canDiasMesAgo;
	}


	public int getFreclluvSep() {
		return freclluvSep;
	}


	public void setFreclluvSep(int freclluvSep) {
		this.freclluvSep = freclluvSep;
	}


	public int getCanDiasMesSep() {
		return canDiasMesSep;
	}


	public void setCanDiasMesSep(int canDiasMesSep) {
		this.canDiasMesSep = canDiasMesSep;
	}


	public int getFreclluvOct() {
		return freclluvOct;
	}


	public void setFreclluvOct(int freclluvOct) {
		this.freclluvOct = freclluvOct;
	}


	public int getCanDiasMesOct() {
		return canDiasMesOct;
	}


	public void setCanDiasMesOct(int canDiasMesOct) {
		this.canDiasMesOct = canDiasMesOct;
	}


	public int getFreclluvNov() {
		return freclluvNov;
	}


	public void setFreclluvNov(int freclluvNov) {
		this.freclluvNov = freclluvNov;
	}


	public int getCanDiasMesNov() {
		return canDiasMesNov;
	}


	public void setCanDiasMesNov(int canDiasMesNov) {
		this.canDiasMesNov = canDiasMesNov;
	}


	public int getFreclluvDic() {
		return freclluvDic;
	}


	public void setFreclluvDic(int freclluvDic) {
		this.freclluvDic = freclluvDic;
	}


	public int getCanDiasMesDic() {
		return canDiasMesDic;
	}


	public void setCanDiasMesDic(int canDiasMesDic) {
		this.canDiasMesDic = canDiasMesDic;
	}


	


}
