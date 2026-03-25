package com.caverock.androidsvg;

/* JADX INFO: loaded from: classes2.dex */
public class PreserveAspectRatio {
    public static final PreserveAspectRatio AEQbTJ;
    public static final PreserveAspectRatio AhwBna;
    public static final PreserveAspectRatio EZpvd;
    public static final PreserveAspectRatio KWHzl;
    public static final PreserveAspectRatio OLrzqt;
    public static final PreserveAspectRatio copydefault;
    public static final PreserveAspectRatio djBIcL;
    public Scale fetchVPNInfo;
    public Alignment gEmmrt;
    public static final PreserveAspectRatio valueOf = new PreserveAspectRatio(null, null);
    public static final PreserveAspectRatio AYXKKw = new PreserveAspectRatio(Alignment.none, null);

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum Scale {
        meet,
        slice
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Scale AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Alignment copydefault() {
        return this.gEmmrt;
    }

    static {
        Alignment alignment = Alignment.xMidYMid;
        Scale scale = Scale.meet;
        AEQbTJ = new PreserveAspectRatio(alignment, scale);
        Alignment alignment2 = Alignment.xMinYMin;
        djBIcL = new PreserveAspectRatio(alignment2, scale);
        copydefault = new PreserveAspectRatio(Alignment.xMaxYMax, scale);
        AhwBna = new PreserveAspectRatio(Alignment.xMidYMin, scale);
        EZpvd = new PreserveAspectRatio(Alignment.xMidYMax, scale);
        Scale scale2 = Scale.slice;
        OLrzqt = new PreserveAspectRatio(alignment, scale2);
        KWHzl = new PreserveAspectRatio(alignment2, scale2);
    }

    public PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.gEmmrt = alignment;
        this.fetchVPNInfo = scale;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.gEmmrt == preserveAspectRatio.gEmmrt && this.fetchVPNInfo == preserveAspectRatio.fetchVPNInfo;
    }

    public String toString() {
        return this.gEmmrt + " " + this.fetchVPNInfo;
    }
}
