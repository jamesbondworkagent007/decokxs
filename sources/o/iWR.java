package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iWR implements InterfaceC55105xdf {
    public java.util.List<java.lang.Object> EZpvd;
    public boolean OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public java.util.List<java.lang.Object> getSectionDataList() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public boolean getShowSuspension() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public java.lang.String getSuspensionTag() {
        return this.copydefault;
    }

    public iWR(boolean z, java.lang.String str, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = z;
        this.copydefault = str;
        this.EZpvd = list;
    }
}
