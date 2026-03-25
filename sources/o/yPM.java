package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yPM extends AbstractC56699yPa {
    public InterfaceC59070zaB AEQbTJ;
    public final InterfaceC56665yNu OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void KWHzl(int i) {
        java.lang.String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yPM(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull InterfaceC59070zaB interfaceC59070zaB, @NotNull yOL yol) {
        this(interfaceC56665yNu, interfaceC59070zaB, yol, C56938yXx.ejfBZ);
        if (interfaceC56665yNu == null) {
            KWHzl(0);
        }
        if (interfaceC59070zaB == null) {
            KWHzl(1);
        }
        if (yol == null) {
            KWHzl(2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yPM(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull InterfaceC59070zaB interfaceC59070zaB, @NotNull yOL yol, @NotNull C56935yXu c56935yXu) {
        super(yol, c56935yXu);
        if (interfaceC56665yNu == null) {
            KWHzl(3);
        }
        if (interfaceC59070zaB == null) {
            KWHzl(4);
        }
        if (yol == null) {
            KWHzl(5);
        }
        if (c56935yXu == null) {
            KWHzl(6);
        }
        this.OLrzqt = interfaceC56665yNu;
        this.AEQbTJ = interfaceC59070zaB;
    }

    @Override // o.InterfaceC56679yOh
    public InterfaceC59070zaB KWHzl() {
        InterfaceC59070zaB interfaceC59070zaB = this.AEQbTJ;
        if (interfaceC59070zaB == null) {
            KWHzl(7);
        }
        return interfaceC59070zaB;
    }

    @Override // o.InterfaceC56665yNu
    /* JADX INFO: renamed from: AYXKKw */
    public InterfaceC56665yNu AuCTel() {
        InterfaceC56665yNu interfaceC56665yNu = this.OLrzqt;
        if (interfaceC56665yNu == null) {
            KWHzl(8);
        }
        return interfaceC56665yNu;
    }
}
