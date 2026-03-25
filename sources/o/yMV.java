package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;

/* JADX INFO: loaded from: classes13.dex */
public class yMV implements Function0 {
    public final yNP KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yMV(yNP ynp, boolean z) {
        this.KWHzl = ynp;
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return JvmBuiltIns.KWHzl(this.KWHzl, this.OLrzqt);
    }
}
