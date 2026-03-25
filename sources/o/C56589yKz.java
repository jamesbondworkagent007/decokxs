package o;

import kotlin.jvm.functions.Function0;
import o.C56586yKw;

/* JADX INFO: renamed from: o.yKz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56589yKz implements Function0 {
    public final C56586yKw AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56589yKz(C56586yKw c56586yKw) {
        this.AEQbTJ = c56586yKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C56586yKw.StateListAnimator.isConnected(this.AEQbTJ);
    }
}
