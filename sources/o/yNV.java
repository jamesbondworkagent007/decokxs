package o;

import kotlin.jvm.functions.Function1;
import o.yNO;

/* JADX INFO: loaded from: classes13.dex */
public class yNV implements Function1 {
    public final yNO AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yNV(yNO yno) {
        this.AEQbTJ = yno;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return yNO.AEQbTJ(this.AEQbTJ, (yNO.TaskDescription) obj);
    }
}
