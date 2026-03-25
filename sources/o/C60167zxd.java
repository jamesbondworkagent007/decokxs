package o;

import android.system.SystemCleaner;
import java.lang.ref.Cleaner;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zxd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60167zxd implements InterfaceC60177zxn {
    public final Cleaner copydefault;

    public C60167zxd() {
        Cleaner cleaner = SystemCleaner.cleaner();
        Intrinsics.checkNotNullExpressionValue(cleaner, "");
        this.copydefault = cleaner;
    }

    @Override // o.InterfaceC60177zxn
    public InterfaceC60177zxn.TaskDescription OLrzqt(@NotNull java.lang.Object obj, @NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Cleaner.Cleanable cleanableRegister = this.copydefault.register(obj, runnable);
        Intrinsics.checkNotNullExpressionValue(cleanableRegister, "");
        return new C60135zwY(cleanableRegister);
    }
}
