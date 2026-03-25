package o;

import android.view.View;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.invest_biz.ui.screens.faq.InvestFaqViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC26375jbD;
import o.C25493ixk;
import o.C27284jsL;

/* JADX INFO: renamed from: o.jbH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC26379jbH extends AbstractActivityC26374jbC {
    public iGV AYXKKw;
    public final C43316rmw AhwBna = new C43316rmw();
    public final InterfaceC56387yDm OLrzqt;

    public ActivityC26379jbH() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(InvestFaqViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.faq.InvestFaqActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.faq.InvestFaqActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.faq.InvestFaqActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.jbC.KWHzl()V */
    public final InvestFaqViewModel KWHzl() {
        return (InvestFaqViewModel) this.OLrzqt.getValue();
    }

    @Override // o.AbstractActivityC26374jbC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        iGV igvOLrzqt = iGV.OLrzqt(getLayoutInflater());
        this.AYXKKw = igvOLrzqt;
        if (igvOLrzqt == null) {
            Intrinsics.gEmmrt("");
            igvOLrzqt = null;
        }
        setContentView(igvOLrzqt.getRoot());
        AhwBna();
        valueOf();
        KWHzl().OLrzqt();
    }

    private final void AhwBna() {
        iGV igv = this.AYXKKw;
        iGV igv2 = null;
        if (igv == null) {
            Intrinsics.gEmmrt("");
            igv = null;
        }
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        C33537myN c33537myN = igv.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c33537myN, "");
        C27569jxf.setTitleStyle$OKDeFi_invest_biz$default(c27569jxf, c33537myN, 0, 0, 3, null);
        igv.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.jbJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC26379jbH.copydefault(this.AEQbTJ, view);
            }
        });
        igv.copydefault.setAdapter(this.AhwBna);
        C43316rmw c43316rmw = this.AhwBna;
        iGV igv3 = this.AYXKKw;
        if (igv3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            igv2 = igv3;
        }
        c43316rmw.register(C27284jsL.StateListAnimator.class, new C26378jbG(igv2.copydefault.getItemAnimator(), this.AhwBna));
        java.lang.String string = getString(C25493ixk.FragmentManager.pauseLocationServices);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c43316rmw.register(C24073iTx.class, new C24074iTy(string, 0, 106.0f, 2, null));
    }

    public static final void copydefault(ActivityC26379jbH activityC26379jbH, android.view.View view) {
        iGV igv = activityC26379jbH.AYXKKw;
        if (igv == null) {
            Intrinsics.gEmmrt("");
            igv = null;
        }
        igv.OLrzqt.setVisibility(8);
        activityC26379jbH.KWHzl().OLrzqt();
    }

    private final void valueOf() {
        C27589jxz.collectOnLifecycle$default(this, KWHzl().KWHzl(), null, new Activity(), 2, null);
    }

    /* JADX INFO: renamed from: o.jbH$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC26375jbD abstractC26375jbD, Continuation<? super Unit> continuation) {
            if (abstractC26375jbD instanceof AbstractC26375jbD.ActionBar) {
                ActivityC26379jbH.this.showLoading();
            } else {
                iGV igv = null;
                if (abstractC26375jbD instanceof AbstractC26375jbD.Activity) {
                    rVN.reportFullyDrawn$default((android.app.Activity) ActivityC26379jbH.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                    ActivityC26379jbH.this.dismissLoading();
                    C43316rmw c43316rmw = ActivityC26379jbH.this.AhwBna;
                    java.util.List<C27284jsL.StateListAnimator> listCopydefault = ((AbstractC26375jbD.Activity) abstractC26375jbD).copydefault();
                    if (listCopydefault.isEmpty()) {
                        listCopydefault = yDY.copydefault(C24073iTx.KWHzl);
                    }
                    c43316rmw.setItems(listCopydefault);
                    ActivityC26379jbH.this.AhwBna.notifyDataSetChanged();
                } else {
                    if (!(abstractC26375jbD instanceof AbstractC26375jbD.Application)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVN.reportFullyDrawn$default((android.app.Activity) ActivityC26379jbH.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
                    ActivityC26379jbH.this.dismissLoading();
                    iGV igv2 = ActivityC26379jbH.this.AYXKKw;
                    if (igv2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        igv = igv2;
                    }
                    C55173xeu c55173xeu = igv.OLrzqt;
                    ActivityC26379jbH activityC26379jbH = ActivityC26379jbH.this;
                    c55173xeu.setVisibility(0);
                    c55173xeu.setTitle("");
                    java.lang.String string = activityC26379jbH.getString(C25493ixk.FragmentManager.gBtXYZ);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    c55173xeu.setSubTitle((java.lang.CharSequence) string);
                    c55173xeu.setEmptyTypeImage(2);
                    java.lang.String string2 = activityC26379jbH.getString(C25493ixk.FragmentManager.AEQbTJ);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    c55173xeu.setRetry(string2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        C27569jxf.setStatusBarsStyle$OKDeFi_invest_biz$default(C27569jxf.OLrzqt, this, 0, 1, null);
    }

    @Override // o.AbstractActivityC26374jbC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC26374jbC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC26374jbC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC26374jbC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
