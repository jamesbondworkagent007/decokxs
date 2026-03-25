package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59274zdu {
    public final AbstractC59242zdO AYXKKw;
    public final java.util.Set<InterfaceC56691yOt> djBIcL;
    public final TypeUsage valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<InterfaceC56691yOt> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TypeUsage OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC59242zdO copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Set<? extends o.yOt> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59274zdu(@NotNull TypeUsage typeUsage, java.util.Set<? extends InterfaceC56691yOt> set, AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(typeUsage, "");
        this.valueOf = typeUsage;
        this.djBIcL = set;
        this.AYXKKw = abstractC59242zdO;
    }

    public C59274zdu AEQbTJ(@NotNull InterfaceC56691yOt interfaceC56691yOt) {
        java.util.Set setAEQbTJ;
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        TypeUsage typeUsageOLrzqt = OLrzqt();
        java.util.Set<InterfaceC56691yOt> setEZpvd = EZpvd();
        if (setEZpvd == null || (setAEQbTJ = yEJ.OLrzqt(setEZpvd, interfaceC56691yOt)) == null) {
            setAEQbTJ = yED.AEQbTJ(interfaceC56691yOt);
        }
        return new C59274zdu(typeUsageOLrzqt, setAEQbTJ, copydefault());
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C59274zdu)) {
            return false;
        }
        C59274zdu c59274zdu = (C59274zdu) obj;
        return Intrinsics.EZpvd(c59274zdu.copydefault(), copydefault()) && c59274zdu.OLrzqt() == OLrzqt();
    }

    public int hashCode() {
        AbstractC59242zdO abstractC59242zdOCopydefault = copydefault();
        int iHashCode = abstractC59242zdOCopydefault != null ? abstractC59242zdOCopydefault.hashCode() : 0;
        return iHashCode + (iHashCode * 31) + OLrzqt().hashCode();
    }
}
