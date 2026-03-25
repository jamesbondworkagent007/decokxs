package com.okinc.im.imui.broadcastmessages;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C35386nuP;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessagesAnalyser$addMessages$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<OKMessage> $list;
    Object L$0;
    int label;
    final /* synthetic */ C35386nuP this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKMessage.SentStatus.values().length];
            try {
                iArr[OKMessage.SentStatus.SENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKMessage.SentStatus.SENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagesAnalyser$addMessages$2(List<OKMessage> list, C35386nuP c35386nuP, Continuation<? super BroadcastMessagesAnalyser$addMessages$2> continuation) {
        super(2, continuation);
        this.$list = list;
        this.this$0 = c35386nuP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessagesAnalyser$addMessages$2(this.$list, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BroadcastMessagesAnalyser$addMessages$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.IntRef intRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<OKMessage> list = this.$list;
            C35386nuP c35386nuP = this.this$0;
            for (OKMessage oKMessage : list) {
                c35386nuP.EZpvd.put(C56443yFo.KWHzl(oKMessage.getSeq()), oKMessage.getSentStatus());
            }
            intRef = new Ref.IntRef();
            Ref.IntRef intRef2 = new Ref.IntRef();
            Set<Map.Entry> setEntrySet = this.this$0.EZpvd.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
            for (Map.Entry entry : setEntrySet) {
                Intrinsics.copydefault(entry);
                OKMessage.SentStatus sentStatus = (OKMessage.SentStatus) entry.getValue();
                int i2 = sentStatus == null ? -1 : Activity.EZpvd[sentStatus.ordinal()];
                if (i2 == 1) {
                    int i3 = intRef2.element;
                    intRef2.element = i3 + 1;
                    C56443yFo.AEQbTJ(i3);
                } else if (i2 == 2) {
                    int i4 = intRef.element;
                    intRef.element = i4 + 1;
                    C56443yFo.AEQbTJ(i4);
                } else {
                    Unit unit = Unit.INSTANCE;
                }
            }
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(intRef2.element);
            this.L$0 = intRef;
            this.label = 1;
            if (mutableStateFlow.emit(numAEQbTJ, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            intRef = (Ref.IntRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
        Integer numAEQbTJ2 = C56443yFo.AEQbTJ(intRef.element);
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow2.emit(numAEQbTJ2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
