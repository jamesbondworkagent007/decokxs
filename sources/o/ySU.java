package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class ySU implements Function1 {
    public final InterfaceC56687yOp AEQbTJ;
    public final ySM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ySU(InterfaceC56687yOp interfaceC56687yOp, ySM ysm) {
        this.AEQbTJ = interfaceC56687yOp;
        this.copydefault = ysm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return ySM.copydefault(this.AEQbTJ, this.copydefault, (C56935yXu) obj);
    }
}
