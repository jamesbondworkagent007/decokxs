package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lPE<T extends ViewDataBinding> extends AbstractActivityC31906mIh<T> implements InterfaceC58208ywu {
    public boolean EZpvd;
    public volatile C58195ywh KWHzl;
    public final java.lang.Object OLrzqt;
    public C58200ywm copydefault;

    public lPE(int i) {
        super(i);
        this.OLrzqt = new java.lang.Object();
        this.EZpvd = false;
        AYXKKw();
    }

    private void AYXKKw() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.lPE.3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                lPE.this.valueOf();
            }
        });
    }

    private void gEmmrt() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = AEQbTJ().EZpvd();
            this.copydefault = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.copydefault.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt();
    }

    @Override // o.AbstractActivityC31906mIh, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.copydefault;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AEQbTJ().aA_();
    }

    public C58195ywh djBIcL() {
        return new C58195ywh(this);
    }

    public final C58195ywh AEQbTJ() {
        if (this.KWHzl == null) {
            synchronized (this.OLrzqt) {
                if (this.KWHzl == null) {
                    this.KWHzl = djBIcL();
                }
            }
        }
        return this.KWHzl;
    }

    public void valueOf() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        ((lPQ) aA_()).copydefault((lPJ) C58163ywB.EZpvd(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.AEQbTJ(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
