package o;

import com.sun.jna.internal.Cleaner;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zxp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60179zxp implements InterfaceC60177zxn {
    public final Cleaner EZpvd = Cleaner.getCleaner();

    @Override // o.InterfaceC60177zxn
    public InterfaceC60177zxn.TaskDescription OLrzqt(@NotNull java.lang.Object obj, @NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Cleaner.Cleanable cleanableRegister = this.EZpvd.register(obj, runnable);
        Intrinsics.checkNotNullExpressionValue(cleanableRegister, "");
        return new C60176zxm(cleanableRegister);
    }
}
