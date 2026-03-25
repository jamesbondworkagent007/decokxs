package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestGasFeeReminderInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iTM extends iTL {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public final boolean EZpvd;
    public iTO KWHzl;
    public iJF OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(iTO ito) {
        this.KWHzl = ito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.EZpvd;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iTM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final iTM AEQbTJ(@NotNull InvestGasFeeReminderInfo investGasFeeReminderInfo) {
            Intrinsics.checkNotNullParameter(investGasFeeReminderInfo, "");
            iTM itm = new iTM();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("claimGasFeeInfo", investGasFeeReminderInfo);
            itm.setArguments(bundle);
            return itm;
        }
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iJF ijfAEQbTJ = iJF.AEQbTJ(layoutInflater, viewGroup, false);
        this.OLrzqt = ijfAEQbTJ;
        if (ijfAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            ijfAEQbTJ = null;
        }
        ConstraintLayout root = ijfAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        iJF ijf = null;
        InvestGasFeeReminderInfo investGasFeeReminderInfo = arguments != null ? (InvestGasFeeReminderInfo) arguments.getParcelable("claimGasFeeInfo") : null;
        if (!(investGasFeeReminderInfo instanceof InvestGasFeeReminderInfo)) {
            investGasFeeReminderInfo = null;
        }
        if (investGasFeeReminderInfo != null) {
            java.lang.String strAEQbTJ = investGasFeeReminderInfo.AEQbTJ();
            boolean zAEQbTJ = C33129mqd.AEQbTJ(strAEQbTJ, investGasFeeReminderInfo.OLrzqt());
            boolean zGEmmrt = C33129mqd.gEmmrt(investGasFeeReminderInfo.EZpvd(), investGasFeeReminderInfo.copydefault());
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            java.lang.String currencyData$default = C27492jwH.formatCurrencyData$default(c27492jwH, strAEQbTJ, null, null, null, 14, null);
            java.lang.String currencyData$default2 = C27492jwH.formatCurrencyData$default(c27492jwH, investGasFeeReminderInfo.OLrzqt(), null, null, null, 14, null);
            iJF ijf2 = this.OLrzqt;
            if (ijf2 == null) {
                Intrinsics.gEmmrt("");
                ijf2 = null;
            }
            ijf2.KWHzl.setText(currencyData$default);
            iJF ijf3 = this.OLrzqt;
            if (ijf3 == null) {
                Intrinsics.gEmmrt("");
                ijf3 = null;
            }
            ijf3.gEmmrt.setText(currencyData$default2);
            iJF ijf4 = this.OLrzqt;
            if (ijf4 == null) {
                Intrinsics.gEmmrt("");
                ijf4 = null;
            }
            ConstraintLayout constraintLayout = ijf4.djBIcL;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(zAEQbTJ ? 0 : 8);
            iJF ijf5 = this.OLrzqt;
            if (ijf5 == null) {
                Intrinsics.gEmmrt("");
                ijf5 = null;
            }
            ijf5.EZpvd.setText(AEQbTJ(strAEQbTJ, investGasFeeReminderInfo.OLrzqt(), investGasFeeReminderInfo.EZpvd(), investGasFeeReminderInfo.KWHzl(), zAEQbTJ, zGEmmrt));
        }
        iJF ijf6 = this.OLrzqt;
        if (ijf6 == null) {
            Intrinsics.gEmmrt("");
            ijf6 = null;
        }
        ijf6.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.iTQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                iTM.OLrzqt(this.AEQbTJ, view2);
            }
        });
        iJF ijf7 = this.OLrzqt;
        if (ijf7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ijf = ijf7;
        }
        ijf.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.iTN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                iTM.KWHzl(this.AEQbTJ, view2);
            }
        });
    }

    public static final void OLrzqt(iTM itm, android.view.View view) {
        itm.AEQbTJ = true;
        itm.dismissAllowingStateLoss();
        iTO ito = itm.KWHzl;
        if (ito != null) {
            ito.copydefault();
        }
    }

    public static final void KWHzl(iTM itm, android.view.View view) {
        itm.dismissAllowingStateLoss();
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        iTO ito;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.AEQbTJ || (ito = this.KWHzl) == null) {
            return;
        }
        ito.OLrzqt();
    }

    public final android.text.SpannableString AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2) {
        java.lang.String strCopydefault;
        int length;
        java.lang.String currencyData$default = C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, C33129mqd.subS$default(str, str2, null, null, null, 14, null), null, null, null, 14, null);
        if (!z && z2) {
            strCopydefault = C33069mpW.copydefault(this, C25493ixk.FragmentManager.gqOnQv, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", str3), C56390yDp.OLrzqt("token", str4)));
        } else if (z && z2) {
            strCopydefault = C33069mpW.copydefault(this, C25493ixk.FragmentManager.UfveVb, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", str3), C56390yDp.OLrzqt("token", str4), C56390yDp.OLrzqt("minusAmount", currencyData$default)));
        } else {
            strCopydefault = C33069mpW.copydefault(this, C25493ixk.FragmentManager.hfdhUn, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("minusAmount", currencyData$default)));
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, (z || !z2) ? currencyData$default : str3, 0, false, 6, (java.lang.Object) null);
        if (z || !z2) {
            length = currencyData$default.length();
        } else {
            length = (str3 + str4).length() + 1;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv)), iIndexOf$default, length + iIndexOf$default, 33);
        if (z && z2) {
            java.lang.String str5 = strCopydefault;
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv)), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str5, str3, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str5, str3, 0, false, 6, (java.lang.Object) null) + (str3 + str4).length() + 1, 33);
        }
        return spannableString;
    }
}
