package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59439zh;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C58374zA extends zP.TaskDescription implements InterfaceC58563zH {
    public final java.lang.Long KWHzl;
    public final AbstractC59439zh.Application OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zP
    public java.lang.Long AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/zh; */
    @Override // o.InterfaceC58563zH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AbstractC59439zh.Application EZpvd() {
        return this.OLrzqt;
    }

    public C58374zA(@NotNull AbstractC59439zh.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.OLrzqt = application;
        this.KWHzl = EZpvd().OLrzqt();
    }

    @Override // o.zP.TaskDescription
    public byte[] OLrzqt() {
        return EZpvd().EZpvd();
    }
}
