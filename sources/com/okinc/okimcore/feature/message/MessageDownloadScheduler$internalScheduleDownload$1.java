package com.okinc.okimcore.feature.message;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.sJY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageDownloadScheduler$internalScheduleDownload$1 extends ContinuationImpl {
    public long J$0;
    public long J$1;
    public long J$2;
    public long J$3;
    public long J$4;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ sJY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageDownloadScheduler$internalScheduleDownload$1(sJY sjy, Continuation<? super MessageDownloadScheduler$internalScheduleDownload$1> continuation) {
        super(continuation);
        this.this$0 = sjy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(null, 0L, 0L, 0L, 0L, false, 0L, this);
    }
}
