package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lKW<T extends ViewDataBinding> extends lzF<T> implements InterfaceC58208ywu {
    public final java.lang.Object AYXKKw;
    public boolean AhwBna;
    public volatile C58195ywh gEmmrt;
    public C58200ywm valueOf;

    public lKW(int i) {
        super(i);
        this.AYXKKw = new java.lang.Object();
        this.AhwBna = false;
        gEmmrt();
    }

    private void gEmmrt() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.lKW.3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                lKW.this.djBIcL();
            }
        });
    }

    private void AhwBna() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = AYXKKw().EZpvd();
            this.valueOf = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.valueOf.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.lzF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        AhwBna();
    }

    @Override // o.lzF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.valueOf;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AYXKKw().aA_();
    }

    public C58195ywh valueOf() {
        return new C58195ywh(this);
    }

    public final C58195ywh AYXKKw() {
        if (this.gEmmrt == null) {
            synchronized (this.AYXKKw) {
                if (this.gEmmrt == null) {
                    this.gEmmrt = valueOf();
                }
            }
        }
        return this.gEmmrt;
    }

    public void djBIcL() {
        if (this.AhwBna) {
            return;
        }
        this.AhwBna = true;
        ((lKV) aA_()).AEQbTJ((lKM) C58163ywB.EZpvd(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.AEQbTJ(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // o.lzF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.lzF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.lzF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.lzF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
