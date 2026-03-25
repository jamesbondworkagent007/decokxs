package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes16.dex */
public abstract class nVJ extends nPL implements InterfaceC58208ywu {
    public volatile C58195ywh AhwBna;
    public C58200ywm fetchVPNInfo;
    public final java.lang.Object AYXKKw = new java.lang.Object();
    public boolean values = false;

    public nVJ() {
        AYXKKw();
    }

    private void AYXKKw() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.nVJ.4
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                nVJ.this.valueOf();
            }
        });
    }

    private void AhwBna() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = djBIcL().EZpvd();
            this.fetchVPNInfo = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.fetchVPNInfo.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        AhwBna();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.fetchVPNInfo;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return djBIcL().aA_();
    }

    public C58195ywh gEmmrt() {
        return new C58195ywh(this);
    }

    public final C58195ywh djBIcL() {
        if (this.AhwBna == null) {
            synchronized (this.AYXKKw) {
                if (this.AhwBna == null) {
                    this.AhwBna = gEmmrt();
                }
            }
        }
        return this.AhwBna;
    }

    public void valueOf() {
        if (this.values) {
            return;
        }
        this.values = true;
        ((InterfaceC34212nVp) aA_()).OLrzqt((ActivityC34206nVj) C58163ywB.EZpvd(this));
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
