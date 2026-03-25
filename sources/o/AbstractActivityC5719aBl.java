package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.aBl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractActivityC5719aBl extends AbstractActivityC33041mov implements InterfaceC58208ywu {
    public volatile C58195ywh OLrzqt;
    public C58200ywm copydefault;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public boolean AEQbTJ = false;

    public AbstractActivityC5719aBl() {
        KWHzl();
    }

    private void KWHzl() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.aBl.3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC5719aBl.this.EZpvd();
            }
        });
    }

    private void gEmmrt() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = OLrzqt().EZpvd();
            this.copydefault = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.copydefault.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.copydefault;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return OLrzqt().aA_();
    }

    public C58195ywh AEQbTJ() {
        return new C58195ywh(this);
    }

    public final C58195ywh OLrzqt() {
        if (this.OLrzqt == null) {
            synchronized (this.KWHzl) {
                if (this.OLrzqt == null) {
                    this.OLrzqt = AEQbTJ();
                }
            }
        }
        return this.OLrzqt;
    }

    public void EZpvd() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        ((InterfaceC5720aBm) aA_()).KWHzl((ActivityC5718aBk) C58163ywB.EZpvd(this));
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
