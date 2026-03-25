package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.sequences.Sequence;
import o.yNO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ySE extends AbstractC56708yPj implements InterfaceC56780ySa {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public static final java.util.Set<java.lang.String> copydefault = yEE.AhwBna("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    public final yOL AhwBna;
    public final Modality AuCTel;
    public final InterfaceC56658yNn EZpvd;
    public final InterfaceC59182zcH<java.util.List<InterfaceC56691yOt>> djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final ClassKind fIwbmz;
    public final yTT fJNWhG;
    public final boolean fetchVPNInfo;
    public final C56794ySo gEmmrt;
    public final C56794ySo getFieldNames;
    public final TaskDescription getNewProxyInstance;
    public final C56683yOl<ySM> hDKMBd;
    public final ySM iwGUEr;
    public final C56826yTt uzCIH;
    public final C59096zab valueOf;
    public final yOD wlaJM;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yTT AhwBna() {
        return this.fJNWhG;
    }

    @Override // o.InterfaceC56658yNn
    public boolean AuCTelauCTel() {
        return false;
    }

    @Override // o.InterfaceC56658yNn
    public boolean AubY() {
        return false;
    }

    @Override // o.InterfaceC56658yNn
    public boolean AwvSrB() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56658yNn
    public ClassKind DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOW, o.InterfaceC56658yNn
    public InterfaceC59098zad OcIXYQ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOB
    public yOL copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56658yNn
    public InterfaceC59098zad ejfBZ() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56663yNs
    public InterfaceC59315zei fJNWhG() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56659yNo
    public boolean gHZMYf() {
        return this.fetchVPNInfo;
    }

    @Override // o.yNJ
    public boolean hDKMBd() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56658yNn, o.yNJ
    public Modality isConnected() {
        return this.AuCTel;
    }

    @Override // o.InterfaceC56658yNn
    public yOA<AbstractC59242zdO> iwGUEr() {
        return null;
    }

    @Override // o.InterfaceC56658yNn
    public boolean sSMYrx() {
        return false;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC56656yNl uzCIH() {
        return null;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC56658yNn valueOf() {
        return null;
    }

    @Override // o.InterfaceC56658yNn
    public boolean wlaJM() {
        return false;
    }

    @Override // o.yNJ
    public boolean zLjUOn() {
        return false;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.ySo)
  (r2v0 o.yNu)
  (r3v0 o.yTT)
  (wrap:o.yNn:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.yNn) : (r4v0 o.yNn))
 A[MD:(o.ySo, o.yNu, o.yTT, o.yNn):void (m)] (LINE:42) call: o.ySE.<init>(o.ySo, o.yNu, o.yTT, o.yNn):void type: THIS */
    public /* synthetic */ ySE(C56794ySo c56794ySo, InterfaceC56665yNu interfaceC56665yNu, yTT ytt, InterfaceC56658yNn interfaceC56658yNn, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c56794ySo, interfaceC56665yNu, ytt, (i & 8) != 0 ? null : interfaceC56658yNn);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ySE(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yTT ytt, InterfaceC56658yNn interfaceC56658yNn) {
        ClassKind classKind;
        Modality modalityEZpvd;
        super(c56794ySo.EZpvd(), interfaceC56665yNu, ytt.fIwbmz(), c56794ySo.copydefault().AuCTel().KWHzl(ytt), false);
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(ytt, "");
        this.getFieldNames = c56794ySo;
        this.fJNWhG = ytt;
        this.EZpvd = interfaceC56658yNn;
        C56794ySo c56794ySoChildForClassOrPackage$default = C56784ySe.childForClassOrPackage$default(c56794ySo, this, ytt, 0, 4, null);
        this.gEmmrt = c56794ySoChildForClassOrPackage$default;
        c56794ySoChildForClassOrPackage$default.copydefault().AhwBna().OLrzqt(ytt, this);
        ytt.AkhnZx();
        this.ejfBZ = C56392yDr.copydefault(new ySJ(this));
        if (ytt.AuCTelauCTel()) {
            classKind = ClassKind.ANNOTATION_CLASS;
        } else if (ytt.AubY()) {
            classKind = ClassKind.INTERFACE;
        } else {
            classKind = ytt.zLjUOn() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        }
        this.fIwbmz = classKind;
        if (ytt.AuCTelauCTel() || ytt.zLjUOn()) {
            modalityEZpvd = Modality.FINAL;
        } else {
            modalityEZpvd = Modality.Companion.EZpvd(ytt.gHZMYf(), ytt.gHZMYf() || ytt.uzCIH() || ytt.AubY(), !ytt.zsXlph());
        }
        this.AuCTel = modalityEZpvd;
        this.wlaJM = ytt.iwGUEr();
        this.fetchVPNInfo = (ytt.AuCTel() == null || ytt.sSMYrx()) ? false : true;
        this.getNewProxyInstance = new TaskDescription();
        ySM ysm = new ySM(c56794ySoChildForClassOrPackage$default, this, ytt, interfaceC56658yNn != null, null, 16, null);
        this.iwGUEr = ysm;
        this.hDKMBd = C56683yOl.OLrzqt.EZpvd(this, c56794ySoChildForClassOrPackage$default.EZpvd(), c56794ySoChildForClassOrPackage$default.copydefault().AkhnZx().EZpvd(), new ySI(this));
        this.valueOf = new C59096zab(ysm);
        this.uzCIH = new C56826yTt(c56794ySoChildForClassOrPackage$default, ytt, this);
        this.AhwBna = C56795ySp.OLrzqt(c56794ySoChildForClassOrPackage$default, ytt);
        this.djBIcL = c56794ySoChildForClassOrPackage$default.EZpvd().KWHzl(new ySL(this));
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ySE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final java.util.List<yTO> values() {
        return (java.util.List) this.ejfBZ.getValue();
    }

    public static final java.util.List AYXKKw(ySE yse) {
        C56929yXo c56929yXoEZpvd = yZE.EZpvd((InterfaceC56663yNs) yse);
        if (c56929yXoEZpvd != null) {
            return yse.getFieldNames.copydefault().djBIcL().copydefault(c56929yXoEZpvd);
        }
        return null;
    }

    public static final class Application<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(yZE.EZpvd((InterfaceC56665yNu) t).KWHzl(), yZE.EZpvd((InterfaceC56665yNu) t2).KWHzl());
        }
    }

    @Override // o.InterfaceC56658yNn, o.yNJ, o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        if (Intrinsics.EZpvd(this.wlaJM, C56669yNy.AkhnZx) && this.fJNWhG.AuCTel() == null) {
            yNC ync = C56771yRs.EZpvd;
            Intrinsics.copydefault(ync);
            return ync;
        }
        return yRN.OLrzqt(this.wlaJM);
    }

    public static final ySM AEQbTJ(ySE yse, AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return new ySM(yse.gEmmrt, yse, yse.fJNWhG, yse.EZpvd != null, yse.iwGUEr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zad; */
    @Override // o.AbstractC56722yPx
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ySM AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return (ySM) this.hDKMBd.OLrzqt(abstractC59287zeG);
    }

    /* JADX DEBUG: Method merged with bridge method: ORxRYg()Lo/zad; */
    @Override // o.yOW, o.InterfaceC56658yNn
    /* JADX INFO: renamed from: AuCTel, reason: merged with bridge method [inline-methods] */
    public ySM ORxRYg() {
        InterfaceC59098zad interfaceC59098zadORxRYg = super.ORxRYg();
        Intrinsics.copydefault(interfaceC59098zadORxRYg, "");
        return (ySM) interfaceC59098zadORxRYg;
    }

    /* JADX DEBUG: Method merged with bridge method: djBIcL()Ljava/util/Collection; */
    @Override // o.InterfaceC56658yNn
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.util.List<InterfaceC56656yNl> djBIcL() {
        return this.iwGUEr.AhwBna().invoke();
    }

    public static final java.util.List EZpvd(ySE yse) {
        java.util.List<InterfaceC56843yUj> newProxyInstance = yse.fJNWhG.getNewProxyInstance();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(newProxyInstance, 10));
        for (InterfaceC56843yUj interfaceC56843yUj : newProxyInstance) {
            InterfaceC56691yOt interfaceC56691yOtOLrzqt = yse.gEmmrt.AhwBna().OLrzqt(interfaceC56843yUj);
            if (interfaceC56691yOtOLrzqt == null) {
                throw new java.lang.AssertionError("Parameter " + interfaceC56843yUj + " surely belongs to class " + yse.fJNWhG + ", so it must be resolved");
            }
            arrayList.add(interfaceC56691yOtOLrzqt);
        }
        return arrayList;
    }

    @Override // o.InterfaceC56658yNn, o.InterfaceC56659yNo
    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        return this.djBIcL.invoke();
    }

    @Override // o.InterfaceC56658yNn
    public java.util.Collection<InterfaceC56658yNn> fetchVPNInfo() {
        if (this.AuCTel == Modality.SEALED) {
            C56829yTw attributes$default = C56831yTy.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            Sequence<yTU> sequenceEjfBZ = this.fJNWhG.ejfBZ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<yTU> it = sequenceEjfBZ.iterator();
            while (it.hasNext()) {
                InterfaceC56663yNs interfaceC56663yNsOLrzqt = this.gEmmrt.AYXKKw().EZpvd(it.next(), attributes$default).djBIcL().OLrzqt();
                InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsOLrzqt instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsOLrzqt : null;
                if (interfaceC56658yNn != null) {
                    arrayList.add(interfaceC56658yNn);
                }
            }
            return CollectionsKt___CollectionsKt.EZpvd(arrayList, new Application());
        }
        return yDY.AhwBna();
    }

    public java.lang.String toString() {
        return "Lazy Java class " + yZE.valueOf(this);
    }

    public final class TaskDescription extends AbstractC59184zcJ {
        public final InterfaceC59182zcH<java.util.List<InterfaceC56691yOt>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/yNs; */
        @Override // o.AbstractC59184zcJ, o.AbstractC59262zdi, o.InterfaceC59315zei
        public InterfaceC56658yNn OLrzqt() {
            return ySE.this;
        }

        @Override // o.InterfaceC59315zei
        public boolean gEmmrt() {
            return true;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
            super(ySE.this.gEmmrt.EZpvd());
            this.EZpvd = ySE.this.gEmmrt.EZpvd().KWHzl(new ySK(ySE.this));
        }

        public static final java.util.List EZpvd(ySE yse) {
            return C56692yOu.copydefault((InterfaceC56659yNo) yse);
        }

        @Override // o.InterfaceC59315zei
        public java.util.List<InterfaceC56691yOt> copydefault() {
            return this.EZpvd.invoke();
        }

        @Override // o.AbstractC59197zcW
        public java.util.Collection<AbstractC59233zdF> AEQbTJ() {
            java.util.Collection<yTU> collectionHDKMBd = ySE.this.AhwBna().hDKMBd();
            java.util.ArrayList arrayList = new java.util.ArrayList(collectionHDKMBd.size());
            java.util.ArrayList<InterfaceC56839yUf> arrayList2 = new java.util.ArrayList(0);
            AbstractC59233zdF abstractC59233zdFAYXKKw = AYXKKw();
            java.util.Iterator<yTU> it = collectionHDKMBd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                yTU next = it.next();
                AbstractC59233zdF abstractC59233zdFEZpvd = ySE.this.gEmmrt.copydefault().fIwbmz().EZpvd(ySE.this.gEmmrt.AYXKKw().EZpvd(next, C56831yTy.toAttributes$default(TypeUsage.SUPERTYPE, false, false, null, 7, null)), ySE.this.gEmmrt);
                if (abstractC59233zdFEZpvd.djBIcL().OLrzqt() instanceof yNO.Activity) {
                    arrayList2.add(next);
                }
                if (!Intrinsics.EZpvd(abstractC59233zdFEZpvd.djBIcL(), abstractC59233zdFAYXKKw != null ? abstractC59233zdFAYXKKw.djBIcL() : null) && !AbstractC56640yMw.KWHzl(abstractC59233zdFEZpvd)) {
                    arrayList.add(abstractC59233zdFEZpvd);
                }
            }
            InterfaceC56658yNn interfaceC56658yNn = ySE.this.EZpvd;
            C59433zgu.EZpvd(arrayList, interfaceC56658yNn != null ? C56650yNf.EZpvd(interfaceC56658yNn, ySE.this).valueOf().OLrzqt(interfaceC56658yNn.bQ_(), Variance.INVARIANT) : null);
            C59433zgu.EZpvd(arrayList, abstractC59233zdFAYXKKw);
            if (!arrayList2.isEmpty()) {
                InterfaceC59148zba interfaceC59148zbaOLrzqt = ySE.this.gEmmrt.copydefault().OLrzqt();
                InterfaceC56658yNn interfaceC56658yNnOLrzqt = OLrzqt();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                for (InterfaceC56839yUf interfaceC56839yUf : arrayList2) {
                    Intrinsics.copydefault(interfaceC56839yUf, "");
                    arrayList3.add(((yTU) interfaceC56839yUf).AYXKKw());
                }
                interfaceC59148zbaOLrzqt.KWHzl(interfaceC56658yNnOLrzqt, arrayList3);
            }
            return arrayList.isEmpty() ^ true ? CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList) : C56402yEa.EZpvd(ySE.this.gEmmrt.AEQbTJ().AEQbTJ().AhwBna());
        }

        public final AbstractC59233zdF AYXKKw() {
            C56933yXs c56933yXsOLrzqt;
            java.util.ArrayList arrayList;
            C56933yXs c56933yXsAhwBna = AhwBna();
            if (c56933yXsAhwBna == null || c56933yXsAhwBna.AEQbTJ() || !c56933yXsAhwBna.OLrzqt(yMB.EZpvd)) {
                c56933yXsAhwBna = null;
            }
            if (c56933yXsAhwBna == null) {
                c56933yXsOLrzqt = C56768yRp.EZpvd.OLrzqt(yZE.EZpvd((InterfaceC56665yNu) ySE.this));
                if (c56933yXsOLrzqt == null) {
                    return null;
                }
            } else {
                c56933yXsOLrzqt = c56933yXsAhwBna;
            }
            InterfaceC56658yNn interfaceC56658yNnEZpvd = yZE.EZpvd(ySE.this.gEmmrt.AEQbTJ(), c56933yXsOLrzqt, NoLookupLocation.FROM_JAVA_LOADER);
            if (interfaceC56658yNnEZpvd == null) {
                return null;
            }
            int size = interfaceC56658yNnEZpvd.fJNWhG().copydefault().size();
            java.util.List<InterfaceC56691yOt> listCopydefault = ySE.this.fJNWhG().copydefault();
            Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
            int size2 = listCopydefault.size();
            if (size2 == size) {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                java.util.Iterator<T> it = listCopydefault.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C59323zeq(Variance.INVARIANT, ((InterfaceC56691yOt) it.next()).bQ_()));
                }
            } else {
                if (size2 != 1 || size <= 1 || c56933yXsAhwBna != null) {
                    return null;
                }
                C59323zeq c59323zeq = new C59323zeq(Variance.INVARIANT, ((InterfaceC56691yOt) CollectionsKt___CollectionsKt.gHZMYf(listCopydefault)).bQ_());
                kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, size);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(intRange, 10));
                java.util.Iterator<java.lang.Integer> it2 = intRange.iterator();
                while (it2.hasNext()) {
                    ((AbstractC56415yEn) it2).nextInt();
                    arrayList2.add(c59323zeq);
                }
                arrayList = arrayList2;
            }
            return C59231zdD.KWHzl(C59308zeb.OLrzqt.copydefault(), interfaceC56658yNnEZpvd, arrayList);
        }

        public final C56933yXs AhwBna() {
            java.lang.String strKWHzl;
            yOL yolCopydefault = ySE.this.copydefault();
            C56933yXs c56933yXs = yRE.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c56933yXs, "");
            yOJ yojEZpvd = yolCopydefault.EZpvd(c56933yXs);
            if (yojEZpvd == null) {
                return null;
            }
            java.lang.Object objIRxXKY = CollectionsKt___CollectionsKt.iRxXKY(yojEZpvd.OLrzqt().values());
            C56993yZy c56993yZy = objIRxXKY instanceof C56993yZy ? (C56993yZy) objIRxXKY : null;
            if (c56993yZy == null || (strKWHzl = c56993yZy.KWHzl()) == null || !C56931yXq.AEQbTJ(strKWHzl)) {
                return null;
            }
            return new C56933yXs(strKWHzl);
        }

        @Override // o.AbstractC59197zcW
        public InterfaceC56685yOn djBIcL() {
            return ySE.this.gEmmrt.copydefault().iwGUEr();
        }

        public java.lang.String toString() {
            java.lang.String strAEQbTJ = ySE.this.bR_().AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            return strAEQbTJ;
        }
    }

    public final ySE AEQbTJ(@NotNull yRX yrx, InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(yrx, "");
        C56794ySo c56794ySo = this.gEmmrt;
        C56794ySo c56794ySoAEQbTJ = C56784ySe.AEQbTJ(c56794ySo, c56794ySo.copydefault().AEQbTJ(yrx));
        InterfaceC56665yNu interfaceC56665yNuAuCTel = AuCTel();
        Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAuCTel, "");
        return new ySE(c56794ySoAEQbTJ, interfaceC56665yNuAuCTel, this.fJNWhG, interfaceC56658yNn);
    }
}
