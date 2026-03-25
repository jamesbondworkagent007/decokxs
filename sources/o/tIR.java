package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;

/* JADX INFO: loaded from: classes24.dex */
public final class tIR extends AbstractActivityC47505trP {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public C46236tMw AEQbTJ;
    public boolean EZpvd;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tIR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46236tMw c46236tMwCopydefault = C46236tMw.copydefault(getLayoutInflater());
        this.AEQbTJ = c46236tMwCopydefault;
        C46236tMw c46236tMw = null;
        if (c46236tMwCopydefault == null) {
            Intrinsics.gEmmrt("");
            c46236tMwCopydefault = null;
        }
        setContentView(c46236tMwCopydefault.getRoot());
        C46236tMw c46236tMw2 = this.AEQbTJ;
        if (c46236tMw2 == null) {
            Intrinsics.gEmmrt("");
            c46236tMw2 = null;
        }
        C57597ylS c57597ylS = c46236tMw2.OLrzqt;
        android.widget.ImageView backImage = c57597ylS.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            c57597ylS.setBackListener(new View.OnClickListener() { // from class: o.tIN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    tIR.KWHzl(this.KWHzl, view);
                }
            });
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.replace(C47501trL.TaskDescription.fGQ, tIO.Companion.AEQbTJ());
            fragmentTransactionBeginTransaction.commitNow();
            C46236tMw c46236tMw3 = this.AEQbTJ;
            if (c46236tMw3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46236tMw = c46236tMw3;
            }
            c46236tMw.getRoot().post(new java.lang.Runnable() { // from class: o.tIP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    tIR.KWHzl(this.EZpvd);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void KWHzl(tIR tir, android.view.View view) {
        tir.finish();
    }

    public static final void KWHzl(tIR tir) {
        if (tir.EZpvd) {
            return;
        }
        tir.EZpvd = true;
        rVN.reportFullyDrawn$default((android.app.Activity) tir, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
