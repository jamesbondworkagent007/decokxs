package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yTC {
    public final yTE EZpvd;
    public final C59320zen KWHzl;
    public final C56794ySo OLrzqt;
    public final InterfaceC56802ySw copydefault;

    public yTC(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56802ySw interfaceC56802ySw) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56802ySw, "");
        this.OLrzqt = c56794ySo;
        this.copydefault = interfaceC56802ySw;
        yTE yte = new yTE();
        this.EZpvd = yte;
        this.KWHzl = new C59320zen(yte, null, 2, 0 == true ? 1 : 0);
    }

    public final AbstractC59233zdF EZpvd(InterfaceC56839yUf interfaceC56839yUf, @NotNull C56829yTw c56829yTw) {
        AbstractC59233zdF abstractC59233zdFEZpvd;
        AbstractC59242zdO abstractC59242zdOSSMYrx;
        Intrinsics.checkNotNullParameter(c56829yTw, "");
        if (interfaceC56839yUf instanceof InterfaceC56842yUi) {
            PrimitiveType primitiveTypeCopydefault = ((InterfaceC56842yUi) interfaceC56839yUf).copydefault();
            if (primitiveTypeCopydefault != null) {
                abstractC59242zdOSSMYrx = this.OLrzqt.AEQbTJ().AEQbTJ().copydefault(primitiveTypeCopydefault);
            } else {
                abstractC59242zdOSSMYrx = this.OLrzqt.AEQbTJ().AEQbTJ().sSMYrx();
            }
            Intrinsics.copydefault(abstractC59242zdOSSMYrx);
            return abstractC59242zdOSSMYrx;
        }
        if (interfaceC56839yUf instanceof yTU) {
            return KWHzl((yTU) interfaceC56839yUf, c56829yTw);
        }
        if (interfaceC56839yUf instanceof yTS) {
            return transformArrayType$default(this, (yTS) interfaceC56839yUf, c56829yTw, false, 4, null);
        }
        if (interfaceC56839yUf instanceof InterfaceC56845yUl) {
            InterfaceC56839yUf interfaceC56839yUfCopydefault = ((InterfaceC56845yUl) interfaceC56839yUf).copydefault();
            if (interfaceC56839yUfCopydefault != null && (abstractC59233zdFEZpvd = EZpvd(interfaceC56839yUfCopydefault, c56829yTw)) != null) {
                return abstractC59233zdFEZpvd;
            }
            AbstractC59242zdO abstractC59242zdOAuCTel = this.OLrzqt.AEQbTJ().AEQbTJ().AuCTel();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOAuCTel, "");
            return abstractC59242zdOAuCTel;
        }
        if (interfaceC56839yUf == null) {
            AbstractC59242zdO abstractC59242zdOAuCTel2 = this.OLrzqt.AEQbTJ().AEQbTJ().AuCTel();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOAuCTel2, "");
            return abstractC59242zdOAuCTel2;
        }
        throw new java.lang.UnsupportedOperationException("Unsupported type: " + interfaceC56839yUf);
    }

    public static /* synthetic */ AbstractC59233zdF transformArrayType$default(yTC ytc, yTS yts, C56829yTw c56829yTw, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return ytc.EZpvd(yts, c56829yTw, z);
    }

    public final AbstractC59233zdF EZpvd(@NotNull yTS yts, @NotNull C56829yTw c56829yTw, boolean z) {
        Intrinsics.checkNotNullParameter(yts, "");
        Intrinsics.checkNotNullParameter(c56829yTw, "");
        InterfaceC56839yUf interfaceC56839yUfCopydefault = yts.copydefault();
        InterfaceC56842yUi interfaceC56842yUi = interfaceC56839yUfCopydefault instanceof InterfaceC56842yUi ? (InterfaceC56842yUi) interfaceC56839yUfCopydefault : null;
        PrimitiveType primitiveTypeCopydefault = interfaceC56842yUi != null ? interfaceC56842yUi.copydefault() : null;
        C56792ySm c56792ySm = new C56792ySm(this.OLrzqt, yts, true);
        if (primitiveTypeCopydefault != null) {
            AbstractC59242zdO abstractC59242zdOAEQbTJ = this.OLrzqt.AEQbTJ().AEQbTJ().AEQbTJ(primitiveTypeCopydefault);
            Intrinsics.copydefault(abstractC59242zdOAEQbTJ);
            AbstractC59233zdF abstractC59233zdFCopydefault = C59336zfC.copydefault(abstractC59242zdOAEQbTJ, new yOT(abstractC59242zdOAEQbTJ.copydefault(), c56792ySm));
            Intrinsics.copydefault(abstractC59233zdFCopydefault, "");
            AbstractC59242zdO abstractC59242zdO = (AbstractC59242zdO) abstractC59233zdFCopydefault;
            return c56829yTw.AEQbTJ() ? abstractC59242zdO : C59231zdD.copydefault(abstractC59242zdO, abstractC59242zdO.AEQbTJ(true));
        }
        AbstractC59233zdF abstractC59233zdFEZpvd = EZpvd(interfaceC56839yUfCopydefault, C56831yTy.toAttributes$default(TypeUsage.COMMON, c56829yTw.AEQbTJ(), false, null, 6, null));
        if (c56829yTw.AEQbTJ()) {
            AbstractC59242zdO abstractC59242zdOOLrzqt = this.OLrzqt.AEQbTJ().AEQbTJ().OLrzqt(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, abstractC59233zdFEZpvd, c56792ySm);
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOOLrzqt, "");
            return abstractC59242zdOOLrzqt;
        }
        AbstractC59242zdO abstractC59242zdOOLrzqt2 = this.OLrzqt.AEQbTJ().AEQbTJ().OLrzqt(Variance.INVARIANT, abstractC59233zdFEZpvd, c56792ySm);
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOOLrzqt2, "");
        return C59231zdD.copydefault(abstractC59242zdOOLrzqt2, this.OLrzqt.AEQbTJ().AEQbTJ().OLrzqt(Variance.OUT_VARIANCE, abstractC59233zdFEZpvd, c56792ySm).AEQbTJ(true));
    }

    public static final C59366zfg KWHzl(yTU ytu) {
        return C59370zfk.EZpvd(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, ytu.AYXKKw());
    }

    public final AbstractC59233zdF KWHzl(yTU ytu, C56829yTw c56829yTw) {
        boolean z = (c56829yTw.AEQbTJ() || c56829yTw.OLrzqt() == TypeUsage.SUPERTYPE) ? false : true;
        boolean zDjBIcL = ytu.djBIcL();
        if (!zDjBIcL && !z) {
            AbstractC59242zdO abstractC59242zdOEZpvd = EZpvd(ytu, c56829yTw, (AbstractC59242zdO) null);
            return abstractC59242zdOEZpvd != null ? abstractC59242zdOEZpvd : KWHzl(ytu);
        }
        AbstractC59242zdO abstractC59242zdOEZpvd2 = EZpvd(ytu, c56829yTw.KWHzl(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), (AbstractC59242zdO) null);
        if (abstractC59242zdOEZpvd2 == null) {
            return KWHzl(ytu);
        }
        AbstractC59242zdO abstractC59242zdOEZpvd3 = EZpvd(ytu, c56829yTw.KWHzl(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), abstractC59242zdOEZpvd2);
        if (abstractC59242zdOEZpvd3 == null) {
            return KWHzl(ytu);
        }
        if (zDjBIcL) {
            return new yTI(abstractC59242zdOEZpvd2, abstractC59242zdOEZpvd3);
        }
        return C59231zdD.copydefault(abstractC59242zdOEZpvd2, abstractC59242zdOEZpvd3);
    }

    public final AbstractC59242zdO EZpvd(yTU ytu, C56829yTw c56829yTw, AbstractC59242zdO abstractC59242zdO) {
        C59308zeb c59308zebAEQbTJ;
        if (abstractC59242zdO == null || (c59308zebAEQbTJ = abstractC59242zdO.bX_()) == null) {
            c59308zebAEQbTJ = C59314zeh.AEQbTJ(new C56792ySm(this.OLrzqt, ytu, false, 4, null));
        }
        C59308zeb c59308zeb = c59308zebAEQbTJ;
        InterfaceC59315zei interfaceC59315zeiOLrzqt = OLrzqt(ytu, c56829yTw);
        if (interfaceC59315zeiOLrzqt == null) {
            return null;
        }
        boolean zEZpvd = EZpvd(c56829yTw);
        if (Intrinsics.EZpvd(abstractC59242zdO != null ? abstractC59242zdO.djBIcL() : null, interfaceC59315zeiOLrzqt) && !ytu.djBIcL() && zEZpvd) {
            return abstractC59242zdO.AEQbTJ(true);
        }
        return C59231zdD.simpleType$default(c59308zeb, interfaceC59315zeiOLrzqt, EZpvd(ytu, c56829yTw, interfaceC59315zeiOLrzqt), zEZpvd, (AbstractC59287zeG) null, 16, (java.lang.Object) null);
    }

    public final InterfaceC59315zei OLrzqt(yTU ytu, C56829yTw c56829yTw) {
        InterfaceC59315zei interfaceC59315zeiFJNWhG;
        yTQ ytqCopydefault = ytu.copydefault();
        if (ytqCopydefault == null) {
            return copydefault(ytu);
        }
        if (ytqCopydefault instanceof yTT) {
            yTT ytt = (yTT) ytqCopydefault;
            C56933yXs c56933yXsValueOf = ytt.valueOf();
            if (c56933yXsValueOf == null) {
                throw new java.lang.AssertionError("Class type should have a FQ name: " + ytqCopydefault);
            }
            InterfaceC56658yNn interfaceC56658yNnEZpvd = EZpvd(ytu, c56829yTw, c56933yXsValueOf);
            if (interfaceC56658yNnEZpvd == null) {
                interfaceC56658yNnEZpvd = this.OLrzqt.copydefault().values().KWHzl(ytt);
            }
            return (interfaceC56658yNnEZpvd == null || (interfaceC59315zeiFJNWhG = interfaceC56658yNnEZpvd.fJNWhG()) == null) ? copydefault(ytu) : interfaceC59315zeiFJNWhG;
        }
        if (ytqCopydefault instanceof InterfaceC56843yUj) {
            InterfaceC56691yOt interfaceC56691yOtOLrzqt = this.copydefault.OLrzqt((InterfaceC56843yUj) ytqCopydefault);
            if (interfaceC56691yOtOLrzqt != null) {
                return interfaceC56691yOtOLrzqt.fJNWhG();
            }
            return null;
        }
        throw new java.lang.IllegalStateException("Unknown classifier kind: " + ytqCopydefault);
    }

    public final InterfaceC59315zei copydefault(yTU ytu) {
        InterfaceC59315zei interfaceC59315zeiFJNWhG = this.OLrzqt.copydefault().KWHzl().KWHzl().fARcdN().OLrzqt(C56929yXo.AEQbTJ.KWHzl(new C56933yXs(ytu.KWHzl())), C56402yEa.EZpvd(0)).fJNWhG();
        Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
        return interfaceC59315zeiFJNWhG;
    }

    public final InterfaceC56658yNn EZpvd(yTU ytu, C56829yTw c56829yTw, C56933yXs c56933yXs) {
        if (c56829yTw.AEQbTJ() && Intrinsics.EZpvd(c56933yXs, yTF.EZpvd)) {
            return this.OLrzqt.copydefault().fJNWhG().AEQbTJ();
        }
        yMP ymp = yMP.copydefault;
        InterfaceC56658yNn interfaceC56658yNnMapJavaToKotlin$default = yMP.mapJavaToKotlin$default(ymp, c56933yXs, this.OLrzqt.AEQbTJ().AEQbTJ(), null, 4, null);
        if (interfaceC56658yNnMapJavaToKotlin$default == null) {
            return null;
        }
        return (ymp.copydefault(interfaceC56658yNnMapJavaToKotlin$default) && (c56829yTw.KWHzl() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || c56829yTw.OLrzqt() == TypeUsage.SUPERTYPE || AEQbTJ(ytu, interfaceC56658yNnMapJavaToKotlin$default))) ? ymp.OLrzqt(interfaceC56658yNnMapJavaToKotlin$default) : interfaceC56658yNnMapJavaToKotlin$default;
    }

    public final boolean AEQbTJ(yTU ytu, InterfaceC56658yNn interfaceC56658yNn) {
        Variance varianceValues;
        if (!C56848yUo.AEQbTJ((InterfaceC56839yUf) CollectionsKt___CollectionsKt.wlaJM(ytu.valueOf()))) {
            return false;
        }
        java.util.List<InterfaceC56691yOt> listCopydefault = yMP.copydefault.OLrzqt(interfaceC56658yNn).fJNWhG().copydefault();
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        InterfaceC56691yOt interfaceC56691yOt = (InterfaceC56691yOt) CollectionsKt___CollectionsKt.wlaJM(listCopydefault);
        return (interfaceC56691yOt == null || (varianceValues = interfaceC56691yOt.values()) == null || varianceValues == Variance.OUT_VARIANCE) ? false : true;
    }

    public static final AbstractC59233zdF copydefault(yTC ytc, InterfaceC56691yOt interfaceC56691yOt, C56829yTw c56829yTw, InterfaceC59315zei interfaceC59315zei, yTU ytu) {
        C59320zen c59320zen = ytc.KWHzl;
        InterfaceC56663yNs interfaceC56663yNsKWHzl = interfaceC59315zei.OLrzqt();
        return c59320zen.AEQbTJ(interfaceC56691yOt, c56829yTw.AEQbTJ(interfaceC56663yNsKWHzl != null ? interfaceC56663yNsKWHzl.bQ_() : null).OLrzqt(ytu.djBIcL()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<InterfaceC59317zek> EZpvd(yTU ytu, C56829yTw c56829yTw, InterfaceC59315zei interfaceC59315zei) {
        boolean z = true;
        if (!ytu.djBIcL()) {
            if (ytu.valueOf().isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(interfaceC59315zei.copydefault(), "");
                if (!(!r0.isEmpty())) {
                    z = false;
                }
            }
        }
        java.util.List<InterfaceC56691yOt> listCopydefault = interfaceC59315zei.copydefault();
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        if (z) {
            return AEQbTJ(ytu, listCopydefault, interfaceC59315zei, c56829yTw);
        }
        if (listCopydefault.size() == ytu.valueOf().size()) {
            java.lang.Iterable<IndexedValue> iterableDCJXGO = CollectionsKt___CollectionsKt.DCJXGO(ytu.valueOf());
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterableDCJXGO, 10));
            for (IndexedValue indexedValue : iterableDCJXGO) {
                int iKWHzl = indexedValue.KWHzl();
                InterfaceC56839yUf interfaceC56839yUf = (InterfaceC56839yUf) indexedValue.EZpvd();
                listCopydefault.size();
                InterfaceC56691yOt interfaceC56691yOt = listCopydefault.get(iKWHzl);
                C56829yTw attributes$default = C56831yTy.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
                Intrinsics.copydefault(interfaceC56691yOt);
                arrayList.add(copydefault(interfaceC56839yUf, attributes$default, interfaceC56691yOt));
            }
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C59323zeq(C59370zfk.EZpvd(ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, ((InterfaceC56691yOt) it.next()).bR_().AEQbTJ())));
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
    }

    public final InterfaceC59317zek copydefault(InterfaceC56839yUf interfaceC56839yUf, C56829yTw c56829yTw, InterfaceC56691yOt interfaceC56691yOt) {
        if (interfaceC56839yUf instanceof InterfaceC56845yUl) {
            InterfaceC56845yUl interfaceC56845yUl = (InterfaceC56845yUl) interfaceC56839yUf;
            InterfaceC56839yUf interfaceC56839yUfCopydefault = interfaceC56845yUl.copydefault();
            Variance variance = interfaceC56845yUl.AhwBna() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
            if (interfaceC56839yUfCopydefault == null || copydefault(variance, interfaceC56691yOt)) {
                InterfaceC59317zek interfaceC59317zekEZpvd = C59322zep.EZpvd(interfaceC56691yOt, c56829yTw);
                Intrinsics.checkNotNullExpressionValue(interfaceC59317zekEZpvd, "");
                return interfaceC59317zekEZpvd;
            }
            yOJ yojEZpvd = yRN.EZpvd(this.OLrzqt, interfaceC56845yUl);
            AbstractC59233zdF abstractC59233zdFEZpvd = EZpvd(interfaceC56839yUfCopydefault, C56831yTy.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
            if (yojEZpvd != null) {
                abstractC59233zdFEZpvd = C59336zfC.copydefault(abstractC59233zdFEZpvd, yOL.KWHzl.EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable<? extends yOJ>) ((java.lang.Iterable<? extends java.lang.Object>) abstractC59233zdFEZpvd.copydefault()), yojEZpvd)));
            }
            return C59336zfC.OLrzqt(abstractC59233zdFEZpvd, variance, interfaceC56691yOt);
        }
        return new C59323zeq(Variance.INVARIANT, EZpvd(interfaceC56839yUf, c56829yTw));
    }

    public final boolean copydefault(Variance variance, InterfaceC56691yOt interfaceC56691yOt) {
        return (interfaceC56691yOt.values() == Variance.INVARIANT || variance == interfaceC56691yOt.values()) ? false : true;
    }

    public final boolean EZpvd(C56829yTw c56829yTw) {
        return (c56829yTw.KWHzl() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || c56829yTw.AEQbTJ() || c56829yTw.OLrzqt() == TypeUsage.SUPERTYPE) ? false : true;
    }

    public final java.util.List<InterfaceC59317zek> AEQbTJ(yTU ytu, java.util.List<? extends InterfaceC56691yOt> list, InterfaceC59315zei interfaceC59315zei, C56829yTw c56829yTw) {
        InterfaceC59317zek interfaceC59317zekOLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (InterfaceC56691yOt interfaceC56691yOt : list) {
            if (C59336zfC.copydefault(interfaceC56691yOt, (InterfaceC59315zei) null, c56829yTw.EZpvd())) {
                interfaceC59317zekOLrzqt = C59322zep.EZpvd(interfaceC56691yOt, c56829yTw);
            } else {
                interfaceC59317zekOLrzqt = this.EZpvd.OLrzqt(interfaceC56691yOt, c56829yTw.OLrzqt(ytu.djBIcL()), this.KWHzl, new C59234zdG(this.OLrzqt.EZpvd(), new yTD(this, interfaceC56691yOt, c56829yTw, interfaceC59315zei, ytu)));
            }
            arrayList.add(interfaceC59317zekOLrzqt);
        }
        return arrayList;
    }
}
