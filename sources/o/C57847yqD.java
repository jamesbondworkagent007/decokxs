package o;

import com.osbcp.cssparser.IncorrectFormatException;

/* JADX INFO: renamed from: o.yqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57847yqD {
    public static /* synthetic */ int[] AEQbTJ;
    public java.lang.String OLrzqt = "";
    public java.lang.String EZpvd = "";
    public java.lang.String AhwBna = "";
    public final java.util.List<C57846yqC> djBIcL = new java.util.ArrayList();
    public com.osbcp.cssparser.State gEmmrt = com.osbcp.cssparser.State.INSIDE_SELECTOR;
    public java.lang.Character KWHzl = null;
    public com.osbcp.cssparser.State copydefault = null;
    public final java.util.List<java.lang.String> valueOf = new java.util.ArrayList();

    public static /* synthetic */ int[] AEQbTJ() {
        int[] iArr = AEQbTJ;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[com.osbcp.cssparser.State.valuesCustom().length];
        try {
            iArr2[com.osbcp.cssparser.State.INSIDE_COMMENT.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr2[com.osbcp.cssparser.State.INSIDE_PROPERTY_NAME.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr2[com.osbcp.cssparser.State.INSIDE_SELECTOR.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.osbcp.cssparser.State.INSIDE_VALUE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.osbcp.cssparser.State.INSIDE_VALUE_ROUND_BRACKET.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        AEQbTJ = iArr2;
        return iArr2;
    }

    public static java.util.List<C57845yqB> EZpvd(java.lang.String str) throws java.lang.Exception {
        C57847yqD c57847yqD = new C57847yqD();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str == null || str.trim().isEmpty()) {
            return arrayList;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i < str.length() - 1) {
                c57847yqD.OLrzqt(arrayList, java.lang.Character.valueOf(cCharAt), java.lang.Character.valueOf(str.charAt(i + 1)));
            } else {
                c57847yqD.OLrzqt(arrayList, java.lang.Character.valueOf(cCharAt), null);
            }
        }
        return arrayList;
    }

    private C57847yqD() {
    }

    public final void OLrzqt(java.util.List<C57845yqB> list, java.lang.Character ch, java.lang.Character ch2) throws java.lang.Exception {
        if (C57895yqz.AYXKKw.equals(ch) && C57895yqz.AhwBna.equals(ch2)) {
            this.copydefault = this.gEmmrt;
            this.gEmmrt = com.osbcp.cssparser.State.INSIDE_COMMENT;
        }
        int i = AEQbTJ()[this.gEmmrt.ordinal()];
        if (i == 1) {
            copydefault(ch);
        } else if (i == 2) {
            KWHzl(ch);
        } else if (i == 3) {
            AEQbTJ(list, ch);
        } else if (i == 4) {
            AEQbTJ(ch);
        } else if (i == 5) {
            OLrzqt(ch);
        }
        this.KWHzl = ch;
    }

    public final void AEQbTJ(java.lang.Character ch) throws IncorrectFormatException {
        if (C57895yqz.djBIcL.equals(ch)) {
            this.djBIcL.add(new C57846yqC(this.EZpvd.trim(), this.AhwBna.trim()));
            this.EZpvd = "";
            this.AhwBna = "";
            this.gEmmrt = com.osbcp.cssparser.State.INSIDE_PROPERTY_NAME;
            return;
        }
        java.lang.Character ch2 = C57895yqz.copydefault;
        if (ch2.equals(ch)) {
            this.AhwBna = java.lang.String.valueOf(this.AhwBna) + ch2;
            this.gEmmrt = com.osbcp.cssparser.State.INSIDE_VALUE_ROUND_BRACKET;
            return;
        }
        if (C57895yqz.AEQbTJ.equals(ch)) {
            throw new IncorrectFormatException(IncorrectFormatException.ErrorCode.FOUND_COLON_WHILE_READING_VALUE, "The value '" + this.AhwBna.trim() + "' for property '" + this.EZpvd.trim() + "' in the selector '" + this.OLrzqt.trim() + "' had a ':' character.");
        }
        if (C57895yqz.OLrzqt.equals(ch)) {
            throw new IncorrectFormatException(IncorrectFormatException.ErrorCode.FOUND_END_BRACKET_BEFORE_SEMICOLON, "The value '" + this.AhwBna.trim() + "' for property '" + this.EZpvd.trim() + "' in the selector '" + this.OLrzqt.trim() + "' should end with an ';', not with '}'.");
        }
        this.AhwBna = java.lang.String.valueOf(this.AhwBna) + ch;
    }

    public final void OLrzqt(java.lang.Character ch) throws IncorrectFormatException {
        java.lang.Character ch2 = C57895yqz.gEmmrt;
        if (ch2.equals(ch)) {
            this.AhwBna = java.lang.String.valueOf(this.AhwBna) + ch2;
            this.gEmmrt = com.osbcp.cssparser.State.INSIDE_VALUE;
            return;
        }
        this.AhwBna = java.lang.String.valueOf(this.AhwBna) + ch;
    }

    public final void AEQbTJ(java.util.List<C57845yqB> list, java.lang.Character ch) throws IncorrectFormatException {
        if (C57895yqz.AEQbTJ.equals(ch)) {
            this.gEmmrt = com.osbcp.cssparser.State.INSIDE_VALUE;
            return;
        }
        if (C57895yqz.djBIcL.equals(ch)) {
            throw new IncorrectFormatException(IncorrectFormatException.ErrorCode.FOUND_SEMICOLON_WHEN_READING_PROPERTY_NAME, "Unexpected character '" + ch + "' for property '" + this.EZpvd.trim() + "' in the selector '" + this.OLrzqt.trim() + "' should end with an ';', not with '}'.");
        }
        if (C57895yqz.OLrzqt.equals(ch)) {
            C57845yqB c57845yqB = new C57845yqB();
            java.util.Iterator<java.lang.String> it = this.valueOf.iterator();
            while (it.hasNext()) {
                c57845yqB.EZpvd(new C57849yqF(it.next().trim()));
            }
            this.valueOf.clear();
            C57849yqF c57849yqF = new C57849yqF(this.OLrzqt.trim());
            this.OLrzqt = "";
            c57845yqB.EZpvd(c57849yqF);
            java.util.Iterator<C57846yqC> it2 = this.djBIcL.iterator();
            while (it2.hasNext()) {
                c57845yqB.AEQbTJ(it2.next());
            }
            this.djBIcL.clear();
            if (!c57845yqB.copydefault().isEmpty()) {
                list.add(c57845yqB);
            }
            this.gEmmrt = com.osbcp.cssparser.State.INSIDE_SELECTOR;
            return;
        }
        this.EZpvd = java.lang.String.valueOf(this.EZpvd) + ch;
    }

    public final void KWHzl(java.lang.Character ch) {
        if (C57895yqz.AhwBna.equals(this.KWHzl) && C57895yqz.AYXKKw.equals(ch)) {
            this.gEmmrt = this.copydefault;
        }
    }

    public final void copydefault(java.lang.Character ch) throws IncorrectFormatException {
        if (C57895yqz.EZpvd.equals(ch)) {
            this.gEmmrt = com.osbcp.cssparser.State.INSIDE_PROPERTY_NAME;
            return;
        }
        if (C57895yqz.KWHzl.equals(ch)) {
            if (this.OLrzqt.trim().isEmpty()) {
                throw new IncorrectFormatException(IncorrectFormatException.ErrorCode.FOUND_COLON_WHEN_READING_SELECTOR_NAME, "Found an ',' in a selector name without any actual name before it.");
            }
            this.valueOf.add(this.OLrzqt.trim());
            this.OLrzqt = "";
            return;
        }
        this.OLrzqt = java.lang.String.valueOf(this.OLrzqt) + ch;
    }
}
