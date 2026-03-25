package o;

import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.uilab.item.OKRegularCell;
import com.okinc.unify_trade.biz.BotAmtData;
import com.okinc.unify_trade.bot.list.CardStyle;
import com.okinc.unify_trade.bot.list.FilterState;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C51459vnS;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vnS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51459vnS extends AbstractC51455vnO<uQR, BotOrderListPresenter> {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public BotAmtData AhwBna;
    public FilterState isConnected;
    public Function1<? super FilterState, Unit> values;
    public boolean DbNXlk = true;
    public final java.util.List<ActionBar> AYXKKw = new java.util.ArrayList();
    public final java.util.List<ActionBar> valueOf = new java.util.ArrayList();
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.vnX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C51459vnS.EZpvd(this.OLrzqt));
        }
    });
    public final boolean fetchVPNInfo = true;

    /* JADX INFO: renamed from: o.vnS$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CardStyle.values().length];
            try {
                iArr[CardStyle.MINI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CardStyle.DETAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CardStyle.NO_IMAGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.sVXHln;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super FilterState, Unit> function1) {
        this.values = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(BotAmtData botAmtData) {
        this.AhwBna = botAmtData;
    }

    @Override // o.AbstractC49945uyC
    public boolean fetchVPNInfo() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.fetchVPNInfo;
    }

    /* JADX INFO: renamed from: o.vnS$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vnS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C51459vnS KWHzl(@NotNull FilterState filterState, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(filterState, "");
            C51459vnS c51459vnS = new C51459vnS();
            c51459vnS.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("FILTER_STATE_ID", filterState), C56390yDp.OLrzqt("IS_HISTORY_KEY", java.lang.Boolean.valueOf(z2)), C56390yDp.OLrzqt("SHOW_COIN_LIST_KEY", java.lang.Boolean.valueOf(z))));
            return c51459vnS;
        }
    }

    private final boolean uzCIH() {
        return ((java.lang.Boolean) this.AkhnZx.getValue()).booleanValue();
    }

    public static final boolean EZpvd(C51459vnS c51459vnS) {
        android.os.Bundle arguments = c51459vnS.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("IS_HISTORY_KEY");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(android.os.Bundle bundle) {
        FilterState filterState;
        java.lang.Object parcelable;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null) {
            filterState = new FilterState((java.util.List) null, (java.lang.String) null, (CardStyle) null, 7, (DefaultConstructorMarker) null);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = arguments.getParcelable("FILTER_STATE_ID", FilterState.class);
            } else {
                java.lang.Object parcelable2 = arguments.getParcelable("FILTER_STATE_ID");
                if (!(parcelable2 instanceof FilterState)) {
                    parcelable2 = null;
                }
                parcelable = (FilterState) parcelable2;
            }
            filterState = (FilterState) parcelable;
            if (filterState == null) {
            }
        }
        this.isConnected = filterState;
        android.os.Bundle arguments2 = getArguments();
        this.DbNXlk = arguments2 != null ? arguments2.getBoolean("SHOW_COIN_LIST_KEY") : true;
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(2);
        wxq.valueOf().setVisibility(0);
        wxq.AYXKKw().setVisibility(0);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2_Parcel));
        wxq.EZpvd().setVisibility(8);
        wxq.KWHzl().setVisibility(8);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getNewProxyInstance();
        fARcdN();
        fIwbmz();
        hDKMBd();
        if (this.DbNXlk) {
            KWHzl(C55875xsG.copydefault.AEQbTJ());
        }
        C32866mlf.onEvent$default("BotDetails_StylesFilters_ALL_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.vnS$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Object objOLrzqt = ((C55276xgr) t2).OLrzqt();
            kotlin.Pair pair = objOLrzqt instanceof kotlin.Pair ? (kotlin.Pair) objOLrzqt : null;
            java.lang.Object second = pair != null ? pair.getSecond() : null;
            java.lang.Integer num = second instanceof java.lang.Integer ? (java.lang.Integer) second : null;
            int iIntValue = num != null ? num.intValue() : 0;
            java.lang.Object objOLrzqt2 = ((C55276xgr) t).OLrzqt();
            kotlin.Pair pair2 = objOLrzqt2 instanceof kotlin.Pair ? (kotlin.Pair) objOLrzqt2 : null;
            java.lang.Object second2 = pair2 != null ? pair2.getSecond() : null;
            java.lang.Integer num2 = second2 instanceof java.lang.Integer ? (java.lang.Integer) second2 : null;
            return yET.KWHzl(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherKt));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.vnV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51459vnS.isConnected(this.AEQbTJ, view);
                }
            });
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.voa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51459vnS.AkhnZx(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void isConnected(final C51459vnS c51459vnS, android.view.View view) {
        c51459vnS.fJNWhG();
        FilterState filterState = null;
        C32866mlf.onEvent$default("BotDetails_StylesFilters_Confirm_Click", (TrackChannel[]) null, new Function1() { // from class: o.vnR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51459vnS.OLrzqt(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        Function1<? super FilterState, Unit> function1 = c51459vnS.values;
        if (function1 != null) {
            FilterState filterState2 = c51459vnS.isConnected;
            if (filterState2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                filterState = filterState2;
            }
            function1.invoke(filterState);
        }
        c51459vnS.dismissAllowingStateLoss();
    }

    public static final Unit OLrzqt(C51459vnS c51459vnS, EventParamsList eventParamsList) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        FilterState filterState = c51459vnS.isConnected;
        if (filterState == null) {
            Intrinsics.gEmmrt("");
            filterState = null;
        }
        int i = Activity.AEQbTJ[filterState.getCardStyle().ordinal()];
        if (i == 1) {
            str = "mini";
        } else if (i == 2) {
            str = "full";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "compact";
        }
        EventParamsList.put$default(eventParamsList, "styles", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(C51459vnS c51459vnS, android.view.View view) {
        c51459vnS.dismissAllowingStateLoss();
    }

    private final void fARcdN() {
        FilterState filterState = this.isConnected;
        if (filterState == null) {
            Intrinsics.gEmmrt("");
            filterState = null;
        }
        copydefault(filterState.getCardStyle());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(boolean z) {
        RecyclerView recyclerView = ((uQR) values()).copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(z ? 0 : 8);
        AppCompatImageView appCompatImageView = ((uQR) values()).OLrzqt;
        RecyclerView recyclerView2 = ((uQR) values()).copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        appCompatImageView.setImageResource(recyclerView2.getVisibility() == 0 ? C52761wXj.TaskDescription.UrRBLY : C52761wXj.TaskDescription.QIZEnU);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fIwbmz() {
        ((uQR) values()).valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.vnZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51459vnS.valueOf(this.OLrzqt, view);
            }
        });
        ((uQR) values()).djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.vod
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51459vnS.djBIcL(this.copydefault, view);
            }
        });
        ((uQR) values()).AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.vof
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51459vnS.AhwBna(this.KWHzl, view);
            }
        });
        ((uQR) values()).AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.vob
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51459vnS.AYXKKw(this.EZpvd, view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void valueOf(C51459vnS c51459vnS, android.view.View view) {
        RecyclerView recyclerView = ((uQR) c51459vnS.values()).copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        c51459vnS.KWHzl(!(recyclerView.getVisibility() == 0));
        C55875xsG c55875xsG = C55875xsG.copydefault;
        RecyclerView recyclerView2 = ((uQR) c51459vnS.values()).copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        c55875xsG.EZpvd(recyclerView2.getVisibility() == 0);
    }

    public static final void djBIcL(C51459vnS c51459vnS, android.view.View view) {
        FilterState filterState;
        FilterState filterState2 = null;
        C32866mlf.onEvent$default("BotDetails_StylesFilters_Styles_Click", (TrackChannel[]) null, new Function1() { // from class: o.vnW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51459vnS.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        FilterState filterState3 = c51459vnS.isConnected;
        if (filterState3 == null) {
            Intrinsics.gEmmrt("");
            filterState = null;
        } else {
            filterState = filterState3;
        }
        FilterState filterStateCopy$default = FilterState.copy$default(filterState, null, null, CardStyle.DETAILED, 3, null);
        c51459vnS.isConnected = filterStateCopy$default;
        if (filterStateCopy$default == null) {
            Intrinsics.gEmmrt("");
        } else {
            filterState2 = filterStateCopy$default;
        }
        c51459vnS.copydefault(filterState2.getCardStyle());
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "styles", "full", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(C51459vnS c51459vnS, android.view.View view) {
        FilterState filterState;
        FilterState filterState2 = null;
        C32866mlf.onEvent$default("BotDetails_StylesFilters_Styles_Click", (TrackChannel[]) null, new Function1() { // from class: o.vnT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51459vnS.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        FilterState filterState3 = c51459vnS.isConnected;
        if (filterState3 == null) {
            Intrinsics.gEmmrt("");
            filterState = null;
        } else {
            filterState = filterState3;
        }
        FilterState filterStateCopy$default = FilterState.copy$default(filterState, null, null, CardStyle.NO_IMAGE, 3, null);
        c51459vnS.isConnected = filterStateCopy$default;
        if (filterStateCopy$default == null) {
            Intrinsics.gEmmrt("");
        } else {
            filterState2 = filterStateCopy$default;
        }
        c51459vnS.copydefault(filterState2.getCardStyle());
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "styles", "compact", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(C51459vnS c51459vnS, android.view.View view) {
        FilterState filterState;
        FilterState filterState2 = null;
        C32866mlf.onEvent$default("BotDetails_StylesFilters_Styles_Click", (TrackChannel[]) null, new Function1() { // from class: o.vnY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51459vnS.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        FilterState filterState3 = c51459vnS.isConnected;
        if (filterState3 == null) {
            Intrinsics.gEmmrt("");
            filterState = null;
        } else {
            filterState = filterState3;
        }
        FilterState filterStateCopy$default = FilterState.copy$default(filterState, null, null, CardStyle.MINI, 3, null);
        c51459vnS.isConnected = filterStateCopy$default;
        if (filterStateCopy$default == null) {
            Intrinsics.gEmmrt("");
        } else {
            filterState2 = filterStateCopy$default;
        }
        c51459vnS.copydefault(filterState2.getCardStyle());
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "styles", "mini", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        FilterState filterState;
        FilterState filterStateCopy$default;
        FilterState filterState2;
        FilterState filterState3;
        FilterState filterStateCopy$default2;
        FilterState filterState4;
        java.lang.String strOLrzqt;
        FilterState filterState5;
        FilterState filterState6;
        java.lang.Object obj = null;
        if (((uQR) values()).djBIcL.isSelected()) {
            FilterState filterState7 = this.isConnected;
            if (filterState7 == null) {
                Intrinsics.gEmmrt("");
                filterState6 = null;
            } else {
                filterState6 = filterState7;
            }
            filterStateCopy$default = FilterState.copy$default(filterState6, null, null, CardStyle.DETAILED, 3, null);
        } else if (((uQR) values()).AYXKKw.isSelected()) {
            FilterState filterState8 = this.isConnected;
            if (filterState8 == null) {
                Intrinsics.gEmmrt("");
                filterState2 = null;
            } else {
                filterState2 = filterState8;
            }
            filterStateCopy$default = FilterState.copy$default(filterState2, null, null, CardStyle.NO_IMAGE, 3, null);
        } else {
            FilterState filterState9 = this.isConnected;
            if (filterState9 == null) {
                Intrinsics.gEmmrt("");
                filterState = null;
            } else {
                filterState = filterState9;
            }
            filterStateCopy$default = FilterState.copy$default(filterState, null, null, CardStyle.MINI, 3, null);
        }
        this.isConnected = filterStateCopy$default;
        ActionBar actionBar = (ActionBar) CollectionsKt___CollectionsKt.AkhnZx(this.AYXKKw, 0);
        if (actionBar == null || !actionBar.copydefault()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ActionBar actionBar2 : this.AYXKKw) {
                if (actionBar2.copydefault() && !Intrinsics.EZpvd((java.lang.Object) actionBar2.OLrzqt(), (java.lang.Object) "all_coins")) {
                    arrayList.add(actionBar2.OLrzqt());
                }
            }
            FilterState filterState10 = this.isConnected;
            if (filterState10 == null) {
                Intrinsics.gEmmrt("");
                filterState3 = null;
            } else {
                filterState3 = filterState10;
            }
            filterStateCopy$default2 = FilterState.copy$default(filterState3, arrayList, null, null, 6, null);
        } else {
            FilterState filterState11 = this.isConnected;
            if (filterState11 == null) {
                Intrinsics.gEmmrt("");
                filterState5 = null;
            } else {
                filterState5 = filterState11;
            }
            filterStateCopy$default2 = FilterState.copy$default(filterState5, yDY.AhwBna(), null, null, 6, null);
        }
        this.isConnected = filterStateCopy$default2;
        if (filterStateCopy$default2 == null) {
            Intrinsics.gEmmrt("");
            filterState4 = null;
        } else {
            filterState4 = filterStateCopy$default2;
        }
        java.util.Iterator<T> it = this.valueOf.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((ActionBar) next).copydefault()) {
                obj = next;
                break;
            }
        }
        ActionBar actionBar3 = (ActionBar) obj;
        if (actionBar3 == null || (strOLrzqt = actionBar3.OLrzqt()) == null) {
            strOLrzqt = "all_bot";
        }
        this.isConnected = FilterState.copy$default(filterState4, null, strOLrzqt, null, 5, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v24, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v28, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v31, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v34, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v37, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(CardStyle cardStyle) {
        int i = Activity.AEQbTJ[cardStyle.ordinal()];
        if (i == 1) {
            ((uQR) values()).djBIcL.setSelected(false);
            ((uQR) values()).AYXKKw.setSelected(false);
            ((uQR) values()).AhwBna.setSelected(true);
            ((uQR) values()).KWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.ResultReceiver1));
            return;
        }
        if (i == 2) {
            ((uQR) values()).djBIcL.setSelected(true);
            ((uQR) values()).AYXKKw.setSelected(false);
            ((uQR) values()).AhwBna.setSelected(false);
            ((uQR) values()).KWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.ResultReceiverMyResultReceiver));
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ((uQR) values()).djBIcL.setSelected(false);
        ((uQR) values()).AYXKKw.setSelected(true);
        ((uQR) values()).AhwBna.setSelected(false);
        ((uQR) values()).KWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.ResultReceiver));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getNewProxyInstance() {
        ((uQR) values()).copydefault.setLayoutManager(new LinearLayoutManager(requireContext()));
        ((uQR) values()).copydefault.setNestedScrollingEnabled(false);
        ((uQR) values()).AEQbTJ.setLayoutManager(new LinearLayoutManager(requireContext()));
        ((uQR) values()).AEQbTJ.setNestedScrollingEnabled(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void hDKMBd() {
        boolean z;
        BotAmtData botAmtData = this.AhwBna;
        if (botAmtData == null) {
            return;
        }
        this.AYXKKw.clear();
        if (this.DbNXlk) {
            RecyclerView recyclerView = ((uQR) values()).copydefault;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(0);
            android.widget.LinearLayout linearLayout = ((uQR) values()).valueOf;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            android.view.View view = ((uQR) values()).gEmmrt;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            java.util.List<ActionBar> list = this.AYXKKw;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.iWlNch);
            FilterState filterState = this.isConnected;
            if (filterState == null) {
                Intrinsics.gEmmrt("");
                filterState = null;
            }
            if (!filterState.getSelectedCurrencyIds().isEmpty()) {
                int size = botAmtData.getCoinsMap().size();
                FilterState filterState2 = this.isConnected;
                if (filterState2 == null) {
                    Intrinsics.gEmmrt("");
                    filterState2 = null;
                }
                boolean z2 = size <= filterState2.getSelectedCurrencyIds().size();
                list.add(new ActionBar("all_coins", strAYXKKw, null, "", z2, 4, null));
                java.util.Iterator<Map.Entry<java.lang.String, java.lang.Integer>> it = botAmtData.getCoinsMap().entrySet().iterator();
                while (it.hasNext()) {
                    java.lang.String key = it.next().getKey();
                    java.util.List<ActionBar> list2 = this.AYXKKw;
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    java.lang.String strValueOf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(key) : null;
                    FilterState filterState3 = this.isConnected;
                    if (filterState3 == null) {
                        Intrinsics.gEmmrt("");
                        filterState3 = null;
                    }
                    if (filterState3.getSelectedCurrencyIds().contains(key)) {
                        z = true;
                    } else {
                        FilterState filterState4 = this.isConnected;
                        if (filterState4 == null) {
                            Intrinsics.gEmmrt("");
                            filterState4 = null;
                        }
                        if (!filterState4.getSelectedCurrencyIds().isEmpty()) {
                            z = false;
                        }
                    }
                    list2.add(new ActionBar(key, key, null, strValueOf, z, 4, null));
                }
                ((uQR) values()).copydefault.setAdapter(new TaskDescription(this, this.AYXKKw, true, new Function1() { // from class: o.voc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C51459vnS.copydefault(this.AEQbTJ, (java.lang.String) obj);
                    }
                }));
                RecyclerView.Adapter adapter = ((uQR) values()).copydefault.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        } else {
            RecyclerView recyclerView2 = ((uQR) values()).copydefault;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setVisibility(8);
            android.widget.LinearLayout linearLayout2 = ((uQR) values()).valueOf;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
            android.view.View view2 = ((uQR) values()).gEmmrt;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(8);
        }
        this.valueOf.clear();
        for (C55276xgr c55276xgr : CollectionsKt___CollectionsKt.EZpvd(((BotOrderListPresenter) OLrzqt()).KWHzl(), new StateListAnimator())) {
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            kotlin.Pair pair = objOLrzqt instanceof kotlin.Pair ? (kotlin.Pair) objOLrzqt : null;
            java.lang.Object first = pair != null ? pair.getFirst() : null;
            java.lang.String str = first instanceof java.lang.String ? (java.lang.String) first : null;
            if (str == null) {
                str = "all_bot";
            }
            java.lang.String str2 = str;
            java.lang.Object objOLrzqt2 = c55276xgr.OLrzqt();
            kotlin.Pair pair2 = objOLrzqt2 instanceof kotlin.Pair ? (kotlin.Pair) objOLrzqt2 : null;
            java.lang.Object second = pair2 != null ? pair2.getSecond() : null;
            java.lang.Integer num = second instanceof java.lang.Integer ? (java.lang.Integer) second : null;
            int iIntValue = num != null ? num.intValue() : 0;
            if (uzCIH() || iIntValue > 0) {
                C51469vnc c51469vncConvertSelectBotConfig$default = C51468vnb.convertSelectBotConfig$default(str2, false, 2, null);
                int iCopydefault = c51469vncConvertSelectBotConfig$default != null ? c51469vncConvertSelectBotConfig$default.copydefault() : C52761wXj.TaskDescription.DDxOgT;
                java.util.List<ActionBar> list3 = this.valueOf;
                java.lang.String string = c55276xgr.AhwBna().toString();
                FilterState filterState5 = this.isConnected;
                if (filterState5 == null) {
                    Intrinsics.gEmmrt("");
                    filterState5 = null;
                }
                list3.add(new ActionBar(str2, string, java.lang.Integer.valueOf(iCopydefault), null, Intrinsics.EZpvd((java.lang.Object) filterState5.getSelectedBotTypeId(), (java.lang.Object) str2)));
            }
        }
        ((uQR) values()).AEQbTJ.setAdapter(new TaskDescription(this, this.valueOf, false, new Function1() { // from class: o.vnU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51459vnS.EZpvd(this.KWHzl, (java.lang.String) obj);
            }
        }));
        RecyclerView.Adapter adapter2 = ((uQR) values()).AEQbTJ.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C51459vnS c51459vnS, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        int i;
        int i2;
        Unit unit;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "all_coins")) {
                c51459vnS.AYXKKw.get(0).KWHzl(!c51459vnS.AYXKKw.get(0).copydefault());
                if (c51459vnS.AYXKKw.get(0).copydefault()) {
                    int size = c51459vnS.AYXKKw.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        c51459vnS.AYXKKw.get(i3).KWHzl(true);
                    }
                } else {
                    c51459vnS.AYXKKw.get(1).KWHzl(true);
                    int size2 = c51459vnS.AYXKKw.size();
                    for (int i4 = 2; i4 < size2; i4++) {
                        c51459vnS.AYXKKw.get(i4).KWHzl(false);
                    }
                }
            } else {
                java.util.List<ActionBar> list = c51459vnS.AYXKKw;
                if ((list instanceof java.util.Collection) && list.isEmpty()) {
                    i = 0;
                } else {
                    java.util.Iterator<T> it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((ActionBar) it.next()).copydefault() && (i = i + 1) < 0) {
                            yDY.djBIcL();
                        }
                    }
                }
                java.util.Iterator<ActionBar> it2 = c51459vnS.AYXKKw.iterator();
                int i5 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) it2.next().OLrzqt(), (java.lang.Object) str)) {
                        break;
                    }
                    i5++;
                }
                if (i > 1) {
                    c51459vnS.AYXKKw.get(i5).KWHzl(!c51459vnS.AYXKKw.get(i5).copydefault());
                } else if (!c51459vnS.AYXKKw.get(i5).copydefault()) {
                    c51459vnS.AYXKKw.get(i5).KWHzl(true);
                } else {
                    C55326xho.toast$default(C55688xof.Application.sSMYrx, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                }
            }
            ActionBar actionBar = c51459vnS.AYXKKw.get(0);
            java.util.List<ActionBar> list2 = c51459vnS.AYXKKw;
            if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (ActionBar actionBar2 : list2) {
                    if (actionBar2.copydefault() && !Intrinsics.EZpvd((java.lang.Object) actionBar2.OLrzqt(), (java.lang.Object) "all_coins") && (i2 = i2 + 1) < 0) {
                        yDY.djBIcL();
                    }
                }
            }
            actionBar.KWHzl(i2 >= c51459vnS.AYXKKw.size() - 1);
            RecyclerView.Adapter adapter = ((uQR) c51459vnS.values()).copydefault.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("StylesAndFiltersBottomSheet", java.lang.String.valueOf(thM7380exceptionOrNullimpl.getMessage()));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C51459vnS c51459vnS, java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = c51459vnS.valueOf.iterator();
        while (it.hasNext()) {
            ((ActionBar) it.next()).KWHzl(false);
        }
        java.util.Iterator<T> it2 = c51459vnS.valueOf.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((ActionBar) next).OLrzqt(), (java.lang.Object) str)) {
                break;
            }
        }
        ActionBar actionBar = (ActionBar) next;
        if (actionBar != null) {
            actionBar.KWHzl(true);
        }
        RecyclerView.Adapter adapter = ((uQR) c51459vnS.values()).AEQbTJ.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vnS$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.Integer KWHzl;
        public final java.lang.String OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.EZpvd;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                num = actionBar.KWHzl;
            }
            java.lang.Integer num2 = num;
            if ((i & 8) != 0) {
                str3 = actionBar.AEQbTJ;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                z = actionBar.copydefault;
            }
            return actionBar.copydefault(str, str4, num2, str5, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.copydefault = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num, java.lang.String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(str, str2, num, str3, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && this.copydefault == actionBar.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            java.lang.Integer num = this.KWHzl;
            int iHashCode3 = num == null ? 0 : num.hashCode();
            java.lang.String str = this.AEQbTJ;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FilterItem(id=" + this.OLrzqt + ", name=" + this.EZpvd + ", localIcon=" + this.KWHzl + ", iconUrl=" + this.AEQbTJ + ", isSelected=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num, java.lang.String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.EZpvd = str2;
            this.KWHzl = num;
            this.AEQbTJ = str3;
            this.copydefault = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, boolean):void (m)] (LINE:371) call: o.vnS.ActionBar.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.vnS$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public final class TaskDescription extends RecyclerView.Adapter<Activity> {
        public final boolean EZpvd;
        public final /* synthetic */ C51459vnS KWHzl;
        public final Function1<java.lang.String, Unit> OLrzqt;
        public final java.util.List<ActionBar> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull C51459vnS c51459vnS, java.util.List<ActionBar> list, @NotNull boolean z, Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = c51459vnS;
            this.copydefault = list;
            this.EZpvd = z;
            this.OLrzqt = function1;
        }

        /* JADX INFO: renamed from: o.vnS$TaskDescription$Activity */
        public final class Activity extends RecyclerView.ViewHolder {
            public final android.widget.ImageView AEQbTJ;
            public final /* synthetic */ TaskDescription KWHzl;
            public final OKRegularCell copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKRegularCell KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.ImageView copydefault() {
                return this.AEQbTJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull TaskDescription taskDescription, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.KWHzl = taskDescription;
                android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.DcMfJKdMCrTj);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.copydefault = (OKRegularCell) viewFindViewById;
                android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.getSmallIconBitmap);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.AEQbTJ = (android.widget.ImageView) viewFindViewById2;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C48033uCm.Activity.gtCCJH, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new Activity(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Activity activity, int i) {
            Intrinsics.checkNotNullParameter(activity, "");
            final ActionBar actionBar = this.copydefault.get(i);
            activity.KWHzl().setTitle(actionBar.KWHzl());
            if (actionBar.copydefault()) {
                activity.copydefault().setVisibility(0);
                activity.copydefault().setImageResource(C52761wXj.TaskDescription.fVjYLc);
            } else if (this.EZpvd) {
                activity.copydefault().setVisibility(0);
                activity.copydefault().setImageResource(C52761wXj.TaskDescription.dbwnZN);
            } else {
                activity.copydefault().setVisibility(8);
            }
            if (actionBar.AEQbTJ() == null) {
                if (actionBar.EZpvd() != null) {
                    activity.KWHzl().setIcon(C33070mpX.KWHzl(actionBar.EZpvd().intValue()));
                } else {
                    activity.KWHzl().setIcon(C33070mpX.KWHzl(C48033uCm.ActionBar.AkhnZx));
                }
            } else {
                activity.KWHzl().OLrzqt().setVisibility(0);
                Intrinsics.copydefault(Glide.AEQbTJ(this.KWHzl.requireContext()).EZpvd(actionBar.AEQbTJ()).OLrzqt((RX<?>) new C5448Sc().KWHzl(C48033uCm.ActionBar.AkhnZx).copydefault(C48033uCm.ActionBar.AkhnZx)).EZpvd(activity.KWHzl().OLrzqt()));
            }
            activity.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.voe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51459vnS.TaskDescription.KWHzl(this.KWHzl, actionBar, view);
                }
            });
        }

        public static final void KWHzl(TaskDescription taskDescription, ActionBar actionBar, android.view.View view) {
            taskDescription.OLrzqt.invoke(actionBar.OLrzqt());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.copydefault.size();
        }
    }
}
