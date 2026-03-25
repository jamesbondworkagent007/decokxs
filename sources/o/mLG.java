package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.debugbox.activity.NetworkDiagnosisActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;

/* JADX INFO: loaded from: classes15.dex */
public final class mLG extends mKV {
    public C55239xgG AEQbTJ;
    public C55239xgG AhwBna;
    public android.widget.RelativeLayout EZpvd;
    public ActivityResultLauncher<android.content.Intent> KWHzl;
    public android.widget.TextView OLrzqt;
    public mOE copydefault;
    public android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mKV
    public int AEQbTJ() {
        return C31976mKx.Application.gEmmrt;
    }

    @Override // o.mKV
    public void AEQbTJ(android.os.Bundle bundle) {
        this.AhwBna = (C55239xgG) findViewById(C31976mKx.Activity.htlTjW);
        this.AEQbTJ = (C55239xgG) findViewById(C31976mKx.Activity.UlJrfe);
        this.copydefault = (mOE) findViewById(C31976mKx.Activity.wlaJM);
        this.OLrzqt = (android.widget.TextView) findViewById(C31976mKx.Activity.OBJEWx);
        C55239xgG c55239xgG = this.AhwBna;
        android.widget.TextView textView = null;
        if (c55239xgG == null) {
            Intrinsics.gEmmrt("");
            c55239xgG = null;
        }
        c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mLL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                mLG.OLrzqt(compoundButton, z);
            }
        });
        C55239xgG c55239xgG2 = this.AEQbTJ;
        if (c55239xgG2 == null) {
            Intrinsics.gEmmrt("");
            c55239xgG2 = null;
        }
        c55239xgG2.setChecked(C43466rpn.OLrzqt.gEmmrt());
        C55239xgG c55239xgG3 = this.AEQbTJ;
        if (c55239xgG3 == null) {
            Intrinsics.gEmmrt("");
            c55239xgG3 = null;
        }
        c55239xgG3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mLJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                mLG.copydefault(compoundButton, z);
            }
        });
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(C31976mKx.Activity.DXXBbs);
        this.EZpvd = relativeLayout;
        if (relativeLayout == null) {
            Intrinsics.gEmmrt("");
            relativeLayout = null;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: o.mLH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mLG.copydefault(this.copydefault, view);
            }
        });
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(C31976mKx.Activity.fHqPtx);
        this.gEmmrt = textView2;
        if (textView2 == null) {
            Intrinsics.gEmmrt("");
            textView2 = null;
        }
        textView2.setText(C43372rnz.copydefault.values());
        mOE moe = this.copydefault;
        if (moe == null) {
            Intrinsics.gEmmrt("");
            moe = null;
        }
        moe.setCallback(new Function1() { // from class: o.mLI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mLG.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        });
        mOE moe2 = this.copydefault;
        if (moe2 == null) {
            Intrinsics.gEmmrt("");
            moe2 = null;
        }
        moe2.setDohConfigCallback(new Function0() { // from class: o.mLK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mLG.copydefault(this.EZpvd);
            }
        });
        android.widget.TextView textView3 = this.OLrzqt;
        if (textView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView = textView3;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.mLM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mLG.KWHzl(this.KWHzl, view);
            }
        });
    }

    public static final void OLrzqt(android.widget.CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                mJK.Companion.EZpvd().KWHzl(true);
            } else {
                mJK.Companion.EZpvd().copydefault();
            }
        }
    }

    public static final void copydefault(android.widget.CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            C43466rpn c43466rpn = C43466rpn.OLrzqt;
            if (c43466rpn.copydefault(z)) {
                C55326xho.toast$default("success. pls restart app to take effect", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else {
                C55326xho.toast$default("failed. only support modify it in debug mode", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                compoundButton.setChecked(c43466rpn.gEmmrt());
            }
        }
    }

    public static final void copydefault(mLG mlg, android.view.View view) {
        mlg.finish();
    }

    public static final Unit EZpvd(final mLG mlg, final int i) {
        C32105mPr c32105mPr = new C32105mPr(mlg);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaYAddCustomView$default = ViewOnClickListenerC54939xaY.addCustomView$default(new ViewOnClickListenerC54939xaY(mlg), c32105mPr, 0, 2, null);
        c32105mPr.setType(i);
        c32105mPr.setClose(new Function0() { // from class: o.mLN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mLG.AEQbTJ(viewOnClickListenerC54939xaYAddCustomView$default);
            }
        });
        c32105mPr.setConfirm(new Function2() { // from class: o.mLP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return mLG.OLrzqt(i, mlg, viewOnClickListenerC54939xaYAddCustomView$default, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        viewOnClickListenerC54939xaYAddCustomView$default.show();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(int i, mLG mlg, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        mNB.Companion.copydefault(i, str, str2);
        mOE moe = mlg.copydefault;
        if (moe == null) {
            Intrinsics.gEmmrt("");
            moe = null;
        }
        moe.setDebugInfo(i, str + "-" + str2);
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(mLG mlg) {
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = mlg.KWHzl;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(new android.content.Intent(mlg, (java.lang.Class<?>) ActivityC32049mNp.class));
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(mLG mlg, android.view.View view) {
        mlg.startActivity(new android.content.Intent(mlg, (java.lang.Class<?>) NetworkDiagnosisActivity.class));
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean z = mND.OLrzqt("detail") != null && (mND.OLrzqt("detail").values() || mND.OLrzqt(RemoteMessageConst.Notification.ICON).values());
        C55239xgG c55239xgG = this.AhwBna;
        if (c55239xgG == null) {
            Intrinsics.gEmmrt("");
            c55239xgG = null;
        }
        c55239xgG.setChecked(z);
    }

    @Override // o.mKV
    public void OLrzqt() {
        this.KWHzl = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.mLO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                mLG.copydefault(this.EZpvd, (ActivityResult) obj);
            }
        });
    }

    public static final void copydefault(mLG mlg, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            pUU.EZpvd(mlg.getTAG(), "dohDebug onActivityResult OK");
            mOE moe = mlg.copydefault;
            if (moe == null) {
                Intrinsics.gEmmrt("");
                moe = null;
            }
            moe.OLrzqt();
        }
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
    public void onStart() {
        super.onStart();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
