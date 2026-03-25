package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BV<I, O> {
    public final C5032Cc<I, O> AEQbTJ;
    public final C5033Cd AYXKKw;
    public BH<I> AhwBna;
    public BB<O> EZpvd;
    public java.lang.String KWHzl;
    public final DT OLrzqt;
    public final InterfaceC56551yJo<?> copydefault;
    public java.lang.String djBIcL;
    public final InterfaceC56551yJo<?> gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5032Cc<I, O> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5033Cd EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(BH<I> bh) {
        this.AhwBna = bh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(BB<O> bb) {
        this.EZpvd = bb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DT copydefault() {
        return this.OLrzqt;
    }

    public BV(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo, @NotNull InterfaceC56551yJo<?> interfaceC56551yJo2) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo2, "");
        this.copydefault = interfaceC56551yJo;
        this.gEmmrt = interfaceC56551yJo2;
        this.AYXKKw = new C5033Cd();
        this.AEQbTJ = new C5032Cc<>();
        this.OLrzqt = new DT();
    }

    public final BY<I, O> OLrzqt() {
        BH<I> bh = this.AhwBna;
        if (bh == null) {
            throw new java.lang.IllegalArgumentException("SdkHttpOperation.serializer must not be null".toString());
        }
        BB<O> bb = this.EZpvd;
        if (bb == null) {
            throw new java.lang.IllegalArgumentException("SdkHttpOperation.deserializer must not be null".toString());
        }
        if (this.djBIcL == null) {
            throw new java.lang.IllegalArgumentException("operationName is a required HTTP execution attribute".toString());
        }
        if (this.valueOf == null) {
            throw new java.lang.IllegalArgumentException("serviceName is a required HTTP execution attribute".toString());
        }
        DT dt = this.OLrzqt;
        C57578yl c57578yl = C57578yl.EZpvd;
        C57737yo<java.lang.String> c57737yoCopydefault = c57578yl.copydefault();
        java.lang.String str = this.djBIcL;
        Intrinsics.copydefault((java.lang.Object) str);
        dt.OLrzqt(c57737yoCopydefault, str);
        DT dt2 = this.OLrzqt;
        C57737yo<java.lang.String> c57737yoOLrzqt = c57578yl.OLrzqt();
        java.lang.String str2 = this.valueOf;
        Intrinsics.copydefault((java.lang.Object) str2);
        dt2.OLrzqt(c57737yoOLrzqt, str2);
        java.lang.String str3 = this.KWHzl;
        if (str3 != null) {
            this.OLrzqt.OLrzqt(BC.copydefault.AEQbTJ(), str3);
        }
        return new BY<>(this.AEQbTJ, this.OLrzqt, bh, bb, new BW(this.copydefault, this.gEmmrt), this.AYXKKw);
    }
}
