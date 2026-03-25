package com.okinc.business.defi.wallet.imported;

import com.okinc.web3.security.model.ButtonEvent;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C14494dmX;
import o.C14557dnh;
import o.C14562dnm;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC14563dnn;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiWalletImportUIHelper$startImportWallet$1$onButtonEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC14563dnn $analyticsKit;
    final /* synthetic */ ButtonEvent $event;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletImportUIHelper$startImportWallet$1$onButtonEvent$1(ButtonEvent buttonEvent, InterfaceC14563dnn interfaceC14563dnn, Continuation<? super DefiWalletImportUIHelper$startImportWallet$1$onButtonEvent$1> continuation) {
        super(2, continuation);
        this.$event = buttonEvent;
        this.$analyticsKit = interfaceC14563dnn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletImportUIHelper$startImportWallet$1$onButtonEvent$1(this.$event, this.$analyticsKit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletImportUIHelper$startImportWallet$1$onButtonEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (Intrinsics.EZpvd((Object) this.$event.getButtonName(), (Object) Web3SecurityTrackEvent.VALUE_CONFIRM) && this.$event.getImportType() != null) {
                C14557dnh.Application application = C14557dnh.Application.KWHzl;
                String importType = this.$event.getImportType();
                Intrinsics.copydefault((Object) importType);
                this.$analyticsKit.KWHzl(C14562dnm.AEQbTJ(application, "import_type", importType));
            }
            C14494dmX c14494dmX = C14494dmX.KWHzl;
            String buttonName = this.$event.getButtonName();
            String importType2 = this.$event.getImportType();
            String importSource = this.$event.getImportSource();
            this.label = 1;
            if (c14494dmX.KWHzl(buttonName, importType2, importSource, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
