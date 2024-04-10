package com.uis.simon.citricos.rest;

public class ReglasRest {

	double xb;
	double yb;
	double xm1;
	double xm2;
	double ym;
	double xa;
	double ya;
	double Ab;
	double Am;
	double Aa;
	double xc;

	public ReglasRest() {

	}

	public ReglasRest(double xb, double yb, double xm1, double xm2, double ym, double xa, double ya, double ab,
			double am, double aa, double xc) {
		super();
		this.xb = xb;
		this.yb = yb;
		this.xm1 = xm1;
		this.xm2 = xm2;
		this.ym = ym;
		this.xa = xa;
		this.ya = ya;
		Ab = ab;
		Am = am;
		Aa = aa;
		this.xc = xc;
	}

	public double getXb() {
		return xb;
	}

	public void setXb(double xb) {
		this.xb = xb;
	}

	public double getYb() {
		return yb;
	}

	public void setYb(double yb) {
		this.yb = yb;
	}

	public double getXm1() {
		return xm1;
	}

	public void setXm1(double xm1) {
		this.xm1 = xm1;
	}

	public double getXm2() {
		return xm2;
	}

	public void setXm2(double xm2) {
		this.xm2 = xm2;
	}

	public double getYm() {
		return ym;
	}

	public void setYm(double ym) {
		this.ym = ym;
	}

	public double getXa() {
		return xa;
	}

	public void setXa(double xa) {
		this.xa = xa;
	}

	public double getYa() {
		return ya;
	}

	public void setYa(double ya) {
		this.ya = ya;
	}

	public double getAb() {
		return Ab;
	}

	public void setAb(double ab) {
		Ab = ab;
	}

	public double getAm() {
		return Am;
	}

	public void setAm(double am) {
		Am = am;
	}

	public double getAa() {
		return Aa;
	}

	public void setAa(double aa) {
		Aa = aa;
	}

	public double getXc() {
		return xc;
	}

	public void setXc(double xc) {
		this.xc = xc;
	}

