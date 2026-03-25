package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQX extends AbstractC56753yRa<yOJ> {
    @Override // o.AbstractC56753yRa
    public boolean KWHzl() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yQX(@NotNull C56778yRz c56778yRz) {
        super(c56778yRz);
        Intrinsics.checkNotNullParameter(c56778yRz, "");
    }

    /* JADX DEBUG: Method merged with bridge method: valueOf(Ljava/lang/Object;)Ljava/lang/Iterable; */
    @Override // o.AbstractC56753yRa
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.Iterable<yOJ> valueOf(@NotNull yOJ yoj) {
        yOL yolCopydefault;
        Intrinsics.checkNotNullParameter(yoj, "");
        InterfaceC56658yNn interfaceC56658yNnOLrzqt = yZE.OLrzqt(yoj);
        return (interfaceC56658yNnOLrzqt == null || (yolCopydefault = interfaceC56658yNnOLrzqt.copydefault()) == null) ? yDY.AhwBna() : yolCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC56753yRa
    public java.lang.Object AEQbTJ(@NotNull yOJ yoj) {
        Intrinsics.checkNotNullParameter(yoj, "");
        InterfaceC56658yNn interfaceC56658yNnOLrzqt = yZE.OLrzqt(yoj);
        Intrinsics.copydefault(interfaceC56658yNnOLrzqt);
        return interfaceC56658yNnOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Lo/yXs; */
    @Override // o.AbstractC56753yRa
    public C56933yXs OLrzqt(@NotNull yOJ yoj) {
        Intrinsics.checkNotNullParameter(yoj, "");
        return yoj.KWHzl();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Z)Ljava/lang/Iterable; */
    @Override // o.AbstractC56753yRa
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Iterable<java.lang.String> KWHzl(@NotNull yOJ yoj, boolean z) {
        java.util.List<java.lang.String> listKWHzl;
        Intrinsics.checkNotNullParameter(yoj, "");
        java.util.Map<C56935yXu, AbstractC56975yZg<?>> mapOLrzqt = yoj.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Map.Entry<C56935yXu, AbstractC56975yZg<?>> entry : mapOLrzqt.entrySet()) {
            C56935yXu key = entry.getKey();
            AbstractC56975yZg<?> value = entry.getValue();
            if (!z || Intrinsics.EZpvd(key, yRE.OLrzqt)) {
                listKWHzl = KWHzl(value);
            } else {
                listKWHzl = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList, listKWHzl);
        }
        return arrayList;
    }

    public final java.util.List<java.lang.String> KWHzl(AbstractC56975yZg<?> abstractC56975yZg) {
        if (!(abstractC56975yZg instanceof C56971yZc)) {
            return abstractC56975yZg instanceof C56981yZm ? C56402yEa.EZpvd(((C56981yZm) abstractC56975yZg).AEQbTJ().copydefault()) : yDY.AhwBna();
        }
        java.util.List<? extends AbstractC56975yZg<?>> listKWHzl = ((C56971yZc) abstractC56975yZg).KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, KWHzl((AbstractC56975yZg<?>) it.next()));
        }
        return arrayList;
    }
}
