package o;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C60053zuc;
import o.C60060zuj;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: renamed from: o.zuf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60056zuf {
    public final java.util.Map<java.lang.String, AbstractC59982ztK<?>> AEQbTJ;
    public final C60022zty KWHzl;
    public final java.util.HashMap<java.lang.Integer, C59990ztS<?>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, AbstractC59982ztK<?>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60022zty KWHzl() {
        return this.KWHzl;
    }

    public C60056zuf(@NotNull C60022zty c60022zty) {
        Intrinsics.checkNotNullParameter(c60022zty, "");
        this.KWHzl = c60022zty;
        this.AEQbTJ = C60071zuu.OLrzqt.copydefault();
        this.OLrzqt = new java.util.HashMap<>();
    }

    public final void OLrzqt(@NotNull java.util.Set<C59991ztT> set, boolean z) {
        Intrinsics.checkNotNullParameter(set, "");
        for (C59991ztT c59991ztT : set) {
            AEQbTJ(c59991ztT, z);
            AEQbTJ(c59991ztT);
        }
    }

    public final void AEQbTJ(C59991ztT c59991ztT) {
        for (C59990ztS<?> c59990ztS : c59991ztT.KWHzl()) {
            this.OLrzqt.put(java.lang.Integer.valueOf(c59990ztS.hashCode()), c59990ztS);
        }
    }

    public final void OLrzqt() {
        java.util.Collection<C59990ztS<?>> collectionValues = this.OLrzqt.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        C59990ztS[] c59990ztSArr = (C59990ztS[]) collectionValues.toArray(new C59990ztS[0]);
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(java.util.Arrays.copyOf(c59990ztSArr, c59990ztSArr.length));
        this.OLrzqt.clear();
        copydefault(arrayListCopydefault);
    }

    public final void AEQbTJ(C59991ztT c59991ztT, boolean z) {
        for (Map.Entry<java.lang.String, AbstractC59982ztK<?>> entry : c59991ztT.copydefault().entrySet()) {
            saveMapping$default(this, z, entry.getKey(), entry.getValue(), false, 8, null);
        }
    }

    public static /* synthetic */ void saveMapping$default(C60056zuf c60056zuf, boolean z, java.lang.String str, AbstractC59982ztK abstractC59982ztK, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        c60056zuf.KWHzl(z, str, abstractC59982ztK, z2);
    }

    public final void KWHzl(boolean z, @NotNull java.lang.String str, @NotNull AbstractC59982ztK<?> abstractC59982ztK, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC59982ztK, "");
        if (this.AEQbTJ.containsKey(str)) {
            if (!z) {
                C59995ztX.AEQbTJ(abstractC59982ztK, str);
            } else if (z2) {
                this.KWHzl.KWHzl().OLrzqt("(+) override index '" + str + "' -> '" + abstractC59982ztK.OLrzqt() + '\'');
            }
        }
        this.KWHzl.KWHzl().EZpvd("(+) index '" + str + "' -> '" + abstractC59982ztK.OLrzqt() + '\'');
        this.AEQbTJ.put(str, abstractC59982ztK);
    }

    public final void copydefault(java.util.Collection<? extends C59990ztS<?>> collection) {
        C59985ztN c59985ztN = new C59985ztN(this.KWHzl.KWHzl(), this.KWHzl.EZpvd().OLrzqt(), null, 4, null);
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((C59990ztS) it.next()).AEQbTJ(c59985ztN);
        }
    }

    public final AbstractC59982ztK<?> EZpvd(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ, @NotNull InterfaceC59997ztZ interfaceC59997ztZ2) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ2, "");
        return this.AEQbTJ.get(C59977ztF.EZpvd(interfaceC56551yJo, interfaceC59997ztZ, interfaceC59997ztZ2));
    }

    public final <T> T OLrzqt(InterfaceC59997ztZ interfaceC59997ztZ, @NotNull InterfaceC56551yJo<?> interfaceC56551yJo, @NotNull InterfaceC59997ztZ interfaceC59997ztZ2, @NotNull C59985ztN c59985ztN) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ2, "");
        Intrinsics.checkNotNullParameter(c59985ztN, "");
        AbstractC59982ztK<?> abstractC59982ztKEZpvd = EZpvd(interfaceC56551yJo, interfaceC59997ztZ, interfaceC59997ztZ2);
        java.lang.Object objAEQbTJ = abstractC59982ztKEZpvd != null ? abstractC59982ztKEZpvd.AEQbTJ(c59985ztN) : null;
        if (objAEQbTJ == null) {
            return null;
        }
        return (T) objAEQbTJ;
    }

    public static /* synthetic */ void declareScopedInstance$default(C60056zuf c60056zuf, final java.lang.Object obj, InterfaceC59997ztZ interfaceC59997ztZ, java.util.List list, boolean z, InterfaceC59997ztZ interfaceC59997ztZ2, java.lang.String str, int i, java.lang.Object obj2) {
        InterfaceC59997ztZ interfaceC59997ztZ3 = (i & 2) != 0 ? null : interfaceC59997ztZ;
        java.util.List listAhwBna = (i & 4) != 0 ? yDY.AhwBna() : list;
        boolean z2 = (i & 8) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(listAhwBna, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Kind kind = Kind.Scoped;
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, T> function2 = new Function2<C60060zuj, C60053zuc, T>() { // from class: org.koin.core.registry.InstanceRegistry$declareScopedInstance$def$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final T invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                return obj;
            }
        };
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59978ztG c59978ztG = new C59978ztG(interfaceC59997ztZ2, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ3, function2, kind, listAhwBna);
        java.lang.String strEZpvd = C59977ztF.EZpvd(c59978ztG.EZpvd(), c59978ztG.OLrzqt(), c59978ztG.copydefault());
        AbstractC59982ztK<?> abstractC59982ztK = c60056zuf.EZpvd().get(strEZpvd);
        C59989ztR c59989ztR = abstractC59982ztK instanceof C59989ztR ? (C59989ztR) abstractC59982ztK : null;
        if (c59989ztR != null) {
            Intrinsics.copydefault(obj, "");
            c59989ztR.KWHzl(str, obj);
            return;
        }
        C59989ztR c59989ztR2 = new C59989ztR(c59978ztG);
        saveMapping$default(c60056zuf, z2, strEZpvd, c59989ztR2, false, 8, null);
        java.util.Iterator<T> it = c59978ztG.valueOf().iterator();
        while (it.hasNext()) {
            saveMapping$default(c60056zuf, z2, C59977ztF.EZpvd((InterfaceC56551yJo) it.next(), c59978ztG.OLrzqt(), c59978ztG.copydefault()), c59989ztR2, false, 8, null);
        }
    }

    public static /* synthetic */ void declareRootInstance$default(C60056zuf c60056zuf, final java.lang.Object obj, InterfaceC59997ztZ interfaceC59997ztZ, java.util.List list, boolean z, int i, java.lang.Object obj2) {
        InterfaceC59997ztZ interfaceC59997ztZ2 = (i & 2) != 0 ? null : interfaceC59997ztZ;
        java.util.List listAhwBna = (i & 4) != 0 ? yDY.AhwBna() : list;
        boolean z2 = (i & 8) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(listAhwBna, "");
        InterfaceC59997ztZ interfaceC59997ztZCopydefault = c60056zuf.KWHzl().EZpvd().OLrzqt().copydefault();
        Kind kind = Kind.Scoped;
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, T> function2 = new Function2<C60060zuj, C60053zuc, T>() { // from class: org.koin.core.registry.InstanceRegistry$declareRootInstance$def$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final T invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                return obj;
            }
        };
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59978ztG c59978ztG = new C59978ztG(interfaceC59997ztZCopydefault, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ2, function2, kind, listAhwBna);
        C59990ztS c59990ztS = new C59990ztS(c59978ztG);
        saveMapping$default(c60056zuf, z2, C59977ztF.EZpvd(c59978ztG.EZpvd(), c59978ztG.OLrzqt(), c59978ztG.copydefault()), c59990ztS, false, 8, null);
        java.util.Iterator<T> it = c59978ztG.valueOf().iterator();
        while (it.hasNext()) {
            saveMapping$default(c60056zuf, z2, C59977ztF.EZpvd((InterfaceC56551yJo) it.next(), c59978ztG.OLrzqt(), c59978ztG.copydefault()), c59990ztS, false, 8, null);
        }
    }

    public final void KWHzl(@NotNull C60060zuj c60060zuj) {
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        java.util.Collection<AbstractC59982ztK<?>> collectionValues = this.AEQbTJ.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionValues) {
            if (obj instanceof C59989ztR) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C59989ztR) it.next()).copydefault(c60060zuj);
        }
    }

    public final <T> java.util.List<T> KWHzl(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo, @NotNull C59985ztN c59985ztN) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(c59985ztN, "");
        java.util.Collection<AbstractC59982ztK<?>> collectionValues = this.AEQbTJ.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : collectionValues) {
            if (Intrinsics.EZpvd(((AbstractC59982ztK) t).OLrzqt().copydefault(), c59985ztN.OLrzqt().copydefault())) {
                arrayList.add(t);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (T t2 : arrayList) {
            AbstractC59982ztK abstractC59982ztK = (AbstractC59982ztK) t2;
            if (Intrinsics.EZpvd(abstractC59982ztK.OLrzqt().EZpvd(), interfaceC56551yJo) || abstractC59982ztK.OLrzqt().valueOf().contains(interfaceC56551yJo)) {
                arrayList2.add(t2);
            }
        }
        java.util.List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listQbewEr, 10));
        java.util.Iterator<T> it = listQbewEr.iterator();
        while (it.hasNext()) {
            arrayList3.add(((AbstractC59982ztK) it.next()).AEQbTJ(c59985ztN));
        }
        return arrayList3;
    }

    public final int copydefault() {
        return this.AEQbTJ.size();
    }
}
