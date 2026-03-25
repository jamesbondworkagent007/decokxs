package com.okinc.im.imui.messageV2.view.keyboard;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.messageV2.model.StringResource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C33129mqd;
import o.C36588odm;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class KeyboardViewModel$sendMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ KeyboardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardViewModel$sendMessage$1(KeyboardViewModel keyboardViewModel, Continuation<? super KeyboardViewModel$sendMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = keyboardViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KeyboardViewModel$sendMessage$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeyboardViewModel$sendMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        String string2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CharSequence charSequence = (CharSequence) this.this$0.isConnected.getValue();
            if (charSequence == null || (string2 = charSequence.toString()) == null || (string = StringsKt__StringsKt.hDKMBd((CharSequence) string2).toString()) == null) {
                string = "";
            }
            if (C33129mqd.OLrzqt((CharSequence) string)) {
                GeneralAction.SendMessages sendMessages = new GeneralAction.SendMessages(yDY.copydefault(new SendMessageRequestParam.Text(string, null, 2, null)));
                MutableLiveData mutableLiveData = this.this$0.KWHzl;
                C32989mnw c32989mnw = new C32989mnw(sendMessages);
                this.label = 1;
                if (C36588odm.KWHzl(mutableLiveData, c32989mnw, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        this.this$0.AubY = 0L;
        this.this$0.gEmmrt.setValue(new C32989mnw(new StringResource.Raw(null)));
        return Unit.INSTANCE;
    }
}
