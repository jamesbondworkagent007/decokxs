package o;

import androidx.fragment.app.FragmentFactory;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32982mnp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pXj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ActivityC38400pXj extends pWZ {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.pXj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pXj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final <T extends androidx.fragment.app.Fragment> void AEQbTJ(@NotNull android.content.Context context, @NotNull InterfaceC56551yJo<T> interfaceC56551yJo) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38400pXj.class);
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            intent.putExtra("debug_fragment", interfaceC56551yJo.gEmmrt());
            context.startActivity(intent);
        }
    }

    @Override // o.pWZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Object objM7377constructorimpl;
        super.onCreate(bundle);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        frameLayout.setPadding(0, 200, 0, 150);
        frameLayout.setId(C32982mnp.StateListAnimator.AhwBna);
        setContentView(frameLayout);
        try {
            Result.Application application = Result.Companion;
            java.lang.ClassLoader classLoader = getClassLoader();
            java.lang.String stringExtra = getIntent().getStringExtra("debug_fragment");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.Class<? extends androidx.fragment.app.Fragment> clsLoadFragmentClass = FragmentFactory.loadFragmentClass(classLoader, stringExtra);
            Intrinsics.checkNotNullExpressionValue(clsLoadFragmentClass, "");
            InterfaceC56551yJo interfaceC56551yJoKWHzl = yHE.KWHzl(clsLoadFragmentClass);
            Intrinsics.copydefault(interfaceC56551yJoKWHzl, "");
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            objM7377constructorimpl = Result.m7377constructorimpl(C33062mpP.findOrAddFragment$default(interfaceC56551yJoKWHzl, supportFragmentManager, C32982mnp.StateListAnimator.AhwBna, null, null, null, 28, null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
    }

    @Override // o.pWZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.pWZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.pWZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.pWZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
