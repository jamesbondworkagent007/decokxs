package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class yLI implements Function0 {
    public final InterfaceC56387yDm AEQbTJ;
    public final yLJ OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yLI(yLJ ylj, int i, InterfaceC56387yDm interfaceC56387yDm) {
        this.OLrzqt = ylj;
        this.copydefault = i;
        this.AEQbTJ = interfaceC56387yDm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return yLJ.copydefault(this.OLrzqt, this.copydefault, this.AEQbTJ);
    }
}
