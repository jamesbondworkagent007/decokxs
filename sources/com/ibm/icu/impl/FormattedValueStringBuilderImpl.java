package com.ibm.icu.impl;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ibm.icu.impl.StaticUnicodeSets;
import com.ibm.icu.text.ConstrainedFieldPosition;
import com.ibm.icu.text.ListFormatter;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.UFormat;
import com.ibm.icu.text.UnicodeSet;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.FieldPosition;
import java.text.Format;
import o.C7020abU;

/* JADX INFO: loaded from: classes3.dex */
public class FormattedValueStringBuilderImpl {

    public static class StateListAnimator {
        public Object AEQbTJ;
        public UFormat.SpanField EZpvd;
        public Format.Field OLrzqt;
    }

    public static int KWHzl(C7020abU c7020abU, Object obj) {
        for (int i = c7020abU.gEmmrt; i < c7020abU.gEmmrt + c7020abU.AhwBna; i++) {
            Object obj2 = c7020abU.AYXKKw[i];
            if ((obj2 instanceof StateListAnimator) && ((StateListAnimator) obj2).AEQbTJ.equals(obj)) {
                return i - c7020abU.gEmmrt;
            }
        }
        return -1;
    }

    public static boolean KWHzl(C7020abU c7020abU, FieldPosition fieldPosition) {
        Format.Field fieldAttribute = fieldPosition.getFieldAttribute();
        if (fieldAttribute == null) {
            if (fieldPosition.getField() == 0) {
                fieldAttribute = NumberFormat.Field.INTEGER;
            } else {
                if (fieldPosition.getField() != 1) {
                    return false;
                }
                fieldAttribute = NumberFormat.Field.FRACTION;
            }
        }
        if (!(fieldAttribute instanceof NumberFormat.Field)) {
            throw new IllegalArgumentException("You must pass an instance of com.ibm.icu.text.NumberFormat.Field as your FieldPosition attribute.  You passed: " + fieldAttribute.getClass().toString());
        }
        ConstrainedFieldPosition constrainedFieldPosition = new ConstrainedFieldPosition();
        constrainedFieldPosition.copydefault(fieldAttribute);
        constrainedFieldPosition.OLrzqt(fieldAttribute, null, fieldPosition.getBeginIndex(), fieldPosition.getEndIndex());
        if (AEQbTJ(c7020abU, constrainedFieldPosition, null)) {
            fieldPosition.setBeginIndex(constrainedFieldPosition.EZpvd());
            fieldPosition.setEndIndex(constrainedFieldPosition.KWHzl());
            return true;
        }
        if (fieldAttribute == NumberFormat.Field.FRACTION && fieldPosition.getEndIndex() == 0) {
            int i = c7020abU.gEmmrt;
            boolean z = false;
            while (i < c7020abU.gEmmrt + c7020abU.AhwBna) {
                if (EZpvd(c7020abU.AYXKKw[i]) || c7020abU.AYXKKw[i] == NumberFormat.Field.DECIMAL_SEPARATOR) {
                    z = true;
                } else if (z) {
                    break;
                }
                i++;
            }
            fieldPosition.setBeginIndex(i - c7020abU.gEmmrt);
            fieldPosition.setEndIndex(i - c7020abU.gEmmrt);
        }
        return false;
    }

    public static AttributedCharacterIterator OLrzqt(C7020abU c7020abU, Format.Field field) {
        ConstrainedFieldPosition constrainedFieldPosition = new ConstrainedFieldPosition();
        AttributedString attributedString = new AttributedString(c7020abU.toString());
        while (AEQbTJ(c7020abU, constrainedFieldPosition, field)) {
            Object objAEQbTJ = constrainedFieldPosition.AEQbTJ();
            if (objAEQbTJ == null) {
                objAEQbTJ = constrainedFieldPosition.copydefault();
            }
            attributedString.addAttribute(constrainedFieldPosition.copydefault(), objAEQbTJ, constrainedFieldPosition.EZpvd(), constrainedFieldPosition.KWHzl());
        }
        return attributedString.getIterator();
    }

    public static class NullField extends Format.Field {
        static final NullField END = new NullField(TtmlNode.END);
        private static final long serialVersionUID = 1;

        private NullField(String str) {
            super(str);
        }
    }

