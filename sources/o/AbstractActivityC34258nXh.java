package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nXh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractActivityC34258nXh extends nPL implements InterfaceC58208ywu {
    public volatile C58195ywh AYXKKw;
    public C58200ywm AhwBna;
    public final java.lang.Object valueOf = new java.lang.Object();
    public boolean gEmmrt = false;

    public AbstractActivityC34258nXh() {
        gEmmrt();
    }

    private void gEmmrt() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.nXh.2
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC34258nXh.this.AhwBna();
            }
        });
    }

    private void AYXKKw() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = valueOf().EZpvd();
            this.AhwBna = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.AhwBna.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        AYXKKw();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.AhwBna;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return valueOf().aA_();
    }

    public C58195ywh djBIcL() {
        return new C58195ywh(this);
    }

    public final C58195ywh valueOf() {
        if (this.AYXKKw == null) {
            synchronized (this.valueOf) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = djBIcL();
                }
            }
        }
        return this.AYXKKw;
    }

    public void AhwBna() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
        ((nXA) aA_()).EZpvd((ActivityC34260nXj) C58163ywB.EZpvd(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.AEQbTJ(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
