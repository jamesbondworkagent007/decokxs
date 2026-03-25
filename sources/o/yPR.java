package o;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import o.InterfaceC56685yOn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yPR extends AbstractC56704yPf {
    public final java.util.List<AbstractC59233zdF> DbNXlk;
    public boolean djBIcL;
    public final Function1<AbstractC59233zdF, java.lang.Void> fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void OLrzqt(int i) {
        java.lang.String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AuCTel() {
        return this.djBIcL;
    }

    public static InterfaceC56691yOt KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, boolean z, @NotNull Variance variance, @NotNull C56935yXu c56935yXu, int i, @NotNull InterfaceC59187zcM interfaceC59187zcM) {
        if (interfaceC56665yNu == null) {
            OLrzqt(0);
        }
        if (yol == null) {
            OLrzqt(1);
        }
        if (variance == null) {
            OLrzqt(2);
        }
        if (c56935yXu == null) {
            OLrzqt(3);
        }
        if (interfaceC59187zcM == null) {
            OLrzqt(4);
        }
        yPR yprEZpvd = EZpvd(interfaceC56665yNu, yol, z, variance, c56935yXu, i, InterfaceC56686yOo.copydefault, interfaceC59187zcM);
        yprEZpvd.OLrzqt(yZE.AEQbTJ(interfaceC56665yNu).AuCTel());
        yprEZpvd.uzCIH();
        return yprEZpvd;
    }

    public static yPR EZpvd(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, boolean z, @NotNull Variance variance, @NotNull C56935yXu c56935yXu, int i, @NotNull InterfaceC56686yOo interfaceC56686yOo, @NotNull InterfaceC59187zcM interfaceC59187zcM) {
        if (interfaceC56665yNu == null) {
            OLrzqt(6);
        }
        if (yol == null) {
            OLrzqt(7);
        }
        if (variance == null) {
            OLrzqt(8);
        }
        if (c56935yXu == null) {
            OLrzqt(9);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(10);
        }
        if (interfaceC59187zcM == null) {
            OLrzqt(11);
        }
        return EZpvd(interfaceC56665yNu, yol, z, variance, c56935yXu, i, interfaceC56686yOo, null, InterfaceC56685yOn.Activity.KWHzl, interfaceC59187zcM);
    }

    public static yPR EZpvd(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, boolean z, @NotNull Variance variance, @NotNull C56935yXu c56935yXu, int i, @NotNull InterfaceC56686yOo interfaceC56686yOo, Function1<AbstractC59233zdF, java.lang.Void> function1, @NotNull InterfaceC56685yOn interfaceC56685yOn, @NotNull InterfaceC59187zcM interfaceC59187zcM) {
        if (interfaceC56665yNu == null) {
            OLrzqt(12);
        }
        if (yol == null) {
            OLrzqt(13);
        }
        if (variance == null) {
            OLrzqt(14);
        }
        if (c56935yXu == null) {
            OLrzqt(15);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(16);
        }
        if (interfaceC56685yOn == null) {
            OLrzqt(17);
        }
        if (interfaceC59187zcM == null) {
            OLrzqt(18);
        }
        return new yPR(interfaceC56665yNu, yol, z, variance, c56935yXu, i, interfaceC56686yOo, function1, interfaceC56685yOn, interfaceC59187zcM);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yPR(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, boolean z, @NotNull Variance variance, @NotNull C56935yXu c56935yXu, int i, @NotNull InterfaceC56686yOo interfaceC56686yOo, Function1<AbstractC59233zdF, java.lang.Void> function1, @NotNull InterfaceC56685yOn interfaceC56685yOn, @NotNull InterfaceC59187zcM interfaceC59187zcM) {
        super(interfaceC59187zcM, interfaceC56665yNu, yol, c56935yXu, variance, z, i, interfaceC56686yOo, interfaceC56685yOn);
        if (interfaceC56665yNu == null) {
            OLrzqt(19);
        }
        if (yol == null) {
            OLrzqt(20);
        }
        if (variance == null) {
            OLrzqt(21);
        }
        if (c56935yXu == null) {
            OLrzqt(22);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(23);
        }
        if (interfaceC56685yOn == null) {
            OLrzqt(24);
        }
        if (interfaceC59187zcM == null) {
            OLrzqt(25);
        }
        this.DbNXlk = new java.util.ArrayList(1);
        this.djBIcL = false;
        this.fetchVPNInfo = function1;
    }

    public final void fIwbmz() {
        if (this.djBIcL) {
            return;
        }
        throw new java.lang.IllegalStateException("Type parameter descriptor is not initialized: " + getFieldNames());
    }

    public final void ejfBZ() {
        if (this.djBIcL) {
            throw new java.lang.IllegalStateException("Type parameter descriptor is already initialized: " + getFieldNames());
        }
    }

    public final java.lang.String getFieldNames() {
        return bR_() + " declared in " + yYH.AEQbTJ(AuCTel());
    }

    public void uzCIH() {
        ejfBZ();
        this.djBIcL = true;
    }

    public void OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            OLrzqt(26);
        }
        ejfBZ();
        KWHzl(abstractC59233zdF);
    }

    public final void KWHzl(AbstractC59233zdF abstractC59233zdF) {
        if (C59238zdK.AEQbTJ(abstractC59233zdF)) {
            return;
        }
        this.DbNXlk.add(abstractC59233zdF);
    }

    @Override // o.AbstractC56704yPf
    public void copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            OLrzqt(27);
        }
        Function1<AbstractC59233zdF, java.lang.Void> function1 = this.fetchVPNInfo;
        if (function1 == null) {
            return;
        }
        function1.invoke(abstractC59233zdF);
    }

    @Override // o.AbstractC56704yPf
    public java.util.List<AbstractC59233zdF> AkhnZx() {
        fIwbmz();
        java.util.List<AbstractC59233zdF> list = this.DbNXlk;
        if (list == null) {
            OLrzqt(28);
        }
        return list;
    }
}
