package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.livelistener.OKWsConnectionState;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57561ykj {
    public Function1<? super AbstractC57561ykj, Unit> AEQbTJ;
    public boolean EZpvd;
    public C57567ykp KWHzl;
    public final CopyOnWriteArrayList<AbstractC57556yke> OLrzqt = new CopyOnWriteArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.ykj, kotlin.Unit>, kotlin.jvm.functions.Function1<o.ykj, kotlin.Unit> */
    public final Function1<AbstractC57561ykj, Unit> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function1<? super AbstractC57561ykj, Unit> function1) {
        this.AEQbTJ = function1;
    }

    public abstract java.lang.String EZpvd();

    public abstract void EZpvd(@NotNull AbstractC57556yke abstractC57556yke);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl() {
        this.KWHzl = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57567ykp OLrzqt() {
        return this.KWHzl;
    }

    public abstract void OLrzqt(@NotNull java.util.List<? extends InterfaceC57559ykh> list, @NotNull java.util.List<? extends InterfaceC57559ykh> list2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyOnWriteArrayList<AbstractC57556yke> copydefault() {
        return this.OLrzqt;
    }

    public abstract void copydefault(@NotNull OKIncomingData oKIncomingData);

    public abstract void copydefault(@NotNull AbstractC57556yke abstractC57556yke);

    public abstract java.lang.String valueOf();

    public final void copydefault(@NotNull C57567ykp c57567ykp) {
        Intrinsics.checkNotNullParameter(c57567ykp, "");
        this.KWHzl = c57567ykp;
        this.EZpvd = false;
        if (c57567ykp != null) {
            c57567ykp.KWHzl(valueOf());
        }
    }

    public final void EZpvd(@NotNull OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        boolean z = this.EZpvd;
        this.EZpvd = true;
        oKIncomingData.setInitialData(!z);
        copydefault(oKIncomingData);
    }

    public final void OLrzqt(@NotNull OKWsConnectionState oKWsConnectionState) {
        Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
        java.util.Iterator<AbstractC57556yke> it = this.OLrzqt.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            it.next().AEQbTJ(oKWsConnectionState);
        }
    }
}
