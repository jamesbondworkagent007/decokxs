package o;

import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import o.AbstractC59316zej;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zen, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59320zen {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final C59271zdr AEQbTJ;
    public final C59312zef EZpvd;
    public final InterfaceC59181zcG<ActionBar, AbstractC59233zdF> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final LockBasedStorageManager gEmmrt;

    public C59320zen(@NotNull C59271zdr c59271zdr, @NotNull C59312zef c59312zef) {
        Intrinsics.checkNotNullParameter(c59271zdr, "");
        Intrinsics.checkNotNullParameter(c59312zef, "");
        this.AEQbTJ = c59271zdr;
        this.EZpvd = c59312zef;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.gEmmrt = lockBasedStorageManager;
        this.OLrzqt = C56392yDr.copydefault(new C59319zem(this));
        InterfaceC59181zcG<ActionBar, AbstractC59233zdF> interfaceC59181zcGAEQbTJ = lockBasedStorageManager.AEQbTJ(new C59321zeo(this));
        Intrinsics.checkNotNullExpressionValue(interfaceC59181zcGAEQbTJ, "");
        this.KWHzl = interfaceC59181zcGAEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 o.zdr)
  (wrap:o.zef:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.zef:0x0007: CONSTRUCTOR false, false A[MD:(boolean, boolean):void (m), WRAPPED] (LINE:19) call: o.zef.<init>(boolean, boolean):void type: CONSTRUCTOR) : (r2v0 o.zef))
 A[MD:(o.zdr, o.zef):void (m)] (LINE:17) call: o.zen.<init>(o.zdr, o.zef):void type: THIS */
    public /* synthetic */ C59320zen(C59271zdr c59271zdr, C59312zef c59312zef, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c59271zdr, (i & 2) != 0 ? new C59312zef(false, false) : c59312zef);
    }

    public final C59366zfg copydefault() {
        return (C59366zfg) this.OLrzqt.getValue();
    }

    public static final C59366zfg KWHzl(C59320zen c59320zen) {
        return C59370zfk.EZpvd(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, c59320zen.toString());
    }

    /* JADX INFO: renamed from: o.zen$ActionBar */
    public static final class ActionBar {
        public final InterfaceC56691yOt AEQbTJ;
        public final C59274zdu EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C59274zdu AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56691yOt copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.AEQbTJ + ", typeAttr=" + this.EZpvd + ')';
        }

        public ActionBar(@NotNull InterfaceC56691yOt interfaceC56691yOt, @NotNull C59274zdu c59274zdu) {
            Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
            Intrinsics.checkNotNullParameter(c59274zdu, "");
            this.AEQbTJ = interfaceC56691yOt;
            this.EZpvd = c59274zdu;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(actionBar.AEQbTJ, this.AEQbTJ) && Intrinsics.EZpvd(actionBar.EZpvd, this.EZpvd);
        }

        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            return iHashCode + (iHashCode * 31) + this.EZpvd.hashCode();
        }
    }

    public static final AbstractC59233zdF copydefault(C59320zen c59320zen, ActionBar actionBar) {
        return c59320zen.copydefault(actionBar.copydefault(), actionBar.AEQbTJ());
    }

    public final AbstractC59233zdF AEQbTJ(@NotNull InterfaceC56691yOt interfaceC56691yOt, @NotNull C59274zdu c59274zdu) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        Intrinsics.checkNotNullParameter(c59274zdu, "");
        AbstractC59233zdF abstractC59233zdFInvoke = this.KWHzl.invoke(new ActionBar(interfaceC56691yOt, c59274zdu));
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFInvoke, "");
        return abstractC59233zdFInvoke;
    }

    public final AbstractC59233zdF copydefault(C59274zdu c59274zdu) {
        AbstractC59233zdF abstractC59233zdFIsConnected;
        AbstractC59242zdO abstractC59242zdOCopydefault = c59274zdu.copydefault();
        return (abstractC59242zdOCopydefault == null || (abstractC59233zdFIsConnected = C59336zfC.isConnected(abstractC59242zdOCopydefault)) == null) ? copydefault() : abstractC59233zdFIsConnected;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.zej.Activity.createByConstructorsMap$default(o.zej$Activity, java.util.Map, boolean, int, java.lang.Object):o.zej */
    public final AbstractC59233zdF copydefault(InterfaceC56691yOt interfaceC56691yOt, C59274zdu c59274zdu) {
        InterfaceC59317zek interfaceC59317zekOLrzqt;
        java.util.Set<InterfaceC56691yOt> setEZpvd = c59274zdu.EZpvd();
        if (setEZpvd != null && setEZpvd.contains(interfaceC56691yOt.bS_())) {
            return copydefault(c59274zdu);
        }
        AbstractC59242zdO abstractC59242zdOBQ_ = interfaceC56691yOt.bQ_();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOBQ_, "");
        java.util.Set<InterfaceC56691yOt> setOLrzqt = C59336zfC.OLrzqt(abstractC59242zdOBQ_, setEZpvd);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(setOLrzqt, 10)), 16));
        for (InterfaceC56691yOt interfaceC56691yOt2 : setOLrzqt) {
            if (setEZpvd == null || !setEZpvd.contains(interfaceC56691yOt2)) {
                interfaceC59317zekOLrzqt = this.AEQbTJ.OLrzqt(interfaceC56691yOt2, c59274zdu, this, AEQbTJ(interfaceC56691yOt2, c59274zdu.AEQbTJ(interfaceC56691yOt)));
            } else {
                interfaceC59317zekOLrzqt = C59322zep.EZpvd(interfaceC56691yOt2, c59274zdu);
                Intrinsics.checkNotNullExpressionValue(interfaceC59317zekOLrzqt, "");
            }
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(interfaceC56691yOt2.fJNWhG(), interfaceC59317zekOLrzqt);
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        TypeSubstitutor typeSubstitutorEZpvd = TypeSubstitutor.EZpvd(AbstractC59316zej.Activity.createByConstructorsMap$default(AbstractC59316zej.AEQbTJ, linkedHashMap, false, 2, null));
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorEZpvd, "");
        java.util.List<AbstractC59233zdF> listDjBIcL = interfaceC56691yOt.djBIcL();
        Intrinsics.checkNotNullExpressionValue(listDjBIcL, "");
        java.util.Set<AbstractC59233zdF> setAEQbTJ = AEQbTJ(typeSubstitutorEZpvd, listDjBIcL, c59274zdu);
        if (!setAEQbTJ.isEmpty()) {
            if (!this.EZpvd.AEQbTJ()) {
                if (setAEQbTJ.size() != 1) {
                    throw new java.lang.IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
                }
                return (AbstractC59233zdF) CollectionsKt___CollectionsKt.hUfVAv(setAEQbTJ);
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(setAEQbTJ);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAxsJAYsNCnLh, 10));
            java.util.Iterator it = listAxsJAYsNCnLh.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC59233zdF) it.next()).AkhnZx());
            }
            return C59332zez.copydefault(arrayList);
        }
        return copydefault(c59274zdu);
    }

    public final java.util.Set<AbstractC59233zdF> AEQbTJ(TypeSubstitutor typeSubstitutor, java.util.List<? extends AbstractC59233zdF> list, C59274zdu c59274zdu) {
        java.util.Set setEZpvd = yED.EZpvd();
        for (AbstractC59233zdF abstractC59233zdF : list) {
            InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt();
            if (interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn) {
                setEZpvd.add(copydefault.copydefault(abstractC59233zdF, typeSubstitutor, c59274zdu.EZpvd(), this.EZpvd.KWHzl()));
            } else if (interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt) {
                java.util.Set<InterfaceC56691yOt> setEZpvd2 = c59274zdu.EZpvd();
                if (setEZpvd2 != null && setEZpvd2.contains(interfaceC56663yNsKWHzl)) {
                    setEZpvd.add(copydefault(c59274zdu));
                } else {
                    java.util.List<AbstractC59233zdF> listDjBIcL = ((InterfaceC56691yOt) interfaceC56663yNsKWHzl).djBIcL();
                    Intrinsics.checkNotNullExpressionValue(listDjBIcL, "");
                    setEZpvd.addAll(AEQbTJ(typeSubstitutor, listDjBIcL, c59274zdu));
                }
            }
            if (!this.EZpvd.AEQbTJ()) {
                break;
            }
        }
        return yED.copydefault(setEZpvd);
    }

    /* JADX INFO: renamed from: o.zen$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zen.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [175=6] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01c3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AbstractC59233zdF copydefault(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull TypeSubstitutor typeSubstitutor, java.util.Set<? extends InterfaceC56691yOt> set, boolean z) {
            AbstractC59331zey abstractC59331zeyReplace$default;
            AbstractC59233zdF abstractC59233zdFOLrzqt;
            AbstractC59233zdF abstractC59233zdFOLrzqt2;
            AbstractC59233zdF abstractC59233zdFOLrzqt3;
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
            Intrinsics.checkNotNullParameter(typeSubstitutor, "");
            AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
            if (abstractC59331zeyAkhnZx instanceof AbstractC59272zds) {
                AbstractC59272zds abstractC59272zds = (AbstractC59272zds) abstractC59331zeyAkhnZx;
                AbstractC59242zdO abstractC59242zdOValueOf = abstractC59272zds.valueOf();
                if (!abstractC59242zdOValueOf.djBIcL().copydefault().isEmpty() && abstractC59242zdOValueOf.djBIcL().OLrzqt() != null) {
                    java.util.List<InterfaceC56691yOt> listCopydefault = abstractC59242zdOValueOf.djBIcL().copydefault();
                    Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                    for (InterfaceC56691yOt interfaceC56691yOt : listCopydefault) {
                        InterfaceC59317zek c59250zdW = (InterfaceC59317zek) CollectionsKt___CollectionsKt.AkhnZx(abstractC59233zdF.bY_(), interfaceC56691yOt.AEQbTJ());
                        if (!z || c59250zdW == null || (abstractC59233zdFOLrzqt3 = c59250zdW.OLrzqt()) == null || C59336zfC.OLrzqt(abstractC59233zdFOLrzqt3)) {
                            boolean z2 = set != null && set.contains(interfaceC56691yOt);
                            if (c59250zdW == null || z2) {
                                c59250zdW = new C59250zdW(interfaceC56691yOt);
                            } else {
                                AbstractC59325zes abstractC59325zesKWHzl = typeSubstitutor.KWHzl();
                                AbstractC59233zdF abstractC59233zdFOLrzqt4 = c59250zdW.OLrzqt();
                                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt4, "");
                                if (abstractC59325zesKWHzl.copydefault(abstractC59233zdFOLrzqt4) == null) {
                                }
                            }
                        }
                        arrayList.add(c59250zdW);
                    }
                    abstractC59242zdOValueOf = C59326zet.replace$default(abstractC59242zdOValueOf, arrayList, null, 2, null);
                }
                AbstractC59242zdO abstractC59242zdOAYXKKw = abstractC59272zds.AYXKKw();
                if (!abstractC59242zdOAYXKKw.djBIcL().copydefault().isEmpty() && abstractC59242zdOAYXKKw.djBIcL().OLrzqt() != null) {
                    java.util.List<InterfaceC56691yOt> listCopydefault2 = abstractC59242zdOAYXKKw.djBIcL().copydefault();
                    Intrinsics.checkNotNullExpressionValue(listCopydefault2, "");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault2, 10));
                    for (InterfaceC56691yOt interfaceC56691yOt2 : listCopydefault2) {
                        InterfaceC59317zek c59250zdW2 = (InterfaceC59317zek) CollectionsKt___CollectionsKt.AkhnZx(abstractC59233zdF.bY_(), interfaceC56691yOt2.AEQbTJ());
                        if (!z || c59250zdW2 == null || (abstractC59233zdFOLrzqt2 = c59250zdW2.OLrzqt()) == null || C59336zfC.OLrzqt(abstractC59233zdFOLrzqt2)) {
                            boolean z3 = set != null && set.contains(interfaceC56691yOt2);
                            if (c59250zdW2 == null || z3) {
                                c59250zdW2 = new C59250zdW(interfaceC56691yOt2);
                            } else {
                                AbstractC59325zes abstractC59325zesKWHzl2 = typeSubstitutor.KWHzl();
                                AbstractC59233zdF abstractC59233zdFOLrzqt5 = c59250zdW2.OLrzqt();
                                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt5, "");
                                if (abstractC59325zesKWHzl2.copydefault(abstractC59233zdFOLrzqt5) == null) {
                                }
                            }
                        }
                        arrayList2.add(c59250zdW2);
                    }
                    abstractC59242zdOAYXKKw = C59326zet.replace$default(abstractC59242zdOAYXKKw, arrayList2, null, 2, null);
                }
                abstractC59331zeyReplace$default = C59231zdD.copydefault(abstractC59242zdOValueOf, abstractC59242zdOAYXKKw);
            } else {
                if (!(abstractC59331zeyAkhnZx instanceof AbstractC59242zdO)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC59242zdO abstractC59242zdO = (AbstractC59242zdO) abstractC59331zeyAkhnZx;
                if (abstractC59242zdO.djBIcL().copydefault().isEmpty() || abstractC59242zdO.djBIcL().OLrzqt() == null) {
                    abstractC59331zeyReplace$default = abstractC59242zdO;
                } else {
                    java.util.List<InterfaceC56691yOt> listCopydefault3 = abstractC59242zdO.djBIcL().copydefault();
                    Intrinsics.checkNotNullExpressionValue(listCopydefault3, "");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault3, 10));
                    for (InterfaceC56691yOt interfaceC56691yOt3 : listCopydefault3) {
                        InterfaceC59317zek c59250zdW3 = (InterfaceC59317zek) CollectionsKt___CollectionsKt.AkhnZx(abstractC59233zdF.bY_(), interfaceC56691yOt3.AEQbTJ());
                        if (!z || c59250zdW3 == null || (abstractC59233zdFOLrzqt = c59250zdW3.OLrzqt()) == null || C59336zfC.OLrzqt(abstractC59233zdFOLrzqt)) {
                            boolean z4 = set != null && set.contains(interfaceC56691yOt3);
                            if (c59250zdW3 == null || z4) {
                                c59250zdW3 = new C59250zdW(interfaceC56691yOt3);
                            } else {
                                AbstractC59325zes abstractC59325zesKWHzl3 = typeSubstitutor.KWHzl();
                                AbstractC59233zdF abstractC59233zdFOLrzqt6 = c59250zdW3.OLrzqt();
                                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt6, "");
                                if (abstractC59325zesKWHzl3.copydefault(abstractC59233zdFOLrzqt6) == null) {
                                }
                            }
                        }
                        arrayList3.add(c59250zdW3);
                    }
                    abstractC59331zeyReplace$default = C59326zet.replace$default(abstractC59242zdO, arrayList3, null, 2, null);
                }
            }
            AbstractC59233zdF abstractC59233zdFAEQbTJ = typeSubstitutor.AEQbTJ(C59327zeu.copydefault(abstractC59331zeyReplace$default, abstractC59331zeyAkhnZx), Variance.OUT_VARIANCE);
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFAEQbTJ, "");
            return abstractC59233zdFAEQbTJ;
        }
    }
}
