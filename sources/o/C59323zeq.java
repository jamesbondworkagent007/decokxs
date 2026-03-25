package o;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59323zeq extends AbstractC59318zel {
    public final AbstractC59233zdF EZpvd;
    public final Variance OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void EZpvd(int i) {
        java.lang.String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // o.InterfaceC59317zek
    public boolean AEQbTJ() {
        return false;
    }

    public C59323zeq(@NotNull Variance variance, @NotNull AbstractC59233zdF abstractC59233zdF) {
        if (variance == null) {
            EZpvd(0);
        }
        if (abstractC59233zdF == null) {
            EZpvd(1);
        }
        this.OLrzqt = variance;
        this.EZpvd = abstractC59233zdF;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59323zeq(@NotNull AbstractC59233zdF abstractC59233zdF) {
        this(Variance.INVARIANT, abstractC59233zdF);
        if (abstractC59233zdF == null) {
            EZpvd(2);
        }
    }

    @Override // o.InterfaceC59317zek
    public Variance EZpvd() {
        Variance variance = this.OLrzqt;
        if (variance == null) {
            EZpvd(4);
        }
        return variance;
    }

    @Override // o.InterfaceC59317zek
    public AbstractC59233zdF OLrzqt() {
        AbstractC59233zdF abstractC59233zdF = this.EZpvd;
        if (abstractC59233zdF == null) {
            EZpvd(5);
        }
        return abstractC59233zdF;
    }

    @Override // o.InterfaceC59317zek
    public InterfaceC59317zek copydefault(@NotNull AbstractC59287zeG abstractC59287zeG) {
        if (abstractC59287zeG == null) {
            EZpvd(6);
        }
        return new C59323zeq(this.OLrzqt, abstractC59287zeG.AEQbTJ(this.EZpvd));
    }
}
