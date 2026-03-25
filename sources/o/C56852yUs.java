package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.yUs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56852yUs implements Function1 {
    public final yVF AEQbTJ;
    public final C56857yUx[] EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56852yUs(yVF yvf, C56857yUx[] c56857yUxArr) {
        this.AEQbTJ = yvf;
        this.EZpvd = c56857yUxArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return AbstractC56853yUt.OLrzqt(this.AEQbTJ, this.EZpvd, ((java.lang.Number) obj).intValue());
    }
}
