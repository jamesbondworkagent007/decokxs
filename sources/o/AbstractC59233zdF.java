package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59233zdF implements yOB, InterfaceC59382zfw {
    public int AYXKKw;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zdF.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC59233zdF(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract AbstractC59233zdF AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG);

    public abstract boolean AEQbTJ();

    public abstract AbstractC59331zey AkhnZx();

    public abstract InterfaceC59098zad OLrzqt();

    public abstract C59308zeb bX_();

    public abstract java.util.List<InterfaceC59317zek> bY_();

    public abstract InterfaceC59315zei djBIcL();

    private AbstractC59233zdF() {
    }

    @Override // o.yOB
    public yOL copydefault() {
        return C59259zdf.KWHzl(bX_());
    }

    public final int isConnected() {
        if (C59238zdK.AEQbTJ(this)) {
            return super.hashCode();
        }
        return (((djBIcL().hashCode() * 31) + bY_().hashCode()) * 31) + (AEQbTJ() ? 1 : 0);
    }

    public final int hashCode() {
        int i = this.AYXKKw;
        if (i != 0) {
            return i;
        }
        int iIsConnected = isConnected();
        this.AYXKKw = iIsConnected;
        return iIsConnected;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC59233zdF)) {
            return false;
        }
        AbstractC59233zdF abstractC59233zdF = (AbstractC59233zdF) obj;
        return AEQbTJ() == abstractC59233zdF.AEQbTJ() && C59301zeU.copydefault.KWHzl(AkhnZx(), abstractC59233zdF.AkhnZx());
    }
}
