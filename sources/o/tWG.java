package o;

import com.okinc.planet.ws.SocialWebSocketManager$internalCreateWebSocket$2;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tWG {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final CoroutineScope AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Object OLrzqt(java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj;
    }

    public tWG(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(new CoroutineName("SocialTradingWebSocket")).plus(new ActionBar(CoroutineExceptionHandler.Key)));
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tWG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final C57567ykp OLrzqt() {
        return tWF.Companion.copydefault();
    }

    public static final class ActionBar extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public ActionBar(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            C43296rmc.copydefault("SocialTradingWebSocketManager", "SocialWebSocketManager", th);
        }
    }

    public final <T> SharedFlow<T> EZpvd(@NotNull DeserializationStrategy<? extends T> deserializationStrategy, @NotNull WsArgV5 wsArgV5) {
        Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        Intrinsics.checkNotNullParameter(wsArgV5, "");
        return KWHzl(deserializationStrategy, wsArgV5, new Function1() { // from class: o.tWJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tWG.OLrzqt(obj);
            }
        });
    }

    public final <T, Output> SharedFlow<Output> KWHzl(@NotNull DeserializationStrategy<? extends T> deserializationStrategy, @NotNull WsArgV5 wsArgV5, @NotNull Function1<? super T, ? extends Output> function1) {
        Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        Intrinsics.checkNotNullParameter(wsArgV5, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return FlowKt__ShareKt.shareIn$default(FlowKt__ContextKt.buffer$default(FlowKt.callbackFlow(new SocialWebSocketManager$internalCreateWebSocket$2(this, wsArgV5, deserializationStrategy, function1, null)), Integer.MAX_VALUE, null, 2, null), this.AEQbTJ, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), 0, 4, null);
    }
}
