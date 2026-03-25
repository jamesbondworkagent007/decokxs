package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27228jrI extends ConstraintLayout {
    public boolean AEQbTJ;
    public C23890iNc copydefault;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27228jrI(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27228jrI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27228jrI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    private final void AEQbTJ() {
        this.copydefault = C23890iNc.copydefault(android.view.LayoutInflater.from(getContext()), this);
    }

    public static /* synthetic */ void setData$default(C27228jrI c27228jrI, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z3 = false;
        }
        c27228jrI.setData(investTokenWithAmount, investTokenWithAmount2, z, z2, z3);
    }

    public final void setData(@NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull InvestTokenWithAmount investTokenWithAmount2, boolean z, boolean z2, boolean z3) {
        java.lang.String string;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String currencyData$default;
        java.lang.String str3;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount2, "");
        C23890iNc c23890iNc = this.copydefault;
        if (c23890iNc == null) {
            Intrinsics.gEmmrt("");
            c23890iNc = null;
        }
        android.widget.TextView textView = c23890iNc.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z3 ^ true ? 0 : 8);
        android.widget.TextView textView2 = c23890iNc.AYXKKw;
        if (!z3) {
            string = investTokenWithAmount.getTokenSymbol();
        } else {
            string = getContext().getString(C25493ixk.FragmentManager.invokespecialatDTRm);
            Intrinsics.copydefault((java.lang.Object) string);
        }
        textView2.setText(string);
        android.widget.TextView textView3 = c23890iNc.KWHzl;
        java.lang.String currencyData$default2 = "--";
        if (z2) {
            str2 = "--";
        } else {
            java.lang.String strLimitFmtNoZeroWithKMB$default = C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, z ? "0" : investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null);
            if (z3) {
                str = " " + investTokenWithAmount.getTokenSymbol();
            } else {
                str = "";
            }
            str2 = strLimitFmtNoZeroWithKMB$default + str;
        }
        textView3.setText(str2);
        android.widget.TextView textView4 = c23890iNc.valueOf;
        if (z2) {
            currencyData$default = "--";
        } else {
            currencyData$default = C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, z ? "0" : investTokenWithAmount.getCurrencyAmount(), null, null, null, 14, null);
        }
        textView4.setText(currencyData$default);
        c23890iNc.AhwBna.setText(investTokenWithAmount2.getTokenSymbol());
        android.widget.TextView textView5 = c23890iNc.OLrzqt;
        if (z2) {
            str3 = "--";
        } else {
            java.lang.String strLimitFmtNoZeroWithKMB$default2 = C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, z ? "0" : investTokenWithAmount2.getCoinAmount(), 6, 2, false, false, 24, null);
            if (z3) {
                str4 = " " + investTokenWithAmount2.getTokenSymbol();
            }
            str3 = strLimitFmtNoZeroWithKMB$default2 + str4;
        }
        textView5.setText(str3);
        android.widget.TextView textView6 = c23890iNc.djBIcL;
        if (!z2) {
            currencyData$default2 = C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, z ? "0" : investTokenWithAmount2.getCurrencyAmount(), null, null, null, 14, null);
        }
        textView6.setText(currencyData$default2);
    }

    public final void EZpvd() {
        if (this.AEQbTJ) {
            return;
        }
        C23890iNc c23890iNc = this.copydefault;
        C23890iNc c23890iNc2 = null;
        if (c23890iNc == null) {
            Intrinsics.gEmmrt("");
            c23890iNc = null;
        }
        c23890iNc.AEQbTJ.setVisibility(0);
        C23890iNc c23890iNc3 = this.copydefault;
        if (c23890iNc3 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc3 = null;
        }
        c23890iNc3.KWHzl.setVisibility(4);
        C23890iNc c23890iNc4 = this.copydefault;
        if (c23890iNc4 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc4 = null;
        }
        c23890iNc4.valueOf.setVisibility(4);
        C23890iNc c23890iNc5 = this.copydefault;
        if (c23890iNc5 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc5 = null;
        }
        C55113xdn c55113xdn = c23890iNc5.AEQbTJ;
        C23890iNc c23890iNc6 = this.copydefault;
        if (c23890iNc6 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc6 = null;
        }
        c55113xdn.setImageTintList(c23890iNc6.KWHzl.getTextColors());
        C23890iNc c23890iNc7 = this.copydefault;
        if (c23890iNc7 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc7 = null;
        }
        c23890iNc7.AEQbTJ.setAnimation(C33492mxV.OLrzqt() ? C25493ixk.Fragment.OLrzqt : C25493ixk.Fragment.EZpvd);
        C23890iNc c23890iNc8 = this.copydefault;
        if (c23890iNc8 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc8 = null;
        }
        c23890iNc8.AEQbTJ.KWHzl(0L);
        C23890iNc c23890iNc9 = this.copydefault;
        if (c23890iNc9 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc9 = null;
        }
        c23890iNc9.copydefault.setVisibility(0);
        C23890iNc c23890iNc10 = this.copydefault;
        if (c23890iNc10 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc10 = null;
        }
        c23890iNc10.OLrzqt.setVisibility(4);
        C23890iNc c23890iNc11 = this.copydefault;
        if (c23890iNc11 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc11 = null;
        }
        c23890iNc11.djBIcL.setVisibility(4);
        C23890iNc c23890iNc12 = this.copydefault;
        if (c23890iNc12 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc12 = null;
        }
        C55113xdn c55113xdn2 = c23890iNc12.copydefault;
        C23890iNc c23890iNc13 = this.copydefault;
        if (c23890iNc13 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc13 = null;
        }
        c55113xdn2.setImageTintList(c23890iNc13.OLrzqt.getTextColors());
        C23890iNc c23890iNc14 = this.copydefault;
        if (c23890iNc14 == null) {
            Intrinsics.gEmmrt("");
            c23890iNc14 = null;
        }
        c23890iNc14.copydefault.setAnimation(C33492mxV.OLrzqt() ? C25493ixk.Fragment.OLrzqt : C25493ixk.Fragment.EZpvd);
        C23890iNc c23890iNc15 = this.copydefault;
        if (c23890iNc15 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23890iNc2 = c23890iNc15;
        }
        c23890iNc2.copydefault.KWHzl(0L);
        this.AEQbTJ = true;
    }

    public final void copydefault() {
        if (this.AEQbTJ) {
            C23890iNc c23890iNc = this.copydefault;
            C23890iNc c23890iNc2 = null;
            if (c23890iNc == null) {
                Intrinsics.gEmmrt("");
                c23890iNc = null;
            }
            c23890iNc.AEQbTJ.setVisibility(4);
            C23890iNc c23890iNc3 = this.copydefault;
            if (c23890iNc3 == null) {
                Intrinsics.gEmmrt("");
                c23890iNc3 = null;
            }
            c23890iNc3.KWHzl.setVisibility(0);
            C23890iNc c23890iNc4 = this.copydefault;
            if (c23890iNc4 == null) {
                Intrinsics.gEmmrt("");
                c23890iNc4 = null;
            }
            c23890iNc4.valueOf.setVisibility(0);
            C23890iNc c23890iNc5 = this.copydefault;
            if (c23890iNc5 == null) {
                Intrinsics.gEmmrt("");
                c23890iNc5 = null;
            }
            c23890iNc5.copydefault.setVisibility(4);
            C23890iNc c23890iNc6 = this.copydefault;
            if (c23890iNc6 == null) {
                Intrinsics.gEmmrt("");
                c23890iNc6 = null;
            }
            c23890iNc6.OLrzqt.setVisibility(0);
            C23890iNc c23890iNc7 = this.copydefault;
            if (c23890iNc7 == null) {
                Intrinsics.gEmmrt("");
                c23890iNc7 = null;
            }
            c23890iNc7.djBIcL.setVisibility(0);
            C23890iNc c23890iNc8 = this.copydefault;
            if (c23890iNc8 == null) {
                Intrinsics.gEmmrt("");
                c23890iNc8 = null;
            }
            c23890iNc8.AEQbTJ.copydefault();
            C23890iNc c23890iNc9 = this.copydefault;
            if (c23890iNc9 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23890iNc2 = c23890iNc9;
            }
            c23890iNc2.copydefault.copydefault();
            this.AEQbTJ = false;
        }
    }
}
