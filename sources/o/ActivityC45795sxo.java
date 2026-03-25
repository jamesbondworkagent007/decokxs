package o;

import android.os.Build;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sxo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC45795sxo extends AbstractActivityC33041mov {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final ActivityResultLauncher<android.content.Intent> AEQbTJ;

    /* JADX INFO: renamed from: o.sxo$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ResultBackStatus.values().length];
            try {
                iArr[ResultBackStatus.Success.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33019moZ
    public boolean animOpen() {
        return false;
    }

    public ActivityC45795sxo() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.sxp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC45795sxo.copydefault(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.sxo$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sxo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void start$default(StateListAnimator stateListAnimator, android.content.Context context, OKComplianceRestrictionService.Feature feature, java.lang.String str, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                bundle = null;
            }
            stateListAnimator.EZpvd(context, feature, str, bundle);
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull OKComplianceRestrictionService.Feature feature, java.lang.String str, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(feature, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC45795sxo.class);
            intent.setFlags(268435456);
            intent.putExtra("deeplink", str);
            intent.putExtra("feature", feature);
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            intent.putExtra("feature_bundle", bundle);
            context.startActivity(intent);
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(0, 0);
            }
        }
    }

    public static final void copydefault(ActivityC45795sxo activityC45795sxo, ActivityResult activityResult) {
        java.io.Serializable serializableExtra;
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            if (data != null && (serializableExtra = data.getSerializableExtra("kyc_result_data")) != null) {
                if (TaskDescription.EZpvd[((ResultBackStatus) serializableExtra).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                android.os.Bundle bundleExtra = activityC45795sxo.getIntent().getBundleExtra("feature_bundle");
                if (bundleExtra == null) {
                    bundleExtra = new android.os.Bundle();
                }
                activityC45795sxo.KWHzl(activityC45795sxo, bundleExtra);
            }
            activityC45795sxo.finish();
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
    }

    public final void KWHzl() {
        OKComplianceRestrictionService.Feature feature;
        final android.os.Bundle bundle;
        java.lang.Object serializable;
        showLoadingAtOnce();
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("feature", OKComplianceRestrictionService.Feature.class);
            } else {
                serializable = (OKComplianceRestrictionService.Feature) extras.getSerializable("feature");
            }
            feature = (OKComplianceRestrictionService.Feature) serializable;
        } else {
            feature = null;
        }
        if (feature == null) {
            finish();
            return;
        }
        android.os.Bundle extras2 = getIntent().getExtras();
        if (extras2 == null || (bundle = extras2.getBundle("feature_bundle")) == null) {
            bundle = new android.os.Bundle();
        }
        rTU rtu = (rTU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rTU.class));
        if (rtu != null) {
            rtu.EZpvd(this, this.AEQbTJ, feature.getCode(), new Function1() { // from class: o.sxs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC45795sxo.OLrzqt(this.KWHzl, bundle, ((java.lang.Boolean) obj).booleanValue());
                }
            }, new Function1() { // from class: o.sxr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC45795sxo.KWHzl(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            }, new Function1() { // from class: o.sxq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC45795sxo.OLrzqt(this.copydefault, (java.lang.String) obj);
                }
            });
        }
    }

    public static final Unit OLrzqt(ActivityC45795sxo activityC45795sxo, android.os.Bundle bundle, boolean z) {
        activityC45795sxo.dismissLoading();
        if (!z) {
            activityC45795sxo.KWHzl(activityC45795sxo, bundle);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC45795sxo activityC45795sxo, int i) {
        activityC45795sxo.finish();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC45795sxo activityC45795sxo, java.lang.String str) {
        activityC45795sxo.dismissLoading();
        if (C34703nhO.AhwBna(activityC45795sxo)) {
            if (str == null) {
                str = "";
            }
            pUU.EZpvd("DerivativeOnboarding", str);
        }
        activityC45795sxo.finish();
        return Unit.INSTANCE;
    }

    public final void KWHzl(android.content.Context context, android.os.Bundle bundle) {
        java.lang.Object string = bundle.getString("bizType");
        if (string == null) {
            string = 0;
        }
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, "trade/main/page?bizType=" + string, null, new Function1() { // from class: o.sxt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45795sxo.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
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
