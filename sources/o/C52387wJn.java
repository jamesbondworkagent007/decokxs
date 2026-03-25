package o;

import android.widget.CompoundButton;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.BotOngoingParams;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wJn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52387wJn extends AbstractC48030uCj<AbstractC50764vaM, BotOrderListPresenter> {
    public final int AEQbTJ = C48033uCm.Activity.RWIpjU;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wJt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52387wJn.copydefault();
        }
    });
    public boolean copydefault = SPUtils.getBoolean(AEQbTJ(), false);
    public java.lang.String OLrzqt = "";

    /* JADX INFO: renamed from: o.wJn$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String copydefault() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return "key_bot_running_list_select_cur_pair_" + (interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.AkhnZx() : null) + "}";
    }

    private final void KWHzl(boolean z) {
        this.copydefault = z;
        SPUtils.put(AEQbTJ(), java.lang.Boolean.valueOf(z));
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        valueOf();
        fetchVPNInfo();
        isConnected();
        AkhnZx();
        djBIcL();
        replaceBotListFragment$default(this, null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        ((BotOrderListPresenter) dxcTrN()).ejfBZ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AkhnZx() {
        C56126xwt<kotlin.Pair<java.lang.String, java.lang.String>> c56126xwtAuCTel = finit().AuCTel();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56126xwtAuCTel.AEQbTJ(viewLifecycleOwner, new Function1() { // from class: o.wJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52387wJn.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        });
        C56111xwe<ParamBuilder> c56111xweValues = finit().values();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweValues.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.wJp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52387wJn.copydefault(this.KWHzl, (ParamBuilder) obj);
            }
        }));
        TradeLiveData<java.util.List<BotCategoryConfig>> tradeLiveDataAhwBna = ((BotOrderListPresenter) dxcTrN()).AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner3, new Activity(new Function1() { // from class: o.wJw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52387wJn.OLrzqt((java.util.List) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C52387wJn c52387wJn, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c52387wJn.AEQbTJ("all_bot");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52387wJn c52387wJn, ParamBuilder paramBuilder) {
        C52324wHe c52324wHeGEmmrt;
        if (((AbstractC50764vaM) c52387wJn.gGvvIC()).djBIcL.isChecked() && (c52324wHeGEmmrt = c52387wJn.gEmmrt()) != null) {
            c52324wHeGEmmrt.zsXlph();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.util.List list) {
        xOR xorCopydefault;
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null && (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) != null) {
            BotCategoryConfig botCategoryConfig = (BotCategoryConfig) CollectionsKt___CollectionsKt.firstOrNull(list);
            xorCopydefault.OLrzqt(botCategoryConfig != null ? botCategoryConfig.getStrategy() : null);
        }
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        getParentFragmentManager().setFragmentResultListener("bot_type_select", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wJr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52387wJn.OLrzqt(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void OLrzqt(C52387wJn c52387wJn, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c52387wJn.AYXKKw();
        replaceBotListFragment$default(c52387wJn, null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        ((AbstractC50764vaM) gGvvIC()).EZpvd.setChecked(false);
        ((AbstractC50764vaM) gGvvIC()).EZpvd.setEnabled(false);
        if (C55697xoo.OLrzqt.isConnected()) {
            ((AbstractC50764vaM) gGvvIC()).copydefault.setVisibility(0);
            ((AbstractC50764vaM) gGvvIC()).AEQbTJ.setVisibility(8);
        } else {
            ((AbstractC50764vaM) gGvvIC()).copydefault.setVisibility(8);
            ((AbstractC50764vaM) gGvvIC()).AEQbTJ.setVisibility(0);
            ((AbstractC50764vaM) gGvvIC()).AEQbTJ.OLrzqt().setTextSize(14.0f);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        android.widget.LinearLayout linearLayout = ((AbstractC50764vaM) gGvvIC()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fetchVPNInfo() {
        ((AbstractC50764vaM) gGvvIC()).djBIcL.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wJm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C52387wJn.AEQbTJ(this.AEQbTJ, compoundButton, z);
            }
        });
        AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C52387wJn c52387wJn, android.widget.CompoundButton compoundButton, boolean z) {
        ((BotOrderListPresenter) c52387wJn.dxcTrN()).KWHzl(z);
        c52387wJn.KWHzl(z);
        C52324wHe c52324wHeGEmmrt = c52387wJn.gEmmrt();
        if (c52324wHeGEmmrt != null) {
            c52324wHeGEmmrt.AuCTelauCTel();
        }
        C32866mlf.onEvent$default("PlaceOrder_OrderBookFull_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.wJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52387wJn.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "checkbox", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final C52324wHe gEmmrt() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(((BotOrderListPresenter) dxcTrN()).valueOf().getBotType() + ":" + C56524yIo.AEQbTJ(C52324wHe.class).valueOf());
        if (fragmentFindFragmentByTag instanceof C52324wHe) {
            return (C52324wHe) fragmentFindFragmentByTag;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        ((AbstractC50764vaM) gGvvIC()).djBIcL.setCheckedIgnoreListener(this.copydefault);
        ((BotOrderListPresenter) dxcTrN()).KWHzl(this.copydefault);
    }

    public static /* synthetic */ void replaceBotListFragment$default(C52387wJn c52387wJn, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c52387wJn.AEQbTJ(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str) {
        java.lang.String botType = (str == null || str.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? ((BotOrderListPresenter) dxcTrN()).valueOf().getBotType() : str;
        java.lang.String str2 = botType + ":" + C56524yIo.AEQbTJ(C52324wHe.class).valueOf();
        if (getChildFragmentManager().findFragmentByTag(str2) != null) {
            return;
        }
        boolean zEZpvd = ((BotOrderListPresenter) dxcTrN()).EZpvd(botType);
        wYK wyk = ((AbstractC50764vaM) gGvvIC()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        boolean z = false;
        wyk.setVisibility(zEZpvd ? 0 : 8);
        wYK wyk2 = ((AbstractC50764vaM) gGvvIC()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(wyk2, "");
        wyk2.setVisibility(zEZpvd ^ true ? 0 : 8);
        BotOrderListPresenter botOrderListPresenter = (BotOrderListPresenter) dxcTrN();
        if (zEZpvd && ((AbstractC50764vaM) gGvvIC()).djBIcL.isChecked()) {
            z = true;
        }
        botOrderListPresenter.KWHzl(z);
        ((BotOrderListPresenter) dxcTrN()).OLrzqt(botType);
        OLrzqt(botType);
        getChildFragmentManager().beginTransaction().replace(C48033uCm.Application.iqMDAV, C52324wHe.Companion.OLrzqt(new BotOngoingParams(botType, false, true, false, false, false, false, false, false, false, false, 16, 1978, null)), str2).commitNowAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        getParentFragmentManager().clearFragmentResultListener("bot_type_select");
        super.onDestroyView();
    }

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        OLrzqt("");
    }
}
