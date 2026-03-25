package o;

import kotlin.jvm.functions.Function1;
import o.C56884yVx;

/* JADX INFO: renamed from: o.yVb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56862yVb implements Function1 {
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56862yVb(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return yUC.getNewProxyInstance(this.OLrzqt, (C56884yVx.Activity.TaskDescription) obj);
    }
}
