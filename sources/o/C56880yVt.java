package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import o.InterfaceC56657yNm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yVt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56880yVt {
    public final C56854yUu AEQbTJ;

    public C56880yVt(@NotNull C56854yUu c56854yUu) {
        Intrinsics.checkNotNullParameter(c56854yUu, "");
        this.AEQbTJ = c56854yUu;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yVt */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends CallableMemberDescriptor> java.util.Collection<D> OLrzqt(@NotNull C56794ySo c56794ySo, @NotNull java.util.Collection<? extends D> collection) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<? extends D> collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection2, 10));
        java.util.Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ((CallableMemberDescriptor) it.next(), c56794ySo));
        }
        return arrayList;
    }

    public final <D extends CallableMemberDescriptor> yOL copydefault(D d, C56794ySo c56794ySo) {
        InterfaceC56663yNs interfaceC56663yNsKWHzl = C56670yNz.KWHzl(d);
        if (interfaceC56663yNsKWHzl == null) {
            return d.copydefault();
        }
        ySE yse = interfaceC56663yNsKWHzl instanceof ySE ? (ySE) interfaceC56663yNsKWHzl : null;
        java.util.List<yTO> listValues = yse != null ? yse.values() : null;
        if (listValues == null || listValues.isEmpty()) {
            return d.copydefault();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValues, 10));
        java.util.Iterator<T> it = listValues.iterator();
        while (it.hasNext()) {
            arrayList.add(new ySD(c56794ySo, (yTO) it.next(), true));
        }
        return yOL.KWHzl.EZpvd(CollectionsKt___CollectionsKt.valueOf(d.copydefault(), arrayList));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [157=4] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0222 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <D extends CallableMemberDescriptor> D AEQbTJ(D d, C56794ySo c56794ySo) {
        D d2;
        AbstractC59233zdF abstractC59233zdFUzCIH;
        C56882yVv c56882yVv;
        kotlin.Pair<InterfaceC56657yNm.Application<?>, ?> pairOLrzqt;
        InterfaceC56679yOh interfaceC56679yOhDjBIcL;
        AbstractC59233zdF abstractC59233zdFUzCIH2;
        java.util.List<yVF> listCopydefault;
        java.lang.String strKWHzl;
        yPI ypi;
        yPL yplZuBGHE;
        if (!(d instanceof InterfaceC56781ySb)) {
            return d;
        }
        if (d.bW_() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && d.fJNWhG().valueOf().size() == 1) {
            return d;
        }
        C56794ySo c56794ySoOLrzqt = C56784ySe.OLrzqt(c56794ySo, copydefault(d, c56794ySo));
        if (!(d instanceof C56788ySi) || (yplZuBGHE = (ypi = (yPI) d).ejfBZ()) == null || yplZuBGHE.AuCTel()) {
            d2 = d;
        } else {
            yPL yplZuBGHE2 = ypi.ejfBZ();
            Intrinsics.copydefault(yplZuBGHE2);
            d2 = yplZuBGHE2;
        }
        yVF yvf = null;
        if (d.djBIcL() != null) {
            yNG yng = d2 instanceof yNG ? (yNG) d2 : null;
            abstractC59233zdFUzCIH = EZpvd(d, yng != null ? (InterfaceC56695yOx) yng.AEQbTJ(JavaMethodDescriptor.AxsJAY) : null, c56794ySoOLrzqt, null, false, C56881yVu.OLrzqt);
        } else {
            abstractC59233zdFUzCIH = null;
        }
        JavaMethodDescriptor javaMethodDescriptor = d instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) d : null;
        java.lang.String str = "";
        if (javaMethodDescriptor != null) {
            C56894yWg c56894yWg = C56894yWg.AEQbTJ;
            InterfaceC56665yNu interfaceC56665yNuAuCTel = javaMethodDescriptor.AuCTel();
            Intrinsics.copydefault(interfaceC56665yNuAuCTel, "");
            java.lang.String strAEQbTJ = C56889yWb.AEQbTJ(c56894yWg, (InterfaceC56658yNn) interfaceC56665yNuAuCTel, C56896yWi.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null));
            if (strAEQbTJ != null) {
                C56882yVv c56882yVvOLrzqt = yUC.KWHzl().get(strAEQbTJ);
                if (c56882yVvOLrzqt == null) {
                    c56882yVvOLrzqt = null;
                } else {
                    if (c56882yVvOLrzqt.KWHzl() != null && ((strKWHzl = c56882yVvOLrzqt.KWHzl()) == null || !C59449zhJ.startsWith$default(strKWHzl, "2.", false, 2, null))) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    if (c56882yVvOLrzqt.KWHzl() != null) {
                        c56882yVvOLrzqt = c56882yVvOLrzqt.OLrzqt();
                    }
                }
                c56882yVv = c56882yVvOLrzqt;
            } else {
                c56882yVv = null;
            }
        }
        if (c56882yVv != null) {
            c56882yVv.copydefault().size();
            ((JavaMethodDescriptor) d).fetchVPNInfo().size();
        }
        boolean z = (yRN.copydefault(c56794ySo.copydefault().AYXKKw()) || c56794ySoOLrzqt.copydefault().fARcdN().copydefault()) && yRN.copydefault(d);
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = d2.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        char c = '\n';
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo, 10));
        for (InterfaceC56695yOx interfaceC56695yOx : listFetchVPNInfo) {
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(EZpvd(d, interfaceC56695yOx, c56794ySoOLrzqt, (c56882yVv == null || (listCopydefault = c56882yVv.copydefault()) == null) ? yvf : (yVF) CollectionsKt___CollectionsKt.AkhnZx(listCopydefault, interfaceC56695yOx.isConnected()), z, new C56879yVs(interfaceC56695yOx)));
            str = str;
            arrayList = arrayList2;
            c = '\n';
            yvf = null;
        }
        java.util.ArrayList arrayList3 = arrayList;
        java.lang.String str2 = str;
        InterfaceC56676yOe interfaceC56676yOe = d instanceof InterfaceC56676yOe ? (InterfaceC56676yOe) d : null;
        AbstractC59233zdF abstractC59233zdFEnhance$default = enhance$default(this, d, d2, true, c56794ySoOLrzqt, (interfaceC56676yOe == null || !ySC.AEQbTJ(interfaceC56676yOe)) ? AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE : AnnotationQualifierApplicabilityType.FIELD, c56882yVv != null ? c56882yVv.AEQbTJ() : null, false, C56883yVw.EZpvd, 32, null);
        AbstractC59233zdF abstractC59233zdFGEmmrt = d.gEmmrt();
        Intrinsics.copydefault(abstractC59233zdFGEmmrt);
        if (EZpvd(abstractC59233zdFGEmmrt) || !((interfaceC56679yOhDjBIcL = d.djBIcL()) == null || (abstractC59233zdFUzCIH2 = interfaceC56679yOhDjBIcL.uzCIH()) == null || !EZpvd(abstractC59233zdFUzCIH2))) {
            pairOLrzqt = C56390yDp.OLrzqt(yZF.AEQbTJ(), new C56762yRj(d));
            break;
        }
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo2 = d.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo2, "getValueParameters(...)");
        if (!(listFetchVPNInfo2 instanceof java.util.Collection) || !listFetchVPNInfo2.isEmpty()) {
            java.util.Iterator<T> it = listFetchVPNInfo2.iterator();
            while (it.hasNext()) {
                AbstractC59233zdF abstractC59233zdFUzCIH3 = ((InterfaceC56695yOx) it.next()).uzCIH();
                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH3, str2);
                if (EZpvd(abstractC59233zdFUzCIH3)) {
                    pairOLrzqt = C56390yDp.OLrzqt(yZF.AEQbTJ(), new C56762yRj(d));
                    break;
                }
            }
        }
        pairOLrzqt = null;
        if (abstractC59233zdFUzCIH == null && abstractC59233zdFEnhance$default == null) {
            if (!arrayList3.isEmpty()) {
                java.util.Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((AbstractC59233zdF) it2.next()) != null) {
                        break;
                    }
                }
                if (pairOLrzqt == null) {
                }
            } else if (pairOLrzqt == null) {
                return d;
            }
        }
        InterfaceC56781ySb interfaceC56781ySb = (InterfaceC56781ySb) d;
        if (abstractC59233zdFUzCIH == null) {
            InterfaceC56679yOh interfaceC56679yOhDjBIcL2 = d.djBIcL();
            abstractC59233zdFUzCIH = interfaceC56679yOhDjBIcL2 != null ? interfaceC56679yOhDjBIcL2.uzCIH() : null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
        int i = 0;
        for (java.lang.Object obj : arrayList3) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            AbstractC59233zdF abstractC59233zdFUzCIH4 = (AbstractC59233zdF) obj;
            if (abstractC59233zdFUzCIH4 == null) {
                abstractC59233zdFUzCIH4 = d.fetchVPNInfo().get(i).uzCIH();
                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH4, str2);
            }
            arrayList4.add(abstractC59233zdFUzCIH4);
            i++;
        }
        if (abstractC59233zdFEnhance$default == null) {
            abstractC59233zdFEnhance$default = d.gEmmrt();
            Intrinsics.copydefault(abstractC59233zdFEnhance$default);
        }
        InterfaceC56781ySb interfaceC56781ySbKWHzl = interfaceC56781ySb.KWHzl(abstractC59233zdFUzCIH, arrayList4, abstractC59233zdFEnhance$default, pairOLrzqt);
        Intrinsics.copydefault(interfaceC56781ySbKWHzl, str2);
        return interfaceC56781ySbKWHzl;
    }

    public static final AbstractC59233zdF EZpvd(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        InterfaceC56679yOh interfaceC56679yOhDjBIcL = callableMemberDescriptor.djBIcL();
        Intrinsics.copydefault(interfaceC56679yOhDjBIcL);
        AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56679yOhDjBIcL.uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        return abstractC59233zdFUzCIH;
    }

    public static final AbstractC59233zdF EZpvd(InterfaceC56695yOx interfaceC56695yOx, CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        AbstractC59233zdF abstractC59233zdFUzCIH = callableMemberDescriptor.fetchVPNInfo().get(interfaceC56695yOx.isConnected()).uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        return abstractC59233zdFUzCIH;
    }

    public static final AbstractC59233zdF copydefault(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        AbstractC59233zdF abstractC59233zdFGEmmrt = callableMemberDescriptor.gEmmrt();
        Intrinsics.copydefault(abstractC59233zdFGEmmrt);
        return abstractC59233zdFGEmmrt;
    }

    public static final boolean copydefault(AbstractC59331zey abstractC59331zey) {
        Intrinsics.checkNotNullParameter(abstractC59331zey, "");
        return abstractC59331zey instanceof InterfaceC59243zdP;
    }

    public final AbstractC59233zdF EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull C56794ySo c56794ySo) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        AbstractC59233zdF abstractC59233zdFEnhance$default = enhance$default(this, new yVA(null, false, c56794ySo, AnnotationQualifierApplicabilityType.TYPE_USE, true), abstractC59233zdF, yDY.AhwBna(), null, false, 12, null);
        return abstractC59233zdFEnhance$default == null ? abstractC59233zdF : abstractC59233zdFEnhance$default;
    }

    public final boolean EZpvd(AbstractC59233zdF abstractC59233zdF) {
        return C59322zep.OLrzqt(abstractC59233zdF, yVB.copydefault);
    }

    public static final java.lang.Boolean EZpvd(AbstractC59331zey abstractC59331zey) {
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59331zey.djBIcL().OLrzqt();
        if (interfaceC56663yNsOLrzqt == null) {
            return java.lang.Boolean.FALSE;
        }
        C56935yXu c56935yXuBR_ = interfaceC56663yNsOLrzqt.bR_();
        yML yml = yML.OLrzqt;
        return java.lang.Boolean.valueOf(Intrinsics.EZpvd(c56935yXuBR_, yml.copydefault().OLrzqt()) && Intrinsics.EZpvd(yZE.KWHzl(interfaceC56663yNsOLrzqt), yml.copydefault()));
    }

    public final AbstractC59233zdF EZpvd(CallableMemberDescriptor callableMemberDescriptor, InterfaceC56695yOx interfaceC56695yOx, C56794ySo c56794ySo, yVF yvf, boolean z, Function1<? super CallableMemberDescriptor, ? extends AbstractC59233zdF> function1) {
        C56794ySo c56794ySoOLrzqt;
        return AEQbTJ(callableMemberDescriptor, interfaceC56695yOx, false, (interfaceC56695yOx == null || (c56794ySoOLrzqt = C56784ySe.OLrzqt(c56794ySo, interfaceC56695yOx.copydefault())) == null) ? c56794ySo : c56794ySoOLrzqt, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, yvf, z, function1);
    }

    public static /* synthetic */ AbstractC59233zdF enhance$default(C56880yVt c56880yVt, CallableMemberDescriptor callableMemberDescriptor, yOB yob, boolean z, C56794ySo c56794ySo, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, yVF yvf, boolean z2, Function1 function1, int i, java.lang.Object obj) {
        return c56880yVt.AEQbTJ(callableMemberDescriptor, yob, z, c56794ySo, annotationQualifierApplicabilityType, yvf, (i & 32) != 0 ? false : z2, function1);
    }

    public final AbstractC59233zdF AEQbTJ(CallableMemberDescriptor callableMemberDescriptor, yOB yob, boolean z, C56794ySo c56794ySo, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, yVF yvf, boolean z2, Function1<? super CallableMemberDescriptor, ? extends AbstractC59233zdF> function1) {
        yVA yva = new yVA(yob, z, c56794ySo, annotationQualifierApplicabilityType, false, 16, null);
        AbstractC59233zdF abstractC59233zdFInvoke = function1.invoke(callableMemberDescriptor);
        java.util.Collection<? extends CallableMemberDescriptor> collectionValueOf = callableMemberDescriptor.valueOf();
        Intrinsics.checkNotNullExpressionValue(collectionValueOf, "");
        java.util.Collection<? extends CallableMemberDescriptor> collection = collectionValueOf;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            Intrinsics.copydefault(callableMemberDescriptor2);
            arrayList.add(function1.invoke(callableMemberDescriptor2));
        }
        return EZpvd(yva, abstractC59233zdFInvoke, arrayList, yvf, z2);
    }

    public static /* synthetic */ AbstractC59233zdF enhance$default(C56880yVt c56880yVt, yVA yva, AbstractC59233zdF abstractC59233zdF, java.util.List list, yVF yvf, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            yvf = null;
        }
        yVF yvf2 = yvf;
        if ((i & 8) != 0) {
            z = false;
        }
        return c56880yVt.EZpvd(yva, abstractC59233zdF, list, yvf2, z);
    }

    public final AbstractC59233zdF EZpvd(yVA yva, AbstractC59233zdF abstractC59233zdF, java.util.List<? extends AbstractC59233zdF> list, yVF yvf, boolean z) {
        return this.AEQbTJ.EZpvd(abstractC59233zdF, yva.OLrzqt(abstractC59233zdF, list, yvf, z), yva.gEmmrt());
    }

    public final java.util.List<AbstractC59233zdF> EZpvd(@NotNull InterfaceC56691yOt interfaceC56691yOt, @NotNull java.util.List<? extends AbstractC59233zdF> list, @NotNull C56794ySo c56794ySo) {
        AbstractC59233zdF abstractC59233zdFEnhance$default;
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (AbstractC59233zdF abstractC59233zdF : list) {
            if (!C59336zfC.copydefault(abstractC59233zdF, C56886yVz.OLrzqt) && (abstractC59233zdFEnhance$default = enhance$default(this, new yVA(interfaceC56691yOt, false, c56794ySo, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), abstractC59233zdF, yDY.AhwBna(), null, false, 12, null)) != null) {
                abstractC59233zdF = abstractC59233zdFEnhance$default;
            }
            arrayList.add(abstractC59233zdF);
        }
        return arrayList;
    }
}
