package com.okinc.kline.features.kline.bottom.marketevents.viewmodel;

import androidx.lifecycle.ViewModel;
import com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventExplainViewModel;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o.C32266mVq;
import o.C43417ror;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC32162mRu;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventExplainViewModel extends ViewModel {
    @yCM
    public MarketEventExplainViewModel() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull List<Long> list, @NotNull Continuation<? super List<C32266mVq>> continuation) throws Throwable {
        MarketEventExplainViewModel$queryAuthorListUrls$1 marketEventExplainViewModel$queryAuthorListUrls$1;
        if (continuation instanceof MarketEventExplainViewModel$queryAuthorListUrls$1) {
            marketEventExplainViewModel$queryAuthorListUrls$1 = (MarketEventExplainViewModel$queryAuthorListUrls$1) continuation;
            int i = marketEventExplainViewModel$queryAuthorListUrls$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketEventExplainViewModel$queryAuthorListUrls$1.label = i - Integer.MIN_VALUE;
            } else {
                marketEventExplainViewModel$queryAuthorListUrls$1 = new MarketEventExplainViewModel$queryAuthorListUrls$1(this, continuation);
            }
        }
        Object objAEQbTJ = marketEventExplainViewModel$queryAuthorListUrls$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketEventExplainViewModel$queryAuthorListUrls$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InterfaceC32162mRu interfaceC32162mRu = (InterfaceC32162mRu) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC32162mRu.class));
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: o.oRg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketEventExplainViewModel.KWHzl(((java.lang.Long) obj).longValue());
                }
            }, 30, null);
            marketEventExplainViewModel$queryAuthorListUrls$1.label = 1;
            objAEQbTJ = interfaceC32162mRu.AEQbTJ(strJoinToString$default, marketEventExplainViewModel$queryAuthorListUrls$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return ((ResponseData) objAEQbTJ).getData();
    }

    public static final CharSequence KWHzl(long j) {
        return String.valueOf(j);
    }
}
