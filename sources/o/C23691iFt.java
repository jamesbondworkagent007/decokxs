package o;

import com.okinc.business.invest_biz.data.models.DetailOrderParam;
import com.okinc.business.invest_biz.data.models.InvestHomeOrderVo;
import com.okinc.business.invest_biz.data.models.InvestQaVo;
import com.okinc.business.invest_biz.data.source.RemoteInvestDataSource$getInvestFaq$1;
import com.okinc.business.invest_biz.data.source.RemoteInvestDataSource$getInvestFaq$2$1;
import com.okinc.business.invest_biz.data.source.RemoteInvestDataSource$getInvestHistory$1;
import com.okinc.business.invest_biz.data.source.RemoteInvestDataSource$getInvestHistory$2$1;
import com.okinc.business.invest_biz.data.source.RemoteInvestDataSource$getMultiTabEventPageInvestmentList$1;
import com.okinc.business.invest_biz.data.source.RemoteInvestDataSource$getMultiTabEventPageInvestmentList$2$1;
import com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageData;
import com.okinc.business.invest_biz.ui.screens.eventpage.SpecialZoneActivityParam;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23691iFt implements InterfaceC23683iFl {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC23589iBz EZpvd;

    @yCM
    public C23691iFt(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC23589iBz;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23683iFl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<InvestQaVo>, OKServerException>> continuation) throws java.lang.Throwable {
        RemoteInvestDataSource$getInvestFaq$1 remoteInvestDataSource$getInvestFaq$1;
        if (continuation instanceof RemoteInvestDataSource$getInvestFaq$1) {
            remoteInvestDataSource$getInvestFaq$1 = (RemoteInvestDataSource$getInvestFaq$1) continuation;
            int i = remoteInvestDataSource$getInvestFaq$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteInvestDataSource$getInvestFaq$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteInvestDataSource$getInvestFaq$1 = new RemoteInvestDataSource$getInvestFaq$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = remoteInvestDataSource$getInvestFaq$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteInvestDataSource$getInvestFaq$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                RemoteInvestDataSource$getInvestFaq$2$1 remoteInvestDataSource$getInvestFaq$2$1 = new RemoteInvestDataSource$getInvestFaq$2$1(this, null);
                remoteInvestDataSource$getInvestFaq$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteInvestDataSource$getInvestFaq$2$1, remoteInvestDataSource$getInvestFaq$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23683iFl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull DetailOrderParam detailOrderParam, @NotNull Continuation<? super AbstractC43419rot<InvestHomeOrderVo, OKServerException>> continuation) throws java.lang.Throwable {
        RemoteInvestDataSource$getInvestHistory$1 remoteInvestDataSource$getInvestHistory$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof RemoteInvestDataSource$getInvestHistory$1) {
            remoteInvestDataSource$getInvestHistory$1 = (RemoteInvestDataSource$getInvestHistory$1) continuation;
            int i = remoteInvestDataSource$getInvestHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteInvestDataSource$getInvestHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteInvestDataSource$getInvestHistory$1 = new RemoteInvestDataSource$getInvestHistory$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = remoteInvestDataSource$getInvestHistory$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteInvestDataSource$getInvestHistory$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                RemoteInvestDataSource$getInvestHistory$2$1 remoteInvestDataSource$getInvestHistory$2$1 = new RemoteInvestDataSource$getInvestHistory$2$1(this, str, detailOrderParam, null);
                remoteInvestDataSource$getInvestHistory$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteInvestDataSource$getInvestHistory$2$1, remoteInvestDataSource$getInvestHistory$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23683iFl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull SpecialZoneActivityParam specialZoneActivityParam, @NotNull Continuation<? super AbstractC43419rot<InvestMultiTabEventPageData, OKServerException>> continuation) throws java.lang.Throwable {
        RemoteInvestDataSource$getMultiTabEventPageInvestmentList$1 remoteInvestDataSource$getMultiTabEventPageInvestmentList$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof RemoteInvestDataSource$getMultiTabEventPageInvestmentList$1) {
            remoteInvestDataSource$getMultiTabEventPageInvestmentList$1 = (RemoteInvestDataSource$getMultiTabEventPageInvestmentList$1) continuation;
            int i = remoteInvestDataSource$getMultiTabEventPageInvestmentList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteInvestDataSource$getMultiTabEventPageInvestmentList$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteInvestDataSource$getMultiTabEventPageInvestmentList$1 = new RemoteInvestDataSource$getMultiTabEventPageInvestmentList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = remoteInvestDataSource$getMultiTabEventPageInvestmentList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteInvestDataSource$getMultiTabEventPageInvestmentList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                RemoteInvestDataSource$getMultiTabEventPageInvestmentList$2$1 remoteInvestDataSource$getMultiTabEventPageInvestmentList$2$1 = new RemoteInvestDataSource$getMultiTabEventPageInvestmentList$2$1(this, specialZoneActivityParam, null);
                remoteInvestDataSource$getMultiTabEventPageInvestmentList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteInvestDataSource$getMultiTabEventPageInvestmentList$2$1, remoteInvestDataSource$getMultiTabEventPageInvestmentList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }
}
