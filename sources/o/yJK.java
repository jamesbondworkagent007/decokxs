package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJK {
    public static final <T> InterfaceC56555yJs<T> OLrzqt(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo) {
        T next;
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.util.Iterator<T> it = ((C56586yKw) interfaceC56551yJo).AhwBna().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC56555yJs interfaceC56555yJs = (InterfaceC56555yJs) next;
            Intrinsics.copydefault(interfaceC56555yJs, "");
            yNG yngValues = ((yKT) interfaceC56555yJs).values();
            Intrinsics.copydefault(yngValues, "");
            if (((InterfaceC56660yNp) yngValues).getFieldNames()) {
                break;
            }
        }
        return (InterfaceC56555yJs) next;
    }

    public static final <T> java.util.Collection<InterfaceC56560yJx<T, ?>> AEQbTJ(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.util.Collection<AbstractC56573yKj<?>> collectionCopydefault = ((C56586yKw) interfaceC56551yJo).AEQbTJ().getValue().copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : collectionCopydefault) {
            AbstractC56573yKj abstractC56573yKj = (AbstractC56573yKj) t;
            if (EZpvd((AbstractC56573yKj<?>) abstractC56573yKj) && (abstractC56573yKj instanceof InterfaceC56560yJx)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final boolean OLrzqt(AbstractC56573yKj<?> abstractC56573yKj) {
        return abstractC56573yKj.values().djBIcL() != null;
    }

    public static final boolean EZpvd(AbstractC56573yKj<?> abstractC56573yKj) {
        return !OLrzqt(abstractC56573yKj);
    }

    public static final java.util.List<InterfaceC56551yJo<?>> EZpvd(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.util.List<InterfaceC56559yJw> listIsConnected = interfaceC56551yJo.isConnected();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listIsConnected.iterator();
        while (it.hasNext()) {
            InterfaceC56553yJq classifier = ((InterfaceC56559yJw) it.next()).getClassifier();
            InterfaceC56551yJo interfaceC56551yJo2 = classifier instanceof InterfaceC56551yJo ? (InterfaceC56551yJo) classifier : null;
            if (interfaceC56551yJo2 != null) {
                arrayList.add(interfaceC56551yJo2);
            }
        }
        return arrayList;
    }
}
