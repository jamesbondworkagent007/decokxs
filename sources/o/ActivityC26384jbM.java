package o;

import android.view.View;
import androidx.compose.material3.TooltipKt;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.models.InvestHistoryBean;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.history.InvestHistoryActivity$initView$2$1;
import com.okinc.business.invest_biz.ui.screens.history.InvestHistoryViewModel;
import com.okinc.business.invest_biz.ui.screens.history.LoadHistoryType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC26383jbL;
import o.AbstractC26387jbP;
import o.C25493ixk;
import o.C52761wXj;

/* JADX INFO: renamed from: o.jbM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC26384jbM extends AbstractActivityC26385jbN {
    public long AYXKKw;
    public long KWHzl;
    public final InterfaceC56387yDm djBIcL;
    public int gEmmrt;
    public iGS values;
    public final C43316rmw valueOf = new C43316rmw();
    public int AhwBna = 1;

    public ActivityC26384jbM() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(InvestHistoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.history.InvestHistoryActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.history.InvestHistoryActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.history.InvestHistoryActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.jbN.AEQbTJ()V */
    public final InvestHistoryViewModel AEQbTJ() {
        return (InvestHistoryViewModel) this.djBIcL.getValue();
    }

    @Override // o.AbstractActivityC26385jbN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        iGS igsEZpvd = iGS.EZpvd(getLayoutInflater());
        this.values = igsEZpvd;
        if (igsEZpvd == null) {
            Intrinsics.gEmmrt("");
            igsEZpvd = null;
        }
        setContentView(igsEZpvd.getRoot());
        gEmmrt();
        AhwBna();
        AYXKKw();
        refresh$default(this, false, true, 1, null);
    }

    public final void gEmmrt() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            this.AYXKKw = intent.getLongExtra("investment_id", 0L);
            this.KWHzl = intent.getLongExtra("chainId", 0L);
            this.gEmmrt = intent.getIntExtra("investType", 0);
            this.AhwBna = intent.getIntExtra("poolVersion", 0);
        }
    }

    private final void AhwBna() {
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        iGS igs = this.values;
        iGS igs2 = null;
        if (igs == null) {
            Intrinsics.gEmmrt("");
            igs = null;
        }
        C33537myN c33537myN = igs.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c33537myN, "");
        C27569jxf.setTitleStyle$OKDeFi_invest_biz$default(c27569jxf, c33537myN, 0, 0, 3, null);
        iGS igs3 = this.values;
        if (igs3 == null) {
            Intrinsics.gEmmrt("");
            igs3 = null;
        }
        igs3.KWHzl.setStatusBarColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        iGS igs4 = this.values;
        if (igs4 == null) {
            Intrinsics.gEmmrt("");
            igs4 = null;
        }
        igs4.KWHzl.setAppBarColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        iGS igs5 = this.values;
        if (igs5 == null) {
            Intrinsics.gEmmrt("");
            igs5 = null;
        }
        C33546myW c33546myW = igs5.AYXKKw;
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.AYXKKw(true);
        InterfaceC57927yre interfaceC57927yreIsConnected = c33546myW.isConnected();
        C27215jqw c27215jqw = interfaceC57927yreIsConnected instanceof C27215jqw ? (C27215jqw) interfaceC57927yreIsConnected : null;
        if (c27215jqw != null) {
            java.lang.String string = getString(C25493ixk.FragmentManager.DaRZkR);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c27215jqw.setNoMoreText(string);
        }
        c33546myW.OLrzqt((InterfaceC57901yrE) new Application());
        iGS igs6 = this.values;
        if (igs6 == null) {
            Intrinsics.gEmmrt("");
            igs6 = null;
        }
        igs6.AEQbTJ.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        C43316rmw c43316rmw = this.valueOf;
        c43316rmw.register(InvestHistoryBean.class, new C26391jbT(this.valueOf, new InvestHistoryActivity$initView$2$1(this)));
        java.lang.String string2 = getString(C25493ixk.FragmentManager.pauseLocationServices);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c43316rmw.register(C24073iTx.class, new C24074iTy(string2, 0, 0.0f, 6, null));
        iGS igs7 = this.values;
        if (igs7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            igs2 = igs7;
        }
        RecyclerView recyclerView = igs2.copydefault;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.setAdapter(this.valueOf);
    }

    /* JADX INFO: renamed from: o.jbM$Application */
    public static final class Application implements InterfaceC57901yrE {
        public Application() {
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            ActivityC26384jbM.refresh$default(ActivityC26384jbM.this, false, false, 3, null);
        }

        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            ActivityC26384jbM.refresh$default(ActivityC26384jbM.this, true, false, 2, null);
        }
    }

    private final void AYXKKw() {
        C27589jxz.collectOnLifecycle$default(this, AEQbTJ().copydefault(), null, new TaskDescription(), 2, null);
        C27589jxz.collectOnLifecycle$default(this, AEQbTJ().AEQbTJ(), null, new Activity(), 2, null);
    }

    /* JADX INFO: renamed from: o.jbM$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC26383jbL abstractC26383jbL, Continuation<? super Unit> continuation) {
            if (abstractC26383jbL instanceof AbstractC26383jbL.TaskDescription) {
                ActivityC26384jbM.this.showLoading();
            } else {
                iGS igs = null;
                if (abstractC26383jbL instanceof AbstractC26383jbL.Application) {
                    ActivityC26384jbM.this.dismissLoading();
                    rVN.reportFullyDrawn$default((android.app.Activity) ActivityC26384jbM.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                    iGS igs2 = ActivityC26384jbM.this.values;
                    if (igs2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        igs = igs2;
                    }
                    C33546myW c33546myW = igs.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                    AbstractC26383jbL.Application application = (AbstractC26383jbL.Application) abstractC26383jbL;
                    C57589ylK.KWHzl(c33546myW, application.EZpvd().isEmpty());
                    C43316rmw c43316rmw = ActivityC26384jbM.this.valueOf;
                    java.util.List<InvestHistoryBean> listEZpvd = application.EZpvd();
                    if (listEZpvd.isEmpty()) {
                        listEZpvd = yDY.copydefault(C24073iTx.KWHzl);
                    }
                    c43316rmw.setItems(listEZpvd);
                    ActivityC26384jbM.this.valueOf.notifyDataSetChanged();
                    ActivityC26384jbM.this.KWHzl(false);
                } else if (abstractC26383jbL instanceof AbstractC26383jbL.Activity) {
                    ActivityC26384jbM.this.dismissLoading();
                    iGS igs3 = ActivityC26384jbM.this.values;
                    if (igs3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        igs = igs3;
                    }
                    C33546myW c33546myW2 = igs.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
                    C57589ylK.KWHzl(c33546myW2, true);
                } else {
                    if (!(abstractC26383jbL instanceof AbstractC26383jbL.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActivityC26384jbM.this.dismissLoading();
                    rVN.reportFullyDrawn$default((android.app.Activity) ActivityC26384jbM.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
                    iGS igs4 = ActivityC26384jbM.this.values;
                    if (igs4 == null) {
                        Intrinsics.gEmmrt("");
                        igs4 = null;
                    }
                    C33546myW c33546myW3 = igs4.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(c33546myW3, "");
                    C57589ylK.finishStatus$default(c33546myW3, false, 1, null);
                    ActivityC26384jbM.this.KWHzl(true);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jbM$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC26387jbP abstractC26387jbP, Continuation<? super Unit> continuation) {
            if (abstractC26387jbP instanceof AbstractC26387jbP.StateListAnimator) {
                ActivityC26384jbM.this.dismissLoading();
                iGS igs = ActivityC26384jbM.this.values;
                if (igs == null) {
                    Intrinsics.gEmmrt("");
                    igs = null;
                }
                C33546myW c33546myW = igs.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                C57589ylK.finishStatus$default(c33546myW, false, 1, null);
                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(ActivityC26384jbM.this, C52761wXj.TaskDescription.OijiEz);
                if (drawable != null) {
                    ActivityC26384jbM activityC26384jbM = ActivityC26384jbM.this;
                    drawable.setBounds(0, 0, C55298xhM.copydefault(96.0f, (android.content.Context) activityC26384jbM), C55298xhM.copydefault(96.0f, (android.content.Context) activityC26384jbM));
                    DrawableCompat.setTint(drawable, ContextCompat.getColor(activityC26384jbM, C52761wXj.Activity.UCQKYV));
                }
                C55328xhq.show$default(C55328xhq.OLrzqt, ActivityC26384jbM.this.getString(C25493ixk.FragmentManager.DcMfJKgMxgjU), drawable, 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void refresh$default(ActivityC26384jbM activityC26384jbM, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        activityC26384jbM.OLrzqt(z, z2);
    }

    public final void OLrzqt(boolean z, boolean z2) {
        if (!z) {
            iGS igs = this.values;
            if (igs == null) {
                Intrinsics.gEmmrt("");
                igs = null;
            }
            C33546myW c33546myW = igs.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.KWHzl(c33546myW, false);
        }
        if (C23580iBq.AEQbTJ.OLrzqt() != null) {
            AEQbTJ().KWHzl(this.KWHzl, this.AYXKKw, z ? LoadHistoryType.LOAD_MORE : LoadHistoryType.REFRESH_PAGE, (8 & 8) != 0 ? 10 : 0, z2);
        } else {
            KWHzl(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(boolean z) {
        iGS igs = this.values;
        iGS igs2 = null;
        if (igs == null) {
            Intrinsics.gEmmrt("");
            igs = null;
        }
        C33546myW c33546myW = igs.AYXKKw;
        boolean z2 = !z;
        c33546myW.djBIcL(z2);
        c33546myW.AhwBna(z2);
        if (!z) {
            iGS igs3 = this.values;
            if (igs3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                igs2 = igs3;
            }
            igs2.OLrzqt.setVisibility(8);
            return;
        }
        java.lang.String string = android.text.TextUtils.isEmpty("") ? getString(C25493ixk.FragmentManager.gBtXYZ) : "";
        iGS igs4 = this.values;
        if (igs4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            igs2 = igs4;
        }
        final C55173xeu c55173xeu = igs2.OLrzqt;
        c55173xeu.postDelayed(new java.lang.Runnable() { // from class: o.jbU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC26384jbM.AEQbTJ(this.KWHzl);
            }
        }, TooltipKt.TooltipDuration);
        c55173xeu.setTitle("");
        c55173xeu.setSubTitle((java.lang.CharSequence) string);
        c55173xeu.setEmptyTypeImage(2);
        java.lang.String string2 = getString(C25493ixk.FragmentManager.AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setRetry(string2);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jbS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC26384jbM.EZpvd(c55173xeu, this, view);
            }
        });
        Intrinsics.copydefault(c55173xeu);
    }

    public static final void AEQbTJ(ActivityC26384jbM activityC26384jbM) {
        activityC26384jbM.dismissLoading();
        iGS igs = activityC26384jbM.values;
        if (igs == null) {
            Intrinsics.gEmmrt("");
            igs = null;
        }
        igs.OLrzqt.setVisibility(0);
    }

    public static final void EZpvd(C55173xeu c55173xeu, ActivityC26384jbM activityC26384jbM, android.view.View view) {
        c55173xeu.setVisibility(8);
        refresh$default(activityC26384jbM, false, true, 1, null);
    }

    public final void AEQbTJ(android.widget.LinearLayout linearLayout, java.util.List<InvestTokenWithAmount> list, int i) {
        C27569jxf.OLrzqt.EZpvd(this, linearLayout, list, i, this.AhwBna, this.gEmmrt);
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        C27569jxf.setStatusBarsStyle$OKDeFi_invest_biz$default(C27569jxf.OLrzqt, this, 0, 1, null);
    }

    @Override // o.AbstractActivityC26385jbN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC26385jbN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC26385jbN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC26385jbN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
