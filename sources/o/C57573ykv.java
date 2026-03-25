package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.websocket.bean.OKWSConnDataParseResult;
import com.okinc.websocket.connection.OKWSBaseConnection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57573ykv extends C57567ykp {
    public static final Activity Companion = new Activity(null);
    public static final int getNewProxyInstance = 8;
    public final CopyOnWriteArrayList<AbstractC57572yku> getFieldNames;
    public final C57571ykt uzCIH;

    @Override // o.C57567ykp
    public boolean fJNWhG() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57573ykv(@NotNull C57571ykt c57571ykt) {
        super(c57571ykt);
        Intrinsics.checkNotNullParameter(c57571ykt, "");
        this.uzCIH = c57571ykt;
        this.getFieldNames = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: renamed from: o.ykv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ykv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void AYXKKw(java.lang.String str) {
        if (fIwbmz().get()) {
            KWHzl(str);
            return;
        }
        pUU.valueOf("OKWsSimplifiedConnection", "sendMessageOuter failed, cause connection is not ready, message: " + str);
    }

    @Override // o.C57567ykp, com.okinc.websocket.connection.OKWSBaseConnection
    public void KWHzl(@NotNull OKWsConnectionState oKWsConnectionState) {
        Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
        C57570yks.KWHzl.KWHzl("OKWsSimplifiedConnection", "onConnectStateChanged state: " + oKWsConnectionState + ", this: " + this);
        if (oKWsConnectionState == OKWsConnectionState.OPEN) {
            copydefault(true);
        }
        AEQbTJ(oKWsConnectionState);
    }

    @Override // o.C57567ykp, com.okinc.websocket.connection.OKWSBaseConnection
    public void copydefault(@NotNull OKWSBaseConnection oKWSBaseConnection, @NotNull OKWSConnDataParseResult oKWSConnDataParseResult) {
        Intrinsics.checkNotNullParameter(oKWSBaseConnection, "");
        Intrinsics.checkNotNullParameter(oKWSConnDataParseResult, "");
        OLrzqt(oKWSConnDataParseResult.getIncomingData());
    }

    @Override // o.C57567ykp, com.okinc.websocket.connection.OKWSBaseConnection
    public void copydefault(boolean z) {
        fIwbmz().set(z);
    }

    @Override // o.C57567ykp
    public void EZpvd(@NotNull AbstractC33132mqg abstractC33132mqg) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        if (abstractC33132mqg instanceof AbstractC57572yku) {
            this.getFieldNames.add(abstractC33132mqg);
            if (this.getFieldNames.size() == 1 || !djBIcL()) {
                fetchVPNInfo();
            }
        }
    }

    @Override // o.C57567ykp
    public void AEQbTJ(@NotNull AbstractC33132mqg abstractC33132mqg) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        if (abstractC33132mqg instanceof AbstractC57572yku) {
            this.getFieldNames.remove(abstractC33132mqg);
            if (this.getFieldNames.size() == 0) {
                pUU.KWHzl("OKWsSimplifiedConnection", "remove listener size is 0, so will destroy conn. " + C57569ykr.EZpvd(this));
                EZpvd();
            }
        }
    }

    @Override // o.C57567ykp, com.okinc.websocket.connection.OKWSBaseConnection
    public Request EZpvd(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        Request.Builder builderNewBuilder = request.newBuilder();
        java.util.Map<java.lang.String, java.lang.String> mapValueOf = this.uzCIH.valueOf();
        if (mapValueOf != null && !mapValueOf.isEmpty()) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : mapValueOf.entrySet()) {
                builderNewBuilder.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return builderNewBuilder.build();
    }

    public final void AEQbTJ(OKWsConnectionState oKWsConnectionState) {
        java.util.Iterator<T> it = this.getFieldNames.iterator();
        while (it.hasNext()) {
            ((AbstractC57572yku) it.next()).AEQbTJ(oKWsConnectionState);
        }
    }

    public final void OLrzqt(OKIncomingData oKIncomingData) {
        if (oKIncomingData == null) {
            return;
        }
        java.util.Iterator<T> it = this.getFieldNames.iterator();
        while (it.hasNext()) {
            ((AbstractC57572yku) it.next()).EZpvd(oKIncomingData);
        }
    }
}
