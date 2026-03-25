package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.zdJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59237zdJ implements Function1 {
    public final java.util.List AEQbTJ;
    public final InterfaceC59098zad EZpvd;
    public final boolean KWHzl;
    public final InterfaceC59315zei OLrzqt;
    public final C59308zeb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59237zdJ(InterfaceC59315zei interfaceC59315zei, java.util.List list, C59308zeb c59308zeb, boolean z, InterfaceC59098zad interfaceC59098zad) {
        this.OLrzqt = interfaceC59315zei;
        this.AEQbTJ = list;
        this.copydefault = c59308zeb;
        this.KWHzl = z;
        this.EZpvd = interfaceC59098zad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return C59231zdD.KWHzl(this.OLrzqt, this.AEQbTJ, this.copydefault, this.KWHzl, this.EZpvd, (AbstractC59287zeG) obj);
    }
}
