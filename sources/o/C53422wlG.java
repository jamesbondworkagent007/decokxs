package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53422wlG {
    public static final java.lang.String copydefault(@NotNull java.lang.String str, xMS xms) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        return (xms == null || (strCopydefault = C53418wlC.copydefault(C54536xML.toSafeString$default(xms.AYXKKw(str).djBIcL(), false, 1, null))) == null) ? pTB.formatICUNumber$default(C33129mqd.EZpvd(str), null, null, null, null, 15, null) : strCopydefault;
    }
}
