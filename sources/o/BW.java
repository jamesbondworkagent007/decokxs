package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BW {
    public final InterfaceC56551yJo<?> AEQbTJ;
    public final InterfaceC56551yJo<?> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.BW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BW copy$default(BW bw, InterfaceC56551yJo interfaceC56551yJo, InterfaceC56551yJo interfaceC56551yJo2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC56551yJo = bw.AEQbTJ;
        }
        if ((i & 2) != 0) {
            interfaceC56551yJo2 = bw.OLrzqt;
        }
        return bw.KWHzl(interfaceC56551yJo, interfaceC56551yJo2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56551yJo<?> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BW KWHzl(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo, @NotNull InterfaceC56551yJo<?> interfaceC56551yJo2) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo2, "");
        return new BW(interfaceC56551yJo, interfaceC56551yJo2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56551yJo<?> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BW)) {
            return false;
        }
        BW bw = (BW) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, bw.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, bw.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OperationTypeInfo(inputType=" + this.AEQbTJ + ", outputType=" + this.OLrzqt + ')';
    }

    public BW(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo, @NotNull InterfaceC56551yJo<?> interfaceC56551yJo2) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo2, "");
        this.AEQbTJ = interfaceC56551yJo;
        this.OLrzqt = interfaceC56551yJo2;
    }
}
