package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class yTJ implements Function1 {
    public final AbstractC59242zdO AEQbTJ;
    public final yTB KWHzl;
    public final InterfaceC56658yNn OLrzqt;
    public final C56829yTw copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yTJ(InterfaceC56658yNn interfaceC56658yNn, yTB ytb, AbstractC59242zdO abstractC59242zdO, C56829yTw c56829yTw) {
        this.OLrzqt = interfaceC56658yNn;
        this.KWHzl = ytb;
        this.AEQbTJ = abstractC59242zdO;
        this.copydefault = c56829yTw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return yTB.AEQbTJ(this.OLrzqt, this.KWHzl, this.AEQbTJ, this.copydefault, (AbstractC59287zeG) obj);
    }
}
