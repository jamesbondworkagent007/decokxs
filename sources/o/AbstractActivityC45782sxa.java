package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.okex.lite.onboarding.ui.OKXWelcomeVerificationActivity;

/* JADX INFO: renamed from: o.sxa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractActivityC45782sxa extends AbstractActivityC33008moO implements InterfaceC58208ywu {
    public volatile C58195ywh AEQbTJ;
    public C58200ywm OLrzqt;
    public final java.lang.Object copydefault = new java.lang.Object();
    public boolean KWHzl = false;

    public AbstractActivityC45782sxa() {
        EZpvd();
    }

    private void EZpvd() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.sxa.4
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC45782sxa.this.KWHzl();
            }
        });
    }

    private void gEmmrt() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = AEQbTJ().EZpvd();
            this.OLrzqt = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.OLrzqt.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt();
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
        return AEQbTJ().aA_();
    }

    public C58195ywh OLrzqt() {
        return new C58195ywh(this);
    }

    public final C58195ywh AEQbTJ() {
        if (this.AEQbTJ == null) {
            synchronized (this.copydefault) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = OLrzqt();
                }
            }
        }
        return this.AEQbTJ;
    }

    public void KWHzl() {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        ((InterfaceC45792sxl) aA_()).KWHzl((OKXWelcomeVerificationActivity) C58163ywB.EZpvd(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.AEQbTJ(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
