package o;

import com.immomo.mls.fun.ud.socket.OKWsListenerBridge;
import com.okinc.core.livelistener.OKWsConnectionState;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57556yke extends AbstractC33132mqg {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public java.util.ArrayList<? extends InterfaceC57559ykh> AEQbTJ;
    public final java.lang.String copydefault;
    public C57567ykp gEmmrt;
    public CopyOnWriteArrayList<InterfaceC57559ykh> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<? extends InterfaceC57559ykh> gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.copydefault;
    }

    public AbstractC57556yke(@NotNull java.lang.String str, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.copydefault = str;
        this.AEQbTJ = arrayList;
        this.valueOf = new CopyOnWriteArrayList<>(this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.yke$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yke.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void KWHzl(@NotNull C57567ykp c57567ykp) {
        Intrinsics.checkNotNullParameter(c57567ykp, "");
        if (this.gEmmrt != null) {
            C57570yks.KWHzl.EZpvd(OKWsListenerBridge.LUA_CLASS_NAME, "Warning: listener can only attached with one connection!!!");
        } else {
            this.gEmmrt = c57567ykp;
        }
    }

    public final void AEQbTJ(@NotNull java.util.ArrayList<InterfaceC57559ykh> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C57567ykp c57567ykp = this.gEmmrt;
        if (c57567ykp != null) {
            c57567ykp.KWHzl(this, this.valueOf, arrayList);
        }
        this.valueOf.clear();
        this.valueOf.addAll(arrayList);
    }

    @Override // o.AbstractC33132mqg
    public void AhwBna() {
        if (KWHzl()) {
            C57570yks.KWHzl.EZpvd(OKWsListenerBridge.LUA_CLASS_NAME, "listener has already started!");
            return;
        }
        if (this.gEmmrt == null) {
            C57570yks.KWHzl.EZpvd(OKWsListenerBridge.LUA_CLASS_NAME, "listener must be attached a connection before started!");
            return;
        }
        super.AhwBna();
        C57567ykp c57567ykp = this.gEmmrt;
        if (c57567ykp != null) {
            c57567ykp.EZpvd(this);
        }
    }

    @Override // o.AbstractC33132mqg
    public void djBIcL() {
        if (!KWHzl()) {
            C57570yks.KWHzl.OLrzqt(OKWsListenerBridge.LUA_CLASS_NAME, "listener not started, no need to stop!");
            return;
        }
        super.djBIcL();
        C57567ykp c57567ykp = this.gEmmrt;
        if (c57567ykp != null) {
            c57567ykp.AEQbTJ(this);
        }
    }

    @Override // o.AbstractC33132mqg
    public OKWsConnectionState EZpvd() {
        OKWsConnectionState oKWsConnectionStateAuCTel;
        C57567ykp c57567ykp = this.gEmmrt;
        return (c57567ykp == null || (oKWsConnectionStateAuCTel = c57567ykp.AuCTel()) == null) ? OKWsConnectionState.CLOSED : oKWsConnectionStateAuCTel;
    }

    @Override // o.AbstractC33132mqg
    public java.lang.String AEQbTJ() {
        C57567ykp c57567ykp = this.gEmmrt;
        if (c57567ykp != null) {
            return c57567ykp.AEQbTJ();
        }
        return null;
    }

    @Override // o.AbstractC33132mqg
    public long copydefault() {
        C57567ykp c57567ykp = this.gEmmrt;
        if (c57567ykp != null) {
            return c57567ykp.KWHzl();
        }
        return 0L;
    }
}
