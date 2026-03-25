package o;

import com.sun.jna.internal.Cleaner;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zxm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60176zxm implements InterfaceC60177zxn.TaskDescription {
    public final Cleaner.Cleanable EZpvd;

    public C60176zxm(@NotNull Cleaner.Cleanable cleanable) {
        Intrinsics.checkNotNullParameter(cleanable, "");
        this.EZpvd = cleanable;
    }

    @Override // o.InterfaceC60177zxn.TaskDescription
    public void AEQbTJ() {
        this.EZpvd.clean();
    }
}
