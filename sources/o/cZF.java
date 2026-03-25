package o;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cZF extends AbstractC43215rlA implements InterfaceC9850bdP {
    @Override // o.InterfaceC9850bdP
    public java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(str2));
        return EZpvd(str, c10854bwMCopydefault != null ? c10854bwMCopydefault.valueOf() : 0);
    }

    @Override // o.InterfaceC9850bdP
    public java.lang.String EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.AEQbTJ(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    @Override // o.InterfaceC9850bdP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str2);
        if (fieldNames != null) {
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(fieldNames.longValue());
            java.lang.Integer numValueOf = c10854bwMCopydefault != null ? java.lang.Integer.valueOf(c10854bwMCopydefault.valueOf()) : null;
            iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        }
        return AEQbTJ(str, iIntValue);
    }

    @Override // o.InterfaceC9850bdP
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.KWHzl(str, i);
    }

    @Override // o.InterfaceC9850bdP
    public java.lang.String copydefault(@NotNull BigDecimal bigDecimal, boolean z, java.lang.Integer num, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return C54862xYb.OLrzqt(bigDecimal, z, num, roundingMode);
    }
}
