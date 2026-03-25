package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class yBN implements InterfaceC58227yxM {
    public final /* synthetic */ Function1 OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yBN(Function1 function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58227yxM
    public final /* synthetic */ void accept(java.lang.Object obj) {
        Intrinsics.AEQbTJ(this.OLrzqt.invoke(obj), "");
    }
}
