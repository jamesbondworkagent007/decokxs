package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.aNg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractActivityC6350aNg extends AbstractActivityC33041mov implements InterfaceC58208ywu {
    public C58200ywm EZpvd;
    public volatile C58195ywh copydefault;
    public final java.lang.Object AEQbTJ = new java.lang.Object();
    public boolean OLrzqt = false;

    public AbstractActivityC6350aNg() {
        KWHzl();
    }

    private void KWHzl() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.aNg.4
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC6350aNg.this.OLrzqt();
            }
        });
    }

    private void valueOf() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = AEQbTJ().EZpvd();
            this.EZpvd = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.EZpvd.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        valueOf();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.EZpvd;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AEQbTJ().aA_();
    }

    public C58195ywh EZpvd() {
        return new C58195ywh(this);
    }

    public final C58195ywh AEQbTJ() {
        if (this.copydefault == null) {
            synchronized (this.AEQbTJ) {
                if (this.copydefault == null) {
                    this.copydefault = EZpvd();
                }
            }
        }
        return this.copydefault;
    }

    public void OLrzqt() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        ((InterfaceC6363aNt) aA_()).AEQbTJ((ActivityC6354aNk) C58163ywB.EZpvd(this));
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
