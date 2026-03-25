package o;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import o.InterfaceC56657yNm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56699yPa extends AbstractC56711yPm implements InterfaceC56679yOh {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void EZpvd(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new java.lang.IllegalStateException(str2);
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    @Override // o.InterfaceC56657yNm
    public <V> V AEQbTJ(InterfaceC56657yNm.Application<V> application) {
        return null;
    }

    @Override // o.InterfaceC56657yNm
    public InterfaceC56679yOh AEQbTJ() {
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/yNm; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    @Override // o.AbstractC56711yPm, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56678yOg bT_() {
        return this;
    }

    @Override // o.InterfaceC56657yNm
    public InterfaceC56679yOh djBIcL() {
        return null;
    }

    @Override // o.InterfaceC56657yNm
    public boolean values() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC56699yPa(@NotNull yOL yol) {
        super(yol, C56938yXx.ejfBZ);
        if (yol == null) {
            EZpvd(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC56699yPa(@NotNull yOL yol, @NotNull C56935yXu c56935yXu) {
        super(yol, c56935yXu);
        if (yol == null) {
            EZpvd(1);
        }
        if (c56935yXu == null) {
            EZpvd(2);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNv; */
    @Override // o.InterfaceC56688yOq
    public InterfaceC56679yOh KWHzl(@NotNull TypeSubstitutor typeSubstitutor) {
        AbstractC59233zdF abstractC59233zdFOLrzqt;
        if (typeSubstitutor == null) {
            EZpvd(3);
        }
        if (typeSubstitutor.EZpvd()) {
            return this;
        }
        if (AuCTel() instanceof InterfaceC56658yNn) {
            abstractC59233zdFOLrzqt = typeSubstitutor.OLrzqt(uzCIH(), Variance.OUT_VARIANCE);
        } else {
            abstractC59233zdFOLrzqt = typeSubstitutor.OLrzqt(uzCIH(), Variance.INVARIANT);
        }
        if (abstractC59233zdFOLrzqt == null) {
            return null;
        }
        return abstractC59233zdFOLrzqt == uzCIH() ? this : new yPM(AuCTel(), new C59075zaG(abstractC59233zdFOLrzqt), copydefault());
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        return interfaceC56667yNw.EZpvd(this, d);
    }

    @Override // o.InterfaceC56657yNm
    public java.util.List<InterfaceC56679yOh> OLrzqt() {
        java.util.List<InterfaceC56679yOh> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            EZpvd(4);
        }
        return listEmptyList;
    }

    @Override // o.InterfaceC56657yNm
    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        java.util.List<InterfaceC56691yOt> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            EZpvd(5);
        }
        return listEmptyList;
    }

    @Override // o.InterfaceC56657yNm
    public AbstractC59233zdF gEmmrt() {
        return uzCIH();
    }

    @Override // o.InterfaceC56697yOz
    public AbstractC59233zdF uzCIH() {
        AbstractC59233zdF abstractC59233zdFOLrzqt = KWHzl().OLrzqt();
        if (abstractC59233zdFOLrzqt == null) {
            EZpvd(6);
        }
        return abstractC59233zdFOLrzqt;
    }

    @Override // o.InterfaceC56657yNm
    public java.util.List<InterfaceC56695yOx> fetchVPNInfo() {
        java.util.List<InterfaceC56695yOx> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            EZpvd(7);
        }
        return listEmptyList;
    }

    @Override // o.InterfaceC56657yNm
    public java.util.Collection<? extends InterfaceC56657yNm> valueOf() {
        java.util.Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            EZpvd(8);
        }
        return setEmptySet;
    }

    @Override // o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        yNC ync = C56669yNy.AYXKKw;
        if (ync == null) {
            EZpvd(9);
        }
        return ync;
    }

    @Override // o.InterfaceC56664yNt
    public InterfaceC56686yOo fARcdN() {
        InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
        if (interfaceC56686yOo == null) {
            EZpvd(11);
        }
        return interfaceC56686yOo;
    }
}
