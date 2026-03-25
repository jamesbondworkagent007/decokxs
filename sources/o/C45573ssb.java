package o;

import androidx.lifecycle.ViewModel;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.feedback.FeedbackAndBugBountyViewModel$mListLiveData$1$asyncLoad$1$1$1;
import com.okinc.okex.feedback.net.bean.FeedbackBountySummaryBean;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.AbstractC43419rot;
import o.C45573ssb;

/* JADX INFO: renamed from: o.ssb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45573ssb extends ViewModel {
    public final Application copydefault = new Application();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC32952mnL<FeedbackBountySummaryBean> EZpvd() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.ssb$Application */
    public static final class Application extends AbstractC32952mnL<FeedbackBountySummaryBean> {
        @Override // o.AbstractC32952mnL
        public InterfaceC58217yxC EZpvd(long j) {
            AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.ssc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return C45573ssb.Application.copydefault(this.EZpvd);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return C33024moe.subscribeStatefulResult$default(C33024moe.KWHzl(abstractC58185ywXAEQbTJ), this, null, null, 6, null);
        }

        public static final FeedbackBountySummaryBean copydefault(Application application) {
            AbstractC43419rot actionBar;
            try {
                ResponseData responseData = (ResponseData) BuildersKt__BuildersKt.runBlocking$default(null, new FeedbackAndBugBountyViewModel$mListLiveData$1$asyncLoad$1$1$1(null), 1, null);
                if (responseData.getCode() == 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            return (FeedbackBountySummaryBean) actionBar.AEQbTJ();
        }
    }
}
