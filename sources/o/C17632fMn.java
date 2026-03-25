package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.model.RecoveryWarningType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fMn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17632fMn extends wXX {
    public AbstractC16647enq OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.fMn$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecoveryWarningType.values().length];
            try {
                iArr[RecoveryWarningType.OVER_LIMIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RecoveryWarningType.DEVICE_NOT_SUPPORT_PASSKEY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.fMn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fMn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C17632fMn EZpvd(int i) {
            C17632fMn c17632fMn = new C17632fMn();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("warning_type", i);
            c17632fMn.setArguments(bundle);
            return c17632fMn;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = AbstractC16647enq.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        KWHzl(C52761wXj.PendingIntent.ejfBZ, 0);
        RecoveryWarningType.Application application = RecoveryWarningType.Companion;
        android.os.Bundle arguments = getArguments();
        RecoveryWarningType recoveryWarningTypeOLrzqt = application.OLrzqt(arguments != null ? arguments.getInt("warning_type") : RecoveryWarningType.OVER_LIMIT.getValue());
        AbstractC16647enq abstractC16647enq = this.OLrzqt;
        AbstractC16647enq abstractC16647enq2 = null;
        if (abstractC16647enq == null) {
            Intrinsics.gEmmrt("");
            abstractC16647enq = null;
        }
        abstractC16647enq.copydefault.setText(EZpvd(recoveryWarningTypeOLrzqt));
        AbstractC16647enq abstractC16647enq3 = this.OLrzqt;
        if (abstractC16647enq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16647enq2 = abstractC16647enq3;
        }
        abstractC16647enq2.EZpvd.setText(AEQbTJ(recoveryWarningTypeOLrzqt));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(requireContext().getString(C13754dXa.FragmentManager.DarRvM));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
    }

    public static /* synthetic */ void showStatusLottieAnimation$default(C17632fMn c17632fMn, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        c17632fMn.KWHzl(i, i2);
    }

    private final void KWHzl(@androidx.annotation.RawRes int i, final int i2) {
        LottieCompositionFactory.fromRawRes(getContext(), i).addListener(new LottieListener() { // from class: o.fMk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C17632fMn.EZpvd(this.OLrzqt, i2, (LottieComposition) obj);
            }
        });
    }

    public static final void EZpvd(C17632fMn c17632fMn, int i, LottieComposition lottieComposition) {
        AbstractC16647enq abstractC16647enq = c17632fMn.OLrzqt;
        if (abstractC16647enq == null) {
            Intrinsics.gEmmrt("");
            abstractC16647enq = null;
        }
        android.widget.ImageView imageView = abstractC16647enq.AEQbTJ;
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(i);
        lottieDrawable.playAnimation();
        imageView.performHapticFeedback(0);
        imageView.setImageDrawable(lottieDrawable);
    }

    public final java.lang.String EZpvd(RecoveryWarningType recoveryWarningType) {
        int i = recoveryWarningType == null ? -1 : TaskDescription.OLrzqt[recoveryWarningType.ordinal()];
        if (i == -1) {
            java.lang.String string = requireContext().getString(C13754dXa.FragmentManager.OeawrHRnVkix);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        if (i == 1) {
            java.lang.String string2 = requireContext().getString(C13754dXa.FragmentManager.OeawrHRnVkix);
            Intrinsics.copydefault((java.lang.Object) string2);
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String string3 = requireContext().getString(C13754dXa.FragmentManager.AuCTel);
        Intrinsics.copydefault((java.lang.Object) string3);
        return string3;
    }

    public final java.lang.String AEQbTJ(RecoveryWarningType recoveryWarningType) {
        int i = recoveryWarningType == null ? -1 : TaskDescription.OLrzqt[recoveryWarningType.ordinal()];
        if (i == -1) {
            java.lang.String string = requireContext().getString(C13754dXa.FragmentManager.avCqka);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        if (i == 1) {
            java.lang.String string2 = requireContext().getString(C13754dXa.FragmentManager.avCqka);
            Intrinsics.copydefault((java.lang.Object) string2);
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String string3 = requireContext().getString(C13754dXa.FragmentManager.hDKMBd);
        Intrinsics.copydefault((java.lang.Object) string3);
        return string3;
    }

    /* JADX INFO: renamed from: o.fMn$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C17632fMn EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C17632fMn c17632fMn) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c17632fMn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
