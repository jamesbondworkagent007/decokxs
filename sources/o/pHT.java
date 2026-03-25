package o;

import android.text.style.LeadingMarginSpan;
import androidx.exifinterface.media.ExifInterface;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.rewards.okplatform.LexicalDecorate;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.lexical.listorbullet.RichTextListItem;
import com.okinc.lexical.text.GeneralRichText;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.pHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pHT implements pHO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int[] OLrzqt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static java.lang.String[] AEQbTJ = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "IV", "I"};

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pHT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.pHO
    public boolean KWHzl(@NotNull BaseRichTextBlock baseRichTextBlock) {
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        java.lang.String type = baseRichTextBlock.getType();
        return type != null && android.text.TextUtils.equals(type, "listitem");
    }

    public final java.lang.CharSequence KWHzl(int i) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int length = OLrzqt.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = OLrzqt[i2];
            java.lang.String str = AEQbTJ[i2];
            while (i >= i3) {
                i -= i3;
                stringBuffer.append(str);
            }
            if (i == 0) {
                break;
            }
        }
        java.lang.String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.CharSequence AEQbTJ(int i) {
        java.lang.String str = "";
        while (i > 0) {
            int i2 = i % 26;
            if (i2 == 0) {
                i2 = 26;
            }
            str = ((char) (i2 + 64)) + str;
            i = (i - i2) / 26;
        }
        return str;
    }

    @Override // o.pHO
    public android.text.SpannableStringBuilder copydefault(@NotNull BaseRichTextBlock baseRichTextBlock, java.lang.String str, C37993pIg c37993pIg, boolean z) {
        LexicalDecorate lexicalDecorateOLrzqt;
        pHK phkCopydefault;
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        RichTextListItem richTextListItem = (RichTextListItem) baseRichTextBlock;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (C33129mqd.KWHzl((java.util.Collection) richTextListItem.getChildren())) {
            for (BaseRichTextBlock baseRichTextBlock2 : richTextListItem.getChildren()) {
                if (baseRichTextBlock2.getType() != null && c37993pIg != null && (phkCopydefault = c37993pIg.copydefault()) != null) {
                    java.util.HashMap<java.lang.String, pHO> mapOLrzqt = phkCopydefault.OLrzqt();
                    java.lang.String type = baseRichTextBlock2.getType();
                    Intrinsics.copydefault((java.lang.Object) type);
                    pHO pho = mapOLrzqt.get(type);
                    if (pho != null && pho.KWHzl(baseRichTextBlock2)) {
                        if (baseRichTextBlock2 instanceof GeneralRichText) {
                            KWHzl(str, richTextListItem, spannableStringBuilder, c37993pIg);
                        }
                        spannableStringBuilder.append((java.lang.CharSequence) pHO.TaskDescription.renderBlock$default(pho, baseRichTextBlock2, null, c37993pIg, false, 10, null));
                    }
                }
            }
            java.lang.String string = spannableStringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (string.length() > 0) {
                java.lang.String string2 = spannableStringBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                if (!C59449zhJ.startsWith$default(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) string2).toString(), "[space]", false, 2, null)) {
                    C37996pIj.makeUpMargin$default(C37996pIj.KWHzl, spannableStringBuilder, 0, 2, null);
                    if (c37993pIg != null && (lexicalDecorateOLrzqt = c37993pIg.OLrzqt()) != null) {
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(lexicalDecorateOLrzqt.getTextColor())), 0, spannableStringBuilder.length(), 33);
                    }
                    spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard((richTextListItem.getIndent() + 1) * C55298xhM.dp2px$default(20.0f, null, 1, null)), 0, spannableStringBuilder.length(), 33);
                }
            }
            java.lang.String string3 = spannableStringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "");
            if (string3.length() > 0) {
                C37996pIj.KWHzl.EZpvd(spannableStringBuilder);
            }
        }
        return spannableStringBuilder;
    }

    public final void KWHzl(java.lang.String str, @NotNull RichTextListItem richTextListItem, @NotNull android.text.SpannableStringBuilder spannableStringBuilder, C37993pIg c37993pIg) {
        Intrinsics.checkNotNullParameter(richTextListItem, "");
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "");
        int indent = richTextListItem.getIndent();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            if (android.text.TextUtils.equals(str, "bullet")) {
                if (indent == 0) {
                    java.lang.String string = spannableStringBuilder.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    if (C59449zhJ.startsWith$default(string, "•", false, 2, null)) {
                        return;
                    }
                    spannableStringBuilder.insert(0, "• ");
                    return;
                }
                if (indent == 1) {
                    java.lang.String string2 = spannableStringBuilder.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    if (C59449zhJ.startsWith$default(string2, "◦", false, 2, null)) {
                        return;
                    }
                    spannableStringBuilder.insert(0, "◦ ");
                    return;
                }
                java.lang.String string3 = spannableStringBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                if (C59449zhJ.startsWith$default(string3, "▪", false, 2, null)) {
                    return;
                }
                spannableStringBuilder.insert(0, "▪ ");
                return;
            }
            if (android.text.TextUtils.equals(str, DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER)) {
                int i = indent % 5;
                if (i == 0) {
                    java.lang.String string4 = spannableStringBuilder.toString();
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    if (C59449zhJ.startsWith$default(string4, richTextListItem.getValue() + JwtUtilsKt.JWT_DELIMITER, false, 2, null)) {
                        return;
                    }
                    spannableStringBuilder.insert(0, (java.lang.CharSequence) (richTextListItem.getValue() + JwtUtilsKt.JWT_DELIMITER));
                    return;
                }
                if (i == 1) {
                    java.lang.String string5 = spannableStringBuilder.toString();
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    java.lang.String string6 = AEQbTJ(richTextListItem.getValue()).toString();
                    java.util.Locale locale = java.util.Locale.ROOT;
                    java.lang.String upperCase = string6.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    if (C59449zhJ.startsWith$default(string5, upperCase + JwtUtilsKt.JWT_DELIMITER, false, 2, null)) {
                        return;
                    }
                    java.lang.String upperCase2 = AEQbTJ(richTextListItem.getValue()).toString().toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    spannableStringBuilder.insert(0, (java.lang.CharSequence) (upperCase2 + JwtUtilsKt.JWT_DELIMITER));
                    return;
                }
                if (i == 2) {
                    java.lang.String string7 = spannableStringBuilder.toString();
                    Intrinsics.checkNotNullExpressionValue(string7, "");
                    java.lang.String string8 = AEQbTJ(richTextListItem.getValue()).toString();
                    java.util.Locale locale2 = java.util.Locale.ROOT;
                    java.lang.String lowerCase = string8.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (C59449zhJ.startsWith$default(string7, lowerCase + JwtUtilsKt.JWT_DELIMITER, false, 2, null)) {
                        return;
                    }
                    java.lang.String lowerCase2 = AEQbTJ(richTextListItem.getValue()).toString().toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    spannableStringBuilder.insert(0, (java.lang.CharSequence) (lowerCase2 + JwtUtilsKt.JWT_DELIMITER));
                    return;
                }
                if (i == 3) {
                    java.lang.String string9 = spannableStringBuilder.toString();
                    Intrinsics.checkNotNullExpressionValue(string9, "");
                    java.lang.String string10 = KWHzl(richTextListItem.getValue()).toString();
                    java.util.Locale locale3 = java.util.Locale.ROOT;
                    java.lang.String upperCase3 = string10.toUpperCase(locale3);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                    if (C59449zhJ.startsWith$default(string9, upperCase3 + JwtUtilsKt.JWT_DELIMITER, false, 2, null)) {
                        return;
                    }
                    java.lang.String upperCase4 = KWHzl(richTextListItem.getValue()).toString().toUpperCase(locale3);
                    Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                    spannableStringBuilder.insert(0, (java.lang.CharSequence) (upperCase4 + JwtUtilsKt.JWT_DELIMITER));
                    return;
                }
                if (i != 4) {
                    return;
                }
                java.lang.String string11 = spannableStringBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(string11, "");
                java.lang.String string12 = KWHzl(richTextListItem.getValue()).toString();
                java.util.Locale locale4 = java.util.Locale.ROOT;
                java.lang.String lowerCase3 = string12.toLowerCase(locale4);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                if (C59449zhJ.startsWith$default(string11, lowerCase3 + JwtUtilsKt.JWT_DELIMITER, false, 2, null)) {
                    return;
                }
                java.lang.String lowerCase4 = KWHzl(richTextListItem.getValue()).toString().toLowerCase(locale4);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                spannableStringBuilder.insert(0, (java.lang.CharSequence) (lowerCase4 + JwtUtilsKt.JWT_DELIMITER));
            }
        }
    }
}
