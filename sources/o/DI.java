package o;

import com.okinc.requests.ProtocolConstants;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DI {
    public static final DI AEQbTJ;
    public static final ActionBar EZpvd = new ActionBar(null);
    public static final DI KWHzl;
    public static final DI OLrzqt;
    public static final DI copydefault;
    public static final java.util.Map<java.lang.String, DI> valueOf;
    public final int AhwBna;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DI copy$default(DI di, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = di.gEmmrt;
        }
        if ((i2 & 2) != 0) {
            i = di.AhwBna;
        }
        return di.AEQbTJ(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DI AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DI(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DI)) {
            return false;
        }
        DI di = (DI) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) di.gEmmrt) && this.AhwBna == di.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.gEmmrt.hashCode() * 31) + java.lang.Integer.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Scheme(protocolName=" + this.gEmmrt + ", defaultPort=" + this.AhwBna + ')';
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DI.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final DI OLrzqt() {
            return DI.copydefault;
        }

        public final DI KWHzl() {
            return DI.AEQbTJ;
        }

        public final java.util.Map<java.lang.String, DI> copydefault() {
            return DI.valueOf;
        }

        public final DI OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.Map<java.lang.String, DI> mapCopydefault = copydefault();
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            DI di = mapCopydefault.get(lowerCase);
            return di == null ? new DI(str, -1) : di;
        }
    }

    public DI(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
        this.AhwBna = i;
    }

    static {
        DI di = new DI("https", 443);
        copydefault = di;
        DI di2 = new DI("http", 80);
        AEQbTJ = di2;
        DI di3 = new DI("ws", 80);
        OLrzqt = di3;
        DI di4 = new DI(ProtocolConstants.WSS, 443);
        KWHzl = di4;
        java.util.List listGEmmrt = yDY.gEmmrt(di2, di, di3, di4);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listGEmmrt, 10)), 16));
        for (java.lang.Object obj : listGEmmrt) {
            linkedHashMap.put(((DI) obj).gEmmrt, obj);
        }
        valueOf = linkedHashMap;
    }
}
