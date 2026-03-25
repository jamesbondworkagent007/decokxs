package o;

import android.view.View;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.crcore.shared.formatter.AmountDisplayType;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31661lzi {
    public static /* synthetic */ java.lang.String prependFiatSymbol$default(java.lang.String str, java.lang.String str2, java.lang.String str3, C38307pTy c38307pTy, RoundingMode roundingMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 16) != 0) {
            z = false;
        }
        return copydefault(str, str2, str3, c38307pTy2, roundingMode2, z);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull C38307pTy c38307pTy, @NotNull RoundingMode roundingMode, boolean z) {
        java.lang.String localized$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (z) {
            localized$default = pTB.toLocalizationStringWithMaxPrecision$default(str, 2, roundingMode, null, 4, null);
        } else {
            localized$default = pTB.formatLocalized$default(str, null, 1, null);
        }
        java.lang.String str4 = localized$default;
        try {
            return C38305pTw.formatFiatSymbol$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), str2, roundingMode, c38307pTy, null, null, null, 56, null);
        } catch (java.lang.Exception unused) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "AUD") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SGD")) {
                return str3 + str4;
            }
            return str3 + str4;
        }
    }

    public static /* synthetic */ java.lang.String appendFiatSymbol$default(java.lang.String str, java.lang.String str2, int i, C38307pTy c38307pTy, RoundingMode roundingMode, AmountDisplayType amountDisplayType, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C38306pTx.AEQbTJ.AEQbTJ(str2);
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(i3);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i2 & 8) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i2 & 16) != 0) {
            amountDisplayType = AmountDisplayType.INPUT;
        }
        return EZpvd(str, str2, i3, c38307pTy2, roundingMode2, amountDisplayType);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull C38307pTy c38307pTy, @NotNull RoundingMode roundingMode, @NotNull AmountDisplayType amountDisplayType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(amountDisplayType, "");
        if (C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_NEW_AMOUNT_DISPLAY)) {
            return ((InterfaceC31780mDq) C43251rlk.copydefault(InterfaceC31780mDq.class)).copydefault(new C31775mDl(str2, amountDisplayType, C33129mqd.EZpvd(str), false, roundingMode, null, 40, null));
        }
        try {
            return C38305pTw.formatFiatCode$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), str2, roundingMode, c38307pTy, null, null, null, 56, null);
        } catch (java.lang.Exception unused) {
            return pTB.formatLocalized$default(str, null, 1, null) + " " + str2;
        }
    }

    public static /* synthetic */ java.lang.String appendCryptoSymbol$default(java.lang.String str, java.lang.String str2, int i, C38307pTy c38307pTy, RoundingMode roundingMode, AmountDisplayType amountDisplayType, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            c38307pTy = C38307pTy.Companion.AEQbTJ(i3);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i2 & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i2 & 16) != 0) {
            amountDisplayType = AmountDisplayType.INPUT;
        }
        return AEQbTJ(str, str2, i3, c38307pTy2, roundingMode2, amountDisplayType);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull C38307pTy c38307pTy, @NotNull RoundingMode roundingMode, @NotNull AmountDisplayType amountDisplayType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(amountDisplayType, "");
        if (C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_NEW_AMOUNT_DISPLAY)) {
            return ((InterfaceC31780mDq) C43251rlk.copydefault(InterfaceC31780mDq.class)).copydefault(new C31775mDl(str2, amountDisplayType, C33129mqd.EZpvd(str), false, roundingMode, null, 40, null));
        }
        try {
            java.util.List<java.lang.String> listOLrzqt = C31785mDv.EZpvd.OLrzqt();
            if (!(listOLrzqt instanceof java.util.Collection) || !listOLrzqt.isEmpty()) {
                java.util.Iterator<T> it = listOLrzqt.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) it.next(), (java.lang.CharSequence) str2, true)) {
                        c38307pTy = C38307pTy.Companion.AEQbTJ(2);
                        break;
                    }
                }
            }
            return C38305pTw.formatCryptoCode$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), str2, roundingMode, c38307pTy, null, null, null, 56, null);
        } catch (java.lang.Exception unused) {
            return pTB.formatLocalized$default(OLrzqt(str, i), null, 1, null) + " " + str2;
        }
    }

    public static /* synthetic */ java.lang.String getScientificallyFormattedValue$default(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, C38307pTy c38307pTy, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return OLrzqt(str, z, str2, str3, c38307pTy, roundingMode);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull C38307pTy c38307pTy, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        BigDecimal bigDecimal = new BigDecimal("0.000000000000001");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        BigDecimal bigDecimal2 = BigDecimal.ONE;
        if (bigDecimalEZpvd.remainder(bigDecimal2).abs().compareTo(bigDecimal) >= 0 && bigDecimalEZpvd.compareTo(bigDecimal2) < 0) {
            if (z) {
                return prependFiatSymbol$default(str, str2, str3, c38307pTy, roundingMode, false, 16, null);
            }
            return appendCryptoSymbol$default(str, str3, 0, c38307pTy, roundingMode, null, 18, null);
        }
        C38307pTy c38307pTyCopydefault = C38307pTy.Companion.copydefault(1, 5);
        if (z) {
            return C38305pTw.formatFiatSymbolWithSubscriptStyle$default(bigDecimalEZpvd, str2, roundingMode, c38307pTyCopydefault, null, null, 24, null);
        }
        return C38305pTw.formatCryptoCodeWithSubscriptStyle$default(bigDecimalEZpvd, str3, roundingMode, c38307pTyCopydefault, null, null, 24, null);
    }

    public static /* synthetic */ java.lang.String getCryptoListPriceFormat$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 2;
        }
        if ((i2 & 8) != 0) {
            str3 = "0.01";
        }
        return OLrzqt(str, str2, z, i, str3);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, int i, @NotNull java.lang.String str3) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str4 = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "AED") ? "%s %s" : "%s%s";
        if (z) {
            java.lang.String str5 = C33129mqd.copydefault(str, str3) ? str2 : null;
            if (str5 == null) {
                str5 = "< " + str2;
            }
            java.lang.String toMaxPrecision$default = formatToMaxPrecision$default(str, i, null, 2, null);
            if (!C33129mqd.copydefault(str, str3)) {
                toMaxPrecision$default = null;
            }
            if (toMaxPrecision$default == null) {
                toMaxPrecision$default = formatToMaxPrecision$default(str3, i, null, 2, null);
            }
            pairOLrzqt = C56390yDp.OLrzqt(str5, toMaxPrecision$default);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(str2, copydefault(str));
        }
        java.lang.String str6 = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str7 = (java.lang.String) pairOLrzqt.component2();
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str8 = java.lang.String.format(str4, java.util.Arrays.copyOf(new java.lang.Object[]{str6, str7}, 2));
        Intrinsics.checkNotNullExpressionValue(str8, "");
        return str8;
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String plainString = C33129mqd.EZpvd(str).setScale(i, RoundingMode.DOWN).stripTrailingZeros().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return plainString;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String plainString = C33129mqd.EZpvd(str).setScale(i, 1).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return plainString;
    }

    public static /* synthetic */ java.lang.String formatToMaxPrecision$default(java.lang.String str, int i, RoundingMode roundingMode, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return OLrzqt(str, i, roundingMode);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return pTB.toLocalizationStringWithMaxPrecision$default(str, i, roundingMode, null, 4, null);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54536xML.toSafeString$default(C54536xML.setNumber$default(new C54536xML(), str, C33129mqd.gEmmrt(java.lang.Integer.valueOf(C54573xNj.copydefault.AEQbTJ(C33129mqd.AEQbTJ(str)))), null, null, 12, null).djBIcL(), false, 1, null);
    }

    public static final void KWHzl(@NotNull androidx.fragment.app.DialogFragment dialogFragment, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dialogFragment, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag != null) {
            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        }
        fragmentTransactionBeginTransaction.add(dialogFragment, str).commitNowAllowingStateLoss();
    }

    public static /* synthetic */ java.lang.String formatDownToFixedOtc$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return copydefault(str, z);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            return pTB.formatLocalized$default(str, null, 1, null);
        }
        int length = 0;
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null)) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() > 1) {
                length = ((java.lang.String) listSplit$default.get(1)).length();
            }
        }
        return pTB.formatDownToFixed$default(pTB.OLrzqt((java.lang.Object) str), length, null, 2, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mqi.toastWithSuccessfulIcon$default(java.lang.String, int, int, java.lang.Object):void */
    public static final void EZpvd(android.content.Context context, java.lang.String str, java.lang.String str2, android.widget.TextView textView, java.lang.String str3) {
        try {
            java.lang.Object systemService = context.getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService;
            if (str == null) {
                str = "";
            }
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(str, str2 != null ? str2 : textView.getText()));
            if (str3 == null) {
                str3 = "";
            }
            C33134mqi.toastWithSuccessfulIcon$default(str3 + " " + context.getString(C31351lsQ.Activity.NRYds), 0, 1, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static final void OLrzqt(@NotNull final android.widget.TextView textView, @NotNull final android.content.Context context, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(context, "");
        try {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.lzh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C31661lzi.AEQbTJ(context, str, str2, textView, str3, view);
                }
            });
            textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.lzm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return C31661lzi.EZpvd(context, str, str2, textView, str3, view);
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static final void AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2, android.widget.TextView textView, java.lang.String str3, android.view.View view) {
        EZpvd(context, str, str2, textView, str3);
    }

    public static final boolean EZpvd(android.content.Context context, java.lang.String str, java.lang.String str2, android.widget.TextView textView, java.lang.String str3, android.view.View view) {
        EZpvd(context, str, str2, textView, str3);
        return true;
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        java.lang.CharSequence charSequenceSubSequence = "";
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strReplace$default = C59449zhJ.replace$default(C59449zhJ.replace$default(str, "✅", "", false, 4, (java.lang.Object) null), " ❌", "", false, 4, (java.lang.Object) null);
        int length = strReplace$default.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!(!java.lang.Character.isDigit(strReplace$default.charAt(length)))) {
                    charSequenceSubSequence = strReplace$default.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return charSequenceSubSequence.toString();
    }
}
