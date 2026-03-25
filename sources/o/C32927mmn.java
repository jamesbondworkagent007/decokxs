package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: renamed from: o.mmn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C32927mmn implements InterfaceC32926mmm {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32926mmm
    public java.lang.String EZpvd() {
        return "default_on_off_flag";
    }

    @Override // o.InterfaceC32926mmm
    public boolean OLrzqt(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }
}