	public double regla1(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		yk = (-2.5) * KNORM + 1;
		yn = (-2.5) * NNORM + 1;
		yp = (-2.5) * PNORM + 1;

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);

		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = -(y - 1) / (0.025);
			// System. out. println("x= "+x+" y="+y);
			Ar = y * x;
			At = ((40 - x) * y) / 2;
			// System. out. println("ar= "+Ar+" at="+At);
			Area = Ar + At;
			this.Ab = Area;
			this.yb = y;
			this.xb = x;
		} else {
			Area = 0;
		}

		//System.out.println(Area);
		return Area;
	}

	public double regla2(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		if (KNORM < 0.5 && KNORM >= 0.1) {
			yk = (2.5) * (KNORM - 0.1);
		} else {
			yk = (-2.5) * (KNORM - 0.9);
		}
		yn = (-2.5) * NNORM + 1;
		yp = (-2.5) * PNORM + 1;

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}
			x = -(y - 1) / (0.025);
			Ar = y * x;
			At = ((40 - x) * y) / 2;
			Area = Ar + At;
			if (this.Ab < Area) {
				this.Ab = Area;
				this.xb = x;
				this.yb = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla3(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		yk = (2.5) * (KNORM - 0.6);

		yn = (-2.5) * NNORM + 1;
		yp = (-2.5) * PNORM + 1;
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = -(y - 1) / (0.025);
			Ar = y * x;
			At = ((40 - x) * y) / 2;
			Area = Ar + At;
			if (this.Ab < Area) {
				this.Ab = Area;
				this.xb = x;
				this.yb = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla4(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		if (NNORM < 0.5) {
			yn = (2.5) * (NNORM - 0.1);
		} else {
			yn = (-2.5) * (NNORM - 0.9);
		}
		yk = (-2.5) * KNORM + 1;
		yp = (-2.5) * PNORM + 1;
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = -(y - 1) / (0.025);
			//System.out.println("x= " + x + " y=" + y);
			Ar = y * x;
			At = ((40 - x) * y) / 2;
			Area = Ar + At;
			if (this.Ab < Area) {
				this.Ab = Area;
				this.xb = x;
				this.yb = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla5(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		if (KNORM < 0.5) {
			yk = (2.5) * (KNORM - 0.1);
		} else {
			yk = (-2.5) * (KNORM - 0.9);
		}
		if (NNORM < 0.5) {
			yn = (2.5) * (NNORM - 0.1);
		} else {
			yn = (-2.5) * (NNORM - 0.9);
		}

		yp = (-2.5) * PNORM + 1;
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			this.Am = Area;
			this.xm1 = x1;
			this.xm2 = x2;
			this.ym = y;
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla6(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		yk = (2.5) * (KNORM - 0.6);
		if (NNORM < 0.5) {
			yn = (2.5) * (NNORM - 0.1);
		} else {
			yn = (-2.5) * (NNORM - 0.9);
		}

		yp = (-2.5) * PNORM + 1;
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla7(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		yn = (2.5) * (NNORM - 0.6);

		yk = (-2.5) * KNORM + 1;
		yp = (-2.5) * PNORM + 1;
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = -(y - 1) / (0.025);
			Ar = y * x;
			At = ((40 - x) * y) / 2;
			Area = Ar + At;
			if (this.Ab < Area) {
				this.Ab = Area;
				this.xb = x;
				this.yb = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla8(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		yn = (2.5) * (NNORM - 0.6);
		if (KNORM < 0.5) {
			yk = (2.5) * (KNORM - 0.1);
		} else {
			yk = (-2.5) * (KNORM - 0.9);
		}

		yp = (-2.5) * PNORM + 1;
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla9(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		yk = (2.5) * (KNORM - 0.6);
		yn = (2.5) * (NNORM - 0.6);

		yp = (-2.5) * PNORM + 1;
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla10(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		if (PNORM < 0.5) {
			yp = (2.5) * (PNORM - 0.1);
		} else {
			yp = (-2.5) * (PNORM - 0.9);
		}

		yk = (-2.5) * KNORM + 1;
		yn = (-2.5) * NNORM + 1;
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = -(y - 1) / (0.025);
			Ar = y * x;
			At = ((40 - x) * y) / 2;
			Area = Ar + At;
			if (this.Ab < Area) {
				this.Ab = Area;
				this.xb = x;
				this.yb = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla11(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		if (KNORM < 0.5) {
			yk = (2.5) * (KNORM - 0.1);
		} else {
			yk = (-2.5) * (KNORM - 0.9);
		}
		if (PNORM < 0.5) {
			yp = (2.5) * (PNORM - 0.1);
		} else {
			yp = (-2.5) * (PNORM - 0.9);
		}

		yn = (-2.5) * NNORM + 1;
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = -(y - 1) / (0.025);
			Ar = y * x;
			At = ((40 - x) * y) / 2;
			Area = Ar + At;
			if (this.Ab < Area) {
				this.Ab = Area;
				this.xb = x;
				this.yb = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla12(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		yk = (2.5) * (KNORM - 0.6);

		yn = (-2.5) * NNORM + 1;

		if (PNORM < 0.5) {
			yp = (2.5) * (PNORM - 0.1);
		} else {
			yp = (-2.5) * (PNORM - 0.9);
		}
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = -(y - 1) / (0.025);
			Ar = y * x;
			At = ((40 - x) * y) / 2;
			Area = Ar + At;
			if (this.Ab < Area) {
				this.Ab = Area;
				this.xb = x;
				this.yb = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla13(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		yk = (-2.5) * KNORM + 1;
		if (NNORM < 0.5) {
			yn = (2.5) * (NNORM - 0.1);
		} else {
			yn = (-2.5) * (NNORM - 0.9);
		}
		if (PNORM < 0.5) {
			yp = (2.5) * (PNORM - 0.1);
		} else {
			yp = (-2.5) * (PNORM - 0.9);
		}

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla14(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		if (KNORM < 0.5) {
			yk = (2.5) * (KNORM - 0.1);
		} else {
			yk = (-2.5) * (KNORM - 0.9);
		}
		if (NNORM < 0.5) {
			yn = (2.5) * (NNORM - 0.1);
		} else {
			yn = (-2.5) * (NNORM - 0.9);
		}
		if (PNORM < 0.5) {
			yp = (2.5) * (PNORM - 0.1);
		} else {
			yp = (-2.5) * (PNORM - 0.9);
		}

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla15(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		yk = (2.5) * (KNORM - 0.6);

		if (NNORM < 0.5) {
			yn = (2.5) * (NNORM - 0.1);
		} else {
			yn = (-2.5) * (NNORM - 0.9);
		}
		if (PNORM < 0.5) {
			yp = (2.5) * (PNORM - 0.1);
		} else {
			yp = (-2.5) * (PNORM - 0.9);
		}

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla16(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		yn = (2.5) * (NNORM - 0.6);
		if (PNORM < 0.5) {
			yp = (2.5) * (PNORM - 0.1);
		} else {
			yp = (-2.5) * (PNORM - 0.9);
		}

		yk = (-2.5) * KNORM + 1;
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla17(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		yn = (2.5) * (NNORM - 0.6);

		if (KNORM < 0.5) {
			yk = (2.5) * (KNORM - 0.1);
		} else {
			yk = (-2.5) * (KNORM - 0.9);
		}
		if (PNORM < 0.5) {
			yp = (2.5) * (PNORM - 0.1);
		} else {
			yp = (-2.5) * (PNORM - 0.9);
		}

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla18(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		yk = (2.5) * (KNORM - 0.6);

		yn = (2.5) * (NNORM - 0.6);

		if (PNORM < 0.5) {
			yp = (2.5) * (PNORM - 0.1);
		} else {
			yp = (-2.5) * (PNORM - 0.9);
		}
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = 40 * y + 60;
			Ar = y * (100 - x);
			At = ((x - 60) * y) / 2;
			Area = Ar + At;
			this.Aa = Area;
			this.xa = x;
			this.ya = y;
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla19(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		yp = (2.5) * (PNORM - 0.6);

		yk = (-2.5) * KNORM + 1;

		yn = (-2.5) * NNORM + 1;
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = -(y - 1) / (0.025);
			Ar = y * x;
			At = ((40 - x) * y) / 2;
			Area = Ar + At;
			if (this.Ab < Area) {
				this.Ab = Area;
				this.xb = x;
				this.yb = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla20(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		if (KNORM < 0.5) {
			yk = (2.5) * (KNORM - 0.1);
		} else {
			yk = (-2.5) * (KNORM - 0.9);
		}
		yn = (-2.5) * NNORM + 1;
		yp = (2.5) * (PNORM - 0.6);

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = -(y - 1) / (0.025);
			Ar = y * x;
			At = ((40 - x) * y) / 2;
			Area = Ar + At;
			if (this.Ab < Area) {
				this.Ab = Area;
				this.xb = x;
				this.yb = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla21(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		yk = (2.5) * (KNORM - 0.6);
		yn = (-2.5) * NNORM + 1;
		yp = (2.5) * (PNORM - 0.6);

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = -(y - 1) / (0.025);
			Ar = y * x;
			At = ((40 - x) * y) / 2;
			Area = Ar + At;
			if (this.Ab < Area) {
				this.Ab = Area;
				this.xb = x;
				this.yb = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla22(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		yk = (-2.5) * KNORM + 1;
		yp = (2.5) * (PNORM - 0.6);
		if (NNORM < 0.5) {
			yn = (2.5) * (NNORM - 0.1);
		} else {
			yn = (-2.5) * (NNORM - 0.9);
		}

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla23(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		if (KNORM < 0.5) {
			yk = (2.5) * (KNORM - 0.1);
		} else {
			yk = (-2.5) * (KNORM - 0.9);
		}
		if (NNORM < 0.5) {
			yn = (2.5) * (NNORM - 0.1);
		} else {
			yn = (-2.5) * (NNORM - 0.9);
		}

		yp = (2.5) * (PNORM - 0.6);
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla24(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		yk = (2.5) * (KNORM - 0.6);
		yp = (2.5) * (PNORM - 0.6);
		if (NNORM < 0.5) {
			yn = (2.5) * (NNORM - 0.1);
		} else {
			yn = (-2.5) * (NNORM - 0.9);
		}

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla25(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x1;
		double x2;
		double Ar;
		double At1;
		double At2;

		yk = (-2.5) * KNORM + 1;
		yp = (2.5) * (PNORM - 0.6);
		yn = (2.5) * (NNORM - 0.6);

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x1 = (40 * y) + 10;
			x2 = (-40 * y) + 90;
			//System.out.println("x1= " + x1 + " x2= " + x2 + " y=" + y);
			Ar = y * (x2 - x1);
			At1 = ((x1 - 10) * y) / 2;
			At2 = ((90 - x2) * y) / 2;
			Area = Ar + At1 + At2;
			if (this.Am < Area) {
				this.Am = Area;
				this.xm1 = x1;
				this.xm2 = x2;
				this.ym = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla26(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		yp = (2.5) * (PNORM - 0.6);

		yn = (2.5) * (NNORM - 0.6);

		if (KNORM < 0.5) {
			yk = (2.5) * (KNORM - 0.1);
		} else {
			yk = (-2.5) * (KNORM - 0.9);
		}
		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = 40 * y + 60;
			Ar = y * (100 - x);
			At = ((x - 60) * y) / 2;
			Area = Ar + At;
			if (this.Aa < Area) {
				this.Aa = Area;
				this.xa = x;
				this.ya = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double regla27(double KNORM, double NNORM, double PNORM) {
		double Area;
		double yk;
		double yn;
		double yp;
		double y;
		double x;
		double Ar;
		double At;

		yp = (2.5) * (PNORM - 0.6);

		yn = (2.5) * (NNORM - 0.6);

		yk = (2.5) * (KNORM - 0.6);

		//System.out.println("yk= " + yk + " yn= " + yn + " yp= " + yp);
		if (yk >= 0 && yn >= 0 && yp >= 0) {
			if (yk < yn) {
				if (yk < yp) {
					y = yk;
				} else {
					y = yp;
				}
			} else {
				if (yn < yp) {
					y = yn;
				} else {
					y = yp;
				}
			}

			x = 40 * y + 60;
			Ar = y * (100 - x);
			At = ((x - 60) * y) / 2;
			Area = Ar + At;
			if (this.Aa < Area) {
				this.Aa = Area;
				this.xa = x;
				this.ya = y;
			}
		} else {
			Area = 0;
		}
		//System.out.println(Area);
		return Area;
	}

	public double logFuzzy(double KNORM, double NNORM, double PNORM) {
		regla1(KNORM, NNORM, PNORM);
		regla2(KNORM, NNORM, PNORM);
		regla3(KNORM, NNORM, PNORM);
		regla4(KNORM, NNORM, PNORM);
		regla5(KNORM, NNORM, PNORM);
		regla6(KNORM, NNORM, PNORM);
		regla7(KNORM, NNORM, PNORM);
		regla8(KNORM, NNORM, PNORM);
		regla9(KNORM, NNORM, PNORM);
		regla10(KNORM, NNORM, PNORM);
		regla11(KNORM, NNORM, PNORM);
		regla12(KNORM, NNORM, PNORM);
		regla13(KNORM, NNORM, PNORM);
		regla14(KNORM, NNORM, PNORM);
		regla15(KNORM, NNORM, PNORM);
		regla16(KNORM, NNORM, PNORM);
		regla17(KNORM, NNORM, PNORM);
		regla18(KNORM, NNORM, PNORM);
		regla19(KNORM, NNORM, PNORM);
		regla20(KNORM, NNORM, PNORM);
		regla21(KNORM, NNORM, PNORM);
		regla22(KNORM, NNORM, PNORM);
		regla23(KNORM, NNORM, PNORM);
		regla24(KNORM, NNORM, PNORM);
		regla25(KNORM, NNORM, PNORM);
		regla26(KNORM, NNORM, PNORM);
		regla27(KNORM, NNORM, PNORM);
		if(this.Ab>0 && this.Am>0 && this.Aa==0) {
			if(this.yb==this.ym) {
				var A1=this.xm2*this.ym;
				var A2=((90-this.xm2)*this.ym)/2;
				var x1=this.xm2/2;
				var x2=this.xm2+((90-this.xm2)/3);
				this.xc=((x1*A1)+(x2*A2))/(A1+A2);
			}else {
				if(this.yb>this.ym) {
					var A1=this.xb*this.yb;
					var A2=((40-this.xb)*this.yb)/2;
					var aux1=(this.ym-1)/(-0.025);
					var A3=((40-aux1)*(this.ym))/2;
					var A4=(this.xm2-40)*this.ym;
					var A5=((90-this.xm2)*this.ym)/2;
					
					
					var x1=this.xb/2;
					var x2=this.xb+((40-this.xb)/3);
					var x3=aux1+((40-aux1)/3);
					var x4=40+((this.xm2-40)/2);
					var x5=90-((90-this.xm2)/3);
					//System.out.println("A1= "+A1+" A2= "+A2+" A3= "+A3+" A4= "+A4);
					//System.out.println("x1= "+x1+" x2= "+x2+" x3= "+x3+" x4= "+x4);
					this.xc=((x1*A1)+(x2*A2)+(x3*A3)+(x4*A4)+(x5*A5))/(A1+A2+A3+A4+A5);
					
				}else {
					var A1=10*this.yb;
					var aux1=(this.yb/(0.025))+10;
					var A2=((aux1-10)*this.yb)/2;
					var aux2=90-this.xm2;
					var aux3=(2*(this.xm2-50))*this.ym;
					var aux4=(aux2*this.ym)/2;
					var A3=aux3+(2*aux4);
					
					var x1=5;
					var x2=10+((aux1-10)/3);
					var x3=50;
					
					//System.out.println("A1= "+A1+" A2= "+A2+" A3= "+A3);
					//System.out.println("x1= "+x1+" x2= "+x2+" x3= "+x3);
					this.xc=((x1*A1)+(x2*A2)+(x3*A3))/(A1+A2+A3);
				}
			}
		}else {
			if(this.Am>0 && this.Aa>0 && this.Ab==0) {
				if(this.ym==this.ya) {
					var A1=((this.xm1-10)*this.ym)/2;
					var A2=(100-this.xm1)*this.ym;
					var x1=(10+(this.xm1-10)/3);
					var x2=this.xm1+((100-this.xm1)/2);
					//System.out.println("A1= "+A1+" A2= "+A2);
					//System.out.println("x1= "+x1+" x2= "+x2);
					this.xc=((x1*A1)+(x2*A2))/(A1+A2);
				}else {
					if(this.ym>this.ya) {
						var A1=10*this.ya;
						var aux1=(this.ya/(-0.025))+90;
						var A2=((90-aux1)*this.ya)/2;
						var aux2=90-this.xm2;
						var aux3=(2*(this.xm2-50))*this.ym;
						var aux4=(aux2*this.ym)/2;
						var A3=aux3+(2*aux4);
						
						var x1=95;
						var x2=90-((90-aux1)/3);
						var x3=50;
						
						//System.out.println("A1= "+A1+" A2= "+A2+" A3= "+A3);
						//System.out.println("x1= "+x1+" x2= "+x2+" x3= "+x3);
						this.xc=((x1*A1)+(x2*A2)+(x3*A3))/(A1+A2+A3);
					}else {
						var A1=((this.xm1-10)*this.ym)/2;
						var A2=(60-this.xm1)*this.ym;
						var aux1=(this.ym/0.025)+60;
						var A3=((aux1-60)*(this.ym))/2;
						var A4=((this.xa-60)*this.ya)/2;
						var A5=(100-this.xa)*this.ya;
						
						
						var x1=this.xm1-((this.xm1-10)/3);
						var x2=this.xm1+((60-this.xm1)/2);
						var x3=aux1-((aux1-60)/3);
						var x4=this.xa-((this.xa-60)/3);
						var x5=this.xa+((100-this.xa)/2);
						//System.out.println("A1= "+A1+" A2= "+A2+" A3= "+A3+" A4= "+A4+" A5= "+A5);
						//System.out.println("x1= "+x1+" x2= "+x2+" x3= "+x3+" x4= "+x4+" x5= "+x5);
						this.xc=((x1*A1)+(x2*A2)+(x3*A3)+(x4*A4)+(x5*A5))/(A1+A2+A3+A4+A5);
					}
				}
			}else {
				if(this.Aa==0 && this.Am==0) {
					if(this.yb==1) {
						this.xc=xb/3;
					}else {
						var A1=this.xb*this.yb;
						var A2=((40-this.xb)*this.yb)/2;
						var x1=this.xb/2;
						var x2=this.xb+((40-this.xb)/3);
					
						this.xc=(x1*A1+x2*A2)/(A1+A2);
					
					}
				}else {
					if(this.Am==0 && this.Ab==0) {
						if(this.ya==1) {
							this.xc=86.44632;
						}else {
							var A1=((this.xa-60)*this.ya)/2;
							var A2=(100-this.xa)*this.ya;
							var x1=100-((100-this.xa)/3);
							var x2=60+(100-this.xa);
							this.xc=(x1*A1+x2*A2)/(A1+A2);
						}
					}else {
						if(this.Aa==0 && this.Ab==0) {
							this.xc=50;
						}
					}
				}
			}	
		}
		
		//System. out. println("Area Alto= "+this.Aa+" Area Media= "+this.Am+" Area bajo= "+this.Ab);
		//System. out. println("xb= "+this.xb+" yb= "+this.yb+" xm1= "+this.xm1+" xm2= "+this.xm2+" ym= "+this.ym+" xa= "+this.xa+" ya= "+this.ya);
		return this.xc;
		
	}

}
