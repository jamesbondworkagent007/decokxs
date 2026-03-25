package o;

import com.okinc.market.search.features.main.recommend.hot.data.po.SearchHotPo;
import com.okinc.market.search.features.main.recommend.hot.data.repository.SearchHotRepository$getMainSearchHotData$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39936qDg {
    public final InterfaceC54577xNn EZpvd;
    public final C39932qDc KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C39936qDg(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull C39932qDc c39932qDc) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c39932qDc, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = interfaceC54577xNn;
        this.KWHzl = c39932qDc;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<SearchHotPo>> continuation) {
        SearchHotRepository$getMainSearchHotData$1 searchHotRepository$getMainSearchHotData$1;
        if (continuation instanceof SearchHotRepository$getMainSearchHotData$1) {
            searchHotRepository$getMainSearchHotData$1 = (SearchHotRepository$getMainSearchHotData$1) continuation;
            int i = searchHotRepository$getMainSearchHotData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchHotRepository$getMainSearchHotData$1.label = i - Integer.MIN_VALUE;
            } else {
                searchHotRepository$getMainSearchHotData$1 = new SearchHotRepository$getMainSearchHotData$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = searchHotRepository$getMainSearchHotData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchHotRepository$getMainSearchHotData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InterfaceC54577xNn interfaceC54577xNn = this.EZpvd;
            if (interfaceC54577xNn != null && interfaceC54577xNn.EZpvd()) {
                return yDY.AhwBna();
            }
            C39932qDc c39932qDc = this.KWHzl;
            searchHotRepository$getMainSearchHotData$1.label = 1;
            objAEQbTJ = c39932qDc.AEQbTJ(searchHotRepository$getMainSearchHotData$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.util.List list = (java.util.List) ((ResponseData) objAEQbTJ).getData();
        return list == null ? yDY.AhwBna() : list;
    }
}
