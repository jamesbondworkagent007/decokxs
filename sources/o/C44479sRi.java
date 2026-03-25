package o;

import com.okinc.okimcore.model.im.OKConversation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sRi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44479sRi implements InterfaceC44476sRf {
    public final InterfaceC44367sNe EZpvd;
    public java.lang.String KWHzl;
    public final sFU OLrzqt;
    public final InterfaceC44365sNc copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44476sRf
    public void AEQbTJ() {
        this.KWHzl = null;
    }

    @yCM
    public C44479sRi(@NotNull sFU sfu, @NotNull InterfaceC44365sNc interfaceC44365sNc, @NotNull InterfaceC44367sNe interfaceC44367sNe) {
        Intrinsics.checkNotNullParameter(sfu, "");
        Intrinsics.checkNotNullParameter(interfaceC44365sNc, "");
        Intrinsics.checkNotNullParameter(interfaceC44367sNe, "");
        this.OLrzqt = sfu;
        this.copydefault = interfaceC44365sNc;
        this.EZpvd = interfaceC44367sNe;
    }

    @Override // o.InterfaceC44476sRf
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.EZpvd.EZpvd(str);
    }

    @Override // o.InterfaceC44476sRf
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.copydefault.copydefault()) {
            return true;
        }
        OKConversation oKConversationCopydefault = this.OLrzqt.copydefault(str);
        return oKConversationCopydefault != null && oKConversationCopydefault.isNoDisturb();
    }

    @Override // o.InterfaceC44476sRf
    public boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!this.copydefault.EZpvd() || C44157sFk.KWHzl(str) || AEQbTJ(str)) {
            return false;
        }
        if (C32986mnt.EZpvd.valueOf()) {
            java.lang.String str2 = this.KWHzl;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (str2 != null ? str2 : ""))) {
                return false;
            }
        }
        return true;
    }
}
