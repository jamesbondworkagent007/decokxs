package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55030xcJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lQZ implements C55030xcJ.LoaderManager {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final lQY AEQbTJ;
    public final char OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.copydefault = z;
    }

    public lQZ(@NotNull lQY lqy) {
        Intrinsics.checkNotNullParameter(lqy, "");
        this.AEQbTJ = lqy;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        this.OLrzqt = C38303pTu.EZpvd(locale).charAt(0);
    }

    public final C55001xbh OLrzqt() {
        return this.AEQbTJ.AkhnZx();
    }

    @Override // o.C55030xcJ.LoaderManager
    public void AEQbTJ(char c) {
        int length;
        int i;
        int i2;
        java.lang.String string;
        java.lang.String string2;
        if (c == this.OLrzqt || c == '.') {
            if (this.copydefault) {
                return;
            } else {
                this.copydefault = true;
            }
        }
        C55001xbh c55001xbhOLrzqt = OLrzqt();
        android.text.Editable text = c55001xbhOLrzqt != null ? c55001xbhOLrzqt.getText() : null;
        if (text != null && text.length() == 0 && (c == this.OLrzqt || c == '.')) {
            this.AEQbTJ.setTextValue(C59449zhJ.replace$default("0" + c, '.', this.OLrzqt, false, 4, (java.lang.Object) null));
            C55001xbh c55001xbhOLrzqt2 = OLrzqt();
            if (c55001xbhOLrzqt2 != null) {
                c55001xbhOLrzqt2.setSelection(2);
                return;
            }
            return;
        }
        C55001xbh c55001xbhOLrzqt3 = OLrzqt();
        if (c55001xbhOLrzqt3 != null) {
            length = c55001xbhOLrzqt3.getSelectionStart();
        } else {
            C55001xbh c55001xbhOLrzqt4 = OLrzqt();
            length = c55001xbhOLrzqt4 != null ? c55001xbhOLrzqt4.length() : 0;
        }
        if (text == null || (string2 = text.subSequence(0, length).toString()) == null) {
            i = 0;
        } else {
            i = 0;
            for (int i3 = 0; i3 < string2.length(); i3++) {
                char cCharAt = string2.charAt(i3);
                if (!java.lang.Character.isDigit(cCharAt) && cCharAt != this.OLrzqt) {
                    i++;
                }
            }
        }
        java.lang.String strValueOf = java.lang.String.valueOf(text != null ? StringsKt__StringsKt.AEQbTJ(text, length, length, java.lang.String.valueOf(c)) : null);
        lQY lqy = this.AEQbTJ;
        if (this.copydefault) {
            strValueOf = KWHzl(strValueOf);
        }
        lqy.setTextValue(strValueOf);
        C55001xbh c55001xbhOLrzqt5 = OLrzqt();
        android.text.Editable text2 = c55001xbhOLrzqt5 != null ? c55001xbhOLrzqt5.getText() : null;
        if (!Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(text2), (java.lang.Object) java.lang.String.valueOf(text))) {
            if (text2 == null || (string = text2.subSequence(0, length).toString()) == null) {
                i2 = 0;
            } else {
                i2 = 0;
                for (int i4 = 0; i4 < string.length(); i4++) {
                    char cCharAt2 = string.charAt(i4);
                    if (!java.lang.Character.isDigit(cCharAt2) && cCharAt2 != this.OLrzqt) {
                        i2++;
                    }
                }
            }
            int iValueOf = C56548yJl.valueOf(length + 1 + (i2 - i), text2 != null ? text2.length() : 0);
            C55001xbh c55001xbhOLrzqt6 = OLrzqt();
            if (c55001xbhOLrzqt6 != null) {
                c55001xbhOLrzqt6.setSelection(iValueOf);
                return;
            }
            return;
        }
        C55001xbh c55001xbhOLrzqt7 = OLrzqt();
        if (c55001xbhOLrzqt7 != null) {
            c55001xbhOLrzqt7.setSelection(length);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    @Override // o.C55030xcJ.LoaderManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ() {
        int length;
        int i;
        int i2;
        int i3;
        java.lang.String string;
        java.lang.String string2;
        C55001xbh c55001xbhOLrzqt = OLrzqt();
        if (c55001xbhOLrzqt != null) {
            length = c55001xbhOLrzqt.getSelectionStart();
        } else {
            C55001xbh c55001xbhOLrzqt2 = OLrzqt();
            length = c55001xbhOLrzqt2 != null ? c55001xbhOLrzqt2.length() : 0;
        }
        if (length == 0) {
            return;
        }
        C55001xbh c55001xbhOLrzqt3 = OLrzqt();
        android.text.Editable text = c55001xbhOLrzqt3 != null ? c55001xbhOLrzqt3.getText() : null;
        int i4 = length - 1;
        int iCopydefault = C56548yJl.copydefault(i4, 0);
        java.lang.Character chValueOf = text != null ? java.lang.Character.valueOf(text.charAt(iCopydefault)) : null;
        if (chValueOf == null || java.lang.Character.isDigit(chValueOf.charValue())) {
            i = 0;
        } else {
            char c = this.OLrzqt;
            if (chValueOf == null || chValueOf.charValue() != c) {
                iCopydefault = C56548yJl.copydefault(length - 2, 0);
                chValueOf = text != null ? java.lang.Character.valueOf(text.charAt(iCopydefault)) : null;
                i = 1;
            }
        }
        if (text == null || (string2 = text.subSequence(0, length).toString()) == null) {
            i2 = 0;
        } else {
            i2 = 0;
            for (int i5 = 0; i5 < string2.length(); i5++) {
                char cCharAt = string2.charAt(i5);
                if (!java.lang.Character.isDigit(cCharAt) && cCharAt != this.OLrzqt) {
                    i2++;
                }
            }
        }
        if (this.copydefault) {
            char c2 = this.OLrzqt;
            if (chValueOf != null && chValueOf.charValue() == c2) {
                this.copydefault = false;
            }
        }
        this.AEQbTJ.setTextValue(java.lang.String.valueOf(text != null ? StringsKt__StringsKt.copydefault(text, iCopydefault, iCopydefault + 1) : null));
        C55001xbh c55001xbhOLrzqt4 = OLrzqt();
        android.text.Editable text2 = c55001xbhOLrzqt4 != null ? c55001xbhOLrzqt4.getText() : null;
        if (!Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(text2), (java.lang.Object) java.lang.String.valueOf(text))) {
            int iValueOf = C56548yJl.valueOf(i4, text2 != null ? text2.length() : 0);
            if (text2 == null || (string = text2.subSequence(0, iValueOf).toString()) == null) {
                i3 = 0;
            } else {
                i3 = 0;
                for (int i6 = 0; i6 < string.length(); i6++) {
                    char cCharAt2 = string.charAt(i6);
                    if (!java.lang.Character.isDigit(cCharAt2) && cCharAt2 != this.OLrzqt) {
                        i3++;
                    }
                }
            }
            int iCopydefault2 = C56548yJl.copydefault(((length - i) - 1) - (i2 - i3), 0);
            C55001xbh c55001xbhOLrzqt5 = OLrzqt();
            if (c55001xbhOLrzqt5 != null) {
                c55001xbhOLrzqt5.setSelection(iCopydefault2);
                return;
            }
            return;
        }
        C55001xbh c55001xbhOLrzqt6 = OLrzqt();
        if (c55001xbhOLrzqt6 != null) {
            c55001xbhOLrzqt6.setSelection(length);
        }
    }

    @Override // o.C55030xcJ.LoaderManager
    public void KWHzl() {
        this.copydefault = false;
        this.AEQbTJ.setTextValue("");
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) str, '.', 0, false, 6, (java.lang.Object) null);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, this.OLrzqt, false, 2, (java.lang.Object) null) || iLastIndexOf$default == -1) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        char c = this.OLrzqt;
        java.lang.String strSubstring2 = str.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return strSubstring + c + strSubstring2;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lQZ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
