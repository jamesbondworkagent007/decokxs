package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import o.AbstractC27165jpz;

/* JADX INFO: renamed from: o.jjh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractActivityC26829jjh<T extends AbstractC27165jpz> extends AbstractActivityC24051iTb<T> implements InterfaceC58208ywu {
    public final java.lang.Object AYXKKw = new java.lang.Object();
    public boolean djBIcL = false;
    public volatile C58195ywh gEmmrt;
    public C58200ywm valueOf;

    public AbstractActivityC26829jjh() {
        getNewProxyInstance();
    }

    private void getNewProxyInstance() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.jjh.5
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC26829jjh.this.fARcdN();
            }
        });
    }

    private void getFieldNames() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = fJNWhG().EZpvd();
            this.valueOf = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.valueOf.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        getFieldNames();
    }

    @Override // o.AbstractActivityC24051iTb, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.valueOf;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return fJNWhG().aA_();
    }

    /* JADX DEBUG: Possible override for method o.iTb.fIwbmz()Landroid/animation/ValueAnimator; */
    public C58195ywh fIwbmz() {
        return new C58195ywh(this);
    }

    /* JADX DEBUG: Possible override for method o.iTb.fJNWhG()Landroid/animation/ValueAnimator; */
    public final C58195ywh fJNWhG() {
        if (this.gEmmrt == null) {
            synchronized (this.AYXKKw) {
                if (this.gEmmrt == null) {
                    this.gEmmrt = fIwbmz();
                }
            }
        }
        return this.gEmmrt;
    }

    /* JADX DEBUG: Possible override for method o.iTb.fARcdN()Lo/iCu; */
    public void fARcdN() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        ((InterfaceC26889jko) aA_()).EZpvd((ActivityC26816jjU) C58163ywB.EZpvd(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.AEQbTJ(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
