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
public final class iUX extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public iKA AEQbTJ;
    public final boolean EZpvd;
    public boolean OLrzqt;
    public final boolean copydefault = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.EZpvd;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iUX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ iUX newInstance$default(ActionBar actionBar, InvestTransactionLossInfo investTransactionLossInfo, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return actionBar.copydefault(investTransactionLossInfo, z);
        }

        public final iUX copydefault(@NotNull InvestTransactionLossInfo investTransactionLossInfo, boolean z) {
            Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
            iUX iux = new iUX();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("transactionLossData", investTransactionLossInfo);
            bundle.putBoolean("recoverDaysTip", z);
            iux.setArguments(bundle);
            return iux;
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
        this.AEQbTJ = iKA.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        InvestTransactionLossInfo investTransactionLossInfo = arguments != null ? (InvestTransactionLossInfo) arguments.getParcelable("transactionLossData") : null;
        InvestTransactionLossInfo investTransactionLossInfo2 = investTransactionLossInfo instanceof InvestTransactionLossInfo ? investTransactionLossInfo : null;
        if (investTransactionLossInfo2 != null) {
            OLrzqt(investTransactionLossInfo2);
        }
        android.os.Bundle arguments2 = getArguments();
        this.OLrzqt = arguments2 != null ? arguments2.getBoolean("transactionLossData") : false;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(getString(C25493ixk.FragmentManager.AYXKKw));
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
    }

    public final void OLrzqt(InvestTransactionLossInfo investTransactionLossInfo) {
        iKA ika = this.AEQbTJ;
        iKA ika2 = null;
        if (ika == null) {
            Intrinsics.gEmmrt("");
            ika = null;
        }
        android.widget.TextView textView = ika.copydefault;
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        textView.setText(C27492jwH.formatCurrencyData$default(c27492jwH, investTransactionLossInfo.getNetworkFee(), null, null, null, 14, null));
        iKA ika3 = this.AEQbTJ;
        if (ika3 == null) {
            Intrinsics.gEmmrt("");
            ika3 = null;
        }
        ika3.AEQbTJ.setText(C27492jwH.formatCurrencyData$default(c27492jwH, investTransactionLossInfo.getSwapLoss(), null, null, null, 14, null));
        iKA ika4 = this.AEQbTJ;
        if (ika4 == null) {
            Intrinsics.gEmmrt("");
            ika4 = null;
        }
        ika4.EZpvd.setText(C27492jwH.formatCurrencyData$default(c27492jwH, investTransactionLossInfo.getTotalTransactionLoss(), null, null, null, 14, null));
        java.lang.String localized$default = pTB.formatLocalized$default(C33129mqd.gEmmrt(java.lang.Integer.valueOf(investTransactionLossInfo.getNumDays())), null, 1, null);
        java.lang.String strCopydefault = C33069mpW.copydefault(this, investTransactionLossInfo.getNumDays() > 1 ? C25493ixk.FragmentManager.QwvEab : C25493ixk.FragmentManager.getPriority, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", localized$default)));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, localized$default, 0, false, 6, (java.lang.Object) null);
        android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
        if (iIndexOf$default >= 0) {
            if (investTransactionLossInfo.getNumDays() > 1) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv)), iIndexOf$default, localized$default.length() + iIndexOf$default, 33);
            } else {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iOIMNp)), iIndexOf$default, localized$default.length() + iIndexOf$default, 33);
            }
        }
        iKA ika5 = this.AEQbTJ;
        if (ika5 == null) {
            Intrinsics.gEmmrt("");
            ika5 = null;
        }
        android.widget.TextView textView2 = ika5.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(this.OLrzqt ^ true ? 0 : 8);
        iKA ika6 = this.AEQbTJ;
        if (ika6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ika2 = ika6;
        }
        ika2.isConnected.setText(spannableString);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ iUX EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, iUX iux) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = iux;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }
}
