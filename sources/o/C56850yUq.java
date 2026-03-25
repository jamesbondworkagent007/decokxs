package o;

import kotlin.jvm.functions.Function1;
import o.AbstractC56853yUt;

/* JADX INFO: renamed from: o.yUq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56850yUq implements Function1 {
    public final AbstractC56853yUt AEQbTJ;
    public final AbstractC56853yUt.Application copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56850yUq(AbstractC56853yUt abstractC56853yUt, AbstractC56853yUt.Application application) {
        this.AEQbTJ = abstractC56853yUt;
        this.copydefault = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(AbstractC56853yUt.AEQbTJ(this.AEQbTJ, this.copydefault, obj));
    }
}
