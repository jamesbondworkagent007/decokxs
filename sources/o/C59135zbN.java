package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.zbN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59135zbN implements Function0 {
    public final C59127zbF EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59135zbN(C59127zbF c59127zbF) {
        this.EZpvd = c59127zbF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C59127zbF.fetchVPNInfo(this.EZpvd);
    }
}
