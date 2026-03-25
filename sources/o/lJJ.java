package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.buysell.ui.cedefiwallet.BuySellEnableDexTradingActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lJJ extends AbstractActivityC33041mov implements InterfaceC58208ywu {
    public volatile C58195ywh AhwBna;
    public C58200ywm valueOf;
    public final java.lang.Object gEmmrt = new java.lang.Object();
    public boolean djBIcL = false;

    public lJJ() {
        AEQbTJ();
    }

    private void AEQbTJ() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.lJJ.5
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                lJJ.this.valueOf();
            }
        });
    }

    private void KWHzl() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = gEmmrt().EZpvd();
            this.valueOf = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.valueOf.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
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
        return gEmmrt().aA_();
    }

    public C58195ywh AhwBna() {
        return new C58195ywh(this);
    }

    public final C58195ywh gEmmrt() {
        if (this.AhwBna == null) {
            synchronized (this.gEmmrt) {
                if (this.AhwBna == null) {
                    this.AhwBna = AhwBna();
                }
            }
        }
        return this.AhwBna;
    }

    public void valueOf() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        ((lJC) aA_()).KWHzl((BuySellEnableDexTradingActivity) C58163ywB.EZpvd(this));
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
