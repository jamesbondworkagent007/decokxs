package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nUd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34174nUd extends nTS {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public nOV AhwBna;
    public boolean gEmmrt;

    /* JADX INFO: renamed from: o.nUd$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupBillingType.values().length];
            try {
                iArr[GroupBillingType.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[GroupBillingType.ONE_OFF.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupBillingType.MONTHLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupBillingType.YEARLY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX INFO: renamed from: o.nUd$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nUd.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C34174nUd OLrzqt(GroupBillingType groupBillingType, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C34174nUd c34174nUd = new C34174nUd();
            c34174nUd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_PARAM_PAYMENT", groupBillingType), C56390yDp.OLrzqt("KEY_PARAM_UNIT", str), C56390yDp.OLrzqt("KEY_PARAM_VALUE", str2)));
            return c34174nUd;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setCloseVisibility(false);
        wxq.setDividerVisibility(false);
        wxq.AYXKKw().setTextAppearance(C52761wXj.LoaderManager.uzCIH);
        java.lang.String string = getString(C35399nuc.LoaderManager.apLTlu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AhwBna = nOV.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        KWHzl();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }

    private final void KWHzl() {
        if (this.AhwBna != null) {
            android.os.Bundle arguments = getArguments();
            if (arguments == null) {
                pUU.copydefault("PaidGroupSubscriptionBottomSheet", "Arguments are null, dismissing");
                dismissAllowingStateLoss();
                return;
            }
            java.lang.String string = arguments.getString("KEY_PARAM_UNIT");
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = arguments.getString("KEY_PARAM_VALUE");
            java.lang.String str = string2 != null ? string2 : "";
            android.os.Bundle arguments2 = getArguments();
            java.io.Serializable serializable = arguments2 != null ? arguments2.getSerializable("KEY_PARAM_PAYMENT") : null;
            GroupBillingType groupBillingType = serializable instanceof GroupBillingType ? (GroupBillingType) serializable : null;
            if (groupBillingType == null) {
                pUU.copydefault("PaidGroupSubscriptionBottomSheet", "PeriodicPayment is null, dismissing");
                dismissAllowingStateLoss();
            } else {
                AEQbTJ(string, str);
                EZpvd(groupBillingType);
            }
        }
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        C52794wYp c52794wYp;
        nOV nov = this.AhwBna;
        if (nov == null || (c52794wYp = nov.AEQbTJ) == null) {
            return;
        }
        c52794wYp.setText(C33069mpW.copydefault(this, C35399nuc.LoaderManager.QOeQqh, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str + pTB.formatLocalizedWithMinPrecision$default(str2, 2, null, 2, null)))));
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    public final void EZpvd(GroupBillingType groupBillingType) {
        android.widget.TextView textView;
        java.lang.String string;
        nOV nov = this.AhwBna;
        if (nov == null || (textView = nov.KWHzl) == null) {
            return;
        }
        int i = Application.AEQbTJ[groupBillingType.ordinal()];
        java.lang.String str = "";
        if (i != 1 && i != 2) {
            if (i == 3) {
                string = getString(C35399nuc.LoaderManager.isInitInProgress);
                Intrinsics.checkNotNullExpressionValue(string, "");
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                string = getString(C35399nuc.LoaderManager.aChkwz);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            str = string;
        }
        textView.setText(str);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        android.os.Bundle bundleBundleOf;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (this.gEmmrt) {
            bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_REQUEST_CONFIRM", java.lang.Boolean.TRUE));
        } else {
            bundleBundleOf = BundleKt.bundleOf();
        }
        FragmentKt.setFragmentResult(this, "RESULT_KEY_PAID_CONFIRM", bundleBundleOf);
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: o.nUd$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C34174nUd OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C34174nUd c34174nUd) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c34174nUd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.gEmmrt = true;
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