    public static boolean AEQbTJ(C7020abU c7020abU, ConstrainedFieldPosition constrainedFieldPosition, Format.Field field) {
        int i;
        int i2;
        int i3;
        int i4;
        int iKWHzl = c7020abU.gEmmrt + constrainedFieldPosition.KWHzl();
        int iEZpvd = -1;
        Object obj = null;
        while (true) {
            int i5 = c7020abU.gEmmrt;
            int i6 = c7020abU.AhwBna + i5;
            if (iKWHzl > i6) {
                return false;
            }
            Object obj2 = iKWHzl < i6 ? c7020abU.AYXKKw[iKWHzl] : NullField.END;
            if (obj == null) {
                if (constrainedFieldPosition.AEQbTJ(NumberFormat.Field.INTEGER, null) && iKWHzl > (i4 = c7020abU.gEmmrt) && iKWHzl - i4 > constrainedFieldPosition.KWHzl()) {
                    int i7 = iKWHzl - 1;
                    if (EZpvd(c7020abU.AYXKKw[i7]) && !EZpvd(obj2)) {
                        while (i7 >= c7020abU.gEmmrt && EZpvd(c7020abU.AYXKKw[i7])) {
                            i7--;
                        }
                        NumberFormat.Field field2 = NumberFormat.Field.INTEGER;
                        int i8 = c7020abU.gEmmrt;
                        constrainedFieldPosition.OLrzqt(field2, null, (i7 - i8) + 1, iKWHzl - i8);
                        return true;
                    }
                }
                if (field != null && constrainedFieldPosition.AEQbTJ(field, null) && iKWHzl > (i3 = c7020abU.gEmmrt) && (iKWHzl - i3 > constrainedFieldPosition.KWHzl() || constrainedFieldPosition.copydefault() != field)) {
                    int i9 = iKWHzl - 1;
                    if (KWHzl(c7020abU.AYXKKw[i9]) && !KWHzl(obj2)) {
                        while (i9 >= c7020abU.gEmmrt && KWHzl(c7020abU.AYXKKw[i9])) {
                            i9--;
                        }
                        int i10 = c7020abU.gEmmrt;
                        constrainedFieldPosition.OLrzqt(field, null, (i9 - i10) + 1, iKWHzl - i10);
                        return true;
                    }
                }
                if (iKWHzl > c7020abU.gEmmrt) {
                    int i11 = iKWHzl - 1;
                    if (c7020abU.AYXKKw[i11] instanceof StateListAnimator) {
                        int i12 = i11;
                        while (true) {
                            i2 = c7020abU.gEmmrt;
                            if (i12 < i2) {
                                break;
                            }
                            Object[] objArr = c7020abU.AYXKKw;
                            if (objArr[i12] != objArr[i11]) {
                                break;
                            }
                            i12--;
                        }
                        if (EZpvd(c7020abU.AYXKKw[i11], constrainedFieldPosition, (i12 - i2) + 1, iKWHzl - i2)) {
                            return true;
                        }
                    }
                }
                if (obj2 == NumberFormat.Field.INTEGER) {
                    obj2 = null;
                }
                if (obj2 != null && obj2 != NullField.END) {
                    if (obj2 instanceof StateListAnimator) {
                        StateListAnimator stateListAnimator = (StateListAnimator) obj2;
                        if (constrainedFieldPosition.AEQbTJ(stateListAnimator.OLrzqt, null) || constrainedFieldPosition.AEQbTJ(stateListAnimator.EZpvd, stateListAnimator.AEQbTJ)) {
                            i = c7020abU.gEmmrt;
                            iEZpvd = iKWHzl - i;
                            obj = obj2;
                        }
                    } else if (constrainedFieldPosition.AEQbTJ((Format.Field) obj2, null)) {
                        i = c7020abU.gEmmrt;
                        iEZpvd = iKWHzl - i;
                        obj = obj2;
                    }
                }
            } else if (obj != obj2) {
                int iCopydefault = iKWHzl - i5;
                if (obj instanceof StateListAnimator) {
                    return true;
                }
                if (OLrzqt(obj)) {
                    iCopydefault = copydefault(c7020abU, iCopydefault);
                }
                if (iCopydefault > iEZpvd) {
                    if (OLrzqt(obj)) {
                        iEZpvd = EZpvd(c7020abU, iEZpvd);
                    }
                    constrainedFieldPosition.OLrzqt((Format.Field) obj, null, iEZpvd, iCopydefault);
                    return true;
                }
                iKWHzl--;
                iEZpvd = -1;
                obj = null;
            } else {
                continue;
            }
            iKWHzl++;
        }
    }

    public static boolean EZpvd(Object obj) {
        return obj == NumberFormat.Field.INTEGER || obj == NumberFormat.Field.GROUPING_SEPARATOR;
    }

    public static boolean KWHzl(Object obj) {
        return obj == null || NumberFormat.Field.class.isAssignableFrom(obj.getClass());
    }

    public static boolean OLrzqt(Object obj) {
        return (obj == NumberFormat.Field.GROUPING_SEPARATOR || (obj instanceof ListFormatter.Field)) ? false : true;
    }

    public static int copydefault(C7020abU c7020abU, int i) {
        return StaticUnicodeSets.EZpvd(StaticUnicodeSets.Key.DEFAULT_IGNORABLES).copydefault(c7020abU, i, UnicodeSet.SpanCondition.CONTAINED);
    }

    public static int EZpvd(C7020abU c7020abU, int i) {
        return StaticUnicodeSets.EZpvd(StaticUnicodeSets.Key.DEFAULT_IGNORABLES).AEQbTJ(c7020abU, i, UnicodeSet.SpanCondition.CONTAINED);
    }

    public static boolean EZpvd(Object obj, ConstrainedFieldPosition constrainedFieldPosition, int i, int i2) {
        StateListAnimator stateListAnimator = (StateListAnimator) obj;
        if (constrainedFieldPosition.AEQbTJ(stateListAnimator.EZpvd, stateListAnimator.AEQbTJ) && constrainedFieldPosition.KWHzl() < i2) {
            constrainedFieldPosition.OLrzqt(stateListAnimator.EZpvd, stateListAnimator.AEQbTJ, i, i2);
            return true;
        }
        if (!constrainedFieldPosition.AEQbTJ(stateListAnimator.OLrzqt, null)) {
            return false;
        }
        if (constrainedFieldPosition.KWHzl() >= i2 && constrainedFieldPosition.copydefault() == stateListAnimator.OLrzqt) {
            return false;
        }
        constrainedFieldPosition.OLrzqt(stateListAnimator.OLrzqt, null, i, i2);
        return true;
    }
}
