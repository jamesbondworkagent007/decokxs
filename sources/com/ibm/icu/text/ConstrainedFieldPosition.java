package com.ibm.icu.text;

import java.text.Format;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class ConstrainedFieldPosition {
    public Format.Field AEQbTJ;
    public Object AYXKKw;
    public int AhwBna;
    public Class<?> EZpvd;
    public ConstraintType KWHzl;
    public int OLrzqt;
    public long copydefault;

    public enum ConstraintType {
        NONE,
        CLASS,
        FIELD,
        VALUE
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(Format.Field field, Object obj, int i, int i2) {
        this.AEQbTJ = field;
        this.AYXKKw = obj;
        this.AhwBna = i;
        this.OLrzqt = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Format.Field copydefault() {
        return this.AEQbTJ;
    }

    public ConstrainedFieldPosition() {
        OLrzqt();
    }

    public void OLrzqt() {
        this.KWHzl = ConstraintType.NONE;
        this.EZpvd = Object.class;
        this.AEQbTJ = null;
        this.AYXKKw = null;
        this.AhwBna = 0;
        this.OLrzqt = 0;
        this.copydefault = 0L;
    }

    public void copydefault(Format.Field field) {
        if (field == null) {
            throw new IllegalArgumentException("Cannot constrain on null field");
        }
        this.KWHzl = ConstraintType.FIELD;
        this.EZpvd = Object.class;
        this.AEQbTJ = field;
        this.AYXKKw = null;
    }

    /* JADX INFO: renamed from: com.ibm.icu.text.ConstrainedFieldPosition$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[ConstraintType.values().length];
            KWHzl = iArr;
            try {
                iArr[ConstraintType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[ConstraintType.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[ConstraintType.FIELD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KWHzl[ConstraintType.VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public boolean AEQbTJ(Format.Field field, Object obj) {
        if (field == null) {
            throw new IllegalArgumentException("field must not be null");
        }
        int i = AnonymousClass2.KWHzl[this.KWHzl.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return this.EZpvd.isAssignableFrom(field.getClass());
        }
        if (i == 3) {
            return this.AEQbTJ == field;
        }
        if (i == 4) {
            return this.AEQbTJ == field && Objects.equals(this.AYXKKw, obj);
        }
        throw new AssertionError();
    }

    public String toString() {
        return "CFPos[" + this.AhwBna + '-' + this.OLrzqt + ' ' + this.AEQbTJ + AbstractJsonLexerKt.END_LIST;
    }
}
