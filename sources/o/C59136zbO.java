package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.zbO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59136zbO implements Function0 {
    public final C59127zbF AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59136zbO(C59127zbF c59127zbF) {
        this.AEQbTJ = c59127zbF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C59127zbF.isConnected(this.AEQbTJ);
    }
}
