package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pWY extends AbstractActivityC33041mov implements InterfaceC58208ywu {
    public C58200ywm OLrzqt;
    public volatile C58195ywh copydefault;
    public final java.lang.Object EZpvd = new java.lang.Object();
    public boolean AEQbTJ = false;

    public pWY() {
        OLrzqt();
    }

    private void OLrzqt() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.pWY.1
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                pWY.this.AEQbTJ();
            }
        });
    }

    private void AhwBna() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = KWHzl().EZpvd();
            this.OLrzqt = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.OLrzqt.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        AhwBna();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.OLrzqt;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return KWHzl().aA_();
    }

    public C58195ywh EZpvd() {
        return new C58195ywh(this);
    }

    public final C58195ywh KWHzl() {
        if (this.copydefault == null) {
            synchronized (this.EZpvd) {
                if (this.copydefault == null) {
                    this.copydefault = EZpvd();
                }
            }
        }
        return this.copydefault;
    }

    public void AEQbTJ() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        ((InterfaceC38404pXn) aA_()).KWHzl((ActivityC38399pXi) C58163ywB.EZpvd(this));
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
