package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.model.usercenter.UnlinkXInput;
import com.okinc.account.api.model.usercenter.UnlinkXResult;
import com.okinc.planet.biz_userprofile.PlanetXManageActivity$observeViewModel$1;
import com.okinc.planet.biz_userprofile.PlanetXManageActivity$observeViewModel$2;
import com.okinc.planet.biz_userprofile.data.PlanetTwitterBindingInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C47501trL;
import o.C52761wXj;
import o.C55284xgz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tKy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC46184tKy extends AbstractActivityC47505trP {
    public final InterfaceC56387yDm EZpvd;
    public ActivityResultLauncher<UnlinkXInput> KWHzl;
    public boolean OLrzqt;
    public AbstractC46235tMv copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public ActivityC46184tKy() {
        final Function0 function0 = null;
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(C46215tMb.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_userprofile.PlanetXManageActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_userprofile.PlanetXManageActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_userprofile.PlanetXManageActivity$special$$inlined$viewModels$default$3
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

    public final C46215tMb OLrzqt() {
        return (C46215tMb) this.EZpvd.getValue();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = tKR.KWHzl.copydefault(this, new Function1() { // from class: o.tKx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46184tKy.EZpvd(this.OLrzqt, (UnlinkXResult) obj);
            }
        });
        this.copydefault = (AbstractC46235tMv) DataBindingUtil.setContentView(this, C47501trL.Application.AkhnZx);
        copydefault();
        EZpvd();
    }

    public static final Unit EZpvd(ActivityC46184tKy activityC46184tKy, UnlinkXResult unlinkXResult) {
        Intrinsics.checkNotNullParameter(unlinkXResult, "");
        if (!Intrinsics.EZpvd(unlinkXResult, UnlinkXResult.Cancel.INSTANCE)) {
            if (unlinkXResult instanceof UnlinkXResult.Error) {
                java.lang.String message = ((UnlinkXResult.Error) unlinkXResult).getMessage();
                if (message != null) {
                    activityC46184tKy.copydefault(message);
                }
            } else {
                if (!Intrinsics.EZpvd(unlinkXResult, UnlinkXResult.Success.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                activityC46184tKy.OLrzqt().AhwBna();
            }
        }
        return Unit.INSTANCE;
    }

    private final void copydefault() {
        showLoadingWithLogo();
        AbstractC46235tMv abstractC46235tMv = this.copydefault;
        AbstractC46235tMv abstractC46235tMv2 = null;
        if (abstractC46235tMv == null) {
            Intrinsics.gEmmrt("");
            abstractC46235tMv = null;
        }
        C33537myN c33537myN = abstractC46235tMv.copydefault;
        android.widget.ImageView backImage = c33537myN.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            c33537myN.setBackListener(new View.OnClickListener() { // from class: o.tKD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC46184tKy.copydefault(this.OLrzqt, view);
                }
            });
            AbstractC46235tMv abstractC46235tMv3 = this.copydefault;
            if (abstractC46235tMv3 == null) {
                Intrinsics.gEmmrt("");
                abstractC46235tMv3 = null;
            }
            abstractC46235tMv3.KWHzl.setRetryClickListener(new View.OnClickListener() { // from class: o.tKC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC46184tKy.AYXKKw(this.EZpvd, view);
                }
            });
            AbstractC46235tMv abstractC46235tMv4 = this.copydefault;
            if (abstractC46235tMv4 == null) {
                Intrinsics.gEmmrt("");
                abstractC46235tMv4 = null;
            }
            abstractC46235tMv4.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.tKz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC46184tKy.AhwBna(this.AEQbTJ, view);
                }
            });
            AbstractC46235tMv abstractC46235tMv5 = this.copydefault;
            if (abstractC46235tMv5 == null) {
                Intrinsics.gEmmrt("");
                abstractC46235tMv5 = null;
            }
            abstractC46235tMv5.AEQbTJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.tKA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    ActivityC46184tKy.AEQbTJ(this.KWHzl, compoundButton, z);
                }
            });
            AbstractC46235tMv abstractC46235tMv6 = this.copydefault;
            if (abstractC46235tMv6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC46235tMv2 = abstractC46235tMv6;
            }
            abstractC46235tMv2.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.tKF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC46184tKy.valueOf(this.OLrzqt, view);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void copydefault(ActivityC46184tKy activityC46184tKy, android.view.View view) {
        activityC46184tKy.finish();
    }

    public static final void AYXKKw(ActivityC46184tKy activityC46184tKy, android.view.View view) {
        activityC46184tKy.OLrzqt().EZpvd();
    }

    public static final void AhwBna(ActivityC46184tKy activityC46184tKy, android.view.View view) {
        activityC46184tKy.KWHzl();
    }

    public static final void AEQbTJ(ActivityC46184tKy activityC46184tKy, android.widget.CompoundButton compoundButton, boolean z) {
        activityC46184tKy.OLrzqt().OLrzqt(z);
    }

    public static final void valueOf(ActivityC46184tKy activityC46184tKy, android.view.View view) {
        activityC46184tKy.OLrzqt().OLrzqt();
    }

    private final void EZpvd() {
        StateFlow<AbstractC46197tLk<PlanetTwitterBindingInfo>> stateFlowKWHzl = OLrzqt().KWHzl();
        Lifecycle.State state = Lifecycle.State.STARTED;
        C46373tRy.AEQbTJ(stateFlowKWHzl, this, state, new PlanetXManageActivity$observeViewModel$1(this, null));
        C46373tRy.AEQbTJ(OLrzqt().gEmmrt(), this, state, new PlanetXManageActivity$observeViewModel$2(this, null));
    }

    public final void KWHzl(boolean z, boolean z2) {
        AbstractC46235tMv abstractC46235tMv = this.copydefault;
        AbstractC46235tMv abstractC46235tMv2 = null;
        if (abstractC46235tMv == null) {
            Intrinsics.gEmmrt("");
            abstractC46235tMv = null;
        }
        abstractC46235tMv.OLrzqt.setVisibility(z ? 0 : 8);
        AbstractC46235tMv abstractC46235tMv3 = this.copydefault;
        if (abstractC46235tMv3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC46235tMv2 = abstractC46235tMv3;
        }
        abstractC46235tMv2.KWHzl.setVisibility(z2 ? 0 : 8);
    }

    public final void EZpvd(PlanetTwitterBindingInfo planetTwitterBindingInfo) {
        java.lang.String str;
        AbstractC46235tMv abstractC46235tMv = this.copydefault;
        AbstractC46235tMv abstractC46235tMv2 = null;
        if (abstractC46235tMv == null) {
            Intrinsics.gEmmrt("");
            abstractC46235tMv = null;
        }
        android.widget.TextView textView = abstractC46235tMv.AYXKKw;
        if (planetTwitterBindingInfo.AEQbTJ().length() > 0) {
            str = "@" + planetTwitterBindingInfo.AEQbTJ();
        } else {
            str = "";
        }
        textView.setText(str);
        AbstractC46235tMv abstractC46235tMv3 = this.copydefault;
        if (abstractC46235tMv3 == null) {
            Intrinsics.gEmmrt("");
            abstractC46235tMv3 = null;
        }
        abstractC46235tMv3.AEQbTJ.setOnCheckedChangeListener(null);
        AbstractC46235tMv abstractC46235tMv4 = this.copydefault;
        if (abstractC46235tMv4 == null) {
            Intrinsics.gEmmrt("");
            abstractC46235tMv4 = null;
        }
        abstractC46235tMv4.AEQbTJ.setChecked(planetTwitterBindingInfo.OLrzqt());
        AbstractC46235tMv abstractC46235tMv5 = this.copydefault;
        if (abstractC46235tMv5 == null) {
            Intrinsics.gEmmrt("");
            abstractC46235tMv5 = null;
        }
        abstractC46235tMv5.AEQbTJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.tKB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                ActivityC46184tKy.OLrzqt(this.OLrzqt, compoundButton, z);
            }
        });
        int i = planetTwitterBindingInfo.OLrzqt() ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe;
        AbstractC46235tMv abstractC46235tMv6 = this.copydefault;
        if (abstractC46235tMv6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC46235tMv2 = abstractC46235tMv6;
        }
        abstractC46235tMv2.EZpvd.setTextColor(ContextCompat.getColor(this, i));
    }

    public static final void OLrzqt(ActivityC46184tKy activityC46184tKy, android.widget.CompoundButton compoundButton, boolean z) {
        activityC46184tKy.OLrzqt().OLrzqt(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.lang.String str) {
        C55284xgz c55284xgzIsConnected;
        C55284xgz.Activity activity = C55284xgz.Companion;
        AbstractC46235tMv abstractC46235tMv = this.copydefault;
        if (abstractC46235tMv == null) {
            Intrinsics.gEmmrt("");
            abstractC46235tMv = null;
        }
        android.view.View root = abstractC46235tMv.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C55284xgz c55284xgzKWHzl = activity.KWHzl(root, str);
        if (c55284xgzKWHzl == null || (c55284xgzIsConnected = c55284xgzKWHzl.isConnected(2)) == null) {
            return;
        }
        c55284xgzIsConnected.hDKMBd();
    }

    public final void EZpvd(java.lang.String str) {
        C55284xgz c55284xgzIsConnected;
        C55284xgz.Activity activity = C55284xgz.Companion;
        AbstractC46235tMv abstractC46235tMv = this.copydefault;
        if (abstractC46235tMv == null) {
            Intrinsics.gEmmrt("");
            abstractC46235tMv = null;
        }
        android.view.View root = abstractC46235tMv.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C55284xgz c55284xgzKWHzl = activity.KWHzl(root, str);
        if (c55284xgzKWHzl == null || (c55284xgzIsConnected = c55284xgzKWHzl.isConnected(3)) == null) {
            return;
        }
        c55284xgzIsConnected.hDKMBd();
    }

    public final void KWHzl() {
        tKK tkk = new tKK();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        tkk.show(supportFragmentManager);
    }

    public final void KWHzl(java.lang.Throwable th) {
        AbstractC46235tMv abstractC46235tMv = this.copydefault;
        if (abstractC46235tMv == null) {
            Intrinsics.gEmmrt("");
            abstractC46235tMv = null;
        }
        C55173xeu c55173xeu = abstractC46235tMv.KWHzl;
        c55173xeu.setEmptyTypeImage(2);
        c55173xeu.setTitle("");
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = C33070mpX.AYXKKw(C47501trL.Fragment.DbNXlk);
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) message);
        c55173xeu.setRetry(C33070mpX.AYXKKw(C47501trL.Fragment.valueOf));
    }

    /* JADX INFO: renamed from: o.tKy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tKy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC46184tKy.class));
        }
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
