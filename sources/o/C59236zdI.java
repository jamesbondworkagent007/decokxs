package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.zdI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59236zdI implements Function1 {
    public final InterfaceC59315zei AEQbTJ;
    public final boolean EZpvd;
    public final java.util.List OLrzqt;
    public final C59308zeb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59236zdI(InterfaceC59315zei interfaceC59315zei, java.util.List list, C59308zeb c59308zeb, boolean z) {
        this.AEQbTJ = interfaceC59315zei;
        this.OLrzqt = list;
        this.copydefault = c59308zeb;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return C59231zdD.EZpvd(this.AEQbTJ, this.OLrzqt, this.copydefault, this.EZpvd, (AbstractC59287zeG) obj);
    }
}
