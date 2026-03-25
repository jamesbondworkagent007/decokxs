package o;

import com.okinc.business.invest_biz.ui.widget.risk.InvestRiskRatingFetcher$getRiskRating$1;
import com.okinc.business.invest_biz.ui.widget.risk.InvestRiskRatingModel;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27441jvJ {
    public static final C27441jvJ EZpvd = new C27441jvJ();
    public static final java.util.ArrayList<InvestRiskRatingModel> KWHzl = new java.util.ArrayList<>();
    public static final int copydefault = 8;

    private C27441jvJ() {
    }

    public final void AEQbTJ(java.util.ArrayList<InvestRiskRatingModel> arrayList) {
        java.util.ArrayList<InvestRiskRatingModel> arrayList2 = KWHzl;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<? extends java.util.ArrayList<InvestRiskRatingModel>>> continuation) {
        InvestRiskRatingFetcher$getRiskRating$1 investRiskRatingFetcher$getRiskRating$1;
        if (continuation instanceof InvestRiskRatingFetcher$getRiskRating$1) {
            investRiskRatingFetcher$getRiskRating$1 = (InvestRiskRatingFetcher$getRiskRating$1) continuation;
            int i = investRiskRatingFetcher$getRiskRating$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investRiskRatingFetcher$getRiskRating$1.label = i - Integer.MIN_VALUE;
            } else {
                investRiskRatingFetcher$getRiskRating$1 = new InvestRiskRatingFetcher$getRiskRating$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = investRiskRatingFetcher$getRiskRating$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = investRiskRatingFetcher$getRiskRating$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                Result.Application application = Result.Companion;
                C25592izd c25592izd = C25592izd.OLrzqt;
                investRiskRatingFetcher$getRiskRating$1.label = 1;
                objCopydefault = c25592izd.copydefault(investRiskRatingFetcher$getRiskRating$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            java.lang.Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objCopydefault, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default);
            java.util.ArrayList<InvestRiskRatingModel> arrayList = (java.util.ArrayList) ((java.util.List) objUnwrapResponseData$default);
            EZpvd.AEQbTJ(arrayList);
            return Result.m7377constructorimpl(arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
