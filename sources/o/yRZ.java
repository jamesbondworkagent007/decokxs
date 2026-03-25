package o;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import o.InterfaceC56657yNm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yRZ extends C56707yPi implements InterfaceC56781ySb {
    public java.lang.Boolean AxsJAY;
    public java.lang.Boolean gHZMYf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void AEQbTJ(int i) {
        java.lang.String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yRZ(@NotNull InterfaceC56658yNn interfaceC56658yNn, yRZ yrz, @NotNull yOL yol, boolean z, @NotNull CallableMemberDescriptor.Kind kind, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        super(interfaceC56658yNn, yrz, yol, z, kind, interfaceC56686yOo);
        if (interfaceC56658yNn == null) {
            AEQbTJ(0);
        }
        if (yol == null) {
            AEQbTJ(1);
        }
        if (kind == null) {
            AEQbTJ(2);
        }
        if (interfaceC56686yOo == null) {
            AEQbTJ(3);
        }
        this.AxsJAY = null;
        this.gHZMYf = null;
    }

    public static yRZ EZpvd(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull yOL yol, boolean z, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56658yNn == null) {
            AEQbTJ(4);
        }
        if (yol == null) {
            AEQbTJ(5);
        }
        if (interfaceC56686yOo == null) {
            AEQbTJ(6);
        }
        return new yRZ(interfaceC56658yNn, null, yol, z, CallableMemberDescriptor.Kind.DECLARATION, interfaceC56686yOo);
    }

    @Override // o.AbstractC56718yPt
    public boolean DTwDnp() {
        return this.AxsJAY.booleanValue();
    }

    @Override // o.AbstractC56718yPt
    public void EZpvd(boolean z) {
        this.AxsJAY = java.lang.Boolean.valueOf(z);
    }

    @Override // o.AbstractC56718yPt, o.InterfaceC56657yNm
    public boolean values() {
        return this.gHZMYf.booleanValue();
    }

    @Override // o.AbstractC56718yPt
    public void copydefault(boolean z) {
        this.gHZMYf = java.lang.Boolean.valueOf(z);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/yNu;Lo/yNG;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Lo/yXu;Lo/yOL;Lo/yOo;)Lo/yPi; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/yNu;Lo/yNG;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Lo/yXu;Lo/yOL;Lo/yOo;)Lo/yPt; */
    @Override // o.C56707yPi, o.AbstractC56718yPt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public yRZ KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, yNG yng, @NotNull CallableMemberDescriptor.Kind kind, C56935yXu c56935yXu, @NotNull yOL yol, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56665yNu == null) {
            AEQbTJ(7);
        }
        if (kind == null) {
            AEQbTJ(8);
        }
        if (yol == null) {
            AEQbTJ(9);
        }
        if (interfaceC56686yOo == null) {
            AEQbTJ(10);
        }
        if (kind != CallableMemberDescriptor.Kind.DECLARATION && kind != CallableMemberDescriptor.Kind.SYNTHESIZED) {
            throw new java.lang.IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC56665yNu + "\nkind: " + kind);
        }
        yRZ yrzAEQbTJ = AEQbTJ((InterfaceC56658yNn) interfaceC56665yNu, (yRZ) yng, kind, interfaceC56686yOo, yol);
        yrzAEQbTJ.EZpvd(DTwDnp());
        yrzAEQbTJ.copydefault(values());
        return yrzAEQbTJ;
    }

    public yRZ AEQbTJ(@NotNull InterfaceC56658yNn interfaceC56658yNn, yRZ yrz, @NotNull CallableMemberDescriptor.Kind kind, @NotNull InterfaceC56686yOo interfaceC56686yOo, @NotNull yOL yol) {
        if (interfaceC56658yNn == null) {
            AEQbTJ(12);
        }
        if (kind == null) {
            AEQbTJ(13);
        }
        if (interfaceC56686yOo == null) {
            AEQbTJ(14);
        }
        if (yol == null) {
            AEQbTJ(15);
        }
        return new yRZ(interfaceC56658yNn, yrz, yol, this.EZpvd, kind, interfaceC56686yOo);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zdF;Ljava/util/List;Lo/zdF;Lkotlin/Pair;)Lo/ySb; */
    @Override // o.InterfaceC56781ySb
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public yRZ KWHzl(AbstractC59233zdF abstractC59233zdF, @NotNull java.util.List<AbstractC59233zdF> list, @NotNull AbstractC59233zdF abstractC59233zdF2, kotlin.Pair<InterfaceC56657yNm.Application<?>, ?> pair) {
        if (list == null) {
            AEQbTJ(16);
        }
        if (abstractC59233zdF2 == null) {
            AEQbTJ(17);
        }
        yRZ yrzKWHzl = KWHzl(AuCTel(), (yNG) null, bW_(), (C56935yXu) null, copydefault(), fARcdN());
        yrzKWHzl.AEQbTJ(abstractC59233zdF == null ? null : yYI.copydefault(yrzKWHzl, abstractC59233zdF, yOL.KWHzl.OLrzqt()), AEQbTJ(), yDY.AhwBna(), AkhnZx(), C56785ySf.EZpvd(list, fetchVPNInfo(), yrzKWHzl), abstractC59233zdF2, isConnected(), getNewProxyInstance());
        if (pair != null) {
            yrzKWHzl.copydefault(pair.getFirst(), pair.getSecond());
        }
        return yrzKWHzl;
    }
}
