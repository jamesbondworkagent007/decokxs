package o;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class nPL extends AbstractActivityC33041mov {
    public androidx.fragment.app.Fragment EZpvd;
    public wYC OLrzqt;
    public android.widget.ImageView copydefault;
    public android.widget.TextView djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public static final java.lang.String AEQbTJ = "single_fragment";

    public abstract androidx.fragment.app.Fragment AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull wYC wyc) {
        Intrinsics.checkNotNullParameter(wyc, "");
        this.OLrzqt = wyc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        this.copydefault = imageView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.djBIcL = textView;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nPL.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final wYC KWHzl() {
        wYC wyc = this.OLrzqt;
        if (wyc != null) {
            return wyc;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.widget.ImageView EZpvd() {
        android.widget.ImageView imageView = this.copydefault;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.widget.TextView OLrzqt() {
        android.widget.TextView textView = this.djBIcL;
        if (textView != null) {
            return textView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C35399nuc.Dialog.EZpvd);
        KWHzl((android.widget.TextView) findViewById(C35399nuc.StateListAnimator.ORrpqH));
        AEQbTJ((wYC) findViewById(C35399nuc.StateListAnimator.sSMYrx));
        EZpvd((android.widget.ImageView) findViewById(C35399nuc.StateListAnimator.AuCTelauCTel));
        if (bundle == null) {
            this.EZpvd = AEQbTJ();
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            int i = C35399nuc.StateListAnimator.DIIpTV;
            androidx.fragment.app.Fragment fragment = this.EZpvd;
            Intrinsics.copydefault(fragment);
            fragmentTransactionBeginTransaction.add(i, fragment, AbstractActivityC33007moN.Companion.EZpvd()).commit();
        } else {
            this.EZpvd = getSupportFragmentManager().findFragmentByTag(AEQbTJ);
        }
        KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.nPQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nPL.EZpvd(this.OLrzqt, view);
            }
        });
        android.view.View viewFindViewById = findViewById(C35399nuc.StateListAnimator.adevsa);
        if (viewFindViewById != null) {
            android.view.ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new StateListAnimator(viewTreeObserver, viewFindViewById, this));
        }
    }

    public static final void EZpvd(nPL npl, android.view.View view) {
        npl.onBackPressed();
    }

    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ nPL AEQbTJ;
        public final /* synthetic */ android.view.ViewTreeObserver KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        public StateListAnimator(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, nPL npl) {
            this.KWHzl = viewTreeObserver;
            this.copydefault = view;
            this.AEQbTJ = npl;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.KWHzl.isAlive() ? this.KWHzl : this.copydefault.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            int iMax = java.lang.Math.max(this.AEQbTJ.EZpvd().getWidth(), this.AEQbTJ.KWHzl().getWidth());
            this.AEQbTJ.OLrzqt().setPadding(iMax, 0, iMax, 0);
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
