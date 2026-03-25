package com.okinc.uilab.richtext.htmlspanner.style;

/* JADX INFO: loaded from: classes11.dex */
public class StyleValue {
    public Float AEQbTJ;
    public Integer EZpvd;
    public Unit copydefault;

    public enum Unit {
        PX,
        EM,
        PERCENTAGE
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Unit copydefault() {
        return this.copydefault;
    }

    public static StyleValue copydefault(String str) {
        if (str.equals("0")) {
            return new StyleValue(0.0f, Unit.EM);
        }
        if (str.endsWith("px")) {
            try {
                return new StyleValue(Integer.valueOf(Integer.parseInt(str.substring(0, str.length() - 2))).intValue());
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (str.endsWith("%")) {
            try {
                return new StyleValue(Integer.parseInt(str.substring(0, str.length() - 1)) / 100.0f, Unit.PERCENTAGE);
            } catch (NumberFormatException unused2) {
                return null;
            }
        }
        if (str.endsWith("em")) {
            try {
                return new StyleValue(Float.valueOf(Float.parseFloat(str.substring(0, str.length() - 2))).floatValue(), Unit.EM);
            } catch (NumberFormatException unused3) {
            }
        }
        return null;
    }

    public StyleValue(int i) {
        this.copydefault = Unit.PX;
        this.EZpvd = Integer.valueOf(i);
    }

    public StyleValue(float f, Unit unit) {
        this.AEQbTJ = Float.valueOf(f);
        this.copydefault = unit;
    }

    public int KWHzl() {
        return this.EZpvd.intValue();
    }

    public float EZpvd() {
        return this.AEQbTJ.floatValue();
    }

    public String toString() {
        if (this.EZpvd != null) {
            return "" + this.EZpvd + this.copydefault;
        }
        return "" + this.AEQbTJ + this.copydefault;
    }
}
