package o;

import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.kKi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27977kKi {
    public static final java.lang.String copydefault(BigDecimal bigDecimal, C38307pTy c38307pTy) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        return pTB.formatICUCompact$default(bigDecimal, null, c38307pTy, null, null, 13, null);
    }

    public static final C38307pTy EZpvd(int i) {
        return C38307pTy.Companion.EZpvd(i);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z3, @NotNull Function2<? super BigDecimal, ? super C38307pTy, java.lang.String> function2, @NotNull Function1<? super java.lang.Integer, C38307pTy> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        java.lang.String strReplace$default = C59449zhJ.replace$default(function2.invoke(bigDecimalEZpvd, function1.invoke(java.lang.Integer.valueOf(((InterfaceC8227ayk) C43248rlh.KWHzl.AEQbTJ(InterfaceC8227ayk.class)).AEQbTJ(str, str2)))), "-", "", false, 4, (java.lang.Object) null);
        java.lang.String strCopydefault = z ? copydefault(bigDecimalEZpvd, z3) : "";
        java.lang.String str6 = z2 ? str2 : "";
        return pTF.KWHzl.AEQbTJ(strCopydefault + str3 + str4 + strReplace$default + str5 + str6);
    }

    public static final java.lang.String copydefault(BigDecimal bigDecimal, boolean z) {
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        return C33129mqd.gEmmrt(bigDecimal, bigDecimal2) ? "-" : (z && C33129mqd.AEQbTJ(bigDecimal, bigDecimal2)) ? Marker.ANY_NON_NULL_MARKER : "";
    }
}
