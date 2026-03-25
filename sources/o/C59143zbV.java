package o;

import kotlin.jvm.functions.Function1;
import o.C59127zbF;

/* JADX INFO: renamed from: o.zbV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59143zbV implements Function1 {
    public final C59127zbF AEQbTJ;
    public final C59127zbF.Application OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59143zbV(C59127zbF.Application application, C59127zbF c59127zbF) {
        this.OLrzqt = application;
        this.AEQbTJ = c59127zbF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return C59127zbF.Application.OLrzqt(this.OLrzqt, this.AEQbTJ, (C56935yXu) obj);
    }
}
