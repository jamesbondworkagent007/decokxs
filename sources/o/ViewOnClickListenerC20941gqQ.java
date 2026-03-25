package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gqQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20941gqQ extends AbstractActivityC33013moT implements View.OnClickListener, InterfaceC20523giW {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public AbstractC16944etV copydefault;

    /* JADX INFO: renamed from: o.gqQ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gqQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ViewOnClickListenerC20941gqQ.class);
            intent.putExtra("wallet_id", str);
            return intent;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16944etV abstractC16944etV = (AbstractC16944etV) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.HJWChPRGtXKCRGtXKC);
        this.copydefault = abstractC16944etV;
        if (abstractC16944etV == null) {
            Intrinsics.gEmmrt("");
            abstractC16944etV = null;
        }
        android.widget.ImageView imageView = abstractC16944etV.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14677dpv.OLrzqt(imageView, CDNSourceManager.ImageSource.MultiTransferSendBg);
        copydefault();
        getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.DfrfUJ, ViewOnClickListenerC20945gqU.Companion.KWHzl(getIntent().getExtras())).commitAllowingStateLoss();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.gqO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC20941gqQ.copydefault(this.OLrzqt);
            }
        });
    }

    public static final void copydefault(ViewOnClickListenerC20941gqQ viewOnClickListenerC20941gqQ) {
        rVN.reportFullyDrawn$default((android.app.Activity) viewOnClickListenerC20941gqQ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void copydefault() {
        AbstractC16944etV abstractC16944etV = this.copydefault;
        AbstractC16944etV abstractC16944etV2 = null;
        if (abstractC16944etV == null) {
            Intrinsics.gEmmrt("");
            abstractC16944etV = null;
        }
        abstractC16944etV.copydefault.setOnClickListener(this);
        AbstractC16944etV abstractC16944etV3 = this.copydefault;
        if (abstractC16944etV3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16944etV2 = abstractC16944etV3;
        }
        abstractC16944etV2.OLrzqt.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.setIconBitmap;
        if (numValueOf != null && numValueOf.intValue() == i) {
            finish();
            return;
        }
        int i2 = C13754dXa.ActionBar.onEvent;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            startActivity(new android.content.Intent(this, (java.lang.Class<?>) ActivityC21005grb.class));
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
