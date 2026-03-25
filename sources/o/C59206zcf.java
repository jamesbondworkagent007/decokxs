package o;

import kotlin.jvm.functions.Function0;
import o.AbstractC59147zbZ;

/* JADX INFO: renamed from: o.zcf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59206zcf implements Function0 {
    public final AbstractC59147zbZ.Application OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59206zcf(AbstractC59147zbZ.Application application) {
        this.OLrzqt = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return AbstractC59147zbZ.Application.fetchVPNInfo(this.OLrzqt);
    }
}
