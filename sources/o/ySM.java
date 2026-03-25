package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredFunctions$3;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredFunctions$4;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import o.AbstractC56812yTf;
import o.C59388zgB;
import o.InterfaceC56764yRl;
import o.InterfaceC56782ySc;
import o.yNG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ySM extends AbstractC56812yTf {
    public final InterfaceC59182zcH<java.util.Set<C56935yXu>> AEQbTJ;
    public final boolean AhwBna;
    public final yTT EZpvd;
    public final InterfaceC59182zcH<java.util.Set<C56935yXu>> KWHzl;
    public final InterfaceC59182zcH<java.util.List<InterfaceC56656yNl>> OLrzqt;
    public final InterfaceC59182zcH<java.util.Map<C56935yXu, yTW>> copydefault;
    public final InterfaceC56658yNn gEmmrt;
    public final InterfaceC59179zcE<C56935yXu, InterfaceC56658yNn> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59182zcH<java.util.List<InterfaceC56656yNl>> AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: values()Lo/yNu; */
    @Override // o.AbstractC56812yTf
    /* JADX INFO: renamed from: AkhnZx, reason: merged with bridge method [inline-methods] */
    public InterfaceC56658yNn values() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 o.ySo)
  (r8v0 o.yNn)
  (r9v0 o.yTT)
  (r10v0 boolean)
  (wrap:o.ySM:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null o.ySM) : (r11v0 o.ySM))
 A[MD:(o.ySo, o.yNn, o.yTT, boolean, o.ySM):void (m)] (LINE:63) call: o.ySM.<init>(o.ySo, o.yNn, o.yTT, boolean, o.ySM):void type: THIS */
    public /* synthetic */ ySM(C56794ySo c56794ySo, InterfaceC56658yNn interfaceC56658yNn, yTT ytt, boolean z, ySM ysm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c56794ySo, interfaceC56658yNn, ytt, z, (i & 16) != 0 ? null : ysm);
    }

    @Override // o.AbstractC56812yTf
    public /* synthetic */ java.util.Set EZpvd(yZU yzu, Function1 function1) {
        return KWHzl(yzu, (Function1<? super C56935yXu, java.lang.Boolean>) function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ySM(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull yTT ytt, boolean z, ySM ysm) {
        super(c56794ySo, ysm);
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        Intrinsics.checkNotNullParameter(ytt, "");
        this.gEmmrt = interfaceC56658yNn;
        this.EZpvd = ytt;
        this.AhwBna = z;
        this.OLrzqt = c56794ySo.EZpvd().KWHzl(new ySN(this, c56794ySo));
        this.KWHzl = c56794ySo.EZpvd().KWHzl(new ySR(this));
        this.AEQbTJ = c56794ySo.EZpvd().KWHzl(new ySO(c56794ySo, this));
        this.copydefault = c56794ySo.EZpvd().KWHzl(new ySQ(this));
        this.valueOf = c56794ySo.EZpvd().OLrzqt(new ySP(this, c56794ySo));
    }

    public static final boolean KWHzl(InterfaceC56836yUc interfaceC56836yUc) {
        Intrinsics.checkNotNullParameter(interfaceC56836yUc, "");
        return !interfaceC56836yUc.sSMYrx();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/ySA; */
    @Override // o.AbstractC56812yTf
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C56803ySx OLrzqt() {
        return new C56803ySx(this.EZpvd, yST.KWHzl);
    }

    public LinkedHashSet<C56935yXu> KWHzl(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        java.util.Collection<AbstractC59233zdF> collectionBV_ = values().fJNWhG().bV_();
        Intrinsics.checkNotNullExpressionValue(collectionBV_, "");
        LinkedHashSet<C56935yXu> linkedHashSet = new LinkedHashSet<>();
        java.util.Iterator<T> it = collectionBV_.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(linkedHashSet, ((AbstractC59233zdF) it.next()).OLrzqt().AEQbTJ());
        }
        linkedHashSet.addAll(fARcdN().invoke().KWHzl());
        linkedHashSet.addAll(fARcdN().invoke().EZpvd());
        linkedHashSet.addAll(OLrzqt(yzu, function1));
        linkedHashSet.addAll(fetchVPNInfo().copydefault().hDKMBd().KWHzl(values(), fetchVPNInfo()));
        return linkedHashSet;
    }

    public static final java.util.List EZpvd(ySM ysm, C56794ySo c56794ySo) {
        java.util.Collection<yTZ> collectionOLrzqt = ysm.EZpvd.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionOLrzqt.size());
        java.util.Iterator<yTZ> it = collectionOLrzqt.iterator();
        while (it.hasNext()) {
            arrayList.add(ysm.copydefault(it.next()));
        }
        if (ysm.EZpvd.wlaJM()) {
            InterfaceC56656yNl interfaceC56656yNlDjBIcL = ysm.djBIcL();
            java.lang.String strComputeJvmDescriptor$default = C56896yWi.computeJvmDescriptor$default(interfaceC56656yNlDjBIcL, false, false, 2, null);
            if (arrayList.isEmpty()) {
                arrayList.add(interfaceC56656yNlDjBIcL);
                c56794ySo.copydefault().AhwBna().KWHzl(ysm.EZpvd, interfaceC56656yNlDjBIcL);
            } else {
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) C56896yWi.computeJvmDescriptor$default((InterfaceC56656yNl) it2.next(), false, false, 2, null), (java.lang.Object) strComputeJvmDescriptor$default)) {
                        break;
                    }
                }
                arrayList.add(interfaceC56656yNlDjBIcL);
                c56794ySo.copydefault().AhwBna().KWHzl(ysm.EZpvd, interfaceC56656yNlDjBIcL);
            }
        }
        c56794ySo.copydefault().hDKMBd().KWHzl(ysm.values(), arrayList, c56794ySo);
        C56880yVt c56880yVtFIwbmz = c56794ySo.copydefault().fIwbmz();
        boolean zIsEmpty = arrayList.isEmpty();
        java.util.List listOLrzqt = arrayList;
        if (zIsEmpty) {
            listOLrzqt = yDY.OLrzqt(ysm.valueOf());
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c56880yVtFIwbmz.OLrzqt(c56794ySo, listOLrzqt));
    }

    public final InterfaceC56656yNl djBIcL() {
        InterfaceC56658yNn interfaceC56658yNnValues = values();
        yRZ yrzEZpvd = yRZ.EZpvd(interfaceC56658yNnValues, yOL.KWHzl.OLrzqt(), true, fetchVPNInfo().copydefault().AuCTel().KWHzl(this.EZpvd));
        Intrinsics.checkNotNullExpressionValue(yrzEZpvd, "");
        java.util.List<InterfaceC56695yOx> listCopydefault = copydefault(yrzEZpvd);
        yrzEZpvd.copydefault(false);
        yrzEZpvd.AEQbTJ(listCopydefault, AEQbTJ(interfaceC56658yNnValues));
        yrzEZpvd.EZpvd(false);
        yrzEZpvd.EZpvd(interfaceC56658yNnValues.bQ_());
        return yrzEZpvd;
    }

    public final java.util.List<InterfaceC56695yOx> copydefault(C56707yPi c56707yPi) {
        java.util.Collection<InterfaceC56841yUh> collectionFARcdN = this.EZpvd.fARcdN();
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionFARcdN.size());
        C56829yTw attributes$default = C56831yTy.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null);
        java.util.Iterator<T> it = collectionFARcdN.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return arrayList;
            }
            i = i2 + 1;
            InterfaceC56841yUh interfaceC56841yUh = (InterfaceC56841yUh) it.next();
            AbstractC59233zdF abstractC59233zdFEZpvd = fetchVPNInfo().AYXKKw().EZpvd(interfaceC56841yUh.OLrzqt(), attributes$default);
            arrayList.add(new yPP(c56707yPi, null, i2, yOL.KWHzl.OLrzqt(), interfaceC56841yUh.fIwbmz(), abstractC59233zdFEZpvd, false, false, false, interfaceC56841yUh.djBIcL() ? fetchVPNInfo().copydefault().fetchVPNInfo().AEQbTJ().ejfBZ(abstractC59233zdFEZpvd) : null, fetchVPNInfo().copydefault().AuCTel().KWHzl(interfaceC56841yUh)));
        }
    }

    @Override // o.AbstractC56812yTf
    public boolean EZpvd(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor, "");
        if (this.EZpvd.AuCTelauCTel()) {
            return false;
        }
        return EZpvd((InterfaceC56687yOp) javaMethodDescriptor);
    }

    public final boolean EZpvd(InterfaceC56687yOp interfaceC56687yOp) {
        C56935yXu c56935yXuBR_ = interfaceC56687yOp.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        java.util.List<C56935yXu> listKWHzl = yRJ.KWHzl(c56935yXuBR_);
        if (!(listKWHzl instanceof java.util.Collection) || !listKWHzl.isEmpty()) {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                java.util.Set<InterfaceC56676yOe> setKWHzl = KWHzl((C56935yXu) it.next());
                if (!(setKWHzl instanceof java.util.Collection) || !setKWHzl.isEmpty()) {
                    for (InterfaceC56676yOe interfaceC56676yOe : setKWHzl) {
                        if (KWHzl(interfaceC56676yOe, new ySU(interfaceC56687yOp, this))) {
                            if (!interfaceC56676yOe.AubY()) {
                                java.lang.String strAEQbTJ = interfaceC56687yOp.bR_().AEQbTJ();
                                Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
                                if (!C56777yRy.EZpvd(strAEQbTJ)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (AEQbTJ(interfaceC56687yOp) || OLrzqt(interfaceC56687yOp) || KWHzl(interfaceC56687yOp)) ? false : true;
    }

    public static final java.util.Collection copydefault(InterfaceC56687yOp interfaceC56687yOp, ySM ysm, C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        if (Intrinsics.EZpvd(interfaceC56687yOp.bR_(), c56935yXu)) {
            return C56402yEa.EZpvd(interfaceC56687yOp);
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) ysm.AEQbTJ(c56935yXu), (java.lang.Iterable) ysm.EZpvd(c56935yXu));
    }

    public final boolean OLrzqt(InterfaceC56687yOp interfaceC56687yOp) {
        C56754yRb c56754yRb = C56754yRb.KWHzl;
        C56935yXu c56935yXuBR_ = interfaceC56687yOp.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        if (!c56754yRb.KWHzl(c56935yXuBR_)) {
            return false;
        }
        C56935yXu c56935yXuBR_2 = interfaceC56687yOp.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_2, "");
        java.util.Set<InterfaceC56687yOp> setCopydefault = copydefault(c56935yXuBR_2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = setCopydefault.iterator();
        while (it.hasNext()) {
            yNG yngKWHzl = C56754yRb.KWHzl((yNG) it.next());
            if (yngKWHzl != null) {
                arrayList.add(yngKWHzl);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (OLrzqt(interfaceC56687yOp, (yNG) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final java.util.Collection<InterfaceC56687yOp> AEQbTJ(C56935yXu c56935yXu) {
        java.util.Collection<InterfaceC56835yUb> collectionCopydefault = fARcdN().invoke().copydefault(c56935yXu);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collectionCopydefault, 10));
        java.util.Iterator<T> it = collectionCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((InterfaceC56835yUb) it.next()));
        }
        return arrayList;
    }

    public final java.util.Collection<InterfaceC56687yOp> EZpvd(C56935yXu c56935yXu) {
        java.util.Set<InterfaceC56687yOp> setCopydefault = copydefault(c56935yXu);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setCopydefault) {
            InterfaceC56687yOp interfaceC56687yOp = (InterfaceC56687yOp) obj;
            if (!yRG.KWHzl(interfaceC56687yOp) && C56754yRb.KWHzl((yNG) interfaceC56687yOp) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean AEQbTJ(InterfaceC56687yOp interfaceC56687yOp) {
        SpecialGenericSignatures.Activity activity = SpecialGenericSignatures.OLrzqt;
        C56935yXu c56935yXuBR_ = interfaceC56687yOp.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        C56935yXu c56935yXuEZpvd = activity.EZpvd(c56935yXuBR_);
        if (c56935yXuEZpvd == null) {
            return false;
        }
        java.util.Set<InterfaceC56687yOp> setCopydefault = copydefault(c56935yXuEZpvd);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setCopydefault) {
            if (yRG.KWHzl((InterfaceC56687yOp) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        InterfaceC56687yOp interfaceC56687yOpEZpvd = EZpvd(interfaceC56687yOp, c56935yXuEZpvd);
        if (arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (EZpvd((InterfaceC56687yOp) it.next(), (yNG) interfaceC56687yOpEZpvd)) {
                return true;
            }
        }
        return false;
    }

    public final boolean KWHzl(InterfaceC56687yOp interfaceC56687yOp) {
        InterfaceC56687yOp interfaceC56687yOpCopydefault = copydefault(interfaceC56687yOp);
        if (interfaceC56687yOpCopydefault == null) {
            return false;
        }
        C56935yXu c56935yXuBR_ = interfaceC56687yOp.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        java.util.Set<InterfaceC56687yOp> setCopydefault = copydefault(c56935yXuBR_);
        if ((setCopydefault instanceof java.util.Collection) && setCopydefault.isEmpty()) {
            return false;
        }
        for (InterfaceC56687yOp interfaceC56687yOp2 : setCopydefault) {
            if (interfaceC56687yOp2.AxsJAY() && EZpvd((InterfaceC56657yNm) interfaceC56687yOpCopydefault, (InterfaceC56657yNm) interfaceC56687yOp2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC56687yOp copydefault(InterfaceC56687yOp interfaceC56687yOp) {
        C56933yXs c56933yXsDjBIcL;
        C56930yXp c56930yXpValueOf;
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = interfaceC56687yOp.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        InterfaceC56695yOx interfaceC56695yOx = (InterfaceC56695yOx) CollectionsKt___CollectionsKt.wlaJM(listFetchVPNInfo);
        if (interfaceC56695yOx != null) {
            InterfaceC56663yNs interfaceC56663yNsOLrzqt = interfaceC56695yOx.uzCIH().djBIcL().OLrzqt();
            if (interfaceC56663yNsOLrzqt == null || (c56930yXpValueOf = yZE.valueOf(interfaceC56663yNsOLrzqt)) == null) {
                c56933yXsDjBIcL = null;
                if (!Intrinsics.EZpvd(c56933yXsDjBIcL, yMB.valueOf)) {
                    interfaceC56695yOx = null;
                }
                if (interfaceC56695yOx != null) {
                    yNG.StateListAnimator<? extends InterfaceC56687yOp> stateListAnimatorSSMYrx = interfaceC56687yOp.sSMYrx();
                    java.util.List<InterfaceC56695yOx> listFetchVPNInfo2 = interfaceC56687yOp.fetchVPNInfo();
                    Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo2, "");
                    InterfaceC56687yOp interfaceC56687yOp2 = (InterfaceC56687yOp) stateListAnimatorSSMYrx.OLrzqt(CollectionsKt___CollectionsKt.AYXKKw((java.util.List) listFetchVPNInfo2, 1)).EZpvd(interfaceC56695yOx.uzCIH().bY_().get(0).OLrzqt()).AEQbTJ();
                    yPK ypk = (yPK) interfaceC56687yOp2;
                    if (ypk != null) {
                        ypk.values(true);
                    }
                    return interfaceC56687yOp2;
                }
            } else {
                if (!c56930yXpValueOf.copydefault()) {
                    c56930yXpValueOf = null;
                }
                if (c56930yXpValueOf != null) {
                    c56933yXsDjBIcL = c56930yXpValueOf.djBIcL();
                }
                if (!Intrinsics.EZpvd(c56933yXsDjBIcL, yMB.valueOf)) {
                }
                if (interfaceC56695yOx != null) {
                }
            }
        }
        return null;
    }

    public final InterfaceC56687yOp EZpvd(InterfaceC56687yOp interfaceC56687yOp, C56935yXu c56935yXu) {
        yNG.StateListAnimator<? extends InterfaceC56687yOp> stateListAnimatorSSMYrx = interfaceC56687yOp.sSMYrx();
        stateListAnimatorSSMYrx.copydefault(c56935yXu);
        stateListAnimatorSSMYrx.valueOf();
        stateListAnimatorSSMYrx.EZpvd();
        yNG yngAEQbTJ = stateListAnimatorSSMYrx.AEQbTJ();
        Intrinsics.copydefault(yngAEQbTJ);
        return (InterfaceC56687yOp) yngAEQbTJ;
    }

    public final boolean EZpvd(InterfaceC56687yOp interfaceC56687yOp, yNG yng) {
        if (yQW.EZpvd.copydefault(interfaceC56687yOp)) {
            yng = yng.ejfBZ();
        }
        Intrinsics.copydefault(yng);
        return EZpvd(yng, interfaceC56687yOp);
    }

    public final boolean EZpvd(InterfaceC56657yNm interfaceC56657yNm, InterfaceC56657yNm interfaceC56657yNm2) {
        OverridingUtil.OverrideCompatibilityInfo.Result resultKWHzl = OverridingUtil.OLrzqt.KWHzl(interfaceC56657yNm2, interfaceC56657yNm, true).KWHzl();
        Intrinsics.checkNotNullExpressionValue(resultKWHzl, "");
        return resultKWHzl == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.OLrzqt(interfaceC56657yNm2, interfaceC56657yNm);
    }

    public final InterfaceC56687yOp AEQbTJ(InterfaceC56676yOe interfaceC56676yOe, Function1<? super C56935yXu, ? extends java.util.Collection<? extends InterfaceC56687yOp>> function1) {
        InterfaceC56675yOd interfaceC56675yOdEjfBZ = interfaceC56676yOe.ejfBZ();
        InterfaceC56675yOd interfaceC56675yOd = interfaceC56675yOdEjfBZ != null ? (InterfaceC56675yOd) yRG.gEmmrt(interfaceC56675yOdEjfBZ) : null;
        java.lang.String strEZpvd = interfaceC56675yOd != null ? C56761yRi.copydefault.EZpvd(interfaceC56675yOd) : null;
        if (strEZpvd != null && !yRG.OLrzqt(values(), interfaceC56675yOd)) {
            return KWHzl(interfaceC56676yOe, strEZpvd, function1);
        }
        java.lang.String strAEQbTJ = interfaceC56676yOe.bR_().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return KWHzl(interfaceC56676yOe, C56777yRy.copydefault(strAEQbTJ), function1);
    }

    public final InterfaceC56687yOp KWHzl(InterfaceC56676yOe interfaceC56676yOe, java.lang.String str, Function1<? super C56935yXu, ? extends java.util.Collection<? extends InterfaceC56687yOp>> function1) {
        InterfaceC56687yOp interfaceC56687yOp;
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        java.util.Iterator<T> it = function1.invoke(c56935yXuAEQbTJ).iterator();
        do {
            interfaceC56687yOp = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC56687yOp interfaceC56687yOp2 = (InterfaceC56687yOp) it.next();
            if (interfaceC56687yOp2.fetchVPNInfo().size() == 0) {
                InterfaceC59284zeD interfaceC59284zeD = InterfaceC59284zeD.OLrzqt;
                AbstractC59233zdF abstractC59233zdFGEmmrt = interfaceC56687yOp2.gEmmrt();
                if (abstractC59233zdFGEmmrt != null && interfaceC59284zeD.copydefault(abstractC59233zdFGEmmrt, interfaceC56676yOe.uzCIH())) {
                    interfaceC56687yOp = interfaceC56687yOp2;
                }
            }
        } while (interfaceC56687yOp == null);
        return interfaceC56687yOp;
    }

    public final InterfaceC56687yOp copydefault(InterfaceC56676yOe interfaceC56676yOe, Function1<? super C56935yXu, ? extends java.util.Collection<? extends InterfaceC56687yOp>> function1) {
        InterfaceC56687yOp interfaceC56687yOp;
        AbstractC59233zdF abstractC59233zdFGEmmrt;
        java.lang.String strAEQbTJ = interfaceC56676yOe.bR_().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(C56777yRy.OLrzqt(strAEQbTJ));
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        java.util.Iterator<T> it = function1.invoke(c56935yXuAEQbTJ).iterator();
        do {
            interfaceC56687yOp = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC56687yOp interfaceC56687yOp2 = (InterfaceC56687yOp) it.next();
            if (interfaceC56687yOp2.fetchVPNInfo().size() == 1 && (abstractC59233zdFGEmmrt = interfaceC56687yOp2.gEmmrt()) != null && AbstractC56640yMw.fIwbmz(abstractC59233zdFGEmmrt)) {
                InterfaceC59284zeD interfaceC59284zeD = InterfaceC59284zeD.OLrzqt;
                java.util.List<InterfaceC56695yOx> listFetchVPNInfo = interfaceC56687yOp2.fetchVPNInfo();
                Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
                if (interfaceC59284zeD.OLrzqt(((InterfaceC56695yOx) CollectionsKt___CollectionsKt.gHZMYf(listFetchVPNInfo)).uzCIH(), interfaceC56676yOe.uzCIH())) {
                    interfaceC56687yOp = interfaceC56687yOp2;
                }
            }
        } while (interfaceC56687yOp == null);
        return interfaceC56687yOp;
    }

    public final boolean KWHzl(InterfaceC56676yOe interfaceC56676yOe, Function1<? super C56935yXu, ? extends java.util.Collection<? extends InterfaceC56687yOp>> function1) {
        if (ySC.AEQbTJ(interfaceC56676yOe)) {
            return false;
        }
        InterfaceC56687yOp interfaceC56687yOpAEQbTJ = AEQbTJ(interfaceC56676yOe, function1);
        InterfaceC56687yOp interfaceC56687yOpCopydefault = copydefault(interfaceC56676yOe, function1);
        if (interfaceC56687yOpAEQbTJ == null) {
            return false;
        }
        if (interfaceC56676yOe.AubY()) {
            return interfaceC56687yOpCopydefault != null && interfaceC56687yOpCopydefault.isConnected() == interfaceC56687yOpAEQbTJ.isConnected();
        }
        return true;
    }

    @Override // o.AbstractC56812yTf
    public void AEQbTJ(@NotNull java.util.Collection<InterfaceC56687yOp> collection, @NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        java.util.Set<InterfaceC56687yOp> setCopydefault = copydefault(c56935yXu);
        if (!SpecialGenericSignatures.OLrzqt.KWHzl(c56935yXu) && !C56754yRb.KWHzl.KWHzl(c56935yXu)) {
            java.util.Set<InterfaceC56687yOp> set = setCopydefault;
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                java.util.Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (((yNG) it.next()).AxsJAY()) {
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : set) {
                if (EZpvd((InterfaceC56687yOp) obj)) {
                    arrayList.add(obj);
                }
            }
            KWHzl(collection, c56935yXu, arrayList, false);
            return;
        }
        C59388zgB c59388zgBOLrzqt = C59388zgB.AEQbTJ.OLrzqt();
        java.util.Collection<? extends InterfaceC56687yOp> collectionOLrzqt = yRO.OLrzqt(c56935yXu, setCopydefault, yDY.AhwBna(), values(), InterfaceC59148zba.KWHzl, fetchVPNInfo().copydefault().AkhnZx().KWHzl());
        Intrinsics.checkNotNullExpressionValue(collectionOLrzqt, "");
        OLrzqt(c56935yXu, collection, collectionOLrzqt, collection, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        OLrzqt(c56935yXu, collection, collectionOLrzqt, c59388zgBOLrzqt, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : setCopydefault) {
            if (EZpvd((InterfaceC56687yOp) obj2)) {
                arrayList2.add(obj2);
            }
        }
        KWHzl(collection, c56935yXu, CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList2, (java.lang.Iterable) c59388zgBOLrzqt), true);
    }

    public final void KWHzl(java.util.Collection<InterfaceC56687yOp> collection, C56935yXu c56935yXu, java.util.Collection<? extends InterfaceC56687yOp> collection2, boolean z) {
        java.util.Collection<? extends InterfaceC56687yOp> collectionOLrzqt = yRO.OLrzqt(c56935yXu, collection2, collection, values(), fetchVPNInfo().copydefault().OLrzqt(), fetchVPNInfo().copydefault().AkhnZx().KWHzl());
        Intrinsics.checkNotNullExpressionValue(collectionOLrzqt, "");
        if (!z) {
            collection.addAll(collectionOLrzqt);
            return;
        }
        java.util.Collection<? extends InterfaceC56687yOp> collection3 = collectionOLrzqt;
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) collection, (java.lang.Iterable) collection3);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection3, 10));
        for (InterfaceC56687yOp interfaceC56687yOpAEQbTJ : collection3) {
            InterfaceC56687yOp interfaceC56687yOp = (InterfaceC56687yOp) yRG.AYXKKw(interfaceC56687yOpAEQbTJ);
            if (interfaceC56687yOp == null) {
                Intrinsics.copydefault(interfaceC56687yOpAEQbTJ);
            } else {
                Intrinsics.copydefault(interfaceC56687yOpAEQbTJ);
                interfaceC56687yOpAEQbTJ = AEQbTJ(interfaceC56687yOpAEQbTJ, interfaceC56687yOp, listDjBIcL);
            }
            arrayList.add(interfaceC56687yOpAEQbTJ);
        }
        collection.addAll(arrayList);
    }

    public final void OLrzqt(C56935yXu c56935yXu, java.util.Collection<? extends InterfaceC56687yOp> collection, java.util.Collection<? extends InterfaceC56687yOp> collection2, java.util.Collection<InterfaceC56687yOp> collection3, Function1<? super C56935yXu, ? extends java.util.Collection<? extends InterfaceC56687yOp>> function1) {
        for (InterfaceC56687yOp interfaceC56687yOp : collection2) {
            C59433zgu.EZpvd(collection3, AEQbTJ(interfaceC56687yOp, function1, c56935yXu, collection));
            C59433zgu.EZpvd(collection3, copydefault(interfaceC56687yOp, function1, collection));
            C59433zgu.EZpvd(collection3, AEQbTJ(interfaceC56687yOp, function1));
        }
    }

    public final InterfaceC56687yOp copydefault(InterfaceC56687yOp interfaceC56687yOp, Function1<? super C56935yXu, ? extends java.util.Collection<? extends InterfaceC56687yOp>> function1, java.util.Collection<? extends InterfaceC56687yOp> collection) {
        InterfaceC56687yOp interfaceC56687yOpAEQbTJ;
        yNG yngKWHzl = C56754yRb.KWHzl((yNG) interfaceC56687yOp);
        if (yngKWHzl == null || (interfaceC56687yOpAEQbTJ = AEQbTJ(yngKWHzl, function1)) == null) {
            return null;
        }
        if (!EZpvd(interfaceC56687yOpAEQbTJ)) {
            interfaceC56687yOpAEQbTJ = null;
        }
        if (interfaceC56687yOpAEQbTJ != null) {
            return AEQbTJ(interfaceC56687yOpAEQbTJ, yngKWHzl, collection);
        }
        return null;
    }

    public final InterfaceC56687yOp AEQbTJ(InterfaceC56687yOp interfaceC56687yOp, Function1<? super C56935yXu, ? extends java.util.Collection<? extends InterfaceC56687yOp>> function1, C56935yXu c56935yXu, java.util.Collection<? extends InterfaceC56687yOp> collection) {
        InterfaceC56687yOp interfaceC56687yOp2 = (InterfaceC56687yOp) yRG.gEmmrt(interfaceC56687yOp);
        if (interfaceC56687yOp2 == null) {
            return null;
        }
        java.lang.String strOLrzqt = yRG.OLrzqt(interfaceC56687yOp2);
        Intrinsics.copydefault((java.lang.Object) strOLrzqt);
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(strOLrzqt);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        java.util.Iterator<? extends InterfaceC56687yOp> it = function1.invoke(c56935yXuAEQbTJ).iterator();
        while (it.hasNext()) {
            InterfaceC56687yOp interfaceC56687yOpEZpvd = EZpvd(it.next(), c56935yXu);
            if (EZpvd(interfaceC56687yOp2, (yNG) interfaceC56687yOpEZpvd)) {
                return AEQbTJ(interfaceC56687yOpEZpvd, interfaceC56687yOp2, collection);
            }
        }
        return null;
    }

    public final InterfaceC56687yOp AEQbTJ(InterfaceC56687yOp interfaceC56687yOp, Function1<? super C56935yXu, ? extends java.util.Collection<? extends InterfaceC56687yOp>> function1) {
        if (!interfaceC56687yOp.AxsJAY()) {
            return null;
        }
        C56935yXu c56935yXuBR_ = interfaceC56687yOp.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        java.util.Iterator<T> it = function1.invoke(c56935yXuBR_).iterator();
        while (it.hasNext()) {
            InterfaceC56687yOp interfaceC56687yOpCopydefault = copydefault((InterfaceC56687yOp) it.next());
            if (interfaceC56687yOpCopydefault == null || !EZpvd((InterfaceC56657yNm) interfaceC56687yOpCopydefault, (InterfaceC56657yNm) interfaceC56687yOp)) {
                interfaceC56687yOpCopydefault = null;
            }
            if (interfaceC56687yOpCopydefault != null) {
                return interfaceC56687yOpCopydefault;
            }
        }
        return null;
    }

    public final InterfaceC56687yOp AEQbTJ(InterfaceC56687yOp interfaceC56687yOp, InterfaceC56657yNm interfaceC56657yNm, java.util.Collection<? extends InterfaceC56687yOp> collection) {
        java.util.Collection<? extends InterfaceC56687yOp> collection2 = collection;
        if ((collection2 instanceof java.util.Collection) && collection2.isEmpty()) {
            return interfaceC56687yOp;
        }
        for (InterfaceC56687yOp interfaceC56687yOp2 : collection2) {
            if (!Intrinsics.EZpvd(interfaceC56687yOp, interfaceC56687yOp2) && interfaceC56687yOp2.uzCIH() == null && EZpvd(interfaceC56687yOp2, interfaceC56657yNm)) {
                yNG yngAEQbTJ = interfaceC56687yOp.sSMYrx().copydefault().AEQbTJ();
                Intrinsics.copydefault(yngAEQbTJ);
                return (InterfaceC56687yOp) yngAEQbTJ;
            }
        }
        return interfaceC56687yOp;
    }

    /* JADX DEBUG: Type inference failed for r6v2. Raw type applied. Possible types: o.yNm$Application<java.lang.Boolean>, o.yNm$Application<V> */
    public final InterfaceC56687yOp AEQbTJ(yNG yng, Function1<? super C56935yXu, ? extends java.util.Collection<? extends InterfaceC56687yOp>> function1) {
        java.lang.Object next;
        C56935yXu c56935yXuBR_ = yng.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        java.util.Iterator<T> it = function1.invoke(c56935yXuBR_).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (OLrzqt((InterfaceC56687yOp) next, yng)) {
                break;
            }
        }
        InterfaceC56687yOp interfaceC56687yOp = (InterfaceC56687yOp) next;
        if (interfaceC56687yOp == null) {
            return null;
        }
        yNG.StateListAnimator<? extends InterfaceC56687yOp> stateListAnimatorSSMYrx = interfaceC56687yOp.sSMYrx();
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = yng.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo, 10));
        java.util.Iterator<T> it2 = listFetchVPNInfo.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC56695yOx) it2.next()).uzCIH());
        }
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo2 = interfaceC56687yOp.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo2, "");
        stateListAnimatorSSMYrx.OLrzqt(C56785ySf.EZpvd(arrayList, listFetchVPNInfo2, yng));
        stateListAnimatorSSMYrx.valueOf();
        stateListAnimatorSSMYrx.EZpvd();
        stateListAnimatorSSMYrx.KWHzl(JavaMethodDescriptor.EZpvd, java.lang.Boolean.TRUE);
        return (InterfaceC56687yOp) stateListAnimatorSSMYrx.AEQbTJ();
    }

    public final java.util.Set<InterfaceC56687yOp> copydefault(C56935yXu c56935yXu) {
        java.util.Collection<AbstractC59233zdF> collectionGEmmrt = gEmmrt();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.util.Iterator<T> it = collectionGEmmrt.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(linkedHashSet, ((AbstractC59233zdF) it.next()).OLrzqt().AEQbTJ(c56935yXu, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // o.AbstractC56812yTf
    public void KWHzl(@NotNull java.util.Collection<InterfaceC56687yOp> collection, @NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        if (this.EZpvd.wlaJM() && fARcdN().invoke().AEQbTJ(c56935yXu) != null) {
            java.util.Collection<InterfaceC56687yOp> collection2 = collection;
            if (collection2.isEmpty()) {
                InterfaceC56841yUh interfaceC56841yUhAEQbTJ = fARcdN().invoke().AEQbTJ(c56935yXu);
                Intrinsics.copydefault(interfaceC56841yUhAEQbTJ);
                collection.add(AEQbTJ(interfaceC56841yUhAEQbTJ));
            } else {
                java.util.Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC56687yOp) it.next()).fetchVPNInfo().isEmpty()) {
                        break;
                    }
                }
                InterfaceC56841yUh interfaceC56841yUhAEQbTJ2 = fARcdN().invoke().AEQbTJ(c56935yXu);
                Intrinsics.copydefault(interfaceC56841yUhAEQbTJ2);
                collection.add(AEQbTJ(interfaceC56841yUhAEQbTJ2));
            }
        }
        fetchVPNInfo().copydefault().hDKMBd().EZpvd(values(), c56935yXu, collection, fetchVPNInfo());
    }

    public final JavaMethodDescriptor AEQbTJ(InterfaceC56841yUh interfaceC56841yUh) {
        JavaMethodDescriptor javaMethodDescriptorAEQbTJ = JavaMethodDescriptor.AEQbTJ((InterfaceC56665yNu) values(), C56795ySp.OLrzqt(fetchVPNInfo(), interfaceC56841yUh), interfaceC56841yUh.fIwbmz(), (InterfaceC56686yOo) fetchVPNInfo().copydefault().AuCTel().KWHzl(interfaceC56841yUh), true);
        Intrinsics.checkNotNullExpressionValue(javaMethodDescriptorAEQbTJ, "");
        javaMethodDescriptorAEQbTJ.EZpvd(null, AYXKKw(), yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna(), fetchVPNInfo().AYXKKw().EZpvd(interfaceC56841yUh.OLrzqt(), C56831yTy.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null)), Modality.Companion.EZpvd(false, false, true), C56669yNy.fetchVPNInfo, null);
        javaMethodDescriptorAEQbTJ.EZpvd(false, false);
        fetchVPNInfo().copydefault().AhwBna().AEQbTJ(interfaceC56841yUh, javaMethodDescriptorAEQbTJ);
        return javaMethodDescriptorAEQbTJ;
    }

    @Override // o.AbstractC56812yTf
    public void EZpvd(@NotNull C56935yXu c56935yXu, @NotNull java.util.Collection<InterfaceC56676yOe> collection) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(collection, "");
        if (this.EZpvd.AuCTelauCTel()) {
            copydefault(c56935yXu, collection);
        }
        java.util.Set<InterfaceC56676yOe> setKWHzl = KWHzl(c56935yXu);
        if (setKWHzl.isEmpty()) {
            return;
        }
        C59388zgB.Activity activity = C59388zgB.AEQbTJ;
        C59388zgB c59388zgBOLrzqt = activity.OLrzqt();
        C59388zgB c59388zgBOLrzqt2 = activity.OLrzqt();
        EZpvd(setKWHzl, collection, c59388zgBOLrzqt, new ySV(this));
        EZpvd(yEJ.EZpvd((java.util.Set) setKWHzl, (java.lang.Iterable) c59388zgBOLrzqt), c59388zgBOLrzqt2, (java.util.Set<InterfaceC56676yOe>) null, new ySW(this));
        java.util.Collection<? extends InterfaceC56676yOe> collectionOLrzqt = yRO.OLrzqt(c56935yXu, yEJ.KWHzl(setKWHzl, c59388zgBOLrzqt2), collection, values(), fetchVPNInfo().copydefault().OLrzqt(), fetchVPNInfo().copydefault().AkhnZx().KWHzl());
        Intrinsics.checkNotNullExpressionValue(collectionOLrzqt, "");
        collection.addAll(collectionOLrzqt);
    }

    public static final java.util.Collection OLrzqt(ySM ysm, C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return ysm.AEQbTJ(c56935yXu);
    }

    public static final java.util.Collection djBIcL(ySM ysm, C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return ysm.EZpvd(c56935yXu);
    }

    public final void EZpvd(java.util.Set<? extends InterfaceC56676yOe> set, java.util.Collection<InterfaceC56676yOe> collection, java.util.Set<InterfaceC56676yOe> set2, Function1<? super C56935yXu, ? extends java.util.Collection<? extends InterfaceC56687yOp>> function1) {
        for (InterfaceC56676yOe interfaceC56676yOe : set) {
            C56788ySi c56788ySiEZpvd = EZpvd(interfaceC56676yOe, function1);
            if (c56788ySiEZpvd != null) {
                collection.add(c56788ySiEZpvd);
                if (set2 != null) {
                    set2.add(interfaceC56676yOe);
                    return;
                }
                return;
            }
        }
    }

    public final void copydefault(C56935yXu c56935yXu, java.util.Collection<InterfaceC56676yOe> collection) {
        InterfaceC56835yUb interfaceC56835yUb = (InterfaceC56835yUb) CollectionsKt___CollectionsKt.iRxXKY(fARcdN().invoke().copydefault(c56935yXu));
        if (interfaceC56835yUb == null) {
            return;
        }
        collection.add(createPropertyDescriptorWithDefaultGetter$default(this, interfaceC56835yUb, null, Modality.FINAL, 2, null));
    }

    public static /* synthetic */ C56788ySi createPropertyDescriptorWithDefaultGetter$default(ySM ysm, InterfaceC56835yUb interfaceC56835yUb, AbstractC59233zdF abstractC59233zdF, Modality modality, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            abstractC59233zdF = null;
        }
        return ysm.KWHzl(interfaceC56835yUb, abstractC59233zdF, modality);
    }

    public final C56788ySi KWHzl(InterfaceC56835yUb interfaceC56835yUb, AbstractC59233zdF abstractC59233zdF, Modality modality) {
        C56788ySi c56788ySiKWHzl = C56788ySi.KWHzl(values(), C56795ySp.OLrzqt(fetchVPNInfo(), interfaceC56835yUb), modality, yRN.OLrzqt(interfaceC56835yUb.iwGUEr()), false, interfaceC56835yUb.fIwbmz(), fetchVPNInfo().copydefault().AuCTel().KWHzl(interfaceC56835yUb), false);
        Intrinsics.checkNotNullExpressionValue(c56788ySiKWHzl, "");
        yPL yplCopydefault = yYI.copydefault(c56788ySiKWHzl, yOL.KWHzl.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(yplCopydefault, "");
        c56788ySiKWHzl.AEQbTJ(yplCopydefault, (InterfaceC56680yOi) null);
        AbstractC59233zdF abstractC59233zdFOLrzqt = abstractC59233zdF == null ? OLrzqt(interfaceC56835yUb, C56784ySe.childForMethod$default(fetchVPNInfo(), c56788ySiKWHzl, interfaceC56835yUb, 0, 4, null)) : abstractC59233zdF;
        c56788ySiKWHzl.AEQbTJ(abstractC59233zdFOLrzqt, yDY.AhwBna(), AYXKKw(), null, yDY.AhwBna());
        yplCopydefault.OLrzqt(abstractC59233zdFOLrzqt);
        return c56788ySiKWHzl;
    }

    public final C56788ySi EZpvd(InterfaceC56676yOe interfaceC56676yOe, Function1<? super C56935yXu, ? extends java.util.Collection<? extends InterfaceC56687yOp>> function1) {
        InterfaceC56687yOp interfaceC56687yOpCopydefault;
        yPN ypnAEQbTJ = null;
        if (!KWHzl(interfaceC56676yOe, function1)) {
            return null;
        }
        InterfaceC56687yOp interfaceC56687yOpAEQbTJ = AEQbTJ(interfaceC56676yOe, function1);
        Intrinsics.copydefault(interfaceC56687yOpAEQbTJ);
        if (interfaceC56676yOe.AubY()) {
            interfaceC56687yOpCopydefault = copydefault(interfaceC56676yOe, function1);
            Intrinsics.copydefault(interfaceC56687yOpCopydefault);
        } else {
            interfaceC56687yOpCopydefault = null;
        }
        if (interfaceC56687yOpCopydefault != null) {
            interfaceC56687yOpCopydefault.isConnected();
            interfaceC56687yOpAEQbTJ.isConnected();
        }
        C56783ySd c56783ySd = new C56783ySd(values(), interfaceC56687yOpAEQbTJ, interfaceC56687yOpCopydefault, interfaceC56676yOe);
        AbstractC59233zdF abstractC59233zdFGEmmrt = interfaceC56687yOpAEQbTJ.gEmmrt();
        Intrinsics.copydefault(abstractC59233zdFGEmmrt);
        c56783ySd.AEQbTJ(abstractC59233zdFGEmmrt, yDY.AhwBna(), AYXKKw(), null, yDY.AhwBna());
        yPL yplAEQbTJ = yYI.AEQbTJ(c56783ySd, interfaceC56687yOpAEQbTJ.copydefault(), false, false, false, interfaceC56687yOpAEQbTJ.fARcdN());
        yplAEQbTJ.AEQbTJ(interfaceC56687yOpAEQbTJ);
        yplAEQbTJ.OLrzqt(c56783ySd.uzCIH());
        Intrinsics.checkNotNullExpressionValue(yplAEQbTJ, "");
        if (interfaceC56687yOpCopydefault != null) {
            java.util.List<InterfaceC56695yOx> listFetchVPNInfo = interfaceC56687yOpCopydefault.fetchVPNInfo();
            Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
            InterfaceC56695yOx interfaceC56695yOx = (InterfaceC56695yOx) CollectionsKt___CollectionsKt.firstOrNull(listFetchVPNInfo);
            if (interfaceC56695yOx == null) {
                throw new java.lang.AssertionError("No parameter found for " + interfaceC56687yOpCopydefault);
            }
            ypnAEQbTJ = yYI.AEQbTJ(c56783ySd, interfaceC56687yOpCopydefault.copydefault(), interfaceC56695yOx.copydefault(), false, false, false, interfaceC56687yOpCopydefault.getNewProxyInstance(), interfaceC56687yOpCopydefault.fARcdN());
            ypnAEQbTJ.AEQbTJ(interfaceC56687yOpCopydefault);
        }
        c56783ySd.AEQbTJ(yplAEQbTJ, ypnAEQbTJ);
        return c56783ySd;
    }

    public final java.util.Set<InterfaceC56676yOe> KWHzl(C56935yXu c56935yXu) {
        java.util.Collection<AbstractC59233zdF> collectionGEmmrt = gEmmrt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = collectionGEmmrt.iterator();
        while (it.hasNext()) {
            java.util.Collection<? extends InterfaceC56676yOe> collectionCopydefault = ((AbstractC59233zdF) it.next()).OLrzqt().copydefault(c56935yXu, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(collectionCopydefault, 10));
            java.util.Iterator<T> it2 = collectionCopydefault.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC56676yOe) it2.next());
            }
            C56406yEe.KWHzl(arrayList, arrayList2);
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList);
    }

    public final java.util.Collection<AbstractC59233zdF> gEmmrt() {
        if (this.AhwBna) {
            java.util.Collection<AbstractC59233zdF> collectionBV_ = values().fJNWhG().bV_();
            Intrinsics.checkNotNullExpressionValue(collectionBV_, "");
            return collectionBV_;
        }
        return fetchVPNInfo().copydefault().AkhnZx().EZpvd().OLrzqt(values());
    }

    @Override // o.AbstractC56812yTf
    public AbstractC56812yTf.StateListAnimator EZpvd(@NotNull InterfaceC56835yUb interfaceC56835yUb, @NotNull java.util.List<? extends InterfaceC56691yOt> list, @NotNull AbstractC59233zdF abstractC59233zdF, @NotNull java.util.List<? extends InterfaceC56695yOx> list2) {
        Intrinsics.checkNotNullParameter(interfaceC56835yUb, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(list2, "");
        InterfaceC56782ySc.ActionBar actionBarCopydefault = fetchVPNInfo().copydefault().ejfBZ().copydefault(interfaceC56835yUb, values(), abstractC59233zdF, null, list2, list);
        Intrinsics.checkNotNullExpressionValue(actionBarCopydefault, "");
        AbstractC59233zdF abstractC59233zdFEZpvd = actionBarCopydefault.EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFEZpvd, "");
        AbstractC59233zdF abstractC59233zdFOLrzqt = actionBarCopydefault.OLrzqt();
        java.util.List<InterfaceC56695yOx> listCopydefault = actionBarCopydefault.copydefault();
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        java.util.List<InterfaceC56691yOt> listAEQbTJ = actionBarCopydefault.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(listAEQbTJ, "");
        boolean zValueOf = actionBarCopydefault.valueOf();
        java.util.List<java.lang.String> listKWHzl = actionBarCopydefault.KWHzl();
        Intrinsics.checkNotNullExpressionValue(listKWHzl, "");
        return new AbstractC56812yTf.StateListAnimator(abstractC59233zdFEZpvd, abstractC59233zdFOLrzqt, listCopydefault, listAEQbTJ, zValueOf, listKWHzl);
    }

    public final boolean OLrzqt(InterfaceC56687yOp interfaceC56687yOp, yNG yng) {
        java.lang.String strComputeJvmDescriptor$default = C56896yWi.computeJvmDescriptor$default(interfaceC56687yOp, false, false, 2, null);
        yNG yngFJNWhG = yng.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(yngFJNWhG, "");
        return Intrinsics.EZpvd((java.lang.Object) strComputeJvmDescriptor$default, (java.lang.Object) C56896yWi.computeJvmDescriptor$default(yngFJNWhG, false, false, 2, null)) && !EZpvd((InterfaceC56657yNm) interfaceC56687yOp, (InterfaceC56657yNm) yng);
    }

    public final yRZ copydefault(yTZ ytz) {
        InterfaceC56658yNn interfaceC56658yNnValues = values();
        yRZ yrzEZpvd = yRZ.EZpvd(interfaceC56658yNnValues, C56795ySp.OLrzqt(fetchVPNInfo(), ytz), false, fetchVPNInfo().copydefault().AuCTel().KWHzl(ytz));
        Intrinsics.checkNotNullExpressionValue(yrzEZpvd, "");
        C56794ySo c56794ySoAEQbTJ = C56784ySe.AEQbTJ(fetchVPNInfo(), yrzEZpvd, ytz, interfaceC56658yNnValues.AkhnZx().size());
        AbstractC56812yTf.Application applicationOLrzqt = OLrzqt(c56794ySoAEQbTJ, yrzEZpvd, ytz.AhwBna());
        java.util.List<InterfaceC56691yOt> listAkhnZx = interfaceC56658yNnValues.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
        java.util.List<InterfaceC56843yUj> newProxyInstance = ytz.getNewProxyInstance();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(newProxyInstance, 10));
        java.util.Iterator<T> it = newProxyInstance.iterator();
        while (it.hasNext()) {
            InterfaceC56691yOt interfaceC56691yOtOLrzqt = c56794ySoAEQbTJ.AhwBna().OLrzqt((InterfaceC56843yUj) it.next());
            Intrinsics.copydefault(interfaceC56691yOtOLrzqt);
            arrayList.add(interfaceC56691yOtOLrzqt);
        }
        yrzEZpvd.EZpvd(applicationOLrzqt.KWHzl(), yRN.OLrzqt(ytz.iwGUEr()), CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAkhnZx, (java.lang.Iterable) arrayList));
        yrzEZpvd.EZpvd(false);
        yrzEZpvd.copydefault(applicationOLrzqt.AEQbTJ());
        yrzEZpvd.EZpvd(interfaceC56658yNnValues.bQ_());
        c56794ySoAEQbTJ.copydefault().AhwBna().KWHzl(ytz, yrzEZpvd);
        return yrzEZpvd;
    }

    public final InterfaceC56656yNl valueOf() {
        java.util.List<InterfaceC56695yOx> listEmptyList;
        boolean zAuCTelauCTel = this.EZpvd.AuCTelauCTel();
        if ((this.EZpvd.AubY() || !this.EZpvd.getFieldNames()) && !zAuCTelauCTel) {
            return null;
        }
        InterfaceC56658yNn interfaceC56658yNnValues = values();
        yRZ yrzEZpvd = yRZ.EZpvd(interfaceC56658yNnValues, yOL.KWHzl.OLrzqt(), true, fetchVPNInfo().copydefault().AuCTel().KWHzl(this.EZpvd));
        Intrinsics.checkNotNullExpressionValue(yrzEZpvd, "");
        if (zAuCTelauCTel) {
            listEmptyList = OLrzqt(yrzEZpvd);
        } else {
            listEmptyList = Collections.emptyList();
        }
        yrzEZpvd.copydefault(false);
        yrzEZpvd.AEQbTJ(listEmptyList, AEQbTJ(interfaceC56658yNnValues));
        yrzEZpvd.EZpvd(true);
        yrzEZpvd.EZpvd(interfaceC56658yNnValues.bQ_());
        fetchVPNInfo().copydefault().AhwBna().KWHzl(this.EZpvd, yrzEZpvd);
        return yrzEZpvd;
    }

    public final yNC AEQbTJ(InterfaceC56658yNn interfaceC56658yNn) {
        yNC newProxyInstance = interfaceC56658yNn.getNewProxyInstance();
        Intrinsics.checkNotNullExpressionValue(newProxyInstance, "");
        if (!Intrinsics.EZpvd(newProxyInstance, C56771yRs.AEQbTJ)) {
            return newProxyInstance;
        }
        yNC ync = C56771yRs.copydefault;
        Intrinsics.checkNotNullExpressionValue(ync, "");
        return ync;
    }

    public final java.util.List<InterfaceC56695yOx> OLrzqt(C56707yPi c56707yPi) {
        kotlin.Pair pair;
        java.util.Collection<InterfaceC56835yUb> collectionValues = this.EZpvd.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionValues.size());
        C56829yTw attributes$default = C56831yTy.toAttributes$default(TypeUsage.COMMON, true, false, null, 6, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : collectionValues) {
            if (Intrinsics.EZpvd(((InterfaceC56835yUb) obj).fIwbmz(), yRE.OLrzqt)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        kotlin.Pair pair2 = new kotlin.Pair(arrayList2, arrayList3);
        java.util.List list = (java.util.List) pair2.component1();
        java.util.List<InterfaceC56835yUb> list2 = (java.util.List) pair2.component2();
        list.size();
        InterfaceC56835yUb interfaceC56835yUb = (InterfaceC56835yUb) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (interfaceC56835yUb != null) {
            InterfaceC56839yUf interfaceC56839yUfValueOf = interfaceC56835yUb.valueOf();
            if (interfaceC56839yUfValueOf instanceof yTS) {
                yTS yts = (yTS) interfaceC56839yUfValueOf;
                pair = new kotlin.Pair(fetchVPNInfo().AYXKKw().EZpvd(yts, attributes$default, true), fetchVPNInfo().AYXKKw().EZpvd(yts.copydefault(), attributes$default));
            } else {
                pair = new kotlin.Pair(fetchVPNInfo().AYXKKw().EZpvd(interfaceC56839yUfValueOf, attributes$default), null);
            }
            OLrzqt(arrayList, c56707yPi, 0, interfaceC56835yUb, (AbstractC59233zdF) pair.component1(), (AbstractC59233zdF) pair.component2());
        }
        int i = interfaceC56835yUb != null ? 1 : 0;
        int i2 = 0;
        for (InterfaceC56835yUb interfaceC56835yUb2 : list2) {
            OLrzqt(arrayList, c56707yPi, i2 + i, interfaceC56835yUb2, fetchVPNInfo().AYXKKw().EZpvd(interfaceC56835yUb2.valueOf(), attributes$default), null);
            i2++;
        }
        return arrayList;
    }

    public final void OLrzqt(java.util.List<InterfaceC56695yOx> list, InterfaceC56660yNp interfaceC56660yNp, int i, InterfaceC56835yUb interfaceC56835yUb, AbstractC59233zdF abstractC59233zdF, AbstractC59233zdF abstractC59233zdF2) {
        yOL yolOLrzqt = yOL.KWHzl.OLrzqt();
        C56935yXu c56935yXuFIwbmz = interfaceC56835yUb.fIwbmz();
        AbstractC59233zdF abstractC59233zdFAhwBna = C59322zep.AhwBna(abstractC59233zdF);
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFAhwBna, "");
        list.add(new yPP(interfaceC56660yNp, null, i, yolOLrzqt, c56935yXuFIwbmz, abstractC59233zdFAhwBna, interfaceC56835yUb.djBIcL(), false, false, abstractC59233zdF2 != null ? C59322zep.AhwBna(abstractC59233zdF2) : null, fetchVPNInfo().copydefault().AuCTel().KWHzl(interfaceC56835yUb)));
    }

    public static final java.util.Set copydefault(ySM ysm) {
        return CollectionsKt___CollectionsKt.OqFWZa(ysm.EZpvd.djBIcL());
    }

    public static final java.util.Set KWHzl(C56794ySo c56794ySo, ySM ysm) {
        return CollectionsKt___CollectionsKt.OqFWZa(c56794ySo.copydefault().hDKMBd().EZpvd(ysm.values(), c56794ySo));
    }

    public static final java.util.Map EZpvd(ySM ysm) {
        java.util.Collection<yTW> collectionAhwBna = ysm.EZpvd.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionAhwBna) {
            if (((yTW) obj).gEmmrt()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
        for (java.lang.Object obj2 : arrayList) {
            linkedHashMap.put(((yTW) obj2).fIwbmz(), obj2);
        }
        return linkedHashMap;
    }

    public static final InterfaceC56658yNn KWHzl(ySM ysm, C56794ySo c56794ySo, C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        if (ysm.KWHzl.invoke().contains(c56935yXu)) {
            InterfaceC56764yRl interfaceC56764yRlCopydefault = c56794ySo.copydefault().copydefault();
            C56929yXo c56929yXoEZpvd = yZE.EZpvd((InterfaceC56663yNs) ysm.values());
            Intrinsics.copydefault(c56929yXoEZpvd);
            yTT yttEZpvd = interfaceC56764yRlCopydefault.EZpvd(new InterfaceC56764yRl.TaskDescription(c56929yXoEZpvd.EZpvd(c56935yXu), null, ysm.EZpvd, 2, null));
            if (yttEZpvd != null) {
                ySE yse = new ySE(c56794ySo, ysm.values(), yttEZpvd, null, 8, null);
                c56794ySo.copydefault().EZpvd().OLrzqt(yse);
                return yse;
            }
        } else if (ysm.AEQbTJ.invoke().contains(c56935yXu)) {
            java.util.List<InterfaceC56658yNn> listOLrzqt = C56402yEa.OLrzqt();
            c56794ySo.copydefault().hDKMBd().EZpvd(ysm.values(), c56935yXu, listOLrzqt, c56794ySo);
            java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
            int size = listFARcdN.size();
            if (size != 0) {
                if (size == 1) {
                    return (InterfaceC56658yNn) CollectionsKt___CollectionsKt.gHZMYf(listFARcdN);
                }
                throw new java.lang.IllegalStateException(("Multiple classes with same name are generated: " + listFARcdN).toString());
            }
        } else {
            yTW ytw = ysm.copydefault.invoke().get(c56935yXu);
            if (ytw != null) {
                return C56712yPn.AEQbTJ(c56794ySo.EZpvd(), ysm.values(), c56935yXu, c56794ySo.EZpvd().KWHzl(new ySS(ysm)), C56795ySp.OLrzqt(c56794ySo, ytw), c56794ySo.copydefault().AuCTel().KWHzl(ytw));
            }
        }
        return null;
    }

    public static final java.util.Set AhwBna(ySM ysm) {
        return yEJ.KWHzl(ysm.AEQbTJ(), ysm.bP_());
    }

    @Override // o.AbstractC56812yTf
    public InterfaceC56679yOh AYXKKw() {
        return yYH.EZpvd((InterfaceC56665yNu) values());
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        InterfaceC59179zcE<C56935yXu, InterfaceC56658yNn> interfaceC59179zcE;
        InterfaceC56658yNn interfaceC56658yNnInvoke;
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        OLrzqt(c56935yXu, yqv);
        ySM ysm = (ySM) ejfBZ();
        return (ysm == null || (interfaceC59179zcE = ysm.valueOf) == null || (interfaceC56658yNnInvoke = interfaceC59179zcE.invoke(c56935yXu)) == null) ? this.valueOf.invoke(c56935yXu) : interfaceC56658yNnInvoke;
    }

    @Override // o.AbstractC56812yTf, o.AbstractC59100zaf, o.InterfaceC59098zad, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        OLrzqt(c56935yXu, yqv);
        return super.AEQbTJ(c56935yXu, yqv);
    }

    @Override // o.AbstractC56812yTf, o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Collection<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        OLrzqt(c56935yXu, yqv);
        return super.copydefault(c56935yXu, yqv);
    }

    @Override // o.AbstractC56812yTf
    public java.util.Set<C56935yXu> OLrzqt(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        return yEJ.KWHzl(this.KWHzl.invoke(), this.copydefault.invoke().keySet());
    }

    @Override // o.AbstractC56812yTf
    public java.util.Set<C56935yXu> AEQbTJ(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        if (this.EZpvd.AuCTelauCTel()) {
            return AEQbTJ();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(fARcdN().invoke().copydefault());
        java.util.Collection<AbstractC59233zdF> collectionBV_ = values().fJNWhG().bV_();
        Intrinsics.checkNotNullExpressionValue(collectionBV_, "");
        java.util.Iterator<T> it = collectionBV_.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(linkedHashSet, ((AbstractC59233zdF) it.next()).OLrzqt().bP_());
        }
        return linkedHashSet;
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        yQU.EZpvd(fetchVPNInfo().copydefault().DbNXlk(), yqv, values(), c56935yXu);
    }

    @Override // o.AbstractC56812yTf
    public java.lang.String toString() {
        return "Lazy Java member scope for " + this.EZpvd.valueOf();
    }
}
