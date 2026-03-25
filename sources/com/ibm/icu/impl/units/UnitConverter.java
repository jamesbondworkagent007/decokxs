package com.ibm.icu.impl.units;

import com.ibm.icu.util.MeasureUnit;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import o.C7215afd;
import o.C7218afg;

/* JADX INFO: loaded from: classes3.dex */
public class UnitConverter {
    public BigDecimal AEQbTJ;
    public BigDecimal OLrzqt;

    public enum Convertibility {
        CONVERTIBLE,
        RECIPROCAL,
        UNCONVERTIBLE
    }

    public UnitConverter(MeasureUnitImpl measureUnitImpl, MeasureUnitImpl measureUnitImpl2, C7218afg c7218afg) {
        Convertibility convertibilityAEQbTJ = AEQbTJ(measureUnitImpl, measureUnitImpl2, c7218afg);
        ActionBar actionBarEZpvd = c7218afg.EZpvd(measureUnitImpl);
        ActionBar actionBarEZpvd2 = c7218afg.EZpvd(measureUnitImpl2);
        if (convertibilityAEQbTJ == Convertibility.CONVERTIBLE) {
            this.OLrzqt = actionBarEZpvd.KWHzl(actionBarEZpvd2).KWHzl();
        } else {
            this.OLrzqt = actionBarEZpvd.copydefault(actionBarEZpvd2).KWHzl();
        }
        this.AEQbTJ = c7218afg.copydefault(measureUnitImpl, measureUnitImpl2, actionBarEZpvd, actionBarEZpvd2, convertibilityAEQbTJ);
    }

    public static Convertibility AEQbTJ(MeasureUnitImpl measureUnitImpl, MeasureUnitImpl measureUnitImpl2, C7218afg c7218afg) {
        ArrayList<C7215afd> arrayListKWHzl = c7218afg.KWHzl(measureUnitImpl);
        ArrayList<C7215afd> arrayListKWHzl2 = c7218afg.KWHzl(measureUnitImpl2);
        HashMap map = new HashMap();
        OLrzqt(map, arrayListKWHzl, 1);
        OLrzqt(map, arrayListKWHzl2, -1);
        if (OLrzqt((HashMap<String, Integer>) map)) {
            return Convertibility.CONVERTIBLE;
        }
        OLrzqt(map, arrayListKWHzl2, 2);
        return OLrzqt((HashMap<String, Integer>) map) ? Convertibility.RECIPROCAL : Convertibility.UNCONVERTIBLE;
    }

    public static void OLrzqt(HashMap<String, Integer> map, ArrayList<C7215afd> arrayList, int i) {
        for (C7215afd c7215afd : arrayList) {
            if (map.containsKey(c7215afd.AYXKKw())) {
                map.put(c7215afd.AYXKKw(), Integer.valueOf(map.get(c7215afd.AYXKKw()).intValue() + (c7215afd.EZpvd() * i)));
            } else {
                map.put(c7215afd.AYXKKw(), Integer.valueOf(c7215afd.EZpvd() * i));
            }
        }
    }

