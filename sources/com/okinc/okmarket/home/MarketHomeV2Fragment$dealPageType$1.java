package com.okinc.okmarket.home;

import androidx.viewpager2.adapter.StatefulAdapter;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C27986kKr;
import o.C40440qVy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pWJ;
import o.qZO;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2Fragment$dealPageType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MarketHomeV2Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2Fragment$dealPageType$1(MarketHomeV2Fragment marketHomeV2Fragment, Continuation<? super MarketHomeV2Fragment$dealPageType$1> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeV2Fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2Fragment$dealPageType$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2Fragment$dealPageType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketHomeV2Fragment marketHomeV2Fragment = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(marketHomeV2Fragment, null);
            this.label = 1;
            if (marketHomeV2Fragment.KWHzl((Function1<? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.okmarket.home.MarketHomeV2Fragment$dealPageType$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ MarketHomeV2Fragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MarketHomeV2Fragment marketHomeV2Fragment, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = marketHomeV2Fragment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            ViewPager2 viewPager2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            Integer numAEQbTJ = null;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = C40440qVy.Companion.AEQbTJ();
                MarketHomeV2Fragment$dealPageType$1$1$pageType$1 marketHomeV2Fragment$dealPageType$1$1$pageType$1 = new MarketHomeV2Fragment$dealPageType$1$1$pageType$1(null);
                this.label = 1;
                obj = BuildersKt.withContext(coroutineDispatcherAEQbTJ, marketHomeV2Fragment$dealPageType$1$1$pageType$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            String str = (String) obj;
            MarketHomeV2Fragment marketHomeV2Fragment = this.this$0;
            try {
                Result.Application application = Result.Companion;
                StatefulAdapter statefulAdapter = marketHomeV2Fragment.isConnected;
                pWJ pwj = statefulAdapter instanceof pWJ ? (pWJ) statefulAdapter : null;
                if (pwj != null) {
                    Intrinsics.copydefault((Object) str);
                    numAEQbTJ = C56443yFo.AEQbTJ(pwj.OLrzqt(str));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(numAEQbTJ);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Integer numAEQbTJ2 = C56443yFo.AEQbTJ(0);
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = numAEQbTJ2;
            }
            Integer num = (Integer) objM7377constructorimpl;
            int iIntValue = num != null ? num.intValue() : 0;
            qZO qzo = this.this$0.fetchVPNInfo;
            if (qzo != null && (viewPager2 = qzo.valueOf) != null) {
                viewPager2.setCurrentItem(iIntValue, false);
            }
            C27986kKr.AEQbTJ.OLrzqt("start_mode", this.this$0.EZpvd(iIntValue));
            this.this$0.fARcdN = true;
            return Unit.INSTANCE;
        }
    }
}
