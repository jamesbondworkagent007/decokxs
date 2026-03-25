package o;

import com.okinc.market.search.features.main.entry.data.po.SearchRecommendPo;
import com.okinc.market.search.features.main.entry.domain.usercase.SearchRecommendUseCase$onExecute$1;
import com.okinc.market.search.features.main.entry.ui.model.SearchRecommendVo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qBR extends AbstractC49400uno<java.lang.String, java.util.List<? extends SearchRecommendVo>> {
    public final CoroutineDispatcher OLrzqt;
    public final qBO copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public qBR(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qBO qbo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qbo, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = qbo;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(java.lang.String str, @NotNull Continuation<? super java.util.List<SearchRecommendVo>> continuation) throws java.lang.Throwable {
        SearchRecommendUseCase$onExecute$1 searchRecommendUseCase$onExecute$1;
        if (continuation instanceof SearchRecommendUseCase$onExecute$1) {
            searchRecommendUseCase$onExecute$1 = (SearchRecommendUseCase$onExecute$1) continuation;
            int i = searchRecommendUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchRecommendUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                searchRecommendUseCase$onExecute$1 = new SearchRecommendUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = searchRecommendUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = searchRecommendUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            qBO qbo = this.copydefault;
            searchRecommendUseCase$onExecute$1.label = 1;
            objCopydefault = qbo.copydefault(str, searchRecommendUseCase$onExecute$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.List<SearchRecommendPo> list = (java.util.List) objCopydefault;
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (SearchRecommendPo searchRecommendPo : list) {
            arrayList.add(new SearchRecommendVo(searchRecommendPo.getCopywriting(), searchRecommendPo.getInstId(), searchRecommendPo.getInstType(), searchRecommendPo.getType(), searchRecommendPo.getCcy(), C56443yFo.AEQbTJ(qZH.Activity.AwvSrB), null, 64, null));
        }
        return arrayList;
    }
}
