package o;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.invest_biz.ui.screens.eventpage.InvestHotZonePlatform;
import com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageData;
import com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageViewModel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25493ixk;
import o.C26422jby;
import o.C27189jqW;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jbp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC26413jbp extends AbstractActivityC26411jbn {
    public final InterfaceC56387yDm AYXKKw;
    public iGT AhwBna;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.jbs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC26413jbp.AhwBna(this.AEQbTJ);
        }
    });
    public boolean djBIcL = true;
    public int gEmmrt;
    public boolean valueOf;

    public ActivityC26413jbp() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(InvestMultiTabEventPageViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.jbn.EZpvd()V */
    public final ActionBar EZpvd() {
        return (ActionBar) this.OLrzqt.getValue();
    }

    public static final ActionBar AhwBna(ActivityC26413jbp activityC26413jbp) {
        return new ActionBar(activityC26413jbp);
    }

    /* JADX DEBUG: Possible override for method o.jbn.AhwBna()V */
    public final InvestMultiTabEventPageViewModel AhwBna() {
        return (InvestMultiTabEventPageViewModel) this.AYXKKw.getValue();
    }

    @Override // o.AbstractActivityC26411jbn, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            this.gEmmrt = intent.getIntExtra("specialZoneTabId", 0);
        }
        iGT igtKWHzl = iGT.KWHzl(getLayoutInflater());
        this.AhwBna = igtKWHzl;
        if (igtKWHzl == null) {
            Intrinsics.gEmmrt("");
            igtKWHzl = null;
        }
        setContentView(igtKWHzl.getRoot());
        djBIcL();
        valueOf();
        gEmmrt();
        AYXKKw();
        AhwBna().OLrzqt(this.gEmmrt);
    }

    public final void djBIcL() {
        iGT igt = this.AhwBna;
        iGT igt2 = null;
        if (igt == null) {
            Intrinsics.gEmmrt("");
            igt = null;
        }
        C27137jpX c27137jpX = igt.valueOf;
        c27137jpX.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.iRxXKY));
        c27137jpX.setSubTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AxsJAYsNCnLh));
        c27137jpX.setButtonText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AwvSrB));
        iGT igt3 = this.AhwBna;
        if (igt3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            igt2 = igt3;
        }
        igt2.valueOf.setRetryClick(new Function0() { // from class: o.jbu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC26413jbp.valueOf(this.AEQbTJ);
            }
        });
    }

    public static final Unit valueOf(ActivityC26413jbp activityC26413jbp) {
        activityC26413jbp.AhwBna().OLrzqt(activityC26413jbp.gEmmrt);
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        iGT igt = this.AhwBna;
        if (igt == null) {
            Intrinsics.gEmmrt("");
            igt = null;
        }
        igt.AYXKKw.setAdapter(EZpvd());
        iGT igt2 = this.AhwBna;
        if (igt2 == null) {
            Intrinsics.gEmmrt("");
            igt2 = null;
        }
        TabLayout tabLayoutCopydefault = igt2.DbNXlk.copydefault();
        iGT igt3 = this.AhwBna;
        if (igt3 == null) {
            Intrinsics.gEmmrt("");
            igt3 = null;
        }
        new C27189jqW(tabLayoutCopydefault, igt3.AYXKKw, new C27189jqW.Activity() { // from class: o.jbr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C27189jqW.Activity
            public final void KWHzl(TabLayout.Tab tab, int i) {
                ActivityC26413jbp.copydefault(this.KWHzl, tab, i);
            }
        }).KWHzl();
        iGT igt4 = this.AhwBna;
        if (igt4 == null) {
            Intrinsics.gEmmrt("");
            igt4 = null;
        }
        android.view.View childAt = igt4.AYXKKw.getChildAt(0);
        if (childAt != null) {
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView != null) {
                recyclerView.setOverScrollMode(2);
            }
        }
    }

    public static final void copydefault(ActivityC26413jbp activityC26413jbp, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(activityC26413jbp.EZpvd().KWHzl().get(i).getPlatformName());
    }

    private final void gEmmrt() {
        iGT igt = this.AhwBna;
        if (igt == null) {
            Intrinsics.gEmmrt("");
            igt = null;
        }
        igt.djBIcL.OLrzqt(new InterfaceC57903yrG() { // from class: o.jbt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC26413jbp.copydefault(this.KWHzl, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(ActivityC26413jbp activityC26413jbp, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        activityC26413jbp.AhwBna().OLrzqt(activityC26413jbp.gEmmrt);
    }

    /* JADX INFO: renamed from: o.jbp$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: o.iGT */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r1v4 */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InvestMultiTabEventPageViewModel.Activity activity, Continuation<? super Unit> continuation) {
            iGT igt = ActivityC26413jbp.this.AhwBna;
            iGT igt2 = 0;
            iGT igt3 = null;
            if (igt == null) {
                Intrinsics.gEmmrt("");
                igt = null;
            }
            C27137jpX c27137jpX = igt.valueOf;
            Intrinsics.checkNotNullExpressionValue(c27137jpX, "");
            boolean z = activity instanceof InvestMultiTabEventPageViewModel.Activity.C0337Activity;
            c27137jpX.setVisibility(z ? 0 : 8);
            if (activity instanceof InvestMultiTabEventPageViewModel.Activity.TaskDescription) {
                if (ActivityC26413jbp.this.djBIcL) {
                    ActivityC26413jbp.this.showLoading();
                }
            } else if (z) {
                rVN.reportFullyDrawn$default((android.app.Activity) ActivityC26413jbp.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
                ActivityC26413jbp.this.dismissLoading();
                iGT igt4 = ActivityC26413jbp.this.AhwBna;
                if (igt4 == null) {
                    Intrinsics.gEmmrt("");
                    igt4 = null;
                }
                C33546myW c33546myW = igt4.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                c33546myW.setVisibility(8);
                iGT igt5 = ActivityC26413jbp.this.AhwBna;
                if (igt5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    igt3 = igt5;
                }
                igt3.djBIcL.AEQbTJ();
            } else {
                if (!(activity instanceof InvestMultiTabEventPageViewModel.Activity.StateListAnimator)) {
                    throw new NoWhenBranchMatchedException();
                }
                rVN.reportFullyDrawn$default((android.app.Activity) ActivityC26413jbp.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                ActivityC26413jbp.this.dismissLoading();
                iGT igt6 = ActivityC26413jbp.this.AhwBna;
                if (igt6 == null) {
                    Intrinsics.gEmmrt("");
                    igt6 = null;
                }
                igt6.djBIcL.AEQbTJ();
                ActivityC26413jbp.this.djBIcL = false;
                iGT igt7 = ActivityC26413jbp.this.AhwBna;
                if (igt7 == null) {
                    Intrinsics.gEmmrt("");
                    igt7 = null;
                }
                C33546myW c33546myW2 = igt7.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
                c33546myW2.setVisibility(0);
                InvestMultiTabEventPageViewModel.Activity.StateListAnimator stateListAnimator = (InvestMultiTabEventPageViewModel.Activity.StateListAnimator) activity;
                if (stateListAnimator.OLrzqt().getPlatformList().size() > 1) {
                    iGT igt8 = ActivityC26413jbp.this.AhwBna;
                    if (igt8 == null) {
                        Intrinsics.gEmmrt("");
                        igt8 = null;
                    }
                    NestedScrollView nestedScrollView = igt8.fetchVPNInfo;
                    Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
                    nestedScrollView.setVisibility(8);
                    iGT igt9 = ActivityC26413jbp.this.AhwBna;
                    if (igt9 == null) {
                        Intrinsics.gEmmrt("");
                        igt9 = null;
                    }
                    CoordinatorLayout coordinatorLayout = igt9.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "");
                    coordinatorLayout.setVisibility(0);
                    ActivityC26413jbp activityC26413jbp = ActivityC26413jbp.this;
                    iGT igt10 = activityC26413jbp.AhwBna;
                    if (igt10 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        igt2 = igt10;
                    }
                    AbstractC23810iKd abstractC23810iKd = igt2.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(abstractC23810iKd, "");
                    activityC26413jbp.KWHzl(abstractC23810iKd, stateListAnimator.OLrzqt());
                    ActivityC26413jbp.this.EZpvd().OLrzqt(stateListAnimator.OLrzqt().getPlatformList(), stateListAnimator.OLrzqt().getEventTrackingValue());
                } else {
                    iGT igt11 = ActivityC26413jbp.this.AhwBna;
                    if (igt11 == null) {
                        Intrinsics.gEmmrt("");
                        igt11 = null;
                    }
                    NestedScrollView nestedScrollView2 = igt11.fetchVPNInfo;
                    Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "");
                    nestedScrollView2.setVisibility(0);
                    iGT igt12 = ActivityC26413jbp.this.AhwBna;
                    if (igt12 == null) {
                        Intrinsics.gEmmrt("");
                        igt12 = null;
                    }
                    CoordinatorLayout coordinatorLayout2 = igt12.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(coordinatorLayout2, "");
                    coordinatorLayout2.setVisibility(8);
                    ActivityC26413jbp activityC26413jbp2 = ActivityC26413jbp.this;
                    iGT igt13 = activityC26413jbp2.AhwBna;
                    if (igt13 == null) {
                        Intrinsics.gEmmrt("");
                        igt13 = null;
                    }
                    AbstractC23810iKd abstractC23810iKd2 = igt13.isConnected;
                    Intrinsics.checkNotNullExpressionValue(abstractC23810iKd2, "");
                    activityC26413jbp2.KWHzl(abstractC23810iKd2, stateListAnimator.OLrzqt());
                    androidx.fragment.app.FragmentManager supportFragmentManager = ActivityC26413jbp.this.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                    C26422jby.ActionBar actionBar = C26422jby.Companion;
                    InvestHotZonePlatform investHotZonePlatform = (InvestHotZonePlatform) CollectionsKt___CollectionsKt.firstOrNull(stateListAnimator.OLrzqt().getPlatformList());
                    if (investHotZonePlatform == null) {
                        investHotZonePlatform = new InvestHotZonePlatform((java.lang.String) igt2, (java.util.List) igt2, 3, (DefaultConstructorMarker) igt2);
                    }
                    fragmentTransactionBeginTransaction.replace(C25493ixk.ActionBar.RsCxkX, actionBar.EZpvd(0, investHotZonePlatform, stateListAnimator.OLrzqt().getEventTrackingValue()));
                    fragmentTransactionBeginTransaction.commit();
                }
                ActivityC26413jbp.this.OLrzqt(stateListAnimator.OLrzqt().getEventTrackingValue());
            }
            return Unit.INSTANCE;
        }
    }

    private final void AYXKKw() {
        C27589jxz.collectOnLifecycle$default(this, AhwBna().EZpvd(), null, new Activity(), 2, null);
    }

    public final void KWHzl(AbstractC23810iKd abstractC23810iKd, final InvestMultiTabEventPageData investMultiTabEventPageData) {
        abstractC23810iKd.EZpvd.setText(investMultiTabEventPageData.getTabName());
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.widget.ImageView imageView = abstractC23810iKd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.content.Context context = abstractC23810iKd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27569jxf.AEQbTJ(imageView, C43454rpb.copydefault("images/web3_defi/hotzone_top_background.png", context, true), C52761wXj.TaskDescription.getUriFromString);
        abstractC23810iKd.OLrzqt.setText(investMultiTabEventPageData.getTopAreaDesc());
        boolean z = C33129mqd.OLrzqt((java.lang.CharSequence) investMultiTabEventPageData.getTopViewText()) && C33129mqd.OLrzqt((java.lang.CharSequence) investMultiTabEventPageData.getTopViewUrl());
        C52794wYp c52794wYp = abstractC23810iKd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(z ? 0 : 8);
        if (z) {
            abstractC23810iKd.copydefault.setText(investMultiTabEventPageData.getTopViewText());
            abstractC23810iKd.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.jbq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) throws java.io.UnsupportedEncodingException {
                    ActivityC26413jbp.AEQbTJ(investMultiTabEventPageData, view);
                }
            });
        }
    }

    public static final void AEQbTJ(InvestMultiTabEventPageData investMultiTabEventPageData, android.view.View view) throws java.io.UnsupportedEncodingException {
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27508jwX.openUrl$default(c27508jwX, context, investMultiTabEventPageData.getTopViewUrl(), false, 2, null);
    }

    /* JADX INFO: renamed from: o.jbp$ActionBar */
    public static final class ActionBar extends FragmentStateAdapter {
        public java.lang.String AEQbTJ;
        public final java.util.List<InvestHotZonePlatform> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InvestHotZonePlatform> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            this.OLrzqt = new java.util.ArrayList();
            this.AEQbTJ = "";
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return C26422jby.Companion.EZpvd(i, this.OLrzqt.get(i), this.AEQbTJ);
        }

        public static /* synthetic */ void setData$default(ActionBar actionBar, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            actionBar.OLrzqt(list, str);
        }

        public final void OLrzqt(@NotNull java.util.List<InvestHotZonePlatform> list, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt.clear();
            this.OLrzqt.addAll(list);
            this.AEQbTJ = str;
            notifyDataSetChanged();
        }
    }

    public final void OLrzqt(final java.lang.String str) {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        C27570jxg.investEvent$default("YieldAcitvity_Full_Page_View_New", null, new Function1() { // from class: o.jbv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26413jbp.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", str, false);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC26411jbn, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC26411jbn, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC26411jbn, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC26411jbn, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
