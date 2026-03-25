package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27224jrE extends ConstraintLayout {
    public C23891iNd EZpvd;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27224jrE(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27224jrE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27224jrE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt();
    }

    private final void OLrzqt() {
        this.EZpvd = C23891iNd.OLrzqt(android.view.LayoutInflater.from(getContext()), this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.jrE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTitle$default(C27224jrE c27224jrE, java.lang.String str, InvestTipInfoVo investTipInfoVo, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            investTipInfoVo = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        c27224jrE.setTitle(str, investTipInfoVo, function0);
    }

    public final void setTitle(@NotNull java.lang.String str, InvestTipInfoVo investTipInfoVo, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        C23891iNd c23891iNd = this.EZpvd;
        if (c23891iNd == null) {
            Intrinsics.gEmmrt("");
            c23891iNd = null;
        }
        android.widget.TextView textView = c23891iNd.valueOf;
        if (investTipInfoVo != null) {
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            Intrinsics.copydefault(textView);
            int i = C52761wXj.TaskDescription.GGlJim;
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iCopydefault = C55298xhM.copydefault(16.0f, context);
            int color = ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.aappFQ);
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c27569jxf.copydefault(textView, i, iCopydefault, true, java.lang.Integer.valueOf(color), C55298xhM.copydefault(4.0f, context2));
            android.content.Context context3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c27569jxf.AEQbTJ(context3, textView, textView, investTipInfoVo, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
            return;
        }
        textView.setText(str);
        C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
        Intrinsics.copydefault(textView);
        int i2 = C52761wXj.TaskDescription.GGlJim;
        android.content.Context context4 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        int iCopydefault2 = C55298xhM.copydefault(16.0f, context4);
        boolean z = function0 != null;
        int color2 = ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.aappFQ);
        android.content.Context context5 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        c27569jxf2.copydefault(textView, i2, iCopydefault2, z, java.lang.Integer.valueOf(color2), C55298xhM.copydefault(4.0f, context5));
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.jrM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27224jrE.setTitle$lambda$1$lambda$0(function0, view);
            }
        });
    }

    public static final void setTitle$lambda$1$lambda$0(Function0 function0, android.view.View view) {
        if (function0 != null) {
        }
    }

    public final void setData(InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, boolean z, boolean z2) {
        C23891iNd c23891iNd = this.EZpvd;
        C23891iNd c23891iNd2 = null;
        if (c23891iNd == null) {
            Intrinsics.gEmmrt("");
            c23891iNd = null;
        }
        android.widget.TextView textView = c23891iNd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        C23891iNd c23891iNd3 = this.EZpvd;
        if (c23891iNd3 == null) {
            Intrinsics.gEmmrt("");
            c23891iNd3 = null;
        }
        android.widget.TextView textView2 = c23891iNd3.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        C23891iNd c23891iNd4 = this.EZpvd;
        if (c23891iNd4 == null) {
            Intrinsics.gEmmrt("");
            c23891iNd4 = null;
        }
        android.widget.TextView textView3 = c23891iNd4.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(0);
        C23891iNd c23891iNd5 = this.EZpvd;
        if (c23891iNd5 == null) {
            Intrinsics.gEmmrt("");
            c23891iNd5 = null;
        }
        android.widget.TextView textView4 = c23891iNd5.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(0);
        C23891iNd c23891iNd6 = this.EZpvd;
        if (c23891iNd6 == null) {
            Intrinsics.gEmmrt("");
            c23891iNd6 = null;
        }
        android.widget.TextView textView5 = c23891iNd6.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(0);
        C23891iNd c23891iNd7 = this.EZpvd;
        if (c23891iNd7 == null) {
            Intrinsics.gEmmrt("");
            c23891iNd7 = null;
        }
        android.widget.LinearLayout linearLayout = c23891iNd7.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        if (investTokenWithAmount == null) {
            C23891iNd c23891iNd8 = this.EZpvd;
            if (c23891iNd8 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd8 = null;
            }
            android.widget.TextView textView6 = c23891iNd8.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            textView6.setVisibility(8);
            C23891iNd c23891iNd9 = this.EZpvd;
            if (c23891iNd9 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd9 = null;
            }
            android.widget.TextView textView7 = c23891iNd9.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            textView7.setVisibility(8);
        } else if (z) {
            C23891iNd c23891iNd10 = this.EZpvd;
            if (c23891iNd10 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd10 = null;
            }
            android.widget.TextView textView8 = c23891iNd10.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            textView8.setVisibility(0);
            C23891iNd c23891iNd11 = this.EZpvd;
            if (c23891iNd11 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd11 = null;
            }
            android.widget.TextView textView9 = c23891iNd11.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView9, "");
            textView9.setVisibility(0);
            C23891iNd c23891iNd12 = this.EZpvd;
            if (c23891iNd12 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd12 = null;
            }
            android.widget.TextView textView10 = c23891iNd12.EZpvd;
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            textView10.setText(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, "0", 6, 2, false, false, 24, null) + " " + investTokenWithAmount.getTokenSymbol());
            C23891iNd c23891iNd13 = this.EZpvd;
            if (c23891iNd13 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd13 = null;
            }
            c23891iNd13.OLrzqt.setText(C27492jwH.formatCurrencyData$default(c27492jwH, "0", null, null, null, 14, null));
        } else if (z2) {
            C23891iNd c23891iNd14 = this.EZpvd;
            if (c23891iNd14 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd14 = null;
            }
            c23891iNd14.EZpvd.setText("--");
            C23891iNd c23891iNd15 = this.EZpvd;
            if (c23891iNd15 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd15 = null;
            }
            c23891iNd15.OLrzqt.setText("--");
        } else if (investTokenWithAmount.getDataType() == InvestTokenType.TRADING_FEE) {
            C23891iNd c23891iNd16 = this.EZpvd;
            if (c23891iNd16 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd16 = null;
            }
            c23891iNd16.EZpvd.setText(C27492jwH.OLrzqt.KWHzl(investTokenWithAmount.getCurrencyAmount()) + " " + getContext().getString(C25493ixk.FragmentManager.DQnQnb));
            C23891iNd c23891iNd17 = this.EZpvd;
            if (c23891iNd17 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd17 = null;
            }
            android.widget.TextView textView11 = c23891iNd17.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView11, "");
            textView11.setVisibility(8);
        } else {
            C23891iNd c23891iNd18 = this.EZpvd;
            if (c23891iNd18 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd18 = null;
            }
            android.widget.TextView textView12 = c23891iNd18.EZpvd;
            C27492jwH c27492jwH2 = C27492jwH.OLrzqt;
            textView12.setText(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH2, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null) + " " + investTokenWithAmount.getTokenSymbol());
            C23891iNd c23891iNd19 = this.EZpvd;
            if (c23891iNd19 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd19 = null;
            }
            android.widget.TextView textView13 = c23891iNd19.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView13, "");
            textView13.setVisibility(0);
            C23891iNd c23891iNd20 = this.EZpvd;
            if (c23891iNd20 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd20 = null;
            }
            c23891iNd20.OLrzqt.setText(C27492jwH.formatCurrencyData$default(c27492jwH2, investTokenWithAmount.getCurrencyAmount(), null, null, null, 14, null));
        }
        if (investTokenWithAmount2 == null) {
            C23891iNd c23891iNd21 = this.EZpvd;
            if (c23891iNd21 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd21 = null;
            }
            android.widget.TextView textView14 = c23891iNd21.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView14, "");
            textView14.setVisibility(8);
            C23891iNd c23891iNd22 = this.EZpvd;
            if (c23891iNd22 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23891iNd2 = c23891iNd22;
            }
            android.widget.TextView textView15 = c23891iNd2.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView15, "");
            textView15.setVisibility(8);
            return;
        }
        C23891iNd c23891iNd23 = this.EZpvd;
        if (c23891iNd23 == null) {
            Intrinsics.gEmmrt("");
            c23891iNd23 = null;
        }
        android.widget.TextView textView16 = c23891iNd23.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView16, "");
        textView16.setVisibility(0);
        C23891iNd c23891iNd24 = this.EZpvd;
        if (c23891iNd24 == null) {
            Intrinsics.gEmmrt("");
            c23891iNd24 = null;
        }
        android.widget.TextView textView17 = c23891iNd24.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView17, "");
        textView17.setVisibility(0);
        if (z) {
            C23891iNd c23891iNd25 = this.EZpvd;
            if (c23891iNd25 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd25 = null;
            }
            android.widget.TextView textView18 = c23891iNd25.AEQbTJ;
            C27492jwH c27492jwH3 = C27492jwH.OLrzqt;
            textView18.setText(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH3, "0", 6, 2, false, false, 24, null) + " " + investTokenWithAmount2.getTokenSymbol());
            C23891iNd c23891iNd26 = this.EZpvd;
            if (c23891iNd26 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23891iNd2 = c23891iNd26;
            }
            c23891iNd2.gEmmrt.setText(C27492jwH.formatCurrencyData$default(c27492jwH3, "0", null, null, null, 14, null));
            return;
        }
        if (z2) {
            C23891iNd c23891iNd27 = this.EZpvd;
            if (c23891iNd27 == null) {
                Intrinsics.gEmmrt("");
                c23891iNd27 = null;
            }
            c23891iNd27.AEQbTJ.setText("--");
            C23891iNd c23891iNd28 = this.EZpvd;
            if (c23891iNd28 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23891iNd2 = c23891iNd28;
            }
            c23891iNd2.gEmmrt.setText("--");
            return;
        }
        C23891iNd c23891iNd29 = this.EZpvd;
        if (c23891iNd29 == null) {
            Intrinsics.gEmmrt("");
            c23891iNd29 = null;
        }
        android.widget.TextView textView19 = c23891iNd29.AEQbTJ;
        C27492jwH c27492jwH4 = C27492jwH.OLrzqt;
        textView19.setText(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH4, investTokenWithAmount2.getCoinAmount(), 6, 2, false, false, 24, null) + " " + investTokenWithAmount2.getTokenSymbol());
        C23891iNd c23891iNd30 = this.EZpvd;
        if (c23891iNd30 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23891iNd2 = c23891iNd30;
        }
        c23891iNd2.gEmmrt.setText(C27492jwH.formatCurrencyData$default(c27492jwH4, investTokenWithAmount2.getCurrencyAmount(), null, null, null, 14, null));
    }
}
