package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nAk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractActivityC33641nAk extends AbstractActivityC33041mov implements InterfaceC58208ywu {
    public volatile C58195ywh AEQbTJ;
    public C58200ywm djBIcL;
    public final java.lang.Object gEmmrt = new java.lang.Object();
    public boolean valueOf = false;

    public AbstractActivityC33641nAk() {
        AEQbTJ();
    }

    private void AEQbTJ() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.nAk.5
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC33641nAk.this.djBIcL();
            }
        });
    }

    private void KWHzl() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = valueOf().EZpvd();
            this.djBIcL = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.djBIcL.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.djBIcL;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return valueOf().aA_();
    }

    public C58195ywh AhwBna() {
        return new C58195ywh(this);
    }

    public final C58195ywh valueOf() {
        if (this.AEQbTJ == null) {
            synchronized (this.gEmmrt) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = AhwBna();
                }
            }
        }
        return this.AEQbTJ;
    }

    public void djBIcL() {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        ((InterfaceC33640nAj) aA_()).OLrzqt((ActivityC33638nAh) C58163ywB.EZpvd(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.AEQbTJ(this, super.getDefaultViewModelProviderFactory());
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
