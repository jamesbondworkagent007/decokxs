package o;

import kotlin.jvm.functions.Function1;
import o.C56807yTa;

/* JADX INFO: renamed from: o.yTd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56810yTd implements Function1 {
    public final C56807yTa KWHzl;
    public final C56794ySo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56810yTd(C56807yTa c56807yTa, C56794ySo c56794ySo) {
        this.KWHzl = c56807yTa;
        this.copydefault = c56794ySo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return C56807yTa.copydefault(this.KWHzl, this.copydefault, (C56807yTa.ActionBar) obj);
    }
}
