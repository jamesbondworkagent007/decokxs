package o;

import com.okinc.core.livelistener.OKWsConnectionState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57572yku extends AbstractC33132mqg {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public C57573ykv AYXKKw;

    /* JADX INFO: renamed from: o.yku$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yku.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void OLrzqt(@NotNull C57573ykv c57573ykv) {
        Intrinsics.checkNotNullParameter(c57573ykv, "");
        if (this.AYXKKw != null) {
            C57570yks.KWHzl.EZpvd("OKWSSimplifiedListener", "Warning: listener can only attached with one connection!!!");
        } else {
            this.AYXKKw = c57573ykv;
        }
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C57573ykv c57573ykv = this.AYXKKw;
        if (c57573ykv == null) {
            C57570yks.KWHzl.EZpvd("OKWSSimplifiedListener", "Warning: listener sendMessage need create a connection before!!!");
        } else if (c57573ykv != null) {
            c57573ykv.AYXKKw(str);
        }
    }

    @Override // o.AbstractC33132mqg
    public void AhwBna() {
        if (KWHzl()) {
            C57570yks.KWHzl.EZpvd("OKWSSimplifiedListener", "listener has already started!");
            return;
        }
        if (this.AYXKKw == null) {
            C57570yks.KWHzl.EZpvd("OKWSSimplifiedListener", "listener must be attached a connection before started!");
            return;
        }
        super.AhwBna();
        C57573ykv c57573ykv = this.AYXKKw;
        if (c57573ykv != null) {
            c57573ykv.EZpvd(this);
        }
    }

    @Override // o.AbstractC33132mqg
    public void djBIcL() {
        if (!KWHzl()) {
            C57570yks.KWHzl.OLrzqt("OKWSSimplifiedListener", "listener not started, no need to stop!");
            return;
        }
        super.djBIcL();
        C57573ykv c57573ykv = this.AYXKKw;
        if (c57573ykv != null) {
            c57573ykv.AEQbTJ(this);
        }
    }

    @Override // o.AbstractC33132mqg
    public OKWsConnectionState EZpvd() {
        OKWsConnectionState oKWsConnectionStateAuCTel;
        C57573ykv c57573ykv = this.AYXKKw;
        return (c57573ykv == null || (oKWsConnectionStateAuCTel = c57573ykv.AuCTel()) == null) ? OKWsConnectionState.CLOSED : oKWsConnectionStateAuCTel;
    }

    @Override // o.AbstractC33132mqg
    public long copydefault() {
        C57573ykv c57573ykv = this.AYXKKw;
        if (c57573ykv != null) {
            return c57573ykv.KWHzl();
        }
        return 0L;
    }
}
