package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C60054zud implements InterfaceC59997ztZ {
    public final InterfaceC56551yJo<?> KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59997ztZ
    public java.lang.String EZpvd() {
        return this.copydefault;
    }

    public C60054zud(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        this.KWHzl = interfaceC56551yJo;
        this.copydefault = C60067zuq.KWHzl(interfaceC56551yJo);
    }

    public java.lang.String toString() {
        return EZpvd();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C60054zud.class == obj.getClass() && Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) ((C60054zud) obj).EZpvd());
    }

    public int hashCode() {
        return EZpvd().hashCode();
    }
}
