package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.debugbox.activity.PhoneInfoActivity;

/* JADX INFO: loaded from: classes15.dex */
public abstract class mLF extends mKV implements InterfaceC58208ywu {
    public C58200ywm KWHzl;
    public volatile C58195ywh copydefault;
    public final java.lang.Object EZpvd = new java.lang.Object();
    public boolean AEQbTJ = false;

    public mLF() {
        AYXKKw();
    }

    private void AYXKKw() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.mLF.3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                mLF.this.gEmmrt();
            }
        });
    }

    private void valueOf() {
        if (getApplication() instanceof InterfaceC58206yws) {
            C58200ywm c58200ywmEZpvd = KWHzl().EZpvd();
            this.KWHzl = c58200ywmEZpvd;
            if (c58200ywmEZpvd.EZpvd()) {
                this.KWHzl.AEQbTJ(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        valueOf();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C58200ywm c58200ywm = this.KWHzl;
        if (c58200ywm != null) {
            c58200ywm.AEQbTJ();
        }
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return KWHzl().aA_();
    }

    public C58195ywh EZpvd() {
        return new C58195ywh(this);
    }

    public final C58195ywh KWHzl() {
        if (this.copydefault == null) {
            synchronized (this.EZpvd) {
                if (this.copydefault == null) {
                    this.copydefault = EZpvd();
                }
            }
        }
        return this.copydefault;
    }

    public void gEmmrt() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        ((InterfaceC32012mMf) aA_()).AEQbTJ((PhoneInfoActivity) C58163ywB.EZpvd(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.AEQbTJ(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
