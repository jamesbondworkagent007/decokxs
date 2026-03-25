package com.okinc.business.defi.wallet.mine.search.ui.view;

import com.okinc.business.defi.wallet.mine.search.data.model.SearchType;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C18943fru;
import o.C18989fsn;
import o.C19152fvr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchHistoryPageFragment$onItemClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<C18989fsn, InterfaceC9738bbJ, Unit> $callback;
    final /* synthetic */ C18989fsn $item;
    int label;
    final /* synthetic */ C19152fvr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super o.fsn, ? super o.bbJ, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletSearchHistoryPageFragment$onItemClicked$1(C19152fvr c19152fvr, C18989fsn c18989fsn, Function2<? super C18989fsn, ? super InterfaceC9738bbJ, Unit> function2, Continuation<? super WalletSearchHistoryPageFragment$onItemClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = c19152fvr;
        this.$item = c18989fsn;
        this.$callback = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchHistoryPageFragment$onItemClicked$1(this.this$0, this.$item, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchHistoryPageFragment$onItemClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC12782ctV abstractC12782ctV;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Result.Application application = Result.Companion;
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(true);
                    this.label = 1;
                    obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            C19152fvr c19152fvr = this.this$0;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ(c19152fvr.getTAG(), "Failed to fetch main wallet: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl;
        } catch (Exception e2) {
            pUU.AEQbTJ(this.this$0.getTAG(), "Error handling item click: " + e2.getMessage(), e2);
        }
        if (abstractC12782ctV == null) {
            pUU.valueOf(this.this$0.getTAG(), "Cannot navigate: wallet is null");
            return Unit.INSTANCE;
        }
        if (this.$item.AEQbTJ().gEmmrt() != SearchType.DAPP) {
            C18943fru.addSearchHistory$default(C18943fru.StateListAnimator.getInstance$default(C18943fru.Companion, null, 1, null), abstractC12782ctV.DbNXlk(), this.this$0.copydefault(this.$item.AEQbTJ()), null, 4, null);
        }
        this.$callback.invoke(this.$item, abstractC12782ctV);
        return Unit.INSTANCE;
    }
}
