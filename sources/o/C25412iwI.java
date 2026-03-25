package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25412iwI {
    public static /* synthetic */ java.lang.String getWalletAddressByType$default(C25412iwI c25412iwI, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return c25412iwI.EZpvd(interfaceC9738bbJ, str, num);
    }

    public final java.lang.String EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        if (interfaceC9738bbJ == null) {
            return "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") && num != null) {
            java.lang.String strCopydefault = interfaceC9738bbJ.copydefault(C33129mqd.valueOf(str), num.intValue());
            return strCopydefault == null ? interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(str)) : strCopydefault;
        }
        return interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(str));
    }
}
