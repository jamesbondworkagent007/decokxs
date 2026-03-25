package o;

import android.view.View;
import android.widget.CompoundButton;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;

/* JADX INFO: loaded from: classes15.dex */
public final class mKR extends mKV {
    public android.widget.RelativeLayout EZpvd;
    public C55239xgG KWHzl;
    public android.widget.TextView OLrzqt;
    public android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mKV
    public int AEQbTJ() {
        return C31976mKx.Application.copydefault;
    }

    @Override // o.mKV
    public void OLrzqt() {
    }

    @Override // o.mKV
    public void AEQbTJ(android.os.Bundle bundle) {
        this.KWHzl = (C55239xgG) findViewById(C31976mKx.Activity.dUDNAs);
        this.OLrzqt = (android.widget.TextView) findViewById(C31976mKx.Activity.OLrzqt);
        this.copydefault = (android.widget.TextView) findViewById(C31976mKx.Activity.zsXlph);
        C55239xgG c55239xgG = this.KWHzl;
        android.widget.TextView textView = null;
        if (c55239xgG == null) {
            Intrinsics.gEmmrt("");
            c55239xgG = null;
        }
        c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                mKR.EZpvd(this.KWHzl, compoundButton, z);
            }
        });
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(C31976mKx.Activity.DXXBbs);
        this.EZpvd = relativeLayout;
        if (relativeLayout == null) {
            Intrinsics.gEmmrt("");
            relativeLayout = null;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: o.mKP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mKR.KWHzl(this.KWHzl, view);
            }
        });
        android.widget.TextView textView2 = this.OLrzqt;
        if (textView2 == null) {
            Intrinsics.gEmmrt("");
            textView2 = null;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: o.mKS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mKR.AEQbTJ(this.OLrzqt, view);
            }
        });
        android.widget.TextView textView3 = this.copydefault;
        if (textView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView = textView3;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.mKO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mKR.AhwBna(this.AEQbTJ, view);
            }
        });
    }

    public static final void EZpvd(mKR mkr, android.widget.CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                mNT.copydefault.copydefault(mkr, true);
            } else {
                mNT.copydefault.values();
            }
        }
    }

    public static final void KWHzl(mKR mkr, android.view.View view) {
        mkr.finish();
    }

    public static final void AEQbTJ(mKR mkr, android.view.View view) {
        mkr.startActivity(mKU.Companion.EZpvd(mkr, "deep_link_attribution"));
    }

    public static final void AhwBna(mKR mkr, android.view.View view) {
        mkr.startActivity(mKU.Companion.EZpvd(mkr, "deep_link_result"));
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

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
