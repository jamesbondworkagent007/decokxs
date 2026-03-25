package o;

import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingDefaultConfig;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.Result;

/* JADX INFO: renamed from: o.gSq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19877gSq {
    @yCM
    public C19877gSq() {
    }

    public final Result<gTC> copydefault(Result<CopyTradingDefaultConfig> result, Result<? extends java.util.List<DefiChainInfo>> result2) {
        CopyTradingDefaultConfig copyTradingDefaultConfig;
        java.util.List list;
        if (result != null) {
            java.lang.Object objM7386unboximpl = result.m7386unboximpl();
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
                Result.Application application = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
            }
            copyTradingDefaultConfig = (CopyTradingDefaultConfig) objM7386unboximpl;
        } else {
            copyTradingDefaultConfig = null;
        }
        if (result2 != null) {
            java.lang.Object objM7386unboximpl2 = result2.m7386unboximpl();
            java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl2);
            if (thM7380exceptionOrNullimpl2 != null) {
                Result.Application application2 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl2)));
            }
            list = (java.util.List) objM7386unboximpl2;
        } else {
            list = null;
        }
        if (copyTradingDefaultConfig == null || list == null) {
            return null;
        }
        Result.Application application3 = Result.Companion;
        return Result.m7376boximpl(Result.m7377constructorimpl(new gTC(copyTradingDefaultConfig, list, null)));
    }

    public final Result<gTC> EZpvd(Result<CopyTradingDefaultConfig> result, Result<? extends java.util.List<DefiChainInfo>> result2, Result<CopyTradeDetail> result3) {
        CopyTradingDefaultConfig copyTradingDefaultConfig;
        java.util.List list;
        CopyTradeDetail copyTradeDetail;
        if (result != null) {
            java.lang.Object objM7386unboximpl = result.m7386unboximpl();
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
                Result.Application application = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
            }
            copyTradingDefaultConfig = (CopyTradingDefaultConfig) objM7386unboximpl;
        } else {
            copyTradingDefaultConfig = null;
        }
        if (result2 != null) {
            java.lang.Object objM7386unboximpl2 = result2.m7386unboximpl();
            java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl2);
            if (thM7380exceptionOrNullimpl2 != null) {
                Result.Application application2 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl2)));
            }
            list = (java.util.List) objM7386unboximpl2;
        } else {
            list = null;
        }
        if (result3 != null) {
            java.lang.Object objM7386unboximpl3 = result3.m7386unboximpl();
            java.lang.Throwable thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objM7386unboximpl3);
            if (thM7380exceptionOrNullimpl3 != null) {
                Result.Application application3 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl3)));
            }
            copyTradeDetail = (CopyTradeDetail) objM7386unboximpl3;
        } else {
            copyTradeDetail = null;
        }
        if (copyTradingDefaultConfig == null || list == null || copyTradeDetail == null) {
            return null;
        }
        Result.Application application4 = Result.Companion;
        return Result.m7376boximpl(Result.m7377constructorimpl(new gTC(copyTradingDefaultConfig, list, copyTradeDetail)));
    }
}
