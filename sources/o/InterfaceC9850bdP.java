package o;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9850bdP extends InterfaceC43217rlC {
    java.lang.String AEQbTJ(@NotNull java.lang.String str, int i);

    java.lang.String EZpvd(@NotNull java.lang.String str, int i);

    java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.String copydefault(@NotNull BigDecimal bigDecimal, boolean z, java.lang.Integer num, @NotNull RoundingMode roundingMode);

    /* JADX INFO: renamed from: o.bdP$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.String formatToString$default(InterfaceC9850bdP interfaceC9850bdP, BigDecimal bigDecimal, boolean z, java.lang.Integer num, RoundingMode roundingMode, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatToString");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                roundingMode = RoundingMode.DOWN;
            }
            return interfaceC9850bdP.copydefault(bigDecimal, z, num, roundingMode);
        }
    }
}
