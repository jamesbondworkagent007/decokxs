package o;

import com.okinc.tradingbot.impl.usecase.websocket.BotWebSocketManager$internalCreateWebSocket$2;
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
import o.C52679wUi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wUj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@yCR
public final class C52680wUj {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final CoroutineScope AEQbTJ;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C52680wUj(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(new CoroutineName("TradingBotWebSocket")).plus(new ActionBar(CoroutineExceptionHandler.Key)));
    }

    /* JADX INFO: renamed from: o.wUj$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wUj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.wUj$ActionBar */
    public static final class ActionBar extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public ActionBar(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            C43296rmc.copydefault("TradingBotWebSocketManager", "BotWebSocketManager", th);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wUi.ActionBar.getTradingBotV5Connection$default(o.wUi$ActionBar, boolean, boolean, int, java.lang.Object):o.ykp */
    public final C57567ykp OLrzqt() {
        return C52679wUi.ActionBar.getTradingBotV5Connection$default(C52679wUi.Companion, false, false, 3, null);
    }

    public final C57567ykp copydefault() {
        return C52679wUi.ActionBar.getTradingBotV5Connection$default(C52679wUi.Companion, false, false, 2, null);
    }

    public static /* synthetic */ SharedFlow internalCreateWebSocket$default(C52680wUj c52680wUj, DeserializationStrategy deserializationStrategy, WsArgV5 wsArgV5, C57567ykp c57567ykp, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            c57567ykp = null;
        }
        return c52680wUj.AEQbTJ(deserializationStrategy, wsArgV5, c57567ykp, function1);
    }

    public final <T, Output> SharedFlow<Output> AEQbTJ(@NotNull DeserializationStrategy<? extends T> deserializationStrategy, @NotNull WsArgV5 wsArgV5, C57567ykp c57567ykp, @NotNull Function1<? super T, ? extends Output> function1) {
        Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        Intrinsics.checkNotNullParameter(wsArgV5, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return FlowKt__ShareKt.shareIn$default(FlowKt__ContextKt.buffer$default(FlowKt.callbackFlow(new BotWebSocketManager$internalCreateWebSocket$2(c57567ykp, this, wsArgV5, deserializationStrategy, function1, null)), Integer.MAX_VALUE, null, 2, null), this.AEQbTJ, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), 0, 4, null);
    }
}
