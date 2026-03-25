package o;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.biz.core.tx.wallet.TxReplaceSendInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gvY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21214gvY extends AbstractC57671ymn implements View.OnClickListener {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public TxReplaceSendInfo AYXKKw;
    public boolean KWHzl;
    public AbstractC16466ekU OLrzqt;
    public java.lang.Float copydefault;
    public ActionBar djBIcL;

    /* JADX INFO: renamed from: o.gvY$ActionBar */
    public interface ActionBar {
        void KWHzl(android.os.Bundle bundle);
    }

    public android.os.Bundle EZpvd(android.os.Bundle bundle) {
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public java.lang.Float OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public boolean isConnected() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.gvY$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gvY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final ViewOnClickListenerC21214gvY KWHzl(@NotNull TxReplaceSendInfo txReplaceSendInfo) {
            Intrinsics.checkNotNullParameter(txReplaceSendInfo, "");
            ViewOnClickListenerC21214gvY viewOnClickListenerC21214gvY = new ViewOnClickListenerC21214gvY();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("transactionInfo", txReplaceSendInfo);
            viewOnClickListenerC21214gvY.setArguments(bundle);
            return viewOnClickListenerC21214gvY;
        }
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.djBIcL = actionBar;
        show(fragmentManager, str);
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        ActionBar actionBar;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.AEQbTJ || (actionBar = this.djBIcL) == null) {
            return;
        }
        actionBar.KWHzl(EZpvd((android.os.Bundle) null));
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.gEmmrt);
    }

    @Override // o.AbstractC57671ymn
    public android.view.View EZpvd(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16525ela abstractC16525ela = (AbstractC16525ela) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.aJFbMH, viewGroup, false);
        abstractC16525ela.EZpvd.setOnClickListener(this);
        abstractC16525ela.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.attachBaseContext));
        abstractC16525ela.OLrzqt.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setPositiveButton));
        return abstractC16525ela.getRoot();
    }

    @Override // o.AbstractC57671ymn
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.OLrzqt = (AbstractC16466ekU) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.UscePu, viewGroup, false);
        android.os.Bundle arguments = getArguments();
        AbstractC16466ekU abstractC16466ekU = null;
        java.lang.Object obj = arguments != null ? arguments.get("transactionInfo") : null;
        this.AYXKKw = obj instanceof TxReplaceSendInfo ? (TxReplaceSendInfo) obj : null;
        AbstractC16466ekU abstractC16466ekU2 = this.OLrzqt;
        if (abstractC16466ekU2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16466ekU2 = null;
        }
        abstractC16466ekU2.values.copydefault();
        AbstractC16466ekU abstractC16466ekU3 = this.OLrzqt;
        if (abstractC16466ekU3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16466ekU3 = null;
        }
        Group group = abstractC16466ekU3.isConnected;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        KWHzl();
        copydefault();
        AbstractC16466ekU abstractC16466ekU4 = this.OLrzqt;
        if (abstractC16466ekU4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16466ekU = abstractC16466ekU4;
        }
        return abstractC16466ekU.getRoot();
    }

    private final void KWHzl() {
        java.lang.String currentGwei;
        java.lang.String strOLrzqt;
        java.lang.String neededGwei;
        java.lang.String gasLimit;
        java.lang.String strOLrzqt2;
        java.lang.String gasLimit2;
        AbstractC16466ekU abstractC16466ekU = this.OLrzqt;
        java.lang.String str = "";
        if (abstractC16466ekU == null) {
            Intrinsics.gEmmrt("");
            abstractC16466ekU = null;
        }
        abstractC16466ekU.djBIcL.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMenuInflater));
        abstractC16466ekU.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dispatchKeyEvent));
        android.widget.TextView textView = abstractC16466ekU.gEmmrt;
        TxReplaceSendInfo txReplaceSendInfo = this.AYXKKw;
        java.lang.String currentFee = txReplaceSendInfo != null ? txReplaceSendInfo.getCurrentFee() : null;
        TxReplaceSendInfo txReplaceSendInfo2 = this.AYXKKw;
        textView.setText(currentFee + " " + (txReplaceSendInfo2 != null ? txReplaceSendInfo2.getCurrentCurrency() : null));
        android.widget.TextView textView2 = abstractC16466ekU.EZpvd;
        int i = C13754dXa.FragmentManager.DcMfJKDGTeJD;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        TxReplaceSendInfo txReplaceSendInfo3 = this.AYXKKw;
        if (txReplaceSendInfo3 == null || (currentGwei = txReplaceSendInfo3.getCurrentGwei()) == null) {
            currentGwei = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("gasPrice", currentGwei);
        TxReplaceSendInfo txReplaceSendInfo4 = this.AYXKKw;
        if (txReplaceSendInfo4 == null || (gasLimit2 = txReplaceSendInfo4.getGasLimit()) == null || (strOLrzqt = C54869xYi.OLrzqt(gasLimit2)) == null) {
            strOLrzqt = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("gasLimit", strOLrzqt);
        textView2.setText(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        android.widget.TextView textView3 = abstractC16466ekU.AEQbTJ;
        TxReplaceSendInfo txReplaceSendInfo5 = this.AYXKKw;
        java.lang.String neededFee = txReplaceSendInfo5 != null ? txReplaceSendInfo5.getNeededFee() : null;
        TxReplaceSendInfo txReplaceSendInfo6 = this.AYXKKw;
        textView3.setText(neededFee + " " + (txReplaceSendInfo6 != null ? txReplaceSendInfo6.getNeededCurrency() : null));
        abstractC16466ekU.AEQbTJ.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.wlaJM));
        android.widget.TextView textView4 = abstractC16466ekU.OLrzqt;
        int i2 = C13754dXa.FragmentManager.DcMfJKDGTeJD;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        TxReplaceSendInfo txReplaceSendInfo7 = this.AYXKKw;
        if (txReplaceSendInfo7 == null || (neededGwei = txReplaceSendInfo7.getNeededGwei()) == null) {
            neededGwei = "";
        }
        pairArr2[0] = C56390yDp.OLrzqt("gasPrice", neededGwei);
        TxReplaceSendInfo txReplaceSendInfo8 = this.AYXKKw;
        if (txReplaceSendInfo8 != null && (gasLimit = txReplaceSendInfo8.getGasLimit()) != null && (strOLrzqt2 = C54869xYi.OLrzqt(gasLimit)) != null) {
            str = strOLrzqt2;
        }
        pairArr2[1] = C56390yDp.OLrzqt("gasLimit", str);
        textView4.setText(C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr2)));
        abstractC16466ekU.AhwBna.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertControllerAlertParams1));
    }

    private final void copydefault() {
        AbstractC16466ekU abstractC16466ekU = this.OLrzqt;
        if (abstractC16466ekU == null) {
            Intrinsics.gEmmrt("");
            abstractC16466ekU = null;
        }
        C8003auW.copydefault(abstractC16466ekU.AhwBna).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.gwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC21214gvY.AEQbTJ(this.OLrzqt, obj);
            }
        });
    }

    public static final void AEQbTJ(ViewOnClickListenerC21214gvY viewOnClickListenerC21214gvY, java.lang.Object obj) {
        viewOnClickListenerC21214gvY.OLrzqt(new android.os.Bundle());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.gwe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC21214gvY.EZpvd(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(ViewOnClickListenerC21214gvY viewOnClickListenerC21214gvY) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC21214gvY, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.sbu;
        if (numValueOf != null && numValueOf.intValue() == i) {
            dismissAllowingStateLoss();
        }
    }

    public static /* synthetic */ void close$default(ViewOnClickListenerC21214gvY viewOnClickListenerC21214gvY, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        viewOnClickListenerC21214gvY.OLrzqt(bundle);
    }

    public final void OLrzqt(android.os.Bundle bundle) {
        this.AEQbTJ = true;
        ActionBar actionBar = this.djBIcL;
        if (actionBar != null) {
            actionBar.KWHzl(EZpvd(bundle));
        }
        dismissAllowingStateLoss();
    }
}
