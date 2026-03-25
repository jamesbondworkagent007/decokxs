package o;

import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5058Dc extends java.io.Closeable {
    public static final StateListAnimator OLrzqt = StateListAnimator.KWHzl;

    void AEQbTJ(@NotNull CQ cq, long j) throws java.io.IOException;

    void EZpvd() throws java.io.IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close() throws java.io.IOException;

    /* JADX INFO: renamed from: o.Dc$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }

        public final InterfaceC5058Dc OLrzqt() {
            return C5066Dk.copydefault(Okio.blackhole());
        }
    }
}
