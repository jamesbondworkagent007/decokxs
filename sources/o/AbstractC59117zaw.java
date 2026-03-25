package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59117zaw implements InterfaceC59070zaB {
    public final InterfaceC59070zaB AEQbTJ;
    public final AbstractC59233zdF KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void EZpvd(int i) {
        java.lang.String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public AbstractC59117zaw(@NotNull AbstractC59233zdF abstractC59233zdF, InterfaceC59070zaB interfaceC59070zaB) {
        if (abstractC59233zdF == null) {
            EZpvd(0);
        }
        this.KWHzl = abstractC59233zdF;
        this.AEQbTJ = interfaceC59070zaB == null ? this : interfaceC59070zaB;
    }

    @Override // o.InterfaceC59070zaB
    public AbstractC59233zdF OLrzqt() {
        AbstractC59233zdF abstractC59233zdF = this.KWHzl;
        if (abstractC59233zdF == null) {
            EZpvd(1);
        }
        return abstractC59233zdF;
    }
}
