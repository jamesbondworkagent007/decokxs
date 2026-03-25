package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.model.EscapeErrorCodes;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.RiskControlDialogCallback;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fLl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17603fLl extends AbstractC52780wYb {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public RiskControlDialogCallback copydefault;

    @Override // o.AbstractC52780wYb
    public boolean OLrzqt() {
        return true;
    }

    /* JADX INFO: renamed from: o.fLl$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fLl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C17603fLl EZpvd(int i) {
            C17603fLl c17603fLl = new C17603fLl();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("risk_type", i);
            c17603fLl.setArguments(bundle);
            return c17603fLl;
        }
    }

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        java.lang.String string = requireContext().getString(C13754dXa.FragmentManager.setHandler);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        if (context instanceof RiskControlDialogCallback) {
            this.copydefault = (RiskControlDialogCallback) context;
        }
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(c54953xam, "");
        android.os.Bundle arguments = getArguments();
        EscapeErrorCodes.EscapeRiskType escapeRiskTypeOLrzqt = arguments != null ? EscapeErrorCodes.EscapeRiskType.Companion.OLrzqt(arguments.getInt("risk_type")) : null;
        wYK wyk = c54953xam.KWHzl;
        EscapeErrorCodes.EscapeRiskType escapeRiskType = EscapeErrorCodes.EscapeRiskType.ADDRESS_KYS_RISK;
        wyk.setVisibility((escapeRiskTypeOLrzqt == escapeRiskType || escapeRiskTypeOLrzqt == EscapeErrorCodes.EscapeRiskType.DEVICE_RISK) ? 8 : 0);
        wyk.setText(getString(C13754dXa.FragmentManager.postToHandler));
        AppCompatTextView appCompatTextView = c54953xam.OLrzqt;
        if (escapeRiskTypeOLrzqt == EscapeErrorCodes.EscapeRiskType.ADDRESS_RISK || escapeRiskTypeOLrzqt == escapeRiskType) {
            string = getString(C13754dXa.FragmentManager.registerCallback);
        } else {
            string = getString(C13754dXa.FragmentManager.getIControllerCallback);
        }
        appCompatTextView.setText(string);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull final wYF wyf) {
        java.lang.String string;
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        android.os.Bundle arguments = getArguments();
        wYK wyk = null;
        EscapeErrorCodes.EscapeRiskType escapeRiskTypeOLrzqt = arguments != null ? EscapeErrorCodes.EscapeRiskType.Companion.OLrzqt(arguments.getInt("risk_type")) : null;
        C54946xaf binding = getBinding();
        if (binding != null && (constraintLayout = binding.AEQbTJ) != null) {
            wyk = (wYK) constraintLayout.findViewById(C13754dXa.ActionBar.dIjzlO);
        }
        if (escapeRiskTypeOLrzqt == EscapeErrorCodes.EscapeRiskType.ADDRESS_RISK) {
            if (wyk != null) {
                wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.fLo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                        C17603fLl.KWHzl(wyf, compoundButton, z);
                    }
                });
            }
            wyf.setSecondaryText(getString(C13754dXa.FragmentManager.unregisterCallback));
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setEnabled(wyk != null ? wyk.isChecked() : false);
                c52794wYpAEQbTJ.setOKDSType(260);
                c52794wYpAEQbTJ.setOKDSSize(52);
                c52794wYpAEQbTJ.setOnClickListener(new Activity(c52794wYpAEQbTJ, 1000L, this, escapeRiskTypeOLrzqt));
            }
        } else {
            C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setVisibility(8);
            }
            if (wyk != null) {
                wyk.setVisibility(8);
            }
        }
        if (escapeRiskTypeOLrzqt == EscapeErrorCodes.EscapeRiskType.DEVICE_RISK) {
            string = requireContext().getString(C13754dXa.FragmentManager.isSessionReady);
        } else {
            string = requireContext().getString(C13754dXa.FragmentManager.MediaControllerCompatCallback);
        }
        wyf.setPrimaryText(string);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
            c52794wYpCopydefault.setOKDSSize(52);
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this, escapeRiskTypeOLrzqt));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(wYF wyf, android.widget.CompoundButton compoundButton, boolean z) {
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setEnabled(z);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.copydefault = null;
    }

    /* JADX INFO: renamed from: o.fLl$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ EscapeErrorCodes.EscapeRiskType AEQbTJ;
        public final /* synthetic */ C17603fLl KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C17603fLl c17603fLl, EscapeErrorCodes.EscapeRiskType escapeRiskType) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c17603fLl;
            this.AEQbTJ = escapeRiskType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                RiskControlDialogCallback riskControlDialogCallback = this.KWHzl.copydefault;
                if (riskControlDialogCallback != null) {
                    riskControlDialogCallback.OLrzqt(this.AEQbTJ);
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.fLl$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ EscapeErrorCodes.EscapeRiskType OLrzqt;
        public final /* synthetic */ C17603fLl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C17603fLl c17603fLl, EscapeErrorCodes.EscapeRiskType escapeRiskType) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c17603fLl;
            this.OLrzqt = escapeRiskType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            RiskControlDialogCallback.BackType backType;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                RiskControlDialogCallback riskControlDialogCallback = this.copydefault.copydefault;
                if (riskControlDialogCallback != null) {
                    EscapeErrorCodes.EscapeRiskType escapeRiskType = this.OLrzqt;
                    if (escapeRiskType == EscapeErrorCodes.EscapeRiskType.ADDRESS_RISK || escapeRiskType == EscapeErrorCodes.EscapeRiskType.ADDRESS_KYS_RISK) {
                        backType = RiskControlDialogCallback.BackType.BACK_TO_ADDRESS;
                    } else {
                        backType = RiskControlDialogCallback.BackType.BACK_TO_HOME;
                    }
                    riskControlDialogCallback.KWHzl(backType);
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
