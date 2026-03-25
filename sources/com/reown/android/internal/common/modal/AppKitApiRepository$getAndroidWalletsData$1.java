package com.reown.android.internal.common.modal;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class AppKitApiRepository$getAndroidWalletsData$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppKitApiRepository this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppKitApiRepository$getAndroidWalletsData$1(AppKitApiRepository appKitApiRepository, Continuation<? super AppKitApiRepository$getAndroidWalletsData$1> continuation) {
        super(continuation);
        this.this$0 = appKitApiRepository;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7207getAndroidWalletsDatagIAlus = this.this$0.m7207getAndroidWalletsDatagIAlus(null, this);
        return objM7207getAndroidWalletsDatagIAlus == C56442yFn.copydefault() ? objM7207getAndroidWalletsDatagIAlus : Result.m7376boximpl(objM7207getAndroidWalletsDatagIAlus);
    }
}
