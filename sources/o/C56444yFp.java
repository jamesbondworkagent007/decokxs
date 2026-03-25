package o;

import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56444yFp {
    public static final <E extends java.lang.Enum<E>> InterfaceC56445yFq<E> AEQbTJ(@NotNull E[] eArr) {
        Intrinsics.checkNotNullParameter(eArr, "");
        return new EnumEntriesList(eArr);
    }
}
