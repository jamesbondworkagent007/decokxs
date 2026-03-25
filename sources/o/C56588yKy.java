package o;

import kotlin.jvm.functions.Function0;
import o.C56586yKw;

/* JADX INFO: renamed from: o.yKy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56588yKy implements Function0 {
    public final C56586yKw.StateListAnimator OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56588yKy(C56586yKw.StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C56586yKw.StateListAnimator.isConnected(this.OLrzqt);
    }
}
