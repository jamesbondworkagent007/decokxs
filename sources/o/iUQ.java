package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iUQ extends iTL {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final boolean AEQbTJ;
    public iKB EZpvd;
    public iUV KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(iUV iuv) {
        this.KWHzl = iuv;
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
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean values() {
        return this.OLrzqt;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iUQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final iUQ EZpvd(@NotNull InvestTransactionLossInfo investTransactionLossInfo) {
            Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
            iUQ iuq = new iUQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("transactionLossData", investTransactionLossInfo);
            iuq.setArguments(bundle);
            return iuq;
        }
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iKB ikbKWHzl = iKB.KWHzl(layoutInflater, viewGroup, false);
        this.EZpvd = ikbKWHzl;
        if (ikbKWHzl == null) {
            Intrinsics.gEmmrt("");
            ikbKWHzl = null;
        }
        ConstraintLayout root = ikbKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        iKB ikb = null;
        InvestTransactionLossInfo investTransactionLossInfo = arguments != null ? (InvestTransactionLossInfo) arguments.getParcelable("transactionLossData") : null;
        if (!(investTransactionLossInfo instanceof InvestTransactionLossInfo)) {
            investTransactionLossInfo = null;
        }
        if (investTransactionLossInfo != null) {
            iKB ikb2 = this.EZpvd;
            if (ikb2 == null) {
                Intrinsics.gEmmrt("");
                ikb2 = null;
            }
            android.widget.TextView textView = ikb2.AEQbTJ;
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            textView.setText(C27492jwH.formatCurrencyData$default(c27492jwH, investTransactionLossInfo.getNetworkFee(), null, null, null, 14, null));
            iKB ikb3 = this.EZpvd;
            if (ikb3 == null) {
                Intrinsics.gEmmrt("");
                ikb3 = null;
            }
            ikb3.AYXKKw.setText(C27492jwH.formatCurrencyData$default(c27492jwH, investTransactionLossInfo.getSwapLoss(), null, null, null, 14, null));
            iKB ikb4 = this.EZpvd;
            if (ikb4 == null) {
                Intrinsics.gEmmrt("");
                ikb4 = null;
            }
            ikb4.valueOf.setText(C27492jwH.formatCurrencyData$default(c27492jwH, investTransactionLossInfo.getTotalTransactionLoss(), null, null, null, 14, null));
            java.lang.String localized$default = pTB.formatLocalized$default(C33129mqd.gEmmrt(java.lang.Integer.valueOf(investTransactionLossInfo.getNumDays())), null, 1, null);
            java.lang.String strCopydefault = C33069mpW.copydefault(this, investTransactionLossInfo.getNumDays() > 1 ? C25493ixk.FragmentManager.gtCCJH : C25493ixk.FragmentManager.getPriority, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", localized$default)));
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, localized$default, 0, false, 6, (java.lang.Object) null);
            android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
            if (iIndexOf$default >= 0) {
                if (investTransactionLossInfo.getNumDays() > 1) {
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv)), iIndexOf$default, localized$default.length() + iIndexOf$default, 33);
                } else {
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iOIMNp)), iIndexOf$default, localized$default.length() + iIndexOf$default, 33);
                }
            }
            iKB ikb5 = this.EZpvd;
            if (ikb5 == null) {
                Intrinsics.gEmmrt("");
                ikb5 = null;
            }
            ikb5.isConnected.setText(spannableString);
            iKB ikb6 = this.EZpvd;
            if (ikb6 == null) {
                Intrinsics.gEmmrt("");
                ikb6 = null;
            }
            ikb6.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.iUY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    iUQ.OLrzqt(this.copydefault, view2);
                }
            });
            iKB ikb7 = this.EZpvd;
            if (ikb7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikb = ikb7;
            }
            ikb.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.iUU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    iUQ.KWHzl(this.EZpvd, view2);
                }
            });
        }
    }

    public static final void OLrzqt(iUQ iuq, android.view.View view) {
        iuq.dismissAllowingStateLoss();
        iUV iuv = iuq.KWHzl;
        if (iuv != null) {
            iuv.AEQbTJ();
        }
    }

    public static final void KWHzl(iUQ iuq, android.view.View view) {
        iuq.dismissAllowingStateLoss();
    }
}
