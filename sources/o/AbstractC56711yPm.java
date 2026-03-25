package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56711yPm extends yOH implements InterfaceC56665yNu {
    public final C56935yXu gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void EZpvd(int i) {
        java.lang.String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: bT_ */
    public InterfaceC56665yNu AhwBna() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC56711yPm(@NotNull yOL yol, @NotNull C56935yXu c56935yXu) {
        super(yol);
        if (yol == null) {
            EZpvd(0);
        }
        if (c56935yXu == null) {
            EZpvd(1);
        }
        this.gEmmrt = c56935yXu;
    }

    @Override // o.yNQ
    public C56935yXu bR_() {
        C56935yXu c56935yXu = this.gEmmrt;
        if (c56935yXu == null) {
            EZpvd(2);
        }
        return c56935yXu;
    }

    public java.lang.String toString() {
        return KWHzl(this);
    }

    public static java.lang.String KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            EZpvd(4);
        }
        try {
            java.lang.String str = yXX.djBIcL.copydefault(interfaceC56665yNu) + "[" + interfaceC56665yNu.getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(interfaceC56665yNu)) + "]";
            if (str == null) {
                EZpvd(5);
            }
            return str;
        } catch (java.lang.Throwable unused) {
            java.lang.String str2 = interfaceC56665yNu.getClass().getSimpleName() + " " + interfaceC56665yNu.bR_();
            if (str2 == null) {
                EZpvd(6);
            }
            return str2;
        }
    }
}
