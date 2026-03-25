package o;

import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40231qOe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40243qOq implements InterfaceC40231qOe {
    public final java.util.List<OptionsCategoryGroupVo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qOq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C40243qOq copy$default(C40243qOq c40243qOq, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c40243qOq.copydefault;
        }
        return c40243qOq.KWHzl(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40243qOq KWHzl(@NotNull java.util.List<OptionsCategoryGroupVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C40243qOq(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<OptionsCategoryGroupVo> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40243qOq) && Intrinsics.EZpvd(this.copydefault, ((C40243qOq) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavSearchSimpleOptionsVo(list=" + this.copydefault + ")";
    }

    public C40243qOq(@NotNull java.util.List<OptionsCategoryGroupVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC40231qOe.StateListAnimator.copydefault(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC40231qOe.StateListAnimator.OLrzqt(this, interfaceC40516qYt);
    }
}
