package o;

import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59268zdo {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void OLrzqt(int i) {
        java.lang.String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 4) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public static TypeSubstitutor AEQbTJ(@NotNull java.util.List<InterfaceC56691yOt> list, @NotNull AbstractC59325zes abstractC59325zes, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull java.util.List<InterfaceC56691yOt> list2) {
        if (list == null) {
            OLrzqt(0);
        }
        if (abstractC59325zes == null) {
            OLrzqt(1);
        }
        if (interfaceC56665yNu == null) {
            OLrzqt(2);
        }
        if (list2 == null) {
            OLrzqt(3);
        }
        TypeSubstitutor typeSubstitutorAEQbTJ = AEQbTJ(list, abstractC59325zes, interfaceC56665yNu, list2, null);
        if (typeSubstitutorAEQbTJ != null) {
            return typeSubstitutorAEQbTJ;
        }
        throw new java.lang.AssertionError("Substitution failed");
    }

    public static TypeSubstitutor AEQbTJ(@NotNull java.util.List<InterfaceC56691yOt> list, @NotNull AbstractC59325zes abstractC59325zes, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull java.util.List<InterfaceC56691yOt> list2, boolean[] zArr) {
        if (list == null) {
            OLrzqt(5);
        }
        if (abstractC59325zes == null) {
            OLrzqt(6);
        }
        if (interfaceC56665yNu == null) {
            OLrzqt(7);
        }
        if (list2 == null) {
            OLrzqt(8);
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        int i = 0;
        for (InterfaceC56691yOt interfaceC56691yOt : list) {
            yPR yprEZpvd = yPR.EZpvd(interfaceC56665yNu, interfaceC56691yOt.copydefault(), interfaceC56691yOt.isConnected(), interfaceC56691yOt.values(), interfaceC56691yOt.bR_(), i, InterfaceC56686yOo.copydefault, interfaceC56691yOt.AhwBna());
            map.put(interfaceC56691yOt.fJNWhG(), new C59323zeq(yprEZpvd.bQ_()));
            map2.put(interfaceC56691yOt, yprEZpvd);
            list2.add(yprEZpvd);
            i++;
        }
        AbstractC59316zej abstractC59316zejKWHzl = AbstractC59316zej.KWHzl(map);
        TypeSubstitutor typeSubstitutorAEQbTJ = TypeSubstitutor.AEQbTJ(abstractC59325zes, abstractC59316zejKWHzl);
        TypeSubstitutor typeSubstitutorAEQbTJ2 = TypeSubstitutor.AEQbTJ(abstractC59325zes.AYXKKw(), abstractC59316zejKWHzl);
        for (InterfaceC56691yOt interfaceC56691yOt2 : list) {
            yPR ypr = (yPR) map2.get(interfaceC56691yOt2);
            for (AbstractC59233zdF abstractC59233zdF : interfaceC56691yOt2.djBIcL()) {
                InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59233zdF.djBIcL().OLrzqt();
                AbstractC59233zdF abstractC59233zdFOLrzqt = (((interfaceC56663yNsOLrzqt instanceof InterfaceC56691yOt) && C59336zfC.EZpvd((InterfaceC56691yOt) interfaceC56663yNsOLrzqt)) ? typeSubstitutorAEQbTJ : typeSubstitutorAEQbTJ2).OLrzqt(abstractC59233zdF, Variance.OUT_VARIANCE);
                if (abstractC59233zdFOLrzqt == null) {
                    return null;
                }
                if (abstractC59233zdFOLrzqt != abstractC59233zdF && zArr != null) {
                    zArr[0] = true;
                }
                ypr.OLrzqt(abstractC59233zdFOLrzqt);
            }
            ypr.uzCIH();
        }
        return typeSubstitutorAEQbTJ;
    }
}
