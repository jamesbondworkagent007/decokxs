package com.okinc.okmarket.home;

import androidx.viewpager2.adapter.StatefulAdapter;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C27986kKr;
import o.C40440qVy;
import o.C42652raU;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.pWJ;

/* JADX INFO: loaded from: classes10.dex */
public final class CardQuoteFragment$dealPageType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CardQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardQuoteFragment$dealPageType$1(CardQuoteFragment cardQuoteFragment, Continuation<? super CardQuoteFragment$dealPageType$1> continuation) {
        super(2, continuation);
        this.this$0 = cardQuoteFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CardQuoteFragment$dealPageType$1 cardQuoteFragment$dealPageType$1 = new CardQuoteFragment$dealPageType$1(this.this$0, continuation);
        cardQuoteFragment$dealPageType$1.L$0 = obj;
        return cardQuoteFragment$dealPageType$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CardQuoteFragment$dealPageType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x0070 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x0009 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: com.okinc.okmarket.home.CardQuoteFragment */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: com.okinc.okmarket.home.CardQuoteFragment */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: com.okinc.okmarket.home.CardQuoteFragment */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.okinc.okmarket.home.CardQuoteFragment */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: com.okinc.okmarket.home.CardQuoteFragment */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: com.okinc.okmarket.home.CardQuoteFragment */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:34:0x009e, B:37:0x00aa, B:39:0x00ae, B:41:0x00b4, B:43:0x00ba, B:45:0x00be, B:46:0x00c1, B:33:0x0094, B:14:0x002e, B:17:0x003e, B:7:0x0017, B:30:0x0080, B:31:0x008f, B:21:0x0062, B:23:0x006c, B:26:0x0072), top: B:55:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        Throwable thM7380exceptionOrNullimpl;
        CardQuoteFragment cardQuoteFragment;
        int iIntValue;
        C42652raU c42652raU;
        ViewPager2 viewPager2;
        Deferred deferred;
        pWJ pwj;
        Object objCopydefault = C56442yFn.copydefault();
        CardQuoteFragment cardQuoteFragment2 = this.label;
        Integer numAEQbTJ = null;
        try {
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                cardQuoteFragment = cardQuoteFragment2;
            }
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (cardQuoteFragment2 == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CardQuoteFragment cardQuoteFragment3 = this.this$0;
            Result.Application application3 = Result.Companion;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, C40440qVy.Companion.AEQbTJ(), null, new CardQuoteFragment$dealPageType$1$1$pageType$1(null), 2, null);
            this.L$0 = cardQuoteFragment3;
            this.L$1 = deferredAsync$default;
            this.label = 1;
            if (cardQuoteFragment3.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
            cardQuoteFragment2 = cardQuoteFragment3;
            deferred = deferredAsync$default;
        } else {
            if (cardQuoteFragment2 != 1) {
                if (cardQuoteFragment2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pwj = (pWJ) this.L$1;
                CardQuoteFragment cardQuoteFragment4 = (CardQuoteFragment) this.L$0;
                C56391yDq.AEQbTJ(obj);
                cardQuoteFragment2 = cardQuoteFragment4;
                Intrinsics.checkNotNullExpressionValue(obj, "");
                numAEQbTJ = C56443yFo.AEQbTJ(pwj.OLrzqt((String) obj));
                objM7377constructorimpl = Result.m7377constructorimpl(numAEQbTJ);
                cardQuoteFragment = cardQuoteFragment2;
                Integer numAEQbTJ2 = C56443yFo.AEQbTJ(0);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = numAEQbTJ2;
                }
                Integer num = (Integer) objM7377constructorimpl;
                iIntValue = num == null ? num.intValue() : 0;
                c42652raU = cardQuoteFragment.AYXKKw;
                if (c42652raU != null && (viewPager2 = c42652raU.OLrzqt) != null) {
                    viewPager2.setCurrentItem(iIntValue, false);
                }
                cardQuoteFragment.AEQbTJ(iIntValue);
                C27986kKr.AEQbTJ.OLrzqt("start_mode", cardQuoteFragment.KWHzl(iIntValue));
                cardQuoteFragment.djBIcL = true;
                objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
                CardQuoteFragment cardQuoteFragment5 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ(cardQuoteFragment5.getTAG(), "dealPageType error ", thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            Deferred deferred2 = (Deferred) this.L$1;
            CardQuoteFragment cardQuoteFragment6 = (CardQuoteFragment) this.L$0;
            C56391yDq.AEQbTJ(obj);
            deferred = deferred2;
            cardQuoteFragment2 = cardQuoteFragment6;
        }
        Result.Application application4 = Result.Companion;
        StatefulAdapter statefulAdapter = cardQuoteFragment2.valueOf;
        pWJ pwj2 = statefulAdapter instanceof pWJ ? (pWJ) statefulAdapter : null;
        if (pwj2 != null) {
            this.L$0 = cardQuoteFragment2;
            this.L$1 = pwj2;
            this.label = 2;
            obj = deferred.await(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            pwj = pwj2;
            cardQuoteFragment2 = cardQuoteFragment2;
            Intrinsics.checkNotNullExpressionValue(obj, "");
            numAEQbTJ = C56443yFo.AEQbTJ(pwj.OLrzqt((String) obj));
        }
        objM7377constructorimpl = Result.m7377constructorimpl(numAEQbTJ);
        cardQuoteFragment = cardQuoteFragment2;
        Integer numAEQbTJ22 = C56443yFo.AEQbTJ(0);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        Integer num2 = (Integer) objM7377constructorimpl;
        if (num2 == null) {
        }
        c42652raU = cardQuoteFragment.AYXKKw;
        if (c42652raU != null) {
            viewPager2.setCurrentItem(iIntValue, false);
        }
        cardQuoteFragment.AEQbTJ(iIntValue);
        C27986kKr.AEQbTJ.OLrzqt("start_mode", cardQuoteFragment.KWHzl(iIntValue));
        cardQuoteFragment.djBIcL = true;
        objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
        CardQuoteFragment cardQuoteFragment52 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
