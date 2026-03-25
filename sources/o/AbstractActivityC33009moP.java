package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.moP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractActivityC33009moP<T extends ViewDataBinding> extends AbstractActivityC33041mov {
    public final android.util.SparseArray<C33510mxn> getFieldNames = C33503mxg.AEQbTJ();
    public T uzCIH;

    public abstract int bd_();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public android.util.SparseArray<C33510mxn> getSwitchThemePairs() {
        return this.getFieldNames;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Integer numKWHzl = C33503mxg.KWHzl(this.getFieldNames);
        if (numKWHzl != null) {
            setTheme(numKWHzl.intValue());
        }
        super.onCreate(bundle);
        this.uzCIH = (T) DataBindingUtil.setContentView(this, bd_());
    }

    public final T AhwBna() {
        T t = this.uzCIH;
        if (t != null) {
            return t;
        }
        Intrinsics.gEmmrt("");
        return null;
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
