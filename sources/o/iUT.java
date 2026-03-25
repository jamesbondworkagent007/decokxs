package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iUT extends iTL {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public iKC OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean values() {
        return this.EZpvd;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iUT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final iUT EZpvd(@NotNull InvestPopUpData investPopUpData) {
            Intrinsics.checkNotNullParameter(investPopUpData, "");
            iUT iut = new iUT();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("unableToRedeem", investPopUpData);
            iut.setArguments(bundle);
            return iut;
        }
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iKC ikcCopydefault = iKC.copydefault(layoutInflater, viewGroup, false);
        this.OLrzqt = ikcCopydefault;
        if (ikcCopydefault == null) {
            Intrinsics.gEmmrt("");
            ikcCopydefault = null;
        }
        ConstraintLayout root = ikcCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        iKC ikc = null;
        InvestPopUpData investPopUpData = arguments != null ? (InvestPopUpData) arguments.getParcelable("unableToRedeem") : null;
        if (!(investPopUpData instanceof InvestPopUpData)) {
            investPopUpData = null;
        }
        if (investPopUpData != null) {
            iKC ikc2 = this.OLrzqt;
            if (ikc2 == null) {
                Intrinsics.gEmmrt("");
                ikc2 = null;
            }
            ikc2.valueOf.setText(investPopUpData.getTitle());
            iKC ikc3 = this.OLrzqt;
            if (ikc3 == null) {
                Intrinsics.gEmmrt("");
                ikc3 = null;
            }
            ikc3.OLrzqt.setText(investPopUpData.getContent());
            if (Intrinsics.EZpvd((java.lang.Object) investPopUpData.getTipLogo(), (java.lang.Object) InvestPopUpData.KEY_TIPLOGO_EXCLAMATION)) {
                iKC ikc4 = this.OLrzqt;
                if (ikc4 == null) {
                    Intrinsics.gEmmrt("");
                    ikc4 = null;
                }
                ikc4.EZpvd.setImageResource(C52761wXj.TaskDescription.GGlJim);
            } else {
                iKC ikc5 = this.OLrzqt;
                if (ikc5 == null) {
                    Intrinsics.gEmmrt("");
                    ikc5 = null;
                }
                ikc5.EZpvd.setImageResource(C52761wXj.TaskDescription.iMXFZQ);
            }
        }
        iKC ikc6 = this.OLrzqt;
        if (ikc6 == null) {
            Intrinsics.gEmmrt("");
            ikc6 = null;
        }
        ikc6.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.iUR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                iUT.AEQbTJ(this.AEQbTJ, view2);
            }
        });
        iKC ikc7 = this.OLrzqt;
        if (ikc7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikc = ikc7;
        }
        ikc.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.iUS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                iUT.OLrzqt(this.KWHzl, view2);
            }
        });
    }

    public static final void AEQbTJ(iUT iut, android.view.View view) {
        iut.dismissAllowingStateLoss();
    }

    public static final void OLrzqt(iUT iut, android.view.View view) {
        iut.dismissAllowingStateLoss();
    }
}
