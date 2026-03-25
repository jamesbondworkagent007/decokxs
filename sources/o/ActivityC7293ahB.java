package o;

import android.view.ViewGroup;
import com.immomo.mls.InitData;

/* JADX INFO: renamed from: o.ahB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class ActivityC7293ahB extends AbstractActivityC33041mov {
    public C7328ahk OLrzqt;

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        android.content.Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("KEY_HOTRELOAD", false);
        InitData initDataAEQbTJ = C7327ahj.EZpvd(intent.getExtras()).AEQbTJ(true);
        C7328ahk c7328ahk = new C7328ahk(this, booleanExtra, C7326ahi.EZpvd);
        this.OLrzqt = c7328ahk;
        c7328ahk.EZpvd(frameLayout);
        this.OLrzqt.AEQbTJ(initDataAEQbTJ);
        C7328ahk c7328ahk2 = this.OLrzqt;
        if (c7328ahk2 == null || !c7328ahk2.iwGUEr()) {
            C55326xho.EZpvd("something wrong");
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.OLrzqt.AuCTelauCTel();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.OLrzqt.zLjUOn();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.OLrzqt.zsXlph();
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.OLrzqt.gHZMYf();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            if (keyEvent.getAction() != 1) {
                this.OLrzqt.EZpvd(keyEvent);
            }
            if (!this.OLrzqt.EZpvd()) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.OLrzqt.AubY();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (this.OLrzqt.EZpvd(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
