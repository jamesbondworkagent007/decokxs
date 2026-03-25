package o;

import androidx.core.content.IntentCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.okinc.business.trade.features.home.ui.meme.preset.MemeSelectionActivityResultContract;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;

/* JADX INFO: renamed from: o.lll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC31001lll extends AbstractActivityC30928lkR {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.llj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC31001lll.OLrzqt(this.AEQbTJ);
        }
    });

    private final MemeSelectionActivityResultContract.Input AEQbTJ() {
        return (MemeSelectionActivityResultContract.Input) this.AEQbTJ.getValue();
    }

    public static final MemeSelectionActivityResultContract.Input OLrzqt(ActivityC31001lll activityC31001lll) {
        android.content.Intent intent = activityC31001lll.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        return (MemeSelectionActivityResultContract.Input) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "data", MemeSelectionActivityResultContract.Input.class));
    }

    @Override // o.AbstractActivityC30928lkR, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C21564hEa c21564hEaKWHzl = C21564hEa.KWHzl(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c21564hEaKWHzl, "");
        setContentView(c21564hEaKWHzl.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(c21564hEaKWHzl.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.lln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC31001lll.KWHzl(view, windowInsetsCompat);
            }
        });
        MemeSelectionActivityResultContract.Input inputAEQbTJ = AEQbTJ();
        if (inputAEQbTJ != null) {
            getSupportFragmentManager().beginTransaction().replace(C23274hvD.Application.DfrfUJ, C31008lls.Companion.copydefault(inputAEQbTJ), C31008lls.class.getName()).commitAllowingStateLoss();
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.llm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC31001lll.copydefault(this.copydefault);
            }
        });
    }

    public static final WindowInsetsCompat KWHzl(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "");
        view.setPadding(view.getPaddingLeft(), insets.top, view.getPaddingRight(), insets2.bottom);
        return windowInsetsCompat;
    }

    public static final void copydefault(ActivityC31001lll activityC31001lll) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC31001lll, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC30928lkR, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC30928lkR, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC30928lkR, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC30928lkR, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
