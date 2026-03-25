package o;

import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.websocket.bean.OKWSConnDataParseResult;
import com.okinc.websocket.bean.OKWSEvent;
import com.okinc.websocket.bean.WSLoginEventBean;
import com.okinc.websocket.connection.OKWSBaseConnection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57567ykp extends OKWSBaseConnection {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int DbNXlk = 8;
    public StateListAnimator AuCTel;
    public AtomicBoolean ejfBZ;
    public volatile boolean fARcdN;
    public AtomicBoolean fIwbmz;
    public final ConcurrentHashMap<java.lang.String, AbstractC57561ykj> fJNWhG;
    public OKWsConnectionState hDKMBd;

    /* JADX INFO: renamed from: o.ykp$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWSEvent.values().length];
            try {
                iArr[OKWSEvent.DATA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKWSEvent.LOGIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKWSEvent.CHECK_SUM_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKWsConnectionState AuCTel() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.websocket.connection.OKWSBaseConnection
    public Request EZpvd(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        return request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, AbstractC57561ykj> fARcdN() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AtomicBoolean fIwbmz() {
        return this.ejfBZ;
    }

    public boolean fJNWhG() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57567ykp(@NotNull InterfaceC57564ykm interfaceC57564ykm) {
        super(interfaceC57564ykm);
        Intrinsics.checkNotNullParameter(interfaceC57564ykm, "");
        this.fJNWhG = new ConcurrentHashMap<>();
        this.ejfBZ = new AtomicBoolean(false);
        this.hDKMBd = OKWsConnectionState.CLOSED;
        this.fIwbmz = new AtomicBoolean(false);
        this.AuCTel = new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.ykp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ykp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.ykp$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC54816xWj {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            C57570yks.KWHzl.OLrzqt("OKWSConnection", "1 ---> onAppEnterForeground,this: " + this);
            C57567ykp.this.AEQbTJ(true);
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            C57570yks.KWHzl.OLrzqt("OKWSConnection", "2 ---> onAppEnterBackground,this: " + this);
            C57567ykp.this.AEQbTJ(false);
        }
    }

    @Override // com.okinc.websocket.connection.OKWSBaseConnection
    public void fetchVPNInfo() {
        super.fetchVPNInfo();
        this.fARcdN = false;
        if (OLrzqt().gEmmrt() && this.fIwbmz.compareAndSet(false, true)) {
            C54819xWm.KWHzl().AEQbTJ(this.AuCTel);
        }
    }

    @Override // com.okinc.websocket.connection.OKWSBaseConnection
    public void KWHzl(@NotNull OKWsConnectionState oKWsConnectionState) {
        Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
        C57570yks c57570yks = C57570yks.KWHzl;
        c57570yks.KWHzl("OKWSConnection", "onConnectStateChanged state: " + oKWsConnectionState + ", this: " + this + ", channelSet: " + this.fJNWhG.keySet());
        this.hDKMBd = oKWsConnectionState;
        if (oKWsConnectionState == OKWsConnectionState.OPEN) {
            if (AkhnZx() && !this.ejfBZ.get()) {
                java.lang.String strEjfBZ = ejfBZ();
                c57570yks.KWHzl("OKWSConnection", "on Connection connected: " + this + ", will send login message: " + strEjfBZ);
                KWHzl(strEjfBZ);
            } else {
                copydefault(true);
            }
        }
        OLrzqt(oKWsConnectionState);
    }

    @Override // com.okinc.websocket.connection.OKWSBaseConnection
    public void copydefault(@NotNull OKWSBaseConnection oKWSBaseConnection, @NotNull OKWSConnDataParseResult oKWSConnDataParseResult) {
        Intrinsics.checkNotNullParameter(oKWSBaseConnection, "");
        Intrinsics.checkNotNullParameter(oKWSConnDataParseResult, "");
        if (oKWSConnDataParseResult.getError() != null) {
            C57570yks.KWHzl.AEQbTJ("OKWSConnection", "onReceiveMessage with error: " + oKWSConnDataParseResult.getError());
            return;
        }
        int i = ActionBar.KWHzl[oKWSConnDataParseResult.getEvent().ordinal()];
        if (i == 1) {
            OLrzqt().AEQbTJ(oKWSConnDataParseResult.getIncomingData(), this.fJNWhG);
            return;
        }
        if (i == 2) {
            pUU.EZpvd("OKWSConnection", "===receive login event, this: " + this);
            copydefault(true);
            return;
        }
        if (i == 3) {
            C57570yks.KWHzl.AEQbTJ("OKWSConnection", "onReceiveMessage connection: " + oKWSBaseConnection + ", checkSumError: " + oKWSConnDataParseResult.getError() + ", will reconnect connection");
            copydefault();
            return;
        }
        C57570yks.KWHzl.KWHzl("OKWSConnection", "onReceiveMessage connection: " + oKWSBaseConnection + ", message: " + oKWSConnDataParseResult.getEvent());
    }

    public void EZpvd(@NotNull AbstractC33132mqg abstractC33132mqg) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        if (abstractC33132mqg instanceof AbstractC57556yke) {
            AbstractC57556yke abstractC57556yke = (AbstractC57556yke) abstractC33132mqg;
            java.lang.String strValueOf = abstractC57556yke.valueOf();
            AbstractC57561ykj abstractC57561ykjKWHzl = this.fJNWhG.get(strValueOf);
            if (abstractC57561ykjKWHzl == null) {
                abstractC57561ykjKWHzl = OLrzqt().KWHzl(strValueOf);
                if (abstractC57561ykjKWHzl != null) {
                    abstractC57561ykjKWHzl.AEQbTJ(new Function1() { // from class: o.yko
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C57567ykp.KWHzl(this.EZpvd, (AbstractC57561ykj) obj);
                        }
                    });
                    this.fJNWhG.put(strValueOf, abstractC57561ykjKWHzl);
                }
                if (this.ejfBZ.get() && abstractC57561ykjKWHzl != null) {
                    abstractC57561ykjKWHzl.copydefault(this);
                }
            }
            if (abstractC57561ykjKWHzl != null) {
                abstractC57561ykjKWHzl.EZpvd(abstractC57556yke);
            }
            if (this.fJNWhG.size() == 1 || !djBIcL()) {
                fetchVPNInfo();
            }
        }
    }

    public static final Unit KWHzl(C57567ykp c57567ykp, AbstractC57561ykj abstractC57561ykj) {
        Intrinsics.checkNotNullParameter(abstractC57561ykj, "");
        c57567ykp.EZpvd(abstractC57561ykj);
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull AbstractC33132mqg abstractC33132mqg) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        if (abstractC33132mqg instanceof AbstractC57556yke) {
            AbstractC57556yke abstractC57556yke = (AbstractC57556yke) abstractC33132mqg;
            AbstractC57561ykj abstractC57561ykj = this.fJNWhG.get(abstractC57556yke.valueOf());
            if (abstractC57561ykj != null) {
                abstractC57561ykj.copydefault(abstractC57556yke);
            }
        }
    }

    public final void EZpvd(AbstractC57561ykj abstractC57561ykj) {
        abstractC57561ykj.AEQbTJ(null);
        this.fJNWhG.remove(abstractC57561ykj.EZpvd());
        if (this.fJNWhG.size() == 0) {
            pUU.KWHzl("OKWSConnection", "remove channel and set size is 0, will destroy conn.");
            EZpvd();
        }
    }

    public final void KWHzl(@NotNull AbstractC57556yke abstractC57556yke, @NotNull java.util.List<? extends InterfaceC57559ykh> list, @NotNull java.util.List<? extends InterfaceC57559ykh> list2) {
        Intrinsics.checkNotNullParameter(abstractC57556yke, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        AbstractC57561ykj abstractC57561ykj = this.fJNWhG.get(abstractC57556yke.valueOf());
        if (abstractC57561ykj != null) {
            abstractC57561ykj.OLrzqt(list2, list);
        }
    }

    @Override // com.okinc.websocket.connection.OKWSBaseConnection
    public void copydefault(boolean z) {
        pUU.EZpvd("OKWSConnection", "notifyConnState isReady: " + z + ", this: " + this + ", channelSet: " + this.fJNWhG.keySet());
        this.ejfBZ.set(z);
        ConcurrentHashMap<java.lang.String, AbstractC57561ykj> concurrentHashMap = this.fJNWhG;
        java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.size());
        for (Map.Entry<java.lang.String, AbstractC57561ykj> entry : concurrentHashMap.entrySet()) {
            if (z) {
                entry.getValue().copydefault(this);
            } else {
                entry.getValue().KWHzl();
            }
            arrayList.add(Unit.INSTANCE);
        }
    }

    public final java.lang.String ejfBZ() {
        java.lang.String strCopydefault = OLrzqt().copydefault();
        java.util.List<java.lang.Object> listAEQbTJ = OLrzqt().AEQbTJ();
        C57570yks.KWHzl.KWHzl("OKWSConnection", "getLoginSubMsg loginOpStr: " + strCopydefault);
        if (strCopydefault != null && listAEQbTJ != null && (!listAEQbTJ.isEmpty())) {
            try {
                return C33490mxT.OLrzqt(new WSLoginEventBean(strCopydefault, listAEQbTJ));
            } catch (java.lang.Exception e) {
                C57570yks.KWHzl.EZpvd("OKWSConnection", "getLoginSubMsg exception: " + e);
            }
        }
        return null;
    }

    public final boolean AkhnZx() {
        return OLrzqt().AhwBna();
    }

    public final void KWHzl(java.lang.String str) {
        if (str != null) {
            OLrzqt(str);
        }
    }

    public final void AEQbTJ(boolean z) {
        if (z && values() && this.fARcdN) {
            pUU.KWHzl("OKWSConnection", "app enter foreground, and try to restart conn " + C57569ykr.EZpvd(this));
            fetchVPNInfo();
            return;
        }
        if (z) {
            return;
        }
        pUU.KWHzl("OKWSConnection", "app enter background, will try to destroy conn " + C57569ykr.EZpvd(this));
        if (djBIcL()) {
            pUU.KWHzl("OKWSConnection", "set disconnectWithBackground -> true");
            this.fARcdN = true;
        }
        EZpvd();
    }

    @Override // com.okinc.websocket.connection.OKWSBaseConnection
    public void EZpvd() {
        super.EZpvd();
        if (this.fARcdN || !this.fIwbmz.compareAndSet(true, false)) {
            return;
        }
        C54819xWm.KWHzl().KWHzl(this.AuCTel);
    }

    public final boolean values() {
        java.lang.String strCopydefault;
        java.util.List<java.lang.Object> listAEQbTJ;
        if (AkhnZx() && ((strCopydefault = OLrzqt().copydefault()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault) || (listAEQbTJ = OLrzqt().AEQbTJ()) == null || listAEQbTJ.isEmpty())) {
            return false;
        }
        return (fJNWhG() && this.fJNWhG.size() == 0) ? false : true;
    }

    private final void OLrzqt(OKWsConnectionState oKWsConnectionState) {
        java.util.Collection<AbstractC57561ykj> collectionValues = this.fJNWhG.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((AbstractC57561ykj) it.next()).OLrzqt(oKWsConnectionState);
        }
    }

    public final void uzCIH() {
        pUU.KWHzl("OKWSConnection", "reLogin will destroy conn and restart it.");
        EZpvd();
        fetchVPNInfo();
    }
}
