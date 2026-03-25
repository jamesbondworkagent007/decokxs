package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yUu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56854yUu {
    public final InterfaceC56789ySj EZpvd;

    /* JADX INFO: renamed from: o.yUu$Activity */
    public static final class Activity {
        public final AbstractC59233zdF AEQbTJ;
        public final int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC59233zdF copydefault() {
            return this.AEQbTJ;
        }

        public Activity(AbstractC59233zdF abstractC59233zdF, int i) {
            this.AEQbTJ = abstractC59233zdF;
            this.KWHzl = i;
        }
    }

    public C56854yUu(@NotNull InterfaceC56789ySj interfaceC56789ySj) {
        Intrinsics.checkNotNullParameter(interfaceC56789ySj, "");
        this.EZpvd = interfaceC56789ySj;
    }

    /* JADX INFO: renamed from: o.yUu$StateListAnimator */
    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final int EZpvd;
        public final AbstractC59242zdO OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC59242zdO KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        public StateListAnimator(AbstractC59242zdO abstractC59242zdO, int i, boolean z) {
            this.OLrzqt = abstractC59242zdO;
            this.EZpvd = i;
            this.AEQbTJ = z;
        }
    }

    public final AbstractC59233zdF EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull Function1<? super java.lang.Integer, C56857yUx> function1, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return copydefault(abstractC59233zdF.AkhnZx(), function1, 0, z).copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Activity copydefault(AbstractC59331zey abstractC59331zey, Function1<? super java.lang.Integer, C56857yUx> function1, int i, boolean z) {
        AbstractC59233zdF abstractC59233zdFKWHzl;
        AbstractC59233zdF abstractC59233zdFOLrzqt = null;
        if (C59238zdK.AEQbTJ(abstractC59331zey)) {
            return new Activity(null, 1);
        }
        if (abstractC59331zey instanceof AbstractC59272zds) {
            boolean z2 = abstractC59331zey instanceof InterfaceC59243zdP;
            AbstractC59272zds abstractC59272zds = (AbstractC59272zds) abstractC59331zey;
            StateListAnimator stateListAnimatorKWHzl = KWHzl(abstractC59272zds.valueOf(), function1, i, TypeComponentPosition.FLEXIBLE_LOWER, z2, z);
            StateListAnimator stateListAnimatorKWHzl2 = KWHzl(abstractC59272zds.AYXKKw(), function1, i, TypeComponentPosition.FLEXIBLE_UPPER, z2, z);
            stateListAnimatorKWHzl.OLrzqt();
            stateListAnimatorKWHzl2.OLrzqt();
            if (stateListAnimatorKWHzl.KWHzl() != null || stateListAnimatorKWHzl2.KWHzl() != null) {
                if (stateListAnimatorKWHzl.AEQbTJ() || stateListAnimatorKWHzl2.AEQbTJ()) {
                    AbstractC59242zdO abstractC59242zdOKWHzl = stateListAnimatorKWHzl2.KWHzl();
                    if (abstractC59242zdOKWHzl == null) {
                        abstractC59233zdFKWHzl = stateListAnimatorKWHzl.KWHzl();
                        Intrinsics.copydefault(abstractC59233zdFKWHzl);
                        abstractC59233zdFOLrzqt = C59327zeu.OLrzqt(abstractC59331zey, abstractC59233zdFKWHzl);
                    } else {
                        AbstractC59242zdO abstractC59242zdOKWHzl2 = stateListAnimatorKWHzl.KWHzl();
                        if (abstractC59242zdOKWHzl2 == null) {
                            abstractC59242zdOKWHzl2 = abstractC59242zdOKWHzl;
                        }
                        abstractC59233zdFKWHzl = C59231zdD.copydefault(abstractC59242zdOKWHzl2, abstractC59242zdOKWHzl);
                        if (abstractC59233zdFKWHzl == null) {
                        }
                        abstractC59233zdFOLrzqt = C59327zeu.OLrzqt(abstractC59331zey, abstractC59233zdFKWHzl);
                    }
                } else if (z2) {
                    AbstractC59242zdO abstractC59242zdOKWHzl3 = stateListAnimatorKWHzl.KWHzl();
                    if (abstractC59242zdOKWHzl3 == null) {
                        abstractC59242zdOKWHzl3 = abstractC59272zds.valueOf();
                    }
                    AbstractC59242zdO abstractC59242zdOKWHzl4 = stateListAnimatorKWHzl2.KWHzl();
                    if (abstractC59242zdOKWHzl4 == null) {
                        abstractC59242zdOKWHzl4 = abstractC59272zds.AYXKKw();
                    }
                    abstractC59233zdFOLrzqt = new yTI(abstractC59242zdOKWHzl3, abstractC59242zdOKWHzl4);
                } else {
                    AbstractC59242zdO abstractC59242zdOKWHzl5 = stateListAnimatorKWHzl.KWHzl();
                    if (abstractC59242zdOKWHzl5 == null) {
                        abstractC59242zdOKWHzl5 = abstractC59272zds.valueOf();
                    }
                    AbstractC59242zdO abstractC59242zdOKWHzl6 = stateListAnimatorKWHzl2.KWHzl();
                    if (abstractC59242zdOKWHzl6 == null) {
                        abstractC59242zdOKWHzl6 = abstractC59272zds.AYXKKw();
                    }
                    abstractC59233zdFOLrzqt = C59231zdD.copydefault(abstractC59242zdOKWHzl5, abstractC59242zdOKWHzl6);
                }
            }
            return new Activity(abstractC59233zdFOLrzqt, stateListAnimatorKWHzl.OLrzqt());
        }
        if (!(abstractC59331zey instanceof AbstractC59242zdO)) {
            throw new NoWhenBranchMatchedException();
        }
        StateListAnimator stateListAnimatorEnhanceInflexible$default = enhanceInflexible$default(this, (AbstractC59242zdO) abstractC59331zey, function1, i, TypeComponentPosition.INFLEXIBLE, false, z, 8, null);
        return new Activity(stateListAnimatorEnhanceInflexible$default.AEQbTJ() ? C59327zeu.OLrzqt(abstractC59331zey, stateListAnimatorEnhanceInflexible$default.KWHzl()) : stateListAnimatorEnhanceInflexible$default.KWHzl(), stateListAnimatorEnhanceInflexible$default.OLrzqt());
    }

    public static /* synthetic */ StateListAnimator enhanceInflexible$default(C56854yUu c56854yUu, AbstractC59242zdO abstractC59242zdO, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2, int i2, java.lang.Object obj) {
        return c56854yUu.KWHzl(abstractC59242zdO, function1, i, typeComponentPosition, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yVD.OLrzqt(o.yNs, o.yUx, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition):o.yNs */
    public final StateListAnimator KWHzl(AbstractC59242zdO abstractC59242zdO, Function1<? super java.lang.Integer, C56857yUx> function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2) {
        InterfaceC59315zei interfaceC59315zeiDjBIcL;
        boolean z3;
        Activity activity;
        InterfaceC59317zek interfaceC59317zekEZpvd;
        boolean zKWHzl = C56885yVy.KWHzl(typeComponentPosition);
        boolean z4 = (z2 && z) ? false : true;
        AbstractC59233zdF abstractC59233zdF = null;
        if (!zKWHzl && abstractC59242zdO.bY_().isEmpty()) {
            return new StateListAnimator(null, 1, false);
        }
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59242zdO.djBIcL().OLrzqt();
        if (interfaceC56663yNsOLrzqt == null) {
            return new StateListAnimator(null, 1, false);
        }
        C56857yUx c56857yUxInvoke = function1.invoke(java.lang.Integer.valueOf(i));
        InterfaceC56663yNs interfaceC56663yNsKWHzl = yVD.KWHzl(interfaceC56663yNsOLrzqt, c56857yUxInvoke, typeComponentPosition);
        java.lang.Boolean boolKWHzl = yVD.KWHzl(c56857yUxInvoke, typeComponentPosition);
        if (interfaceC56663yNsKWHzl == null || (interfaceC59315zeiDjBIcL = interfaceC56663yNsKWHzl.fJNWhG()) == null) {
            interfaceC59315zeiDjBIcL = abstractC59242zdO.djBIcL();
        }
        InterfaceC59315zei interfaceC59315zei = interfaceC59315zeiDjBIcL;
        int iAEQbTJ = i + 1;
        java.util.List<InterfaceC59317zek> listBY_ = abstractC59242zdO.bY_();
        java.util.List<InterfaceC56691yOt> listCopydefault = interfaceC59315zei.copydefault();
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        java.util.Iterator<T> it = listBY_.iterator();
        java.util.Iterator<T> it2 = listCopydefault.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(C56403yEb.AYXKKw(listBY_, 10), C56403yEb.AYXKKw(listCopydefault, 10)));
        while (it.hasNext() && it2.hasNext()) {
            java.lang.Object next = it.next();
            InterfaceC56691yOt interfaceC56691yOt = (InterfaceC56691yOt) it2.next();
            InterfaceC59317zek interfaceC59317zek = (InterfaceC59317zek) next;
            if (!z4) {
                z3 = z4;
                activity = new Activity(abstractC59233zdF, 0);
            } else {
                z3 = z4;
                if (!interfaceC59317zek.AEQbTJ()) {
                    activity = copydefault(interfaceC59317zek.OLrzqt().AkhnZx(), function1, iAEQbTJ, z2);
                } else if (function1.invoke(java.lang.Integer.valueOf(iAEQbTJ)).OLrzqt() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    AbstractC59331zey abstractC59331zeyAkhnZx = interfaceC59317zek.OLrzqt().AkhnZx();
                    activity = new Activity(C59231zdD.copydefault(C59278zdy.KWHzl(abstractC59331zeyAkhnZx).AEQbTJ(false), C59278zdy.OLrzqt(abstractC59331zeyAkhnZx).AEQbTJ(true)), 1);
                } else {
                    activity = new Activity(null, 1);
                }
            }
            iAEQbTJ += activity.AEQbTJ();
            if (activity.copydefault() != null) {
                AbstractC59233zdF abstractC59233zdFCopydefault = activity.copydefault();
                Variance varianceEZpvd = interfaceC59317zek.EZpvd();
                Intrinsics.checkNotNullExpressionValue(varianceEZpvd, "");
                interfaceC59317zekEZpvd = C59336zfC.OLrzqt(abstractC59233zdFCopydefault, varianceEZpvd, interfaceC56691yOt);
            } else if (interfaceC56663yNsKWHzl == null || interfaceC59317zek.AEQbTJ()) {
                interfaceC59317zekEZpvd = interfaceC56663yNsKWHzl != null ? C59322zep.EZpvd(interfaceC56691yOt) : null;
            } else {
                AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
                Variance varianceEZpvd2 = interfaceC59317zek.EZpvd();
                Intrinsics.checkNotNullExpressionValue(varianceEZpvd2, "");
                interfaceC59317zekEZpvd = C59336zfC.OLrzqt(abstractC59233zdFOLrzqt, varianceEZpvd2, interfaceC56691yOt);
            }
            arrayList.add(interfaceC59317zekEZpvd);
            z4 = z3;
            abstractC59233zdF = null;
        }
        int i2 = iAEQbTJ - i;
        if (interfaceC56663yNsKWHzl == null && boolKWHzl == null) {
            if (!arrayList.isEmpty()) {
                java.util.Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC59317zek) it3.next()) == null) {
                    }
                }
            }
            return new StateListAnimator(null, i2, false);
        }
        yOL[] yolArr = new yOL[3];
        yolArr[0] = abstractC59242zdO.copydefault();
        C56855yUv c56855yUv = yVD.KWHzl;
        if (interfaceC56663yNsKWHzl == null) {
            c56855yUv = null;
        }
        yolArr[1] = c56855yUv;
        yolArr[2] = boolKWHzl != null ? yVD.EZpvd() : null;
        C59308zeb c59308zebAEQbTJ = C59314zeh.AEQbTJ(yVD.copydefault(yDY.valueOf(yolArr)));
        java.util.List<InterfaceC59317zek> listBY_2 = abstractC59242zdO.bY_();
        java.util.Iterator it4 = arrayList.iterator();
        java.util.Iterator<T> it5 = listBY_2.iterator();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(java.lang.Math.min(C56403yEb.AYXKKw(arrayList, 10), C56403yEb.AYXKKw(listBY_2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            java.lang.Object next2 = it4.next();
            InterfaceC59317zek interfaceC59317zek2 = (InterfaceC59317zek) it5.next();
            InterfaceC59317zek interfaceC59317zek3 = (InterfaceC59317zek) next2;
            if (interfaceC59317zek3 != null) {
                interfaceC59317zek2 = interfaceC59317zek3;
            }
            arrayList2.add(interfaceC59317zek2);
        }
        AbstractC59242zdO abstractC59242zdOSimpleType$default = C59231zdD.simpleType$default(c59308zebAEQbTJ, interfaceC59315zei, arrayList2, boolKWHzl != null ? boolKWHzl.booleanValue() : abstractC59242zdO.AEQbTJ(), (AbstractC59287zeG) null, 16, (java.lang.Object) null);
        if (c56857yUxInvoke.AEQbTJ()) {
            abstractC59242zdOSimpleType$default = EZpvd(abstractC59242zdOSimpleType$default);
        }
        return new StateListAnimator(abstractC59242zdOSimpleType$default, i2, boolKWHzl != null && c56857yUxInvoke.copydefault());
    }

    public final AbstractC59242zdO EZpvd(AbstractC59242zdO abstractC59242zdO) {
        if (this.EZpvd.AEQbTJ()) {
            return C59245zdR.copydefault(abstractC59242zdO, true);
        }
        return new C56856yUw(abstractC59242zdO);
    }
}
