package o;

import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.websocket.connection.OKWSBaseConnection;
import com.okinc.websocket.v5config.WsSubscribeArgV5;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57553ykb {
    public static final C57553ykb AEQbTJ = new C57553ykb();
    public static final ConcurrentHashMap.KeySetView<OKWSBaseConnection, java.lang.Boolean> EZpvd = ConcurrentHashMap.newKeySet();
    public static final int OLrzqt = 8;

    private C57553ykb() {
    }

    public final void OLrzqt(@NotNull OKWSBaseConnection oKWSBaseConnection) {
        Intrinsics.checkNotNullParameter(oKWSBaseConnection, "");
        if (C43292rmY.OLrzqt.AuCTelauCTel()) {
            pUU.EZpvd("OKWSConnectionManager", "addConnectionCache");
            EZpvd.add(oKWSBaseConnection);
        }
    }

    public final void AEQbTJ(@NotNull OKWSBaseConnection oKWSBaseConnection) {
        Intrinsics.checkNotNullParameter(oKWSBaseConnection, "");
        if (C43292rmY.OLrzqt.AuCTelauCTel()) {
            pUU.EZpvd("OKWSConnectionManager", "removeConnectionCache");
            EZpvd.remove(oKWSBaseConnection);
        }
    }

    public final void OLrzqt() {
        pUU.EZpvd("OKWSConnectionManager", "clearConnectionCache");
        EZpvd.clear();
    }

    public final int copydefault() {
        final Ref.IntRef intRef = new Ref.IntRef();
        ConcurrentHashMap.KeySetView<OKWSBaseConnection, java.lang.Boolean> keySetView = EZpvd;
        Intrinsics.checkNotNullExpressionValue(keySetView, "");
        java.util.Iterator<T> it = keySetView.iterator();
        while (it.hasNext()) {
            OKWSBaseConnection oKWSBaseConnection = (OKWSBaseConnection) it.next();
            if (oKWSBaseConnection instanceof C57567ykp) {
                C57567ykp c57567ykp = (C57567ykp) oKWSBaseConnection;
                if (c57567ykp.AuCTel() == OKWsConnectionState.OPEN) {
                    ConcurrentHashMap<java.lang.String, AbstractC57561ykj> concurrentHashMapFARcdN = c57567ykp.fARcdN();
                    final Function2 function2 = new Function2() { // from class: o.ykf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C57553ykb.OLrzqt(intRef, (java.lang.String) obj, (AbstractC57561ykj) obj2);
                        }
                    };
                    concurrentHashMapFARcdN.forEach(new java.util.function.BiConsumer() { // from class: o.ykd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.util.function.BiConsumer
                        public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                            C57553ykb.EZpvd(function2, obj, obj2);
                        }
                    });
                }
            }
        }
        pUU.EZpvd("OKWSConnectionManager", "getCurrentConnectionCount: " + intRef.element);
        return intRef.element;
    }

    public static final void EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        function2.invoke(obj, obj2);
    }

    public static final Unit OLrzqt(Ref.IntRef intRef, java.lang.String str, AbstractC57561ykj abstractC57561ykj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC57561ykj, "");
        intRef.element += abstractC57561ykj.copydefault().size();
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl() {
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        ConcurrentHashMap.KeySetView<OKWSBaseConnection, java.lang.Boolean> keySetView = EZpvd;
        Intrinsics.checkNotNullExpressionValue(keySetView, "");
        java.util.Iterator<T> it = keySetView.iterator();
        while (it.hasNext()) {
            OKWSBaseConnection oKWSBaseConnection = (OKWSBaseConnection) it.next();
            if (oKWSBaseConnection instanceof C57567ykp) {
                C57567ykp c57567ykp = (C57567ykp) oKWSBaseConnection;
                if (c57567ykp.AuCTel() == OKWsConnectionState.OPEN) {
                    ConcurrentHashMap<java.lang.String, AbstractC57561ykj> concurrentHashMapFARcdN = c57567ykp.fARcdN();
                    final Function2 function2 = new Function2() { // from class: o.yjX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C57553ykb.OLrzqt(sb, (java.lang.String) obj, (AbstractC57561ykj) obj2);
                        }
                    };
                    concurrentHashMapFARcdN.forEach(new java.util.function.BiConsumer() { // from class: o.yjY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.util.function.BiConsumer
                        public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                            C57553ykb.KWHzl(function2, obj, obj2);
                        }
                    });
                }
            }
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        pUU.EZpvd("OKWSConnectionManager", "copyDebugMessage: " + string);
        return string;
    }

    public static final void KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        function2.invoke(obj, obj2);
    }

    public static final Unit OLrzqt(java.lang.StringBuilder sb, java.lang.String str, AbstractC57561ykj abstractC57561ykj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC57561ykj, "");
        sb.append("Channel: " + str);
        sb.append("\n");
        if (abstractC57561ykj instanceof C57577ykz) {
            java.util.Iterator<Map.Entry<java.lang.String, WsSubscribeArgV5>> it = ((C57577ykz) abstractC57561ykj).AYXKKw().entrySet().iterator();
            while (it.hasNext()) {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next().getKey(), new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default.size() > 1) {
                    sb.append("Arg: " + listSplit$default.get(1));
                    sb.append("\n");
                }
            }
        }
        sb.append("Total Listeners: " + abstractC57561ykj.copydefault().size());
        sb.append("\n\n");
        return Unit.INSTANCE;
    }
}
