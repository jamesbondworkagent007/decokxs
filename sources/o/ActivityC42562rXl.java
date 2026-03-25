package o;

import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.JsonObject;
import com.okinc.okcomponents.feature.okcallkit_api.DownloadOKCallKitModuleActivity$buildFeatureManagerWithEnsuredModule$1$1$onProgress$2;
import com.okinc.okcomponents.feature.okcallkit_api.DownloadOKCallKitModuleActivity$dispatchResult$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.ActivityC42562rXl;
import o.C42568rXr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rXl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC42562rXl extends AbstractActivityC33041mov {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public C34715nha EZpvd;
    public Job copydefault;

    /* JADX INFO: renamed from: o.rXl$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rXl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC42562rXl.class);
        }
    }

    /* JADX INFO: renamed from: o.rXl$Activity */
    public static final class Activity extends AbstractC34718nhd {
        public Activity() {
        }

        @Override // o.AbstractC34718nhd
        public void AEQbTJ() {
            final ActivityC42562rXl activityC42562rXl = ActivityC42562rXl.this;
            C42567rXq.EZpvd("onSuccess", new Function1() { // from class: o.rXn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC42562rXl.Activity.EZpvd(activityC42562rXl, (C42565rXo) obj);
                }
            });
            ActivityC42562rXl.this.KWHzl();
        }

        public static final Unit EZpvd(ActivityC42562rXl activityC42562rXl, C42565rXo c42565rXo) {
            Intrinsics.checkNotNullParameter(c42565rXo, "");
            c42565rXo.copydefault(activityC42562rXl.getTAG(), "FeatureLoadListner");
            c42565rXo.copydefault("download video module success");
            return Unit.INSTANCE;
        }

        @Override // o.AbstractC34718nhd
        public void copydefault() {
            final ActivityC42562rXl activityC42562rXl = ActivityC42562rXl.this;
            C42567rXq.EZpvd("onCancel", new Function1() { // from class: o.rXi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC42562rXl.Activity.AEQbTJ(activityC42562rXl, (C42565rXo) obj);
                }
            });
            ActivityC42562rXl.this.EZpvd();
        }

        public static final Unit AEQbTJ(ActivityC42562rXl activityC42562rXl, C42565rXo c42565rXo) {
            Intrinsics.checkNotNullParameter(c42565rXo, "");
            c42565rXo.copydefault(activityC42562rXl.getTAG(), "FeatureLoadListner");
            c42565rXo.copydefault("download video module cancelled");
            return Unit.INSTANCE;
        }

        @Override // o.AbstractC34718nhd
        public void copydefault(final java.lang.Exception exc, final java.lang.String str) {
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(str, "");
            C6777aVl.Companion.EZpvd(exc);
            final ActivityC42562rXl activityC42562rXl = ActivityC42562rXl.this;
            C42567rXq.EZpvd("onFailure", new Function1() { // from class: o.rXm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC42562rXl.Activity.EZpvd(activityC42562rXl, str, exc, (C42565rXo) obj);
                }
            });
            ActivityC42562rXl.this.copydefault();
        }

        public static final Unit EZpvd(ActivityC42562rXl activityC42562rXl, java.lang.String str, java.lang.Exception exc, C42565rXo c42565rXo) {
            Intrinsics.checkNotNullParameter(c42565rXo, "");
            c42565rXo.copydefault(activityC42562rXl.getTAG(), "FeatureLoadListner");
            c42565rXo.copydefault("download video module failed");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("message", str);
            jsonObject.addProperty("errorMessage", exc.getMessage());
            c42565rXo.OLrzqt(jsonObject);
            return Unit.INSTANCE;
        }

        @Override // o.AbstractC34718nhd
        public void AEQbTJ(final int i) {
            final ActivityC42562rXl activityC42562rXl = ActivityC42562rXl.this;
            C42567rXq.EZpvd("onProgress", new Function1() { // from class: o.rXh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC42562rXl.Activity.EZpvd(activityC42562rXl, i, (C42565rXo) obj);
                }
            });
            if (ActivityC42562rXl.this.copydefault == null) {
                ActivityC42562rXl activityC42562rXl2 = ActivityC42562rXl.this;
                activityC42562rXl2.copydefault = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC42562rXl2), Dispatchers.getIO(), null, new DownloadOKCallKitModuleActivity$buildFeatureManagerWithEnsuredModule$1$1$onProgress$2(null), 2, null);
            }
        }

        public static final Unit EZpvd(ActivityC42562rXl activityC42562rXl, int i, C42565rXo c42565rXo) {
            Intrinsics.checkNotNullParameter(c42565rXo, "");
            c42565rXo.copydefault(activityC42562rXl.getTAG(), "FeatureLoadListner");
            c42565rXo.copydefault("download video module progress");
            c42565rXo.OLrzqt("process", java.lang.Integer.valueOf(i));
            return Unit.INSTANCE;
        }
    }

    public final C34715nha AEQbTJ() {
        C34715nha c34715nha = new C34715nha(this, "okcallkit_impl");
        c34715nha.AEQbTJ(new Activity());
        return c34715nha;
    }

    public final void valueOf() {
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(final android.os.Bundle bundle) {
        super.onCreate(bundle);
        valueOf();
        setContentView(C42568rXr.ActionBar.OLrzqt);
        C42567rXq.EZpvd("onCreate", new Function1() { // from class: o.rXk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC42562rXl.copydefault(this.KWHzl, bundle, (C42565rXo) obj);
            }
        });
        getOnBackPressedDispatcher().addCallback(new Application());
        if (bundle == null) {
            this.EZpvd = AEQbTJ();
        }
    }

    public static final Unit copydefault(ActivityC42562rXl activityC42562rXl, android.os.Bundle bundle, C42565rXo c42565rXo) {
        Intrinsics.checkNotNullParameter(c42565rXo, "");
        c42565rXo.copydefault(activityC42562rXl.getTAG());
        c42565rXo.copydefault("on create download video activity");
        c42565rXo.EZpvd("hasSaveInstanceState", java.lang.Boolean.valueOf(bundle != null));
        c42565rXo.EZpvd("hasBackPressDispatchers", java.lang.Boolean.valueOf(activityC42562rXl.getOnBackPressedDispatcher().hasEnabledCallbacks()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rXl$Application */
    public static final class Application extends OnBackPressedCallback {
        public Application() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            final ActivityC42562rXl activityC42562rXl = ActivityC42562rXl.this;
            C42567rXq.EZpvd("handleOnBackPressed", new Function1() { // from class: o.rXp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC42562rXl.Application.OLrzqt(activityC42562rXl, (C42565rXo) obj);
                }
            });
            C34715nha c34715nha = ActivityC42562rXl.this.EZpvd;
            if (c34715nha != null) {
                c34715nha.KWHzl();
            }
            ActivityC42562rXl.this.EZpvd();
        }

        public static final Unit OLrzqt(ActivityC42562rXl activityC42562rXl, C42565rXo c42565rXo) {
            Intrinsics.checkNotNullParameter(c42565rXo, "");
            c42565rXo.copydefault(activityC42562rXl.getTAG(), "OnBackPressedCallback");
            c42565rXo.copydefault("download video module while user on back pressed");
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(final int i, final int i2, final android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        C42567rXq.EZpvd("onActivityResult", new Function1() { // from class: o.rXj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC42562rXl.KWHzl(this.copydefault, i, i2, intent, (C42565rXo) obj);
            }
        });
        if (i == 1989) {
            C34715nha c34715nha = this.EZpvd;
            C42567rXq.log$default("download video module receiving activity result, featureManager=" + c34715nha, null, 2, null);
            if (c34715nha == null) {
                this.EZpvd = AEQbTJ();
            } else {
                c34715nha.AEQbTJ(i, i2, intent);
            }
        }
    }

    public static final Unit KWHzl(ActivityC42562rXl activityC42562rXl, int i, int i2, android.content.Intent intent, C42565rXo c42565rXo) {
        Intrinsics.checkNotNullParameter(c42565rXo, "");
        c42565rXo.copydefault(activityC42562rXl.getTAG());
        c42565rXo.copydefault("download video module receiving activity result");
        c42565rXo.OLrzqt("requestCode", java.lang.Integer.valueOf(i));
        c42565rXo.OLrzqt("resultCode", java.lang.Integer.valueOf(i2));
        c42565rXo.EZpvd("data", intent != null ? intent.getExtras() : null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        valueOf();
    }

    public final void OLrzqt(int i) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DownloadOKCallKitModuleActivity$dispatchResult$1(this, i, null), 3, null);
    }

    public final void KWHzl() {
        OLrzqt(1);
    }

    public final void EZpvd() {
        OLrzqt(2);
    }

    public final void copydefault() {
        OLrzqt(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.copydefault = null;
        finish();
    }

    public final android.content.Intent OLrzqt() {
        android.os.Bundle extras;
        android.content.Intent intent = new android.content.Intent();
        android.content.Intent intent2 = getIntent();
        if (intent2 == null || (extras = intent2.getExtras()) == null) {
            extras = android.os.Bundle.EMPTY;
        }
        intent.putExtras(extras);
        return intent;
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
