package o;

import com.okinc.im.usecase.group.members.ObserveGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final sIR copydefault;

    @yCM
    public oDX(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = sir;
        this.AEQbTJ = coroutineDispatcher;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final Flow<java.util.List<GroupMemberInfo>> copydefault(java.lang.String str) {
        Flow<java.util.List<GroupMemberInfo>> flowFlowOf;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            flowFlowOf = FlowKt.flowOf(yDY.AhwBna());
        } else {
            flowFlowOf = this.copydefault.AEQbTJ(str);
        }
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(flowFlowOf), this.AEQbTJ);
    }

    public final Flow<java.util.List<C34282nYe>> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(new Application(copydefault(str)), this.AEQbTJ);
    }

    public static final class Application implements Flow<java.util.List<? extends C34282nYe>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.oDX$Application$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1 observeGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1;
                if (continuation instanceof ObserveGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1) {
                    observeGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1 = (ObserveGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1) continuation;
                    int i = observeGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1 = new ObserveGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List list = (java.util.List) obj;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(oDQ.EZpvd((GroupMemberInfo) it.next()));
                    }
                    observeGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, observeGroupMemberInfoListUseCase$invokeDisplayList$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends C34282nYe>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
