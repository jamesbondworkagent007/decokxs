package o;

import java.lang.ref.Cleaner;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zwY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60135zwY implements InterfaceC60177zxn.TaskDescription {
    public final Cleaner.Cleanable OLrzqt;

    public C60135zwY(@NotNull Cleaner.Cleanable cleanable) {
        Intrinsics.checkNotNullParameter(cleanable, "");
        this.OLrzqt = cleanable;
    }

    @Override // o.InterfaceC60177zxn.TaskDescription
    public void AEQbTJ() {
        this.OLrzqt.clean();
    }
}
