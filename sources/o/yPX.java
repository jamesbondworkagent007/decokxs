package o;

import kotlin.jvm.functions.Function0;
import o.yPP;

/* JADX INFO: loaded from: classes13.dex */
public class yPX implements Function0 {
    public final yPP.Application EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yPX(yPP.Application application) {
        this.EZpvd = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return yPP.Application.copydefault(this.EZpvd);
    }
}
