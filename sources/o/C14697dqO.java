package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C14705dqW;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14697dqO extends ConstraintLayout {
    public final AbstractC16965etq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14697dqO(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14697dqO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.dqO.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C14697dqO(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14697dqO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C13754dXa.TaskDescription.HJWChPQPAeHI, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC16965etq) viewDataBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setData(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, boolean z2) {
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String strSubS$default;
        java.lang.String strSubS$default2;
        java.lang.String strSubS$default3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (z && z2) {
            android.widget.LinearLayout linearLayout = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            android.widget.LinearLayout linearLayout2 = this.copydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(0);
            java.lang.String strAddS$default = C33129mqd.addS$default(C33129mqd.addS$default(str, str2, null, null, null, 14, null), str3, null, null, null, 14, null);
            if (C33129mqd.valueOf(strAddS$default, 0)) {
                AEQbTJ();
                return;
            }
            BigDecimal bigDecimalOLrzqt = C54862xYb.OLrzqt(C54862xYb.divB$default(str, strAddS$default, 0, null, 6, null), 100);
            RoundingMode roundingMode = RoundingMode.DOWN;
            java.lang.String strConvertToString$default = C54862xYb.convertToString$default(bigDecimalOLrzqt, false, 2, roundingMode, 1, null);
            if (C33129mqd.OLrzqt((java.lang.Object) str2, (java.lang.Object) 0)) {
                strSubS$default2 = C33129mqd.subS$default("100", strConvertToString$default, null, null, null, 14, null);
            } else {
                if (!C33129mqd.OLrzqt((java.lang.Object) str3, (java.lang.Object) 0)) {
                    str4 = strConvertToString$default;
                    java.lang.String strConvertToString$default2 = C54862xYb.convertToString$default(C54862xYb.OLrzqt(C54862xYb.divB$default(str2, strAddS$default, 0, null, 6, null), 100), false, 2, roundingMode, 1, null);
                    str5 = strConvertToString$default2;
                    strSubS$default = C33129mqd.subS$default(C33129mqd.subS$default("100", str4, null, null, null, 14, null), strConvertToString$default2, null, null, null, 14, null);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (C33129mqd.AEQbTJ(str4, 0)) {
                        arrayList.add(new C14705dqW.TaskDescription(str4, C52761wXj.Activity.dvKsVJ));
                    }
                    if (C33129mqd.AEQbTJ(str5, 0)) {
                        arrayList.add(new C14705dqW.TaskDescription(str5, C52761wXj.Activity.DWgRXt));
                    }
                    if (C33129mqd.AEQbTJ(strSubS$default, 0)) {
                        arrayList.add(new C14705dqW.TaskDescription(strSubS$default, C52761wXj.Activity.aJZHYI));
                    }
                    OLrzqt(arrayList, str, str4, str2, str5, str3, strSubS$default);
                    return;
                }
                strSubS$default3 = C33129mqd.subS$default("100", strConvertToString$default, null, null, null, 14, null);
                strSubS$default2 = "";
            }
            strSubS$default = strSubS$default2;
            str5 = strSubS$default3;
            str4 = strConvertToString$default;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (C33129mqd.AEQbTJ(str4, 0)) {
            }
            if (C33129mqd.AEQbTJ(str5, 0)) {
            }
            if (C33129mqd.AEQbTJ(strSubS$default, 0)) {
            }
            OLrzqt(arrayList2, str, str4, str2, str5, str3, strSubS$default);
            return;
        }
        if (z) {
            android.widget.LinearLayout linearLayout3 = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout3.setVisibility(0);
            android.widget.LinearLayout linearLayout4 = this.copydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
            linearLayout4.setVisibility(8);
            java.lang.String strAddS$default2 = C33129mqd.addS$default(str, str2, null, null, null, 14, null);
            if (C33129mqd.valueOf(strAddS$default2, 0)) {
                AEQbTJ();
                return;
            }
            java.lang.String strConvertToString$default3 = C54862xYb.convertToString$default(C54862xYb.OLrzqt(C54862xYb.divB$default(str, strAddS$default2, 0, null, 6, null), 100), false, 2, RoundingMode.DOWN, 1, null);
            java.lang.String strSubS$default4 = C33129mqd.subS$default("100", strConvertToString$default3, null, null, null, 14, null);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (C33129mqd.AEQbTJ(strConvertToString$default3, 0)) {
                arrayList3.add(new C14705dqW.TaskDescription(strConvertToString$default3, C52761wXj.Activity.dvKsVJ));
            }
            if (C33129mqd.AEQbTJ(strSubS$default4, 0)) {
                arrayList3.add(new C14705dqW.TaskDescription(strSubS$default4, C52761wXj.Activity.DWgRXt));
            }
            updateUI$default(this, arrayList3, str, strConvertToString$default3, str2, strSubS$default4, null, null, 96, null);
            return;
        }
        if (z2) {
            android.widget.LinearLayout linearLayout5 = this.copydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
            linearLayout5.setVisibility(0);
            android.widget.LinearLayout linearLayout6 = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
            linearLayout6.setVisibility(8);
            java.lang.String strAddS$default3 = C33129mqd.addS$default(str, str3, null, null, null, 14, null);
            if (C33129mqd.valueOf(strAddS$default3, 0)) {
                AEQbTJ();
                return;
            }
            java.lang.String strConvertToString$default4 = C54862xYb.convertToString$default(C54862xYb.OLrzqt(C54862xYb.divB$default(str, strAddS$default3, 0, null, 6, null), 100), false, 2, RoundingMode.DOWN, 1, null);
            java.lang.String strSubS$default5 = C33129mqd.subS$default("100", strConvertToString$default4, null, null, null, 14, null);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            if (C33129mqd.AEQbTJ(strConvertToString$default4, 0)) {
                arrayList4.add(new C14705dqW.TaskDescription(strConvertToString$default4, C52761wXj.Activity.dvKsVJ));
            }
            if (C33129mqd.AEQbTJ(strSubS$default5, 0)) {
                arrayList4.add(new C14705dqW.TaskDescription(strSubS$default5, C52761wXj.Activity.aJZHYI));
            }
            updateUI$default(this, arrayList4, str, strConvertToString$default4, null, null, str3, strSubS$default5, 24, null);
            return;
        }
        android.widget.LinearLayout linearLayout7 = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout7, "");
        linearLayout7.setVisibility(8);
        android.widget.LinearLayout linearLayout8 = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout8, "");
        linearLayout8.setVisibility(8);
        if (C33129mqd.valueOf(str, 0)) {
            AEQbTJ();
        } else {
            updateUI$default(this, yDY.copydefault(new C14705dqW.TaskDescription("100", C52761wXj.Activity.dvKsVJ)), str, "100", null, null, null, null, 120, null);
        }
    }

    public static /* synthetic */ void updateUI$default(C14697dqO c14697dqO, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        c14697dqO.OLrzqt(list, str, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6);
    }

    public final void OLrzqt(java.util.List<C14705dqW.TaskDescription> list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        C14705dqW.setData$default(this.copydefault.djBIcL, list, 0.0f, 2, null);
        this.copydefault.isConnected.setText(" · " + pTB.formatICUPercent$default(C33129mqd.EZpvd(str2), null, null, null, null, null, 31, null));
        AppCompatTextView appCompatTextView = this.copydefault.AYXKKw;
        C13821dZn c13821dZn = C13821dZn.EZpvd;
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        CurrencyDisplayStyle currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX;
        appCompatTextView.setText(c13821dZn.OLrzqt(C54880xYt.formatValuation$default(bigDecimalEZpvd, 0, 0, null, currencyDisplayStyle, null, null, false, 119, null)));
        this.copydefault.AEQbTJ.setText(" · " + pTB.formatICUPercent$default(C33129mqd.EZpvd(str4), null, null, null, null, null, 31, null));
        this.copydefault.OLrzqt.setText(c13821dZn.OLrzqt(C54880xYt.formatValuation$default(C33129mqd.EZpvd(str3), 0, 0, null, currencyDisplayStyle, null, null, false, 119, null)));
        this.copydefault.valueOf.setText(" · " + pTB.formatICUPercent$default(C33129mqd.EZpvd(str6), null, null, null, null, null, 31, null));
        this.copydefault.KWHzl.setText(c13821dZn.OLrzqt(C54880xYt.formatValuation$default(C33129mqd.EZpvd(str5), 0, 0, null, currencyDisplayStyle, null, null, false, 119, null)));
    }

    public final void AEQbTJ() {
        C14705dqW.setData$default(this.copydefault.djBIcL, yDY.AhwBna(), 0.0f, 2, null);
        this.copydefault.isConnected.setText("");
        AppCompatTextView appCompatTextView = this.copydefault.AYXKKw;
        C13821dZn c13821dZn = C13821dZn.EZpvd;
        BigDecimal bigDecimalCopydefault = C33129mqd.copydefault("0");
        CurrencyDisplayStyle currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX;
        appCompatTextView.setText(c13821dZn.OLrzqt(C54880xYt.formatValuation$default(bigDecimalCopydefault, 0, 0, null, currencyDisplayStyle, null, null, false, 119, null)));
        this.copydefault.AEQbTJ.setText("");
        this.copydefault.OLrzqt.setText(c13821dZn.OLrzqt(C54880xYt.formatValuation$default(C33129mqd.copydefault("0"), 0, 0, null, currencyDisplayStyle, null, null, false, 119, null)));
        this.copydefault.valueOf.setText("");
        this.copydefault.KWHzl.setText(c13821dZn.OLrzqt(C54880xYt.formatValuation$default(C33129mqd.copydefault("0"), 0, 0, null, currencyDisplayStyle, null, null, false, 119, null)));
    }
}
