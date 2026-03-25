package o;

import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
public final class sNV {
    public static /* synthetic */ java.lang.String resolveLanguageName$default(boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return copydefault(z, str, str2);
    }

    public static final java.lang.String copydefault(boolean z, java.lang.String str, java.lang.String str2) {
        return z ? str : C44170sFx.copydefault(str2, str);
    }

    public static final java.util.List<java.lang.String> copydefault(java.util.List<SystemMessageData.UserInfo> list) {
        java.lang.String strCopydefault;
        RelationInfo relationInfoKWHzl;
        java.util.ArrayList arrayList = null;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (SystemMessageData.UserInfo userInfo : list) {
                java.lang.String strKWHzl = userInfo.KWHzl();
                java.lang.String displayName$default = (strKWHzl == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(strKWHzl)) == null) ? null : C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null);
                if (displayName$default == null || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) displayName$default))) {
                    java.util.Locale locale = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    if (!C38303pTu.KWHzl(locale) && (strCopydefault = userInfo.copydefault()) != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault))) {
                        displayName$default = userInfo.copydefault();
                    } else {
                        java.lang.String strEZpvd = userInfo.EZpvd();
                        displayName$default = (strEZpvd == null || !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd) ^ true)) ? "-" : userInfo.EZpvd();
                    }
                }
                arrayList2.add(displayName$default);
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }
}
