package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.pBd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractActivityC37800pBd extends AbstractActivityC37805pBi implements InterfaceC58208ywu {
    public volatile C58195ywh KWHzl;
    public C58200ywm OLrzqt;
    public final java.lang.Object copydefault = new java.lang.Object();
    public boolean EZpvd = false;

    public AbstractActivityC37800pBd() {
        AuCTel();
    }

    private void AuCTel() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.pBd.2
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC37800pBd.this.AEQbTJ();
            }
        });
    }

    private void ejfBZ() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = EZpvd().EZpvd();
            this.OLrzqt = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.OLrzqt.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.AbstractActivityC37805pBi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        ejfBZ();
    }

    @Override // o.AbstractActivityC37805pBi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.OLrzqt;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return EZpvd().aA_();
    }

    /* JADX DEBUG: Possible override for method o.pBi.KWHzl()Landroidx/recyclerview/widget/LinearLayoutManager; */
    public C58195ywh KWHzl() {
        return new C58195ywh(this);
    }

    /* JADX DEBUG: Possible override for method o.pBi.EZpvd()V */
    public final C58195ywh EZpvd() {
        if (this.KWHzl == null) {
            synchronized (this.copydefault) {
                if (this.KWHzl == null) {
                    this.KWHzl = KWHzl();
                }
            }
        }
        return this.KWHzl;
    }

    /* JADX DEBUG: Possible override for method o.pBi.AEQbTJ()F */
    public void AEQbTJ() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        ((pBL) aA_()).EZpvd((pBN) C58163ywB.EZpvd(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.AEQbTJ(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // o.AbstractActivityC37805pBi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37805pBi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37805pBi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37805pBi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
