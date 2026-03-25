package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: o.rlo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43255rlo implements InterfaceC43261rlu {
    public Function2<? super java.lang.String, ? super java.lang.Long, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Long, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.Long, kotlin.Unit> */
    public Function2<java.lang.String, java.lang.Long, Unit> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43261rlu
    public void setCallback(Function2<? super java.lang.String, ? super java.lang.Long, Unit> function2) {
        this.AEQbTJ = function2;
    }
}
