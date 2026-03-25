package o;

import kotlin.jvm.functions.Function1;
import o.C56884yVx;

/* JADX INFO: loaded from: classes13.dex */
public class yUT implements Function1 {
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yUT(java.lang.String str, java.lang.String str2) {
        this.copydefault = str;
        this.OLrzqt = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return yUC.OLrzqt(this.copydefault, this.OLrzqt, (C56884yVx.Activity.TaskDescription) obj);
    }
}
