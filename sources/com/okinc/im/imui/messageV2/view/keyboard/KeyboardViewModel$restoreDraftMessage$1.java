package com.okinc.im.imui.messageV2.view.keyboard;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.imui.messageV2.model.StringResource;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C36588odm;
import o.C56391yDq;
import o.C56442yFn;
import o.oCP;

/* JADX INFO: loaded from: classes8.dex */
public final class KeyboardViewModel$restoreDraftMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KeyboardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardViewModel$restoreDraftMessage$1(String str, KeyboardViewModel keyboardViewModel, Continuation<? super KeyboardViewModel$restoreDraftMessage$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = keyboardViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KeyboardViewModel$restoreDraftMessage$1 keyboardViewModel$restoreDraftMessage$1 = new KeyboardViewModel$restoreDraftMessage$1(this.$channelId, this.this$0, continuation);
        keyboardViewModel$restoreDraftMessage$1.L$0 = obj;
        return keyboardViewModel$restoreDraftMessage$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeyboardViewModel$restoreDraftMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        MutableLiveData mutableLiveData;
        C32989mnw c32989mnw;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$channelId;
            if (str != null && !StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                KeyboardViewModel keyboardViewModel = this.this$0;
                String str2 = this.$channelId;
                Result.Application application2 = Result.Companion;
                oCP ocp = keyboardViewModel.hDKMBd;
                this.label = 1;
                obj = ocp.copydefault(str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            mutableLiveData = this.this$0.AYXKKw;
            c32989mnw = new C32989mnw(Unit.INSTANCE);
            this.label = 2;
            if (C36588odm.KWHzl(mutableLiveData, c32989mnw, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        objM7377constructorimpl = Result.m7377constructorimpl((String) obj);
        KeyboardViewModel keyboardViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            keyboardViewModel2.gEmmrt.setValue(new C32989mnw(new StringResource.Raw((String) objM7377constructorimpl)));
        }
        mutableLiveData = this.this$0.AYXKKw;
        c32989mnw = new C32989mnw(Unit.INSTANCE);
        this.label = 2;
        if (C36588odm.KWHzl(mutableLiveData, c32989mnw, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
