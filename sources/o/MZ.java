package o;

import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public class MZ {
    public MX OLrzqt;

    public MZ(android.content.Context context, InterfaceC5318Nc interfaceC5318Nc) {
        MX mx = new MX(2);
        this.OLrzqt = mx;
        mx.KWHzl = context;
        mx.djSkpj = interfaceC5318Nc;
    }

    public MZ KWHzl(boolean[] zArr) {
        this.OLrzqt.UeEOUB = zArr;
        return this;
    }

    public MZ AEQbTJ(android.view.ViewGroup viewGroup) {
        this.OLrzqt.fetchVPNInfo = viewGroup;
        return this;
    }

    public MZ OLrzqt(int i) {
        this.OLrzqt.AEQbTJ = i;
        return this;
    }

    public MZ KWHzl(int i) {
        this.OLrzqt.RJOkX = i;
        return this;
    }

    public MZ copydefault(int i) {
        this.OLrzqt.uzCIH = i;
        return this;
    }

    public MZ copydefault(Calendar calendar) {
        this.OLrzqt.AkhnZx = calendar;
        return this;
    }

    public MZ AEQbTJ(int i, MY my) {
        MX mx = this.OLrzqt;
        mx.zLjUOn = i;
        mx.AYXKKw = my;
        return this;
    }

    public MZ KWHzl(Calendar calendar, Calendar calendar2) {
        MX mx = this.OLrzqt;
        mx.sSMYrx = calendar;
        mx.DbNXlk = calendar2;
        return this;
    }

    public MZ copydefault(float f) {
        this.OLrzqt.AwvSrB = f;
        return this;
    }

    public MZ EZpvd(@androidx.annotation.ColorInt int i) {
        this.OLrzqt.isConnected = i;
        return this;
    }

    public MZ AEQbTJ(@androidx.annotation.ColorInt int i) {
        this.OLrzqt.ORxRYg = i;
        return this;
    }

    public MZ AYXKKw(@androidx.annotation.ColorInt int i) {
        this.OLrzqt.QOLQEE = i;
        return this;
    }

    public MZ KWHzl(boolean z) {
        this.OLrzqt.gEmmrt = z;
        return this;
    }

    public MZ EZpvd(boolean z) {
        this.OLrzqt.OLrzqt = z;
        return this;
    }

    public MZ EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        MX mx = this.OLrzqt;
        mx.AuCTelauCTel = str;
        mx.AubY = str2;
        mx.iwGUEr = str3;
        mx.hDKMBd = str4;
        mx.zsXlph = str5;
        mx.wlaJM = str6;
        return this;
    }

    public MZ copydefault(int i, int i2, int i3, int i4, int i5, int i6) {
        MX mx = this.OLrzqt;
        mx.dvKsVJ = i;
        mx.finit = i2;
        mx.aKErDB = i3;
        mx.fFgQHt = i4;
        mx.fZBcTu = i5;
        mx.dxcTrN = i6;
        return this;
    }

    public MZ OLrzqt(boolean z) {
        this.OLrzqt.fJNWhG = z;
        return this;
    }

    public MZ copydefault(InterfaceC5319Nd interfaceC5319Nd) {
        this.OLrzqt.dNCPSb = interfaceC5319Nd;
        return this;
    }

    public ViewOnClickListenerC5326Nk EZpvd() {
        return new ViewOnClickListenerC5326Nk(this.OLrzqt);
    }
}
