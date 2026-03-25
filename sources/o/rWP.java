package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils.CacheApiLoaderKt$collectCacheThenNetwork$2$emit$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import o.rWO;

/* JADX INFO: loaded from: classes23.dex */
public final class rWP {

    public static final class StateListAnimator<T> implements FlowCollector {
        public final /* synthetic */ Ref.BooleanRef EZpvd;
        public final /* synthetic */ yHO<AbstractC43419rot<? extends T, OKServerException>, java.lang.Boolean, Continuation<? super Unit>, java.lang.Object> KWHzl;
        public final /* synthetic */ Function2<T, Continuation<? super Unit>, java.lang.Object> OLrzqt;

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(rWO<? extends T> rwo, Continuation<? super Unit> continuation) throws java.lang.Throwable {
            CacheApiLoaderKt$collectCacheThenNetwork$2$emit$1 cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1;
            StateListAnimator<T> stateListAnimator;
            if (continuation instanceof CacheApiLoaderKt$collectCacheThenNetwork$2$emit$1) {
                cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1 = (CacheApiLoaderKt$collectCacheThenNetwork$2$emit$1) continuation;
                int i = cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1 = new CacheApiLoaderKt$collectCacheThenNetwork$2$emit$1(this, continuation);
                }
            }
            java.lang.Object obj = cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                rwo = (rWO) cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1.L$1;
                stateListAnimator = (StateListAnimator) cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1.L$0;
                C56391yDq.AEQbTJ(obj);
                if (((rWO.Activity) rwo).copydefault() != null) {
                    stateListAnimator.EZpvd.element = true;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            if (rwo instanceof rWO.Activity) {
                Function2<T, Continuation<? super Unit>, java.lang.Object> function2 = this.OLrzqt;
                java.lang.Object objCopydefault2 = ((rWO.Activity) rwo).copydefault();
                cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1.L$0 = this;
                cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1.L$1 = rwo;
                cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1.label = 1;
                if (function2.invoke((T) objCopydefault2, cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1) == objCopydefault) {
                    return objCopydefault;
                }
                stateListAnimator = this;
                if (((rWO.Activity) rwo).copydefault() != null) {
                }
                return Unit.INSTANCE;
            }
            if (!(rwo instanceof rWO.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            yHO<AbstractC43419rot<? extends T, OKServerException>, java.lang.Boolean, Continuation<? super Unit>, java.lang.Object> yho = this.KWHzl;
            AbstractC43419rot<? extends T, OKServerException> abstractC43419rotAEQbTJ = ((rWO.StateListAnimator) rwo).AEQbTJ();
            java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(this.EZpvd.element);
            cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1.label = 2;
            if (yho.invoke(abstractC43419rotAEQbTJ, boolKWHzl, cacheApiLoaderKt$collectCacheThenNetwork$2$emit$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }
}
