package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59075zaG extends AbstractC59117zaw {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void AEQbTJ(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59075zaG(@NotNull AbstractC59233zdF abstractC59233zdF) {
        this(abstractC59233zdF, null);
        if (abstractC59233zdF == null) {
            AEQbTJ(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59075zaG(@NotNull AbstractC59233zdF abstractC59233zdF, InterfaceC59070zaB interfaceC59070zaB) {
        super(abstractC59233zdF, interfaceC59070zaB);
        if (abstractC59233zdF == null) {
            AEQbTJ(1);
        }
    }

    public java.lang.String toString() {
        return "{Transient} : " + OLrzqt();
    }
}
