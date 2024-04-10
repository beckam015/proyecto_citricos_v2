package com.uis.simon.citricos.modelo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.uis.simon.citricos.rest.ReglasRest;

@Service
public class Modelo {
	List<Double> listMaxFloracion = new ArrayList<>();
	List<Double> listBrotesPosPerd = new ArrayList<>();
	List<Double> listBrotes = new ArrayList<>();
	List<Double> listFrutosPosPerd = new ArrayList<>();
	List<Double> listFrutos = new ArrayList<>();
	List<Double> listYear = new ArrayList<>();
	List<Double> listNitrogeno = new ArrayList<>();
	List<Double> listPotasio = new ArrayList<>();
	List<Double> listFosforo = new ArrayList<>();
	List<Double> listFronteraAirTierr = new ArrayList<>();
	List<Double> listHorizontedeSuelo = new ArrayList<>();

	public Modelo() {
		super();
	}

	public Modelo(List<Double> listMaxFloracion, List<Double> listBrotesPosPerd, List<Double> listBrotes,
			List<Double> listFrutosPosPerd, List<Double> listFrutos, List<Double> listYear, List<Double> listNitrogeno,
			List<Double> listPotasio, List<Double> listFosforo, List<Double> listFronteraAirTierr,
			List<Double> listHorizontedeSuelo) {
		super();
		this.listMaxFloracion = listMaxFloracion;
		this.listBrotesPosPerd = listBrotesPosPerd;
		this.listBrotes = listBrotes;
		this.listFrutosPosPerd = listFrutosPosPerd;
		this.listFrutos = listFrutos;
		this.listYear = listYear;
		this.listNitrogeno = listNitrogeno;
		this.listPotasio = listPotasio;
		this.listFosforo = listFosforo;
		this.listFronteraAirTierr = listFronteraAirTierr;
		this.listHorizontedeSuelo = listHorizontedeSuelo;
	}

	public List<Double> getListMaxFloracion() {
		return listMaxFloracion;
	}

	public void setListMaxFloracion(List<Double> listMaxFloracion) {
		this.listMaxFloracion = listMaxFloracion;
	}

	public List<Double> getListBrotesPosPerd() {
		return listBrotesPosPerd;
	}

	public void setListBrotesPosPerd(List<Double> listBrotesPosPerd) {
		this.listBrotesPosPerd = listBrotesPosPerd;
	}

	public List<Double> getListBrotes() {
		return listBrotes;
	}

	public void setListBrotes(List<Double> listBrotes) {
		this.listBrotes = listBrotes;
	}

	public List<Double> getListFrutosPosPerd() {
		return listFrutosPosPerd;
	}

	public void setListFrutosPosPerd(List<Double> listFrutosPosPerd) {
		this.listFrutosPosPerd = listFrutosPosPerd;
	}

	public List<Double> getListFrutos() {
		return listFrutos;
	}

	public void setListFrutos(List<Double> listFrutos) {
		this.listFrutos = listFrutos;
	}

	public List<Double> getListYear() {
		return listYear;
	}

	public void setListYear(List<Double> listYear) {
		this.listYear = listYear;
	}

	public List<Double> getListNitrogeno() {
		return listNitrogeno;
	}

	public void setListNitrogeno(List<Double> listNitrogeno) {
		this.listNitrogeno = listNitrogeno;
	}

	public List<Double> getListPotasio() {
		return listPotasio;
	}

	public void setListPotasio(List<Double> listPotasio) {
		this.listPotasio = listPotasio;
	}

	public List<Double> getListFosforo() {
		return listFosforo;
	}

	public void setListFosforo(List<Double> listFosforo) {
		this.listFosforo = listFosforo;
	}

	public List<Double> getListFronteraAirTierr() {
		return listFronteraAirTierr;
	}

	public void setListFronteraAirTierr(List<Double> listFronteraAirTierr) {
		this.listFronteraAirTierr = listFronteraAirTierr;
	}

	public List<Double> getListHorizontedeSuelo() {
		return listHorizontedeSuelo;
	}

	public void setListHorizontedeSuelo(List<Double> listHorizontedeSuelo) {
		this.listHorizontedeSuelo = listHorizontedeSuelo;
	}

	ReglasRest reglasrest = new ReglasRest();

