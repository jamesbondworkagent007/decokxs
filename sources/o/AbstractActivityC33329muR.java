package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity;

/* JADX INFO: renamed from: o.muR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractActivityC33329muR extends FragmentActivity implements InterfaceC58208ywu {
    public C58200ywm AEQbTJ;
    public volatile C58195ywh KWHzl;
    public final java.lang.Object EZpvd = new java.lang.Object();
    public boolean copydefault = false;

    public AbstractActivityC33329muR() {
        OLrzqt();
    }

    private void OLrzqt() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.muR.4
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC33329muR.this.AEQbTJ();
            }
        });
    }

    private void djBIcL() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = EZpvd().EZpvd();
            this.AEQbTJ = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.AEQbTJ.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        djBIcL();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.AEQbTJ;
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
        if (this.KWHzl == null) {
            synchronized (this.EZpvd) {
                if (this.KWHzl == null) {
                    this.KWHzl = KWHzl();
                }
            }
        }
        return this.KWHzl;
    }

    public void AEQbTJ() {
        if (this.copydefault) {
            return;
        }
        this.copydefault = true;
        ((InterfaceC33395mve) aA_()).copydefault((WelcomeActivity) C58163ywB.EZpvd(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.AEQbTJ(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
