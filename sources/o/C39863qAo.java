package o;

import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qAo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39863qAo {
    public static final C39863qAo EZpvd = new C39863qAo();

    public final boolean AEQbTJ(char c) {
        return c == '+' || c == '-' || c == 215 || c == 247;
    }

    public final boolean copydefault(char c) {
        return c == 'V' || c == 'C';
    }

    private C39863qAo() {
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (!EZpvd(str)) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.GCXiNH);
        }
        kotlin.Pair<java.lang.Boolean, java.util.List<MatchResult>> pairKWHzl = KWHzl(str, function2);
        boolean zBooleanValue = pairKWHzl.component1().booleanValue();
        java.util.List<MatchResult> listComponent2 = pairKWHzl.component2();
        if (zBooleanValue) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.GCXiNH);
        }
        kotlin.Pair<java.lang.Boolean, java.util.List<MatchResult>> pairOLrzqt = OLrzqt(str, function2);
        boolean zBooleanValue2 = pairOLrzqt.component1().booleanValue();
        java.util.List<MatchResult> listComponent22 = pairOLrzqt.component2();
        if (zBooleanValue2) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.Dfm);
        }
        if (listComponent2.size() + listComponent22.size() > 10) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.fAklCm);
        }
        if (!OLrzqt(str)) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.GCXiNH);
        }
        if (listComponent2.size() + listComponent22.size() < 2) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.gdLjtZ);
        }
        if (listComponent2.size() < 1) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.GCXiNH);
        }
        return null;
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(str) >= 10;
    }

    public final int copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((java.util.List) checkInvalidConstant$default(this, str, null, 2, null).getSecond()).size() + ((java.util.List) checkInvalidVariables$default(this, str, null, 2, null).getSecond()).size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qAo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Pair checkInvalidConstant$default(C39863qAo c39863qAo, java.lang.String str, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        return c39863qAo.OLrzqt(str, function2);
    }

    public final kotlin.Pair<java.lang.Boolean, java.util.List<MatchResult>> OLrzqt(java.lang.String str, Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        java.util.List listZuBGHE = C59467zhb.zuBGHE(Regex.findAll$default(new Regex("\\(-\\d+\\)"), str, 0, 2, null));
        if (!listZuBGHE.isEmpty()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, listZuBGHE);
        }
        java.util.List listZuBGHE2 = C59467zhb.zuBGHE(Regex.findAll$default(new Regex("\\{[^{}]*\\}|(\\d+(\\.\\d+)?)"), str, 0, 2, null));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listZuBGHE2) {
            if (((MatchResult) obj).OLrzqt().get(1).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = ((MatchResult) it.next()).OLrzqt().get(1);
            if (C33129mqd.AEQbTJ(str2, 1000000)) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
                if (function2 != null) {
                    function2.invoke(java.lang.Integer.valueOf(iIndexOf$default), java.lang.Integer.valueOf(iIndexOf$default + str2.length()));
                }
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, arrayList);
            }
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qAo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Pair checkInvalidVariables$default(C39863qAo c39863qAo, java.lang.String str, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        return c39863qAo.KWHzl(str, function2);
    }

    public final kotlin.Pair<java.lang.Boolean, java.util.List<MatchResult>> KWHzl(java.lang.String str, Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Regex regex = new Regex("\\{[^}]+\\}");
        java.util.List listZuBGHE = C59467zhb.zuBGHE(Regex.findAll$default(regex, str, 0, 2, null));
        for (java.lang.String str2 : regex.split(str, 0)) {
            if (new Regex("[a-zA-Z]+").containsMatchIn(str2)) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
                if (yDY.gEmmrt('+', '-', 215, 247).contains(java.lang.Character.valueOf(str.charAt(iIndexOf$default)))) {
                    iIndexOf$default++;
                }
                int i = iIndexOf$default;
                while (i < str.length() && !yDY.gEmmrt('+', '-', (char) 215, (char) 247, " ").contains(java.lang.Character.valueOf(str.charAt(i)))) {
                    i++;
                }
                if (function2 != null) {
                    function2.invoke(java.lang.Integer.valueOf(iIndexOf$default), java.lang.Integer.valueOf(i));
                }
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, listZuBGHE);
            }
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, listZuBGHE);
    }

    public final boolean EZpvd(java.lang.String str) {
        Stack stack = new Stack();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '(') {
                stack.push(java.lang.Integer.valueOf(i));
            } else if (cCharAt != ')') {
                continue;
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                java.lang.String strSubstring = str.substring(((java.lang.Integer) stack.pop()).intValue() + 1, i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                if (StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strSubstring).toString().length() == 0) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public final boolean OLrzqt(java.lang.String str) {
        java.lang.String strReplace$default = C59449zhJ.replace$default(new Regex("\\d+(\\.\\d+)?").replace(new Regex("\\{[^}]+\\}").replace(str, C33129mqd.gEmmrt('V')), C33129mqd.gEmmrt('C')), " ", "", false, 4, (java.lang.Object) null);
        int length = strReplace$default.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strReplace$default.charAt(i);
            if (AEQbTJ(cCharAt)) {
                if (i != 0 && i != strReplace$default.length() - 1) {
                    char cCharAt2 = strReplace$default.charAt(i - 1);
                    char cCharAt3 = strReplace$default.charAt(i + 1);
                    if (!OLrzqt(cCharAt2) || !OLrzqt(cCharAt3)) {
                    }
                }
                return false;
            }
            if (copydefault(cCharAt) && i > 0 && copydefault(strReplace$default.charAt(i - 1))) {
                return false;
            }
        }
        return true;
    }

    public final boolean OLrzqt(char c) {
        return copydefault(c) || c == '(' || c == ')';
    }
}
