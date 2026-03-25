package o;

import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.kline.api.bean.EntryType;
import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.kline.api.bean.KlineSettingType;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.ui.unlock.ui.widget.UnlockTokenScheduleView;
import com.okinc.kline.ui.view.KlineReferralView;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.PendingOrderLine;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36204oTc;
import o.C39339pqT;
import o.C39358pqm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oUs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36247oUs extends AbstractC43215rlA implements oKA {
    @Override // o.oKA
    public void AEQbTJ(@NotNull android.content.Context context, MarketCoinInfo marketCoinInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str4, C35968oKj c35968oKj, java.lang.String str5) {
        java.lang.String str6 = str3;
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38834pgs.class);
        if (marketCoinInfo == null) {
            new MarketCoinInfo(str == null ? "" : str, str2 == null ? "" : str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        }
        intent.putExtra("market_detail_info", marketCoinInfo);
        if (str != null) {
            intent.putExtra("id", str);
        }
        if (str2 != null) {
            intent.putExtra("type", str2);
        }
        if (str6 != null) {
            intent.putExtra("from", str6);
        }
        if (str4 != null) {
            intent.putExtra("from_scene", str4);
        }
        if (num != null) {
            num.intValue();
            intent.putExtra("coin_hot_sort", num.intValue());
        }
        if (bool != null) {
            bool.booleanValue();
            intent.putExtra("is_all", bool.booleanValue());
        }
        if (bool2 != null) {
            bool2.booleanValue();
            intent.putExtra("is_show_price_alert", bool2.booleanValue());
        }
        if (str5 != null) {
            intent.putExtra("tag", str5);
        }
        if (str6 == null || str3.length() == 0) {
            str6 = "default_trade";
        }
        C34656ngH.AEQbTJ(intent, str6);
        if (c35968oKj != null) {
            java.lang.String strOLrzqt = c35968oKj.OLrzqt();
            java.lang.String strKWHzl = c35968oKj.KWHzl();
            java.lang.String strCopydefault = c35968oKj.copydefault();
            intent.putExtra("token_base", new TokenBase(strOLrzqt, strKWHzl, c35968oKj.AEQbTJ(), c35968oKj.EZpvd(), (java.lang.String) null, c35968oKj.AYXKKw(), (java.lang.String) null, 0, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strCopydefault, (java.lang.String) null, 0, 0, false, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, 1073709008, (DefaultConstructorMarker) null));
        }
        context.startActivity(intent);
    }

    @Override // o.oKA
    public void AEQbTJ(@NotNull android.content.Context context, MarketArbCoinInfo marketArbCoinInfo, java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38952pjD.class);
        if (marketArbCoinInfo != null) {
            intent.putExtra("market_detail_info", marketArbCoinInfo);
        }
        if (str != null) {
            intent.putExtra("from", str);
        }
        if (num != null) {
            num.intValue();
            intent.putExtra("coin_hot_sort", num.intValue());
        }
        context.startActivity(intent);
    }

    @Override // o.oKA
    public androidx.fragment.app.Fragment AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C38962pjN.Companion.copydefault(str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.oKA
    public void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        InterfaceC35972oKn interfaceC35972oKn = fragment instanceof InterfaceC35972oKn ? (InterfaceC35972oKn) fragment : null;
        if (interfaceC35972oKn != null) {
            interfaceC35972oKn.OLrzqt();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.oKA
    public void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, @NotNull IBotOrdersDataBean iBotOrdersDataBean) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(iBotOrdersDataBean, "");
        InterfaceC35972oKn interfaceC35972oKn = fragment instanceof InterfaceC35972oKn ? (InterfaceC35972oKn) fragment : null;
        if (interfaceC35972oKn != null) {
            interfaceC35972oKn.EZpvd(iBotOrdersDataBean);
        }
    }

    @Override // o.oKA
    public android.view.View KWHzl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return new C39756pyO(context, attributeSet, i);
    }

    @Override // o.oKA
    public android.view.View djBIcL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return new C39816pzV(context, attributeSet, i);
    }

    @Override // o.oKA
    public android.view.View EZpvd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return new C39808pzN(context, attributeSet, i);
    }

    @Override // o.oKA
    public android.view.View copydefault(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return new ViewOnClickListenerC39746pyE(context, attributeSet, i);
    }

    @Override // o.oKA
    public android.view.View AEQbTJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return new ViewOnClickListenerC39742pyA(context, attributeSet);
    }

    @Override // o.oKA
    public InterfaceC35976oKr OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, @NotNull KlineSettingType klineSettingType, @NotNull EntryType entryType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(klineSettingType, "");
        Intrinsics.checkNotNullParameter(entryType, "");
        C36204oTc.StateListAnimator stateListAnimator = C36204oTc.Companion;
        KlineSettingType klineSettingType2 = KlineSettingType.CHART_LANDSCAPE;
        return stateListAnimator.AEQbTJ(new SettingEntryPoint(entryType, null, null, null, klineSettingType == klineSettingType2, false, klineSettingType != klineSettingType2, z3, z2, false, z8, z9, z10, z4, z13, 558, null));
    }

    @Override // o.oKA
    public InterfaceC35979oKu AEQbTJ(boolean z) {
        return C39339pqT.TaskDescription.newInstance$default(C39339pqT.Companion, false, z, 1, null);
    }

    @Override // o.oKA
    public InterfaceC35973oKo copydefault() {
        return C39358pqm.TaskDescription.newInstance$default(C39358pqm.Companion, false, null, 3, null);
    }

    @Override // o.oKA
    public oKE AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, Function0<Unit> function0, Function1<? super java.lang.Boolean, Unit> function1, Function0<Unit> function02, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, Function1<? super java.lang.String, Unit> function12, Function2<? super java.lang.String, ? super TradeAllOrderApi, Unit> function22, Function1<? super TradeAllOrderApi, Unit> function13, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C39232poS.Companion.copydefault(str, str2, str3, str4, str5, function0, function1, function02, function2, function12, function22, function13, z);
    }

    @Override // o.oKA
    public InterfaceC35971oKm EZpvd(int i) {
        return C38780pfr.Companion.copydefault(i);
    }

    @Override // o.oKA
    public void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38484paM.class);
        if (str != null) {
            intent.putExtra("coin", str);
        }
        if (str2 != null) {
            intent.putExtra("symbol", str2);
        }
        if (str3 != null) {
            intent.putExtra("from", str3);
        }
        context.startActivity(intent);
    }

    @Override // o.oKA
    public InterfaceC35977oKs gEmmrt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return new C37771pAb(context, attributeSet, i);
    }

    @Override // o.oKA
    public void AEQbTJ(@NotNull PendingOrderLine pendingOrderLine) {
        Intrinsics.checkNotNullParameter(pendingOrderLine, "");
        C36013oMa c36013oMa = new C36013oMa();
        c36013oMa.copydefault(pendingOrderLine.getTriggerPx());
        c36013oMa.KWHzl(pendingOrderLine.getDirection());
        c36013oMa.copydefault(pendingOrderLine.getLines());
        c36013oMa.AEQbTJ(pendingOrderLine.getBotType());
        C36246oUr.copydefault().EZpvd(c36013oMa);
    }

    @Override // o.oKA
    public InterfaceC35974oKp AYXKKw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return new KlineReferralView(context, attributeSet, i);
    }

    @Override // o.oKA
    public InterfaceC35978oKt OLrzqt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return new UnlockTokenScheduleView(context, attributeSet, i);
    }
}
