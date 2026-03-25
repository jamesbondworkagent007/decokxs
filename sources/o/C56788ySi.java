package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import o.InterfaceC56657yNm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56788ySi extends yPI implements InterfaceC56781ySb {
    public AbstractC59233zdF AwvSrB;
    public final kotlin.Pair<InterfaceC56657yNm.Application<?>, ?> sSMYrx;
    public final boolean zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void OLrzqt(int i) {
        java.lang.String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 21) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yPI
    public void copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            OLrzqt(22);
        }
        this.AwvSrB = abstractC59233zdF;
    }

    @Override // o.yPT, o.InterfaceC56657yNm
    public boolean values() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56788ySi(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, @NotNull Modality modality, @NotNull yNC ync, boolean z, @NotNull C56935yXu c56935yXu, @NotNull InterfaceC56686yOo interfaceC56686yOo, InterfaceC56676yOe interfaceC56676yOe, @NotNull CallableMemberDescriptor.Kind kind, boolean z2, kotlin.Pair<InterfaceC56657yNm.Application<?>, ?> pair) {
        super(interfaceC56665yNu, interfaceC56676yOe, yol, modality, ync, z, c56935yXu, kind, interfaceC56686yOo, false, false, false, false, false, false);
        if (interfaceC56665yNu == null) {
            OLrzqt(0);
        }
        if (yol == null) {
            OLrzqt(1);
        }
        if (modality == null) {
            OLrzqt(2);
        }
        if (ync == null) {
            OLrzqt(3);
        }
        if (c56935yXu == null) {
            OLrzqt(4);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(5);
        }
        if (kind == null) {
            OLrzqt(6);
        }
        this.AwvSrB = null;
        this.zuBGHE = z2;
        this.sSMYrx = pair;
    }

    public static C56788ySi KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, @NotNull Modality modality, @NotNull yNC ync, boolean z, @NotNull C56935yXu c56935yXu, @NotNull InterfaceC56686yOo interfaceC56686yOo, boolean z2) {
        if (interfaceC56665yNu == null) {
            OLrzqt(7);
        }
        if (yol == null) {
            OLrzqt(8);
        }
        if (modality == null) {
            OLrzqt(9);
        }
        if (ync == null) {
            OLrzqt(10);
        }
        if (c56935yXu == null) {
            OLrzqt(11);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(12);
        }
        return new C56788ySi(interfaceC56665yNu, yol, modality, ync, z, c56935yXu, interfaceC56686yOo, null, CallableMemberDescriptor.Kind.DECLARATION, z2, null);
    }

    @Override // o.yPI
    public yPI AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull Modality modality, @NotNull yNC ync, InterfaceC56676yOe interfaceC56676yOe, @NotNull CallableMemberDescriptor.Kind kind, @NotNull C56935yXu c56935yXu, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56665yNu == null) {
            OLrzqt(13);
        }
        if (modality == null) {
            OLrzqt(14);
        }
        if (ync == null) {
            OLrzqt(15);
        }
        if (kind == null) {
            OLrzqt(16);
        }
        if (c56935yXu == null) {
            OLrzqt(17);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(18);
        }
        return new C56788ySi(interfaceC56665yNu, copydefault(), modality, ync, AubY(), c56935yXu, interfaceC56686yOo, interfaceC56676yOe, kind, this.zuBGHE, this.sSMYrx);
    }

    @Override // o.InterfaceC56781ySb
    public InterfaceC56781ySb KWHzl(AbstractC59233zdF abstractC59233zdF, @NotNull java.util.List<AbstractC59233zdF> list, @NotNull AbstractC59233zdF abstractC59233zdF2, kotlin.Pair<InterfaceC56657yNm.Application<?>, ?> pair) {
        yPL ypl;
        yPN ypn;
        if (list == null) {
            OLrzqt(19);
        }
        if (abstractC59233zdF2 == null) {
            OLrzqt(20);
        }
        InterfaceC56676yOe interfaceC56676yOeBT_ = AhwBna() == this ? null : AhwBna();
        C56788ySi c56788ySi = new C56788ySi(AuCTel(), copydefault(), isConnected(), getNewProxyInstance(), AubY(), bR_(), fARcdN(), interfaceC56676yOeBT_, bW_(), this.zuBGHE, pair);
        yPL yplEjfBZ = ejfBZ();
        if (yplEjfBZ != null) {
            ypl = new yPL(c56788ySi, yplEjfBZ.copydefault(), yplEjfBZ.isConnected(), yplEjfBZ.getNewProxyInstance(), yplEjfBZ.AuCTel(), yplEjfBZ.zsXlph(), yplEjfBZ.EZpvd(), bW_(), interfaceC56676yOeBT_ == null ? null : interfaceC56676yOeBT_.ejfBZ(), yplEjfBZ.fARcdN());
            ypl.AEQbTJ(yplEjfBZ.uzCIH());
            ypl.OLrzqt(abstractC59233zdF2);
        } else {
            ypl = null;
        }
        InterfaceC56680yOi fieldNames = getFieldNames();
        if (fieldNames != null) {
            ypn = new yPN(c56788ySi, fieldNames.copydefault(), fieldNames.isConnected(), fieldNames.getNewProxyInstance(), fieldNames.AuCTel(), fieldNames.zsXlph(), fieldNames.EZpvd(), bW_(), interfaceC56676yOeBT_ == null ? null : interfaceC56676yOeBT_.getFieldNames(), fieldNames.fARcdN());
            ypn.AEQbTJ(ypn.uzCIH());
            ypn.OLrzqt(fieldNames.fetchVPNInfo().get(0));
        } else {
            ypn = null;
        }
        c56788ySi.copydefault(ypl, ypn, EZpvd(), fIwbmz());
        c56788ySi.EZpvd(gHZMYf());
        Function0<InterfaceC59180zcF<AbstractC56975yZg<?>>> function0 = this.AuCTelauCTel;
        if (function0 != null) {
            c56788ySi.OLrzqt(this.AubY, function0);
        }
        c56788ySi.copydefault(valueOf());
        c56788ySi.AEQbTJ(abstractC59233zdF2, AkhnZx(), AEQbTJ(), abstractC59233zdF == null ? null : yYI.copydefault(this, abstractC59233zdF, yOL.KWHzl.OLrzqt()), yDY.AhwBna());
        return c56788ySi;
    }

    @Override // o.yPI, o.yPT, o.yOC
    public boolean wlaJM() {
        AbstractC59233zdF abstractC59233zdFUzCIH = uzCIH();
        return this.zuBGHE && C56662yNr.copydefault(abstractC59233zdFUzCIH) && (!yVD.EZpvd(abstractC59233zdFUzCIH) || AbstractC56640yMw.AkhnZx(abstractC59233zdFUzCIH));
    }

    @Override // o.yPI, o.yPT, o.InterfaceC56657yNm
    public <V> V AEQbTJ(InterfaceC56657yNm.Application<V> application) {
        kotlin.Pair<InterfaceC56657yNm.Application<?>, ?> pair = this.sSMYrx;
        if (pair == null || !pair.getFirst().equals(application)) {
            return null;
        }
        return (V) this.sSMYrx.getSecond();
    }
}
