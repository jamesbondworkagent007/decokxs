package o;

import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59306zeZ {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [70=4] */
    public static final AbstractC59233zdF copydefault(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull AbstractC59233zdF abstractC59233zdF2, @NotNull InterfaceC59303zeW interfaceC59303zeW) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF2, "");
        Intrinsics.checkNotNullParameter(interfaceC59303zeW, "");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new C59304zeX(abstractC59233zdF, null));
        InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59233zdF2.djBIcL();
        while (!arrayDeque.isEmpty()) {
            C59304zeX c59304zeX = (C59304zeX) arrayDeque.poll();
            AbstractC59233zdF abstractC59233zdFEZpvd = c59304zeX.EZpvd();
            InterfaceC59315zei interfaceC59315zeiDjBIcL2 = abstractC59233zdFEZpvd.djBIcL();
            if (interfaceC59303zeW.AEQbTJ(interfaceC59315zeiDjBIcL2, interfaceC59315zeiDjBIcL)) {
                boolean zAEQbTJ = abstractC59233zdFEZpvd.AEQbTJ();
                for (C59304zeX c59304zeXAEQbTJ = c59304zeX.AEQbTJ(); c59304zeXAEQbTJ != null; c59304zeXAEQbTJ = c59304zeXAEQbTJ.AEQbTJ()) {
                    AbstractC59233zdF abstractC59233zdFEZpvd2 = c59304zeXAEQbTJ.EZpvd();
                    java.util.List<InterfaceC59317zek> listBY_ = abstractC59233zdFEZpvd2.bY_();
                    if ((listBY_ instanceof java.util.Collection) && listBY_.isEmpty()) {
                        abstractC59233zdFEZpvd = AbstractC59316zej.AEQbTJ.AEQbTJ(abstractC59233zdFEZpvd2).valueOf().AEQbTJ(abstractC59233zdFEZpvd, Variance.INVARIANT);
                        Intrinsics.copydefault(abstractC59233zdFEZpvd);
                    } else {
                        java.util.Iterator<T> it = listBY_.iterator();
                        while (it.hasNext()) {
                            Variance varianceEZpvd = ((InterfaceC59317zek) it.next()).EZpvd();
                            Variance variance = Variance.INVARIANT;
                            if (varianceEZpvd != variance) {
                                AbstractC59233zdF abstractC59233zdFAEQbTJ = yYX.wrapWithCapturingSubstitution$default(AbstractC59316zej.AEQbTJ.AEQbTJ(abstractC59233zdFEZpvd2), false, 1, null).valueOf().AEQbTJ(abstractC59233zdFEZpvd, variance);
                                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFAEQbTJ, "");
                                abstractC59233zdFEZpvd = OLrzqt(abstractC59233zdFAEQbTJ);
                                break;
                            }
                        }
                        abstractC59233zdFEZpvd = AbstractC59316zej.AEQbTJ.AEQbTJ(abstractC59233zdFEZpvd2).valueOf().AEQbTJ(abstractC59233zdFEZpvd, Variance.INVARIANT);
                        Intrinsics.copydefault(abstractC59233zdFEZpvd);
                    }
                    zAEQbTJ = zAEQbTJ || abstractC59233zdFEZpvd2.AEQbTJ();
                }
                InterfaceC59315zei interfaceC59315zeiDjBIcL3 = abstractC59233zdFEZpvd.djBIcL();
                if (interfaceC59303zeW.AEQbTJ(interfaceC59315zeiDjBIcL3, interfaceC59315zeiDjBIcL)) {
                    return C59322zep.EZpvd(abstractC59233zdFEZpvd, zAEQbTJ);
                }
                throw new java.lang.AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + EZpvd(interfaceC59315zeiDjBIcL3) + ", \n\nsupertype: " + EZpvd(interfaceC59315zeiDjBIcL) + " \n" + interfaceC59303zeW.AEQbTJ(interfaceC59315zeiDjBIcL3, interfaceC59315zeiDjBIcL));
            }
            for (AbstractC59233zdF abstractC59233zdF3 : interfaceC59315zeiDjBIcL2.bV_()) {
                Intrinsics.copydefault(abstractC59233zdF3);
                arrayDeque.add(new C59304zeX(abstractC59233zdF3, c59304zeX));
            }
        }
        return null;
    }

    public static final AbstractC59233zdF OLrzqt(AbstractC59233zdF abstractC59233zdF) {
        return C59344zfK.copydefault(abstractC59233zdF).AEQbTJ();
    }

    public static final java.lang.String EZpvd(InterfaceC59315zei interfaceC59315zei) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        KWHzl("type: " + interfaceC59315zei, sb);
        KWHzl("hashCode: " + interfaceC59315zei.hashCode(), sb);
        KWHzl("javaClass: " + interfaceC59315zei.getClass().getCanonicalName(), sb);
        for (InterfaceC56665yNu interfaceC56665yNuKWHzl = interfaceC59315zei.KWHzl(); interfaceC56665yNuKWHzl != null; interfaceC56665yNuKWHzl = interfaceC56665yNuKWHzl.AYXKKw()) {
            KWHzl("fqName: " + yXX.gEmmrt.copydefault(interfaceC56665yNuKWHzl), sb);
            KWHzl("javaClass: " + interfaceC56665yNuKWHzl.getClass().getCanonicalName(), sb);
        }
        return sb.toString();
    }

    public static final java.lang.StringBuilder KWHzl(java.lang.String str, java.lang.StringBuilder sb) {
        Intrinsics.checkNotNullParameter(str, "");
        sb.append(str);
        sb.append('\n');
        return sb;
    }
}
