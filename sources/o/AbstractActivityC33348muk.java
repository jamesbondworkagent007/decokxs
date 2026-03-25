package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.core.ok_app.homepage.pro.MainActivity;

/* JADX INFO: renamed from: o.muk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractActivityC33348muk extends AbstractActivityC33041mov implements InterfaceC58208ywu {
    public volatile C58195ywh KWHzl;
    public C58200ywm OLrzqt;
    public final java.lang.Object AEQbTJ = new java.lang.Object();
    public boolean copydefault = false;

    public AbstractActivityC33348muk() {
        EZpvd();
    }

    private void EZpvd() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.muk.5
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC33348muk.this.KWHzl();
            }
        });
    }

    private void AhwBna() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = AEQbTJ().EZpvd();
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
        return AEQbTJ().aA_();
    }

    public C58195ywh OLrzqt() {
        return new C58195ywh(this);
    }

    public final C58195ywh AEQbTJ() {
        if (this.KWHzl == null) {
            synchronized (this.AEQbTJ) {
                if (this.KWHzl == null) {
                    this.KWHzl = OLrzqt();
                }
            }
        }
        return this.KWHzl;
    }

    public void KWHzl() {
        if (this.copydefault) {
            return;
        }
        this.copydefault = true;
        ((InterfaceC33359muv) aA_()).KWHzl((MainActivity) C58163ywB.EZpvd(this));
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
