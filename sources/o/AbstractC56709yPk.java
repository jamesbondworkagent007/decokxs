package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56709yPk extends AbstractC56711yPm implements InterfaceC56666yNv {
    public final InterfaceC56665yNu AYXKKw;
    public final InterfaceC56686yOo values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void OLrzqt(int i) {
        java.lang.String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC56709yPk(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        super(yol, c56935yXu);
        if (interfaceC56665yNu == null) {
            OLrzqt(0);
        }
        if (yol == null) {
            OLrzqt(1);
        }
        if (c56935yXu == null) {
            OLrzqt(2);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(3);
        }
        this.AYXKKw = interfaceC56665yNu;
        this.values = interfaceC56686yOo;
    }

    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    @Override // o.AbstractC56711yPm, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: DbNXlk */
    public InterfaceC56664yNt AhwBna() {
        InterfaceC56664yNt interfaceC56664yNt = (InterfaceC56664yNt) super.AhwBna();
        if (interfaceC56664yNt == null) {
            OLrzqt(4);
        }
        return interfaceC56664yNt;
    }

    public InterfaceC56665yNu AYXKKw() {
        InterfaceC56665yNu interfaceC56665yNu = this.AYXKKw;
        if (interfaceC56665yNu == null) {
            OLrzqt(5);
        }
        return interfaceC56665yNu;
    }

    public InterfaceC56686yOo fARcdN() {
        InterfaceC56686yOo interfaceC56686yOo = this.values;
        if (interfaceC56686yOo == null) {
            OLrzqt(6);
        }
        return interfaceC56686yOo;
    }
}
