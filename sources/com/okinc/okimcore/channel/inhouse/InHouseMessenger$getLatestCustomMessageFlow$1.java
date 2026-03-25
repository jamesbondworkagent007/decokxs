package com.okinc.okimcore.channel.inhouse;

import com.okinc.okimcore.channel.inhouse.InHouseMessenger$getLatestCustomMessageFlow$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C44125sEf;
import o.C44373sNk;
import o.C44462sQs;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseMessenger$getLatestCustomMessageFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super OKMessage>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ String $serviceName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44125sEf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseMessenger$getLatestCustomMessageFlow$1(C44125sEf c44125sEf, String str, String str2, Continuation<? super InHouseMessenger$getLatestCustomMessageFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c44125sEf;
        this.$channelId = str;
        this.$serviceName = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseMessenger$getLatestCustomMessageFlow$1 inHouseMessenger$getLatestCustomMessageFlow$1 = new InHouseMessenger$getLatestCustomMessageFlow$1(this.this$0, this.$channelId, this.$serviceName, continuation);
        inHouseMessenger$getLatestCustomMessageFlow$1.L$0 = obj;
        return inHouseMessenger$getLatestCustomMessageFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super OKMessage> producerScope, Continuation<? super Unit> continuation) {
        return ((InHouseMessenger$getLatestCustomMessageFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Application extends C44373sNk {
        public final /* synthetic */ String EZpvd;
        public final /* synthetic */ String KWHzl;
        public final /* synthetic */ ProducerScope<OKMessage> OLrzqt;
        public final /* synthetic */ C44125sEf copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super com.okinc.okimcore.model.im.OKMessage> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(String str, C44125sEf c44125sEf, String str2, ProducerScope<? super OKMessage> producerScope) {
            this.EZpvd = str;
            this.copydefault = c44125sEf;
            this.KWHzl = str2;
            this.OLrzqt = producerScope;
        }

        @Override // o.C44373sNk, o.InterfaceC44291sKj
        public void EZpvd(C44462sQs c44462sQs) {
            Intrinsics.checkNotNullParameter(c44462sQs, "");
            super.EZpvd(c44462sQs);
            OKMessage oKMessageOLrzqt = c44462sQs.OLrzqt();
            if (Intrinsics.EZpvd((Object) oKMessageOLrzqt.getTargetId(), (Object) this.EZpvd) && this.copydefault.AEQbTJ(oKMessageOLrzqt, this.KWHzl)) {
                this.OLrzqt.mo5769trySendJP2dKIU(oKMessageOLrzqt);
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            final Application application = new Application(this.$channelId, this.this$0, this.$serviceName, producerScope);
            this.this$0.fIwbmz().OLrzqt(application);
            final C44125sEf c44125sEf = this.this$0;
            Function0 function0 = new Function0() { // from class: o.sEj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return InHouseMessenger$getLatestCustomMessageFlow$1.invokeSuspend$lambda$0(c44125sEf, application);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C44125sEf c44125sEf, Application application) {
        c44125sEf.fIwbmz().AEQbTJ(application);
        return Unit.INSTANCE;
    }
}
