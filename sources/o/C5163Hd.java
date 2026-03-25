package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5163Hd {
    public int OLrzqt;
    public final java.lang.String copydefault;

    public C5163Hd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (OLrzqt(str)) {
            function0.invoke();
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (OLrzqt(str)) {
            this.OLrzqt += str.length();
            function0.invoke();
        }
    }

    public final void OLrzqt(@NotNull java.lang.String[] strArr, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        kotlin.Pair<java.lang.String, java.lang.Integer> pairOLrzqt = OLrzqt(strArr);
        if (pairOLrzqt != null) {
            EZpvd(pairOLrzqt.component1(), pairOLrzqt.component2().intValue(), function1);
        }
    }

    public final void OLrzqt(int i, Function1<? super java.lang.String, Unit> function1) {
        java.lang.String strSubstring = this.copydefault.substring(this.OLrzqt, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        this.OLrzqt = i;
        function1.invoke(strSubstring);
    }

    public final void EZpvd(java.lang.String str, int i, Function1<? super java.lang.String, Unit> function1) {
        OLrzqt(i, function1);
        this.OLrzqt += str.length();
    }

    public final void AEQbTJ(@NotNull java.lang.String[] strArr, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        kotlin.Pair<java.lang.String, java.lang.Integer> pairOLrzqt = OLrzqt(strArr);
        if (pairOLrzqt == null) {
            throw new java.lang.IllegalArgumentException(("Cannot find any of " + yDV.AwvSrB(strArr)).toString());
        }
        EZpvd(pairOLrzqt.component1(), pairOLrzqt.component2().intValue(), function1);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Scanner(remainingText='");
        java.lang.String strSubstring = this.copydefault.substring(this.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(strSubstring);
        sb.append("')");
        return sb.toString();
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.regionMatches$default(this.copydefault, this.OLrzqt, str, 0, str.length(), false, 16, (java.lang.Object) null);
    }

    public final void copydefault(@NotNull java.lang.String[] strArr, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        kotlin.Pair<java.lang.String, java.lang.Integer> pairOLrzqt = OLrzqt(strArr);
        OLrzqt(pairOLrzqt != null ? pairOLrzqt.getSecond().intValue() : this.copydefault.length(), function1);
    }

    public final kotlin.Pair<java.lang.String, java.lang.Integer> OLrzqt(java.lang.String[] strArr) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(C56390yDp.OLrzqt(str, java.lang.Integer.valueOf(StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) this.copydefault, str, this.OLrzqt, false, 4, (java.lang.Object) null))));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((java.lang.Number) ((kotlin.Pair) obj2).component2()).intValue() != -1) {
                arrayList2.add(obj2);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((java.lang.Number) ((kotlin.Pair) next).component2()).intValue();
                do {
                    java.lang.Object next2 = it.next();
                    int iIntValue2 = ((java.lang.Number) ((kotlin.Pair) next2).component2()).intValue();
                    if (iIntValue > iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (kotlin.Pair) obj;
    }
}
