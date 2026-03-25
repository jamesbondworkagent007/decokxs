package o;

import com.okinc.localization2.bean.AppLocaleInfo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pSN implements pSI {
    public AppLocaleInfo AEQbTJ;
    public java.lang.String copydefault = "";
    public java.lang.String EZpvd = "";
    public java.util.Map<java.lang.String, java.lang.String> djBIcL = new java.util.HashMap(51200);
    public java.util.Map<java.lang.String, java.lang.String> KWHzl = new java.util.HashMap(128);
    public java.util.Map<java.lang.String, java.lang.String[]> AYXKKw = C56424yEw.KWHzl();
    public java.util.Map<java.lang.String, java.lang.String> gEmmrt = new java.util.HashMap(51200);
    public java.util.Map<java.lang.String, java.lang.String> OLrzqt = new java.util.HashMap(128);
    public java.util.Map<java.lang.String, java.lang.String[]> AhwBna = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pSI
    public java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pSI
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, AppLocaleInfo appLocaleInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = appLocaleInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pSI
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AppLocaleInfo valueOf() {
        return this.AEQbTJ;
    }

    @Override // o.pSI
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.gEmmrt.put(str, str2);
    }

    @Override // o.pSI
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt.put(str, str2);
    }

    @Override // o.pSI
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        this.AhwBna.put(str, strArr);
    }

    @Override // o.pSI
    public java.lang.CharSequence OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.djBIcL.get(str);
    }

    @Override // o.pSI
    public java.lang.CharSequence EZpvd(@NotNull java.lang.String str, int i, java.util.Map<java.lang.Object, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.KWHzl.get(str);
        if (str2 != null) {
            return pSL.KWHzl(str2, str, i, map);
        }
        return null;
    }

    @Override // o.pSI
    public java.lang.CharSequence[] AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String[] strArr = this.AYXKKw.get(str);
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str2 : strArr) {
            arrayList.add(str2);
        }
        return (java.lang.CharSequence[]) arrayList.toArray(new java.lang.CharSequence[0]);
    }

    public void AYXKKw() {
        this.gEmmrt = new java.util.HashMap(51200);
        this.AhwBna = new LinkedHashMap();
        this.OLrzqt = new java.util.HashMap(128);
    }

    @Override // o.pSI
    public void AEQbTJ() {
        synchronized (this) {
            this.djBIcL = this.gEmmrt;
            this.AYXKKw = this.AhwBna;
            this.KWHzl = this.OLrzqt;
            AYXKKw();
        }
    }

    @Override // o.pSI
    public void copydefault() {
        synchronized (this) {
            EZpvd();
            AEQbTJ();
            KWHzl("", "", null);
        }
    }

    @Override // o.pSI
    public void EZpvd() {
        synchronized (this) {
            this.gEmmrt.clear();
            this.AhwBna.clear();
            this.OLrzqt.clear();
        }
    }

    public final java.lang.String AhwBna() {
        return "textCache=" + this.djBIcL.size() + ",textTmp=" + this.gEmmrt.size() + ",quantityTextCache=" + this.KWHzl.size() + ",quantityTextTmp=" + this.OLrzqt.size();
    }
}
