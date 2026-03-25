package com.okinc.core.ok_app.modeswitch.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C33453mwj;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class AppSubModeUseCase$1 extends FunctionReferenceImpl implements Function2<Integer, Continuation<? super Unit>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AppSubModeUseCase$1(Object obj) {
        super(2, obj, C33453mwj.class, "onAppModeChange", "onAppModeChange(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((C33453mwj) this.receiver).OLrzqt(i, continuation);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }
}
