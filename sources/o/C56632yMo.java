package o;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC56628yMk;
import o.InterfaceC56627yMj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yMo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56632yMo<M extends java.lang.reflect.Member> implements InterfaceC56627yMj<M> {
    public final boolean AEQbTJ;
    public final M EZpvd;
    public final InterfaceC56627yMj<M> KWHzl;
    public final StateListAnimator OLrzqt;
    public final boolean copydefault;
    public final kotlin.ranges.IntRange[] djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56627yMj
    public M OLrzqt() {
        return this.EZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[LOOP:1: B:25:0x0071->B:27:0x0077, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C56632yMo(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull InterfaceC56627yMj<? extends M> interfaceC56627yMj, boolean z) {
        java.lang.Class clsAEQbTJ;
        int i;
        java.util.Iterator it;
        int i2;
        int i3;
        StateListAnimator stateListAnimator;
        int length;
        AbstractC59233zdF abstractC59233zdFCopydefault;
        java.util.Iterator<T> it2;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        Intrinsics.checkNotNullParameter(interfaceC56627yMj, "");
        this.AEQbTJ = z;
        boolean z2 = false;
        if (interfaceC56627yMj instanceof AbstractC56628yMk.FragmentManager.Activity) {
            InterfaceC56679yOh interfaceC56679yOhDjBIcL = callableMemberDescriptor.djBIcL();
            interfaceC56679yOhDjBIcL = interfaceC56679yOhDjBIcL == null ? callableMemberDescriptor.AEQbTJ() : interfaceC56679yOhDjBIcL;
            AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56679yOhDjBIcL != null ? interfaceC56679yOhDjBIcL.uzCIH() : null;
            if (abstractC59233zdFUzCIH != null && yYK.KWHzl(abstractC59233zdFUzCIH)) {
                if (z) {
                    java.util.List<InterfaceC56695yOx> listFetchVPNInfo = callableMemberDescriptor.fetchVPNInfo();
                    Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
                    if (!(listFetchVPNInfo instanceof java.util.Collection) || !listFetchVPNInfo.isEmpty()) {
                        java.util.Iterator<T> it3 = listFetchVPNInfo.iterator();
                        while (it3.hasNext()) {
                            if (((InterfaceC56695yOx) it3.next()).EZpvd()) {
                                java.util.List<java.lang.reflect.Method> listCopydefault = C56630yMm.copydefault(C59326zet.copydefault(abstractC59233zdFUzCIH));
                                Intrinsics.copydefault(listCopydefault);
                                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                                it2 = listCopydefault.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((java.lang.reflect.Method) it2.next()).invoke(((AbstractC56628yMk.FragmentManager.Activity) interfaceC56627yMj).AhwBna(), new java.lang.Object[0]));
                                }
                                interfaceC56627yMj = new AbstractC56628yMk.FragmentManager.StateListAnimator(((AbstractC56628yMk.FragmentManager) interfaceC56627yMj).OLrzqt(), arrayList.toArray(new java.lang.Object[0]));
                            }
                        }
                    }
                } else {
                    java.util.List<java.lang.reflect.Method> listCopydefault2 = C56630yMm.copydefault(C59326zet.copydefault(abstractC59233zdFUzCIH));
                    Intrinsics.copydefault(listCopydefault2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault2, 10));
                    it2 = listCopydefault2.iterator();
                    while (it2.hasNext()) {
                    }
                    interfaceC56627yMj = new AbstractC56628yMk.FragmentManager.StateListAnimator(((AbstractC56628yMk.FragmentManager) interfaceC56627yMj).OLrzqt(), arrayList2.toArray(new java.lang.Object[0]));
                }
            }
        }
        this.KWHzl = (InterfaceC56627yMj<M>) interfaceC56627yMj;
        this.EZpvd = (M) interfaceC56627yMj.OLrzqt();
        AbstractC59233zdF abstractC59233zdFGEmmrt = callableMemberDescriptor.gEmmrt();
        Intrinsics.copydefault(abstractC59233zdFGEmmrt);
        boolean z3 = callableMemberDescriptor instanceof yNG;
        java.lang.reflect.Method methodAEQbTJ = ((z3 && ((yNG) callableMemberDescriptor).AxsJAY() && (abstractC59233zdFCopydefault = yYK.copydefault(abstractC59233zdFGEmmrt)) != null && AbstractC56640yMw.fetchVPNInfo(abstractC59233zdFCopydefault)) || (clsAEQbTJ = C56630yMm.AEQbTJ(abstractC59233zdFGEmmrt)) == null) ? null : C56630yMm.AEQbTJ((java.lang.Class<?>) clsAEQbTJ, callableMemberDescriptor);
        if (yYK.OLrzqt(callableMemberDescriptor)) {
            stateListAnimator = new StateListAnimator(kotlin.ranges.IntRange.KWHzl.AEQbTJ(), new java.util.List[0], methodAEQbTJ);
        } else if ((!(interfaceC56627yMj instanceof AbstractC56628yMk.FragmentManager.Activity) || interfaceC56627yMj.gEmmrt()) && !(interfaceC56627yMj instanceof AbstractC56628yMk.FragmentManager.StateListAnimator)) {
            if (callableMemberDescriptor instanceof InterfaceC56660yNp) {
                if (interfaceC56627yMj instanceof InterfaceC56624yMg) {
                    i = -1;
                }
                int i4 = interfaceC56627yMj instanceof AbstractC56628yMk.FragmentManager.StateListAnimator ? -interfaceC56627yMj.valueOf() : i;
                java.util.List listKWHzl = C56630yMm.KWHzl(callableMemberDescriptor, interfaceC56627yMj.OLrzqt(), C56631yMn.copydefault);
                it = listKWHzl.iterator();
                int size = 0;
                while (it.hasNext()) {
                    java.util.List<java.lang.reflect.Method> listCopydefault3 = C56630yMm.copydefault(C59326zet.copydefault((AbstractC59233zdF) it.next()));
                    size += listCopydefault3 != null ? listCopydefault3.size() : 1;
                }
                i2 = size + i4 + (this.AEQbTJ ? ((size + 31) / 32) + 1 : 0) + ((z3 && ((yNG) callableMemberDescriptor).AxsJAY()) ? 1 : 0);
                C56630yMm.KWHzl(this, i2, callableMemberDescriptor, this.AEQbTJ);
                kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(java.lang.Math.max(i, 0), listKWHzl.size() + i);
                java.util.List[] listArr = new java.util.List[i2];
                i3 = 0;
                while (i3 < i2) {
                    listArr[i3] = (i3 > intRangeAhwBna.copydefault() || intRangeAhwBna.KWHzl() > i3) ? null : C56630yMm.OLrzqt(C59326zet.copydefault((AbstractC59233zdF) listKWHzl.get(i3 - i)), callableMemberDescriptor);
                    i3++;
                }
                stateListAnimator = new StateListAnimator(intRangeAhwBna, listArr, methodAEQbTJ);
            } else if (callableMemberDescriptor.AEQbTJ() != null && !(interfaceC56627yMj instanceof InterfaceC56624yMg)) {
                InterfaceC56665yNu interfaceC56665yNuAYXKKw = callableMemberDescriptor.AuCTel();
                Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAYXKKw, "");
                if (!yYK.copydefault(interfaceC56665yNuAYXKKw)) {
                    i = 1;
                }
                if (interfaceC56627yMj instanceof AbstractC56628yMk.FragmentManager.StateListAnimator) {
                }
                java.util.List listKWHzl2 = C56630yMm.KWHzl(callableMemberDescriptor, interfaceC56627yMj.OLrzqt(), C56631yMn.copydefault);
                it = listKWHzl2.iterator();
                int size2 = 0;
                while (it.hasNext()) {
                }
                if (z3) {
                    i2 = size2 + i4 + (this.AEQbTJ ? ((size2 + 31) / 32) + 1 : 0) + ((z3 && ((yNG) callableMemberDescriptor).AxsJAY()) ? 1 : 0);
                    C56630yMm.KWHzl(this, i2, callableMemberDescriptor, this.AEQbTJ);
                    kotlin.ranges.IntRange intRangeAhwBna2 = C56548yJl.AhwBna(java.lang.Math.max(i, 0), listKWHzl2.size() + i);
                    java.util.List[] listArr2 = new java.util.List[i2];
                    i3 = 0;
                    while (i3 < i2) {
                    }
                    stateListAnimator = new StateListAnimator(intRangeAhwBna2, listArr2, methodAEQbTJ);
                }
            }
            i = 0;
            if (interfaceC56627yMj instanceof AbstractC56628yMk.FragmentManager.StateListAnimator) {
            }
            java.util.List listKWHzl22 = C56630yMm.KWHzl(callableMemberDescriptor, interfaceC56627yMj.OLrzqt(), C56631yMn.copydefault);
            it = listKWHzl22.iterator();
            int size22 = 0;
            while (it.hasNext()) {
            }
        }
        this.OLrzqt = stateListAnimator;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        InterfaceC56627yMj<M> interfaceC56627yMj2 = this.KWHzl;
        if (interfaceC56627yMj2 instanceof AbstractC56628yMk.FragmentManager.StateListAnimator) {
            length = ((AbstractC56628yMk.FragmentManager.StateListAnimator) interfaceC56627yMj2).gEmmrt().length;
        } else {
            length = interfaceC56627yMj2 instanceof AbstractC56628yMk.FragmentManager.Activity ? 1 : 0;
        }
        if (length > 0) {
            listOLrzqt.add(C56548yJl.AhwBna(0, length));
        }
        java.util.List<java.lang.reflect.Method>[] listArrKWHzl = stateListAnimator.KWHzl();
        int length2 = listArrKWHzl.length;
        int i5 = 0;
        while (i5 < length2) {
            java.util.List<java.lang.reflect.Method> list = listArrKWHzl[i5];
            int size3 = (list != null ? list.size() : 1) + length;
            listOLrzqt.add(C56548yJl.AhwBna(length, size3));
            i5++;
            length = size3;
        }
        this.djBIcL = (kotlin.ranges.IntRange[]) C56402yEa.fARcdN(listOLrzqt).toArray(new kotlin.ranges.IntRange[0]);
        java.lang.Iterable iterableOLrzqt = this.OLrzqt.OLrzqt();
        if (!(iterableOLrzqt instanceof java.util.Collection) || !((java.util.Collection) iterableOLrzqt).isEmpty()) {
            java.util.Iterator it4 = iterableOLrzqt.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                java.util.List<java.lang.reflect.Method> list2 = this.OLrzqt.KWHzl()[((AbstractC56415yEn) it4).nextInt()];
                if (list2 != null && list2.size() > 1) {
                    z2 = true;
                    break;
                }
            }
        }
        this.copydefault = z2;
    }

    @Override // o.InterfaceC56627yMj
    public java.lang.reflect.Type copydefault() {
        return this.KWHzl.copydefault();
    }

    @Override // o.InterfaceC56627yMj
    public java.util.List<java.lang.reflect.Type> AEQbTJ() {
        return this.KWHzl.AEQbTJ();
    }

    @Override // o.InterfaceC56627yMj
    public boolean EZpvd() {
        return this.KWHzl instanceof AbstractC56628yMk.FragmentManager.ActionBar;
    }

    /* JADX INFO: renamed from: o.yMo$StateListAnimator */
    public static final class StateListAnimator {
        public final kotlin.ranges.IntRange EZpvd;
        public final java.lang.reflect.Method OLrzqt;
        public final java.util.List<java.lang.reflect.Method>[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.reflect.Method>[] KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kotlin.ranges.IntRange OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method copydefault() {
            return this.OLrzqt;
        }

        public StateListAnimator(@NotNull kotlin.ranges.IntRange intRange, @NotNull java.util.List<java.lang.reflect.Method>[] listArr, java.lang.reflect.Method method) {
            Intrinsics.checkNotNullParameter(intRange, "");
            Intrinsics.checkNotNullParameter(listArr, "");
            this.EZpvd = intRange;
            this.copydefault = listArr;
            this.OLrzqt = method;
        }
    }

    public static final boolean EZpvd(InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        return yYK.copydefault(interfaceC56658yNn);
    }

    public final kotlin.ranges.IntRange copydefault(int i) {
        kotlin.ranges.IntRange intRange;
        if (i >= 0) {
            kotlin.ranges.IntRange[] intRangeArr = this.djBIcL;
            if (i < intRangeArr.length) {
                return intRangeArr[i];
            }
        }
        kotlin.ranges.IntRange[] intRangeArr2 = this.djBIcL;
        if (intRangeArr2.length == 0) {
            intRange = new kotlin.ranges.IntRange(i, i);
        } else {
            int length = (i - intRangeArr2.length) + ((kotlin.ranges.IntRange) yDV.AubY(intRangeArr2)).copydefault() + 1;
            intRange = new kotlin.ranges.IntRange(length, length);
        }
        return intRange;
    }

    @Override // o.InterfaceC56627yMj
    public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) throws java.lang.IllegalAccessException, InvocationTargetException {
        java.lang.Object objInvoke;
        java.lang.Object objAEQbTJ;
        java.lang.Object objAEQbTJ2;
        Intrinsics.checkNotNullParameter(objArr, "");
        kotlin.ranges.IntRange intRangeOLrzqt = this.OLrzqt.OLrzqt();
        java.util.List<java.lang.reflect.Method>[] listArrKWHzl = this.OLrzqt.KWHzl();
        java.lang.reflect.Method methodCopydefault = this.OLrzqt.copydefault();
        if (!intRangeOLrzqt.isEmpty()) {
            if (this.copydefault) {
                java.util.List listOLrzqt = C56402yEa.OLrzqt(objArr.length);
                int iKWHzl = intRangeOLrzqt.KWHzl();
                for (int i = 0; i < iKWHzl; i++) {
                    listOLrzqt.add(objArr[i]);
                }
                int iKWHzl2 = intRangeOLrzqt.KWHzl();
                int iCopydefault = intRangeOLrzqt.copydefault();
                if (iKWHzl2 <= iCopydefault) {
                    while (true) {
                        java.util.List<java.lang.reflect.Method> list = listArrKWHzl[iKWHzl2];
                        java.lang.Object obj = objArr[iKWHzl2];
                        if (list == null) {
                            listOLrzqt.add(obj);
                        } else {
                            for (java.lang.reflect.Method method : list) {
                                if (obj != null) {
                                    objAEQbTJ2 = method.invoke(obj, new java.lang.Object[0]);
                                } else {
                                    java.lang.Class<?> returnType = method.getReturnType();
                                    Intrinsics.checkNotNullExpressionValue(returnType, "");
                                    objAEQbTJ2 = yLX.AEQbTJ((java.lang.reflect.Type) returnType);
                                }
                                listOLrzqt.add(objAEQbTJ2);
                            }
                        }
                        if (iKWHzl2 == iCopydefault) {
                            break;
                        }
                        iKWHzl2++;
                    }
                }
                int iCopydefault2 = intRangeOLrzqt.copydefault() + 1;
                int iZLjUOn = yDV.zLjUOn(objArr);
                if (iCopydefault2 <= iZLjUOn) {
                    while (true) {
                        listOLrzqt.add(objArr[iCopydefault2]);
                        if (iCopydefault2 == iZLjUOn) {
                            break;
                        }
                        iCopydefault2++;
                    }
                }
                objArr = C56402yEa.fARcdN(listOLrzqt).toArray(new java.lang.Object[0]);
            } else {
                int length = objArr.length;
                java.lang.Object[] objArr2 = new java.lang.Object[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int iKWHzl3 = intRangeOLrzqt.KWHzl();
                    if (i2 <= intRangeOLrzqt.copydefault() && iKWHzl3 <= i2) {
                        java.util.List<java.lang.reflect.Method> list2 = listArrKWHzl[i2];
                        java.lang.reflect.Method method2 = list2 != null ? (java.lang.reflect.Method) CollectionsKt___CollectionsKt.gHZMYf(list2) : null;
                        objAEQbTJ = objArr[i2];
                        if (method2 != null) {
                            if (objAEQbTJ != null) {
                                objAEQbTJ = method2.invoke(objAEQbTJ, new java.lang.Object[0]);
                            } else {
                                java.lang.Class<?> returnType2 = method2.getReturnType();
                                Intrinsics.checkNotNullExpressionValue(returnType2, "");
                                objAEQbTJ = yLX.AEQbTJ((java.lang.reflect.Type) returnType2);
                            }
                        }
                    } else {
                        objAEQbTJ = objArr[i2];
                    }
                    objArr2[i2] = objAEQbTJ;
                }
                objArr = objArr2;
            }
        }
        java.lang.Object objAEQbTJ3 = this.KWHzl.AEQbTJ(objArr);
        return (objAEQbTJ3 == C56442yFn.copydefault() || methodCopydefault == null || (objInvoke = methodCopydefault.invoke(null, objAEQbTJ3)) == null) ? objAEQbTJ3 : objInvoke;
    }

    /* JADX INFO: renamed from: o.yMo$ActionBar */
    public static final class ActionBar implements InterfaceC56627yMj {
        public final java.util.List<java.util.List<java.lang.Class<?>>> AEQbTJ;
        public final java.util.List<java.util.List<java.lang.reflect.Method>> EZpvd;
        public final java.lang.reflect.Method KWHzl;
        public final java.lang.reflect.Method OLrzqt;
        public final java.util.List<java.lang.reflect.Type> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56627yMj
        public java.util.List<java.lang.reflect.Type> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.util.List<java.lang.Class<?>>> AYXKKw() {
            return this.AEQbTJ;
        }

        public java.lang.Void KWHzl() {
            return null;
        }

        public ActionBar(@NotNull yNG yng, @NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull java.lang.String str, @NotNull java.util.List<? extends InterfaceC56678yOg> list) {
            java.util.Collection collectionEZpvd;
            Intrinsics.checkNotNullParameter(yng, "");
            Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            java.lang.reflect.Method methodCopydefault = kDeclarationContainerImpl.copydefault("constructor-impl", str);
            Intrinsics.copydefault(methodCopydefault);
            this.OLrzqt = methodCopydefault;
            java.lang.reflect.Method methodCopydefault2 = kDeclarationContainerImpl.copydefault("box-impl", StringsKt__StringsKt.EZpvd(str, (java.lang.CharSequence) ExifInterface.GPS_MEASUREMENT_INTERRUPTED) + C56743yQr.KWHzl(kDeclarationContainerImpl.OLrzqt()));
            Intrinsics.copydefault(methodCopydefault2);
            this.KWHzl = methodCopydefault2;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC59233zdF abstractC59233zdFUzCIH = ((InterfaceC56678yOg) it.next()).uzCIH();
                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
                arrayList.add(C56630yMm.OLrzqt(C59326zet.copydefault(abstractC59233zdFUzCIH), yng));
            }
            this.EZpvd = arrayList;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                InterfaceC56663yNs interfaceC56663yNsKWHzl = ((InterfaceC56678yOg) obj).uzCIH().djBIcL().OLrzqt();
                Intrinsics.copydefault(interfaceC56663yNsKWHzl, "");
                InterfaceC56658yNn interfaceC56658yNn = (InterfaceC56658yNn) interfaceC56663yNsKWHzl;
                java.util.List<java.lang.reflect.Method> list2 = this.EZpvd.get(i);
                if (list2 == null) {
                    java.lang.Class<?> clsOLrzqt = yLX.OLrzqt(interfaceC56658yNn);
                    Intrinsics.copydefault(clsOLrzqt);
                    collectionEZpvd = C56402yEa.EZpvd(clsOLrzqt);
                } else {
                    collectionEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                    java.util.Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        collectionEZpvd.add(((java.lang.reflect.Method) it2.next()).getReturnType());
                    }
                }
                arrayList2.add(collectionEZpvd);
                i++;
            }
            this.AEQbTJ = arrayList2;
            this.copydefault = C56403yEb.QOLQEE(arrayList2);
        }

        @Override // o.InterfaceC56627yMj
        public boolean EZpvd() {
            return InterfaceC56627yMj.Application.AEQbTJ(this);
        }

        @Override // o.InterfaceC56627yMj
        public /* synthetic */ java.lang.reflect.Member OLrzqt() {
            return (java.lang.reflect.Member) KWHzl();
        }

        @Override // o.InterfaceC56627yMj
        public java.lang.reflect.Type copydefault() {
            java.lang.Class<?> returnType = this.KWHzl.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "");
            return returnType;
        }

        @Override // o.InterfaceC56627yMj
        public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) throws java.lang.IllegalAccessException, InvocationTargetException {
            java.util.Collection collectionEZpvd;
            Intrinsics.checkNotNullParameter(objArr, "");
            java.util.List<kotlin.Pair> listOLrzqt = yDV.OLrzqt(objArr, this.EZpvd);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (kotlin.Pair pair : listOLrzqt) {
                java.lang.Object objComponent1 = pair.component1();
                java.util.List list = (java.util.List) pair.component2();
                if (list == null) {
                    collectionEZpvd = C56402yEa.EZpvd(objComponent1);
                } else {
                    collectionEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        collectionEZpvd.add(((java.lang.reflect.Method) it.next()).invoke(objComponent1, new java.lang.Object[0]));
                    }
                }
                C56406yEe.KWHzl(arrayList, collectionEZpvd);
            }
            java.lang.Object[] array = arrayList.toArray(new java.lang.Object[0]);
            this.OLrzqt.invoke(null, java.util.Arrays.copyOf(array, array.length));
            return this.KWHzl.invoke(null, java.util.Arrays.copyOf(array, array.length));
        }
    }
}
