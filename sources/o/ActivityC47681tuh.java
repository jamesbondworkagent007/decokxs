package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_content.leaderboard.TopTraderFilterBottomSheet;
import com.okinc.planet.biz_content.leaderboard.adapter.TopTradersAdapterSource;
import com.okinc.planet.biz_content.leaderboard.bean.Rank;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC47681tuh;
import o.C47501trL;
import o.C47657tuJ;

/* JADX INFO: renamed from: o.tuh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC47681tuh extends AbstractActivityC33041mov {
    public C46261tNu AEQbTJ;
    public boolean KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public C47657tuJ copydefault;

    /* JADX INFO: renamed from: o.tuh$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.tuh$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StatefulView.Status.values().length];
            try {
                iArr[StatefulView.Status.Error.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StatefulView.Status.Empty.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[StatefulView.Status.Content.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    public static final boolean AEQbTJ() {
        return true;
    }

    public static final boolean OLrzqt() {
        return true;
    }

    public ActivityC47681tuh() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C47672tuY.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.leaderboard.activity.TopTradersActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.leaderboard.activity.TopTradersActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.leaderboard.activity.TopTradersActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C47672tuY KWHzl() {
        return (C47672tuY) this.OLrzqt.getValue();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46261tNu c46261tNuEZpvd = C46261tNu.EZpvd(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c46261tNuEZpvd, "");
        setContentView(c46261tNuEZpvd.getRoot());
        this.AEQbTJ = c46261tNuEZpvd;
        C32866mlf.onEvent$default("Orbit_Toptrader_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.tuk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47681tuh.AEQbTJ(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        final C46261tNu c46261tNu = this.AEQbTJ;
        if (c46261tNu == null) {
            Intrinsics.gEmmrt("");
            c46261tNu = null;
        }
        final C54982xbO c54982xbO = new C54982xbO(KWHzl().OLrzqt(), null, null, false, false, new Function0() { // from class: o.tui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ActivityC47681tuh.OLrzqt());
            }
        }, null, null, null, null, null, null, null, null, null, null, null, null, null, 524254, null);
        final C54982xbO c54982xbO2 = new C54982xbO(KWHzl().copydefault(), null, null, false, false, new Function0() { // from class: o.tup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ActivityC47681tuh.AEQbTJ());
            }
        }, null, null, null, null, null, null, null, null, null, null, null, null, null, 524254, null);
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(c54982xbO, c54982xbO2);
        c46261tNu.OLrzqt.KWHzl().copydefault.setVisibility(8);
        C54990xbW.setData$default(c46261tNu.OLrzqt, arrayListCopydefault, new Function2() { // from class: o.tuq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC47681tuh.copydefault(this.EZpvd, c54982xbO, c46261tNu, c54982xbO2, (TabLayout.Tab) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, null, new Function2() { // from class: o.tuo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC47681tuh.EZpvd(this.AEQbTJ, c54982xbO, c46261tNu, c54982xbO2, (TabLayout.Tab) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, 4, null);
        C55047xca c55047xcaOLrzqt = c46261tNu.OLrzqt.OLrzqt();
        int tabCount = c55047xcaOLrzqt.getTabCount() - 1;
        if (tabCount >= 0) {
            int i = 0;
            while (true) {
                TabLayout.Tab tabAt = c55047xcaOLrzqt.getTabAt(i);
                if (tabAt != null) {
                    tabAt.setContentDescription("tab_" + i);
                }
                if (i == tabCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        C33537myN c33537myN = c46261tNu.valueOf;
        android.widget.ImageView backImage = c33537myN.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            c33537myN.setBackListener(new View.OnClickListener() { // from class: o.tuv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47681tuh.EZpvd(this.OLrzqt, view);
                }
            });
            c33537myN.setSubDoListener(new View.OnClickListener() { // from class: o.tut
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47681tuh.KWHzl(this.EZpvd, view);
                }
            });
            c33537myN.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.svhCHd));
            C47657tuJ c47657tuJ = new C47657tuJ(TopTradersAdapterSource.ACTIVITY);
            this.copydefault = c47657tuJ;
            c47657tuJ.KWHzl(new StateListAnimator());
            c46261tNu.copydefault.setLayoutManager(new LinearLayoutManager(this, 1, false));
            c46261tNu.copydefault.addItemDecoration(new ActionBar());
            RecyclerView recyclerView = c46261tNu.copydefault;
            C47657tuJ c47657tuJ2 = this.copydefault;
            if (c47657tuJ2 == null) {
                Intrinsics.gEmmrt("");
                c47657tuJ2 = null;
            }
            recyclerView.setAdapter(c47657tuJ2);
            C33546myW c33546myW = c46261tNu.AEQbTJ;
            c33546myW.AhwBna(true);
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.tur
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    ActivityC47681tuh.AEQbTJ(this.AEQbTJ, interfaceC57934yrl);
                }
            });
            c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.tus
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    ActivityC47681tuh.EZpvd(this.EZpvd, interfaceC57934yrl);
                }
            });
            gEmmrt();
            C47672tuY.loadData$default(KWHzl(), false, 1, null);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final Unit AEQbTJ(ActivityC47681tuh activityC47681tuh, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strEZpvd = activityC47681tuh.KWHzl().EZpvd();
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) TopTraderFilterBottomSheet.SelectionPNL.PNL_VALUE.getValue())) {
            EventParamsList.put$default(eventParamsList, "ranking_method", "pnl", false, 4, null);
        } else if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) TopTraderFilterBottomSheet.SelectionPNL.PNL_PERCENTAGE.getValue())) {
            EventParamsList.put$default(eventParamsList, "ranking_method", "pnl%", false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "period_filter_option", activityC47681tuh.KWHzl().AEQbTJ(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC47681tuh activityC47681tuh, C54982xbO c54982xbO, C46261tNu c46261tNu, int i) {
        activityC47681tuh.KWHzl().EZpvd(true);
        c54982xbO.EZpvd(false);
        c46261tNu.OLrzqt.OLrzqt().selectTab(null);
        C54990xbW c54990xbW = c46261tNu.OLrzqt;
        c54982xbO.EZpvd(activityC47681tuh.KWHzl().OLrzqt());
        Unit unit = Unit.INSTANCE;
        c54990xbW.OLrzqt(i, c54982xbO);
        return unit;
    }

    public static final void OLrzqt(final ActivityC47681tuh activityC47681tuh, final C54982xbO c54982xbO, final C46261tNu c46261tNu, final C54982xbO c54982xbO2, final int i) {
        if (i == 0) {
            TopTraderFilterBottomSheet.SelectionPNL selectionPNL = TopTraderFilterBottomSheet.SelectionPNL.PNL_VALUE;
            C55276xgr c55276xgr = new C55276xgr(selectionPNL.getDesc(), selectionPNL, null, false, false, null, null, 124, null);
            TopTraderFilterBottomSheet.SelectionPNL selectionPNL2 = TopTraderFilterBottomSheet.SelectionPNL.PNL_PERCENTAGE;
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(c55276xgr, new C55276xgr(selectionPNL2.getDesc(), selectionPNL2, null, false, false, null, null, 124, null));
            TopTraderFilterBottomSheet.Activity activity = TopTraderFilterBottomSheet.Companion;
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC47681tuh.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            activity.KWHzl(arrayListCopydefault, supportFragmentManager, new Function0() { // from class: o.tuu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC47681tuh.OLrzqt(this.AEQbTJ, c54982xbO, c46261tNu, i);
                }
            });
            return;
        }
        if (i != 1) {
            return;
        }
        TopTraderFilterBottomSheet.SelectionDays selectionDays = TopTraderFilterBottomSheet.SelectionDays.DAY_7;
        C55276xgr c55276xgr2 = new C55276xgr(selectionDays.getDesc(), selectionDays, null, false, false, null, null, 124, null);
        TopTraderFilterBottomSheet.SelectionDays selectionDays2 = TopTraderFilterBottomSheet.SelectionDays.DAY_30;
        C55276xgr c55276xgr3 = new C55276xgr(selectionDays2.getDesc(), selectionDays2, null, false, false, null, null, 124, null);
        TopTraderFilterBottomSheet.SelectionDays selectionDays3 = TopTraderFilterBottomSheet.SelectionDays.DAY_90;
        C55276xgr c55276xgr4 = new C55276xgr(selectionDays3.getDesc(), selectionDays3, null, false, false, null, null, 124, null);
        TopTraderFilterBottomSheet.SelectionDays selectionDays4 = TopTraderFilterBottomSheet.SelectionDays.YEAR_1;
        java.util.ArrayList arrayListCopydefault2 = yDY.copydefault(c55276xgr2, c55276xgr3, c55276xgr4, new C55276xgr(selectionDays4.getDesc(), selectionDays4, null, false, false, null, null, 124, null));
        TopTraderFilterBottomSheet.Activity activity2 = TopTraderFilterBottomSheet.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager2 = activityC47681tuh.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        activity2.KWHzl(arrayListCopydefault2, supportFragmentManager2, new Function0() { // from class: o.tul
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC47681tuh.copydefault(this.KWHzl, c54982xbO2, c46261tNu, i);
            }
        });
    }

    public static final Unit copydefault(ActivityC47681tuh activityC47681tuh, C54982xbO c54982xbO, C46261tNu c46261tNu, int i) {
        activityC47681tuh.KWHzl().EZpvd(true);
        c54982xbO.EZpvd(false);
        c46261tNu.OLrzqt.OLrzqt().selectTab(null);
        C54990xbW c54990xbW = c46261tNu.OLrzqt;
        c54982xbO.EZpvd(activityC47681tuh.KWHzl().copydefault());
        Unit unit = Unit.INSTANCE;
        c54990xbW.OLrzqt(i, c54982xbO);
        return unit;
    }

    public static final Unit copydefault(ActivityC47681tuh activityC47681tuh, C54982xbO c54982xbO, C46261tNu c46261tNu, C54982xbO c54982xbO2, TabLayout.Tab tab, int i) {
        OLrzqt(activityC47681tuh, c54982xbO, c46261tNu, c54982xbO2, i);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC47681tuh activityC47681tuh, C54982xbO c54982xbO, C46261tNu c46261tNu, C54982xbO c54982xbO2, TabLayout.Tab tab, int i) {
        OLrzqt(activityC47681tuh, c54982xbO, c46261tNu, c54982xbO2, i);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ActivityC47681tuh activityC47681tuh, android.view.View view) {
        activityC47681tuh.finish();
    }

    public static final void KWHzl(ActivityC47681tuh activityC47681tuh, android.view.View view) {
        activityC47681tuh.startActivity(new android.content.Intent(activityC47681tuh, (java.lang.Class<?>) ActivityC47648tuA.class));
    }

    /* JADX INFO: renamed from: o.tuh$StateListAnimator */
    public static final class StateListAnimator implements C47657tuJ.StateListAnimator {
        public StateListAnimator() {
        }

        @Override // o.C47657tuJ.StateListAnimator
        public void OLrzqt(final Rank rank) {
            Intrinsics.checkNotNullParameter(rank, "");
            final ActivityC47681tuh activityC47681tuh = ActivityC47681tuh.this;
            C32866mlf.onEvent$default("Orbit_Toptrader_Card_View", (TrackChannel[]) null, new Function1() { // from class: o.tux
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC47681tuh.StateListAnimator.copydefault(activityC47681tuh, rank, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        public static final Unit copydefault(ActivityC47681tuh activityC47681tuh, Rank rank, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            java.lang.String strEZpvd = activityC47681tuh.KWHzl().EZpvd();
            if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) TopTraderFilterBottomSheet.SelectionPNL.PNL_VALUE.getValue())) {
                EventParamsList.put$default(eventParamsList, "ranking_method", "pnl", false, 4, null);
            } else if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) TopTraderFilterBottomSheet.SelectionPNL.PNL_PERCENTAGE.getValue())) {
                EventParamsList.put$default(eventParamsList, "ranking_method", "pnl%", false, 4, null);
            }
            EventParamsList.put$default(eventParamsList, "period_filter_option", activityC47681tuh.KWHzl().AEQbTJ(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "profile_id", C33129mqd.gEmmrt(rank.getAuthorId()), false, 4, null);
            EventParamsList.put$default(eventParamsList, "profile_name", C33129mqd.gEmmrt(rank.getNickName()), false, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.tuh$ActionBar */
    public static final class ActionBar extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition != -1) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (childAdapterPosition < (adapter != null ? adapter.getItemCount() : 0) - 1) {
                    rect.bottom = C55298xhM.dp2px$default(16.0f, null, 1, null);
                }
            }
        }
    }

    public static final void AEQbTJ(ActivityC47681tuh activityC47681tuh, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        activityC47681tuh.KWHzl().EZpvd(true);
    }

    public static final void EZpvd(ActivityC47681tuh activityC47681tuh, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        activityC47681tuh.KWHzl().EZpvd(false);
    }

    private final void gEmmrt() {
        KWHzl().AYXKKw().observe(this, new Activity(new Function1() { // from class: o.tum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47681tuh.AEQbTJ(this.EZpvd, (C47655tuH) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: o.tuJ */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: o.tuJ */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: o.tuJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC47681tuh activityC47681tuh, C47655tuH c47655tuH) {
        pUU.KWHzl("qjf", "TopTradersActivity->UIState->status:" + c47655tuH.EZpvd() + " size:" + c47655tuH.KWHzl().size() + " cursor:" + c47655tuH.OLrzqt());
        C46261tNu c46261tNu = activityC47681tuh.AEQbTJ;
        if (c46261tNu == null) {
            Intrinsics.gEmmrt("");
            c46261tNu = null;
        }
        C33546myW c33546myW = c46261tNu.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C46261tNu c46261tNu2 = activityC47681tuh.AEQbTJ;
        if (c46261tNu2 == null) {
            Intrinsics.gEmmrt("");
            c46261tNu2 = null;
        }
        C55237xgE c55237xgE = c46261tNu2.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
        int i = TaskDescription.OLrzqt[c47655tuH.EZpvd().ordinal()];
        if (i == 1) {
            activityC47681tuh.EZpvd(c55237xgE);
            c33546myW.AhwBna(false);
            c33546myW.AEQbTJ();
            if (!activityC47681tuh.KWHzl) {
                activityC47681tuh.KWHzl = true;
                rVN.reportFullyDrawn$default((android.app.Activity) activityC47681tuh, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (i == 2) {
            activityC47681tuh.EZpvd(c55237xgE);
            c33546myW.AhwBna(false);
            c33546myW.AEQbTJ();
            if (!activityC47681tuh.KWHzl) {
                activityC47681tuh.KWHzl = true;
                rVN.reportFullyDrawn$default((android.app.Activity) activityC47681tuh, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (i == 3) {
            c55237xgE.setStatus(StatefulView.Status.Content);
            if (c47655tuH.copydefault()) {
                if (c47655tuH.AEQbTJ()) {
                    c33546myW.AhwBna(true);
                    c33546myW.AEQbTJ();
                } else {
                    c33546myW.AhwBna(false);
                    c33546myW.OLrzqt();
                }
            } else if (c47655tuH.AEQbTJ()) {
                c33546myW.AhwBna(true);
                c33546myW.valueOf();
            } else {
                c33546myW.AhwBna(false);
                c33546myW.AYXKKw();
            }
            C47657tuJ c47657tuJ = activityC47681tuh.copydefault;
            C47657tuJ c47657tuJ2 = c47657tuJ;
            if (c47657tuJ == null) {
                Intrinsics.gEmmrt("");
                c47657tuJ2 = 0;
            }
            java.util.List<java.lang.Object> listKWHzl = c47655tuH.KWHzl();
            Intrinsics.copydefault(listKWHzl, "");
            c47657tuJ2.copydefault(listKWHzl);
            if (!activityC47681tuh.KWHzl) {
                activityC47681tuh.KWHzl = true;
                rVN.reportFullyDrawn$default((android.app.Activity) activityC47681tuh, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else {
            c55237xgE.setStatus(c47655tuH.EZpvd());
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(C55237xgE c55237xgE) {
        StatefulView.Status status = StatefulView.Status.Error;
        c55237xgE.setStatus(status);
        android.view.View viewAEQbTJ = c55237xgE.AEQbTJ(status);
        C55173xeu c55173xeu = viewAEQbTJ != null ? (C55173xeu) viewAEQbTJ.findViewById(C47501trL.TaskDescription.vLaW) : null;
        if (c55173xeu != null) {
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.DCUTEIddSDPG));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.run));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C47501trL.Fragment.AkhnZx));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.tun
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47681tuh.AhwBna(this.EZpvd, view);
                }
            });
        }
    }

    public static final void AhwBna(ActivityC47681tuh activityC47681tuh, android.view.View view) {
        C47672tuY.loadData$default(activityC47681tuh.KWHzl(), false, 1, null);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
