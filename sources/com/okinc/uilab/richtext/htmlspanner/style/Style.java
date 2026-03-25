package com.okinc.uilab.richtext.htmlspanner.style;

import o.C55130xeD;

/* JADX INFO: loaded from: classes11.dex */
public class Style {
    public final BorderStyle AEQbTJ;
    public final StyleValue AYXKKw;
    public final C55130xeD AhwBna;
    public final StyleValue AkhnZx;
    public final StyleValue DbNXlk;
    public final Integer EZpvd;
    public final Integer KWHzl;
    public final Integer OLrzqt;
    public final StyleValue copydefault;
    public final DisplayStyle djBIcL;
    public final StyleValue fJNWhG;
    public final StyleValue fetchVPNInfo;
    public final FontStyle gEmmrt;
    public final StyleValue isConnected;
    public final FontWeight valueOf;
    public final TextAlignment values;

    public enum BorderStyle {
        SOLID,
        DASHED,
        DOTTED,
        DOUBLE
    }

    public enum DisplayStyle {
        BLOCK,
        INLINE
    }

    public enum FontStyle {
        NORMAL,
        ITALIC
    }

    public enum FontWeight {
        NORMAL,
        BOLD
    }

    public enum TextAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FontWeight AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55130xeD AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StyleValue AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StyleValue DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BorderStyle KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StyleValue copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FontStyle djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StyleValue fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StyleValue gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StyleValue isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DisplayStyle valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TextAlignment values() {
        return this.values;
    }

    public Style() {
        this.AhwBna = null;
        this.values = null;
        this.AYXKKw = null;
        this.valueOf = null;
        this.gEmmrt = null;
        this.EZpvd = null;
        this.OLrzqt = null;
        this.djBIcL = null;
        this.AkhnZx = null;
        this.fJNWhG = null;
        this.fetchVPNInfo = null;
        this.DbNXlk = null;
        this.isConnected = null;
        this.KWHzl = null;
        this.AEQbTJ = null;
        this.copydefault = null;
    }

    public Style(C55130xeD c55130xeD, TextAlignment textAlignment, StyleValue styleValue, FontWeight fontWeight, FontStyle fontStyle, Integer num, Integer num2, DisplayStyle displayStyle, StyleValue styleValue2, StyleValue styleValue3, StyleValue styleValue4, StyleValue styleValue5, StyleValue styleValue6, Integer num3, BorderStyle borderStyle, StyleValue styleValue7) {
        this.AhwBna = c55130xeD;
        this.values = textAlignment;
        this.AYXKKw = styleValue;
        this.valueOf = fontWeight;
        this.gEmmrt = fontStyle;
        this.EZpvd = num;
        this.OLrzqt = num2;
        this.djBIcL = displayStyle;
        this.AkhnZx = styleValue3;
        this.fJNWhG = styleValue6;
        this.fetchVPNInfo = styleValue2;
        this.DbNXlk = styleValue4;
        this.isConnected = styleValue5;
        this.KWHzl = num3;
        this.copydefault = styleValue7;
        this.AEQbTJ = borderStyle;
    }

    public Style OLrzqt(C55130xeD c55130xeD) {
        return new Style(c55130xeD, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style EZpvd(TextAlignment textAlignment) {
        return new Style(this.AhwBna, textAlignment, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style copydefault(StyleValue styleValue) {
        return new Style(this.AhwBna, this.values, styleValue, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style KWHzl(FontWeight fontWeight) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, fontWeight, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style EZpvd(FontStyle fontStyle) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, fontStyle, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style copydefault(Integer num) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, num, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style EZpvd(Integer num) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, num, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style AEQbTJ(DisplayStyle displayStyle) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, displayStyle, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style OLrzqt(StyleValue styleValue) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, styleValue, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style AhwBna(StyleValue styleValue) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, styleValue, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style AEQbTJ(StyleValue styleValue) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, styleValue, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style KWHzl(StyleValue styleValue) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, styleValue, this.fJNWhG, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style valueOf(StyleValue styleValue) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, styleValue, this.KWHzl, this.AEQbTJ, this.copydefault);
    }

    public Style AEQbTJ(BorderStyle borderStyle) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, borderStyle, this.copydefault);
    }

    public Style AEQbTJ(Integer num) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, num, this.AEQbTJ, this.copydefault);
    }

    public Style EZpvd(StyleValue styleValue) {
        return new Style(this.AhwBna, this.values, this.AYXKKw, this.valueOf, this.gEmmrt, this.EZpvd, this.OLrzqt, this.djBIcL, this.fetchVPNInfo, this.AkhnZx, this.DbNXlk, this.isConnected, this.fJNWhG, this.KWHzl, this.AEQbTJ, styleValue);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        if (this.AhwBna != null) {
            sb.append("  font-family: " + this.AhwBna.copydefault() + "\n");
        }
        if (this.values != null) {
            sb.append("  text-alignment: " + this.values + "\n");
        }
        if (this.AYXKKw != null) {
            sb.append("  font-size: " + this.AYXKKw + "\n");
        }
        if (this.valueOf != null) {
            sb.append("  font-weight: " + this.valueOf + "\n");
        }
        if (this.gEmmrt != null) {
            sb.append("  font-style: " + this.gEmmrt + "\n");
        }
        if (this.EZpvd != null) {
            sb.append("  color: " + this.EZpvd + "\n");
        }
        if (this.OLrzqt != null) {
            sb.append("  background-color: " + this.OLrzqt + "\n");
        }
        if (this.djBIcL != null) {
            sb.append("  display: " + this.djBIcL + "\n");
        }
        if (this.fetchVPNInfo != null) {
            sb.append("  margin-top: " + this.fetchVPNInfo + "\n");
        }
        if (this.AkhnZx != null) {
            sb.append("  margin-bottom: " + this.AkhnZx + "\n");
        }
        if (this.DbNXlk != null) {
            sb.append("  margin-left: " + this.DbNXlk + "\n");
        }
        if (this.isConnected != null) {
            sb.append("  margin-right: " + this.isConnected + "\n");
        }
        if (this.fJNWhG != null) {
            sb.append("  text-indent: " + this.fJNWhG + "\n");
        }
        if (this.AEQbTJ != null) {
            sb.append("  border-style: " + this.AEQbTJ + "\n");
        }
        if (this.KWHzl != null) {
            sb.append("  border-color: " + this.KWHzl + "\n");
        }
        if (this.copydefault != null) {
            sb.append("  border-style: " + this.copydefault + "\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
