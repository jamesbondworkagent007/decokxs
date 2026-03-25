package o;

import kotlin.jvm.functions.Function1;
import o.C56884yVx;

/* JADX INFO: loaded from: classes13.dex */
public class yUW implements Function1 {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yUW(java.lang.String str, java.lang.String str2) {
        this.AEQbTJ = str;
        this.EZpvd = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return yUC.copydefault(this.AEQbTJ, this.EZpvd, (C56884yVx.Activity.TaskDescription) obj);
    }
}
