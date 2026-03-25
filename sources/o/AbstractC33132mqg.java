package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.livelistener.OKWsConnectionState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mqg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33132mqg {
    public C33135mqj EZpvd;
    public boolean KWHzl;

    public java.lang.String AEQbTJ() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull OKWsConnectionState oKWsConnectionState) {
        Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
    }

    public abstract OKWsConnectionState EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33135mqj OLrzqt() {
        return this.EZpvd;
    }

    public abstract void OLrzqt(@NotNull AbstractC33132mqg abstractC33132mqg, @NotNull OKIncomingData oKIncomingData);

    public long copydefault() {
        return 0L;
    }

    public void EZpvd(@NotNull OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        C33135mqj c33135mqj = this.EZpvd;
        if (c33135mqj == null) {
            OLrzqt(this, oKIncomingData);
        } else if (c33135mqj != null) {
            c33135mqj.KWHzl(this, oKIncomingData);
        }
    }

    public void AhwBna() {
        this.KWHzl = true;
        C33135mqj c33135mqj = this.EZpvd;
        if (c33135mqj != null) {
            c33135mqj.KWHzl(this);
        }
    }

    public void djBIcL() {
        this.KWHzl = false;
        C33135mqj c33135mqj = this.EZpvd;
        if (c33135mqj != null) {
            c33135mqj.AEQbTJ(this);
        }
    }
}
