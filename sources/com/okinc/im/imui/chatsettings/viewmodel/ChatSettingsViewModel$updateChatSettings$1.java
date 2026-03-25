package com.okinc.im.imui.chatsettings.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C32989mnw;
import o.C35765oCw;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatSettingsViewModel$updateChatSettings$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isAllow;
    final /* synthetic */ int $settingItem;
    int label;
    final /* synthetic */ ChatSettingsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSettingsViewModel$updateChatSettings$1(ChatSettingsViewModel chatSettingsViewModel, int i, boolean z, Continuation<? super ChatSettingsViewModel$updateChatSettings$1> continuation) {
        super(2, continuation);
        this.this$0 = chatSettingsViewModel;
        this.$settingItem = i;
        this.$isAllow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatSettingsViewModel$updateChatSettings$1(this.this$0, this.$settingItem, this.$isAllow, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatSettingsViewModel$updateChatSettings$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35765oCw c35765oCw = this.this$0.DbNXlk;
            int i2 = this.$settingItem;
            boolean z = this.$isAllow;
            this.label = 1;
            objAEQbTJ = c35765oCw.AEQbTJ(i2, z, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        ChatSettingsViewModel chatSettingsViewModel = this.this$0;
        int i3 = this.$settingItem;
        boolean z2 = this.$isAllow;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            chatSettingsViewModel.OLrzqt(i3, z2);
        }
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            pUU.copydefault("ChatSettingsViewModel", "updateChatSettings returns error");
            chatSettingsViewModel.valueOf.setValue(new C32989mnw(chatSettingsViewModel.AEQbTJ.getValue()));
            MutableStateFlow mutableStateFlow = chatSettingsViewModel.djBIcL;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, new C32989mnw(Unit.INSTANCE)));
        }
        return Unit.INSTANCE;
    }
}
