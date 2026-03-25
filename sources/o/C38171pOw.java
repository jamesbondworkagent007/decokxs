package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pOw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38171pOw extends AbstractC38168pOt {
    public final InterfaceC38120pMz EZpvd;
    public final java.lang.String KWHzl;
    public final pMH OLrzqt;
    public final pMI copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC38168pOt
    public java.lang.String EZpvd() {
        return this.KWHzl;
    }

    public C38171pOw(@NotNull pMI pmi, @NotNull pMH pmh, @NotNull InterfaceC38120pMz interfaceC38120pMz) {
        Intrinsics.checkNotNullParameter(pmi, "");
        Intrinsics.checkNotNullParameter(pmh, "");
        Intrinsics.checkNotNullParameter(interfaceC38120pMz, "");
        this.copydefault = pmi;
        this.OLrzqt = pmh;
        this.EZpvd = interfaceC38120pMz;
        this.KWHzl = "LifecycleLinkService";
    }

    @Override // o.pKD
    public boolean AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.EZpvd(context, str);
    }

    @Override // o.pKD
    public void OLrzqt() {
        this.EZpvd.copydefault();
    }
}
