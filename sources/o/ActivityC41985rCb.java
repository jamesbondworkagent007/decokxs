package o;

import android.view.View;
import android.widget.RadioGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.ok_kyc_core.extension.OKFaceTestActivity$getData$1;
import com.okinc.ok_kyc_core_api.facial.FacialInfoResult;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rCb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC41985rCb extends AbstractActivityC33041mov {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C43746rvB AEQbTJ = new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ("ok_app_kyc", new java.util.HashMap<>()), null, 4, null);
    public android.widget.TextView AYXKKw;
    public android.widget.RadioGroup AhwBna;
    public C52794wYp KWHzl;
    public wYK OLrzqt;
    public android.widget.EditText copydefault;
    public final ActivityResultLauncher<android.content.Intent> gEmmrt;
    public android.widget.LinearLayout valueOf;

    /* JADX INFO: renamed from: o.rCb$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rCb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public ActivityC41985rCb() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rCd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC41985rCb.AEQbTJ(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C43662rtX.TaskDescription.AYXKKw);
        EZpvd();
        KWHzl();
    }

    private final void KWHzl() {
        C52794wYp c52794wYp = this.KWHzl;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.rCc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC41985rCb.OLrzqt(this.copydefault, view);
                }
            });
        }
    }

    public static final void OLrzqt(ActivityC41985rCb activityC41985rCb, android.view.View view) {
        activityC41985rCb.AEQbTJ();
    }

    private final void EZpvd() {
        this.KWHzl = (C52794wYp) findViewById(C43662rtX.ActionBar.iZzfmt);
        this.OLrzqt = (wYK) findViewById(C43662rtX.ActionBar.ffGIBT);
        this.AYXKKw = (android.widget.TextView) findViewById(C43662rtX.ActionBar.DfrfUJ);
        this.AhwBna = (android.widget.RadioGroup) findViewById(C43662rtX.ActionBar.ODCBUN);
        this.valueOf = (android.widget.LinearLayout) findViewById(C43662rtX.ActionBar.DQzvGN);
        this.copydefault = (android.widget.EditText) findViewById(C43662rtX.ActionBar.DaRZkR);
        OLrzqt();
    }

    public final void OLrzqt() {
        android.widget.RadioGroup radioGroup = this.AhwBna;
        if (radioGroup != null) {
            radioGroup.check(C43662rtX.ActionBar.iqMDAV);
        }
        android.widget.RadioGroup radioGroup2 = this.AhwBna;
        if (radioGroup2 != null) {
            radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.rCa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.RadioGroup radioGroup3, int i) {
                    ActivityC41985rCb.OLrzqt(this.KWHzl, radioGroup3, i);
                }
            });
        }
    }

    public static final void OLrzqt(ActivityC41985rCb activityC41985rCb, android.widget.RadioGroup radioGroup, int i) {
        android.widget.LinearLayout linearLayout = activityC41985rCb.valueOf;
        if (linearLayout != null) {
            linearLayout.setVisibility(i == C43662rtX.ActionBar.invokespecialODCBUN ? 0 : 8);
        }
    }

    private final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OKFaceTestActivity$getData$1(new rBQ(new C41978rBv(this.AEQbTJ), new C41982rBz(this.AEQbTJ)), this, null), 3, null);
    }

    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        java.lang.String string;
        android.text.Editable text;
        java.lang.String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        wYK wyk = this.OLrzqt;
        if (wyk != null && wyk.isChecked()) {
            linkedHashMap.put("enable_face_guard", "true");
        }
        android.widget.RadioGroup radioGroup = this.AhwBna;
        java.lang.Object subdomain = null;
        java.lang.Integer numValueOf = radioGroup != null ? java.lang.Integer.valueOf(radioGroup.getCheckedRadioButtonId()) : null;
        int i = C43662rtX.ActionBar.invokespecialROgMPW;
        if (numValueOf != null && numValueOf.intValue() == i) {
            subdomain = SubdomainStrategy.Auto.KWHzl;
        } else {
            int i2 = C43662rtX.ActionBar.invokespecialDPHOMC;
            if (numValueOf != null && numValueOf.intValue() == i2) {
                subdomain = SubdomainStrategy.Global.INSTANCE;
            } else {
                int i3 = C43662rtX.ActionBar.invokespecialODCBUN;
                if (numValueOf != null && numValueOf.intValue() == i3) {
                    android.widget.EditText editText = this.copydefault;
                    if (editText == null || (text = editText.getText()) == null || (string2 = text.toString()) == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) string2).toString()) == null) {
                        string = "";
                    }
                    if (string.length() > 0) {
                        subdomain = new SubdomainStrategy.Subdomain(string);
                    }
                }
            }
        }
        if (subdomain != null) {
            linkedHashMap.put("Subdomain-Strategy", subdomain.toString());
        }
        pUU.EZpvd(getTAG(), "Custom headers: " + linkedHashMap);
        return linkedHashMap;
    }

    public static final void AEQbTJ(ActivityC41985rCb activityC41985rCb, ActivityResult activityResult) {
        android.os.Bundle extras;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            if (data == null || (extras = data.getExtras()) == null) {
                return;
            }
            rTU rtu = (rTU) C43251rlk.OLrzqt(rTU.class);
            FacialInfoResult facialInfoResultEZpvd = rtu != null ? rtu.EZpvd(extras) : null;
            if (facialInfoResultEZpvd != null) {
                if (facialInfoResultEZpvd.isSuccess()) {
                    C55326xho.toast$default("verify success", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    pUU.EZpvd("qjf", "isSuccess");
                    return;
                }
                C55326xho.toast$default(facialInfoResultEZpvd.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                android.widget.TextView textView = activityC41985rCb.AYXKKw;
                if (textView != null) {
                    textView.setText(facialInfoResultEZpvd.getMsg());
                }
                pUU.EZpvd("qjf", "code = " + facialInfoResultEZpvd.getCode() + " ,msg = " + facialInfoResultEZpvd.getMsg());
                return;
            }
            return;
        }
        if (activityResult.getResultCode() == 0) {
            pUU.EZpvd("qjf", "用户点击返回");
        }
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
