package com.okinc.unify_trade.core.basic.task.basic;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AccountTradeConfig;
import com.okinc.unify_trade.biz.AlgoShareConfigInfo;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.core.basic.task.basic.TradeSettingTask$refreshTradeSettingTask$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import o.C43422row;
import o.C54589xNz;
import o.C56095xwO;
import o.C56097xwQ;
import o.C56106xwZ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.xOR;
import o.xVP;

/* JADX INFO: loaded from: classes24.dex */
public final class TradeSettingTask$refreshTradeSettingTask$1 extends SuspendLambda implements Function2<ProducerScope<? super C56106xwZ>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLogin;
    final /* synthetic */ boolean $isSupportBot;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C56095xwO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSettingTask$refreshTradeSettingTask$1(boolean z, C56095xwO c56095xwO, boolean z2, Continuation<? super TradeSettingTask$refreshTradeSettingTask$1> continuation) {
        super(2, continuation);
        this.$isLogin = z;
        this.this$0 = c56095xwO;
        this.$isSupportBot = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeSettingTask$refreshTradeSettingTask$1 tradeSettingTask$refreshTradeSettingTask$1 = new TradeSettingTask$refreshTradeSettingTask$1(this.$isLogin, this.this$0, this.$isSupportBot, continuation);
        tradeSettingTask$refreshTradeSettingTask$1.L$0 = obj;
        return tradeSettingTask$refreshTradeSettingTask$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super C56106xwZ> producerScope, Continuation<? super Unit> continuation) {
        return ((TradeSettingTask$refreshTradeSettingTask$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final ProducerScope producerScope;
        C56097xwQ c56097xwQ;
        Function0 function0;
        C56095xwO c56095xwO;
        C56097xwQ c56097xwQ2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            if (!this.$isLogin) {
                C56106xwZ c56106xwZ = this.this$0.KWHzl;
                this.L$0 = producerScope;
                this.label = 1;
                if (producerScope.send(c56106xwZ, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            c56097xwQ = this.this$0.EZpvd;
            if (c56097xwQ != null) {
                c56097xwQ.fetchVPNInfo();
            }
            C56095xwO c56095xwO2 = this.this$0;
            final C56097xwQ c56097xwQ3 = new C56097xwQ(this.$isSupportBot);
            final C56095xwO c56095xwO3 = this.this$0;
            c56097xwQ3.KWHzl(new Function1() { // from class: o.xwP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return TradeSettingTask$refreshTradeSettingTask$1.invokeSuspend$lambda$6$lambda$1(c56097xwQ3, c56095xwO3, (kotlin.Pair) obj2);
                }
            });
            c56097xwQ3.copydefault(new Function1() { // from class: o.xwT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return TradeSettingTask$refreshTradeSettingTask$1.invokeSuspend$lambda$6$lambda$2(c56097xwQ3, producerScope, (kotlin.Pair) obj2);
                }
            });
            c56097xwQ3.OLrzqt(new Function1() { // from class: o.xwR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return TradeSettingTask$refreshTradeSettingTask$1.invokeSuspend$lambda$6$lambda$4(producerScope, c56095xwO3, ((java.lang.Boolean) obj2).booleanValue());
                }
            });
            c56097xwQ3.fIwbmz();
            function0 = new Function0() { // from class: o.xwS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return TradeSettingTask$refreshTradeSettingTask$1.invokeSuspend$lambda$6$lambda$5(c56095xwO3);
                }
            };
            this.L$0 = c56097xwQ3;
            this.L$1 = c56095xwO2;
            this.label = 2;
            if (ProduceKt.awaitClose(producerScope, function0, this) != objCopydefault) {
                return objCopydefault;
            }
            c56095xwO = c56095xwO2;
            c56097xwQ2 = c56097xwQ3;
            c56095xwO.EZpvd = c56097xwQ2;
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c56095xwO = (C56095xwO) this.L$1;
            c56097xwQ2 = (C56097xwQ) this.L$0;
            C56391yDq.AEQbTJ(obj);
            c56095xwO.EZpvd = c56097xwQ2;
            return Unit.INSTANCE;
        }
        producerScope = (ProducerScope) this.L$0;
        C56391yDq.AEQbTJ(obj);
        SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        c56097xwQ = this.this$0.EZpvd;
        if (c56097xwQ != null) {
        }
        C56095xwO c56095xwO22 = this.this$0;
        final C56097xwQ c56097xwQ32 = new C56097xwQ(this.$isSupportBot);
        final C56095xwO c56095xwO32 = this.this$0;
        c56097xwQ32.KWHzl(new Function1() { // from class: o.xwP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return TradeSettingTask$refreshTradeSettingTask$1.invokeSuspend$lambda$6$lambda$1(c56097xwQ32, c56095xwO32, (kotlin.Pair) obj2);
            }
        });
        c56097xwQ32.copydefault(new Function1() { // from class: o.xwT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return TradeSettingTask$refreshTradeSettingTask$1.invokeSuspend$lambda$6$lambda$2(c56097xwQ32, producerScope, (kotlin.Pair) obj2);
            }
        });
        c56097xwQ32.OLrzqt(new Function1() { // from class: o.xwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return TradeSettingTask$refreshTradeSettingTask$1.invokeSuspend$lambda$6$lambda$4(producerScope, c56095xwO32, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        c56097xwQ32.fIwbmz();
        function0 = new Function0() { // from class: o.xwS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradeSettingTask$refreshTradeSettingTask$1.invokeSuspend$lambda$6$lambda$5(c56095xwO32);
            }
        };
        this.L$0 = c56097xwQ32;
        this.L$1 = c56095xwO22;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) != objCopydefault) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6$lambda$1(C56097xwQ c56097xwQ, C56095xwO c56095xwO, Pair pair) {
        xOR xorCopydefault;
        xOR xorCopydefault2;
        String str = (String) pair.getFirst();
        if (Intrinsics.EZpvd((Object) str, (Object) c56097xwQ.DbNXlk())) {
            Object data = ((ResponseData) pair.getSecond()).getData();
            ArrayList arrayList = data instanceof ArrayList ? (ArrayList) data : null;
            if (arrayList != null) {
                xVP.OLrzqt.OLrzqt("TradeSettingTask", "requestTradeInfoAndConfig query success");
                c56095xwO.EZpvd(c56095xwO.KWHzl, (AccountTradeConfig) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList));
            }
        } else if (Intrinsics.EZpvd((Object) str, (Object) c56097xwQ.djBIcL())) {
            xVP.OLrzqt.OLrzqt("TradeSettingTask", "requestBotUserConfig query success");
            Object data2 = ((ResponseData) pair.getSecond()).getData();
            List list = data2 instanceof List ? (List) data2 : null;
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault != null && (xorCopydefault2 = interfaceC54581xNrCopydefault.copydefault()) != null) {
                xorCopydefault2.copydefault(list != null ? (BotUserConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list) : null);
            }
        } else if (Intrinsics.EZpvd((Object) str, (Object) c56097xwQ.gEmmrt())) {
            xVP.OLrzqt.OLrzqt("TradeSettingTask", "requestAlgoShareConfig query success");
            Object data3 = ((ResponseData) pair.getSecond()).getData();
            List list2 = data3 instanceof List ? (List) data3 : null;
            InterfaceC54581xNr interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault2 != null && (xorCopydefault = interfaceC54581xNrCopydefault2.copydefault()) != null) {
                xorCopydefault.EZpvd(list2 != null ? (AlgoShareConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list2) : null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6$lambda$2(C56097xwQ c56097xwQ, ProducerScope producerScope, Pair pair) {
        if (Intrinsics.EZpvd(pair.getFirst(), (Object) c56097xwQ.DbNXlk())) {
            xVP.OLrzqt.OLrzqt("TradeSettingTask", "requestTradeInfoAndConfig query failed");
            producerScope.close(new Throwable(C43422row.AEQbTJ((ResponseData<?>) pair.getSecond())));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6$lambda$4(ProducerScope producerScope, C56095xwO c56095xwO, boolean z) {
        if (z) {
            Object objMo5769trySendJP2dKIU = producerScope.mo5769trySendJP2dKIU(c56095xwO.KWHzl);
            if (objMo5769trySendJP2dKIU instanceof ChannelResult.Failed) {
                ChannelResult.m7424exceptionOrNullimpl(objMo5769trySendJP2dKIU);
                xVP.OLrzqt.OLrzqt("TradeSettingTask", "fail to send userInfo");
            }
        }
        SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6$lambda$5(C56095xwO c56095xwO) {
        xVP.OLrzqt.OLrzqt("TradeSettingTask", "tradeSettingUseCase disposed");
        C56097xwQ c56097xwQ = c56095xwO.EZpvd;
        if (c56097xwQ != null) {
            c56097xwQ.fetchVPNInfo();
        }
        return Unit.INSTANCE;
    }
}
