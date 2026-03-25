package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eUi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15762eUi extends AbstractC52780wYb {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    @Override // o.AbstractC52780wYb
    public boolean OLrzqt() {
        return true;
    }

    public final java.lang.String KWHzl() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("arg_platform_name");
        }
        return null;
    }

    public final java.lang.String EZpvd() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("arg_wallet_investment_type");
        }
        return null;
    }

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        java.lang.String strEZpvd = EZpvd();
        if (strEZpvd != null && strEZpvd.length() != 0) {
            java.lang.String string = getString(C13754dXa.FragmentManager.dUDNAs);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        java.lang.String string2 = getString(C13754dXa.FragmentManager.remove);
        Intrinsics.copydefault((java.lang.Object) string2);
        return string2;
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(c54953xam, "");
        android.content.Context context = c54953xam.getRoot().getContext();
        android.view.View root = c54953xam.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        Intrinsics.copydefault(context);
        root.setPaddingRelative(root.getPaddingStart(), C55298xhM.OLrzqt(8, context), root.getPaddingEnd(), C55298xhM.OLrzqt(24, context));
        c54953xam.OLrzqt.setBreakStrategy(0);
        AppCompatTextView appCompatTextView = c54953xam.OLrzqt;
        java.lang.String strEZpvd = EZpvd();
        if (strEZpvd != null && strEZpvd.length() != 0) {
            java.lang.String strEZpvd2 = EZpvd();
            java.lang.String strKWHzl = KWHzl();
            string = EZpvd(strEZpvd2, strKWHzl != null ? strKWHzl : "");
        } else {
            string = getString(C13754dXa.FragmentManager.handleOnBackPressed);
            Intrinsics.copydefault((java.lang.Object) string);
        }
        appCompatTextView.setText(string);
        c54953xam.KWHzl.setVisibility(8);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String strCopydefault = C33069mpW.copydefault(this, C13754dXa.FragmentManager.USBtdM, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(MTCoreConstants.Protocol.KEY_PROTOCOL, str2)));
        if (str != null) {
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        return strCopydefault;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return strCopydefault;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return strCopydefault;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        return strCopydefault;
                    }
                    break;
                case 53:
                    if (str.equals("5")) {
                        return strCopydefault;
                    }
                    break;
                case 54:
                    if (str.equals(OrderDetailListItem.SLIP_OUT)) {
                        java.lang.String string = getString(C13754dXa.FragmentManager.DCUTEIdCUTEI);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        return string;
                    }
                    break;
                case 56:
                    if (str.equals("8")) {
                        return strCopydefault;
                    }
                    break;
                case 57:
                    if (str.equals("9")) {
                        return strCopydefault;
                    }
                    break;
            }
        }
        java.lang.String string2 = getString(C13754dXa.FragmentManager.handleOnBackPressed);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(getString(C13754dXa.FragmentManager.DarRvM));
            c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.eUi$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eUi.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C15762eUi KWHzl(java.lang.String str, java.lang.String str2) {
            C15762eUi c15762eUi = new C15762eUi();
            c15762eUi.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_platform_name", str), C56390yDp.OLrzqt("arg_wallet_investment_type", str2)));
            return c15762eUi;
        }
    }

    /* JADX INFO: renamed from: o.eUi$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C15762eUi EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C15762eUi c15762eUi) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c15762eUi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
