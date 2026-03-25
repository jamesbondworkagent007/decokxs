package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ubk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48760ubk {
    public static final android.os.Bundle copydefault(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            arrayList.add(C56390yDp.OLrzqt(entry.getKey(), entry.getValue()));
        }
        return C33048mpB.EZpvd((kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]));
    }
}
