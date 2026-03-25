package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.fTu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractActivityC17828fTu extends AbstractActivityC33013moT implements InterfaceC58208ywu {
    public C58200ywm AkhnZx;
    public final java.lang.Object djBIcL = new java.lang.Object();
    public boolean fetchVPNInfo = false;
    public volatile C58195ywh valueOf;

    public AbstractActivityC17828fTu() {
        OLrzqt();
    }

    private void OLrzqt() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.fTu.3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC17828fTu.this.djBIcL();
            }
        });
    }

    private void AEQbTJ() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = EZpvd().EZpvd();
            this.AkhnZx = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.AkhnZx.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.AkhnZx;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return EZpvd().aA_();
    }

    public C58195ywh KWHzl() {
        return new C58195ywh(this);
    }

    public final C58195ywh EZpvd() {
        if (this.valueOf == null) {
            synchronized (this.djBIcL) {
                if (this.valueOf == null) {
                    this.valueOf = KWHzl();
                }
            }
        }
        return this.valueOf;
    }

    public void djBIcL() {
        if (this.fetchVPNInfo) {
            return;
        }
        this.fetchVPNInfo = true;
        ((fSM) aA_()).EZpvd((fSK) C58163ywB.EZpvd(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.AEQbTJ(this, super.getDefaultViewModelProviderFactory());
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
