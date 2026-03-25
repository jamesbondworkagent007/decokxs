package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.HomeStrategyFilterPresenter;
import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import com.okinc.unify_trade.biz.HomeStrategyFilterCoin;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51519voZ extends AbstractC49945uyC<uZB, HomeStrategyFilterPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final int KWHzl = C48033uCm.Activity.gdLjtZ;
    public int AEQbTJ = 1;

    /* JADX INFO: renamed from: o.voZ$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.AEQbTJ = i;
    }

    public static final /* synthetic */ uZB EZpvd(C51519voZ c51519voZ) {
        return c51519voZ.values();
    }

    /* JADX INFO: renamed from: o.voZ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.voZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String KWHzl() {
            C55697xoo c55697xoo = C55697xoo.OLrzqt;
            return c55697xoo.gEmmrt() + "_" + c55697xoo.AkhnZx() + "_HomeStrategyFilterDialog";
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C51519voZ c51519voZ = new C51519voZ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("algoOrdType", str);
            bundle.putString("tab_name", str2);
            c51519voZ.setArguments(bundle);
            c51519voZ.show(fragmentManager, "HomeStrategyFilterDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        HomeStrategyFilterPresenter homeStrategyFilterPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        homeStrategyFilterPresenterOLrzqt.EZpvd(arguments != null ? arguments.getString("algoOrdType") : null);
        HomeStrategyFilterPresenter homeStrategyFilterPresenterOLrzqt2 = OLrzqt();
        android.os.Bundle arguments2 = getArguments();
        homeStrategyFilterPresenterOLrzqt2.copydefault(arguments2 != null ? arguments2.getString("tab_name") : null);
        fJNWhG();
        AuCTel();
        ejfBZ();
        OLrzqt().OLrzqt();
    }

    @Override // o.AbstractC49945uyC, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        setHeightRatio(0.93f);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.AEQbTJ().setVisibility(0);
        wxq.valueOf().setVisibility(8);
        wxq.setCloseVisibility(false);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.getBehavior().setDraggable(false);
            bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        }
    }

    private final void fJNWhG() {
        android.widget.TextView textView = values().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(OLrzqt().AhwBna() ? 0 : 8);
        C51614vqO c51614vqO = values().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c51614vqO, "");
        c51614vqO.setVisibility(OLrzqt().AhwBna() ? 0 : 8);
        isConnected();
    }

    private final void AuCTel() {
        TradeLiveData<HomeStrategyDropDownInfo> tradeLiveDataValueOf = OLrzqt().valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.vpa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51519voZ.OLrzqt(this.copydefault, (HomeStrategyDropDownInfo) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C51519voZ c51519voZ, HomeStrategyDropDownInfo homeStrategyDropDownInfo) {
        java.util.List<java.lang.String> listFJNWhG;
        Intrinsics.checkNotNullParameter(homeStrategyDropDownInfo, "");
        java.util.List<java.lang.String> userRole = homeStrategyDropDownInfo.getUserRole();
        if (userRole == null || userRole.isEmpty()) {
            android.widget.TextView textView = c51519voZ.values().EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            C51614vqO c51614vqO = c51519voZ.values().copydefault;
            Intrinsics.checkNotNullExpressionValue(c51614vqO, "");
            c51614vqO.setVisibility(8);
        } else {
            C51614vqO c51614vqO2 = c51519voZ.values().copydefault;
            HomeStrategyFilterPresenter homeStrategyFilterPresenterOLrzqt = c51519voZ.OLrzqt();
            java.util.List<java.lang.String> userRole2 = homeStrategyDropDownInfo.getUserRole();
            if (userRole2 == null || (listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) userRole2)) == null) {
                listFJNWhG = null;
            } else {
                listFJNWhG.add("LOCAL_TRADER");
                Unit unit = Unit.INSTANCE;
            }
            HomeStrategyDropDownInfo homeStrategyDropDownInfoEZpvd = c51519voZ.OLrzqt().EZpvd();
            c51614vqO2.AEQbTJ(homeStrategyFilterPresenterOLrzqt.OLrzqt(listFJNWhG, homeStrategyDropDownInfoEZpvd != null ? homeStrategyDropDownInfoEZpvd.getUserRole() : null, new Function1() { // from class: o.vpb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51519voZ.gEmmrt((java.lang.String) obj);
                }
            }));
        }
        C51614vqO c51614vqO3 = c51519voZ.values().values;
        HomeStrategyFilterPresenter homeStrategyFilterPresenterOLrzqt2 = c51519voZ.OLrzqt();
        java.util.List<java.lang.String> runningTime = homeStrategyDropDownInfo.getRunningTime();
        HomeStrategyDropDownInfo homeStrategyDropDownInfoEZpvd2 = c51519voZ.OLrzqt().EZpvd();
        c51614vqO3.AEQbTJ(homeStrategyFilterPresenterOLrzqt2.OLrzqt(runningTime, homeStrategyDropDownInfoEZpvd2 != null ? homeStrategyDropDownInfoEZpvd2.getRunningTime() : null, new Function1() { // from class: o.vpc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51519voZ.AYXKKw((java.lang.String) obj);
            }
        }));
        C51614vqO c51614vqO4 = c51519voZ.values().djBIcL;
        HomeStrategyFilterPresenter homeStrategyFilterPresenterOLrzqt3 = c51519voZ.OLrzqt();
        java.util.List<java.lang.String> pnlRatio = homeStrategyDropDownInfo.getPnlRatio();
        HomeStrategyDropDownInfo homeStrategyDropDownInfoEZpvd3 = c51519voZ.OLrzqt().EZpvd();
        c51614vqO4.AEQbTJ(homeStrategyFilterPresenterOLrzqt3.OLrzqt(pnlRatio, homeStrategyDropDownInfoEZpvd3 != null ? homeStrategyDropDownInfoEZpvd3.getPnlRatio() : null, new Function1() { // from class: o.vph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51519voZ.valueOf((java.lang.String) obj);
            }
        }));
        java.util.List<java.lang.String> leverage = homeStrategyDropDownInfo.getLeverage();
        if (leverage == null || leverage.isEmpty()) {
            android.widget.TextView textView2 = c51519voZ.values().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            C51614vqO c51614vqO5 = c51519voZ.values().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c51614vqO5, "");
            c51614vqO5.setVisibility(8);
        } else {
            C51614vqO c51614vqO6 = c51519voZ.values().gEmmrt;
            HomeStrategyFilterPresenter homeStrategyFilterPresenterOLrzqt4 = c51519voZ.OLrzqt();
            java.util.List<java.lang.String> leverage2 = homeStrategyDropDownInfo.getLeverage();
            HomeStrategyDropDownInfo homeStrategyDropDownInfoEZpvd4 = c51519voZ.OLrzqt().EZpvd();
            c51614vqO6.AEQbTJ(homeStrategyFilterPresenterOLrzqt4.OLrzqt(leverage2, homeStrategyDropDownInfoEZpvd4 != null ? homeStrategyDropDownInfoEZpvd4.getLeverage() : null, new Function1() { // from class: o.vpi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51519voZ.djBIcL((java.lang.String) obj);
                }
            }));
        }
        C51614vqO c51614vqO7 = c51519voZ.values().isConnected;
        HomeStrategyFilterPresenter homeStrategyFilterPresenterOLrzqt5 = c51519voZ.OLrzqt();
        java.util.List<java.lang.String> maxDrawdown = homeStrategyDropDownInfo.getMaxDrawdown();
        HomeStrategyDropDownInfo homeStrategyDropDownInfoEZpvd5 = c51519voZ.OLrzqt().EZpvd();
        c51614vqO7.AEQbTJ(homeStrategyFilterPresenterOLrzqt5.OLrzqt(maxDrawdown, homeStrategyDropDownInfoEZpvd5 != null ? homeStrategyDropDownInfoEZpvd5.getMaxDrawdown() : null, new Function1() { // from class: o.vpf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51519voZ.AkhnZx((java.lang.String) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final java.lang.String gEmmrt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "LOCAL_TRADER")) {
            return C33070mpX.AYXKKw(C48033uCm.Fragment.zEkrwr);
        }
        return C33070mpX.AYXKKw(C55688xof.Application.OWSZPf);
    }

    public static final java.lang.String AYXKKw(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33069mpW.copydefault(C55688xof.Application.OeZisf, C56423yEv.EZpvd(C56390yDp.OLrzqt("dayRange", str)));
    }

    public static final java.lang.String valueOf(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33069mpW.copydefault(C55688xof.Application.gZKUVK, C56423yEv.EZpvd(C56390yDp.OLrzqt("pctRange", str)));
    }

    public static final java.lang.String djBIcL(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str + "x";
    }

    public static final java.lang.String AkhnZx(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33069mpW.copydefault(C55688xof.Application.gZKUVK, C56423yEv.EZpvd(C56390yDp.OLrzqt("pctRange", str)));
    }

    /* JADX INFO: renamed from: o.voZ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C51519voZ KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51519voZ c51519voZ) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c51519voZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                HomeStrategyFilterPresenter homeStrategyFilterPresenterOLrzqt = this.KWHzl.OLrzqt();
                HomeStrategyDropDownInfo value = this.KWHzl.OLrzqt().valueOf().getValue();
                java.util.List<java.lang.String> list = null;
                java.util.List<java.lang.String> coinList = value != null ? value.getCoinList() : null;
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> mapDjBIcL = this.KWHzl.OLrzqt().djBIcL();
                if (mapDjBIcL != null) {
                    java.lang.String strKWHzl = this.KWHzl.OLrzqt().KWHzl();
                    if (strKWHzl == null) {
                        strKWHzl = "";
                    }
                    list = mapDjBIcL.get(strKWHzl);
                }
                java.util.List<HomeStrategyFilterCoin> listEZpvd = homeStrategyFilterPresenterOLrzqt.EZpvd(coinList, list);
                if (listEZpvd == null) {
                    return;
                }
                C51550vpD c51550vpDOLrzqt = C51550vpD.Companion.OLrzqt(listEZpvd, this.KWHzl.new StateListAnimator());
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                C49662usl.EZpvd(c51550vpDOLrzqt, childFragmentManager, "CoinFilterSearchFragment");
            }
        }
    }

    /* JADX INFO: renamed from: o.voZ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C51519voZ AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51519voZ c51519voZ) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c51519voZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.fARcdN();
            }
        }
    }

    /* JADX INFO: renamed from: o.voZ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C51519voZ AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51519voZ c51519voZ) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c51519voZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strAEQbTJ;
            java.lang.String strAEQbTJ2;
            java.lang.String strAEQbTJ3;
            java.lang.String strAEQbTJ4;
            java.lang.String strAEQbTJ5;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                HomeStrategyFilterPresenter homeStrategyFilterPresenterOLrzqt = this.AEQbTJ.OLrzqt();
                java.lang.String coinName = this.AEQbTJ.OLrzqt().gEmmrt().getCoinName();
                if (coinName == null) {
                    coinName = "";
                }
                C51610vqK c51610vqKOLrzqt = C51519voZ.EZpvd(this.AEQbTJ).values.OLrzqt();
                if (c51610vqKOLrzqt == null || (strAEQbTJ = c51610vqKOLrzqt.AEQbTJ()) == null) {
                    strAEQbTJ = "";
                }
                C51610vqK c51610vqKOLrzqt2 = C51519voZ.EZpvd(this.AEQbTJ).isConnected.OLrzqt();
                if (c51610vqKOLrzqt2 == null || (strAEQbTJ2 = c51610vqKOLrzqt2.AEQbTJ()) == null) {
                    strAEQbTJ2 = "";
                }
                C51610vqK c51610vqKOLrzqt3 = C51519voZ.EZpvd(this.AEQbTJ).djBIcL.OLrzqt();
                if (c51610vqKOLrzqt3 == null || (strAEQbTJ3 = c51610vqKOLrzqt3.AEQbTJ()) == null) {
                    strAEQbTJ3 = "";
                }
                C51610vqK c51610vqKOLrzqt4 = C51519voZ.EZpvd(this.AEQbTJ).gEmmrt.OLrzqt();
                if (c51610vqKOLrzqt4 == null || (strAEQbTJ4 = c51610vqKOLrzqt4.AEQbTJ()) == null) {
                    strAEQbTJ4 = "";
                }
                C51610vqK c51610vqKOLrzqt5 = C51519voZ.EZpvd(this.AEQbTJ).copydefault.OLrzqt();
                if (c51610vqKOLrzqt5 == null || (strAEQbTJ5 = c51610vqKOLrzqt5.AEQbTJ()) == null) {
                    strAEQbTJ5 = "";
                }
                HomeStrategyDropDownInfo homeStrategyDropDownInfoCopydefault = homeStrategyFilterPresenterOLrzqt.copydefault(coinName, strAEQbTJ, strAEQbTJ2, strAEQbTJ3, strAEQbTJ4, strAEQbTJ5, "");
                androidx.fragment.app.FragmentManager parentFragmentManager = this.AEQbTJ.getParentFragmentManager();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("botFilterInfo", homeStrategyDropDownInfoCopydefault);
                Unit unit = Unit.INSTANCE;
                parentFragmentManager.setFragmentResult("botFilterInfo", bundle);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    private final void ejfBZ() {
        ConstraintLayout constraintLayout = values().KWHzl;
        constraintLayout.setOnClickListener(new ActionBar(constraintLayout, 1000L, this));
        C52794wYp c52794wYp = values().valueOf;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = values().AkhnZx;
        c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
        for (final C51614vqO c51614vqO : copydefault()) {
            c51614vqO.setClickCallback(new Function1() { // from class: o.vpd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51519voZ.AEQbTJ(c51614vqO, this, (C51610vqK) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.voZ$StateListAnimator */
    public static final class StateListAnimator implements Function1<HomeStrategyFilterCoin, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(HomeStrategyFilterCoin homeStrategyFilterCoin) {
            AEQbTJ(homeStrategyFilterCoin);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(HomeStrategyFilterCoin homeStrategyFilterCoin) {
            Intrinsics.checkNotNullParameter(homeStrategyFilterCoin, "");
            C51519voZ.this.OLrzqt().KWHzl(homeStrategyFilterCoin);
            C51519voZ.this.isConnected();
        }
    }

    public static final Unit AEQbTJ(C51614vqO c51614vqO, C51519voZ c51519voZ, C51610vqK c51610vqK) {
        Intrinsics.checkNotNullParameter(c51610vqK, "");
        if (Intrinsics.EZpvd(c51614vqO, c51519voZ.values().copydefault)) {
            c51519voZ.values(c51610vqK.AEQbTJ().length() == 0 ? "all" : "lead_trader");
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        HomeStrategyFilterCoin homeStrategyFilterCoinGEmmrt = OLrzqt().gEmmrt();
        java.lang.String coinName = homeStrategyFilterCoinGEmmrt.getCoinName();
        if ((coinName == null || coinName.length() == 0) && homeStrategyFilterCoinGEmmrt.getLocalCoinIcon() != null) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.AEQbTJ(requireContext()).OLrzqt(homeStrategyFilterCoinGEmmrt.getLocalCoinIcon()).OLrzqt((RX<?>) new C5448Sc().gEmmrt());
            java.lang.Integer localCoinIcon = homeStrategyFilterCoinGEmmrt.getLocalCoinIcon();
            c5335NtOLrzqt.KWHzl(localCoinIcon != null ? localCoinIcon.intValue() : C48033uCm.ActionBar.AkhnZx).EZpvd((android.widget.ImageView) values().OLrzqt);
        } else {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt2 = Glide.AEQbTJ(requireContext()).EZpvd(homeStrategyFilterCoinGEmmrt.getCoinIcon()).OLrzqt((RX<?>) new C5448Sc().gEmmrt());
            java.lang.Integer localCoinIcon2 = homeStrategyFilterCoinGEmmrt.getLocalCoinIcon();
            c5335NtOLrzqt2.KWHzl(localCoinIcon2 != null ? localCoinIcon2.intValue() : C48033uCm.ActionBar.AkhnZx).EZpvd((android.widget.ImageView) values().OLrzqt);
        }
        values().AEQbTJ.setText(homeStrategyFilterCoinGEmmrt.getShowCoinName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fARcdN() {
        OLrzqt().isConnected();
        java.util.Iterator<T> it = copydefault().iterator();
        while (it.hasNext()) {
            ((C51614vqO) it.next()).EZpvd();
        }
        isConnected();
    }

    public final java.util.List<C51614vqO> copydefault() {
        return yDY.gEmmrt(values().djBIcL, values().isConnected, values().values, values().copydefault, values().gEmmrt);
    }

    private final void values(final java.lang.String str) {
        C32866mlf.onEvent$default("TradingBot_BotMarketplace_SelectBotCreator_Click", (TrackChannel[]) null, new Function1() { // from class: o.vpe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51519voZ.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_creator", str, false, 4, null);
        return Unit.INSTANCE;
    }
}
