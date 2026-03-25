package com.okinc.business.defi.wallet.imported;

import com.okinc.business.defi.wallet.imported.DefiWalletImportUIHelper$startImportWallet$1$onActivityCreated$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C14494dmX;
import o.C32866mlf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiWalletImportUIHelper$startImportWallet$1$onActivityCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiWalletImportUIHelper$startImportWallet$1$onActivityCreated$1(Continuation<? super DefiWalletImportUIHelper$startImportWallet$1$onActivityCreated$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletImportUIHelper$startImportWallet$1$onActivityCreated$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletImportUIHelper$startImportWallet$1$onActivityCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C14494dmX c14494dmX = C14494dmX.KWHzl;
            this.label = 1;
            obj = c14494dmX.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        final String str = (String) obj;
        if (str == null) {
            return Unit.INSTANCE;
        }
        C32866mlf.onEvent$default("Web3Onboarding_ImportWalletConfirm_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.fhv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return DefiWalletImportUIHelper$startImportWallet$1$onActivityCreated$1.invokeSuspend$lambda$0(str, (EventParamsList) obj2);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, EventParamsList eventParamsList) {
        eventParamsList.add(new EventParam("already_have_wallet", str, true));
        eventParamsList.add(new EventParam("source", Web3SecurityTrackEvent.VALUE_IMPORT, true));
        return Unit.INSTANCE;
    }
}
