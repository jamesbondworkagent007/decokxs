package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.other.IMSource;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C44136sEq;
import o.C56391yDq;
import o.C56442yFn;
import o.sGI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Result<? extends OKConversation>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $memberOfGroup;
    final /* synthetic */ IMSource $source;
    final /* synthetic */ String $userId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44136sEq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1(C44136sEq c44136sEq, String str, IMSource iMSource, String str2, Continuation<? super InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c44136sEq;
        this.$userId = str;
        this.$source = iMSource;
        this.$memberOfGroup = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1 inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1 = new InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1(this.this$0, this.$userId, this.$source, this.$memberOfGroup, continuation);
        inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1.L$0 = obj;
        return inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Result<? extends OKConversation>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Result<OKConversation>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Result<OKConversation>> flowCollector, Continuation<? super Unit> continuation) {
        return ((InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class StateListAnimator implements Flow<Result<? extends OKConversation>> {
        public final /* synthetic */ Flow copydefault;

        public StateListAnimator(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(@NotNull FlowCollector<? super Result<? extends OKConversation>> flowCollector, @NotNull Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.okimcore.channel.inhouse.impl.InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1 inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1;
                if (continuation instanceof InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1) {
                    inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1 = (InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1 = new InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    Result.Application application = Result.Companion;
                    Result resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl((OKConversation) obj));
                    inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(resultM7376boximpl, inHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        RelationSourceType relationSourceType;
        StateListAnimator stateListAnimator;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            sGI sgiOLrzqt = this.this$0.KWHzl.OLrzqt();
            String str = this.$userId;
            this.L$0 = flowCollector2;
            this.label = 1;
            Object objEZpvd = sgiOLrzqt.EZpvd(str, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            flowCollector = flowCollector2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                String channelId = ((OKConversation) obj).getTargetId();
                stateListAnimator = new StateListAnimator(this.this$0.OLrzqt(channelId));
                this.L$0 = null;
                this.label = 3;
                if (FlowKt.emitAll(flowCollector, stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        InHouseIMConversationListData inHouseIMConversationListData = (InHouseIMConversationListData) obj;
        if (inHouseIMConversationListData == null || (channelId = inHouseIMConversationListData.getChannelId()) == null) {
            C44136sEq c44136sEq = this.this$0;
            String str2 = this.$userId;
            if (this.$source == IMSource.P2P) {
                relationSourceType = RelationSourceType.P2P;
            } else {
                relationSourceType = RelationSourceType.NORMAL;
            }
            String str3 = this.$memberOfGroup;
            this.L$0 = flowCollector;
            this.label = 2;
            obj = c44136sEq.copydefault(str2, relationSourceType, str3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            String channelId2 = ((OKConversation) obj).getTargetId();
        }
        stateListAnimator = new StateListAnimator(this.this$0.OLrzqt(channelId2));
        this.L$0 = null;
        this.label = 3;
        if (FlowKt.emitAll(flowCollector, stateListAnimator, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
