package o;

import android.view.View;
import com.just.agentweb.DefaultWebClient;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mMM extends mKV implements View.OnClickListener {
    public C52794wYp AEQbTJ;
    public android.widget.RelativeLayout AhwBna;
    public C52794wYp EZpvd;
    public C52794wYp KWHzl;
    public C52794wYp OLrzqt;
    public C52794wYp copydefault;
    public android.widget.EditText gEmmrt;
    public android.widget.EditText valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mKV
    public int AEQbTJ() {
        return C31976mKx.Application.fARcdN;
    }

    @Override // o.mKV
    public void OLrzqt() {
    }

    @Override // o.mKV
    public void AEQbTJ(android.os.Bundle bundle) {
        this.KWHzl = (C52794wYp) findViewById(C31976mKx.Activity.KWHzl);
        this.AEQbTJ = (C52794wYp) findViewById(C31976mKx.Activity.values);
        this.EZpvd = (C52794wYp) findViewById(C31976mKx.Activity.fetchVPNInfo);
        this.copydefault = (C52794wYp) findViewById(C31976mKx.Activity.isConnected);
        this.OLrzqt = (C52794wYp) findViewById(C31976mKx.Activity.AhwBna);
        C52794wYp c52794wYp = this.KWHzl;
        android.widget.RelativeLayout relativeLayout = null;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        c52794wYp.setOnClickListener(this);
        C52794wYp c52794wYp2 = this.AEQbTJ;
        if (c52794wYp2 == null) {
            Intrinsics.gEmmrt("");
            c52794wYp2 = null;
        }
        c52794wYp2.setOnClickListener(this);
        C52794wYp c52794wYp3 = this.EZpvd;
        if (c52794wYp3 == null) {
            Intrinsics.gEmmrt("");
            c52794wYp3 = null;
        }
        c52794wYp3.setOnClickListener(this);
        C52794wYp c52794wYp4 = this.copydefault;
        if (c52794wYp4 == null) {
            Intrinsics.gEmmrt("");
            c52794wYp4 = null;
        }
        c52794wYp4.setOnClickListener(this);
        C52794wYp c52794wYp5 = this.OLrzqt;
        if (c52794wYp5 == null) {
            Intrinsics.gEmmrt("");
            c52794wYp5 = null;
        }
        c52794wYp5.setOnClickListener(this);
        android.widget.EditText editText = (android.widget.EditText) findViewById(C31976mKx.Activity.zuBGHE);
        this.gEmmrt = editText;
        if (editText == null) {
            Intrinsics.gEmmrt("");
            editText = null;
        }
        editText.clearFocus();
        android.widget.EditText editText2 = (android.widget.EditText) findViewById(C31976mKx.Activity.AwvSrB);
        this.valueOf = editText2;
        if (editText2 == null) {
            Intrinsics.gEmmrt("");
            editText2 = null;
        }
        editText2.clearFocus();
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) findViewById(C31976mKx.Activity.DXXBbs);
        this.AhwBna = relativeLayout2;
        if (relativeLayout2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            relativeLayout = relativeLayout2;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: o.mMO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mMM.KWHzl(this.KWHzl, view);
            }
        });
    }

    public static final void KWHzl(mMM mmm, android.view.View view) {
        mmm.finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull android.view.View view) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(view, "");
        C52794wYp c52794wYp = this.KWHzl;
        android.widget.EditText editText = null;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        if (Intrinsics.EZpvd(view, c52794wYp)) {
            string = "https://www.baidu.com";
        } else {
            C52794wYp c52794wYp2 = this.AEQbTJ;
            if (c52794wYp2 == null) {
                Intrinsics.gEmmrt("");
                c52794wYp2 = null;
            }
            if (Intrinsics.EZpvd(view, c52794wYp2)) {
                string = "https://www.okx.com";
            } else {
                C52794wYp c52794wYp3 = this.EZpvd;
                if (c52794wYp3 == null) {
                    Intrinsics.gEmmrt("");
                    c52794wYp3 = null;
                }
                if (Intrinsics.EZpvd(view, c52794wYp3)) {
                    string = "https://web3.okx.com";
                } else {
                    C52794wYp c52794wYp4 = this.copydefault;
                    if (c52794wYp4 == null) {
                        Intrinsics.gEmmrt("");
                        c52794wYp4 = null;
                    }
                    if (Intrinsics.EZpvd(view, c52794wYp4)) {
                        string = "https://tr.okx.com";
                    } else {
                        C52794wYp c52794wYp5 = this.OLrzqt;
                        if (c52794wYp5 == null) {
                            Intrinsics.gEmmrt("");
                            c52794wYp5 = null;
                        }
                        if (Intrinsics.EZpvd(view, c52794wYp5)) {
                            android.widget.EditText editText2 = this.gEmmrt;
                            if (editText2 == null) {
                                Intrinsics.gEmmrt("");
                                editText2 = null;
                            }
                            if (android.text.TextUtils.isEmpty(editText2.getText())) {
                                android.widget.Toast.makeText(this, "请输入网址(Please input the URL)", 0).show();
                                string = null;
                            } else {
                                android.widget.EditText editText3 = this.gEmmrt;
                                if (editText3 == null) {
                                    Intrinsics.gEmmrt("");
                                    editText3 = null;
                                }
                                android.text.Editable text = editText3.getText();
                                Intrinsics.checkNotNullExpressionValue(text, "");
                                if (StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) text, (java.lang.CharSequence) "http", false, 2, (java.lang.Object) null)) {
                                    android.widget.EditText editText4 = this.gEmmrt;
                                    if (editText4 == null) {
                                        Intrinsics.gEmmrt("");
                                        editText4 = null;
                                    }
                                    string = editText4.getText().toString();
                                } else {
                                    android.widget.EditText editText5 = this.gEmmrt;
                                    if (editText5 == null) {
                                        Intrinsics.gEmmrt("");
                                        editText5 = null;
                                    }
                                    string = DefaultWebClient.HTTP_SCHEME + ((java.lang.Object) editText5.getText());
                                }
                            }
                        } else {
                            string = null;
                        }
                    }
                }
            }
        }
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("url", string);
        android.widget.EditText editText6 = this.valueOf;
        if (editText6 == null) {
            Intrinsics.gEmmrt("");
            editText6 = null;
        }
        if (!android.text.TextUtils.isEmpty(editText6.getText())) {
            android.widget.EditText editText7 = this.valueOf;
            if (editText7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                editText = editText7;
            }
            bundle.putString("post_data", editText.getText().toString());
        }
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, bundle, null, 4, null);
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
