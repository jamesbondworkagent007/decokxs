package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.model.EscapeErrorCodes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fLn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17605fLn extends AbstractC52780wYb {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public EscapeErrorCodes.EscapeRiskType AEQbTJ;
    public InterfaceC17595fLd copydefault;

    /* JADX INFO: renamed from: o.fLn$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EscapeErrorCodes.EscapeRiskType.values().length];
            try {
                iArr[EscapeErrorCodes.EscapeRiskType.ADDRESS_RISK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EscapeErrorCodes.EscapeRiskType.ADDRESS_KYS_RISK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[EscapeErrorCodes.EscapeRiskType.DEVICE_RISK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    @Override // o.AbstractC52780wYb
    public boolean OLrzqt() {
        return true;
    }

    /* JADX INFO: renamed from: o.fLn$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fLn.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C17605fLn copydefault(int i) {
            C17605fLn c17605fLn = new C17605fLn();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("risk_type", i);
            c17605fLn.setArguments(bundle);
            return c17605fLn;
        }
    }

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        java.lang.String string = requireContext().getString(C13754dXa.FragmentManager.mask);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        if (context instanceof InterfaceC17595fLd) {
            this.copydefault = (InterfaceC17595fLd) context;
        }
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        EscapeErrorCodes.EscapeRiskType escapeRiskTypeOLrzqt;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            escapeRiskTypeOLrzqt = EscapeErrorCodes.EscapeRiskType.Companion.OLrzqt(arguments.getInt("risk_type"));
        } else {
            escapeRiskTypeOLrzqt = null;
        }
        this.AEQbTJ = escapeRiskTypeOLrzqt;
        if (escapeRiskTypeOLrzqt == EscapeErrorCodes.EscapeRiskType.DEVICE_RISK) {
            string = requireContext().getString(C13754dXa.FragmentManager.InspectablePropertyEnumEntry);
        } else {
            string = requireContext().getString(C13754dXa.FragmentManager.mask);
        }
        Intrinsics.copydefault((java.lang.Object) string);
        wxq.setTitle(string);
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
        wYK wyk = c54953xam.KWHzl;
        EscapeErrorCodes.EscapeRiskType escapeRiskType = this.AEQbTJ;
        wyk.setVisibility((escapeRiskType == EscapeErrorCodes.EscapeRiskType.ADDRESS_KYS_RISK || escapeRiskType == EscapeErrorCodes.EscapeRiskType.DEVICE_RISK) ? 8 : 0);
        wyk.setText(getString(C13754dXa.FragmentManager.InspectablePropertyFlagEntry));
        AppCompatTextView appCompatTextView = c54953xam.OLrzqt;
        EscapeErrorCodes.EscapeRiskType escapeRiskType2 = this.AEQbTJ;
        int i = escapeRiskType2 == null ? -1 : StateListAnimator.AEQbTJ[escapeRiskType2.ordinal()];
        if (i == 1) {
            string = getString(C13754dXa.FragmentManager.attributeId);
        } else if (i == 2) {
            string = getString(C13754dXa.FragmentManager.target);
        } else if (i == 3) {
            string = getString(C13754dXa.FragmentManager.valueType);
        } else {
            string = getString(C13754dXa.FragmentManager.attributeId);
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
        C54946xaf binding = getBinding();
        wYK wyk = (binding == null || (constraintLayout = binding.AEQbTJ) == null) ? null : (wYK) constraintLayout.findViewById(C13754dXa.ActionBar.dIjzlO);
        if (this.AEQbTJ == EscapeErrorCodes.EscapeRiskType.ADDRESS_RISK) {
            if (wyk != null) {
                wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.fLm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                        C17605fLn.copydefault(wyf, compoundButton, z);
                    }
                });
            }
            wyf.setSecondaryText(getString(C13754dXa.FragmentManager.enumMapping));
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setEnabled(wyk != null ? wyk.isChecked() : false);
                c52794wYpAEQbTJ.setOKDSType(260);
                c52794wYpAEQbTJ.setOKDSSize(52);
                c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
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
        if (this.AEQbTJ == EscapeErrorCodes.EscapeRiskType.DEVICE_RISK) {
            string = requireContext().getString(C13754dXa.FragmentManager.QKudOq);
        } else {
            string = requireContext().getString(C13754dXa.FragmentManager.name);
        }
        wyf.setPrimaryText(string);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
            c52794wYpCopydefault.setOKDSSize(52);
            c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
        }
    }

    public static final void copydefault(wYF wyf, android.widget.CompoundButton compoundButton, boolean z) {
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

    /* JADX INFO: renamed from: o.fLn$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C17605fLn AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C17605fLn c17605fLn) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c17605fLn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.AEQbTJ.AEQbTJ == EscapeErrorCodes.EscapeRiskType.ADDRESS_RISK || this.AEQbTJ.AEQbTJ == EscapeErrorCodes.EscapeRiskType.ADDRESS_KYS_RISK) {
                    InterfaceC17595fLd interfaceC17595fLd = this.AEQbTJ.copydefault;
                    if (interfaceC17595fLd != null) {
                        interfaceC17595fLd.AkhnZx();
                    }
                } else {
                    InterfaceC17595fLd interfaceC17595fLd2 = this.AEQbTJ.copydefault;
                    if (interfaceC17595fLd2 != null) {
                        interfaceC17595fLd2.fetchVPNInfo();
                    }
                }
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.fLn$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C17605fLn AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C17605fLn c17605fLn) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c17605fLn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC17595fLd interfaceC17595fLd = this.AEQbTJ.copydefault;
                if (interfaceC17595fLd != null) {
                    interfaceC17595fLd.AEQbTJ(this.AEQbTJ.AEQbTJ);
                }
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
