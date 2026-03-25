package com.okinc.business.defi.wallet.mine.search.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchType;
import com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C13754dXa;
import o.C18943fru;
import o.C18989fsn;
import o.C19003ftA;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchMainFragment$setupSearchHistory$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C18989fsn $displayItem;
    Object L$0;
    int label;
    final /* synthetic */ C19003ftA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMainFragment$setupSearchHistory$1$1(C19003ftA c19003ftA, C18989fsn c18989fsn, Continuation<? super SearchMainFragment$setupSearchHistory$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c19003ftA;
        this.$displayItem = c18989fsn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchMainFragment$setupSearchHistory$1$1(this.this$0, this.$displayItem, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchMainFragment$setupSearchHistory$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC12782ctV abstractC12782ctV;
        Throwable thM7380exceptionOrNullimpl;
        Context context;
        String string;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC12782ctV = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Object objAEQbTJ = SearchItemNavigationHandler.EZpvd.AEQbTJ(this.this$0, this.$displayItem.AEQbTJ(), abstractC12782ctV);
                C19003ftA c19003ftA = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                if (thM7380exceptionOrNullimpl != null && (thM7380exceptionOrNullimpl instanceof SearchItemNavigationHandler.AssetNotFoundException) && (context = c19003ftA.getContext()) != null && (string = context.getString(C13754dXa.FragmentManager.addTab)) != null) {
                    C55326xho.toast$default(string, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objM7377constructorimpl;
        if (abstractC12782ctV2 == null) {
            return Unit.INSTANCE;
        }
        CoroutineDispatcher io2 = Dispatchers.getIO();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$displayItem, this.this$0, abstractC12782ctV2, null);
        this.L$0 = abstractC12782ctV2;
        this.label = 2;
        if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        abstractC12782ctV = abstractC12782ctV2;
        Object objAEQbTJ2 = SearchItemNavigationHandler.EZpvd.AEQbTJ(this.this$0, this.$displayItem.AEQbTJ(), abstractC12782ctV);
        C19003ftA c19003ftA2 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ2);
        if (thM7380exceptionOrNullimpl != null) {
            C55326xho.toast$default(string, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$setupSearchHistory$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C18989fsn $displayItem;
        final /* synthetic */ AbstractC12782ctV $wallet;
        int label;
        final /* synthetic */ C19003ftA this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18989fsn c18989fsn, C19003ftA c19003ftA, AbstractC12782ctV abstractC12782ctV, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$displayItem = c18989fsn;
            this.this$0 = c19003ftA;
            this.$wallet = abstractC12782ctV;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$displayItem, this.this$0, this.$wallet, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                try {
                    if (this.$displayItem.AEQbTJ().gEmmrt() != SearchType.DAPP) {
                        C18943fru.addSearchHistory$default(C18943fru.StateListAnimator.getInstance$default(C18943fru.Companion, null, 1, null), this.$wallet.DbNXlk(), this.this$0.copydefault(this.$displayItem.AEQbTJ()), null, 4, null);
                    }
                } catch (Exception e) {
                    pUU.AEQbTJ(this.this$0.getTAG(), "Failed to update item timestamp: " + e.getMessage(), e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
