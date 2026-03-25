package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26726jhk {
    public static final int copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.AhwBna(str) > C33129mqd.AhwBna(str2) ? C52761wXj.Activity.DQzvGN : C52761wXj.Activity.fdOvFl;
    }

    public static /* synthetic */ void setRemainingRepayment$default(C23785iJf c23785iJf, InterfaceC24178iXu.Fragment fragment, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        copydefault(c23785iJf, fragment, z);
    }

    public static final void copydefault(@NotNull C23785iJf c23785iJf, @NotNull InterfaceC24178iXu.Fragment fragment, boolean z) {
        java.lang.String coinAmount;
        Intrinsics.checkNotNullParameter(c23785iJf, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        android.content.Context context = c23785iJf.getRoot().getContext();
        android.widget.TextView textView = c23785iJf.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        boolean zAEQbTJ = C55296xhK.AEQbTJ(textView);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String str = "0";
        if (fragment.KWHzl() != null) {
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            InvestTokenWithAmount investTokenWithAmountAEQbTJ = fragment.AEQbTJ();
            java.lang.String coinAmount2 = investTokenWithAmountAEQbTJ != null ? investTokenWithAmountAEQbTJ.getCoinAmount() : null;
            java.lang.String strLimitFmtNoZeroWithKMB$default = C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, (coinAmount2 == null || coinAmount2.length() == 0) ? "0" : coinAmount2, 6, 2, false, false, 24, null);
            InvestTokenWithAmount investTokenWithAmountAEQbTJ2 = fragment.AEQbTJ();
            java.lang.String str2 = strLimitFmtNoZeroWithKMB$default + " " + (investTokenWithAmountAEQbTJ2 != null ? investTokenWithAmountAEQbTJ2.getTokenSymbol() : null);
            java.lang.String coinAmount3 = fragment.KWHzl().getCoinAmount();
            java.lang.String str3 = C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, (coinAmount3 == null || coinAmount3.length() == 0) ? "0" : coinAmount3, 6, 2, false, false, 24, null) + " " + fragment.KWHzl().getTokenSymbol();
            int iAhwBna = C33129mqd.AhwBna(fragment.copydefault());
            InvestTokenWithAmount investTokenWithAmountAEQbTJ3 = fragment.AEQbTJ();
            if (investTokenWithAmountAEQbTJ3 != null && (coinAmount = investTokenWithAmountAEQbTJ3.getCoinAmount()) != null) {
                str = coinAmount;
            }
            if (iAhwBna > C33129mqd.AhwBna(str)) {
                java.lang.String strCopydefault = fragment.copydefault();
                InvestTokenWithAmount investTokenWithAmountAEQbTJ4 = fragment.AEQbTJ();
                java.lang.String coinAmount4 = investTokenWithAmountAEQbTJ4 != null ? investTokenWithAmountAEQbTJ4.getCoinAmount() : null;
                if (coinAmount4 == null) {
                    coinAmount4 = "";
                }
                android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, copydefault(strCopydefault, coinAmount4)));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((java.lang.CharSequence) str2);
                spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            } else {
                android.text.style.ForegroundColorSpan foregroundColorSpan2 = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab));
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((java.lang.CharSequence) str2);
                if (!z) {
                    spannableStringBuilder.append((java.lang.CharSequence) "\n");
                }
                InvestTokenWithAmount investTokenWithAmountAEQbTJ5 = fragment.AEQbTJ();
                if (!Intrinsics.EZpvd((java.lang.Object) (investTokenWithAmountAEQbTJ5 != null ? investTokenWithAmountAEQbTJ5.getCoinAmount() : null), (java.lang.Object) fragment.KWHzl().getCoinAmount())) {
                    spannableStringBuilder.append((java.lang.CharSequence) (zAEQbTJ ? " ← " : " → "));
                }
                spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
                InvestTokenWithAmount investTokenWithAmountAEQbTJ6 = fragment.AEQbTJ();
                if (!Intrinsics.EZpvd((java.lang.Object) (investTokenWithAmountAEQbTJ6 != null ? investTokenWithAmountAEQbTJ6.getCoinAmount() : null), (java.lang.Object) fragment.KWHzl().getCoinAmount())) {
                    android.text.style.ForegroundColorSpan foregroundColorSpan3 = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append((java.lang.CharSequence) str3);
                    spannableStringBuilder.setSpan(foregroundColorSpan3, length3, spannableStringBuilder.length(), 17);
                }
            }
        } else {
            android.text.style.ForegroundColorSpan foregroundColorSpan4 = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
            int length4 = spannableStringBuilder.length();
            C27492jwH c27492jwH2 = C27492jwH.OLrzqt;
            InvestTokenWithAmount investTokenWithAmountAEQbTJ7 = fragment.AEQbTJ();
            java.lang.String coinAmount5 = investTokenWithAmountAEQbTJ7 != null ? investTokenWithAmountAEQbTJ7.getCoinAmount() : null;
            java.lang.String strLimitFmtNoZeroWithKMB$default2 = C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH2, (coinAmount5 == null || coinAmount5.length() == 0) ? "0" : coinAmount5, 6, 2, false, false, 24, null);
            InvestTokenWithAmount investTokenWithAmountAEQbTJ8 = fragment.AEQbTJ();
            spannableStringBuilder.append((java.lang.CharSequence) (strLimitFmtNoZeroWithKMB$default2 + " " + (investTokenWithAmountAEQbTJ8 != null ? investTokenWithAmountAEQbTJ8.getTokenSymbol() : null)));
            spannableStringBuilder.setSpan(foregroundColorSpan4, length4, spannableStringBuilder.length(), 17);
        }
        android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
        android.widget.TextView textView2 = c23785iJf.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 0 : 8);
        android.widget.TextView textView3 = c23785iJf.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(z ? 8 : 0);
        if (z) {
            c23785iJf.OLrzqt.setText(spannedString);
        } else {
            c23785iJf.EZpvd.setText(spannedString);
        }
    }
}
