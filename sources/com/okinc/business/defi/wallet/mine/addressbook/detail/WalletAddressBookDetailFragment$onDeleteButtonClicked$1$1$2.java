package com.okinc.business.defi.wallet.mine.addressbook.detail;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13754dXa;
import o.C18713fnb;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes15.dex */
public final class WalletAddressBookDetailFragment$onDeleteButtonClicked$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18713fnb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBookDetailFragment$onDeleteButtonClicked$1$1$2(C18713fnb c18713fnb, Continuation<? super WalletAddressBookDetailFragment$onDeleteButtonClicked$1$1$2> continuation) {
        super(2, continuation);
        this.this$0 = c18713fnb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBookDetailFragment$onDeleteButtonClicked$1$1$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletAddressBookDetailFragment$onDeleteButtonClicked$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletAddressBookDetailViewModel walletAddressBookDetailViewModelGEmmrt = this.this$0.gEmmrt();
            this.label = 1;
            objKWHzl = walletAddressBookDetailViewModelGEmmrt.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        C18713fnb c18713fnb = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            C55326xho.toastWithSuccessfulIcon$default(C13754dXa.FragmentManager.Swccd, 0, 1, (Object) null);
            c18713fnb.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }
        C18713fnb c18713fnb2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(c18713fnb2.getTAG(), "deleteAddressBook error message :" + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
