package o;

import com.okinc.dexkline.dexui.main.market.base.ActionOnMarketDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32237mUo {
    public static final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        mUO.AEQbTJ(str);
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 4, null);
        c55097xdX.setState(2);
        c55097xdX.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.onComplete) + " " + str);
        c55097xdX.setCloseBtnShow(true);
        c55097xdX.setMessage(null);
        c55097xdX.setOnCloseCallback(new Function0() { // from class: o.mUt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32237mUo.KWHzl();
            }
        });
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
        mRG.EZpvd(ActionOnMarketDetail.ADDRESS_COPY);
    }

    public static final Unit KWHzl() {
        C57656ymY.OLrzqt.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void copyAddress$default(int i, android.content.Context context, java.lang.String str, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            function1 = new Function1() { // from class: o.mUn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C32237mUo.KWHzl((java.lang.String) obj2);
                }
            };
        }
        OLrzqt(i, context, str, function1);
    }

    public static final void OLrzqt(@androidx.annotation.StringRes int i, @NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        mUO.AEQbTJ(str);
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 4, null);
        c55097xdX.setState(2);
        c55097xdX.setTitle(C33070mpX.AYXKKw(i));
        c55097xdX.setCloseBtnShow(true);
        c55097xdX.setMessage(str);
        c55097xdX.setOnCloseCallback(new Function0() { // from class: o.mUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32237mUo.EZpvd();
            }
        });
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
        mRG.EZpvd(ActionOnMarketDetail.ADDRESS_COPY);
        function1.invoke(str);
    }

    public static final Unit EZpvd() {
        C57656ymY.OLrzqt.AhwBna();
        return Unit.INSTANCE;
    }
}
