package o;

import androidx.autofill.HintConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.doN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC14590doN extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static Function1<? super java.lang.String, Unit> EZpvd = new Function1() { // from class: o.doK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return ActivityC14590doN.AEQbTJ((java.lang.String) obj);
        }
    };
    public static Function0<Unit> copydefault = new Function0() { // from class: o.doM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC14590doN.copydefault();
        }
    };

    /* JADX INFO: renamed from: o.doN$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.doN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void OLrzqt(@NotNull Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            ActivityC14590doN.EZpvd = function1;
        }

        public final void EZpvd(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            ActivityC14590doN.copydefault = function0;
        }

        public static /* synthetic */ void start$default(Activity activity, android.content.Context context, java.lang.String str, Function1 function1, Function0 function0, boolean z, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                z = false;
            }
            activity.copydefault(context, str, function1, function0, z);
        }

        public final void copydefault(@NotNull android.content.Context context, java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function0<Unit> function0, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function0, "");
            OLrzqt(function1);
            EZpvd(function0);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC14590doN.class);
            intent.putExtra("oldPassword", str);
            intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, z);
            context.startActivity(intent);
        }
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C13754dXa.TaskDescription.dHguZz);
        ((C33537myN) findViewById(C13754dXa.ActionBar.accept)).setBackgroundColor(0);
        androidx.fragment.app.Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C13754dXa.ActionBar.HJWChPRAkuRW);
        Intrinsics.copydefault(fragmentFindFragmentById, "");
        C14593doQ c14593doQ = (C14593doQ) fragmentFindFragmentById;
        c14593doQ.OLrzqt(EZpvd, copydefault);
        c14593doQ.OLrzqt(getIntent().getBooleanExtra(HintConstants.AUTOFILL_HINT_PASSWORD, false));
        c14593doQ.copydefault(getIntent().getStringExtra("oldPassword"));
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.doO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC14590doN.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(ActivityC14590doN activityC14590doN) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC14590doN, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EZpvd = new Function1() { // from class: o.doS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC14590doN.KWHzl((java.lang.String) obj);
            }
        };
        copydefault = new Function0() { // from class: o.doR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC14590doN.OLrzqt();
            }
        };
    }

    public static final Unit KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