    public static boolean OLrzqt(HashMap<String, Integer> map) {
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            if (!it.next().equals(0)) {
                return false;
            }
        }
        return true;
    }

    public BigDecimal AEQbTJ(BigDecimal bigDecimal) {
        return bigDecimal.multiply(this.OLrzqt).add(this.AEQbTJ);
    }

    public BigDecimal OLrzqt(BigDecimal bigDecimal) {
        return bigDecimal.subtract(this.AEQbTJ).divide(this.OLrzqt, MathContext.DECIMAL128);
    }

    public static class ActionBar {
        public int EZpvd = 0;
        public int AhwBna = 0;
        public int KWHzl = 0;
        public int OLrzqt = 0;
        public int AEQbTJ = 0;
        public int copydefault = 0;
        public BigDecimal valueOf = BigDecimal.valueOf(1L);
        public BigDecimal AYXKKw = BigDecimal.valueOf(1L);

        public static ActionBar KWHzl(String str) {
            String[] strArrSplit = str.replaceAll("\\s+", "").split("/");
            if (strArrSplit.length == 1) {
                return OLrzqt(strArrSplit[0]);
            }
            return OLrzqt(strArrSplit[0]).KWHzl(OLrzqt(strArrSplit[1]));
        }

        public static ActionBar OLrzqt(String str) {
            ActionBar actionBar = new ActionBar();
            for (String str2 : str.split(Pattern.quote("*"))) {
                actionBar.AEQbTJ(str2);
            }
            return actionBar;
        }

        public ActionBar OLrzqt() {
            ActionBar actionBar = new ActionBar();
            actionBar.valueOf = this.valueOf;
            actionBar.AYXKKw = this.AYXKKw;
            actionBar.EZpvd = this.EZpvd;
            actionBar.AhwBna = this.AhwBna;
            actionBar.KWHzl = this.KWHzl;
            actionBar.OLrzqt = this.OLrzqt;
            actionBar.AEQbTJ = this.AEQbTJ;
            actionBar.copydefault = this.copydefault;
            return actionBar;
        }

        public BigDecimal KWHzl() {
            ActionBar actionBarOLrzqt = OLrzqt();
            actionBarOLrzqt.KWHzl(new BigDecimal("0.3048"), this.EZpvd);
            BigDecimal bigDecimal = new BigDecimal("411557987.0");
            BigDecimal bigDecimal2 = new BigDecimal("131002976.0");
            MathContext mathContext = MathContext.DECIMAL128;
            actionBarOLrzqt.KWHzl(bigDecimal.divide(bigDecimal2, mathContext), this.AhwBna);
            actionBarOLrzqt.KWHzl(new BigDecimal("9.80665"), this.KWHzl);
            actionBarOLrzqt.KWHzl(new BigDecimal("6.67408E-11"), this.OLrzqt);
            actionBarOLrzqt.KWHzl(new BigDecimal("0.00454609"), this.AEQbTJ);
            actionBarOLrzqt.KWHzl(new BigDecimal("0.45359237"), this.copydefault);
            return actionBarOLrzqt.valueOf.divide(actionBarOLrzqt.AYXKKw, mathContext);
        }

        public final void KWHzl(BigDecimal bigDecimal, int i) {
            if (i == 0) {
                return;
            }
            BigDecimal bigDecimalPow = bigDecimal.pow(Math.abs(i), MathContext.DECIMAL128);
            if (i > 0) {
                this.valueOf = this.valueOf.multiply(bigDecimalPow);
            } else {
                this.AYXKKw = this.AYXKKw.multiply(bigDecimalPow);
            }
        }

        public ActionBar OLrzqt(MeasureUnit.SIPrefix sIPrefix) {
            ActionBar actionBarOLrzqt = OLrzqt();
            if (sIPrefix == MeasureUnit.SIPrefix.ONE) {
                return actionBarOLrzqt;
            }
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(Math.pow(10.0d, Math.abs(sIPrefix.getPower())));
            if (sIPrefix.getPower() < 0) {
                actionBarOLrzqt.AYXKKw = this.AYXKKw.multiply(bigDecimalValueOf);
                return actionBarOLrzqt;
            }
            actionBarOLrzqt.valueOf = this.valueOf.multiply(bigDecimalValueOf);
            return actionBarOLrzqt;
        }

        public ActionBar EZpvd(int i) {
            ActionBar actionBar = new ActionBar();
            if (i == 0) {
                return actionBar;
            }
            if (i > 0) {
                actionBar.valueOf = this.valueOf.pow(i);
                actionBar.AYXKKw = this.AYXKKw.pow(i);
            } else {
                int i2 = i * (-1);
                actionBar.valueOf = this.AYXKKw.pow(i2);
                actionBar.AYXKKw = this.valueOf.pow(i2);
            }
            actionBar.EZpvd = this.EZpvd * i;
            actionBar.AhwBna = this.AhwBna * i;
            actionBar.KWHzl = this.KWHzl * i;
            actionBar.OLrzqt = this.OLrzqt * i;
            actionBar.AEQbTJ = this.AEQbTJ * i;
            actionBar.copydefault = this.copydefault * i;
            return actionBar;
        }

        public ActionBar KWHzl(ActionBar actionBar) {
            ActionBar actionBar2 = new ActionBar();
            actionBar2.valueOf = this.valueOf.multiply(actionBar.AYXKKw);
            actionBar2.AYXKKw = this.AYXKKw.multiply(actionBar.valueOf);
            actionBar2.EZpvd = this.EZpvd - actionBar.EZpvd;
            actionBar2.AhwBna = this.AhwBna - actionBar.AhwBna;
            actionBar2.KWHzl = this.KWHzl - actionBar.KWHzl;
            actionBar2.OLrzqt = this.OLrzqt - actionBar.OLrzqt;
            actionBar2.AEQbTJ = this.AEQbTJ - actionBar.AEQbTJ;
            actionBar2.copydefault = this.copydefault - actionBar.copydefault;
            return actionBar2;
        }

        public ActionBar copydefault(ActionBar actionBar) {
            ActionBar actionBar2 = new ActionBar();
            actionBar2.valueOf = this.valueOf.multiply(actionBar.valueOf);
            actionBar2.AYXKKw = this.AYXKKw.multiply(actionBar.AYXKKw);
            actionBar2.EZpvd = this.EZpvd + actionBar.EZpvd;
            actionBar2.AhwBna = this.AhwBna + actionBar.AhwBna;
            actionBar2.KWHzl = this.KWHzl + actionBar.KWHzl;
            actionBar2.OLrzqt = this.OLrzqt + actionBar.OLrzqt;
            actionBar2.AEQbTJ = this.AEQbTJ + actionBar.AEQbTJ;
            actionBar2.copydefault = this.copydefault + actionBar.copydefault;
            return actionBar2;
        }

        public final void AEQbTJ(String str) {
            String[] strArrSplit = str.split(Pattern.quote("^"));
            KWHzl(strArrSplit[0], strArrSplit.length == 2 ? Integer.parseInt(strArrSplit[1]) : 1);
        }

        public final void KWHzl(String str, int i) {
            if ("ft_to_m".equals(str)) {
                this.EZpvd += i;
                return;
            }
            if ("ft2_to_m2".equals(str)) {
                this.EZpvd += i * 2;
                return;
            }
            if ("ft3_to_m3".equals(str)) {
                this.EZpvd += i * 3;
                return;
            }
            if ("in3_to_m3".equals(str)) {
                this.EZpvd += i * 3;
                this.AYXKKw = this.AYXKKw.multiply(BigDecimal.valueOf(Math.pow(12.0d, 3.0d)));
                return;
            }
            if ("gal_to_m3".equals(str)) {
                this.valueOf = this.valueOf.multiply(BigDecimal.valueOf(231L));
                this.EZpvd += i * 3;
                this.AYXKKw = this.AYXKKw.multiply(BigDecimal.valueOf(1728L));
                return;
            }
            if ("gal_imp_to_m3".equals(str)) {
                this.AEQbTJ += i;
                return;
            }
            if ("G".equals(str)) {
                this.OLrzqt += i;
                return;
            }
            if ("gravity".equals(str)) {
                this.KWHzl += i;
                return;
            }
            if ("lb_to_kg".equals(str)) {
                this.copydefault += i;
            } else if ("PI".equals(str)) {
                this.AhwBna += i;
            } else {
                this.valueOf = this.valueOf.multiply(new BigDecimal(str).pow(i, MathContext.DECIMAL128));
            }
        }
    }

    public String toString() {
        return "UnitConverter [conversionRate=" + this.OLrzqt + ", offset=" + this.AEQbTJ + "]";
    }
}
