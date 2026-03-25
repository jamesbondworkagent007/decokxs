package com.okinc.auth.impl.passkey.ui.crossdevice.verify;

import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C58415zBn;
import o.InterfaceC58402zBa;
import o.InterfaceC58858zRz;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class PasskeyCrossDeviceVerifyViewModel$startAuthFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PasskeyCrossDeviceVerifyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCrossDeviceVerifyViewModel$startAuthFlow$1(PasskeyCrossDeviceVerifyViewModel passkeyCrossDeviceVerifyViewModel, Continuation<? super PasskeyCrossDeviceVerifyViewModel$startAuthFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyCrossDeviceVerifyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyCrossDeviceVerifyViewModel$startAuthFlow$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyCrossDeviceVerifyViewModel$startAuthFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC58858zRz interfaceC58858zRz = this.this$0.AhwBna;
            PasskeyCrossDeviceVerifyActivity.Input inputCopydefault = this.this$0.copydefault();
            boolean zAEQbTJ = inputCopydefault != null ? inputCopydefault.AEQbTJ() : false;
            PasskeyCrossDeviceVerifyActivity.Input inputCopydefault2 = this.this$0.copydefault();
            String strCopydefault = inputCopydefault2 != null ? inputCopydefault2.copydefault() : null;
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            PasskeyCrossDeviceVerifyActivity.Input inputCopydefault3 = this.this$0.copydefault();
            String strKWHzl = inputCopydefault3 != null ? inputCopydefault3.KWHzl() : null;
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            PasskeyCrossDeviceVerifyActivity.Input inputCopydefault4 = this.this$0.copydefault();
            String strOLrzqt = inputCopydefault4 != null ? inputCopydefault4.OLrzqt() : null;
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            PasskeyCrossDeviceVerifyActivity.Input inputCopydefault5 = this.this$0.copydefault();
            String strEZpvd = inputCopydefault5 != null ? inputCopydefault5.EZpvd() : null;
            String str = strEZpvd == null ? "" : strEZpvd;
            final PasskeyCrossDeviceVerifyViewModel passkeyCrossDeviceVerifyViewModel = this.this$0;
            interfaceC58858zRz.KWHzl(strCopydefault, strKWHzl, strOLrzqt, str, zAEQbTJ, new InterfaceC58402zBa() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyViewModel$startAuthFlow$1.5
                @Override // o.InterfaceC58402zBa
                public void KWHzl(C58415zBn c58415zBn) {
                    Intrinsics.checkNotNullParameter(c58415zBn, "");
                    pUU.KWHzl(PasskeyCrossDeviceVerifyViewModel.copydefault, "response:" + c58415zBn);
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(passkeyCrossDeviceVerifyViewModel), null, null, new PasskeyCrossDeviceVerifyViewModel$startAuthFlow$1$1$onSuccess$1(passkeyCrossDeviceVerifyViewModel, null), 3, null);
                }

                @Override // o.InterfaceC58402zBa
                public void copydefault(String str2) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    pUU.copydefault(PasskeyCrossDeviceVerifyViewModel.copydefault, "error:" + str2);
                    C55326xho.toastWithFailedIcon$default(str2, 0, 1, (Object) null);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
