package com.okinc.debugbox.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.amplitude.analytics.BuildConfig;
import com.okinc.base.uploadlog.UpLoadLogException;
import com.okinc.debugbox.activity.NetworkDiagnosisActivity;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.okuser.data.User;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C31962mKj;
import o.C31976mKx;
import o.C43372rnz;
import o.C43384roK;
import o.C52794wYp;
import o.C55326xho;
import o.C6777aVl;
import o.InterfaceC31959mKg;
import o.InterfaceC47278tmy;
import o.ViewOnClickListenerC54939xaY;
import o.mLC;
import o.mLQ;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class NetworkDiagnosisActivity extends mLC implements InterfaceC31959mKg {
    public boolean AYXKKw;
    public ImageView gEmmrt;
    public TextView isConnected;

    @yCM
    public InterfaceC47278tmy userManager;
    public C31962mKj valueOf;
    public C52794wYp values;
    public String AEQbTJ = "NetworkDiagnosisActivity";
    public String AkhnZx = "";
    public String AhwBna = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mKV
    public int AEQbTJ() {
        return C31976mKx.Application.values;
    }

    @Override // o.mKV
    public void OLrzqt() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public String getTAG() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Possible override for method o.mLC.AhwBna()V */
    public final InterfaceC47278tmy AhwBna() {
        InterfaceC47278tmy interfaceC47278tmy = this.userManager;
        if (interfaceC47278tmy != null) {
            return interfaceC47278tmy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.mKV
    public void AEQbTJ(Bundle bundle) {
        C52794wYp c52794wYp = (C52794wYp) findViewById(C31976mKx.Activity.aUsmxb);
        this.values = c52794wYp;
        TextView textView = null;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.mLT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                NetworkDiagnosisActivity.copydefault(this.KWHzl, view);
            }
        });
        ImageView imageView = (ImageView) findViewById(C31976mKx.Activity.gGvvIC);
        this.gEmmrt = imageView;
        if (imageView == null) {
            Intrinsics.gEmmrt("");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.mLS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                NetworkDiagnosisActivity.OLrzqt(this.OLrzqt, view);
            }
        });
        TextView textView2 = (TextView) findViewById(C31976mKx.Activity.QSLkRj);
        this.isConnected = textView2;
        if (textView2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView = textView2;
        }
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public static final void copydefault(NetworkDiagnosisActivity networkDiagnosisActivity, View view) {
        networkDiagnosisActivity.gEmmrt();
    }

    public static final void OLrzqt(NetworkDiagnosisActivity networkDiagnosisActivity, View view) {
        networkDiagnosisActivity.finish();
    }

    @Override // o.mLC, o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt();
    }

    @Override // o.mLC, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C31962mKj c31962mKj = this.valueOf;
        if (c31962mKj != null) {
            c31962mKj.AkhnZx();
        }
    }

    public final void gEmmrt() {
        boolean z;
        String str;
        String uid;
        if (this.AYXKKw) {
            z = true;
            C31962mKj c31962mKj = this.valueOf;
            if (c31962mKj != null) {
                c31962mKj.OLrzqt(true);
            }
            this.valueOf = null;
        } else {
            this.AkhnZx = "";
            String strCopydefault = copydefault(false);
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            this.AhwBna = strCopydefault;
            pUU.KWHzl(getTAG(), "domainName : " + this.AhwBna);
            C43372rnz c43372rnz = C43372rnz.copydefault;
            DohTypeEnum dohTypeEnum = DohTypeEnum.HTTP;
            String host$default = C43372rnz.getHost$default(c43372rnz, dohTypeEnum, false, null, 4, null);
            if (host$default == null) {
                host$default = "";
            }
            ArrayList<String> arrayListKWHzl = c43372rnz.KWHzl(dohTypeEnum, host$default);
            if (arrayListKWHzl.isEmpty()) {
                str = "";
            } else {
                String str2 = arrayListKWHzl.get(0);
                Intrinsics.checkNotNullExpressionValue(str2, "");
                str = str2;
            }
            if (TextUtils.isEmpty(this.AhwBna)) {
                try {
                    if (str.length() == 0) {
                        str = "www.okx.com";
                    }
                    this.AhwBna = str;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Context applicationContext = getApplicationContext();
            User userOLrzqt = AhwBna().OLrzqt();
            C31962mKj c31962mKj2 = new C31962mKj(applicationContext, "Demo", "网络诊断", BuildConfig.VERSION_NAME, (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) ? "" : uid, C43384roK.KWHzl.copydefault(), "deviceID", this.AhwBna, null, "", "", "", this);
            this.valueOf = c31962mKj2;
            z = true;
            c31962mKj2.EZpvd(true);
            C31962mKj c31962mKj3 = this.valueOf;
            if (c31962mKj3 != null) {
                c31962mKj3.copydefault(new String[0]);
            }
            C52794wYp c52794wYp = this.values;
            if (c52794wYp == null) {
                Intrinsics.gEmmrt("");
                c52794wYp = null;
            }
            C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
            TextView textView = this.isConnected;
            if (textView == null) {
                Intrinsics.gEmmrt("");
                textView = null;
            }
            textView.setText("Traceroute with max 30 hops...");
        }
        this.AYXKKw ^= z;
    }

    @Override // o.InterfaceC31959mKg
    public void OLrzqt(String str) {
        TextView textView = this.isConnected;
        C52794wYp c52794wYp = null;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(str);
        C52794wYp c52794wYp2 = this.values;
        if (c52794wYp2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c52794wYp = c52794wYp2;
        }
        c52794wYp.fIwbmz();
        this.AYXKKw = false;
        pUU.KWHzl(getTAG(), "OnNetDiagnoFinished : " + str);
        EZpvd(str);
    }

    public final void EZpvd(final String str) {
        mLQ mlq = new mLQ(this);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaYAddCustomView$default = ViewOnClickListenerC54939xaY.addCustomView$default(new ViewOnClickListenerC54939xaY(this), mlq, 0, 2, null);
        mlq.setConfirm(new Function0() { // from class: o.mLV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return NetworkDiagnosisActivity.KWHzl(this.OLrzqt, str, viewOnClickListenerC54939xaYAddCustomView$default);
            }
        });
        viewOnClickListenerC54939xaYAddCustomView$default.show();
    }

    public static final Unit KWHzl(NetworkDiagnosisActivity networkDiagnosisActivity, String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        networkDiagnosisActivity.KWHzl(str);
        networkDiagnosisActivity.AYXKKw();
        viewOnClickListenerC54939xaY.dismiss();
        C55326xho.toast$default("copy to clipboard success", (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        return Unit.INSTANCE;
    }

    public final String copydefault(boolean z) {
        return C43372rnz.getHost$default(C43372rnz.copydefault, DohTypeEnum.HTTP, z, null, 4, null);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.AYXKKw) {
            C55326xho.toast$default("please wait a moment，diagnosis is running", (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        if (this.AYXKKw) {
            C55326xho.toast$default("please wait a moment，diagnosis is running", (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        } else {
            super.finish();
        }
    }

    public final void KWHzl(String str) {
        Object systemService = getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("log", str));
    }

    public final void AYXKKw() {
        C6777aVl.Companion.EZpvd(new UpLoadLogException("debug upload log"));
    }

    @Override // o.InterfaceC31959mKg
    public void copydefault() {
        this.AYXKKw = false;
        C52794wYp c52794wYp = this.values;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        c52794wYp.fIwbmz();
    }

    @Override // o.InterfaceC31959mKg
    public void AEQbTJ(String str) {
        this.AkhnZx = this.AkhnZx + str;
        TextView textView = this.isConnected;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(this.AkhnZx);
    }

    @Override // o.mLC, o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.mLC, o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.mLC, o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.mLC, o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
