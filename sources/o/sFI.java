package o;

import com.okinc.okimcore.feature.agentbot.model.enums.AgentBotEntryInfo;
import com.okinc.okimcore.feature.agentbot.remote.AgentBotApiService;
import com.okinc.okimcore.feature.agentbot.usecase.InitAgentBotUseCaseImpl$invoke$2;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sFI implements sFG {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public Function0<java.lang.Long> AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final AgentBotApiService OLrzqt;
    public final ConcurrentHashMap<java.lang.String, java.lang.Long> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.Long> EZpvd() {
        return this.AEQbTJ;
    }

    @yCM
    public sFI(@NotNull AgentBotApiService agentBotApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(agentBotApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = agentBotApiService;
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = new Function0() { // from class: o.sFL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Long.valueOf(sFI.OLrzqt());
            }
        };
        this.copydefault = new ConcurrentHashMap<>();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sFI.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final long OLrzqt() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // o.sFG
    public java.lang.Object EZpvd(@NotNull AgentBotEntryInfo agentBotEntryInfo, @NotNull Continuation<? super sFH> continuation) {
        return BuildersKt.withContext(this.KWHzl, new InitAgentBotUseCaseImpl$invoke$2(agentBotEntryInfo, this, null), continuation);
    }
}
