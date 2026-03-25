package com.okinc.business.defi.wallet.mine.search.ui.view;

import android.graphics.drawable.Drawable;
import com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler;
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
import o.C13754dXa;
import o.C18989fsn;
import o.C19080fuY;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchHistoryFragment$navigateToItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C18989fsn $item;
    int label;
    final /* synthetic */ C19080fuY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchHistoryFragment$navigateToItem$1(C19080fuY c19080fuY, C18989fsn c18989fsn, Continuation<? super WalletSearchHistoryFragment$navigateToItem$1> continuation) {
        super(2, continuation);
        this.this$0 = c19080fuY;
        this.$item = c18989fsn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchHistoryFragment$navigateToItem$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchHistoryFragment$navigateToItem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
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
        C19080fuY c19080fuY = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(c19080fuY.getTAG(), "Failed to fetch main wallet: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (abstractC12782ctV == null) {
            return Unit.INSTANCE;
        }
        Object objAEQbTJ = SearchItemNavigationHandler.EZpvd.AEQbTJ(this.this$0, this.$item.AEQbTJ(), abstractC12782ctV);
        C19080fuY c19080fuY2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl2 != null) {
            pUU.AEQbTJ(c19080fuY2.getTAG(), "Navigation failed: " + thM7380exceptionOrNullimpl2.getMessage(), thM7380exceptionOrNullimpl2);
            if ((thM7380exceptionOrNullimpl2 instanceof SearchItemNavigationHandler.AssetNotFoundException) && c19080fuY2.getContext() != null) {
                C55326xho.toast$default(c19080fuY2.getString(C13754dXa.FragmentManager.addTab), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
