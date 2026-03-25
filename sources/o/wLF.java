package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.BotFeaturedPresenter;
import com.okinc.tradingbot.impl.strategy.guide.fragment.BotKLineFragment$loadBotData$1;
import com.okinc.tradingbot.impl.strategy.guide.fragment.BotKLineFragment$setListener$1$1;
import com.okinc.tradingbot.impl.strategy.guide.fragment.BotKLineFragment$setListener$2$1;
import com.okinc.unify_trade.biz.BotCreateCardItem;
import com.okinc.unify_trade.biz.BotCreateContentItem;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.NmpBotSquareGuideItem;
import com.okinc.unify_trade.biz.RecommendBulletMPDataB;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC52122vzt;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wLF extends AbstractC54505xKx<uOI, BotFeaturedPresenter> {
    public final java.lang.String AYXKKw;
    public final int AhwBna;
    public final int EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wLN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wLF.djBIcL(this.OLrzqt);
        }
    });
    public final wMM OLrzqt = new wMM();
    public final C43316rmw copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.dUDNAs;
    }

    public wLF() {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(BotCreateCardItem.class, new C51495voB(new Function1() { // from class: o.wLL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wLF.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        }));
        c43316rmw.register(RecommendBulletMPDataB.class, new C51513voT(new Function1() { // from class: o.wLM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wLF.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        c43316rmw.register(NmpBotSquareGuideItem.class, new C51511voR(new Function0() { // from class: o.wLO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wLF.valueOf(this.AEQbTJ);
            }
        }));
        this.copydefault = c43316rmw;
        this.EZpvd = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AhwBna = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AYXKKw = "MpBotSelectedFragment";
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String djBIcL(wLF wlf) {
        android.os.Bundle arguments = wlf.getArguments();
        java.lang.String string = arguments != null ? arguments.getString(AppsFlyerProperties.CHANNEL) : null;
        return string == null ? "" : string;
    }

    public static final Unit copydefault(wLF wlf, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "create")) {
            new C51418vme().show(wlf.getChildFragmentManager(), wlf.AYXKKw);
        } else {
            wlf.copydefault(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(wLF wlf, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = wlf.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, C56071xvr.gEmmrt.KWHzl(str, wlf.valueOf()), null, new Function1() { // from class: o.wLH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wLF.EZpvd((AbstractC43238rlX) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(wLF wlf) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = wlf.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, "social/trade/community?location=HOT&nmp_channel=bot_page_entrance", null, new Function1() { // from class: o.wLI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wLF.KWHzl((AbstractC43238rlX) obj);
            }
        }, 4, null);
        C55867xrz.KWHzl.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wLF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final wLF OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            wLF wlf = new wLF();
            wlf.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(AppsFlyerProperties.CHANNEL, str), C56390yDp.OLrzqt("channel_details", str2), C56390yDp.OLrzqt("activity_id", str3)));
            return wlf;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        copydefault();
    }

    public final void copydefault() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(this.AYXKKw);
        if (fragmentFindFragmentByTag instanceof C51418vme) {
            C51418vme c51418vme = (C51418vme) fragmentFindFragmentByTag;
            if (c51418vme.isAdded()) {
                c51418vme.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        uOI uoiGGvvIC = gGvvIC();
        RecyclerView recyclerView = uoiGGvvIC.copydefault;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 4);
        gridLayoutManager.setSpanSizeLookup(KWHzl());
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(AEQbTJ(gridLayoutManager));
        recyclerView.setAdapter(this.copydefault);
        uoiGGvvIC.KWHzl.setRetryClickListener(new View.OnClickListener() { // from class: o.wLS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                wLF.AEQbTJ(this.EZpvd, view2);
            }
        });
        AEQbTJ();
    }

    public static final void AEQbTJ(wLF wlf, android.view.View view) {
        wlf.AEQbTJ();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        C56126xwt<kotlin.Pair<java.lang.Boolean, ParamBuilder>> c56126xwtIsConnected = this.OLrzqt.isConnected();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56126xwtIsConnected.AEQbTJ(viewLifecycleOwner, new Function1() { // from class: o.wLJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wLF.KWHzl(this.EZpvd, (kotlin.Pair) obj);
            }
        });
        dxcTrN().KWHzl().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wLG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wLF.OLrzqt(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = dxcTrN().OLrzqt().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.wLK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wLF.AEQbTJ(this.copydefault, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit KWHzl(wLF wlf, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(wlf), null, null, new BotKLineFragment$setListener$1$1(pair, wlf, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(wLF wlf, java.util.ArrayList arrayList) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(wlf), null, null, new BotKLineFragment$setListener$2$1(wlf, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(wLF wlf, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wlf, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BotKLineFragment$loadBotData$1(this, null), 3, null);
    }

    public static final class Activity extends GridLayoutManager.SpanSizeLookup {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            return wLF.this.copydefault.getItems().get(i) instanceof BotCreateCardItem ? 1 : 4;
        }
    }

    public final Activity KWHzl() {
        return new Activity();
    }

    public static final class ActionBar extends RecyclerView.ItemDecoration {
        public final /* synthetic */ GridLayoutManager EZpvd;
        public final /* synthetic */ wLF copydefault;

        public ActionBar(GridLayoutManager gridLayoutManager, wLF wlf) {
            this.EZpvd = gridLayoutManager;
            this.copydefault = wlf;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int spanCount = this.EZpvd.getSpanCount();
            if (this.copydefault.copydefault.getItems().get(childAdapterPosition) instanceof BotCreateCardItem) {
                int spanCount2 = childAdapterPosition % this.EZpvd.getSpanCount();
                rect.left = (this.copydefault.EZpvd * spanCount2) / spanCount;
                rect.right = this.copydefault.EZpvd - (((spanCount2 + 1) * this.copydefault.EZpvd) / spanCount);
            }
            if (childAdapterPosition == this.copydefault.copydefault.getItemCount() - 1 && (this.copydefault.copydefault.getItems().get(childAdapterPosition) instanceof BotCreateContentItem)) {
                rect.bottom = this.copydefault.AhwBna;
            }
            C55296xhK.EZpvd(rect, C55296xhK.AEQbTJ(recyclerView));
        }
    }

    public final ActionBar AEQbTJ(GridLayoutManager gridLayoutManager) {
        return new ActionBar(gridLayoutManager, this);
    }

    private final void copydefault(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smart_arbitrage")) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C52841waI.Companion.EZpvd(activity);
                return;
            }
            return;
        }
        if (dxcTrN().OLrzqt(str)) {
            C55326xho.toast$default(C55688xof.Application.ActivityResultContractsPickVisualMediaImageAndVideo, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        xUV xuv = xUV.EZpvd;
        java.lang.String strEZpvd = xuv.EZpvd("current_instrument_id");
        java.lang.String str2 = strEZpvd == null ? "" : strEZpvd;
        java.lang.String strEZpvd2 = xuv.EZpvd("current_instrument_type");
        BotTradeData botTradeData = new BotTradeData(str, str2, strEZpvd2 == null ? "" : strEZpvd2, (android.os.Parcelable) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null);
        ActivityC52122vzt.Application application = ActivityC52122vzt.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        application.OLrzqt(contextRequireContext, botTradeData, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "bot_home_recommend", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
        C55867xrz.KWHzl.copydefault("more", str);
    }
}
