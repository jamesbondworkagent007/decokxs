package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56717yPs extends AbstractC56699yPa {
    public final InterfaceC56658yNn EZpvd;
    public final C59115zau OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void copydefault(int i) {
        java.lang.String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56717yPs(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        super(yOL.KWHzl.OLrzqt());
        if (interfaceC56658yNn == null) {
            copydefault(0);
        }
        this.EZpvd = interfaceC56658yNn;
        this.OLrzqt = new C59115zau(interfaceC56658yNn, null);
    }

    @Override // o.InterfaceC56679yOh
    public InterfaceC59070zaB KWHzl() {
        C59115zau c59115zau = this.OLrzqt;
        if (c59115zau == null) {
            copydefault(1);
        }
        return c59115zau;
    }

    @Override // o.InterfaceC56665yNu
    /* JADX INFO: renamed from: AYXKKw */
    public InterfaceC56665yNu AuCTel() {
        InterfaceC56658yNn interfaceC56658yNn = this.EZpvd;
        if (interfaceC56658yNn == null) {
            copydefault(2);
        }
        return interfaceC56658yNn;
    }

    @Override // o.AbstractC56711yPm
    public java.lang.String toString() {
        return "class " + this.EZpvd.bR_() + "::this";
    }
}
