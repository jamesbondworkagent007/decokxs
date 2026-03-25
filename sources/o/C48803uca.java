package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.components.track.TrackChannel;
import com.okinc.referral.bean.ReferralFooterInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48824ucv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48803uca extends AbstractC32996moC {
    public C48778ucB EZpvd;
    public int djBIcL;
    public int gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public static kotlin.Pair<java.lang.String, java.lang.Integer> AEQbTJ = new kotlin.Pair<>("", 0);
    public static kotlin.Pair<java.lang.String, java.lang.Integer> OLrzqt = new kotlin.Pair<>("", 0);
    public final int copydefault = C48824ucv.TaskDescription.AEQbTJ;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.uce
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48803uca.KWHzl(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ucg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48803uca.gEmmrt(this.copydefault);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.uca$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uca.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C48803uca KWHzl(java.lang.String str, java.lang.String str2) {
            C48803uca c48803uca = new C48803uca();
            android.os.Bundle bundle = new android.os.Bundle();
            if (str != null) {
                bundle.putString("referralShareCode", str);
            }
            if (str2 != null) {
                bundle.putString("referralShareLink", str2);
            }
            c48803uca.setArguments(bundle);
            return c48803uca;
        }
    }

    private final java.lang.String OLrzqt() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String KWHzl(C48803uca c48803uca) {
        android.os.Bundle arguments = c48803uca.getArguments();
        if (arguments != null) {
            return arguments.getString("referralShareCode", null);
        }
        return null;
    }

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String gEmmrt(C48803uca c48803uca) {
        android.os.Bundle arguments = c48803uca.getArguments();
        if (arguments != null) {
            return arguments.getString("referralShareLink", null);
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String referralCode;
        java.lang.String shareUrl;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = C48778ucB.OLrzqt(view);
        ReferralFooterInfo referralFooterInfoGEmmrt = C48808ucf.copydefault.gEmmrt();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) OLrzqt())) {
            referralCode = OLrzqt();
        } else if (referralFooterInfoGEmmrt == null || (referralCode = referralFooterInfoGEmmrt.getReferralCode()) == null) {
            referralCode = "";
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) KWHzl()) ? !(referralFooterInfoGEmmrt == null || (shareUrl = referralFooterInfoGEmmrt.getShareUrl()) == null) : (shareUrl = KWHzl()) != null) {
            str = shareUrl;
        }
        C48778ucB c48778ucB = this.EZpvd;
        if (c48778ucB != null) {
            c48778ucB.gEmmrt.setText(referralCode);
            c48778ucB.djBIcL.setText(str);
            EZpvd();
        }
        AEQbTJ();
        view.post(new java.lang.Runnable() { // from class: o.uch
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C48803uca.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(C48803uca c48803uca) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c48803uca, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd() {
        final C48778ucB c48778ucB = this.EZpvd;
        if (c48778ucB != null) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(c48778ucB.AYXKKw.getText());
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(c48778ucB.valueOf.getText());
            if (strGEmmrt.length() > 0 && Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) AEQbTJ.getFirst()) && strGEmmrt2.length() > 0 && Intrinsics.EZpvd((java.lang.Object) strGEmmrt2, (java.lang.Object) OLrzqt.getFirst()) && AEQbTJ.getSecond().intValue() != 0 && AEQbTJ.getSecond().intValue() == OLrzqt.getSecond().intValue()) {
                android.widget.TextView textView = c48778ucB.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                OLrzqt(textView, OLrzqt.getSecond().intValue());
                android.widget.TextView textView2 = c48778ucB.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                OLrzqt(textView2, OLrzqt.getSecond().intValue());
                return;
            }
            c48778ucB.AYXKKw.post(new java.lang.Runnable() { // from class: o.ucd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C48803uca.KWHzl(this.AEQbTJ, c48778ucB);
                }
            });
            c48778ucB.valueOf.post(new java.lang.Runnable() { // from class: o.uci
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C48803uca.copydefault(this.AEQbTJ, c48778ucB);
                }
            });
        }
    }

    public static final void KWHzl(C48803uca c48803uca, C48778ucB c48778ucB) {
        if (c48803uca.isAdded()) {
            c48803uca.gEmmrt = c48778ucB.AYXKKw.getWidth();
            c48803uca.copydefault();
        }
    }

    public static final void copydefault(C48803uca c48803uca, C48778ucB c48778ucB) {
        if (c48803uca.isAdded()) {
            c48803uca.djBIcL = c48778ucB.valueOf.getWidth();
            c48803uca.copydefault();
        }
    }

    public final void copydefault() {
        if (this.gEmmrt == 0 || this.djBIcL == 0) {
            return;
        }
        int iMin = java.lang.Math.min(C55298xhM.dp2px$default(106.0f, null, 1, null), java.lang.Math.max(this.gEmmrt, this.djBIcL));
        C48778ucB c48778ucB = this.EZpvd;
        if (c48778ucB != null) {
            AEQbTJ = new kotlin.Pair<>(C33129mqd.gEmmrt(c48778ucB.AYXKKw.getText()), java.lang.Integer.valueOf(iMin));
            OLrzqt = new kotlin.Pair<>(C33129mqd.gEmmrt(c48778ucB.valueOf.getText()), java.lang.Integer.valueOf(iMin));
            android.widget.TextView textView = c48778ucB.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            OLrzqt(textView, iMin);
            android.widget.TextView textView2 = c48778ucB.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            OLrzqt(textView2, iMin);
        }
    }

    public final void OLrzqt(android.view.View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public final void AEQbTJ() {
        C48778ucB c48778ucB = this.EZpvd;
        if (c48778ucB != null) {
            ConstraintLayout constraintLayout = c48778ucB.EZpvd;
            constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 1000L, c48778ucB, this));
            ConstraintLayout constraintLayout2 = c48778ucB.AEQbTJ;
            constraintLayout2.setOnClickListener(new StateListAnimator(constraintLayout2, 1000L, c48778ucB, this));
        }
    }

    /* JADX INFO: renamed from: o.uca$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C48803uca KWHzl;
        public final /* synthetic */ C48778ucB OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C48778ucB c48778ucB, C48803uca c48803uca) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c48778ucB;
            this.KWHzl = c48803uca;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(this.OLrzqt.djBIcL.getText());
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                    C33570myu.EZpvd(this.KWHzl.requireContext(), strGEmmrt);
                    C55326xho.toast$default(C33070mpX.AYXKKw(C48824ucv.Application.EZpvd), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    C32866mlf.onEvent$default("ShareModule_Sheet_CopyLink_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.uca$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C48803uca AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C48778ucB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C48778ucB c48778ucB, C48803uca c48803uca) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c48778ucB;
            this.AEQbTJ = c48803uca;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(this.copydefault.gEmmrt.getText());
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                    C33570myu.EZpvd(this.AEQbTJ.requireContext(), strGEmmrt);
                    C55326xho.toast$default(C33070mpX.AYXKKw(C48824ucv.Application.EZpvd), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    C32866mlf.onEvent$default("ShareModule_Sheet_CopyCode_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                }
            }
        }
    }
}
