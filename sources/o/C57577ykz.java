package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.bean.OKWSEvent;
import com.okinc.websocket.bean.WsCommonEventBean;
import com.okinc.websocket.v5config.OKWSChannelV5$processIncomingData$1;
import com.okinc.websocket.v5config.OKWSChannelV5$processIncomingData$2;
import com.okinc.websocket.v5config.OKWSResponseData;
import com.okinc.websocket.v5config.WsSubscribeArgV5;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57577ykz extends AbstractC57561ykj {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final java.lang.String AYXKKw;
    public final ConcurrentHashMap<java.lang.String, WsSubscribeArgV5> AhwBna;
    public final C57574ykw djBIcL;
    public android.os.Handler gEmmrt;
    public final ConcurrentHashMap<java.lang.String, OKWSResponseData> valueOf;
    public final java.lang.Runnable values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, WsSubscribeArgV5> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57561ykj
    public java.lang.String EZpvd() {
        return this.AYXKKw;
    }

    public C57577ykz(@NotNull java.lang.String str, @NotNull C57574ykw c57574ykw) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c57574ykw, "");
        this.AYXKKw = str;
        this.djBIcL = c57574ykw;
        this.AhwBna = new ConcurrentHashMap<>();
        this.valueOf = new ConcurrentHashMap<>();
        this.values = new java.lang.Runnable() { // from class: o.ykD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57577ykz.KWHzl(this.KWHzl);
            }
        };
    }

    /* JADX INFO: renamed from: o.ykz$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ykz.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final void KWHzl(C57577ykz c57577ykz) {
        c57577ykz.gEmmrt();
    }

    @Override // o.AbstractC57561ykj
    public java.lang.String valueOf() {
        java.util.ArrayList<InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
        for (WsSubscribeArgV5 wsSubscribeArgV5 : this.AhwBna.values()) {
            Intrinsics.checkNotNullExpressionValue(wsSubscribeArgV5, "");
            arrayList.add(wsSubscribeArgV5);
        }
        return copydefault("subscribe", arrayList);
    }

    @Override // o.AbstractC57561ykj
    public void EZpvd(@NotNull AbstractC57556yke abstractC57556yke) {
        Intrinsics.checkNotNullParameter(abstractC57556yke, "");
        C57570yks c57570yks = C57570yks.KWHzl;
        c57570yks.KWHzl("OKWSChannelV5", "channelV5 - add listener: " + abstractC57556yke.valueOf());
        if (!copydefault().contains(abstractC57556yke)) {
            copydefault().add(abstractC57556yke);
            java.util.ArrayList<InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
            for (InterfaceC57559ykh interfaceC57559ykh : abstractC57556yke.gEmmrt()) {
                if (OLrzqt(interfaceC57559ykh)) {
                    arrayList.add(interfaceC57559ykh);
                }
            }
            if (this.djBIcL.copydefault()) {
                AEQbTJ(abstractC57556yke);
            }
            java.lang.String strCopydefault = copydefault("subscribe", arrayList);
            C57567ykp c57567ykpOLrzqt = OLrzqt();
            if (c57567ykpOLrzqt != null) {
                c57567ykpOLrzqt.KWHzl(strCopydefault);
                return;
            }
            return;
        }
        c57570yks.AEQbTJ("OKWSChannelV5", "add listener: " + abstractC57556yke + " existed!");
    }

    @Override // o.AbstractC57561ykj
    public void copydefault(@NotNull AbstractC57556yke abstractC57556yke) {
        Intrinsics.checkNotNullParameter(abstractC57556yke, "");
        copydefault().remove(abstractC57556yke);
        java.util.Iterator<? extends InterfaceC57559ykh> it = abstractC57556yke.gEmmrt().iterator();
        while (it.hasNext()) {
            copydefault(it.next());
        }
        AhwBna();
    }

    @Override // o.AbstractC57561ykj
    public void copydefault(@NotNull OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        InterfaceC57559ykh interfaceC57559ykhEZpvd = this.djBIcL.EZpvd(oKIncomingData.getSource());
        java.lang.String uniqueKey = interfaceC57559ykhEZpvd.getUniqueKey();
        OKWSResponseData oKWSResponseData = this.valueOf.get(uniqueKey);
        if (this.djBIcL.copydefault() && oKWSResponseData == null) {
            oKWSResponseData = new OKWSResponseData(oKIncomingData.getSource(), interfaceC57559ykhEZpvd);
            oKWSResponseData.setChannelDataBuffer(this.djBIcL.AEQbTJ());
            this.valueOf.put(uniqueKey, oKWSResponseData);
        }
        InterfaceC57562ykk channelDataBuffer = oKWSResponseData != null ? oKWSResponseData.getChannelDataBuffer() : null;
        if (channelDataBuffer != null) {
            pUU.EZpvd("OKWSChannelV5", "dataBuffer not null will receiveIncrementalData");
            channelDataBuffer.EZpvd(oKIncomingData, new OKWSChannelV5$processIncomingData$1(this), new OKWSChannelV5$processIncomingData$2(this));
        } else {
            pUU.EZpvd("OKWSChannelV5", "dataBuffer is null will dispatch incomingData directly");
            OLrzqt(oKIncomingData);
        }
    }

    @Override // o.AbstractC57561ykj
    public void OLrzqt(@NotNull java.util.List<? extends InterfaceC57559ykh> list, @NotNull java.util.List<? extends InterfaceC57559ykh> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        C57570yks.KWHzl.KWHzl("OKWSChannelV5", "--updateListenerArg, newArgs: " + list + ", oldArgs: " + list2);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC57559ykh) it.next()).getUniqueKey());
        }
        java.util.HashSet hashSetQKudOq = CollectionsKt___CollectionsKt.QKudOq(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        java.util.Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC57559ykh) it2.next()).getUniqueKey());
        }
        java.util.HashSet hashSetQKudOq2 = CollectionsKt___CollectionsKt.QKudOq(arrayList2);
        java.util.ArrayList<InterfaceC57559ykh> arrayList3 = new java.util.ArrayList<>();
        for (InterfaceC57559ykh interfaceC57559ykh : list) {
            if (!hashSetQKudOq2.contains(interfaceC57559ykh.getUniqueKey()) && OLrzqt(interfaceC57559ykh)) {
                arrayList3.add(interfaceC57559ykh);
            }
        }
        C57567ykp c57567ykpOLrzqt = OLrzqt();
        if (c57567ykpOLrzqt != null) {
            c57567ykpOLrzqt.KWHzl(copydefault("subscribe", arrayList3));
        }
        for (InterfaceC57559ykh interfaceC57559ykh2 : list2) {
            if (!hashSetQKudOq.contains(interfaceC57559ykh2.getUniqueKey())) {
                copydefault(interfaceC57559ykh2);
            }
        }
        AhwBna();
    }

    @Override // o.AbstractC57561ykj
    public void KWHzl() {
        super.KWHzl();
        android.os.Handler handler = this.gEmmrt;
        if (handler != null) {
            handler.removeCallbacks(this.values);
        }
    }

    public final boolean OLrzqt(InterfaceC57559ykh interfaceC57559ykh) {
        if (interfaceC57559ykh instanceof WsSubscribeArgV5) {
            java.lang.String uniqueKey = interfaceC57559ykh.getUniqueKey();
            WsSubscribeArgV5 wsSubscribeArgV5 = this.AhwBna.get(uniqueKey);
            if (wsSubscribeArgV5 != null) {
                wsSubscribeArgV5.increaseReferenceCount$OKNetwork_websocket();
            } else {
                ((WsSubscribeArgV5) interfaceC57559ykh).setRefCount$OKNetwork_websocket(1);
                this.AhwBna.put(uniqueKey, interfaceC57559ykh);
                return true;
            }
        }
        return false;
    }

    public final void AEQbTJ(@NotNull AbstractC57556yke abstractC57556yke) {
        java.lang.Object objOLrzqt;
        Intrinsics.checkNotNullParameter(abstractC57556yke, "");
        java.util.List<? extends InterfaceC57559ykh> listGEmmrt = abstractC57556yke.gEmmrt();
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        for (java.lang.String str : this.valueOf.keySet()) {
            Intrinsics.checkNotNullExpressionValue(str, "");
            OKWSResponseData oKWSResponseData = this.valueOf.get(str);
            java.util.Iterator<? extends InterfaceC57559ykh> it = listGEmmrt.iterator();
            while (true) {
                if (it.hasNext()) {
                    InterfaceC57559ykh next = it.next();
                    if ((next instanceof WsSubscribeArgV5) && oKWSResponseData != null && ((WsSubscribeArgV5) next).matchResponse$OKNetwork_websocket(oKWSResponseData.getArgMap())) {
                        java.lang.Object objAEQbTJ = this.djBIcL.AEQbTJ(oKWSResponseData.getChannelDataBuffer());
                        if (objAEQbTJ != null) {
                            arrayList.add(objAEQbTJ);
                        }
                    }
                }
            }
        }
        if (arrayList.size() <= 0 || (objOLrzqt = this.djBIcL.OLrzqt(arrayList)) == null) {
            return;
        }
        OKIncomingData oKIncomingData = new OKIncomingData(null, objOLrzqt, 1, null);
        oKIncomingData.setInitialData(true);
        abstractC57556yke.EZpvd(oKIncomingData);
    }

    public final void copydefault(InterfaceC57559ykh interfaceC57559ykh) {
        if (interfaceC57559ykh instanceof WsSubscribeArgV5) {
            WsSubscribeArgV5 wsSubscribeArgV5 = this.AhwBna.get(interfaceC57559ykh.getUniqueKey());
            if (wsSubscribeArgV5 != null) {
                wsSubscribeArgV5.decreaseReferenceCount$OKNetwork_websocket();
            }
        }
    }

    public final void AhwBna() {
        if (this.djBIcL.copydefault() && this.djBIcL.KWHzl() > 0) {
            djBIcL();
        } else {
            gEmmrt();
        }
    }

    public final void djBIcL() {
        C57570yks.KWHzl.OLrzqt("OKWSChannelV5", "--startCheckTimer");
        if (this.gEmmrt == null) {
            this.gEmmrt = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        android.os.Handler handler = this.gEmmrt;
        if (handler != null) {
            handler.removeCallbacks(this.values);
        }
        android.os.Handler handler2 = this.gEmmrt;
        if (handler2 != null) {
            handler2.postDelayed(this.values, ((long) this.djBIcL.KWHzl()) * 1000);
        }
    }

    public final void gEmmrt() {
        Function1<AbstractC57561ykj, Unit> function1AEQbTJ;
        C57570yks.KWHzl.OLrzqt("OKWSChannelV5", "--removeUnusedChannelArgs");
        java.util.ArrayList<InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
        ConcurrentHashMap<java.lang.String, WsSubscribeArgV5> concurrentHashMap = this.AhwBna;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(concurrentHashMap.size());
        java.util.Iterator<Map.Entry<java.lang.String, WsSubscribeArgV5>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getValue());
        }
        java.util.ArrayList<WsSubscribeArgV5> arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            if (((WsSubscribeArgV5) obj).hasNoRef$OKNetwork_websocket()) {
                arrayList3.add(obj);
            }
        }
        for (WsSubscribeArgV5 wsSubscribeArgV5 : arrayList3) {
            this.AhwBna.remove(wsSubscribeArgV5.getUniqueKey());
            arrayList.add(wsSubscribeArgV5);
        }
        C57567ykp c57567ykpOLrzqt = OLrzqt();
        if (c57567ykpOLrzqt != null) {
            c57567ykpOLrzqt.KWHzl(copydefault("unsubscribe", arrayList));
        }
        if (this.AhwBna.size() != 0 || (function1AEQbTJ = AEQbTJ()) == null) {
            return;
        }
        function1AEQbTJ.invoke(this);
    }

    public final java.lang.String copydefault(java.lang.String str, java.util.ArrayList<InterfaceC57559ykh> arrayList) {
        if (!arrayList.isEmpty()) {
            return C33490mxT.OLrzqt(new WsCommonEventBean(str, arrayList));
        }
        return null;
    }

    public final void OLrzqt(OKIncomingData oKIncomingData) {
        java.util.Iterator<AbstractC57556yke> it = copydefault().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            AbstractC57556yke next = it.next();
            java.util.Iterator<? extends InterfaceC57559ykh> it2 = next.gEmmrt().iterator();
            while (true) {
                if (it2.hasNext()) {
                    InterfaceC57559ykh next2 = it2.next();
                    if ((next2 instanceof WsSubscribeArgV5) && ((WsSubscribeArgV5) next2).matchResponse$OKNetwork_websocket(oKIncomingData.getSource())) {
                        next.EZpvd(oKIncomingData);
                        break;
                    }
                }
            }
        }
    }

    public final void EZpvd(OKWSEvent oKWSEvent, java.lang.String str) {
        C57567ykp c57567ykpOLrzqt;
        C57570yks.KWHzl.EZpvd("OKWSChannelV5", "channelBufferProcessOnError event: " + oKWSEvent + ", msg: " + str);
        if (oKWSEvent != OKWSEvent.CHECK_SUM_ERROR || (c57567ykpOLrzqt = OLrzqt()) == null) {
            return;
        }
        c57567ykpOLrzqt.copydefault();
    }
}
