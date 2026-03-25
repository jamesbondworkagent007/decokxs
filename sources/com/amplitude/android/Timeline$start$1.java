package com.amplitude.android;

import com.amplitude.core.Storage;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.ChannelIterator;
import o.C5217Jf;
import o.C5219Jh;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Timeline$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C5219Jh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timeline$start$1(C5219Jh c5219Jh, Continuation<? super Timeline$start$1> continuation) {
        super(2, continuation);
        this.this$0 = c5219Jh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new Timeline$start$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Timeline$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e4 -> B:36:0x00c1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Long fieldNames;
        Long fieldNames2;
        Long fieldNames3;
        ChannelIterator channelIterator;
        ChannelIterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Deferred<Boolean> newProxyInstance = this.this$0.copydefault().getNewProxyInstance();
            this.label = 1;
            if (newProxyInstance.await(this) == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else if (i == 2) {
            ChannelIterator channelIterator2 = (ChannelIterator) this.L$0;
            C56391yDq.AEQbTJ(obj);
            channelIterator = channelIterator2;
            if (!((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator channelIterator3 = (ChannelIterator) this.L$0;
            C56391yDq.AEQbTJ(obj);
            it = channelIterator3;
            this.L$0 = it;
            this.label = 2;
            obj = it.hasNext(this);
            channelIterator = it;
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (!((Boolean) obj).booleanValue()) {
                C5217Jf c5217Jf = (C5217Jf) channelIterator.next();
                C5219Jh c5219Jh = this.this$0;
                this.L$0 = channelIterator;
                this.label = 3;
                it = channelIterator;
                if (c5219Jh.EZpvd(c5217Jf, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                this.L$0 = it;
                this.label = 2;
                obj = it.hasNext(this);
                channelIterator = it;
                if (obj == objCopydefault) {
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
            }
        }
        long jLongValue = -1;
        if (this.this$0.copydefault == null) {
            AtomicLong atomicLong = this.this$0.KWHzl;
            String strCopydefault = this.this$0.copydefault().fIwbmz().copydefault(Storage.Constants.PREVIOUS_SESSION_ID);
            atomicLong.set((strCopydefault == null || (fieldNames3 = StringsKt__StringNumberConversionsKt.getFieldNames(strCopydefault)) == null) ? -1L : fieldNames3.longValue());
        }
        C5219Jh c5219Jh2 = this.this$0;
        String strCopydefault2 = c5219Jh2.copydefault().fIwbmz().copydefault(Storage.Constants.LAST_EVENT_ID);
        c5219Jh2.KWHzl((strCopydefault2 == null || (fieldNames2 = StringsKt__StringNumberConversionsKt.getFieldNames(strCopydefault2)) == null) ? 0L : fieldNames2.longValue());
        C5219Jh c5219Jh3 = this.this$0;
        String strCopydefault3 = c5219Jh3.copydefault().fIwbmz().copydefault(Storage.Constants.LAST_EVENT_TIME);
        if (strCopydefault3 != null && (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strCopydefault3)) != null) {
            jLongValue = fieldNames.longValue();
        }
        c5219Jh3.EZpvd(jLongValue);
        it = this.this$0.OLrzqt.iterator();
        this.L$0 = it;
        this.label = 2;
        obj = it.hasNext(this);
        channelIterator = it;
        if (obj == objCopydefault) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
