package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59442zhC extends C59440zhA {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String fetchVPNInfo(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    public static /* synthetic */ java.lang.String trimMargin$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        }
        return djBIcL(str, str2);
    }

    public static final java.lang.String djBIcL(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return copydefault(str, "", str2);
    }

    public static /* synthetic */ java.lang.String replaceIndentByMargin$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        }
        return copydefault(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        int i;
        java.lang.String strInvoke;
        int i2;
        java.lang.String str4;
        java.lang.String strSubstring;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3))) {
            throw new java.lang.IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        java.util.List listUzCIH = StringsKt__StringsKt.uzCIH((java.lang.CharSequence) str);
        int length = str.length();
        int length2 = str2.length();
        int size = listUzCIH.size();
        Function1<java.lang.String, java.lang.String> function1AkhnZx = AkhnZx(str2);
        int iAuCTel = yDY.AuCTel(listUzCIH);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 0;
        for (java.lang.Object obj : listUzCIH) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str5 = (java.lang.String) obj;
            if ((i3 == 0 || i3 == iAuCTel) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str5)) {
                i = i3;
                strInvoke = null;
            } else {
                int length3 = str5.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length3) {
                        i2 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.EZpvd(str5.charAt(i4))) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                }
                if (i2 == -1) {
                    str4 = str5;
                    i = i3;
                } else {
                    int i5 = i2;
                    str4 = str5;
                    i = i3;
                    if (C59449zhJ.startsWith$default(str5, str3, i2, false, 4, null)) {
                        int length4 = str3.length();
                        Intrinsics.copydefault(str4, "");
                        strSubstring = str4.substring(i5 + length4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    }
                    if (strSubstring != null || (strInvoke = function1AkhnZx.invoke(strSubstring)) == null) {
                        strInvoke = str4;
                    }
                }
                strSubstring = null;
                if (strSubstring != null) {
                    strInvoke = str4;
                }
            }
            if (strInvoke != null) {
                arrayList.add(strInvoke);
            }
            i3 = i + 1;
        }
        return ((java.lang.StringBuilder) CollectionsKt___CollectionsKt.joinTo$default(arrayList, new java.lang.StringBuilder(length + (length2 * size)), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static java.lang.String fJNWhG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return gEmmrt(str, "");
    }

    public static /* synthetic */ java.lang.String replaceIndent$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return gEmmrt(str, str2);
    }

    public static final java.lang.String gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String strInvoke;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.List listUzCIH = StringsKt__StringsKt.uzCIH((java.lang.CharSequence) str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listUzCIH) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(values((java.lang.String) it.next())));
        }
        java.lang.Integer num = (java.lang.Integer) CollectionsKt___CollectionsKt.fFgQHt(arrayList2);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length();
        int length2 = str2.length();
        int size = listUzCIH.size();
        Function1<java.lang.String, java.lang.String> function1AkhnZx = AkhnZx(str2);
        int iAuCTel = yDY.AuCTel(listUzCIH);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listUzCIH) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str3 = (java.lang.String) obj2;
            if ((i == 0 || i == iAuCTel) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
                str3 = null;
            } else {
                java.lang.String strFetchVPNInfo = C59454zhO.fetchVPNInfo(str3, iIntValue);
                if (strFetchVPNInfo != null && (strInvoke = function1AkhnZx.invoke(strFetchVPNInfo)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i++;
        }
        return ((java.lang.StringBuilder) CollectionsKt___CollectionsKt.joinTo$default(arrayList3, new java.lang.StringBuilder(length + (length2 * size)), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static /* synthetic */ java.lang.String prependIndent$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return KWHzl(str, str2);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C59467zhb.joinToString$default(C59467zhb.fetchVPNInfo(StringsKt__StringsKt.AuCTel((java.lang.CharSequence) str), new Function1() { // from class: o.zhy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59442zhC.AEQbTJ(str2, (java.lang.String) obj);
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return str2.length() < str.length() ? str : str2;
        }
        return str + str2;
    }

    public static final Function1<java.lang.String, java.lang.String> AkhnZx(final java.lang.String str) {
        return str.length() == 0 ? new Function1() { // from class: o.zhB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59442zhC.fetchVPNInfo((java.lang.String) obj);
            }
        } : new Function1() { // from class: o.zhz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59442zhC.EZpvd(str, (java.lang.String) obj);
            }
        };
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return str + str2;
    }

    public static final int values(java.lang.String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!CharsKt__CharJVMKt.EZpvd(str.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }
}
