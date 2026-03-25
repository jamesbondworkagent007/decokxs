package app.cash.sqldelight.coroutines;

import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.AssistContent;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes20.dex */
public final class FlowQuery$asFlow$1<T> extends SuspendLambda implements Function2<FlowCollector<? super AssistContent<? extends T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssistContent<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.AssistContent<? extends T> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowQuery$asFlow$1(AssistContent<? extends T> assistContent, Continuation<? super FlowQuery$asFlow$1> continuation) {
        super(2, continuation);
        this.$this_asFlow = assistContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        FlowQuery$asFlow$1 flowQuery$asFlow$1 = new FlowQuery$asFlow$1(this.$this_asFlow, continuation);
        flowQuery$asFlow$1.L$0 = obj;
        return flowQuery$asFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull FlowCollector<? super AssistContent<? extends T>> flowCollector, Continuation<? super Unit> continuation) {
        return ((FlowQuery$asFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #0 {all -> 0x008b, blocks: (B:7:0x001a, B:16:0x0058, B:19:0x0067, B:21:0x006f, B:12:0x0032, B:15:0x0054), top: B:29:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0080 -> B:16:0x0058). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        FlowCollector flowCollector;
        AssistContent.TaskDescription taskDescription;
        ChannelIterator channelIterator;
        ChannelIterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                flowCollector = (FlowCollector) this.L$0;
                final Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                channelChannel$default.mo5769trySendJP2dKIU(Unit.INSTANCE);
                taskDescription = new AssistContent.TaskDescription() { // from class: o.ApplicationInfo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.AssistContent.TaskDescription
                    public final void AEQbTJ() {
                        FlowQuery$asFlow$1.invokeSuspend$lambda$0(channelChannel$default);
                    }
                };
                this.$this_asFlow.addListener(taskDescription);
                it = channelChannel$default.iterator();
            } else if (i == 1) {
                ChannelIterator channelIterator2 = (ChannelIterator) this.L$2;
                taskDescription = (AssistContent.TaskDescription) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                channelIterator = channelIterator2;
                if (!((Boolean) obj).booleanValue()) {
                    channelIterator.next();
                    AssistContent<T> assistContent = this.$this_asFlow;
                    this.L$0 = flowCollector;
                    this.L$1 = taskDescription;
                    this.L$2 = channelIterator;
                    this.label = 2;
                    it = channelIterator;
                    if (flowCollector.emit(assistContent, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    this.$this_asFlow.removeListener(taskDescription);
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChannelIterator channelIterator3 = (ChannelIterator) this.L$2;
                taskDescription = (AssistContent.TaskDescription) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                it = channelIterator3;
            }
            this.L$0 = flowCollector;
            this.L$1 = taskDescription;
            this.L$2 = it;
            this.label = 1;
            obj = it.hasNext(this);
            channelIterator = it;
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th) {
            this.$this_asFlow.removeListener(taskDescription);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(Channel channel) {
        channel.mo5769trySendJP2dKIU(Unit.INSTANCE);
    }
}
