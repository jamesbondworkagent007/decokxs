package com.okinc.common.application;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import o.C32550mfh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseApplication$startSwitchMarket$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $callID;
    final /* synthetic */ Continuation<Boolean> $continuation;
    final /* synthetic */ String $requestKey;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.coroutines.Continuation<? super java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseApplication$startSwitchMarket$2$1(String str, String str2, Continuation<? super Boolean> continuation, Continuation<? super BaseApplication$startSwitchMarket$2$1> continuation2) {
        super(2, continuation2);
        this.$requestKey = str;
        this.$callID = str2;
        this.$continuation = continuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseApplication$startSwitchMarket$2$1(this.$requestKey, this.$callID, this.$continuation, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseApplication$startSwitchMarket$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.channels.ReceiveChannel] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ReceiveChannel receiveChannelKWHzl;
        String str;
        String str2;
        ChannelIterator channelIterator;
        Continuation<Boolean> continuation;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                C56391yDq.AEQbTJ(obj);
                receiveChannelKWHzl = C32550mfh.OLrzqt.KWHzl(this.$requestKey);
                str = this.$callID;
                str2 = this.$requestKey;
                Continuation<Boolean> continuation2 = this.$continuation;
                ChannelIterator it = receiveChannelKWHzl.iterator();
                this.L$0 = str;
                this.L$1 = str2;
                this.L$2 = continuation2;
                this.L$3 = receiveChannelKWHzl;
                this.L$4 = it;
                this.label = 1;
                Object objHasNext = it.hasNext(this);
                if (objHasNext == objCopydefault) {
                    return objCopydefault;
                }
                channelIterator = it;
                continuation = continuation2;
                obj = objHasNext;
            } else {
                if (r1 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator = (ChannelIterator) this.L$4;
                receiveChannelKWHzl = (ReceiveChannel) this.L$3;
                continuation = (Continuation) this.L$2;
                str2 = (String) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                boolean zBooleanValue = ((Boolean) channelIterator.next()).booleanValue();
                pUU.KWHzl("SwitchMarketLoadingActivity", "channel result:" + zBooleanValue + ", callID:" + str);
                C32550mfh.OLrzqt.copydefault(str2);
                Boolean boolKWHzl = C56443yFo.KWHzl(zBooleanValue);
                Result.Application application = Result.Companion;
                continuation.resumeWith(Result.m7377constructorimpl(boolKWHzl));
                Unit unit = Unit.INSTANCE;
                ChannelsKt.cancelConsumed(receiveChannelKWHzl, null);
                return unit;
            }
            Unit unit2 = Unit.INSTANCE;
            ChannelsKt.cancelConsumed(receiveChannelKWHzl, null);
            return unit2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ChannelsKt.cancelConsumed(r1, th);
                throw th2;
            }
        }
    }
}
