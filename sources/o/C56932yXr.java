package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56932yXr {
    public static final Application EZpvd = new Application(null);
    public static final C56933yXs OLrzqt;
    public static final C56935yXu copydefault;
    public final C56935yXu AEQbTJ;
    public final C56933yXs AYXKKw;
    public final C56929yXo KWHzl;
    public final C56933yXs djBIcL;
    public final C56933yXs valueOf;

    public C56932yXr(C56933yXs c56933yXs, C56933yXs c56933yXs2, C56935yXu c56935yXu, C56929yXo c56929yXo, C56933yXs c56933yXs3) {
        this.AYXKKw = c56933yXs;
        this.valueOf = c56933yXs2;
        this.AEQbTJ = c56935yXu;
        this.KWHzl = c56929yXo;
        this.djBIcL = c56933yXs3;
    }

    /* JADX INFO: renamed from: o.yXr$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yXr.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    static {
        C56935yXu c56935yXu = C56938yXx.values;
        copydefault = c56935yXu;
        OLrzqt = C56933yXs.OLrzqt.KWHzl(c56935yXu);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C56932yXr(@NotNull C56933yXs c56933yXs, @NotNull C56935yXu c56935yXu) {
        this(c56933yXs, null, c56935yXu, null, null);
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof C56932yXr) {
                C56932yXr c56932yXr = (C56932yXr) obj;
                if (!Intrinsics.EZpvd(this.AYXKKw, c56932yXr.AYXKKw) || !Intrinsics.EZpvd(this.valueOf, c56932yXr.valueOf) || !Intrinsics.EZpvd(this.AEQbTJ, c56932yXr.AEQbTJ)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        C56933yXs c56933yXs = this.valueOf;
        return ((((iHashCode + 527) * 31) + (c56933yXs != null ? c56933yXs.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(C59449zhJ.replace$default(this.AYXKKw.KWHzl(), '.', JsonPointer.SEPARATOR, false, 4, (java.lang.Object) null));
        sb.append("/");
        C56933yXs c56933yXs = this.valueOf;
        if (c56933yXs != null) {
            sb.append(c56933yXs);
            sb.append(JwtUtilsKt.JWT_DELIMITER);
        }
        sb.append(this.AEQbTJ);
        return sb.toString();
    }
}
