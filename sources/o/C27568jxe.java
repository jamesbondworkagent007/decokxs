package o;

import com.okinc.business.invest_biz.data.bean.AllGasFeeVo;
import com.okinc.business.invest_biz.data.bean.ClaimableBalanceVO;
import com.okinc.business.invest_biz.data.bean.InsufficientReward;
import com.okinc.business.invest_biz.data.bean.InvestGasFeeReminderInfo;
import com.okinc.business.invest_biz.data.bean.InvestGetGasFeeRequest;
import com.okinc.business.invest_biz.data.bean.InvestGetGasFeeResponse;
import com.okinc.business.invest_biz.utils.InvestProcessUtil$checkAndShowClaimGasFeeReminder$2$1;
import com.okinc.business.invest_biz.utils.InvestProcessUtil$checkAndShowWeb3ClaimGasFeeReminder$2$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import o.iTM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27568jxe {
    public static final C27568jxe EZpvd = new C27568jxe();

    private C27568jxe() {
    }

    public final void OLrzqt(InvestGetGasFeeResponse investGetGasFeeResponse, @NotNull java.lang.String str, @NotNull CancellableContinuation<? super java.lang.Boolean> cancellableContinuation, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        java.lang.Object objM7377constructorimpl;
        AllGasFeeVo allGasFeeVoKWHzl;
        AllGasFeeVo allGasFeeVoKWHzl2;
        ClaimableBalanceVO claimableBalanceVOOLrzqt;
        java.util.List<InsufficientReward> listKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cancellableContinuation, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        InsufficientReward insufficientReward = (investGetGasFeeResponse == null || (claimableBalanceVOOLrzqt = investGetGasFeeResponse.OLrzqt()) == null || (listKWHzl = claimableBalanceVOOLrzqt.KWHzl()) == null) ? null : (InsufficientReward) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl);
        if (!C33129mqd.AEQbTJ((investGetGasFeeResponse == null || (allGasFeeVoKWHzl2 = investGetGasFeeResponse.KWHzl()) == null) ? null : allGasFeeVoKWHzl2.OLrzqt(), str)) {
            if (!C33129mqd.gEmmrt(insufficientReward != null ? insufficientReward.AEQbTJ() : null, insufficientReward != null ? insufficientReward.KWHzl() : null)) {
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.TRUE));
                return;
            }
        }
        iTM.Activity activity = iTM.Companion;
        java.lang.String strOLrzqt = (investGetGasFeeResponse == null || (allGasFeeVoKWHzl = investGetGasFeeResponse.KWHzl()) == null) ? null : allGasFeeVoKWHzl.OLrzqt();
        java.lang.String str2 = strOLrzqt == null ? "" : strOLrzqt;
        java.lang.String strAEQbTJ = insufficientReward != null ? insufficientReward.AEQbTJ() : null;
        java.lang.String str3 = strAEQbTJ == null ? "" : strAEQbTJ;
        java.lang.String strOLrzqt2 = insufficientReward != null ? insufficientReward.OLrzqt() : null;
        java.lang.String str4 = strOLrzqt2 == null ? "" : strOLrzqt2;
        java.lang.String strCopydefault = insufficientReward != null ? insufficientReward.copydefault() : null;
        java.lang.String str5 = strCopydefault == null ? "" : strCopydefault;
        java.lang.String strKWHzl = insufficientReward != null ? insufficientReward.KWHzl() : null;
        iTM itmAEQbTJ = activity.AEQbTJ(new InvestGasFeeReminderInfo(str2, str, str3, str4, str5, strKWHzl == null ? "" : strKWHzl));
        itmAEQbTJ.KWHzl(new TaskDescription(cancellableContinuation));
        try {
            Result.Application application2 = Result.Companion;
            itmAEQbTJ.show(fragmentManager, C56524yIo.AEQbTJ(iTM.class).valueOf());
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            Result.Application application4 = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.TRUE));
        }
        Result.m7376boximpl(objM7377constructorimpl);
    }

    /* JADX INFO: renamed from: o.jxe$TaskDescription */
    public static final class TaskDescription implements iTO {
        public final /* synthetic */ CancellableContinuation<java.lang.Boolean> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            this.KWHzl = cancellableContinuation;
        }

        @Override // o.iTO
        public void copydefault() {
            CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.KWHzl;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.TRUE));
        }

        @Override // o.iTO
        public void OLrzqt() {
            CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.KWHzl;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.FALSE));
        }
    }

    public final java.lang.Object KWHzl(@NotNull CoroutineScope coroutineScope, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InvestGetGasFeeRequest investGetGasFeeRequest, @NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        C27493jwI.safeLaunch$default(coroutineScope, null, null, new InvestProcessUtil$checkAndShowClaimGasFeeReminder$2$1(investGetGasFeeRequest, str, cancellableContinuationImpl, fragmentManager, null), 3, null);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public final java.lang.Object EZpvd(@NotNull CoroutineScope coroutineScope, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InvestGetGasFeeRequest investGetGasFeeRequest, @NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        C27493jwI.safeLaunch$default(coroutineScope, null, null, new InvestProcessUtil$checkAndShowWeb3ClaimGasFeeReminder$2$1(investGetGasFeeRequest, str, cancellableContinuationImpl, fragmentManager, null), 3, null);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
