package o;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import pub.devrel.easypermissions.AppSettingsDialog;

/* JADX INFO: renamed from: o.zwI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class DialogInterfaceOnClickListenerC60120zwI extends AppCompatActivity implements DialogInterface.OnClickListener {
    public int OLrzqt;
    public androidx.appcompat.app.AlertDialog copydefault;

    public static android.content.Intent OLrzqt(android.content.Context context, AppSettingsDialog appSettingsDialog) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) DialogInterfaceOnClickListenerC60120zwI.class);
        intent.putExtra("extra_app_settings", appSettingsDialog);
        return intent;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AppSettingsDialog appSettingsDialogAEQbTJ = AppSettingsDialog.AEQbTJ(getIntent(), this);
        this.OLrzqt = appSettingsDialogAEQbTJ.EZpvd();
        this.copydefault = appSettingsDialogAEQbTJ.AEQbTJ(this, this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        androidx.appcompat.app.AlertDialog alertDialog = this.copydefault;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.copydefault.dismiss();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        if (i == -1) {
            android.content.Intent data = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.OLrzqt);
            startActivityForResult(data, 7534);
        } else if (i == -2) {
            setResult(0);
            finish();
        } else {
            throw new java.lang.IllegalStateException("Unknown button type: " + i);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
