package o;

import com.okinc.okimcore.model.im.inhouseim.UserTagType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sIM {
    public final java.util.List<UserTagType> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
        java.util.Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(UserTagType.valueOf((java.lang.String) it.next()));
        }
        return arrayList;
    }

    public final java.lang.String OLrzqt(java.util.List<? extends UserTagType> list) {
        if (list == null) {
            list = yDY.AhwBna();
        }
        return CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: o.sIN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sIM.EZpvd((UserTagType) obj);
            }
        }, 30, null);
    }

    public static final java.lang.CharSequence EZpvd(UserTagType userTagType) {
        Intrinsics.checkNotNullParameter(userTagType, "");
        return userTagType.name();
    }
}
