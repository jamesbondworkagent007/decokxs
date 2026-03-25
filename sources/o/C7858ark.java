package o;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import com.amplifyframework.core.model.ModelIdentifier;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.ark, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7858ark {
    public static boolean AEQbTJ(java.lang.String str) {
        return str.charAt(0) == '#';
    }

    public static int OLrzqt(java.lang.String str) {
        if (str.charAt(0) == '#') {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (str.length() == 9) {
                sb.append((java.lang.CharSequence) str, 0, 1);
                sb.append((java.lang.CharSequence) str, 7, 9);
                sb.append((java.lang.CharSequence) str, 1, 7);
            } else if (str.length() == 7) {
                sb.append((java.lang.CharSequence) str, 0, 1);
                sb.append((java.lang.CharSequence) str, 1, 7);
            } else {
                return Color.parseColor(str);
            }
            return Color.parseColor(sb.toString());
        }
        return Color.parseColor(str);
    }

    public static int copydefault(java.lang.String str) {
        int iIntValue;
        int i;
        int i2;
        if (str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Color string is empty!");
        }
        java.lang.String lowerCase = str.trim().toLowerCase();
        if (AEQbTJ(lowerCase)) {
            return OLrzqt(lowerCase);
        }
        if (lowerCase.startsWith("rgb(") && lowerCase.endsWith(")")) {
            java.lang.String[] strArrSplit = lowerCase.substring(4, lowerCase.length() - 1).split(",");
            if (strArrSplit.length != 3) {
                throw new java.lang.IllegalArgumentException("rgb Color must have 3 value. eg: rgb(255,255,255) is white color");
            }
            try {
                int iIntValue2 = java.lang.Integer.valueOf(strArrSplit[0].trim()).intValue();
                int iIntValue3 = java.lang.Integer.valueOf(strArrSplit[1].trim()).intValue();
                iIntValue = java.lang.Integer.valueOf(strArrSplit[2].trim()).intValue();
                if (iIntValue2 < 0 || iIntValue2 > 255 || iIntValue3 < 0 || iIntValue3 > 255 || iIntValue < 0 || iIntValue > 255) {
                    throw new java.lang.IllegalArgumentException("rgb value must be in [0, 255]");
                }
                i = (iIntValue2 << 16) | ViewCompat.MEASURED_STATE_MASK;
                i2 = iIntValue3 << 8;
            } catch (java.lang.NumberFormatException e) {
                throw new java.lang.IllegalArgumentException("parse color number failed", e);
            }
        } else if (lowerCase.startsWith("rgba(") && lowerCase.endsWith(")")) {
            java.lang.String[] strArrSplit2 = lowerCase.substring(5, lowerCase.length() - 1).split(",");
            if (strArrSplit2.length != 4) {
                throw new java.lang.IllegalArgumentException("rgba Color must have 4 value. eg: rgba(255,255,255, 1) is white color");
            }
            try {
                int iFloatValue = (int) (java.lang.Float.valueOf(strArrSplit2[3]).floatValue() * 255.0f);
                int iIntValue4 = java.lang.Integer.valueOf(strArrSplit2[0].trim()).intValue();
                int iIntValue5 = java.lang.Integer.valueOf(strArrSplit2[1].trim()).intValue();
                iIntValue = java.lang.Integer.valueOf(strArrSplit2[2].trim()).intValue();
                if (iIntValue4 < 0 || iIntValue4 > 255 || iIntValue5 < 0 || iIntValue5 > 255 || iIntValue < 0 || iIntValue > 255 || iFloatValue < 0 || iFloatValue > 255) {
                    throw new java.lang.IllegalArgumentException("rgb value must be in [0, 255]");
                }
                i = (iFloatValue << 24) | (iIntValue4 << 16);
                i2 = iIntValue5 << 8;
            } catch (java.lang.NumberFormatException e2) {
                throw new java.lang.IllegalArgumentException("parse color number failed", e2);
            }
        } else {
            throw new java.lang.IllegalArgumentException("Unknown color");
        }
        return iIntValue | i | i2;
    }

    public static java.lang.String AEQbTJ(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
        for (int i2 = 3; i2 >= 0; i2--) {
            int i3 = (i >>> (i2 << 3)) & 255;
            if (i3 < 16) {
                sb.append('0');
            }
            sb.append(java.lang.Integer.toHexString(i3));
        }
        return sb.toString();
    }

    public static java.lang.String copydefault(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("rgba(");
        for (int i2 = 2; i2 >= 0; i2--) {
            sb.append(255 & (i >>> (i2 << 3)));
            sb.append(AbstractJsonLexerKt.COMMA);
        }
        int i3 = (i >>> 24) & 255;
        if (i3 == 0) {
            sb.append(0);
        } else if (i3 == 255) {
            sb.append(1);
        } else {
            sb.append(i3 / 255.0f);
        }
        sb.append(')');
        return sb.toString();
    }
}
