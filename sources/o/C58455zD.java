package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59439zh;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C58455zD extends zP.Activity implements InterfaceC58563zH {
    public final boolean AEQbTJ;
    public final AbstractC59439zh.Activity KWHzl;
    public final java.lang.Long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zP
    public java.lang.Long AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/zh; */
    @Override // o.InterfaceC58563zH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AbstractC59439zh.Activity EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zP
    public boolean b_() {
        return this.AEQbTJ;
    }

    public C58455zD(@NotNull AbstractC59439zh.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.KWHzl = activity;
        this.copydefault = EZpvd().OLrzqt();
        this.AEQbTJ = EZpvd().copydefault();
    }

    @Override // o.zP.Activity
    public CS copydefault() {
        return EZpvd().EZpvd();
    }
}
