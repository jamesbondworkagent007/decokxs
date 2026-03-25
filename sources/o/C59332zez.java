package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59332zez {
    public static final AbstractC59331zey copydefault(@NotNull java.util.Collection<? extends AbstractC59331zey> collection) {
        AbstractC59242zdO abstractC59242zdOValueOf;
        Intrinsics.checkNotNullParameter(collection, "");
        int size = collection.size();
        if (size == 0) {
            throw new java.lang.IllegalStateException("Expected some types".toString());
        }
        if (size == 1) {
            return (AbstractC59331zey) CollectionsKt___CollectionsKt.hUfVAv(collection);
        }
        java.util.Collection<? extends AbstractC59331zey> collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection2, 10));
        boolean z = false;
        boolean z2 = false;
        for (AbstractC59331zey abstractC59331zey : collection2) {
            z = z || C59238zdK.AEQbTJ(abstractC59331zey);
            if (abstractC59331zey instanceof AbstractC59242zdO) {
                abstractC59242zdOValueOf = (AbstractC59242zdO) abstractC59331zey;
            } else {
                if (!(abstractC59331zey instanceof AbstractC59272zds)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (C59275zdv.OLrzqt(abstractC59331zey)) {
                    return abstractC59331zey;
                }
                abstractC59242zdOValueOf = ((AbstractC59272zds) abstractC59331zey).valueOf();
                z2 = true;
            }
            arrayList.add(abstractC59242zdOValueOf);
        }
        if (z) {
            return C59370zfk.EZpvd(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, collection.toString());
        }
        if (!z2) {
            return TypeIntersector.OLrzqt.copydefault(arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(collection2, 10));
        java.util.Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList2.add(C59278zdy.OLrzqt((AbstractC59331zey) it.next()));
        }
        TypeIntersector typeIntersector = TypeIntersector.OLrzqt;
        return C59231zdD.copydefault(typeIntersector.copydefault(arrayList), typeIntersector.copydefault(arrayList2));
    }
}
