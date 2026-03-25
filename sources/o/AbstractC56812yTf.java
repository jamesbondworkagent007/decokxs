package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import o.InterfaceC56657yNm;
import o.yZT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yTf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56812yTf extends AbstractC59100zaf {
    public static final /* synthetic */ yJA<java.lang.Object>[] AYXKKw = {C56524yIo.copydefault(new PropertyReference1Impl(AbstractC56812yTf.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(AbstractC56812yTf.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(AbstractC56812yTf.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0))};
    public final InterfaceC59181zcG<C56935yXu, java.util.Collection<InterfaceC56687yOp>> AkhnZx;
    public final AbstractC56812yTf AuCTel;
    public final InterfaceC59182zcH<ySA> DbNXlk;
    public final InterfaceC59182zcH<java.util.Collection<InterfaceC56665yNu>> djBIcL;
    public final InterfaceC59181zcG<C56935yXu, java.util.Collection<InterfaceC56687yOp>> ejfBZ;
    public final InterfaceC59181zcG<C56935yXu, java.util.List<InterfaceC56676yOe>> fARcdN;
    public final InterfaceC59182zcH fIwbmz;
    public final InterfaceC59182zcH fJNWhG;
    public final InterfaceC59182zcH fetchVPNInfo;
    public final C56794ySo isConnected;
    public final InterfaceC59179zcE<C56935yXu, InterfaceC56676yOe> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC56657yNm gEmmrt(InterfaceC56687yOp interfaceC56687yOp) {
        Intrinsics.checkNotNullParameter(interfaceC56687yOp, "");
        return interfaceC56687yOp;
    }

    public abstract java.util.Set<C56935yXu> AEQbTJ(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1);

    public abstract void AEQbTJ(@NotNull java.util.Collection<InterfaceC56687yOp> collection, @NotNull C56935yXu c56935yXu);

    public abstract InterfaceC56679yOh AYXKKw();

    public abstract java.util.Set<C56935yXu> EZpvd(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1);

    public abstract StateListAnimator EZpvd(@NotNull InterfaceC56835yUb interfaceC56835yUb, @NotNull java.util.List<? extends InterfaceC56691yOt> list, @NotNull AbstractC59233zdF abstractC59233zdF, @NotNull java.util.List<? extends InterfaceC56695yOx> list2);

    public abstract void EZpvd(@NotNull C56935yXu c56935yXu, @NotNull java.util.Collection<InterfaceC56676yOe> collection);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull java.util.Collection<InterfaceC56687yOp> collection, @NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
    }

    public abstract java.util.Set<C56935yXu> OLrzqt(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1);

    public abstract ySA OLrzqt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC56812yTf ejfBZ() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59182zcH<ySA> fARcdN() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56794ySo fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59182zcH<java.util.Collection<InterfaceC56665yNu>> isConnected() {
        return this.djBIcL;
    }

    public abstract InterfaceC56665yNu values();

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.ySo)
  (wrap:o.yTf:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.yTf) : (r2v0 o.yTf))
 A[MD:(o.ySo, o.yTf):void (m)] (LINE:55) call: o.yTf.<init>(o.ySo, o.yTf):void type: THIS */
    public /* synthetic */ AbstractC56812yTf(C56794ySo c56794ySo, AbstractC56812yTf abstractC56812yTf, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c56794ySo, (i & 2) != 0 ? null : abstractC56812yTf);
    }

    public AbstractC56812yTf(@NotNull C56794ySo c56794ySo, AbstractC56812yTf abstractC56812yTf) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        this.isConnected = c56794ySo;
        this.AuCTel = abstractC56812yTf;
        this.djBIcL = c56794ySo.EZpvd().EZpvd(new C56809yTc(this), yDY.AhwBna());
        this.DbNXlk = c56794ySo.EZpvd().KWHzl(new C56813yTg(this));
        this.AkhnZx = c56794ySo.EZpvd().AEQbTJ(new C56815yTi(this));
        this.values = c56794ySo.EZpvd().OLrzqt(new C56818yTl(this));
        this.ejfBZ = c56794ySo.EZpvd().AEQbTJ(new C56817yTk(this));
        this.fJNWhG = c56794ySo.EZpvd().KWHzl(new C56821yTo(this));
        this.fIwbmz = c56794ySo.EZpvd().KWHzl(new C56819yTm(this));
        this.fetchVPNInfo = c56794ySo.EZpvd().KWHzl(new C56822yTp(this));
        this.fARcdN = c56794ySo.EZpvd().AEQbTJ(new C56820yTn(this));
    }

    public static final java.util.Collection AhwBna(AbstractC56812yTf abstractC56812yTf) {
        return abstractC56812yTf.valueOf(yZU.AEQbTJ, InterfaceC59098zad.hDKMBd.AEQbTJ());
    }

    public static final ySA valueOf(AbstractC56812yTf abstractC56812yTf) {
        return abstractC56812yTf.OLrzqt();
    }

    public static final java.util.Collection gEmmrt(AbstractC56812yTf abstractC56812yTf, C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        AbstractC56812yTf abstractC56812yTf2 = abstractC56812yTf.AuCTel;
        if (abstractC56812yTf2 != null) {
            return abstractC56812yTf2.AkhnZx.invoke(c56935yXu);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (InterfaceC56835yUb interfaceC56835yUb : abstractC56812yTf.DbNXlk.invoke().copydefault(c56935yXu)) {
            JavaMethodDescriptor javaMethodDescriptorEZpvd = abstractC56812yTf.EZpvd(interfaceC56835yUb);
            if (abstractC56812yTf.EZpvd(javaMethodDescriptorEZpvd)) {
                abstractC56812yTf.isConnected.copydefault().AhwBna().AEQbTJ(interfaceC56835yUb, javaMethodDescriptorEZpvd);
                arrayList.add(javaMethodDescriptorEZpvd);
            }
        }
        abstractC56812yTf.KWHzl(arrayList, c56935yXu);
        return arrayList;
    }

    public static final InterfaceC56676yOe EZpvd(AbstractC56812yTf abstractC56812yTf, C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        AbstractC56812yTf abstractC56812yTf2 = abstractC56812yTf.AuCTel;
        if (abstractC56812yTf2 != null) {
            return abstractC56812yTf2.values.invoke(c56935yXu);
        }
        yTW ytwOLrzqt = abstractC56812yTf.DbNXlk.invoke().OLrzqt(c56935yXu);
        if (ytwOLrzqt == null || ytwOLrzqt.gEmmrt()) {
            return null;
        }
        return abstractC56812yTf.AEQbTJ(ytwOLrzqt);
    }

    public static final java.util.Collection djBIcL(AbstractC56812yTf abstractC56812yTf, C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractC56812yTf.AkhnZx.invoke(c56935yXu));
        abstractC56812yTf.copydefault(linkedHashSet);
        abstractC56812yTf.AEQbTJ(linkedHashSet, c56935yXu);
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(abstractC56812yTf.isConnected.copydefault().fIwbmz().OLrzqt(abstractC56812yTf.isConnected, linkedHashSet));
    }

    public final void copydefault(java.util.Set<InterfaceC56687yOp> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : set) {
            java.lang.String strComputeJvmDescriptor$default = C56896yWi.computeJvmDescriptor$default((InterfaceC56687yOp) obj, false, false, 2, null);
            java.lang.Object arrayList = linkedHashMap.get(strComputeJvmDescriptor$default);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(strComputeJvmDescriptor$default, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        for (java.util.List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                java.util.Collection<? extends InterfaceC56687yOp> collectionEZpvd = yYN.EZpvd(list, C56823yTq.KWHzl);
                set.removeAll(list);
                set.addAll(collectionEZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.yTf$StateListAnimator */
    public static final class StateListAnimator {
        public final AbstractC59233zdF AEQbTJ;
        public final java.util.List<java.lang.String> EZpvd;
        public final boolean KWHzl;
        public final AbstractC59233zdF OLrzqt;
        public final java.util.List<InterfaceC56691yOt> copydefault;
        public final java.util.List<InterfaceC56695yOx> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InterfaceC56691yOt> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC59233zdF KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC59233zdF copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, stateListAnimator.gEmmrt) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InterfaceC56695yOx> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            AbstractC59233zdF abstractC59233zdF = this.AEQbTJ;
            return (((((((((iHashCode * 31) + (abstractC59233zdF == null ? 0 : abstractC59233zdF.hashCode())) * 31) + this.gEmmrt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MethodSignatureData(returnType=" + this.OLrzqt + ", receiverType=" + this.AEQbTJ + ", valueParameters=" + this.gEmmrt + ", typeParameters=" + this.copydefault + ", hasStableParameterNames=" + this.KWHzl + ", errors=" + this.EZpvd + ')';
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends o.yOx> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends o.yOt> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull AbstractC59233zdF abstractC59233zdF, AbstractC59233zdF abstractC59233zdF2, @NotNull java.util.List<? extends InterfaceC56695yOx> list, @NotNull java.util.List<? extends InterfaceC56691yOt> list2, boolean z, @NotNull java.util.List<java.lang.String> list3) {
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.OLrzqt = abstractC59233zdF;
            this.AEQbTJ = abstractC59233zdF2;
            this.gEmmrt = list;
            this.copydefault = list2;
            this.KWHzl = z;
            this.EZpvd = list3;
        }
    }

    public final JavaMethodDescriptor EZpvd(@NotNull InterfaceC56835yUb interfaceC56835yUb) {
        java.util.Map<? extends InterfaceC56657yNm.Application<?>, ?> mapKWHzl;
        Intrinsics.checkNotNullParameter(interfaceC56835yUb, "");
        JavaMethodDescriptor javaMethodDescriptorAEQbTJ = JavaMethodDescriptor.AEQbTJ(values(), C56795ySp.OLrzqt(this.isConnected, interfaceC56835yUb), interfaceC56835yUb.fIwbmz(), this.isConnected.copydefault().AuCTel().KWHzl(interfaceC56835yUb), this.DbNXlk.invoke().AEQbTJ(interfaceC56835yUb.fIwbmz()) != null && interfaceC56835yUb.AhwBna().isEmpty());
        Intrinsics.checkNotNullExpressionValue(javaMethodDescriptorAEQbTJ, "");
        C56794ySo c56794ySoChildForMethod$default = C56784ySe.childForMethod$default(this.isConnected, javaMethodDescriptorAEQbTJ, interfaceC56835yUb, 0, 4, null);
        java.util.List<InterfaceC56843yUj> newProxyInstance = interfaceC56835yUb.getNewProxyInstance();
        java.util.List<? extends InterfaceC56691yOt> arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(newProxyInstance, 10));
        java.util.Iterator<T> it = newProxyInstance.iterator();
        while (it.hasNext()) {
            InterfaceC56691yOt interfaceC56691yOtOLrzqt = c56794ySoChildForMethod$default.AhwBna().OLrzqt((InterfaceC56843yUj) it.next());
            Intrinsics.copydefault(interfaceC56691yOtOLrzqt);
            arrayList.add(interfaceC56691yOtOLrzqt);
        }
        Application applicationOLrzqt = OLrzqt(c56794ySoChildForMethod$default, javaMethodDescriptorAEQbTJ, interfaceC56835yUb.AhwBna());
        StateListAnimator stateListAnimatorEZpvd = EZpvd(interfaceC56835yUb, arrayList, OLrzqt(interfaceC56835yUb, c56794ySoChildForMethod$default), applicationOLrzqt.KWHzl());
        AbstractC59233zdF abstractC59233zdFKWHzl = stateListAnimatorEZpvd.KWHzl();
        InterfaceC56679yOh interfaceC56679yOhCopydefault = abstractC59233zdFKWHzl != null ? yYI.copydefault(javaMethodDescriptorAEQbTJ, abstractC59233zdFKWHzl, yOL.KWHzl.OLrzqt()) : null;
        InterfaceC56679yOh interfaceC56679yOhAYXKKw = AYXKKw();
        java.util.List<InterfaceC56679yOh> listAhwBna = yDY.AhwBna();
        java.util.List<InterfaceC56691yOt> listAEQbTJ = stateListAnimatorEZpvd.AEQbTJ();
        java.util.List<InterfaceC56695yOx> listGEmmrt = stateListAnimatorEZpvd.gEmmrt();
        AbstractC59233zdF abstractC59233zdFCopydefault = stateListAnimatorEZpvd.copydefault();
        Modality modalityEZpvd = Modality.Companion.EZpvd(false, interfaceC56835yUb.uzCIH(), !interfaceC56835yUb.zsXlph());
        yNC yncOLrzqt = yRN.OLrzqt(interfaceC56835yUb.iwGUEr());
        if (stateListAnimatorEZpvd.KWHzl() != null) {
            mapKWHzl = C56423yEv.EZpvd(C56390yDp.OLrzqt(JavaMethodDescriptor.AxsJAY, CollectionsKt___CollectionsKt.AuCTelauCTel(applicationOLrzqt.KWHzl())));
        } else {
            mapKWHzl = C56424yEw.KWHzl();
        }
        javaMethodDescriptorAEQbTJ.EZpvd(interfaceC56679yOhCopydefault, interfaceC56679yOhAYXKKw, listAhwBna, listAEQbTJ, listGEmmrt, abstractC59233zdFCopydefault, modalityEZpvd, yncOLrzqt, mapKWHzl);
        javaMethodDescriptorAEQbTJ.EZpvd(stateListAnimatorEZpvd.OLrzqt(), applicationOLrzqt.AEQbTJ());
        if (!stateListAnimatorEZpvd.EZpvd().isEmpty()) {
            c56794ySoChildForMethod$default.copydefault().ejfBZ().OLrzqt(javaMethodDescriptorAEQbTJ, stateListAnimatorEZpvd.EZpvd());
        }
        return javaMethodDescriptorAEQbTJ;
    }

    public final AbstractC59233zdF OLrzqt(@NotNull InterfaceC56835yUb interfaceC56835yUb, @NotNull C56794ySo c56794ySo) {
        Intrinsics.checkNotNullParameter(interfaceC56835yUb, "");
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        return c56794ySo.AYXKKw().EZpvd(interfaceC56835yUb.valueOf(), C56831yTy.toAttributes$default(TypeUsage.COMMON, interfaceC56835yUb.AkhnZx().AuCTelauCTel(), false, null, 6, null));
    }

    /* JADX INFO: renamed from: o.yTf$Application */
    public static final class Application {
        public final boolean OLrzqt;
        public final java.util.List<InterfaceC56695yOx> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InterfaceC56695yOx> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.yOx> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull java.util.List<? extends InterfaceC56695yOx> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
            this.OLrzqt = z;
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: 112, r5v0 */
    public final Application OLrzqt(@NotNull C56794ySo c56794ySo, @NotNull yNG yng, @NotNull java.util.List<? extends InterfaceC56844yUk> list) {
        kotlin.Pair pairOLrzqt;
        C56935yXu c56935yXuCopydefault;
        C56794ySo c56794ySo2 = c56794ySo;
        Intrinsics.checkNotNullParameter(c56794ySo2, "");
        Intrinsics.checkNotNullParameter(yng, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.Iterable<IndexedValue> iterableDCJXGO = CollectionsKt___CollectionsKt.DCJXGO(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterableDCJXGO, 10));
        boolean z = false;
        for (IndexedValue indexedValue : iterableDCJXGO) {
            int iKWHzl = indexedValue.KWHzl();
            InterfaceC56844yUk interfaceC56844yUk = (InterfaceC56844yUk) indexedValue.EZpvd();
            yOL yolOLrzqt = C56795ySp.OLrzqt(c56794ySo2, interfaceC56844yUk);
            C56829yTw attributes$default = C56831yTy.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            if (interfaceC56844yUk.valueOf()) {
                InterfaceC56839yUf interfaceC56839yUfAYXKKw = interfaceC56844yUk.AYXKKw();
                yTS yts = interfaceC56839yUfAYXKKw instanceof yTS ? (yTS) interfaceC56839yUfAYXKKw : null;
                if (yts == null) {
                    throw new java.lang.AssertionError("Vararg parameter should be an array: " + interfaceC56844yUk);
                }
                AbstractC59233zdF abstractC59233zdFEZpvd = c56794ySo.AYXKKw().EZpvd(yts, attributes$default, true);
                pairOLrzqt = C56390yDp.OLrzqt(abstractC59233zdFEZpvd, c56794ySo.AEQbTJ().AEQbTJ().ejfBZ(abstractC59233zdFEZpvd));
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(c56794ySo.AYXKKw().EZpvd(interfaceC56844yUk.AYXKKw(), attributes$default), null);
            }
            AbstractC59233zdF abstractC59233zdF = (AbstractC59233zdF) pairOLrzqt.component1();
            AbstractC59233zdF abstractC59233zdF2 = (AbstractC59233zdF) pairOLrzqt.component2();
            if (Intrinsics.EZpvd((java.lang.Object) yng.bR_().AEQbTJ(), (java.lang.Object) "equals") && list.size() == 1 && Intrinsics.EZpvd(c56794ySo.AEQbTJ().AEQbTJ().iwGUEr(), abstractC59233zdF)) {
                c56935yXuCopydefault = C56935yXu.AEQbTJ("other");
            } else {
                c56935yXuCopydefault = interfaceC56844yUk.copydefault();
                if (c56935yXuCopydefault == null) {
                    z = true;
                }
                if (c56935yXuCopydefault == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append('p');
                    sb.append(iKWHzl);
                    c56935yXuCopydefault = C56935yXu.AEQbTJ(sb.toString());
                    Intrinsics.checkNotNullExpressionValue(c56935yXuCopydefault, "");
                }
            }
            C56935yXu c56935yXu = c56935yXuCopydefault;
            Intrinsics.copydefault(c56935yXu);
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(new yPP(yng, null, iKWHzl, yolOLrzqt, c56935yXu, abstractC59233zdF, false, false, false, abstractC59233zdF2, c56794ySo.copydefault().AuCTel().KWHzl(interfaceC56844yUk)));
            arrayList = arrayList2;
            z = z;
            c56794ySo2 = c56794ySo;
        }
        return new Application(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList), z);
    }

    public static final java.util.Set gEmmrt(AbstractC56812yTf abstractC56812yTf) {
        return abstractC56812yTf.EZpvd(yZU.valueOf, (Function1<? super C56935yXu, java.lang.Boolean>) null);
    }

    public final java.util.Set<C56935yXu> fJNWhG() {
        return (java.util.Set) C59183zcI.AEQbTJ(this.fJNWhG, this, AYXKKw[0]);
    }

    public static final java.util.Set djBIcL(AbstractC56812yTf abstractC56812yTf) {
        return abstractC56812yTf.AEQbTJ(yZU.getFieldNames, (Function1<? super C56935yXu, java.lang.Boolean>) null);
    }

    public final java.util.Set<C56935yXu> AuCTel() {
        return (java.util.Set) C59183zcI.AEQbTJ(this.fIwbmz, this, AYXKKw[1]);
    }

    public static final java.util.Set AYXKKw(AbstractC56812yTf abstractC56812yTf) {
        return abstractC56812yTf.OLrzqt(yZU.EZpvd, (Function1<? super C56935yXu, java.lang.Boolean>) null);
    }

    public final java.util.Set<C56935yXu> DbNXlk() {
        return (java.util.Set) C59183zcI.AEQbTJ(this.fetchVPNInfo, this, AYXKKw[2]);
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> AEQbTJ() {
        return fJNWhG();
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> bP_() {
        return AuCTel();
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> EZpvd() {
        return DbNXlk();
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return !AEQbTJ().contains(c56935yXu) ? yDY.AhwBna() : this.ejfBZ.invoke(c56935yXu);
    }

    public static final java.util.List AhwBna(AbstractC56812yTf abstractC56812yTf, C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        C59433zgu.EZpvd(arrayList, abstractC56812yTf.values.invoke(c56935yXu));
        abstractC56812yTf.EZpvd(c56935yXu, arrayList);
        if (yYH.djBIcL(abstractC56812yTf.values())) {
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(abstractC56812yTf.isConnected.copydefault().fIwbmz().OLrzqt(abstractC56812yTf.isConnected, arrayList));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, o.yPI] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, o.yPI] */
    public final InterfaceC56676yOe AEQbTJ(yTW ytw) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? Copydefault = copydefault(ytw);
        objectRef.element = Copydefault;
        Copydefault.copydefault(null, null, null, null);
        ((yPI) objectRef.element).AEQbTJ(KWHzl(ytw), yDY.AhwBna(), AYXKKw(), null, yDY.AhwBna());
        InterfaceC56665yNu interfaceC56665yNuValues = values();
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56665yNuValues instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56665yNuValues : null;
        if (interfaceC56658yNn != null) {
            objectRef.element = this.isConnected.copydefault().hDKMBd().copydefault(interfaceC56658yNn, (yPI) objectRef.element, this.isConnected);
        }
        T t = objectRef.element;
        if (yYH.EZpvd((yOC) t, ((yPI) t).uzCIH())) {
            ((yPI) objectRef.element).OLrzqt(new C56814yTh(this, ytw, objectRef));
        }
        this.isConnected.copydefault().AhwBna().copydefault(ytw, (InterfaceC56676yOe) objectRef.element);
        return (InterfaceC56676yOe) objectRef.element;
    }

    public static final InterfaceC59180zcF AEQbTJ(AbstractC56812yTf abstractC56812yTf, yTW ytw, Ref.ObjectRef objectRef) {
        return abstractC56812yTf.isConnected.EZpvd().copydefault(new C56816yTj(abstractC56812yTf, ytw, objectRef));
    }

    public static final AbstractC56975yZg EZpvd(AbstractC56812yTf abstractC56812yTf, yTW ytw, Ref.ObjectRef objectRef) {
        return abstractC56812yTf.isConnected.copydefault().gEmmrt().AEQbTJ(ytw, (InterfaceC56676yOe) objectRef.element);
    }

    public final yPI copydefault(yTW ytw) {
        C56788ySi c56788ySiKWHzl = C56788ySi.KWHzl(values(), C56795ySp.OLrzqt(this.isConnected, ytw), Modality.FINAL, yRN.OLrzqt(ytw.iwGUEr()), !ytw.zsXlph(), ytw.fIwbmz(), this.isConnected.copydefault().AuCTel().KWHzl(ytw), OLrzqt(ytw));
        Intrinsics.checkNotNullExpressionValue(c56788ySiKWHzl, "");
        return c56788ySiKWHzl;
    }

    public final boolean OLrzqt(yTW ytw) {
        return ytw.zsXlph() && ytw.sSMYrx();
    }

    public final AbstractC59233zdF KWHzl(yTW ytw) {
        AbstractC59233zdF abstractC59233zdFEZpvd = this.isConnected.AYXKKw().EZpvd(ytw.valueOf(), C56831yTy.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
        if ((!AbstractC56640yMw.fetchVPNInfo(abstractC59233zdFEZpvd) && !AbstractC56640yMw.AkhnZx(abstractC59233zdFEZpvd)) || !OLrzqt(ytw) || !ytw.OLrzqt()) {
            return abstractC59233zdFEZpvd;
        }
        AbstractC59233zdF abstractC59233zdFAhwBna = C59322zep.AhwBna(abstractC59233zdFEZpvd);
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFAhwBna, "");
        return abstractC59233zdFAhwBna;
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Collection<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return !bP_().contains(c56935yXu) ? yDY.AhwBna() : this.fARcdN.invoke(c56935yXu);
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return this.djBIcL.invoke();
    }

    public final java.util.List<InterfaceC56665yNu> valueOf(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (yzu.EZpvd(yZU.AYXKKw.OLrzqt())) {
            for (C56935yXu c56935yXu : OLrzqt(yzu, function1)) {
                if (function1.invoke(c56935yXu).booleanValue()) {
                    C59433zgu.EZpvd(linkedHashSet, EZpvd(c56935yXu, noLookupLocation));
                }
            }
        }
        if (yzu.EZpvd(yZU.AYXKKw.EZpvd()) && !yzu.djBIcL().contains(yZT.Application.OLrzqt)) {
            for (C56935yXu c56935yXu2 : EZpvd(yzu, function1)) {
                if (function1.invoke(c56935yXu2).booleanValue()) {
                    linkedHashSet.addAll(AEQbTJ(c56935yXu2, noLookupLocation));
                }
            }
        }
        if (yzu.EZpvd(yZU.AYXKKw.AhwBna()) && !yzu.djBIcL().contains(yZT.Application.OLrzqt)) {
            for (C56935yXu c56935yXu3 : AEQbTJ(yzu, function1)) {
                if (function1.invoke(c56935yXu3).booleanValue()) {
                    linkedHashSet.addAll(copydefault(c56935yXu3, noLookupLocation));
                }
            }
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashSet);
    }

    public java.lang.String toString() {
        return "Lazy scope for " + values();
    }
}
