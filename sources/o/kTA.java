package o;

import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.track.ReferralSwapMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kTA {
    public C22907hoH AEQbTJ;
    public final C23212htv KWHzl;

    @yCM
    public kTA(@NotNull C23212htv c23212htv) {
        Intrinsics.checkNotNullParameter(c23212htv, "");
        this.KWHzl = c23212htv;
    }

    public final void EZpvd(@NotNull Function0<java.lang.String> function0, @NotNull final Function0<java.lang.String> function02, @NotNull final Function0<java.lang.String> function03, @NotNull Function0<ServiceFeeInfo> function04) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        this.AEQbTJ = new C22907hoH(this.KWHzl, new C22339hdW(new Function0() { // from class: o.kTD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kTA.EZpvd();
            }
        }, function0, new Function0() { // from class: o.kTI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kTA.AEQbTJ(function02, function03);
            }
        }, function04));
    }

    public static final java.lang.String EZpvd() {
        return ReferralSwapMode.ADVANCED_MODE.getMode();
    }

    public static final java.lang.String AEQbTJ(Function0 function0, Function0 function02) {
        return function0.invoke() + "-" + function02.invoke();
    }

    public final boolean copydefault(@NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C22907hoH c22907hoH = this.AEQbTJ;
        if (c22907hoH == null) {
            Intrinsics.gEmmrt("");
            c22907hoH = null;
        }
        return c22907hoH.OLrzqt(function0);
    }

    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        C22907hoH c22907hoH = this.AEQbTJ;
        if (c22907hoH == null) {
            Intrinsics.gEmmrt("");
            c22907hoH = null;
        }
        return C22907hoH.getReferralParamMap$default(c22907hoH, null, 1, null);
    }

    public final void OLrzqt(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        C22907hoH c22907hoH = this.AEQbTJ;
        if (c22907hoH == null) {
            Intrinsics.gEmmrt("");
            c22907hoH = null;
        }
        c22907hoH.OLrzqt(function2);
    }
}
