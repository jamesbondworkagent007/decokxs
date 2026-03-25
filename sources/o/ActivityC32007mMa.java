package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mMa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC32007mMa extends AbstractActivityC33041mov {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mLZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC32007mMa.EZpvd(this.copydefault);
        }
    });

    public static final java.lang.String EZpvd(ActivityC32007mMa activityC32007mMa) {
        return activityC32007mMa.getIntent().getStringExtra("EXT_FLAG");
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C31976mKx.Application.isConnected);
        android.view.View viewFindViewById = findViewById(C31976mKx.Activity.spnCvw);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        ((android.widget.TextView) viewFindViewById).setText("Payload: " + getIntent().getStringExtra("EXT_PAYLOAD"));
        android.view.View viewFindViewById2 = findViewById(C31976mKx.Activity.WS);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        ((android.widget.TextView) viewFindViewById2).setText("Value: " + getIntent().getStringExtra("EXT_VALUE"));
        android.view.View viewFindViewById3 = findViewById(C31976mKx.Activity.zblBkD);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        ((android.widget.TextView) viewFindViewById3).setText("Flag: " + KWHzl());
        ((C33537myN) findViewById(C31976mKx.Activity.AEQbTJ)).setAppBarTitle(KWHzl());
        java.lang.String stringExtra = getIntent().getStringExtra("EXT_SP_NAME");
        android.view.View viewFindViewById4 = findViewById(C31976mKx.Activity.sSMYrx);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        android.widget.EditText editText = (android.widget.EditText) viewFindViewById4;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) SPUtils.getString(KWHzl(), null, stringExtra))) {
            editText.setText(SPUtils.getString(KWHzl(), null, stringExtra));
        }
        android.view.View viewFindViewById5 = findViewById(C31976mKx.Activity.gHZMYf);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        android.widget.EditText editText2 = (android.widget.EditText) viewFindViewById5;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) SPUtils.getString("payload_key_prefix_" + KWHzl(), null, stringExtra))) {
            editText2.setText(SPUtils.getString("payload_key_prefix_" + KWHzl(), null, stringExtra));
        }
        editText.addTextChangedListener(new Activity(stringExtra));
        editText2.addTextChangedListener(new Application(stringExtra));
    }

    /* JADX INFO: renamed from: o.mMa$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ java.lang.String KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(java.lang.String str) {
            this.KWHzl = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (java.lang.String.valueOf(editable).length() > 0) {
                SPUtils.put(ActivityC32007mMa.this.KWHzl(), java.lang.String.valueOf(editable), this.KWHzl);
            } else {
                SPUtils.remove(ActivityC32007mMa.this.KWHzl(), this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.mMa$Application */
    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ java.lang.String OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(java.lang.String str) {
            this.OLrzqt = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (java.lang.String.valueOf(editable).length() > 0) {
                SPUtils.put("payload_key_prefix_" + ActivityC32007mMa.this.KWHzl(), java.lang.String.valueOf(editable), this.OLrzqt);
                return;
            }
            SPUtils.remove("payload_key_prefix_" + ActivityC32007mMa.this.KWHzl(), this.OLrzqt);
        }
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Flag", KWHzl());
        setResult(-1, intent);
        super.finish();
    }

    /* JADX INFO: renamed from: o.mMa$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mMa.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC32007mMa.class);
            intent.putExtra("EXT_SP_NAME", str);
            intent.putExtra("EXT_FLAG", str2);
            intent.putExtra("EXT_VALUE", str3);
            intent.putExtra("EXT_PAYLOAD", str4);
            return intent;
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
