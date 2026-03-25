package o;

import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractActivityC33010moQ<T extends ViewDataBinding> extends AbstractActivityC33009moP<T> {
    public boolean getNewProxyInstance;
    public boolean hDKMBd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.getNewProxyInstance;
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View currentFocus;
        if (copydefault()) {
            return true;
        }
        if (OLrzqt() && motionEvent != null && motionEvent.getAction() == 0 && (currentFocus = getCurrentFocus()) != null && OLrzqt(currentFocus, motionEvent) && KWHzl(this, currentFocus)) {
            C33570myu.AEQbTJ(this, currentFocus);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean OLrzqt(@NotNull android.view.View view, @NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        view.getHitRect(new android.graphics.Rect());
        return !r0.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final boolean KWHzl(@NotNull android.content.Context context, @NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object systemService = context.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        if (!inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0)) {
            return false;
        }
        inputMethodManager.showSoftInput(view, 0);
        return true;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (copydefault()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
