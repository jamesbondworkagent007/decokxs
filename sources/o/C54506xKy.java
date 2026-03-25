package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xKy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54506xKy<I> implements InterfaceC54501xKt<java.util.List<? extends I>, I> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public I KWHzl(@NotNull java.util.List<? extends I> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return (I) CollectionsKt___CollectionsKt.firstOrNull(list);
    }
}
