package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nzc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractActivityC35663nzc extends AbstractActivityC33007moN implements InterfaceC58208ywu {
    public volatile C58195ywh AYXKKw;
    public C58200ywm valueOf;
    public final java.lang.Object gEmmrt = new java.lang.Object();
    public boolean AhwBna = false;

    public AbstractActivityC35663nzc() {
        AhwBna();
    }

    private void AhwBna() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.nzc.2
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC35663nzc.this.AYXKKw();
            }
        });
    }

    private void AkhnZx() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = OLrzqt().EZpvd();
            this.valueOf = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.valueOf.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        AkhnZx();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.valueOf;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return OLrzqt().aA_();
    }

    public C58195ywh gEmmrt() {
        return new C58195ywh(this);
    }

    public final C58195ywh OLrzqt() {
        if (this.AYXKKw == null) {
            synchronized (this.gEmmrt) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = gEmmrt();
                }
            }
        }
        return this.AYXKKw;
    }

    public void AYXKKw() {
        if (this.AhwBna) {
            return;
        }
        this.AhwBna = true;
        ((InterfaceC35620nym) aA_()).AEQbTJ((ActivityC35548nxT) C58163ywB.EZpvd(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.AEQbTJ(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
