package com.amplitude.core.platform;

import com.amplitude.core.Storage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelIterator;
import o.C5242Ke;
import o.C5255Kr;
import o.C5259Kv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.KY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EventPipeline$write$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ C5255Kr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventPipeline$write$1(C5255Kr c5255Kr, Continuation<? super EventPipeline$write$1> continuation) {
        super(2, continuation);
        this.this$0 = c5255Kr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new EventPipeline$write$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EventPipeline$write$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:25:0x0061) to fix multi-entry loop: BACK_EDGE: B:25:0x0061 -> B:8:0x0018 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0067 -> B:8:0x0018). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:8:0x0018). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0080 -> B:8:0x0018). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ChannelIterator it;
        ChannelIterator channelIterator;
        Storage storageValueOf;
        C5242Ke c5242KeEZpvd;
        Object objHasNext;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            it = this.this$0.values.iterator();
            this.L$0 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext == objCopydefault) {
            }
        } else if (i == 1) {
            ChannelIterator channelIterator2 = (ChannelIterator) this.L$0;
            C56391yDq.AEQbTJ(obj);
            channelIterator = channelIterator2;
            if (!((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = this.I$0;
            channelIterator = (ChannelIterator) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Exception e) {
                KY.EZpvd(e, this.this$0.EZpvd.DbNXlk(), "Error when writing event to pipeline");
            }
            it = channelIterator;
            if (!Intrinsics.EZpvd(this.this$0.EZpvd.djBIcL().iwGUEr(), C56443yFo.KWHzl(true))) {
                if (this.this$0.copydefault.incrementAndGet() >= this.this$0.OLrzqt() || i2 != 0) {
                    this.this$0.copydefault.set(0);
                    this.this$0.AkhnZx.mo5769trySendJP2dKIU("#!upload");
                } else {
                    this.this$0.fetchVPNInfo();
                }
            }
            this.L$0 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext == objCopydefault) {
                return objCopydefault;
            }
            channelIterator = it;
            obj = objHasNext;
            if (!((Boolean) obj).booleanValue()) {
                C5259Kv c5259Kv = (C5259Kv) channelIterator.next();
                if (c5259Kv.AEQbTJ() == WriteQueueMessageType.FLUSH) {
                    i2 = 1;
                    if (1 == 0 && c5259Kv.EZpvd() != null) {
                        storageValueOf = this.this$0.valueOf();
                        c5242KeEZpvd = c5259Kv.EZpvd();
                        this.L$0 = channelIterator;
                        this.I$0 = 1;
                        this.label = 2;
                        if (storageValueOf.EZpvd(c5242KeEZpvd, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    i2 = 0;
                    if (0 == 0) {
                        storageValueOf = this.this$0.valueOf();
                        c5242KeEZpvd = c5259Kv.EZpvd();
                        this.L$0 = channelIterator;
                        this.I$0 = 1;
                        this.label = 2;
                        if (storageValueOf.EZpvd(c5242KeEZpvd, (Continuation<? super Unit>) this) == objCopydefault) {
                        }
                    }
                }
                it = channelIterator;
                if (!Intrinsics.EZpvd(this.this$0.EZpvd.djBIcL().iwGUEr(), C56443yFo.KWHzl(true))) {
                }
                this.L$0 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext == objCopydefault) {
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
