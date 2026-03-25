package o;

import android.view.View;
import com.okinc.lifecycle.ui.debug.LegacyDeeplinkDebugActivity;
import o.pKK;

/* JADX INFO: loaded from: classes16.dex */
public final class pPE extends AbstractActivityC33041mov {
    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(pKK.ActionBar.EZpvd);
        ((android.widget.ImageView) findViewById(pKK.StateListAnimator.KWHzl)).setOnClickListener(new View.OnClickListener() { // from class: o.pPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pPE.EZpvd(this.copydefault, view);
            }
        });
        ((C52794wYp) findViewById(pKK.StateListAnimator.AEQbTJ)).setOnClickListener(new View.OnClickListener() { // from class: o.pPI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pPE.gEmmrt(this.EZpvd, view);
            }
        });
        ((C52794wYp) findViewById(pKK.StateListAnimator.valueOf)).setOnClickListener(new View.OnClickListener() { // from class: o.pPL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pPE.AhwBna(this.OLrzqt, view);
            }
        });
        ((C52794wYp) findViewById(pKK.StateListAnimator.AhwBna)).setOnClickListener(new View.OnClickListener() { // from class: o.pPM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pPE.djBIcL(this.KWHzl, view);
            }
        });
    }

    public static final void EZpvd(pPE ppe, android.view.View view) {
        ppe.finish();
    }

    public static final void gEmmrt(pPE ppe, android.view.View view) {
        ppe.startActivity(new android.content.Intent(ppe, (java.lang.Class<?>) pOG.class));
    }

    public static final void AhwBna(pPE ppe, android.view.View view) {
        ppe.startActivity(new android.content.Intent(ppe, (java.lang.Class<?>) LegacyDeeplinkDebugActivity.class));
    }

    public static final void djBIcL(pPE ppe, android.view.View view) {
        ppe.startActivity(new android.content.Intent(ppe, (java.lang.Class<?>) ActivityC38178pPc.class));
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
