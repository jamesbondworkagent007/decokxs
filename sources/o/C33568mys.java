package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33568mys {
    public static final C33568mys AEQbTJ = new C33568mys();

    private C33568mys() {
    }

    public final kotlin.Pair<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> KWHzl(@NotNull java.lang.String str) {
        java.util.List listSplit$default;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default2, 0);
        if (str2 != null) {
            str = str2;
        }
        java.lang.String str3 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default2, 1);
        if (str3 != null && (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str3, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null)) != null) {
            java.util.Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                java.util.List listSplit$default3 = StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (java.lang.Object) null);
                java.lang.String str4 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default3, 0);
                if (str4 != null) {
                    java.lang.String str5 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default3, 1);
                    if (str5 == null) {
                        str5 = "";
                    }
                    linkedHashMap.put(str4, str5);
                }
            }
        }
        return new kotlin.Pair<>(str, linkedHashMap);
    }
}
