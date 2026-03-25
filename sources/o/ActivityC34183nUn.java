package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.group.joinreview.JoinReviewActivity$initViewModel$1;
import com.okinc.im.imui.group.joinreview.JoinReviewActivity$isGoneAfterAnimation$1;
import com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nUn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC34183nUn extends AbstractActivityC34180nUj<AbstractC33850nId> {
    public final int AhwBna = C35399nuc.Dialog.values;
    public Job djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public ViewOnClickListenerC54939xaY valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.AhwBna;
    }

    public ActivityC34183nUn() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(JoinReviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.joinreview.JoinReviewActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.joinreview.JoinReviewActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.joinreview.JoinReviewActivity$special$$inlined$viewModels$default$3
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
    public final JoinReviewViewModel isConnected() {
        return (JoinReviewViewModel) this.gEmmrt.getValue();
    }

    private final long AYXKKw() {
        return getIntent().getLongExtra("ARG_GROUP_ID", -1L);
    }

    /* JADX INFO: renamed from: o.nUn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nUn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC34183nUn.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_GROUP_ID", java.lang.Long.valueOf(j))));
            return intent;
        }
    }

    @Override // o.AbstractActivityC34180nUj, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AkhnZx();
        fetchVPNInfo();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        isConnected().EZpvd(AYXKKw());
    }

    @Override // o.AbstractActivityC34180nUj, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Job job = this.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.djBIcL = null;
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.valueOf;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        this.valueOf = null;
        super.onDestroy();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AkhnZx() {
        AbstractC33850nId abstractC33850nId = (AbstractC33850nId) KWHzl();
        wYC wyc = abstractC33850nId.AEQbTJ;
        wyc.setOnClickListener(new StateListAnimator(wyc, 1000L, this));
        abstractC33850nId.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.nUq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC34183nUn.copydefault(this.AEQbTJ, view);
            }
        });
        C52794wYp c52794wYpAEQbTJ = abstractC33850nId.copydefault.AEQbTJ();
        c52794wYpAEQbTJ.setCompoundDrawables(null, null, null, null);
        c52794wYpAEQbTJ.setOnClickListener(new Application(c52794wYpAEQbTJ, 1000L, this));
        C55173xeu c55173xeu = abstractC33850nId.AhwBna;
        c55173xeu.setRetry(C33070mpX.AYXKKw(C35399nuc.LoaderManager.isConnected));
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.nUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC34183nUn.KWHzl(this.KWHzl, view);
            }
        });
        DbNXlk();
    }

    public static final void copydefault(ActivityC34183nUn activityC34183nUn, android.view.View view) {
        activityC34183nUn.isConnected().fARcdN();
    }

    public static final void KWHzl(ActivityC34183nUn activityC34183nUn, android.view.View view) {
        activityC34183nUn.isConnected().OLrzqt(true);
    }

    private final void fetchVPNInfo() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new JoinReviewActivity$initViewModel$1(this, null), 3, null);
        isConnected().EZpvd(AYXKKw());
    }

    /* JADX INFO: renamed from: o.nUn$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC34183nUn KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC34183nUn activityC34183nUn) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = activityC34183nUn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                JoinReviewViewModel.refreshJoinRequests$default(this.KWHzl.isConnected(), false, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.nUn$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC34183nUn AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC34183nUn activityC34183nUn) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = activityC34183nUn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.getOnBackPressedDispatcher().onBackPressed();
            }
        }
    }

    public final void EZpvd(FragmentContainerView fragmentContainerView) {
        Job job = this.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.djBIcL = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new JoinReviewActivity$isGoneAfterAnimation$1(this, fragmentContainerView, null), 3, null);
    }

    public final void copydefault(FragmentContainerView fragmentContainerView) {
        Job job = this.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        fragmentContainerView.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DbNXlk() {
        AbstractC33850nId abstractC33850nId = (AbstractC33850nId) KWHzl();
        int iOLrzqt = isConnected().OLrzqt();
        boolean z = iOLrzqt <= 0;
        if (z || isConnected().fJNWhG().getValue().booleanValue()) {
            abstractC33850nId.AYXKKw.setText(C33069mpW.copydefault(C35399nuc.LoaderManager.DBAlnt, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iOLrzqt)))));
            wYC wyc = abstractC33850nId.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(0);
            android.widget.ImageView imageView = abstractC33850nId.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(z ? 4 : 0);
            abstractC33850nId.KWHzl.setImageResource(C52761wXj.TaskDescription.sCB);
            return;
        }
        abstractC33850nId.AYXKKw.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.GQzpsZ));
        wYC wyc2 = abstractC33850nId.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc2, "");
        wyc2.setVisibility(4);
        android.widget.ImageView imageView2 = abstractC33850nId.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(0);
        abstractC33850nId.KWHzl.setImageResource(C52761wXj.TaskDescription.alsFma);
    }

    public final void gEmmrt() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.gCNefq);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.ONJgbh);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.ibnZAm, new View.OnClickListener() { // from class: o.nUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC34183nUn.AEQbTJ(this.copydefault, viewOnClickListenerC54939xaY, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.iwGUEr, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
        this.valueOf = viewOnClickListenerC54939xaY;
    }

    public static final void AEQbTJ(ActivityC34183nUn activityC34183nUn, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        activityC34183nUn.isConnected().AEQbTJ(false);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AhwBna() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.HJWChPRAkuRW);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.HJWChPQdUnVm);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.itxZVF, new View.OnClickListener() { // from class: o.nUk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC34183nUn.copydefault(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.iwGUEr, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
        this.valueOf = viewOnClickListenerC54939xaY;
    }

    public static final void copydefault(ActivityC34183nUn activityC34183nUn, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        activityC34183nUn.isConnected().AEQbTJ(true);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(long j) {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.GGlJim);
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C35399nuc.LoaderManager.sYcwUD, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(j)))));
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.getNewProxyInstance, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
        this.valueOf = viewOnClickListenerC54939xaY;
    }

    public final void djBIcL() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.ORmwhf);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.iWlNch);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.QOjuYg, new View.OnClickListener() { // from class: o.nUp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC34183nUn.gEmmrt(this.copydefault, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        this.valueOf = viewOnClickListenerC54939xaY;
    }

    public static final void gEmmrt(ActivityC34183nUn activityC34183nUn, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        JoinReviewViewModel.refreshJoinRequests$default(activityC34183nUn.isConnected(), false, 1, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractActivityC34180nUj, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34180nUj, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC34180nUj, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC34180nUj, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