	public void Simulacion(int fechaFinal,int largo, int ancho, double tempMax, double tempMin, double cantNit, double cantPot,
			double cantFos, int TipoSuel, int frecRieEne, int cantRieEne, int frecRieFeb, int cantRieFeb,
			int frecRieMar, int cantRieMar, int frecRieAbr, int cantRieAbr, int frecRieMay, int cantRieMay,
			int frecRieJun, int cantRieJun, int frecRieJul, int cantRieJul, int frecRieAgo, int cantRieAgo,
			int frecRieSep, int cantRieSep, int frecRieOct, int cantRieOct, int frecRieNov, int cantRieNov,
			int frecRieDic, int cantRieDic, int freclluvEne, int canDiasMesEne, int freclluvFeb, int canDiasMesFeb,
			int freclluvMar, int canDiasMesMar, int freclluvAbr, int canDiasMesAbr, int freclluvMay, int canDiasMesMay,
			int freclluvJun, int canDiasMesJun, int freclluvJul, int canDiasMesJul, int freclluvAgo, int canDiasMesAgo,
			int freclluvSep, int canDiasMesSep, int freclluvOct, int canDiasMesOct, int freclluvNov, int canDiasMesNov,
			int freclluvDic, int canDiasMesDic) {

		// Declaracion para el while y otras auxiliares
		double ti = 0; // tiempo inicial
		double tfinal = fechaFinal; // tiempo final
		double pasoSimu = 0.1; // Paso de simualción
		int n = 11;
		int m = 0;
		double y = 0;
		int auxMes = 0;
		double aux10;
		double aux20;
		double aux30;

		////////// Riego//////////////
		double CantRiego = 1;
		double frecRiego = 1;
		// tRiego no se modifica
		int tRiego = 1;

		// Declaracion de parametros
		// 1 Frontera Aire-Suelo
		// 2-Suelo
		int VariableTemporal = 1;
		double RelaInfiltracion = 0.6;
		double InclinacionTerre = 0;
		// 3-Evaporación del cultivo
		//double TempMedia = (tempMax + tempMin) / 2;
		double TempMedia = 26.8;
		double tmin = tempMin;
		double tmax = tempMax;
		double RadSolarExtraTer = 18.5;
		double Kc = 0.65;
		// 4-Coeficiente de estres hidrico
		// 5-Saturacion del horizonte
		int Anchodelhorizont = ancho;
		int Largodelhorizon = largo;
		int Profundidaddelho = 80;
		double PesoVolumetricoS = 1.40;
		int PesEspAgua = 1;
		double Gravedadespecifi = 2.7;
		// 6-Punto de marchitez permanente
		int DensidadAgua = 1;
		int RelacionPMP;
		// 7-Capacidad de campo
		int RelacionCC;
		if (TipoSuel == 1) {
			RelacionPMP = 3;
			RelacionCC = 7;
		} else {
			if (TipoSuel == 2) {
				RelacionPMP = 6;
				RelacionCC = 11;
			} else {
				if (TipoSuel == 3) {
					RelacionPMP = 12;
					RelacionCC = 20;
				} else {
					if (TipoSuel == 4) {
						RelacionPMP = 14;
						RelacionCC = 23;
					} else {
						RelacionPMP = 16;
						RelacionCC = 26;
					}
				}
			}
		}
		//RelacionPMP = 12;//para la prueba
		//RelacionCC = 20;//para la prueba
		/*
		System.out.println(" " + freclluvEne + " " + canDiasMesEne + " " + freclluvFeb + " " + canDiasMesFeb + " " + freclluvMar
				+ " " + canDiasMesMar + " " + freclluvAbr + " " + canDiasMesAbr + " " + freclluvMay + " " + canDiasMesMay + " "
				+ freclluvJun + " " + canDiasMesJun + " " + freclluvJul + " " + canDiasMesJul + " " + freclluvAgo + " "
				+ canDiasMesAgo + " " + freclluvSep + " " + canDiasMesSep + " " + freclluvOct + " " + canDiasMesOct + " "
				+ freclluvNov + " " + canDiasMesNov + " " + freclluvDic + " " + canDiasMesDic);
		*/
		// 8-Estres hidrico
		// 9-Efecto estres hidrico-Brotacion
		// 10-Elementos mayores
		int MaximoNAdmitido = 1000;
		int MaxKAdmit = 190;
		int MaxPAdmit = 400;
		// 11-Relacion de elementos mayores
		int NormdeSalida = 100;
		// 12-Dinamica brotes frutos
		double TasadeBrotación = 0.0032;
		int PerdBrotes = 0;
		int VarTempBrotaFrut = 30;
		int PerdFrutos = 0;

		/*--------------------------------*/
		// Declaracion no linealidades
		// 1-frontera
		double Riego;
		double Lluvia;
		// 2-suelo
		double FlujoSubsuperEnt = 0;
		// 9-Efecto estres
		double Tabla_1;
		double Tabla_2;
		// 10 Elementos mayores
		double NAgregado = 0;
		double KAgregado = 0;
		double PAgregado = 0;
		// 11-Relacion de elementos mayores
		double FIS_1;
		;
		/*--------------------------------*/

		// Declaracion Niveles
		// 1 Frontera Aire-Suelo
		double FronteraAirTierr = 0;
		double HorizontedeSuelo = 100;
		// 10-Elementos mayores
		double Nitrogeno = cantNit;
		double Potasio = cantPot;
		double Fosforo = cantFos;
		// 12-Dinamica brotes frutos
		double MaxFloracion = 1000;
		double BrotesPosPerd = 0;
		double Brotes = 0;
		double FrutosPosPerd = 0;
		double Frutos = 0;

		// Declaracion flujos
		// 1-Frontera aire-suelo
		double FlujoHidrico;
		double Escorrentia;
		// 2-Suelo
		double PercolacionA;
		double EvapoTanspira;
		double FluSubSuperA;
		double PercolacionProfu;
		double FSubsuperficialA;
		// 10- Elementeos mayores
		double IngresodeN;
		double IngresodeK;
		double IngresodeP;
		double FlujoAbsN;
		double FlujoAbsK;
		double FlujoAbsP;

		// 12-Dinamica Brotes Frutos
		double Brotacion;
		double Flujo_1;
		double Fructificacion;
		double Flujo_2;
		double PBrotes;
		double PFrutos;

		// Declaracion de variables auxiliares
		// 1-Frontera aire-suelo
		double Coeficiendeescor = 1;
		double ConversionaLitro;
		// 2-Suelo
		double RelacionPendFluj = (InclinacionTerre * 0.5) / 45;
		double VolumenAcumulado;
		// 5-Saturacion del horizonte
		double Area = Anchodelhorizont * Largodelhorizon * (0.0001);
		double Volumenfasesolid = Anchodelhorizont * Profundidaddelho * Largodelhorizon;
		double Masasueloseco = (Volumenfasesolid * 0.000001) * PesoVolumetricoS;
		double VolumendeSolidos = Masasueloseco / Gravedadespecifi * PesEspAgua;
		double VolumenSaturacio = 1000 * (Volumenfasesolid * 0.000001 - VolumendeSolidos);
		// 6-punto de marchitez permanente
		double MasadelPMP = (RelacionPMP * (Masasueloseco * 1000)) / 100;
		double VolumenPMP = MasadelPMP / DensidadAgua;
		// 7-Capacidad de campo
		double MasadeCCHorA = (RelacionCC * (Masasueloseco * 1000)) / 100;
		double VolumenCapadCamp = MasadeCCHorA / DensidadAgua;
		// 4-Coeficiente de estres hidrico
		double Volfacilmentedis = (VolumenCapadCamp + VolumenPMP) * 0.5;
		double Ks;
		// 3-Evaportranspiracion del cultivo
		double ET0 = 0.0023 * (TempMedia + 17.78) * RadSolarExtraTer * (Math.sqrt(Math.abs(tmax - tmin)));
		double ETC = (Kc * ET0) * Area;
		double ETCaj;
		// 8-Estres Hidrico
		double CWSI;

		// 9-Efecto estres hidrico-brotacion
		double Promedio5dias;
		double Promedio15dias;
		List<Double> RetardoInf1 = new ArrayList<Double>();
		List<Double> RetardoInf2 = new ArrayList<Double>();
		// RetardoInf1.add(0.0);
		// RetardoInf2.add(0.0);

		double sumRet1 = 0;
		double sumRet2 = 0;
		int auxRet1 = 0;
		int auxRet2 = 0;
		double Resta;

		// 10 Elementos mayores
		double AbsorcionN;
		double NNorm;
		double AbsorcionK;
		double KNorm;
		double AbsorcionP;
		double PNorm;
		double NumFrutuniTemp;
		// 11 Relacion de elementos mayores
		double SalNormalizada;

		double aux2;

		while (ti <= tfinal) {

			// variables auxiliares
			// 1-frontera aire suelo
			// Funcion riego
			if (ti < 31) {
				if (frecRieEne == 1) {
					if (ti == 1) {
						Riego = cantRieEne;
					} else {
						Riego = 0;
					}

				} else {
					if (frecRieEne == 2) {
						if (ti == 1 || ti == 4 || ti == 7 || ti == 10 || ti == 13 || ti == 16 || ti == 19 || ti == 22
								|| ti == 25 || ti == 28) {
							Riego = cantRieEne;
						} else {
							Riego = 0;
						}
					} else {
						if (frecRieEne == 3) {
							if (ti == 1 || ti == 8 || ti == 15 || ti == 22 || ti == 29) {
								Riego = cantRieEne;
							} else {
								Riego = 0;
							}
						} else {
							if (ti == 1 || ti == 15 || ti == 29) {
								Riego = cantRieEne;
							} else {
								Riego = 0;
							}

						}
					}
				}
			} else {
				// Febrero
				if (ti >= 31 && ti < 59) {
					//System.out.println("Entro a febrero");
					if (frecRieFeb == 1) {
						if (ti == 31) {
							
							Riego = cantRieFeb;
						} else {
							Riego = 0;
						}

					} else {
						if (frecRieFeb == 2) {
							if (ti == 31 || ti == 34 || ti == 37 || ti == 40 || ti == 43 || ti == 46 || ti == 49
									|| ti == 52 || ti == 55 || ti == 58) {
								Riego = cantRieFeb;
							} else {
								Riego = 0;
							}
						} else {
							if (frecRieFeb == 3) {
								if (ti == 31 || ti == 38 || ti == 45 || ti == 52 || ti == 59) {
									Riego = cantRieFeb;
								} else {
									Riego = 0;
								}
							} else {
								if (ti == 31 || ti == 45 || ti == 59) {
									Riego = cantRieFeb;
								} else {
									Riego = 0;
								}

							}
						}
					}
				} else {
					// Marzo
					if (ti >= 59 && ti < 90) {
						//System.out.println("Entro a Marzo");
						if (frecRieMar == 1) {
							if (ti == 59) {
								Riego = cantRieMar;
							} else {
								Riego = 0;
							}

						} else {
							if (frecRieMar == 2) {
								if (ti == 59 || ti == 62 || ti == 65 || ti == 68 || ti == 71 || ti == 74 || ti == 77
										|| ti == 80 || ti == 83 || ti == 86) {
									Riego = cantRieMar;
								} else {
									Riego = 0;
								}
							} else {
								if (frecRieMar == 3) {
									if (ti == 59 || ti == 66 || ti == 73 || ti == 80 || ti == 89) {
										Riego = cantRieMar;
									} else {
										Riego = 0;
									}
								} else {
									if (ti == 59 || ti == 73 || ti == 89) {
										Riego = cantRieMar;
									} else {
										Riego = 0;
									}

								}
							}
						}
					} else {
						// Abril
						if (ti >= 90 && ti < 120) {
							if (frecRieAbr == 1) {
								if (ti == 90) {
									Riego = cantRieAbr;
								} else {
									Riego = 0;
								}

							} else {
								if (frecRieAbr == 2) {
									if (ti == 90 || ti == 93 || ti == 96 || ti == 99 || ti == 102 || ti == 105
											|| ti == 108 || ti == 111 || ti == 114 || ti == 117) {
										Riego = cantRieAbr;
									} else {
										Riego = 0;
									}
								} else {
									if (frecRieAbr == 3) {
										if (ti == 90 || ti == 98 || ti == 105 || ti == 112 || ti == 119) {
											Riego = cantRieAbr;
										} else {
											Riego = 0;
										}
									} else {
										if (ti == 90 || ti == 105 || ti == 119) {
											Riego = cantRieAbr;
										} else {
											Riego = 0;
										}

									}
								}
							}
						} else {
							// mayo
							if (ti >= 120 && ti < 151) {
								if (frecRieMay == 1) {
									if (ti == 120) {
										Riego = cantRieMay;
									} else {
										Riego = 0;
									}

								} else {
									if (frecRieMay == 2) {
										if (ti == 120 || ti == 123 || ti ==126  || ti == 129 || ti == 132 || ti == 135
												|| ti == 138 || ti == 141 || ti == 144 || ti == 147) {
											Riego = cantRieMay;
										} else {
											Riego = 0;
										}
									} else {
										if (frecRieMay == 3) {
											if (ti == 120 || ti == 127 || ti == 134 || ti == 141 || ti == 148) {
												Riego = cantRieMay;
											} else {
												Riego = 0;
											}
										} else {
											if (ti == 120 || ti == 134 || ti == 148) {
												Riego = cantRieMay;
											} else {
												Riego = 0;
											}

										}
									}
								}
							} else {
								// junio
								if (ti >= 151 && ti < 181) {
									if (frecRieJun == 1) {
										if (ti == 151) {
											Riego = cantRieJun;
										} else {
											Riego = 0;
										}

									} else {
										if (frecRieJun == 2) {
											if (ti == 151 || ti == 154 || ti ==157  || ti == 160 || ti == 163 || ti == 166
													|| ti == 169 || ti == 172 || ti == 175 || ti == 178) {
												Riego = cantRieJun;
											} else {
												Riego = 0;
											}
										} else {
											if (frecRieJun == 3) {
												if (ti == 151 || ti == 158 || ti == 165 || ti == 172 || ti == 180) {
													Riego = cantRieJun;
												} else {
													Riego = 0;
												}
											} else {
												if (ti == 151 || ti == 165 || ti == 180) {
													Riego = cantRieJun;
												} else {
													Riego = 0;
												}
											}
										}
									}
								} else {
									// julio
									if (ti >= 181 && ti < 212) {
										if (frecRieJul == 1) {
											if (ti == 181) {
												Riego = cantRieJul;
											} else {
												Riego = 0;
											}
										} else {
											if (frecRieJul == 2) {
												if (ti == 181 || ti == 184 || ti ==187  || ti == 190 || ti == 193 || ti == 196
														|| ti == 199 || ti == 202 || ti == 205 || ti == 208) {
													Riego = cantRieJul;
												} else {
													Riego = 0;
												}
											} else {
												if (frecRieJul == 3) {
													if (ti == 181 || ti == 188 || ti == 195 || ti == 202 || ti == 210) {
														Riego = cantRieJul;
													} else {
														Riego = 0;
													}
												} else {
													if (ti == 181 || ti == 195 || ti == 210) {
														Riego = cantRieJul;
													} else {
														Riego = 0;
													}
												}
											}
										}
									} else {
										// agosto
										if (ti >= 212 && ti < 243) {
											if (frecRieAgo == 1) {
												if (ti == 212) {
													Riego = cantRieAgo;
												} else {
													Riego = 0;
												}
											} else {
												if (frecRieAgo == 2) {
													if (ti == 212 || ti == 215 || ti ==218  || ti == 221 || ti == 224 || ti == 227
															|| ti == 230 || ti == 233 || ti == 235 || ti == 238) {
														Riego = cantRieAgo;
													} else {
														Riego = 0;
													}
												} else {
													if (frecRieAgo == 3) {
														if (ti == 212 || ti == 220 || ti == 227 || ti == 234 || ti == 241) {
															Riego = cantRieAgo;
														} else {
															Riego = 0;
														}
													} else {
														if (ti == 212 || ti == 227 || ti == 241) {
															Riego = cantRieAgo;
														} else {
															Riego = 0;
														}
													}
												}
											}
										} else {
											// septiembre
											if (ti >= 243 && ti < 273) {
												if (frecRieSep == 1) {
													if (ti == 243) {
														Riego = cantRieSep;
													} else {
														Riego = 0;
													}
												} else {
													if (frecRieSep == 2) {
														if (ti == 243 || ti == 246 || ti ==249  || ti == 251 || ti == 254 || ti == 257
																|| ti == 260 || ti == 263 || ti == 265 || ti == 268) {
															Riego = cantRieSep;
														} else {
															Riego = 0;
														}
													} else {
														if (frecRieSep == 3) {
															if (ti == 243 || ti == 250 || ti == 257 || ti == 264 || ti == 271) {
																Riego = cantRieSep;
															} else {
																Riego = 0;
															}
														} else {
															if (ti == 243 || ti == 257 || ti == 271) {
																Riego = cantRieSep;
															} else {
																Riego = 0;
															}
														}
													}
												}
											} else {
												// octubre
												if (ti >= 273 && ti < 304) {
													if (frecRieOct == 1) {
														if (ti == 273) {
															Riego = cantRieOct;
														} else {
															Riego = 0;
														}
													} else {
														if (frecRieOct == 2) {
															if (ti == 273 || ti == 276 || ti ==279  || ti == 281 || ti == 284 || ti == 287
																	|| ti == 290 || ti == 293 || ti == 295 || ti == 298) {
																Riego = cantRieOct;
															} else {
																Riego = 0;
															}
														} else {
															if (frecRieOct == 3) {
																if (ti == 273 || ti == 280 || ti == 287 || ti == 294 || ti == 301) {
																	Riego = cantRieOct;
																} else {
																	Riego = 0;
																}
															} else {
																if (ti == 273 || ti == 287 || ti == 301) {
																	Riego = cantRieOct;
																} else {
																	Riego = 0;
																}
															}
														}
													}
												} else {
													// noviembre
													if (ti >= 304 && ti < 334) {
														if (frecRieNov == 1) {
															if (ti == 304) {
																Riego = cantRieNov;
															} else {
																Riego = 0;
															}
														} else {
															if (frecRieNov == 2) {
																if (ti == 304 || ti == 307 || ti ==310  || ti == 313 || ti == 316 || ti == 319
																		|| ti == 321 || ti == 324 || ti == 327 || ti == 330) {
																	Riego = cantRieNov;
																} else {
																	Riego = 0;
																}
															} else {
																if (frecRieNov == 3) {
																	if (ti == 304 || ti == 311 || ti == 318 || ti == 325 || ti == 332) {
																		Riego = cantRieNov;
																	} else {
																		Riego = 0;
																	}
																} else {
																	if (ti == 304 || ti == 318 || ti == 332) {
																		Riego = cantRieNov;
																	} else {
																		Riego = 0;
																	}
																}
															}
														}
													} else {
														// Diciembre
														if (ti >= 334 ) {
															if (frecRieDic == 1) {
																if (ti == 334) {
																	Riego = cantRieDic;
																} else {
																	Riego = 0;
																}
															} else {
																if (frecRieDic == 2) {
																	if (ti == 334 || ti == 337 || ti ==340  || ti == 343 || ti == 346 || ti == 349
																			|| ti == 351 || ti == 354 || ti == 357 || ti == 360) {
																		Riego = cantRieDic;
																	} else {
																		Riego = 0;
																	}
																} else {
																	if (frecRieDic == 3) {
																		if (ti == 334 || ti == 341 || ti == 348 || ti == 355 || ti == 362) {
																			Riego = cantRieDic;
																		} else {
																			Riego = 0;
																		}
																	} else {
																		if (ti == 334 || ti == 348 || ti == 362) {
																			Riego = cantRieDic;
																		} else {
																			Riego = 0;
																		}
																	}
																}
															}
														}else {
															Riego=1;
														}
													}
												}
											}
										}
									}
								}
							}
						}

					}
				}
			}
		// Funcion de la lluvia para todos los departamentos
			if(freclluvEne>0) {

				if (ti <= 28) {
					// Enero
					Lluvia=freclluvEne/canDiasMesEne;
					
					//System.out.println("Lluvia= "+Lluvia+" "+canDiasMesEne+" "+freclluvEne);
				} else {
					// Febrero
					if (ti > 28 && ti <= 56) {
						Lluvia=freclluvFeb/canDiasMesFeb;
						
					} else {
						// Marzo
						if (ti > 56 && ti <= 84) {
							Lluvia=freclluvMar/canDiasMesMar;
						} else {
							// Abril
							if (ti > 84 && ti <= 112) {
								Lluvia=freclluvAbr/canDiasMesAbr;
							} else {
								// mayo
								if (ti > 112 && ti <= 140) {
									Lluvia=freclluvMay/canDiasMesMay;
								} else {
									// junio
									if (ti > 140 && ti <= 168) {
										Lluvia=freclluvJun/canDiasMesJun;
									} else {
										// julio
										if (ti > 168 && ti <= 196) {
											Lluvia=freclluvJul/canDiasMesJul;
										} else {
											// agosto
											if (ti > 196 && ti <= 224) {
												Lluvia=freclluvAgo/canDiasMesAgo;
											} else {
												// septiembre
												if (ti > 224 && ti <= 252) {
													Lluvia=freclluvSep/canDiasMesSep;
												} else {
													// octubre
													if (ti > 252 && ti <= 308) {
														Lluvia=freclluvOct/canDiasMesOct;
													} else {
														// noviembre
														if (ti > 308 && ti <= 336) {
															Lluvia=freclluvNov/canDiasMesNov;

														} else {
															// Diciembre
															if (ti > 336 && ti <= 364) {
																Lluvia=freclluvDic/canDiasMesDic;
															} else {
																Lluvia = 0;
															}
														}
													}
												}
											}
										}
									}
								}
							}

						}
					}
				}
			}else {

			// Funcion de la lluvia simulador santander
			if (ti <= 31) {
				// Enero
				if (ti == 1 || ti == 4 || ti == 7 || ti == 8 || ti == 11 || ti == 15 || ti == 18 || ti == 22 || ti == 25
						|| ti == 29) {
					Lluvia = 8;
				} else {
					Lluvia = 0;
				}
			} else {
				// Febrero
				if (ti > 31 && ti <= 59) {
					if (ti == 31 || ti == 35 || ti == 39 || ti == 42 || ti == 45 || ti == 46 || ti == 49 || ti == 53
							|| ti == 56) {
						Lluvia = 9;
					} else {
						Lluvia = 0;
					}
				} else {
					// Marzo
					if (ti > 59 && ti <= 90) {
						if (ti == 60 || ti == 63 || ti == 66 || ti == 67 || ti == 70 || ti == 73 || ti == 74 || ti == 77
								|| ti == 80 || ti == 81 || ti == 84 || ti == 87 || ti == 88 || ti == 90) {
							Lluvia = 10;
						} else {
							Lluvia = 0;
						}
					} else {
						// Abril
						if (ti > 90 && ti <= 120) {
							if (ti > 90 && ti <= 100) {
								Lluvia = 8.35;
							} else {
								if (ti >= 113 && ti <= 120) {
									Lluvia = 8.35;
								} else {
									Lluvia = 0;
								}
							}
						} else {
							// mayo
							if (ti > 120 && ti <= 151) {
								if (ti > 120 && ti <= 130) {
									Lluvia = 8.06;
								} else {
									if (ti > 143 && ti <= 151) {
										Lluvia = 8.06;
									} else {
										Lluvia = 0;
									}
								}
							} else {
								// junio
								if (ti > 151 && ti <= 181) {
									if (ti > 151 && ti <= 161) {
										Lluvia = 4.71;
									} else {
										if (ti > 174 && ti <= 181) {
											Lluvia = 4.71;
										} else {
											Lluvia = 0;
										}
									}
								} else {
									// julio
									if (ti > 181 && ti <= 212) {
										if (ti > 181 && ti <= 191) {
											Lluvia = 6;
										} else {
											if (ti > 205 && ti <= 212) {
												Lluvia = 6;
											} else {
												Lluvia = 0;
											}
										}
									} else {
										// agosto
										if (ti > 212 && ti <= 243) {
											if (ti > 212 && ti <= 222) {
												Lluvia = 3.95;
											} else {
												if (ti > 234 && ti <= 243) {
													Lluvia = 3.95;
												} else {
													Lluvia = 0;
												}
											}
										} else {
											// septiembre
											if (ti > 243 && ti <= 273) {
												if (ti > 243 && ti <= 253) {
													Lluvia = 5.79;
												} else {
													if (ti > 264 && ti <= 273) {
														Lluvia = 5.79;
													} else {
														Lluvia = 0;
													}
												}
											} else {
												// octubre
												if (ti > 273 && ti <= 304) {
													if (ti > 273 && ti <= 283) {
														Lluvia = 6.84;
													} else {
														if (ti > 295 && ti <= 304) {
															Lluvia = 6.84;
														} else {
															Lluvia = 0;
														}
													}
												} else {
													// noviembre
													if (ti > 304 && ti <= 334) {
														if (ti > 304 && ti <= 317) {
															Lluvia = 8.85;
														} else {
															Lluvia = 0;
														}

													} else {
														// Diciembre
														if (ti > 334 && ti <= 341) {
															Lluvia = 8.57;
														} else {
															Lluvia = 0;
														}
													}
												}
											}
										}
									}
								}
							}
						}

					}
				}
			}
			}
			

			ConversionaLitro = (Lluvia) * Area;
			// 2-Suelo
			VolumenAcumulado = FronteraAirTierr + HorizontedeSuelo - VolumenSaturacio;

			// System.out.println("aqui ta= "+ti);
			// Fljos frontera aire suelo
			if (VolumenAcumulado > 0) {
				if (FronteraAirTierr > VolumenAcumulado) {
					Escorrentia = (Coeficiendeescor / VariableTemporal) * VolumenAcumulado;
				} else {
					Escorrentia = (Coeficiendeescor / VariableTemporal) * FronteraAirTierr;
				}
			} else {
				Escorrentia = 0;
			}
			FlujoHidrico = ConversionaLitro + Riego;

			// 4-Coeficiente de estres hidrico
			double aux1 = ((VolumenCapadCamp - VolumenPMP) - (VolumenCapadCamp - HorizontedeSuelo))
					/ ((VolumenCapadCamp - VolumenPMP) - (VolumenCapadCamp - Volfacilmentedis));
			if (aux1 > 1) {
				Ks = 1;
			} else {
				Ks = aux1;
			}
			// 3-Evapotranspiracion del cultivo
			ETCaj = ETC * Ks;
			// Fljos suelo
			aux10 = VolumenSaturacio - HorizontedeSuelo;
			aux20 = FronteraAirTierr;
			if ((VolumenSaturacio - HorizontedeSuelo) < FronteraAirTierr) {
				PercolacionA = (1 / VariableTemporal) * (VolumenSaturacio - HorizontedeSuelo);
			} else {
				PercolacionA = (1 / VariableTemporal) * FronteraAirTierr;
			}
			if (((1 / VariableTemporal) * (VolumenSaturacio - HorizontedeSuelo)) < FlujoSubsuperEnt) {
				FSubsuperficialA = (1 / VariableTemporal) * (VolumenSaturacio - HorizontedeSuelo);
			} else {
				FSubsuperficialA = FlujoSubsuperEnt;
			}
			if (ETCaj < ((1 / VariableTemporal) * HorizontedeSuelo)) {
				EvapoTanspira = ETCaj;
			} else {
				EvapoTanspira = (1 / VariableTemporal) * HorizontedeSuelo;
			}
			if ((RelaInfiltracion * RelacionPendFluj * (HorizontedeSuelo - VolumenCapadCamp)) > 0) {
				FluSubSuperA = (1 / VariableTemporal) * RelaInfiltracion * RelacionPendFluj
						* (HorizontedeSuelo - VolumenCapadCamp);
			} else {
				FluSubSuperA = 0;
			}
			if (((1 - RelacionPendFluj) * (HorizontedeSuelo - VolumenCapadCamp)) > 0) {
				PercolacionProfu = RelaInfiltracion * (1 / VariableTemporal)
						* ((1 - RelacionPendFluj) * (HorizontedeSuelo - VolumenCapadCamp));
			} else {
				PercolacionProfu = RelaInfiltracion * (1 / VariableTemporal) * 0;
			}
			// 8-Estres hidrico
			CWSI = 1 - (ETCaj / ETC);
			// 9-Efecto estres hidrico-brotacion

			RetardoInf1.add(CWSI);
			RetardoInf2.add(CWSI);

			Promedio5dias = sumRet1 / 50;
			Promedio15dias = sumRet2 / 150;
			// System.out.println("ti= "+ti+" sumRet1= "+sumRet1+" sumRet2= "+sumRet2+ "
			// CWSI= "+CWSI);

			if (ti < 5) {
				sumRet1 = sumRet1 + CWSI;
			} else {
				sumRet1 = sumRet1 + CWSI - RetardoInf1.get(auxRet1);
				auxRet1 = auxRet1 + 1;

			}
			if (ti < 15) {
				sumRet2 = sumRet2 + CWSI;
			} else {
				sumRet2 = sumRet2 + CWSI - RetardoInf2.get(auxRet2);
				auxRet2 = auxRet2 + 1;
				// System.out.println("ti= "+ti+ " CWSI= "+CWSI+" Ret1=
				// "+RetardoInf1.get(auxRet1)+" auxRet1= "+auxRet1);
			}
			Resta = Promedio5dias - Promedio15dias;
			if (Resta < 0.2) {
				Tabla_1 = 0;
			} else {
				Tabla_1 = 1;
			}
			if (Promedio15dias < 0.2) {
				Tabla_2 = 1;
			} else {
				Tabla_2 = 0;
			}

			// Flujos Dinamica Brotes frutos

			PBrotes = (BrotesPosPerd * PerdBrotes) / VariableTemporal;
			Flujo_1 = ((1 - PerdBrotes) * BrotesPosPerd) / VariableTemporal;
			Fructificacion = Brotes / VarTempBrotaFrut;
			PFrutos = PerdFrutos * FrutosPosPerd / VariableTemporal;
			Flujo_2 = ((1 - PerdFrutos) * FrutosPosPerd) / VariableTemporal;

			// 12 Dinamica Brotes frutos
			NumFrutuniTemp = Fructificacion;
			// 10-Elementos mayores
			AbsorcionN = (MaximoNAdmitido / MaxFloracion) * NumFrutuniTemp;
			if (Nitrogeno < MaximoNAdmitido) {
				NNorm = Nitrogeno / MaximoNAdmitido;
			} else {
				NNorm = MaximoNAdmitido / MaximoNAdmitido;
			}
			AbsorcionK = (MaxKAdmit / MaxFloracion) * NumFrutuniTemp;
			if (Potasio < MaxKAdmit) {
				KNorm = Potasio / MaxKAdmit;
			} else {
				KNorm = MaxKAdmit / MaxKAdmit;
			}
			AbsorcionP = (MaxPAdmit / MaxFloracion) * NumFrutuniTemp;
			if (Fosforo < MaxPAdmit) {
				PNorm = Fosforo / MaxPAdmit;
			} else {
				PNorm = MaxPAdmit / MaxPAdmit;
			}

			IngresodeN = NAgregado / VariableTemporal;
			aux2 = Nitrogeno / VariableTemporal;
			if (AbsorcionN < aux2) {
				FlujoAbsN = AbsorcionN;
			} else {
				FlujoAbsN = aux2;
			}
			IngresodeK = KAgregado / VariableTemporal;

			if (Potasio < AbsorcionK) {
				FlujoAbsK = Potasio / VariableTemporal;
			} else {
				FlujoAbsK = AbsorcionK / VariableTemporal;
			}
			IngresodeP = PAgregado / VariableTemporal;

			if (Fosforo < AbsorcionP) {
				FlujoAbsP = Fosforo / VariableTemporal;
			} else {
				FlujoAbsP = AbsorcionP / VariableTemporal;
			}
			// 11 Relacion de elementos mayores
			FIS_1 = reglasrest.logFuzzy(KNorm, NNorm, PNorm);
			SalNormalizada = (FIS_1 / NormdeSalida); /// ojo Falta completar
			// Flujos Dinamica Brotes frutos
			Brotacion = ((Tabla_1 + Tabla_2) * MaxFloracion * SalNormalizada * TasadeBrotación);
		///System.out.println("ti: "+ti+"   SalNormalizada="+SalNormalizada+"   FIS_1="+FIS_1+"  MaxForación="+MaxFloracion+"   Brotes="+Brotes+"   Frutos="+Frutos);
			if (n == 11) {
				//System.out.println("ti: "+ti+"   SalNormalizada="+SalNormalizada+"   FIS_1="+FIS_1+"  MaxForación="+MaxFloracion+"   Brotes="+Brotes+"   Frutos="+Frutos);
				// System.out.println("ti= "+frecRiego+" auxMes= "+CantRiego+" Lluvia=
				// "+Lluvia);
				// System.out.println("ti= "+ti+" Lluvia= "+Lluvia+" Riego= "+Riego);
				// Sector1
				// System.out.println("ti= "+ti+" Coeficiendeescor= "+Coeficiendeescor+"
				// Escorrentia= "+Escorrentia+" FlujoHidrico= "+FlujoHidrico);
				// Sector2
				// System.out.println("ti= "+ti+" PercolacionA= "+PercolacionA+"
				// VolumenAcumulado= "+VolumenAcumulado+" Evapotanspira= "+EvapoTanspira+"
				// FluSubSuperA= "+FluSubSuperA+" RelacionPendFluj= "+RelacionPendFluj+"
				// PercolacionProfu= "+PercolacionProfu);

				// System.out.println("ti= "+ti+" aux10= "+aux10+" FronteraAirTierr=
				// "+FronteraAirTierr+ " PercolacionA= "+PercolacionA);
				// System.out.println("ti= "+ti+" Brotación= "+Brotacion+" Flujo_1= "+Flujo_1+"
				// Fructificación= "+Fructificacion+" Flujo_2= "+Flujo_2+" PBrotes= "+PBrotes+"
				// PFrutos= "+PFrutos);
				// System.out.println("ti= "+ti+" Promedio5días= "+Promedio5dias+"
				// Promedio15dias= "+Promedio15dias+" Tabla_1= "+Tabla_1+" Tabla_2= "+Tabla_2);
				// System.out.println("ti= "+ti+" sumRet1= "+sumRet1+" sumRet2= "+sumRet2);
				if (auxMes < 29) {

					auxMes = auxMes + 1;
				} else {
					listMaxFloracion.add(MaxFloracion);
					listBrotesPosPerd.add(BrotesPosPerd);
					listBrotes.add((Brotes*100)/61);
					listFrutosPosPerd.add(FrutosPosPerd);
					listFrutos.add(Frutos);
					listNitrogeno.add(Nitrogeno);
					listPotasio.add(Potasio);
					listFosforo.add(Fosforo);
					listFronteraAirTierr.add(FronteraAirTierr);
					listHorizontedeSuelo.add(HorizontedeSuelo);
					auxMes = 0;
				}
				//
				listYear.add(y);
				ti = ti + 1;
				// System.out.println("ti= "+ti+" Riego= "+Riego+" Lluvia= "+Lluvia);

				y = y + 1;
				if (tRiego == 7) {
					tRiego = 1;
				} else {
					tRiego = tRiego + 1;
				}

				n = 0;
			}

			// Niveles
			// 1-Frontera Aire-suelo
			FronteraAirTierr = FronteraAirTierr + (FlujoHidrico * pasoSimu);
			FronteraAirTierr = FronteraAirTierr - (Escorrentia * pasoSimu);
			FronteraAirTierr = FronteraAirTierr - (PercolacionA * pasoSimu);
			// 2-Frontera Suelo
			HorizontedeSuelo = HorizontedeSuelo + (PercolacionA * pasoSimu);
			HorizontedeSuelo = HorizontedeSuelo + (FSubsuperficialA * pasoSimu);
			HorizontedeSuelo = HorizontedeSuelo - (PercolacionProfu * pasoSimu);
			HorizontedeSuelo = HorizontedeSuelo - (EvapoTanspira * pasoSimu);
			HorizontedeSuelo = HorizontedeSuelo - (FluSubSuperA * pasoSimu);
			// 10-Elementos Mayores
			Nitrogeno = Nitrogeno + (IngresodeN * pasoSimu);
			Potasio = Potasio + (IngresodeK * pasoSimu);
			Fosforo = Fosforo + (IngresodeP * pasoSimu);
			Nitrogeno = Nitrogeno - (FlujoAbsN * pasoSimu);
			Potasio = Potasio - (FlujoAbsK * pasoSimu);
			Fosforo = Fosforo - (FlujoAbsP * pasoSimu);

			// 12-Dinamica Brotes Frutos

			MaxFloracion = MaxFloracion - (Brotacion * pasoSimu);
			BrotesPosPerd = BrotesPosPerd + (Brotacion * pasoSimu);
			BrotesPosPerd = BrotesPosPerd - (PBrotes * pasoSimu);
			BrotesPosPerd = BrotesPosPerd - (Flujo_1 * pasoSimu);
			Brotes = Brotes + (Flujo_1 * pasoSimu);
			Brotes = Brotes - (Fructificacion * pasoSimu);
			FrutosPosPerd = FrutosPosPerd + (Fructificacion * pasoSimu);
			FrutosPosPerd = FrutosPosPerd - (PFrutos * pasoSimu);
			FrutosPosPerd = FrutosPosPerd - (Flujo_2 * pasoSimu);
			Frutos = Frutos + (Flujo_2 * pasoSimu);

			m = m + 1;
			n = n + 1;
			// System.out.println("Ti= "+ti+" FronteraAirTierr= "+FronteraAirTierr+"
			// HorizontedeSuelo= "+HorizontedeSuelo+" Escorrentia= "+Escorrentia);
			// System.out.println("Ti= "+m+" Tabla1 "+Tabla_1+" Tabla2 "+Tabla_2+"
			// SalNormalizada= "+SalNormalizada+" prom5= "+Promedio5dias+" prom15=
			// "+Promedio15dias+" Resta= "+Resta);
			// System.out.println(ti);
		}
		//System.out.println(listBrotes);
	}

}
