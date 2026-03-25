package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qBk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C39886qBk extends C40234qOh {
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C40234qOh, o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C39886qBk(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41603qtt c41603qtt, @NotNull C41546qsp c41546qsp, @NotNull C41508qsD c41508qsD, @NotNull C41499qrv c41499qrv, @NotNull C39888qBm c39888qBm) {
        super(coroutineDispatcher, c41603qtt, c41546qsp, c41508qsD, c41499qrv, c39888qBm);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41603qtt, "");
        Intrinsics.checkNotNullParameter(c41546qsp, "");
        Intrinsics.checkNotNullParameter(c41508qsD, "");
        Intrinsics.checkNotNullParameter(c41499qrv, "");
        Intrinsics.checkNotNullParameter(c39888qBm, "");
        this.OLrzqt = coroutineDispatcher;
    }
}
