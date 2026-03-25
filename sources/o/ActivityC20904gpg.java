package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gpg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC20904gpg extends AbstractActivityC33013moT implements InterfaceC20523giW {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public AbstractC16941etS EZpvd;

    /* JADX INFO: renamed from: o.gpg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gpg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, int i, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.ArrayList<java.lang.String> arrayList, int i2, ExchangeAddressData exchangeAddressData) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, ActivityC20904gpg.class);
            intent.putExtras(C20913gpp.Companion.KWHzl(i, str, str2, str3, arrayList, i2, exchangeAddressData));
            return intent;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = (AbstractC16941etS) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.HJWChPRGtXKC);
        EZpvd();
        C20913gpp c20913gpp = new C20913gpp();
        c20913gpp.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.putInt, c20913gpp).commitAllowingStateLoss();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.gpj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC20904gpg.copydefault(this.OLrzqt);
            }
        });
    }

    public static final void copydefault(ActivityC20904gpg activityC20904gpg) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC20904gpg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void EZpvd() {
        AbstractC16941etS abstractC16941etS = this.EZpvd;
        AbstractC16941etS abstractC16941etS2 = null;
        if (abstractC16941etS == null) {
            Intrinsics.gEmmrt("");
            abstractC16941etS = null;
        }
        abstractC16941etS.AEQbTJ.setExpandedTitleColor(0);
        AbstractC16941etS abstractC16941etS3 = this.EZpvd;
        if (abstractC16941etS3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16941etS3 = null;
        }
        abstractC16941etS3.values.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.gpk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20904gpg.AEQbTJ(this.OLrzqt, view);
            }
        });
        AbstractC16941etS abstractC16941etS4 = this.EZpvd;
        if (abstractC16941etS4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16941etS4 = null;
        }
        abstractC16941etS4.AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getData));
        AbstractC16941etS abstractC16941etS5 = this.EZpvd;
        if (abstractC16941etS5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16941etS5 = null;
        }
        abstractC16941etS5.values.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getData));
        AbstractC16941etS abstractC16941etS6 = this.EZpvd;
        if (abstractC16941etS6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16941etS2 = abstractC16941etS6;
        }
        AppCompatImageView appCompatImageView = abstractC16941etS2.djBIcL;
        Intrinsics.copydefault(appCompatImageView);
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.GGlJim));
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.gpn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20904gpg.OLrzqt(this.AEQbTJ, view);
            }
        });
    }

    public static final void AEQbTJ(ActivityC20904gpg activityC20904gpg, android.view.View view) {
        activityC20904gpg.finish();
    }

    public static final void OLrzqt(ActivityC20904gpg activityC20904gpg, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC20904gpg);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ReportDrawnCompositionsnapshotStateObserver1));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DarRvM), new View.OnClickListener() { // from class: o.gpm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC20904gpg.OLrzqt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(int i) {
        AbstractC16941etS abstractC16941etS = null;
        if (i == MultiTransferMode.MODE_MANY_TO_ONE.getValue() || i == MultiTransferMode.MODE_NONE.getValue()) {
            AbstractC16941etS abstractC16941etS2 = this.EZpvd;
            if (abstractC16941etS2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16941etS2 = null;
            }
            abstractC16941etS2.valueOf.setVisibility(8);
            AbstractC16941etS abstractC16941etS3 = this.EZpvd;
            if (abstractC16941etS3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16941etS3 = null;
            }
            ViewGroup.LayoutParams layoutParams = abstractC16941etS3.valueOf.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginEnd(C55298xhM.dp2px$default(0.0f, null, 1, null));
            AbstractC16941etS abstractC16941etS4 = this.EZpvd;
            if (abstractC16941etS4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16941etS4 = null;
            }
            abstractC16941etS4.valueOf.setLayoutParams(layoutParams2);
            AbstractC16941etS abstractC16941etS5 = this.EZpvd;
            if (abstractC16941etS5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16941etS5 = null;
            }
            abstractC16941etS5.fetchVPNInfo.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.FHvxmb));
        } else {
            AbstractC16941etS abstractC16941etS6 = this.EZpvd;
            if (abstractC16941etS6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16941etS6 = null;
            }
            abstractC16941etS6.valueOf.setVisibility(0);
            AbstractC16941etS abstractC16941etS7 = this.EZpvd;
            if (abstractC16941etS7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16941etS7 = null;
            }
            ViewGroup.LayoutParams layoutParams3 = abstractC16941etS7.valueOf.getLayoutParams();
            Intrinsics.copydefault(layoutParams3, "");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.setMarginEnd(C55298xhM.dp2px$default(64.0f, null, 1, null));
            AbstractC16941etS abstractC16941etS8 = this.EZpvd;
            if (abstractC16941etS8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16941etS8 = null;
            }
            abstractC16941etS8.valueOf.setLayoutParams(layoutParams4);
            AbstractC16941etS abstractC16941etS9 = this.EZpvd;
            if (abstractC16941etS9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16941etS9 = null;
            }
            abstractC16941etS9.fetchVPNInfo.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.ActivityResultCallback, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "0"))));
        }
        AbstractC16941etS abstractC16941etS10 = this.EZpvd;
        if (abstractC16941etS10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16941etS = abstractC16941etS10;
        }
        abstractC16941etS.fetchVPNInfo.setEnabled(false);
    }

    public final C52794wYp AEQbTJ() {
        AbstractC16941etS abstractC16941etS = this.EZpvd;
        if (abstractC16941etS == null) {
            Intrinsics.gEmmrt("");
            abstractC16941etS = null;
        }
        C52794wYp c52794wYp = abstractC16941etS.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return c52794wYp;
    }

    public final android.widget.LinearLayout copydefault() {
        AbstractC16941etS abstractC16941etS = this.EZpvd;
        if (abstractC16941etS == null) {
            Intrinsics.gEmmrt("");
            abstractC16941etS = null;
        }
        android.widget.LinearLayout linearLayout = abstractC16941etS.valueOf;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
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
