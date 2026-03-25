package o;

import com.okinc.business.invest_biz.data.bean.InvestChip;
import com.okinc.business.invest_biz.data.usecase.SearchRecommendUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.SearchRecommendUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iGC implements iGA {
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC23589iBz OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC23589iBz KWHzl() {
        return this.OLrzqt;
    }

    @yCM
    public iGC(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC23589iBz;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iGA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.util.List<InvestChip> list, @NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.ArrayList<InvestChip>>> continuation) {
        SearchRecommendUseCaseImpl$invoke$1 searchRecommendUseCaseImpl$invoke$1;
        if (continuation instanceof SearchRecommendUseCaseImpl$invoke$1) {
            searchRecommendUseCaseImpl$invoke$1 = (SearchRecommendUseCaseImpl$invoke$1) continuation;
            int i = searchRecommendUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchRecommendUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchRecommendUseCaseImpl$invoke$1 = new SearchRecommendUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = searchRecommendUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchRecommendUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            SearchRecommendUseCaseImpl$invoke$2 searchRecommendUseCaseImpl$invoke$2 = new SearchRecommendUseCaseImpl$invoke$2(this, str, list, null);
            searchRecommendUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, searchRecommendUseCaseImpl$invoke$2, searchRecommendUseCaseImpl$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
