package com.ibm.icu.impl;

import java.text.FieldPosition;
import java.text.Format;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class FormattedValueFieldPositionIteratorImpl {
    private FormattedValueFieldPositionIteratorImpl() {
    }

    public static class FieldWithValue extends Format.Field {
        private static final long serialVersionUID = -3850076447157793465L;
        public final Format.Field field;
        public final int value;

        public FieldWithValue(Format.Field field, int i) {
            super(field.toString());
            this.field = field;
            this.value = i;
        }
    }

    public static void OLrzqt(List<FieldPosition> list, Format.Field field, int i) {
        int size = list.size();
        int i2 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        while (i2 < size) {
            FieldPosition fieldPosition = list.get(i2);
            i2++;
            int i3 = i2;
            while (true) {
                if (i3 < size) {
                    FieldPosition fieldPosition2 = list.get(i3);
                    if (fieldPosition.getFieldAttribute() == fieldPosition2.getFieldAttribute()) {
                        iMin = Math.min(iMin, fieldPosition.getBeginIndex());
                        iMax = Math.max(iMax, fieldPosition.getEndIndex());
                        iMin2 = Math.min(iMin2, fieldPosition2.getBeginIndex());
                        iMax2 = Math.max(iMax2, fieldPosition2.getEndIndex());
                        break;
                    }
                    i3++;
                }
            }
        }
        if (iMin != Integer.MAX_VALUE) {
            FieldPosition fieldPosition3 = new FieldPosition(new FieldWithValue(field, i));
            fieldPosition3.setBeginIndex(iMin);
            fieldPosition3.setEndIndex(iMax);
            list.add(fieldPosition3);
            FieldPosition fieldPosition4 = new FieldPosition(new FieldWithValue(field, 1 - i));
            fieldPosition4.setBeginIndex(iMin2);
            fieldPosition4.setEndIndex(iMax2);
            list.add(fieldPosition4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void EZpvd(List<FieldPosition> list) {
        boolean z;
        long j;
        int iHashCode;
        int iHashCode2;
        int size = list.size();
        do {
            int i = 0;
            z = true;
            while (i < size - 1) {
                FieldPosition fieldPosition = list.get(i);
                int i2 = i + 1;
                FieldPosition fieldPosition2 = list.get(i2);
                if (fieldPosition.getBeginIndex() != fieldPosition2.getBeginIndex()) {
                    iHashCode = fieldPosition2.getBeginIndex();
                    iHashCode2 = fieldPosition.getBeginIndex();
                } else if (fieldPosition.getEndIndex() != fieldPosition2.getEndIndex()) {
                    iHashCode = fieldPosition.getEndIndex();
                    iHashCode2 = fieldPosition2.getEndIndex();
                } else {
                    if (fieldPosition.getFieldAttribute() != fieldPosition2.getFieldAttribute()) {
                        boolean z2 = fieldPosition.getFieldAttribute() instanceof FieldWithValue;
                        boolean z3 = fieldPosition2.getFieldAttribute() instanceof FieldWithValue;
                        if (z2 && !z3) {
                            j = 1;
                        } else if (!z3 || z2) {
                            iHashCode = fieldPosition.hashCode();
                            iHashCode2 = fieldPosition2.hashCode();
                        } else {
                            j = -1;
                        }
                    } else {
                        j = 0;
                    }
                    if (j >= 0) {
                        list.set(i, fieldPosition2);
                        list.set(i2, fieldPosition);
                        z = false;
                    }
                    i = i2;
                }
                j = iHashCode - iHashCode2;
                if (j >= 0) {
                }
                i = i2;
            }
        } while (!z);
    }
}
