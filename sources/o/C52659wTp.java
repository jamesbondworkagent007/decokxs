package o;

import android.view.View;
import com.okinc.biz.TacticsType;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import com.okinc.unify_trade.bot.constant.TacticsForbiddenFunctions;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52659wTp {
    public static final C52659wTp copydefault = new C52659wTp();

    private C52659wTp() {
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull TacticsVoucherInfo tacticsVoucherInfo, boolean z, TacticsType tacticsType, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tacticsVoucherInfo, "");
        ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).KWHzl(context, tacticsVoucherInfo, z, tacticsType, z2);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull TacticsData tacticsData, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(function0, "");
        java.util.List listGEmmrt = yDY.gEmmrt(TacticsVoucherType.STRATEGY_COMPENSATION, TacticsVoucherType.COPYTRADING_COMPENSATION);
        if (C33129mqd.AEQbTJ(C33129mqd.EZpvd(tacticsData.getTotalPnl()), BigDecimal.ZERO)) {
            TacticsVoucherInfo voucherInfo = tacticsData.getVoucherInfo();
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends TacticsVoucherType>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), voucherInfo != null ? voucherInfo.getVoucherType() : null) && tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.SellAllWhenBotStops)) {
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.GGlJim));
                viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI), new View.OnClickListener() { // from class: o.wTu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C52659wTp.AYXKKw(function0, viewOnClickListenerC54939xaY, view);
                    }
                });
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.DjWNei), new View.OnClickListener() { // from class: o.wTv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C52659wTp.gEmmrt(viewOnClickListenerC54939xaY, view);
                    }
                });
                viewOnClickListenerC54939xaY.show();
                return;
            }
        }
        function0.invoke();
    }

    public static final void AYXKKw(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void gEmmrt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        if (!z) {
            ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).AEQbTJ(context, str, str2, function0, function02);
            return;
        }
        int i = C48033uCm.Fragment.invokespecialaKhcqp;
        int i2 = C48033uCm.Fragment.invokespecialaVhqwO;
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("amount1", pTB.formatLocalized$default(xVG.KWHzl(str), null, 1, null));
        if (str2.length() == 0) {
            str2 = "USDT";
        }
        pairArr[1] = C56390yDp.OLrzqt("crypto1", str2);
        pairArr[2] = C56390yDp.OLrzqt("amount2", pTB.formatLocalized$default(xVG.KWHzl(str3), null, 1, null));
        if (str4.length() == 0) {
            str4 = "USD";
        }
        pairArr[3] = C56390yDp.OLrzqt("crypto2", str4);
        EZpvd(context, i, C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr)), function0, function02);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        java.lang.String localized$default = pTB.formatLocalized$default(xVG.KWHzl(str), null, 1, null);
        if (str2.length() == 0) {
            str2 = "USDT";
        }
        if (z) {
            int i = C48033uCm.Fragment.invokespecialaGOrKO;
            kotlin.Pair[] pairArr = new kotlin.Pair[4];
            pairArr[0] = C56390yDp.OLrzqt("amount1", localized$default);
            pairArr[1] = C56390yDp.OLrzqt("crypto1", str2);
            pairArr[2] = C56390yDp.OLrzqt("amount2", pTB.formatLocalized$default(xVG.KWHzl(str3), null, 1, null));
            if (str4.length() == 0) {
                str4 = "USD";
            }
            pairArr[3] = C56390yDp.OLrzqt("crypto2", str4);
            strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        } else {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.hBUiXU, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, localized$default + " " + str2)));
        }
        EZpvd(context, C55688xof.Application.zEkrwr, strCopydefault, function0, function02);
    }

    public final void EZpvd(android.content.Context context, @androidx.annotation.StringRes int i, java.lang.String str, final Function0<Unit> function0, final Function0<Unit> function02) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(i);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.PluralsRes, new View.OnClickListener() { // from class: o.wTw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52659wTp.OLrzqt(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C55688xof.Application.postOrRun, new View.OnClickListener() { // from class: o.wTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52659wTp.EZpvd(function02, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        C33070mpX.AYXKKw(C55688xof.Application.OFQuKP);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.QBiWsm), new View.OnClickListener() { // from class: o.wTq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52659wTp.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.OAUGar));
        viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.nriSR);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.QBiWsm), new View.OnClickListener() { // from class: o.wTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52659wTp.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).KWHzl(context, view, i);
    }

    public final void EZpvd(android.content.Context context) {
        if (context != null) {
            C55326xho.toastWithFailedIcon$default(C33070mpX.OLrzqt(C55688xof.Application.DTwDnp, context), 0, 1, (java.lang.Object) null);
        }
    }
}
