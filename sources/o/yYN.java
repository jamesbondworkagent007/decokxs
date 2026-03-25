package o;

import QfgSZK.AEQbTJ;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yYN {
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Collection<? extends H> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> java.util.Collection<H> EZpvd(@NotNull java.util.Collection<? extends H> collection, @NotNull Function1<? super H, ? extends InterfaceC56657yNm> function1) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C59388zgB c59388zgBOLrzqt = C59388zgB.AEQbTJ.OLrzqt();
        while (!linkedList.isEmpty()) {
            java.lang.Object objAuCTelauCTel = CollectionsKt___CollectionsKt.AuCTelauCTel(linkedList);
            C59388zgB c59388zgBOLrzqt2 = C59388zgB.AEQbTJ.OLrzqt();
            java.util.Collection<AEQbTJ> collectionEZpvd = OverridingUtil.EZpvd(objAuCTelauCTel, linkedList, function1, new yYM(c59388zgBOLrzqt2));
            Intrinsics.checkNotNullExpressionValue(collectionEZpvd, "");
            if (collectionEZpvd.size() == 1 && c59388zgBOLrzqt2.isEmpty()) {
                java.lang.Object objHUfVAv = CollectionsKt___CollectionsKt.hUfVAv(collectionEZpvd);
                Intrinsics.checkNotNullExpressionValue(objHUfVAv, "");
                c59388zgBOLrzqt.add(objHUfVAv);
            } else {
                AEQbTJ aEQbTJ = (java.lang.Object) OverridingUtil.EZpvd(collectionEZpvd, function1);
                InterfaceC56657yNm interfaceC56657yNmInvoke = function1.invoke(aEQbTJ);
                for (AEQbTJ aEQbTJ2 : collectionEZpvd) {
                    Intrinsics.copydefault(aEQbTJ2);
                    if (!OverridingUtil.copydefault(interfaceC56657yNmInvoke, function1.invoke(aEQbTJ2))) {
                        c59388zgBOLrzqt2.add(aEQbTJ2);
                    }
                }
                if (!c59388zgBOLrzqt2.isEmpty()) {
                    c59388zgBOLrzqt.addAll(c59388zgBOLrzqt2);
                }
                c59388zgBOLrzqt.add(aEQbTJ);
            }
        }
        return c59388zgBOLrzqt;
    }

    public static final Unit copydefault(C59388zgB c59388zgB, java.lang.Object obj) {
        Intrinsics.copydefault(obj);
        c59388zgB.add(obj);
        return Unit.INSTANCE;
    }
}
