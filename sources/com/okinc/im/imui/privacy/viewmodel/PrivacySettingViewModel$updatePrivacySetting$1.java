package com.okinc.im.imui.privacy.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35765oCw;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivacySettingViewModel$updatePrivacySetting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isAllow;
    final /* synthetic */ int $settingItem;
    int label;
    final /* synthetic */ PrivacySettingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacySettingViewModel$updatePrivacySetting$1(PrivacySettingViewModel privacySettingViewModel, int i, boolean z, Continuation<? super PrivacySettingViewModel$updatePrivacySetting$1> continuation) {
        super(2, continuation);
        this.this$0 = privacySettingViewModel;
        this.$settingItem = i;
        this.$isAllow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PrivacySettingViewModel$updatePrivacySetting$1(this.this$0, this.$settingItem, this.$isAllow, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PrivacySettingViewModel$updatePrivacySetting$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35765oCw c35765oCw = this.this$0.EZpvd;
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
        PrivacySettingViewModel privacySettingViewModel = this.this$0;
        int i3 = this.$settingItem;
        boolean z2 = this.$isAllow;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            privacySettingViewModel.KWHzl(i3, z2);
        }
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            pUU.copydefault("PrivacySettingViewModel", "updatePrivacySetting returns error");
        }
        return Unit.INSTANCE;
    }
}
