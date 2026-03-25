package com.okinc.okimcore.extension;

import android.content.Context;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;
import com.okinc.okimcore.model.im.OKFileMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C44164sFr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseAndroidXKt$createSendMessageDetailData$5 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseAndroidXKt$createSendMessageDetailData$5(Continuation<? super InHouseAndroidXKt$createSendMessageDetailData$5> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C44164sFr.OLrzqt((WSSendMessageDetailData) null, (OKFileMessage) null, (InHouseIMUploadMediaService) null, false, (Context) null, (Continuation<? super WSSendMessageDetailData>) this);
    }
}
