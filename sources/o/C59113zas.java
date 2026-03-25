package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zas, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59113zas extends AbstractC59117zaw implements InterfaceC59120zaz {
    public final InterfaceC56657yNm EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void OLrzqt(int i) {
        java.lang.String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 2) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59113zas(@NotNull InterfaceC56657yNm interfaceC56657yNm, @NotNull AbstractC59233zdF abstractC59233zdF, InterfaceC59070zaB interfaceC59070zaB) {
        super(abstractC59233zdF, interfaceC59070zaB);
        if (interfaceC56657yNm == null) {
            OLrzqt(0);
        }
        if (abstractC59233zdF == null) {
            OLrzqt(1);
        }
        this.EZpvd = interfaceC56657yNm;
    }

    public java.lang.String toString() {
        return OLrzqt() + ": Ext {" + this.EZpvd + "}";
    }
}
