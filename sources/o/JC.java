package o;

import com.amplitude.common.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JC {
    public final MJ AEQbTJ;
    public final MJ EZpvd;
    public final Logger copydefault;

    public JC(@NotNull MJ mj, @NotNull MJ mj2, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(mj, "");
        Intrinsics.checkNotNullParameter(mj2, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.AEQbTJ = mj;
        this.EZpvd = mj2;
        this.copydefault = logger;
    }

    public final void KWHzl() {
        try {
            MF mfCopydefault = this.AEQbTJ.copydefault();
            this.copydefault.OLrzqt("Loaded old identity: " + mfCopydefault);
            if (mfCopydefault.EZpvd() != null) {
                this.EZpvd.EZpvd(mfCopydefault.EZpvd());
            }
            if (mfCopydefault.OLrzqt() != null) {
                this.EZpvd.copydefault(mfCopydefault.OLrzqt());
            }
        } catch (java.lang.Exception e) {
            this.copydefault.EZpvd("Unable to migrate file identity storage: " + e.getMessage());
        }
    }
}
