package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56708yPj extends yOW {
    public final InterfaceC56686yOo AYXKKw;
    public final boolean KWHzl;
    public final InterfaceC56665yNu OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void copydefault(int i) {
        java.lang.String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean zsXlph() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC56708yPj(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull C56935yXu c56935yXu, @NotNull InterfaceC56686yOo interfaceC56686yOo, boolean z) {
        super(interfaceC59187zcM, c56935yXu);
        if (interfaceC59187zcM == null) {
            copydefault(0);
        }
        if (interfaceC56665yNu == null) {
            copydefault(1);
        }
        if (c56935yXu == null) {
            copydefault(2);
        }
        if (interfaceC56686yOo == null) {
            copydefault(3);
        }
        this.OLrzqt = interfaceC56665yNu;
        this.AYXKKw = interfaceC56686yOo;
        this.KWHzl = z;
    }

    @Override // o.InterfaceC56658yNn, o.InterfaceC56666yNv, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: AYXKKw */
    public InterfaceC56665yNu AuCTel() {
        InterfaceC56665yNu interfaceC56665yNu = this.OLrzqt;
        if (interfaceC56665yNu == null) {
            copydefault(4);
        }
        return interfaceC56665yNu;
    }

    @Override // o.InterfaceC56664yNt
    public InterfaceC56686yOo fARcdN() {
        InterfaceC56686yOo interfaceC56686yOo = this.AYXKKw;
        if (interfaceC56686yOo == null) {
            copydefault(5);
        }
        return interfaceC56686yOo;
    }
}
