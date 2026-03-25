package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import o.C59431zgs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yTt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56826yTt extends AbstractC56832yTz {
    public final yTT OLrzqt;
    public final InterfaceC56780ySa copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: values()Lo/yNu; */
    @Override // o.AbstractC56812yTf
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public InterfaceC56780ySa values() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56826yTt(@NotNull C56794ySo c56794ySo, @NotNull yTT ytt, @NotNull InterfaceC56780ySa interfaceC56780ySa) {
        super(c56794ySo);
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(ytt, "");
        Intrinsics.checkNotNullParameter(interfaceC56780ySa, "");
        this.OLrzqt = ytt;
        this.copydefault = interfaceC56780ySa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EZpvd(InterfaceC56836yUc interfaceC56836yUc) {
        Intrinsics.checkNotNullParameter(interfaceC56836yUc, "");
        return interfaceC56836yUc.sSMYrx();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/ySA; */
    @Override // o.AbstractC56812yTf
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C56803ySx OLrzqt() {
        return new C56803ySx(this.OLrzqt, C56825yTs.AEQbTJ);
    }

    @Override // o.AbstractC56812yTf
    public java.util.Set<C56935yXu> EZpvd(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        java.util.Set<C56935yXu> setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(fARcdN().invoke().KWHzl());
        C56826yTt c56826yTtKWHzl = C56785ySf.KWHzl(values());
        java.util.Set<C56935yXu> setAEQbTJ = c56826yTtKWHzl != null ? c56826yTtKWHzl.AEQbTJ() : null;
        if (setAEQbTJ == null) {
            setAEQbTJ = yEE.copydefault();
        }
        setDXXBbs.addAll(setAEQbTJ);
        if (this.OLrzqt.zLjUOn()) {
            setDXXBbs.addAll(yDY.gEmmrt(yMB.fARcdN, yMB.fJNWhG));
        }
        setDXXBbs.addAll(fetchVPNInfo().copydefault().hDKMBd().AEQbTJ(values(), fetchVPNInfo()));
        return setDXXBbs;
    }

    @Override // o.AbstractC56812yTf
    public java.util.Set<C56935yXu> AEQbTJ(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        java.util.Set<C56935yXu> setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(fARcdN().invoke().copydefault());
        EZpvd(values(), setDXXBbs, C56827yTu.AEQbTJ);
        if (this.OLrzqt.zLjUOn()) {
            setDXXBbs.add(yMB.ejfBZ);
        }
        return setDXXBbs;
    }

    public static final java.util.Collection copydefault(InterfaceC59098zad interfaceC59098zad) {
        Intrinsics.checkNotNullParameter(interfaceC59098zad, "");
        return interfaceC59098zad.bP_();
    }

    @Override // o.AbstractC56812yTf
    public java.util.Set<C56935yXu> OLrzqt(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        return yEE.copydefault();
    }

    @Override // o.AbstractC56812yTf
    public void AEQbTJ(@NotNull java.util.Collection<InterfaceC56687yOp> collection, @NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        java.util.Collection<? extends InterfaceC56687yOp> collectionEZpvd = yRO.EZpvd(c56935yXu, AEQbTJ(c56935yXu, values()), collection, values(), fetchVPNInfo().copydefault().OLrzqt(), fetchVPNInfo().copydefault().AkhnZx().KWHzl());
        Intrinsics.checkNotNullExpressionValue(collectionEZpvd, "");
        collection.addAll(collectionEZpvd);
        if (this.OLrzqt.zLjUOn()) {
            if (Intrinsics.EZpvd(c56935yXu, yMB.fARcdN)) {
                InterfaceC56687yOp interfaceC56687yOpEZpvd = yYI.EZpvd(values());
                Intrinsics.checkNotNullExpressionValue(interfaceC56687yOpEZpvd, "");
                collection.add(interfaceC56687yOpEZpvd);
            } else if (Intrinsics.EZpvd(c56935yXu, yMB.fJNWhG)) {
                InterfaceC56687yOp interfaceC56687yOpAEQbTJ = yYI.AEQbTJ(values());
                Intrinsics.checkNotNullExpressionValue(interfaceC56687yOpAEQbTJ, "");
                collection.add(interfaceC56687yOpAEQbTJ);
            }
        }
    }

    @Override // o.AbstractC56812yTf
    public void KWHzl(@NotNull java.util.Collection<InterfaceC56687yOp> collection, @NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        fetchVPNInfo().copydefault().hDKMBd().OLrzqt(values(), c56935yXu, collection, fetchVPNInfo());
    }

    @Override // o.AbstractC56832yTz, o.AbstractC56812yTf
    public void EZpvd(@NotNull C56935yXu c56935yXu, @NotNull java.util.Collection<InterfaceC56676yOe> collection) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(collection, "");
        java.util.Set setEZpvd = EZpvd(values(), new LinkedHashSet(), new C56828yTv(c56935yXu));
        if (!collection.isEmpty()) {
            java.util.Collection<? extends InterfaceC56676yOe> collectionEZpvd = yRO.EZpvd(c56935yXu, setEZpvd, collection, values(), fetchVPNInfo().copydefault().OLrzqt(), fetchVPNInfo().copydefault().AkhnZx().KWHzl());
            Intrinsics.checkNotNullExpressionValue(collectionEZpvd, "");
            collection.addAll(collectionEZpvd);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : setEZpvd) {
                InterfaceC56676yOe interfaceC56676yOeAEQbTJ = AEQbTJ((InterfaceC56676yOe) obj);
                java.lang.Object arrayList = linkedHashMap.get(interfaceC56676yOeAEQbTJ);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    linkedHashMap.put(interfaceC56676yOeAEQbTJ, arrayList);
                }
                ((java.util.List) arrayList).add(obj);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Collection collectionEZpvd2 = yRO.EZpvd(c56935yXu, (java.util.Collection) ((Map.Entry) it.next()).getValue(), collection, values(), fetchVPNInfo().copydefault().OLrzqt(), fetchVPNInfo().copydefault().AkhnZx().KWHzl());
                Intrinsics.checkNotNullExpressionValue(collectionEZpvd2, "");
                C56406yEe.KWHzl(arrayList2, collectionEZpvd2);
            }
            collection.addAll(arrayList2);
        }
        if (this.OLrzqt.zLjUOn() && Intrinsics.EZpvd(c56935yXu, yMB.ejfBZ)) {
            C59433zgu.EZpvd(collection, yYI.OLrzqt(values()));
        }
    }

    public static final java.util.Collection OLrzqt(C56935yXu c56935yXu, InterfaceC59098zad interfaceC59098zad) {
        Intrinsics.checkNotNullParameter(interfaceC59098zad, "");
        return interfaceC59098zad.copydefault(c56935yXu, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }

    public final java.util.Set<InterfaceC56687yOp> AEQbTJ(C56935yXu c56935yXu, InterfaceC56658yNn interfaceC56658yNn) {
        C56826yTt c56826yTtKWHzl = C56785ySf.KWHzl(interfaceC56658yNn);
        return c56826yTtKWHzl == null ? yEE.copydefault() : CollectionsKt___CollectionsKt.OqFWZa(c56826yTtKWHzl.AEQbTJ(c56935yXu, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
    }

    public final <R> java.util.Set<R> EZpvd(InterfaceC56658yNn interfaceC56658yNn, java.util.Set<R> set, Function1<? super InterfaceC59098zad, ? extends java.util.Collection<? extends R>> function1) {
        C59431zgs.AEQbTJ(C56402yEa.EZpvd(interfaceC56658yNn), C56824yTr.AEQbTJ, new ActionBar(interfaceC56658yNn, set, function1));
        return set;
    }

    public static final java.lang.Iterable copydefault(InterfaceC56658yNn interfaceC56658yNn) {
        java.util.Collection<AbstractC59233zdF> collectionBV_ = interfaceC56658yNn.fJNWhG().bV_();
        Intrinsics.checkNotNullExpressionValue(collectionBV_, "");
        return C59467zhb.getFieldNames(C59467zhb.fJNWhG(CollectionsKt___CollectionsKt.QVAiDq(collectionBV_), yTA.AEQbTJ));
    }

    public static final InterfaceC56658yNn copydefault(AbstractC59233zdF abstractC59233zdF) {
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59233zdF.djBIcL().OLrzqt();
        if (interfaceC56663yNsOLrzqt instanceof InterfaceC56658yNn) {
            return (InterfaceC56658yNn) interfaceC56663yNsOLrzqt;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.yTt$ActionBar */
    public static final class ActionBar extends C59431zgs.StateListAnimator<InterfaceC56658yNn, Unit> {
        public final /* synthetic */ InterfaceC56658yNn EZpvd;
        public final /* synthetic */ Function1<InterfaceC59098zad, java.util.Collection<R>> KWHzl;
        public final /* synthetic */ java.util.Set<R> copydefault;

        public void EZpvd() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.zad, ? extends java.util.Collection<? extends R>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(InterfaceC56658yNn interfaceC56658yNn, java.util.Set<R> set, Function1<? super InterfaceC59098zad, ? extends java.util.Collection<? extends R>> function1) {
            this.EZpvd = interfaceC56658yNn;
            this.copydefault = set;
            this.KWHzl = function1;
        }

        @Override // o.C59431zgs.Activity
        public /* synthetic */ java.lang.Object OLrzqt() {
            EZpvd();
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Z */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.C59431zgs.StateListAnimator, o.C59431zgs.Activity
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean EZpvd(InterfaceC56658yNn interfaceC56658yNn) {
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            if (interfaceC56658yNn == this.EZpvd) {
                return true;
            }
            InterfaceC59098zad interfaceC59098zadEjfBZ = interfaceC56658yNn.ejfBZ();
            Intrinsics.checkNotNullExpressionValue(interfaceC59098zadEjfBZ, "");
            if (!(interfaceC59098zadEjfBZ instanceof AbstractC56832yTz)) {
                return true;
            }
            this.copydefault.addAll((java.util.Collection<? extends R>) ((java.util.Collection) this.KWHzl.invoke(interfaceC59098zadEjfBZ)));
            return false;
        }
    }

    public final InterfaceC56676yOe AEQbTJ(InterfaceC56676yOe interfaceC56676yOe) {
        if (interfaceC56676yOe.bW_().isReal()) {
            return interfaceC56676yOe;
        }
        java.util.Collection<? extends InterfaceC56676yOe> collectionValueOf = interfaceC56676yOe.valueOf();
        Intrinsics.checkNotNullExpressionValue(collectionValueOf, "");
        java.util.Collection<? extends InterfaceC56676yOe> collection = collectionValueOf;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection, 10));
        for (InterfaceC56676yOe interfaceC56676yOe2 : collection) {
            Intrinsics.copydefault(interfaceC56676yOe2);
            arrayList.add(AEQbTJ(interfaceC56676yOe2));
        }
        return (InterfaceC56676yOe) CollectionsKt___CollectionsKt.gHZMYf(CollectionsKt___CollectionsKt.QbewEr(arrayList));
    }
}
