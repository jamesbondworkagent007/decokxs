package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59439zh;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C58590zI extends zP.Application implements InterfaceC58563zH {
    public final java.lang.Long AEQbTJ;
    public final AbstractC59439zh.StateListAnimator KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zP
    public java.lang.Long AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/zh; */
    @Override // o.InterfaceC58563zH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AbstractC59439zh.StateListAnimator EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zP
    public boolean b_() {
        return this.OLrzqt;
    }

    public C58590zI(@NotNull AbstractC59439zh.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.KWHzl = stateListAnimator;
        this.AEQbTJ = EZpvd().OLrzqt();
        this.OLrzqt = EZpvd().copydefault();
    }

    @Override // o.zP.Application
    public InterfaceC5060De copydefault() {
        return EZpvd().AEQbTJ();
    }
}
