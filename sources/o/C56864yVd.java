package o;

import kotlin.jvm.functions.Function1;
import o.C56884yVx;

/* JADX INFO: renamed from: o.yVd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56864yVd implements Function1 {
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56864yVd(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return yUC.AubY(this.copydefault, (C56884yVx.Activity.TaskDescription) obj);
    }
}
