package o;

import com.okinc.business.invest_api.bean.EarnRecommendApyBean;
import com.okinc.business.invest_biz.data.bean.AggregateData;
import com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse;
import com.okinc.business.invest_biz.data.repository.DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1;
import com.okinc.business.invest_biz.data.repository.DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$2;
import com.okinc.business.invest_biz.data.repository.DexEntranceUseRepositoryImpl$getDexEarnEntranceList$1;
import com.okinc.business.invest_biz.data.repository.DexEntranceUseRepositoryImpl$getDexEarnEntranceList$2;
import com.okinc.business.invest_biz.data.repository.DexEntranceUseRepositoryImpl$getDexRecommendApyList$1;
import com.okinc.business.invest_biz.data.repository.DexEntranceUseRepositoryImpl$getDexRecommendApyList$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23634iDq implements InterfaceC23635iDr {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC23589iBz OLrzqt;

    @yCM
    public C23634iDq(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC23589iBz;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.InterfaceC23635iDr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<EarnRecommendApyBean>>> continuation) throws java.lang.Throwable {
        DexEntranceUseRepositoryImpl$getDexRecommendApyList$1 dexEntranceUseRepositoryImpl$getDexRecommendApyList$1;
        if (continuation instanceof DexEntranceUseRepositoryImpl$getDexRecommendApyList$1) {
            dexEntranceUseRepositoryImpl$getDexRecommendApyList$1 = (DexEntranceUseRepositoryImpl$getDexRecommendApyList$1) continuation;
            int i = dexEntranceUseRepositoryImpl$getDexRecommendApyList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexEntranceUseRepositoryImpl$getDexRecommendApyList$1.label = i - Integer.MIN_VALUE;
            } else {
                dexEntranceUseRepositoryImpl$getDexRecommendApyList$1 = new DexEntranceUseRepositoryImpl$getDexRecommendApyList$1(this, continuation);
            }
        }
        DexEntranceUseRepositoryImpl$getDexRecommendApyList$1 dexEntranceUseRepositoryImpl$getDexRecommendApyList$12 = dexEntranceUseRepositoryImpl$getDexRecommendApyList$1;
        java.lang.Object obj = dexEntranceUseRepositoryImpl$getDexRecommendApyList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexEntranceUseRepositoryImpl$getDexRecommendApyList$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        DexEntranceUseRepositoryImpl$getDexRecommendApyList$2 dexEntranceUseRepositoryImpl$getDexRecommendApyList$2 = new DexEntranceUseRepositoryImpl$getDexRecommendApyList$2(this, j, str, str2, null);
        dexEntranceUseRepositoryImpl$getDexRecommendApyList$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, dexEntranceUseRepositoryImpl$getDexRecommendApyList$2, dexEntranceUseRepositoryImpl$getDexRecommendApyList$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23635iDr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, @NotNull Continuation<? super Result<SearchHeaderInfoResponse>> continuation) {
        DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1 dexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1;
        if (continuation instanceof DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1) {
            dexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1 = (DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1) continuation;
            int i = dexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                dexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1 = new DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1(this, continuation);
            }
        }
        java.lang.Object obj = dexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$2 dexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$2 = new DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$2(this, j, str, null);
        dexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, dexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$2, dexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC23635iDr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(int i, long j, @NotNull java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super Result<AggregateData>> continuation) {
        DexEntranceUseRepositoryImpl$getDexEarnEntranceList$1 dexEntranceUseRepositoryImpl$getDexEarnEntranceList$1;
        if (continuation instanceof DexEntranceUseRepositoryImpl$getDexEarnEntranceList$1) {
            dexEntranceUseRepositoryImpl$getDexEarnEntranceList$1 = (DexEntranceUseRepositoryImpl$getDexEarnEntranceList$1) continuation;
            int i2 = dexEntranceUseRepositoryImpl$getDexEarnEntranceList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dexEntranceUseRepositoryImpl$getDexEarnEntranceList$1.label = i2 - Integer.MIN_VALUE;
            } else {
                dexEntranceUseRepositoryImpl$getDexEarnEntranceList$1 = new DexEntranceUseRepositoryImpl$getDexEarnEntranceList$1(this, continuation);
            }
        }
        DexEntranceUseRepositoryImpl$getDexEarnEntranceList$1 dexEntranceUseRepositoryImpl$getDexEarnEntranceList$12 = dexEntranceUseRepositoryImpl$getDexEarnEntranceList$1;
        java.lang.Object obj = dexEntranceUseRepositoryImpl$getDexEarnEntranceList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = dexEntranceUseRepositoryImpl$getDexEarnEntranceList$12.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        DexEntranceUseRepositoryImpl$getDexEarnEntranceList$2 dexEntranceUseRepositoryImpl$getDexEarnEntranceList$2 = new DexEntranceUseRepositoryImpl$getDexEarnEntranceList$2(this, i, j, str, num, str2, str3, null);
        dexEntranceUseRepositoryImpl$getDexEarnEntranceList$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, dexEntranceUseRepositoryImpl$getDexEarnEntranceList$2, dexEntranceUseRepositoryImpl$getDexEarnEntranceList$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
