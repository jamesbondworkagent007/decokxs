package o;

import androidx.activity.contextaware.OnContextAvailableListener;
import com.okinc.okex.center.ui.SupportHomeBaseActivity;

/* JADX INFO: renamed from: o.sfw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractActivityC44918sfw extends SupportHomeBaseActivity {
    public boolean copydefault = false;

    public AbstractActivityC44918sfw() {
        AkhnZx();
    }

    private void AkhnZx() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.sfw.4
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                AbstractActivityC44918sfw.this.OLrzqt();
            }
        });
    }

    @Override // o.AbstractActivityC44871sfB
    public void OLrzqt() {
        if (this.copydefault) {
            return;
        }
        this.copydefault = true;
        ((InterfaceC44879sfJ) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).KWHzl((ActivityC44873sfD) C58163ywB.EZpvd(this));
    }

    @Override // com.okinc.okex.center.ui.SupportHomeBaseActivity, o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.okinc.okex.center.ui.SupportHomeBaseActivity, o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.okinc.okex.center.ui.SupportHomeBaseActivity, o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.okinc.okex.center.ui.SupportHomeBaseActivity, o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.okinc.okex.center.ui.SupportHomeBaseActivity, o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
