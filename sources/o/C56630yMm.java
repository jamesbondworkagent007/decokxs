package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yMm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56630yMm {
    public static final java.lang.String KWHzl(@NotNull InterfaceC56663yNs interfaceC56663yNs) {
        Intrinsics.checkNotNullParameter(interfaceC56663yNs, "");
        C56929yXo c56929yXoEZpvd = yZE.EZpvd(interfaceC56663yNs);
        Intrinsics.copydefault(c56929yXoEZpvd);
        return C56923yXi.OLrzqt(c56929yXoEZpvd.EZpvd());
    }

    public static final java.util.List<java.lang.reflect.Method> OLrzqt(AbstractC59242zdO abstractC59242zdO, CallableMemberDescriptor callableMemberDescriptor) {
        java.lang.reflect.Method methodEZpvd;
        java.util.List<java.lang.reflect.Method> listCopydefault = copydefault(abstractC59242zdO);
        if (listCopydefault != null) {
            return listCopydefault;
        }
        java.lang.Class<?> clsAEQbTJ = AEQbTJ(abstractC59242zdO);
        if (clsAEQbTJ == null || (methodEZpvd = EZpvd(clsAEQbTJ, callableMemberDescriptor)) == null) {
            return null;
        }
        return C56402yEa.EZpvd(methodEZpvd);
    }

    public static final java.util.List<java.lang.String> KWHzl(AbstractC59242zdO abstractC59242zdO) {
        java.util.Collection collectionEZpvd;
        if (!yYK.KWHzl(abstractC59242zdO)) {
            return null;
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59242zdO.djBIcL().OLrzqt();
        Intrinsics.copydefault(interfaceC56663yNsKWHzl, "");
        yNR<AbstractC59242zdO> ynrKWHzl = yZE.KWHzl((InterfaceC56658yNn) interfaceC56663yNsKWHzl);
        Intrinsics.copydefault(ynrKWHzl);
        java.util.Collection<kotlin.Pair> collectionKWHzl = ynrKWHzl.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.Pair pair : collectionKWHzl) {
            C56935yXu c56935yXu = (C56935yXu) pair.component1();
            java.util.List<java.lang.String> listKWHzl = KWHzl((AbstractC59242zdO) pair.component2());
            if (listKWHzl == null) {
                collectionEZpvd = C56402yEa.EZpvd(c56935yXu.copydefault());
            } else {
                collectionEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                java.util.Iterator<T> it = listKWHzl.iterator();
                while (it.hasNext()) {
                    collectionEZpvd.add(c56935yXu.copydefault() + '-' + ((java.lang.String) it.next()));
                }
            }
            C56406yEe.KWHzl(arrayList, collectionEZpvd);
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.reflect.Method> copydefault(@NotNull AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        java.util.List<java.lang.String> listKWHzl = KWHzl(C59326zet.copydefault(abstractC59242zdO));
        if (listKWHzl == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((java.lang.String) it.next()));
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59242zdO.djBIcL().OLrzqt();
        Intrinsics.copydefault(interfaceC56663yNsKWHzl, "");
        java.lang.Class<?> clsOLrzqt = yLX.OLrzqt((InterfaceC56658yNn) interfaceC56663yNsKWHzl);
        Intrinsics.copydefault(clsOLrzqt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsOLrzqt.getDeclaredMethod((java.lang.String) it2.next(), new java.lang.Class[0]));
        }
        return arrayList2;
    }

    public static final void KWHzl(InterfaceC56627yMj<?> interfaceC56627yMj, int i, CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        if (C56625yMh.AEQbTJ(interfaceC56627yMj) == i) {
            return;
        }
        throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + C56625yMh.AEQbTJ(interfaceC56627yMj) + " != " + i + "\nCalling: " + callableMemberDescriptor + "\nParameter types: " + interfaceC56627yMj.AEQbTJ() + ")\nDefault: " + z);
    }

    public static final java.util.List<AbstractC59233zdF> KWHzl(CallableMemberDescriptor callableMemberDescriptor, java.lang.reflect.Member member, Function1<? super InterfaceC56658yNn, java.lang.Boolean> function1) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        InterfaceC56679yOh interfaceC56679yOhDjBIcL = callableMemberDescriptor.djBIcL();
        AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56679yOhDjBIcL != null ? interfaceC56679yOhDjBIcL.uzCIH() : null;
        if (abstractC59233zdFUzCIH != null) {
            arrayList.add(abstractC59233zdFUzCIH);
        } else if (callableMemberDescriptor instanceof InterfaceC56660yNp) {
            InterfaceC56658yNn interfaceC56658yNnFIwbmz = ((InterfaceC56660yNp) callableMemberDescriptor).fIwbmz();
            Intrinsics.checkNotNullExpressionValue(interfaceC56658yNnFIwbmz, "");
            if (interfaceC56658yNnFIwbmz.gHZMYf()) {
                InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56658yNnFIwbmz.AuCTel();
                Intrinsics.copydefault(interfaceC56665yNuAYXKKw, "");
                arrayList.add(((InterfaceC56658yNn) interfaceC56665yNuAYXKKw).bQ_());
            }
        } else {
            InterfaceC56665yNu interfaceC56665yNuAYXKKw2 = callableMemberDescriptor.AuCTel();
            Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAYXKKw2, "");
            if ((interfaceC56665yNuAYXKKw2 instanceof InterfaceC56658yNn) && function1.invoke(interfaceC56665yNuAYXKKw2).booleanValue()) {
                if (member != null && OLrzqt(member)) {
                    AbstractC59242zdO abstractC59242zdOBQ_ = ((InterfaceC56658yNn) interfaceC56665yNuAYXKKw2).bQ_();
                    Intrinsics.checkNotNullExpressionValue(abstractC59242zdOBQ_, "");
                    arrayList.add(C59336zfC.AkhnZx(abstractC59242zdOBQ_));
                } else {
                    arrayList.add(((InterfaceC56658yNn) interfaceC56665yNuAYXKKw2).bQ_());
                }
            }
        }
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = callableMemberDescriptor.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        java.util.Iterator<T> it = listFetchVPNInfo.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC56695yOx) it.next()).uzCIH());
        }
        return arrayList;
    }

    public static final boolean OLrzqt(java.lang.reflect.Member member) {
        if (member.getDeclaringClass() == null) {
            return false;
        }
        return !yHE.KWHzl(r0).DbNXlk();
    }

    public static /* synthetic */ InterfaceC56627yMj createValueClassAwareCallerIfNeeded$default(InterfaceC56627yMj interfaceC56627yMj, CallableMemberDescriptor callableMemberDescriptor, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return OLrzqt(interfaceC56627yMj, callableMemberDescriptor, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yMj<? extends M extends java.lang.reflect.Member> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <M extends java.lang.reflect.Member> InterfaceC56627yMj<M> OLrzqt(@NotNull InterfaceC56627yMj<? extends M> interfaceC56627yMj, @NotNull CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo;
        java.util.Iterator<T> it;
        AbstractC59233zdF abstractC59233zdFGEmmrt;
        Intrinsics.checkNotNullParameter(interfaceC56627yMj, "");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        if (!yYK.OLrzqt(callableMemberDescriptor)) {
            java.util.List<InterfaceC56679yOh> listOLrzqt = callableMemberDescriptor.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(listOLrzqt, "");
            if ((listOLrzqt instanceof java.util.Collection) && listOLrzqt.isEmpty()) {
                listFetchVPNInfo = callableMemberDescriptor.fetchVPNInfo();
                Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
                if (!(listFetchVPNInfo instanceof java.util.Collection)) {
                    it = listFetchVPNInfo.iterator();
                    while (it.hasNext()) {
                    }
                    abstractC59233zdFGEmmrt = callableMemberDescriptor.gEmmrt();
                    if (abstractC59233zdFGEmmrt == null) {
                    }
                }
            } else {
                java.util.Iterator<T> it2 = listOLrzqt.iterator();
                while (it2.hasNext()) {
                    AbstractC59233zdF abstractC59233zdFUzCIH = ((InterfaceC56679yOh) it2.next()).uzCIH();
                    Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
                    if (yYK.EZpvd(abstractC59233zdFUzCIH)) {
                        break;
                    }
                }
                listFetchVPNInfo = callableMemberDescriptor.fetchVPNInfo();
                Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
                if (!(listFetchVPNInfo instanceof java.util.Collection) && listFetchVPNInfo.isEmpty()) {
                    abstractC59233zdFGEmmrt = callableMemberDescriptor.gEmmrt();
                    return abstractC59233zdFGEmmrt == null ? interfaceC56627yMj : interfaceC56627yMj;
                }
                it = listFetchVPNInfo.iterator();
                while (it.hasNext()) {
                    AbstractC59233zdF abstractC59233zdFUzCIH2 = ((InterfaceC56695yOx) it.next()).uzCIH();
                    Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH2, "");
                    if (yYK.EZpvd(abstractC59233zdFUzCIH2)) {
                        break;
                    }
                }
                abstractC59233zdFGEmmrt = callableMemberDescriptor.gEmmrt();
                if ((abstractC59233zdFGEmmrt == null || !yYK.OLrzqt(abstractC59233zdFGEmmrt)) && !EZpvd(callableMemberDescriptor)) {
                }
            }
        }
        return new C56632yMo(callableMemberDescriptor, interfaceC56627yMj, z);
    }

    public static final boolean EZpvd(CallableMemberDescriptor callableMemberDescriptor) {
        AbstractC59233zdF abstractC59233zdFAEQbTJ = AEQbTJ(callableMemberDescriptor);
        return abstractC59233zdFAEQbTJ != null && yYK.EZpvd(abstractC59233zdFAEQbTJ);
    }

    public static final java.lang.reflect.Method EZpvd(@NotNull java.lang.Class<?> cls, @NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new java.lang.Class[0]);
            Intrinsics.copydefault(declaredMethod);
            return declaredMethod;
        } catch (java.lang.NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    public static final java.lang.reflect.Method AEQbTJ(java.lang.Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("box-impl", EZpvd(cls, callableMemberDescriptor).getReturnType());
            Intrinsics.copydefault(declaredMethod);
            return declaredMethod;
        } catch (java.lang.NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    public static final java.lang.Class<?> AEQbTJ(AbstractC59233zdF abstractC59233zdF) {
        java.lang.Class<?> clsKWHzl = KWHzl((InterfaceC56665yNu) abstractC59233zdF.djBIcL().OLrzqt());
        if (clsKWHzl == null) {
            return null;
        }
        if (!C59322zep.valueOf(abstractC59233zdF)) {
            return clsKWHzl;
        }
        AbstractC59233zdF abstractC59233zdFAEQbTJ = yYK.AEQbTJ(abstractC59233zdF);
        if (abstractC59233zdFAEQbTJ == null || C59322zep.valueOf(abstractC59233zdFAEQbTJ) || AbstractC56640yMw.fetchVPNInfo(abstractC59233zdFAEQbTJ)) {
            return null;
        }
        return clsKWHzl;
    }

    public static final java.lang.Class<?> KWHzl(InterfaceC56665yNu interfaceC56665yNu) {
        if (!(interfaceC56665yNu instanceof InterfaceC56658yNn) || !yYK.EZpvd(interfaceC56665yNu)) {
            return null;
        }
        InterfaceC56658yNn interfaceC56658yNn = (InterfaceC56658yNn) interfaceC56665yNu;
        java.lang.Class<?> clsOLrzqt = yLX.OLrzqt(interfaceC56658yNn);
        if (clsOLrzqt != null) {
            return clsOLrzqt;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + interfaceC56658yNn.bR_() + " cannot be found (classId=" + yZE.EZpvd((InterfaceC56663yNs) interfaceC56665yNu) + ')');
    }

    public static final AbstractC59233zdF AEQbTJ(CallableMemberDescriptor callableMemberDescriptor) {
        InterfaceC56679yOh interfaceC56679yOhDjBIcL = callableMemberDescriptor.djBIcL();
        InterfaceC56679yOh interfaceC56679yOhAEQbTJ = callableMemberDescriptor.AEQbTJ();
        if (interfaceC56679yOhDjBIcL != null) {
            return interfaceC56679yOhDjBIcL.uzCIH();
        }
        if (interfaceC56679yOhAEQbTJ != null) {
            if (callableMemberDescriptor instanceof InterfaceC56660yNp) {
                return interfaceC56679yOhAEQbTJ.uzCIH();
            }
            InterfaceC56665yNu interfaceC56665yNuAYXKKw = callableMemberDescriptor.AuCTel();
            InterfaceC56658yNn interfaceC56658yNn = interfaceC56665yNuAYXKKw instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56665yNuAYXKKw : null;
            if (interfaceC56658yNn != null) {
                return interfaceC56658yNn.bQ_();
            }
        }
        return null;
    }

    public static final java.lang.Object AEQbTJ(java.lang.Object obj, @NotNull CallableMemberDescriptor callableMemberDescriptor) {
        AbstractC59233zdF abstractC59233zdFAEQbTJ;
        java.lang.Class<?> clsAEQbTJ;
        java.lang.reflect.Method methodEZpvd;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return (((callableMemberDescriptor instanceof InterfaceC56676yOe) && yYK.OLrzqt((yOC) callableMemberDescriptor)) || (abstractC59233zdFAEQbTJ = AEQbTJ(callableMemberDescriptor)) == null || (clsAEQbTJ = AEQbTJ(abstractC59233zdFAEQbTJ)) == null || (methodEZpvd = EZpvd(clsAEQbTJ, callableMemberDescriptor)) == null) ? obj : methodEZpvd.invoke(obj, new java.lang.Object[0]);
    }
}
