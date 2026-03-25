package com.okinc.business.defi.wallet.home.banner;

import com.okinc.business.defi.biz.net.bean.InfoListNew;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C18026fad;
import o.C18028faf;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class BannerViewModel$fetchBannerInfoList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18028faf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerViewModel$fetchBannerInfoList$1(C18028faf c18028faf, Continuation<? super BannerViewModel$fetchBannerInfoList$1> continuation) {
        super(2, continuation);
        this.this$0 = c18028faf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BannerViewModel$fetchBannerInfoList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BannerViewModel$fetchBannerInfoList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.banner.BannerViewModel$fetchBannerInfoList$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends InfoListNew, ? extends OKServerException>>, Object> {
        int label;
        final /* synthetic */ C18028faf this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18028faf c18028faf, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18028faf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends InfoListNew, ? extends OKServerException>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<InfoListNew, OKServerException>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<InfoListNew, OKServerException>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C18026fad c18026fad = this.this$0.AEQbTJ;
                this.label = 1;
                obj = C18026fad.getBannerData$default(c18026fad, false, this, 1, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcher = this.this$0.OLrzqt;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        C18028faf c18028faf = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            c18028faf.copydefault.setValue((InfoListNew) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        }
        C18028faf c18028faf2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            c18028faf2.copydefault.setValue(new InfoListNew(0, yDY.AhwBna()));
        }
        return Unit.INSTANCE;
    }
}
