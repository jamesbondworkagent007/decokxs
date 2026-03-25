package com.amplitude.core.platform;

import com.amplitude.core.Storage;
import java.io.FileNotFoundException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import o.C5255Kr;
import o.C56391yDq;
import o.C56442yFn;
import o.KY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EventPipeline$upload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C5255Kr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventPipeline$upload$1(C5255Kr c5255Kr, Continuation<? super EventPipeline$upload$1> continuation) {
        super(2, continuation);
        this.this$0 = c5255Kr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new EventPipeline$upload$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EventPipeline$upload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:33:0x00a8) to fix multi-entry loop: BACK_EDGE: B:33:0x00a8 -> B:34:0x00b7 */
    /* JADX DEBUG: Duplicate block (B:50:0x010b) to fix multi-entry loop: BACK_EDGE: B:50:0x010b -> B:45:0x0102 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:8:0x0024, B:41:0x00de, B:34:0x00b7, B:24:0x0068, B:28:0x007e, B:30:0x0086, B:33:0x00a8, B:36:0x00bd, B:37:0x00c1, B:50:0x010b, B:53:0x011d, B:55:0x0123, B:44:0x00e7, B:17:0x0044, B:20:0x0055, B:23:0x0064), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[Catch: all -> 0x0105, TRY_LEAVE, TryCatch #0 {all -> 0x0105, blocks: (B:8:0x0024, B:41:0x00de, B:34:0x00b7, B:24:0x0068, B:28:0x007e, B:30:0x0086, B:33:0x00a8, B:36:0x00bd, B:37:0x00c1, B:50:0x010b, B:53:0x011d, B:55:0x0123, B:44:0x00e7, B:17:0x0044, B:20:0x0055, B:23:0x0064), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7 A[Catch: Exception -> 0x0029, FileNotFoundException -> 0x002c, all -> 0x0105, TRY_LEAVE, TryCatch #0 {all -> 0x0105, blocks: (B:8:0x0024, B:41:0x00de, B:34:0x00b7, B:24:0x0068, B:28:0x007e, B:30:0x0086, B:33:0x00a8, B:36:0x00bd, B:37:0x00c1, B:50:0x010b, B:53:0x011d, B:55:0x0123, B:44:0x00e7, B:17:0x0044, B:20:0x0055, B:23:0x0064), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123 A[Catch: all -> 0x0105, TRY_LEAVE, TryCatch #0 {all -> 0x0105, blocks: (B:8:0x0024, B:41:0x00de, B:34:0x00b7, B:24:0x0068, B:28:0x007e, B:30:0x0086, B:33:0x00a8, B:36:0x00bd, B:37:0x00c1, B:50:0x010b, B:53:0x011d, B:55:0x0123, B:44:0x00e7, B:17:0x0044, B:20:0x0055, B:23:0x0064), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d8 -> B:41:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0121 -> B:45:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0123 -> B:45:0x0102). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ReceiveChannel receiveChannel;
        C5255Kr c5255Kr;
        ChannelIterator it;
        Iterator<Object> it2;
        String message;
        C5255Kr c5255Kr2;
        Object objHasNext;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                receiveChannel = this.this$0.AkhnZx;
                c5255Kr = this.this$0;
                it = receiveChannel.iterator();
                this.L$0 = c5255Kr;
                this.L$1 = receiveChannel;
                this.L$2 = it;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext == objCopydefault) {
                }
            } else if (i == 1) {
                it = (ChannelIterator) this.L$2;
                receiveChannel = (ReceiveChannel) this.L$1;
                c5255Kr2 = (C5255Kr) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i == 2) {
                it = (ChannelIterator) this.L$2;
                receiveChannel = (ReceiveChannel) this.L$1;
                C5255Kr c5255Kr3 = (C5255Kr) this.L$0;
                C56391yDq.AEQbTJ(obj);
                it2 = c5255Kr3.valueOf().OLrzqt().iterator();
                c5255Kr = c5255Kr3;
                if (it2.hasNext()) {
                }
                this.L$0 = c5255Kr;
                this.L$1 = receiveChannel;
                this.L$2 = it;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext == objCopydefault) {
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$4;
                it2 = (Iterator) this.L$3;
                ChannelIterator channelIterator = (ChannelIterator) this.L$2;
                receiveChannel = (ReceiveChannel) this.L$1;
                C5255Kr c5255Kr4 = (C5255Kr) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (FileNotFoundException e) {
                    e = e;
                    message = e.getMessage();
                    if (message != null) {
                        c5255Kr4.EZpvd.DbNXlk().KWHzl("Event storage file not found: " + message);
                    }
                    it = channelIterator;
                    c5255Kr = c5255Kr4;
                    if (it2.hasNext()) {
                    }
                    this.L$0 = c5255Kr;
                    this.L$1 = receiveChannel;
                    this.L$2 = it;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == objCopydefault) {
                    }
                } catch (Exception e2) {
                    KY.EZpvd(e2, c5255Kr4.EZpvd.DbNXlk(), "Error when uploading event");
                    it = channelIterator;
                    c5255Kr = c5255Kr4;
                    if (it2.hasNext()) {
                    }
                    this.L$0 = c5255Kr;
                    this.L$1 = receiveChannel;
                    this.L$2 = it;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == objCopydefault) {
                    }
                }
                String str = (String) obj;
                if (str.length() == 0) {
                    c5255Kr4.AhwBna().AEQbTJ(c5255Kr4.gEmmrt.upload(str, c5255Kr4.EZpvd.values().EZpvd()), obj2, str);
                }
                it = channelIterator;
                c5255Kr = c5255Kr4;
                if (it2.hasNext()) {
                    Object next = it2.next();
                    try {
                    } catch (FileNotFoundException e3) {
                        c5255Kr4 = c5255Kr;
                        e = e3;
                        channelIterator = it;
                        message = e.getMessage();
                        if (message != null) {
                        }
                        it = channelIterator;
                        c5255Kr = c5255Kr4;
                        if (it2.hasNext()) {
                        }
                        this.L$0 = c5255Kr;
                        this.L$1 = receiveChannel;
                        this.L$2 = it;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 1;
                        objHasNext = it.hasNext(this);
                        if (objHasNext == objCopydefault) {
                        }
                    } catch (Exception e4) {
                        c5255Kr4 = c5255Kr;
                        channelIterator = it;
                        KY.EZpvd(e4, c5255Kr4.EZpvd.DbNXlk(), "Error when uploading event");
                    }
                    Storage storageValueOf = c5255Kr.valueOf();
                    this.L$0 = c5255Kr;
                    this.L$1 = receiveChannel;
                    this.L$2 = it;
                    this.L$3 = it2;
                    this.L$4 = next;
                    this.label = 3;
                    Object objEZpvd = storageValueOf.EZpvd(next, this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    c5255Kr4 = c5255Kr;
                    obj = objEZpvd;
                    channelIterator = it;
                    obj2 = next;
                    String str2 = (String) obj;
                    if (str2.length() == 0) {
                    }
                    it = channelIterator;
                    c5255Kr = c5255Kr4;
                    if (it2.hasNext()) {
                    }
                }
                this.L$0 = c5255Kr;
                this.L$1 = receiveChannel;
                this.L$2 = it;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext == objCopydefault) {
                    return objCopydefault;
                }
                c5255Kr2 = c5255Kr;
                obj = objHasNext;
                if (!((Boolean) obj).booleanValue()) {
                    CoroutineDispatcher coroutineDispatcherFJNWhG = c5255Kr2.EZpvd.fJNWhG();
                    EventPipeline$upload$1$1$1 eventPipeline$upload$1$1$1 = new EventPipeline$upload$1$1$1(c5255Kr2, null);
                    this.L$0 = c5255Kr2;
                    this.L$1 = receiveChannel;
                    this.L$2 = it;
                    this.label = 2;
                    if (BuildersKt.withContext(coroutineDispatcherFJNWhG, eventPipeline$upload$1$1$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    C5255Kr c5255Kr5 = c5255Kr2;
                    it2 = c5255Kr2.valueOf().OLrzqt().iterator();
                    c5255Kr = c5255Kr5;
                    if (it2.hasNext()) {
                    }
                    this.L$0 = c5255Kr;
                    this.L$1 = receiveChannel;
                    this.L$2 = it;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == objCopydefault) {
                    }
                } else {
                    ChannelsKt.cancelConsumed(receiveChannel, null);
                    return Unit.INSTANCE;
                }
            }
        } finally {
        }
    }
}
