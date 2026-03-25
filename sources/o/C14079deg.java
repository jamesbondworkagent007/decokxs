package o;

import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.ton.TonAddress;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.deg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14079deg {
    public static final C14079deg EZpvd = new C14079deg();

    private C14079deg() {
    }

    public static /* synthetic */ java.lang.String getAddressStr$default(C14079deg c14079deg, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c14079deg.AEQbTJ(str, z);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, boolean z) {
        if ((!z || (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-") && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--"))) && str != null) {
            if (str.length() <= 10) {
                return str;
            }
            java.lang.CharSequence charSequenceSubSequence = str.subSequence(0, 6);
            Intrinsics.copydefault(charSequenceSubSequence, "");
            java.lang.CharSequence charSequenceSubSequence2 = str.subSequence(str.length() - 4, str.length());
            Intrinsics.copydefault(charSequenceSubSequence2, "");
            return ((java.lang.String) charSequenceSubSequence) + "..." + ((java.lang.String) charSequenceSubSequence2);
        }
        return "";
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 20) {
            return str;
        }
        java.lang.CharSequence charSequenceSubSequence = str.subSequence(0, 10);
        Intrinsics.copydefault(charSequenceSubSequence, "");
        java.lang.CharSequence charSequenceSubSequence2 = str.subSequence(str.length() - 10, str.length());
        Intrinsics.copydefault(charSequenceSubSequence2, "");
        return ((java.lang.String) charSequenceSubSequence) + "..." + ((java.lang.String) charSequenceSubSequence2);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return "ID:" + str;
    }

    public final java.lang.String AEQbTJ(InterfaceC9731bbC interfaceC9731bbC) {
        int i;
        if (interfaceC9731bbC == null) {
            return "";
        }
        java.lang.String strOLrzqt = interfaceC9731bbC.OLrzqt();
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) strOLrzqt, "-", 0, false, 6, (java.lang.Object) null);
        if (iLastIndexOf$default == -1 || (i = iLastIndexOf$default + 1) >= strOLrzqt.length()) {
            return "";
        }
        java.lang.String strSubstring = strOLrzqt.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final java.lang.String copydefault(InterfaceC9731bbC interfaceC9731bbC) {
        return interfaceC9731bbC == null ? "" : interfaceC9731bbC.values();
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) Marker.ANY_NON_NULL_MARKER, false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "/", false, 2, (java.lang.Object) null)) {
            return false;
        }
        return C59449zhJ.startsWith$default(str, "U", false, 2, null) || C59449zhJ.startsWith$default(str, "E", false, 2, null);
    }

    public final java.util.List<C9756bbb> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return yDY.AhwBna();
        }
        java.util.List<TonAddress> listKWHzl = C54901xZn.OLrzqt.KWHzl(new SignParams(607L, 607L, null, null, null, null, 0, null, true, false, null, 1788, null), str);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (TonAddress tonAddress : listKWHzl) {
            arrayList.add(new C9756bbb(tonAddress.getType(), tonAddress.getAddr()));
        }
        return arrayList;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, int i) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = OLrzqt(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C9756bbb) next).EZpvd() == i) {
                break;
            }
        }
        C9756bbb c9756bbb = (C9756bbb) next;
        if (c9756bbb != null) {
            return c9756bbb.OLrzqt();
        }
        return null;
    }

    public final java.lang.CharSequence copydefault(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0 || C33129mqd.valueOf(java.lang.Integer.valueOf(str.length()), 10)) {
            return str == null ? "" : str;
        }
        java.lang.String strSubstring = str.substring(6, C33129mqd.AhwBna(C54862xYb.AEQbTJ(java.lang.Integer.valueOf(str.length()), 4)));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.dej
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14079deg.EZpvd((java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{strSubstring}, 0, null, false, new Function1() { // from class: o.def
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14079deg.OLrzqt((java.util.List) obj);
            }
        }, 14, null);
        if (str2 == null || str2.length() == 0 || str2.length() <= 6) {
            return charSequence;
        }
        java.lang.String strSubstring2 = str2.substring(6, java.lang.Math.min(C33129mqd.AhwBna(C54862xYb.AEQbTJ(java.lang.Integer.valueOf(str2.length()), 4)), str2.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        int iMin = java.lang.Math.min(strSubstring.length(), strSubstring2.length());
        java.lang.CharSequence charSequence2 = charSequence;
        for (int i = 0; i < iMin; i++) {
            if (strSubstring.charAt(i) != strSubstring2.charAt(i)) {
                java.lang.String strSubstring3 = str.substring(i + 6, i + 7);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                charSequence2 = C33061mpO.setupSpanStyles$default(charSequence2, new java.lang.String[]{strSubstring3}, 0, null, false, new Function1() { // from class: o.den
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14079deg.AYXKKw((java.util.List) obj);
                    }
                }, 14, null);
            }
        }
        return charSequence2;
    }

    public static final Unit EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN)));
        return Unit.INSTANCE;
    }
}
