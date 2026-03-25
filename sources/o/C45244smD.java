package o;

import com.okinc.okex.common.navigator.CommonServiceKey;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45244smD {
    public static final void copydefault(@NotNull final C45300snG c45300snG) {
        Intrinsics.checkNotNullParameter(c45300snG, "");
        c45300snG.copydefault(CommonServiceKey.DepositDiagnostic, C56392yDr.copydefault(new Function0() { // from class: o.smC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45244smD.EZpvd(c45300snG);
            }
        }));
    }

    public static final C45246smF EZpvd(C45300snG c45300snG) {
        return c45300snG.copydefault().gdmIOq();
    }
}
