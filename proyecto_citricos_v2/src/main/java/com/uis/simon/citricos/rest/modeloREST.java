package com.uis.simon.citricos.rest;

import com.uis.simon.citricos.modelo.ResultadoRiego;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import com.uis.simon.citricos.modelo.DatosModelo;
import com.uis.simon.citricos.modelo.Modelo;

@RestController
@RequestMapping("/simuCultivo/")

public class modeloREST {

	@GetMapping
	private double simuCitri() {
		ReglasRest fuzy = new ReglasRest();
		fuzy.logFuzzy(0.3, 0.5, 0.25);
		// modeloSimu.Simulacion(20,10,25,22,21,22,300);
		return fuzy.xc;
	}

	@PostMapping
	private Modelo simulacionCitri(@RequestBody DatosModelo datosmodelo) {
		int fechaFinal;
		Modelo modeloSimu = new Modelo();
        if(datosmodelo.getFechaFinal()==0){
            fechaFinal=365;
        }else {
            fechaFinal=datosmodelo.getFechaFinal();
        }
		modeloSimu.Simulacion(
				fechaFinal,datosmodelo.getLargo(), datosmodelo.getAncho(), datosmodelo.getTempMax(),
				datosmodelo.getTempMin(), datosmodelo.getCantNit(), datosmodelo.getCantPot(), datosmodelo.getCantFos(),
				datosmodelo.getTipoSuel(), datosmodelo.getFrecRieEne(), datosmodelo.getCantRieEne(),
				datosmodelo.getFrecRieFeb(), datosmodelo.getCantRieFeb(), datosmodelo.getFrecRieMar(),
				datosmodelo.getCantRieMar(), datosmodelo.getFrecRieAbr(), datosmodelo.getCantRieAbr(),
				datosmodelo.getFrecRieMay(), datosmodelo.getCantRieMay(), datosmodelo.getFrecRieJun(),
				datosmodelo.getCantRieJun(), datosmodelo.getFrecRieJul(), datosmodelo.getCantRieJul(),
				datosmodelo.getFrecRieAgo(), datosmodelo.getCantRieAgo(), datosmodelo.getFrecRieSep(),
				datosmodelo.getCantRieSep(), datosmodelo.getFrecRieOct(), datosmodelo.getCantRieOct(),
				datosmodelo.getFrecRieNov(), datosmodelo.getCantRieNov(), datosmodelo.getFrecRieDic(),
				datosmodelo.getCantRieDic(), datosmodelo.getFreclluvEne(), datosmodelo.getCanDiasMesEne(),
				datosmodelo.getFreclluvFeb(), datosmodelo.getCanDiasMesFeb(), datosmodelo.getFreclluvMar(),
				datosmodelo.getCanDiasMesMar(), datosmodelo.getFreclluvAbr(), datosmodelo.getCanDiasMesAbr(),
				datosmodelo.getFreclluvMay(), datosmodelo.getCanDiasMesMay(), datosmodelo.getFreclluvJun(),
				datosmodelo.getCanDiasMesJun(), datosmodelo.getFreclluvJul(), datosmodelo.getCanDiasMesJul(),
				datosmodelo.getFreclluvAgo(), datosmodelo.getCanDiasMesAgo(), datosmodelo.getFreclluvSep(),
				datosmodelo.getCanDiasMesSep(), datosmodelo.getFreclluvOct(), datosmodelo.getCanDiasMesOct(),
				datosmodelo.getFreclluvNov(), datosmodelo.getCanDiasMesNov(), datosmodelo.getFreclluvDic(),
				datosmodelo.getCanDiasMesDic()
		);
		System.out.println("Frecuecia de riego= "+datosmodelo.getFreclluvDic()+" fecha final: "+datosmodelo.getFechaFinal());
		return modeloSimu;

	}

