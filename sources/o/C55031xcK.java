package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55030xcJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55031xcK implements C55030xcJ.LoaderManager {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Function1<? super java.lang.Integer, Unit> AEQbTJ;
    public java.lang.String AYXKKw;
    public int AhwBna;
    public java.lang.String AkhnZx;
    public int EZpvd;
    public int KWHzl;
    public Function1<? super java.lang.String, Unit> OLrzqt;
    public int djBIcL;
    public int fetchVPNInfo;
    public java.util.Locale gEmmrt;
    public int isConnected;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Locale EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super java.lang.Integer, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        this.gEmmrt = locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.fetchVPNInfo;
    }

    public C55031xcK(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
        this.isConnected = Integer.MAX_VALUE;
        this.AhwBna = Integer.MAX_VALUE;
        this.fetchVPNInfo = Integer.MAX_VALUE;
        this.AkhnZx = "";
        this.AYXKKw = "";
        this.djBIcL = 1;
        this.KWHzl = 3;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        this.gEmmrt = locale;
    }

    /* JADX INFO: renamed from: o.xcK$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xcK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void EZpvd(int i) {
        this.isConnected = i;
        djBIcL();
    }

    public final void KWHzl(int i) {
        this.AhwBna = i;
        djBIcL();
    }

    private final void djBIcL() {
        int i;
        int i2;
        if (this.fetchVPNInfo != Integer.MAX_VALUE || (i = this.isConnected) == Integer.MAX_VALUE || (i2 = this.AhwBna) == Integer.MAX_VALUE) {
            return;
        }
        this.fetchVPNInfo = C56548yJl.copydefault(i - i2, 1);
    }

    @Override // o.C55030xcJ.LoaderManager
    public void AEQbTJ(char c) {
        this.KWHzl = 1;
        boolean z = this.valueOf;
        if (z && this.EZpvd >= this.AhwBna) {
            Function1<? super java.lang.Integer, Unit> function1 = this.AEQbTJ;
            if (function1 != null) {
                function1.invoke(0);
                return;
            }
            return;
        }
        if (c == '.') {
            if (z || this.AhwBna == 0) {
                Function1<? super java.lang.Integer, Unit> function12 = this.AEQbTJ;
                if (function12 != null) {
                    function12.invoke(1);
                    return;
                }
                return;
            }
            this.valueOf = true;
            this.AkhnZx = this.AkhnZx + c;
            java.lang.String str = this.AYXKKw + C38303pTu.EZpvd(EZpvd());
            this.AYXKKw = str;
            this.OLrzqt.invoke(str);
            return;
        }
        if (z) {
            this.AkhnZx = this.AkhnZx + c;
            java.lang.String str2 = this.AYXKKw + pTB.KWHzl(java.lang.String.valueOf(c), EZpvd());
            this.AYXKKw = str2;
            this.djBIcL++;
            this.EZpvd++;
            this.OLrzqt.invoke(str2);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) "0")) {
            if (c == '0') {
                Function1<? super java.lang.Integer, Unit> function13 = this.AEQbTJ;
                if (function13 != null) {
                    function13.invoke(2);
                    return;
                }
                return;
            }
            java.lang.String strKWHzl = pTB.KWHzl(java.lang.String.valueOf(c), EZpvd());
            this.AkhnZx = strKWHzl;
            this.AYXKKw = strKWHzl;
            this.OLrzqt.invoke(strKWHzl);
            return;
        }
        if (this.djBIcL - this.EZpvd >= this.fetchVPNInfo) {
            Function1<? super java.lang.Integer, Unit> function14 = this.AEQbTJ;
            if (function14 != null) {
                function14.invoke(3);
                return;
            }
            return;
        }
        java.lang.String str3 = this.AkhnZx + c;
        this.AkhnZx = str3;
        java.lang.String strKWHzl2 = pTB.KWHzl(str3, EZpvd());
        this.AYXKKw = strKWHzl2;
        this.djBIcL++;
        this.OLrzqt.invoke(strKWHzl2);
    }

    @Override // o.C55030xcJ.LoaderManager
    public void AEQbTJ() {
        this.KWHzl = 2;
        if (this.AkhnZx.length() == 0) {
            return;
        }
        if (this.valueOf) {
            if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) this.AkhnZx, '.', false, 2, (java.lang.Object) null)) {
                this.valueOf = false;
            } else {
                this.djBIcL--;
                this.EZpvd--;
            }
            this.AkhnZx = C59454zhO.DbNXlk(this.AkhnZx, 1);
            java.lang.String strDbNXlk = C59454zhO.DbNXlk(this.AYXKKw, 1);
            this.AYXKKw = strDbNXlk;
            this.OLrzqt.invoke(strDbNXlk);
            return;
        }
        java.lang.String strDbNXlk2 = C59454zhO.DbNXlk(this.AkhnZx, 1);
        this.AkhnZx = strDbNXlk2;
        java.lang.String strKWHzl = pTB.KWHzl(strDbNXlk2, EZpvd());
        this.AYXKKw = strKWHzl;
        this.djBIcL--;
        this.OLrzqt.invoke(strKWHzl);
    }

    @Override // o.C55030xcJ.LoaderManager
    public void KWHzl() {
        KWHzl("0");
        this.KWHzl = 3;
        this.OLrzqt.invoke(this.AkhnZx);
    }

    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str.length();
        this.AkhnZx = str;
        this.valueOf = StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, '.', false, 2, (java.lang.Object) null);
        int length = StringsKt__StringsKt.substringBefore$default(str, '.', (java.lang.String) null, 2, (java.lang.Object) null).length();
        int length2 = StringsKt__StringsKt.OLrzqt(str, '.', "").length();
        this.EZpvd = length2;
        int i = this.AhwBna;
        if (length2 > i) {
            java.lang.String strSubstring = str.substring(0, this.djBIcL - (length2 - i));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            this.AkhnZx = strSubstring;
            this.EZpvd = this.AhwBna;
        }
        while (this.valueOf && C59454zhO.zsXlph(this.AkhnZx) == '0') {
            java.lang.String strSubstring2 = this.AkhnZx.substring(0, this.AkhnZx.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            this.AkhnZx = strSubstring2;
            this.EZpvd--;
        }
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) this.AkhnZx, '.', false, 2, (java.lang.Object) null)) {
            java.lang.String strSubstring3 = this.AkhnZx.substring(0, this.AkhnZx.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            this.AkhnZx = strSubstring3;
            this.EZpvd--;
            this.valueOf = false;
        }
        int i2 = this.fetchVPNInfo;
        if (length >= i2) {
            java.lang.String strSubstring4 = this.AkhnZx.substring(length - i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
            if (strSubstring4.length() > 0) {
                char cCharAt = strSubstring4.charAt(0);
                if (cCharAt == '0') {
                    cCharAt = '1';
                }
                java.lang.String strSubstring5 = strSubstring4.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
                strSubstring4 = cCharAt + strSubstring5;
            }
            this.AkhnZx = strSubstring4;
            length = this.fetchVPNInfo;
        }
        this.djBIcL = length + this.EZpvd;
        java.lang.String strKWHzl = pTB.KWHzl(this.AkhnZx, EZpvd());
        this.AYXKKw = strKWHzl;
        this.KWHzl = 0;
        this.OLrzqt.invoke(strKWHzl);
    }
}
