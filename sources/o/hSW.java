package o;

import com.okinc.business.dexui.main.market.base.ActionOnMarketDetail;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hSW {
    public static /* synthetic */ void copyTokenAddress$default(android.content.Context context, java.lang.String str, Function1 function1, TokenDetailClickLayer tokenDetailClickLayer, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.hSX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return hSW.copydefault((java.lang.String) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            tokenDetailClickLayer = null;
        }
        copydefault(context, str, function1, tokenDetailClickLayer);
    }

    public static final Unit copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1, TokenDetailClickLayer tokenDetailClickLayer) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C25352ivB.copydefault(str);
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 4, null);
        c55097xdX.setState(2);
        c55097xdX.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.playFromMediaId) + " " + str);
        c55097xdX.setCloseBtnShow(true);
        c55097xdX.setMessage(null);
        c55097xdX.setOnCloseCallback(new Function0() { // from class: o.hTa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hSW.OLrzqt();
            }
        });
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
        C21847hOn.AEQbTJ(ActionOnMarketDetail.ADDRESS_COPY, tokenDetailClickLayer);
        function1.invoke(str);
    }

    public static final Unit OLrzqt() {
        C57656ymY.OLrzqt.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void copyAddress$default(int i, android.content.Context context, java.lang.String str, Function1 function1, TokenDetailClickLayer tokenDetailClickLayer, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            function1 = new Function1() { // from class: o.hSV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return hSW.EZpvd((java.lang.String) obj2);
                }
            };
        }
        if ((i2 & 16) != 0) {
            tokenDetailClickLayer = null;
        }
        copydefault(i, context, str, function1, tokenDetailClickLayer);
    }

    public static final void copydefault(@androidx.annotation.StringRes int i, @NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1, TokenDetailClickLayer tokenDetailClickLayer) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C25352ivB.copydefault(str);
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 4, null);
        c55097xdX.setState(2);
        c55097xdX.setTitle(C33070mpX.AYXKKw(i));
        c55097xdX.setCloseBtnShow(true);
        c55097xdX.setMessage(str);
        c55097xdX.setOnCloseCallback(new Function0() { // from class: o.hSZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hSW.AEQbTJ();
            }
        });
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
        C21847hOn.AEQbTJ(ActionOnMarketDetail.ADDRESS_COPY, tokenDetailClickLayer);
        function1.invoke(str);
    }

    public static final Unit AEQbTJ() {
        C57656ymY.OLrzqt.AhwBna();
        return Unit.INSTANCE;
    }
}