	@PostMapping("riegoRecomendado/")
	private ResultadoRiego riegoOptimo(@RequestBody DatosModelo datosmodelo, @RequestParam double cantFrut, @RequestParam int frecRie){
		System.out.println("Esta es la frecuencia"+frecRie);

		boolean controlFrutos = true; //var que sirve para controlar si ningun riego puede cumplir con las espectativas del cultivo
		double control=0;  //var que va tomar el valor de frutos en la simulación
        int lluviaMax= 20;
		int cantRieEne = 0;
		int cantRieFeb = 0;
		int cantRieMar = 0;
		int cantRieAbr = 0;
		int cantRieMay = 0;
		int cantRieJun = 0;
		int cantRieJul = 0;
		int cantRieAgo = 0;
		int cantRieSep = 0;
		int cantRieOct = 0;
		int cantRieNov = 0;
		int cantRieDic = 0;
        String Objetivo ="se cumplio el objetivo";

		List<Integer> controlRiego = new ArrayList<>();
        Modelo resultSimu=new Modelo();


		while (control<=cantFrut && controlFrutos ) {
			Modelo modeloSimu = new Modelo();
                modeloSimu.Simulacion(
                        datosmodelo.getFechaFinal(), datosmodelo.getLargo(), datosmodelo.getAncho(), datosmodelo.getTempMax(),
                        datosmodelo.getTempMin(), datosmodelo.getCantNit(), datosmodelo.getCantPot(), datosmodelo.getCantFos(),
                        datosmodelo.getTipoSuel(), frecRie, cantRieEne, frecRie, cantRieFeb, frecRie, cantRieMar, frecRie, cantRieAbr,
                        frecRie, cantRieMay, frecRie, cantRieJun, frecRie, cantRieJul, frecRie, cantRieAgo, frecRie, cantRieSep, frecRie,
                        cantRieOct, frecRie, cantRieNov, frecRie, cantRieDic, datosmodelo.getFreclluvEne(), datosmodelo.getCanDiasMesEne(),
                        datosmodelo.getFreclluvFeb(), datosmodelo.getCanDiasMesFeb(), datosmodelo.getFreclluvMar(),
                        datosmodelo.getCanDiasMesMar(), datosmodelo.getFreclluvAbr(), datosmodelo.getCanDiasMesAbr(),
                        datosmodelo.getFreclluvMay(), datosmodelo.getCanDiasMesMay(), datosmodelo.getFreclluvJun(),
                        datosmodelo.getCanDiasMesJun(), datosmodelo.getFreclluvJul(), datosmodelo.getCanDiasMesJul(),
                        datosmodelo.getFreclluvAgo(), datosmodelo.getCanDiasMesAgo(), datosmodelo.getFreclluvSep(),
                        datosmodelo.getCanDiasMesSep(), datosmodelo.getFreclluvOct(), datosmodelo.getCanDiasMesOct(),
                        datosmodelo.getFreclluvNov(), datosmodelo.getCanDiasMesNov(), datosmodelo.getFreclluvDic(),
                        datosmodelo.getCanDiasMesDic()
                );

                control = modeloSimu.getListFrutos().get(modeloSimu.getListFrutos().size() - 1);
                resultSimu=modeloSimu;

                System.out.println("---------------control--------------\n " + control);
                System.out.println(modeloSimu.getListFrutos());

                if (control <= cantFrut) {
                    if (cantRieEne < lluviaMax && datosmodelo.getFechaFinal() >= 30) {
                        cantRieEne++;
                    } else {
                        if (cantRieFeb < lluviaMax && datosmodelo.getFechaFinal() >= 60) {
                            cantRieFeb++;
                        } else {
                            if (cantRieMar < lluviaMax && datosmodelo.getFechaFinal() >= 90) {
                                cantRieMar++;
                            } else {
                                if (cantRieAbr < lluviaMax && datosmodelo.getFechaFinal() >= 120) {
                                    cantRieAbr++;
                                } else {
                                    if (cantRieMay < lluviaMax && datosmodelo.getFechaFinal() >= 150) {
                                        cantRieMay++;
                                    } else {
                                        if (cantRieJun < lluviaMax && datosmodelo.getFechaFinal() >= 180) {
                                            cantRieJun++;
                                        } else {
                                            if (cantRieJul < lluviaMax && datosmodelo.getFechaFinal() >= 210) {
                                                cantRieJul++;
                                            } else {
                                                if (cantRieAgo < lluviaMax && datosmodelo.getFechaFinal() >= 240) {
                                                    cantRieAgo++;
                                                } else {
                                                    if (cantRieSep < lluviaMax && datosmodelo.getFechaFinal() >= 270) {
                                                        cantRieSep++;
                                                    } else {
                                                        if (cantRieOct < lluviaMax && datosmodelo.getFechaFinal() >= 300) {
                                                            cantRieOct++;
                                                        } else {
                                                            if (cantRieNov < lluviaMax && datosmodelo.getFechaFinal() >= 330) {
                                                                cantRieNov++;
                                                            } else {
                                                                if (cantRieDic < lluviaMax && datosmodelo.getFechaFinal() >= 360) {
                                                                    cantRieDic++;
                                                                } else {
                                                                    controlFrutos = false;
                                                                    Objetivo="no se cumplió el objetivo, la cantidad máxima fue: "+control;
                                                                    System.out.println(Objetivo);

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


                if (control >= cantFrut || !controlFrutos) {
                    controlRiego.add(cantRieEne);
                    controlRiego.add(cantRieFeb);
                    controlRiego.add(cantRieMar);
                    controlRiego.add(cantRieAbr);
                    controlRiego.add(cantRieMay);
                    controlRiego.add(cantRieJun);
                    controlRiego.add(cantRieJul);
                    controlRiego.add(cantRieAgo);
                    controlRiego.add(cantRieSep);
                    controlRiego.add(cantRieOct);
                    controlRiego.add(cantRieNov);
                    controlRiego.add(cantRieDic);

                }
		}
        return new ResultadoRiego(controlRiego, Objetivo,resultSimu );

	}

}
