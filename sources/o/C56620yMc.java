package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.yMc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56620yMc implements Function0 {
    public final java.lang.Class EZpvd;
    public final java.util.Map copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56620yMc(java.lang.Class cls, java.util.Map map) {
        this.EZpvd = cls;
        this.copydefault = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C56619yMb.copydefault(this.EZpvd, this.copydefault);
    }
}
