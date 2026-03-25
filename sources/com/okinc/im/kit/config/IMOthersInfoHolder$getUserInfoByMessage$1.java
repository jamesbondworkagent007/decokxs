package com.okinc.im.kit.config;

import com.okinc.im.bean.IMUserInfo;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C35695oAg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class IMOthersInfoHolder$getUserInfoByMessage$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C35695oAg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMOthersInfoHolder$getUserInfoByMessage$1(C35695oAg c35695oAg, Continuation<? super IMOthersInfoHolder$getUserInfoByMessage$1> continuation) {
        super(continuation);
        this.this$0 = c35695oAg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((OKMessage) null, (Continuation<? super IMUserInfo>) this);
    }
}
