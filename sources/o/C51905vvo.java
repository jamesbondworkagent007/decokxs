package o;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.market_place.presenter.BotLeadPendingSignalBotPresenter;
import com.okinc.unify_trade.biz.SignalBotSummaryBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C51948vwe;
import o.C52761wXj;
import o.C55688xof;

/* JADX INFO: renamed from: o.vvo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51905vvo extends AbstractC54505xKx<uOO, BotLeadPendingSignalBotPresenter> {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.vvo$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
        return C48033uCm.Activity.fjfviF;
    }

    /* JADX INFO: renamed from: o.vvo$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vvo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final androidx.fragment.app.Fragment copydefault() {
            return new C51905vvo();
        }
    }

    @Override // o.AbstractC54505xKx
    public void uzCIH() {
        super.uzCIH();
        AEQbTJ();
        showLoading();
        dxcTrN().OLrzqt();
    }

    private final void AEQbTJ() {
        uOO uooGGvvIC = gGvvIC();
        final java.util.ArrayList<C51790vtf> arrayListKWHzl = KWHzl();
        ViewPager2 viewPager2 = uooGGvvIC.AkhnZx;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        viewPager2.setAdapter(new C51866vvB(fragmentActivityRequireActivity, arrayListKWHzl));
        new TabLayoutMediator(uooGGvvIC.OLrzqt.copydefault(), uooGGvvIC.AkhnZx, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vvq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C51905vvo.OLrzqt(arrayListKWHzl, tab, i);
            }
        }).attach();
        uooGGvvIC.OLrzqt.AEQbTJ(new Activity());
        android.view.View childAt = uooGGvvIC.AkhnZx.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "");
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setOverScrollMode(2);
        }
    }

    public static final void OLrzqt(java.util.ArrayList arrayList, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(((C51790vtf) arrayList.get(i)).copydefault());
    }

    /* JADX INFO: renamed from: o.vvo$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                C51905vvo c51905vvo = C51905vvo.this;
                int position = tab.getPosition();
                c51905vvo.EZpvd(position != 0 ? position != 1 ? position != 2 ? "" : "unpublished" : "Free" : "Paid");
            }
        }
    }

    public final java.util.ArrayList<C51790vtf> KWHzl() {
        C51948vwe.TaskDescription taskDescription = C51948vwe.Companion;
        return yDY.copydefault(new C51790vtf(taskDescription.AEQbTJ("paid"), C33070mpX.AYXKKw(C55688xof.Application.jFiva), 0, 4, null), new C51790vtf(taskDescription.AEQbTJ("free"), C33070mpX.AYXKKw(C55688xof.Application.OCdtug), 0, 4, null), new C51790vtf(C51952vwi.Companion.AEQbTJ(), C33070mpX.AYXKKw(C55688xof.Application.hrnhsO), 0, 4, null));
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        AppBarLayout appBarLayout = gGvvIC().AEQbTJ;
        appBarLayout.setOnClickListener(new StateListAnimator(appBarLayout, 1000L, this));
        C55258xgZ c55258xgZ = gGvvIC().gEmmrt;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L));
        dxcTrN().copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.vvr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51905vvo.KWHzl(this.OLrzqt, (SignalBotSummaryBean) obj);
            }
        }));
        dxcTrN().KWHzl().AhwBna().observe(this, new TaskDescription(new Function1() { // from class: o.vvs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51905vvo.copydefault(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.vvo$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    public static final Unit KWHzl(C51905vvo c51905vvo, SignalBotSummaryBean signalBotSummaryBean) {
        c51905vvo.dismissLoading();
        if (signalBotSummaryBean != null) {
            android.widget.ImageView imageView = c51905vvo.gGvvIC().KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            uOO uooGGvvIC = c51905vvo.gGvvIC();
            C55258xgZ c55258xgZ = uooGGvvIC.gEmmrt;
            int i = C55688xof.Application.DRtzUu;
            java.lang.String ccy = signalBotSummaryBean.getCcy();
            if (ccy == null) {
                ccy = "";
            }
            c55258xgZ.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, ccy))));
            android.widget.TextView textView = uooGGvvIC.djBIcL;
            java.lang.String accumulatedSignalIncome = signalBotSummaryBean.getAccumulatedSignalIncome();
            java.lang.String str = accumulatedSignalIncome == null ? "" : accumulatedSignalIncome;
            java.lang.String ccy2 = signalBotSummaryBean.getCcy();
            textView.setText(wUW.withColorUnderlineStyle$default(C56033xvF.getBotPnl$default("", "", str, ccy2 == null ? "" : ccy2, false, false, null, false, null, null, null, 2032, null), C33070mpX.copydefault(C52761wXj.Activity.iRxXKY), C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn), C55298xhM.dp2pxFloat$default(5.0f, null, 1, null), null, 8, null), TextView.BufferType.SPANNABLE);
            android.widget.TextView textView2 = uooGGvvIC.AhwBna;
            xMR xmr = xMR.copydefault;
            java.lang.String totalFollowerCount = signalBotSummaryBean.getTotalFollowerCount();
            if (totalFollowerCount == null) {
                totalFollowerCount = "";
            }
            textView2.setText(xmr.copydefault(totalFollowerCount));
            android.widget.TextView textView3 = uooGGvvIC.DbNXlk;
            java.lang.String totalSignalCount = signalBotSummaryBean.getTotalSignalCount();
            textView3.setText(xmr.copydefault(totalSignalCount != null ? totalSignalCount : ""));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51905vvo c51905vvo, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c51905vvo.dismissLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(final java.lang.String str) {
        C32866mlf.onEvent$default("OrderManagement_Full_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.vvt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51905vvo.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vvo$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j) {
            this.EZpvd = view;
            this.KWHzl = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = ((C55258xgZ) this.EZpvd).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.RsCxkX));
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new FragmentManager(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vvo$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C51905vvo EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51905vvo c51905vvo) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c51905vvo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C51885vvU c51885vvUKWHzl = C51885vvU.Companion.KWHzl();
                androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c51885vvUKWHzl.show(childFragmentManager);
                this.EZpvd.EZpvd("More");
            }
        }
    }
}
