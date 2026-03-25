package o;

import com.okinc.business.dex.trade.common.expire.model.ExpireTimeConfig;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;
import com.okinc.business.dex.trade.copytrading.edit.domain.usecase.GetExpireTimeDataUseCase$getExpireTimeData$1;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import com.okinc.business.dexlogic.main.limmitorder.bean.BizMode;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.reactive.AwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19876gSp {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC22502hga EZpvd;

    /* JADX INFO: renamed from: o.gSp$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gSp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public C19876gSp(@NotNull InterfaceC22502hga interfaceC22502hga) {
        Intrinsics.checkNotNullParameter(interfaceC22502hga, "");
        this.EZpvd = interfaceC22502hga;
    }

    @yCM
    public C19876gSp() {
        this(C22380heK.OLrzqt.copydefault("default_trade").AhwBna());
    }

    public final java.util.List<ExpireTimeConfig> EZpvd() {
        return this.EZpvd.OLrzqt(BizMode.COPY_TRADE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140 A[EDGE_INSN: B:89:0x0140->B:72:0x0140 BREAK  A[LOOP:1: B:67:0x012c->B:91:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(CopyTradeDetail copyTradeDetail, boolean z, @NotNull Continuation<? super ExpireTimeData> continuation) throws java.lang.Throwable {
        GetExpireTimeDataUseCase$getExpireTimeData$1 getExpireTimeDataUseCase$getExpireTimeData$1;
        java.util.List<ExpireTimeConfig> listEZpvd;
        CopyTradeDetail copyTradeDetail2;
        boolean z2;
        AbstractC58185ywX<java.util.List<ExpireTimeConfig>> abstractC58185ywXEZpvd;
        CopyTradeDetail copyTradeDetail3;
        boolean z3;
        java.lang.Object objM7377constructorimpl;
        java.util.Iterator<T> it;
        ExpireTimeConfig expireTimeConfig;
        java.lang.Object next;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof GetExpireTimeDataUseCase$getExpireTimeData$1) {
            getExpireTimeDataUseCase$getExpireTimeData$1 = (GetExpireTimeDataUseCase$getExpireTimeData$1) continuation;
            int i = getExpireTimeDataUseCase$getExpireTimeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getExpireTimeDataUseCase$getExpireTimeData$1.label = i - Integer.MIN_VALUE;
            } else {
                getExpireTimeDataUseCase$getExpireTimeData$1 = new GetExpireTimeDataUseCase$getExpireTimeData$1(this, continuation);
            }
        }
        java.lang.Object objAwaitFirst = getExpireTimeDataUseCase$getExpireTimeData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getExpireTimeDataUseCase$getExpireTimeData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwaitFirst);
                listEZpvd = EZpvd();
                if (!listEZpvd.isEmpty()) {
                    copyTradeDetail3 = copyTradeDetail;
                    z3 = z;
                    java.lang.Object obj = null;
                    if (copyTradeDetail3 != null) {
                        if (z3 && copyTradeDetail3.getExpireTime().length() > 0) {
                            return new ExpireTimeData("custom", copyTradeDetail3.getExpireTime(), pTA.format$default(new Date(C33129mqd.valueOf(copyTradeDetail3.getExpireTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
                        }
                        if (copyTradeDetail3.getExpireTimeType().length() > 0) {
                            Intrinsics.copydefault(listEZpvd);
                            java.util.Iterator<T> it2 = listEZpvd.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (Intrinsics.EZpvd((java.lang.Object) ((ExpireTimeConfig) next).getId(), (java.lang.Object) copyTradeDetail3.getExpireTimeType())) {
                                    break;
                                }
                            }
                            ExpireTimeConfig expireTimeConfig2 = (ExpireTimeConfig) next;
                            if (expireTimeConfig2 != null) {
                                return new ExpireTimeData(expireTimeConfig2.getId(), null, expireTimeConfig2.getText(), 2, null);
                            }
                        }
                    }
                    Intrinsics.copydefault(listEZpvd);
                    it = listEZpvd.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next2 = it.next();
                        if (((ExpireTimeConfig) next2).getDefaultShow()) {
                            obj = next2;
                            break;
                        }
                    }
                    expireTimeConfig = (ExpireTimeConfig) obj;
                    if (expireTimeConfig != null) {
                        return new ExpireTimeData(expireTimeConfig.getId(), null, expireTimeConfig.getText(), 2, null);
                    }
                    return new ExpireTimeData(null, null, null, 7, null);
                }
                try {
                    Result.Application application = Result.Companion;
                    abstractC58185ywXEZpvd = this.EZpvd.EZpvd(BizMode.COPY_TRADE);
                    copyTradeDetail2 = copyTradeDetail;
                } catch (java.lang.Throwable th) {
                    th = th;
                    copyTradeDetail2 = copyTradeDetail;
                }
                try {
                    getExpireTimeDataUseCase$getExpireTimeData$1.L$0 = copyTradeDetail2;
                    z2 = z;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    z2 = z;
                    pUU.AEQbTJ("DEX", "dexRunCatching", th);
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    copyTradeDetail3 = copyTradeDetail2;
                    z3 = z2;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    listEZpvd = (java.util.List) objM7377constructorimpl;
                    java.lang.Object obj2 = null;
                    if (copyTradeDetail3 != null) {
                    }
                    Intrinsics.copydefault(listEZpvd);
                    it = listEZpvd.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                    expireTimeConfig = (ExpireTimeConfig) obj2;
                    if (expireTimeConfig != null) {
                    }
                }
                try {
                    getExpireTimeDataUseCase$getExpireTimeData$1.Z$0 = z2;
                    getExpireTimeDataUseCase$getExpireTimeData$1.label = 1;
                    objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXEZpvd, getExpireTimeDataUseCase$getExpireTimeData$1);
                    if (objAwaitFirst == objCopydefault) {
                        return objCopydefault;
                    }
                    copyTradeDetail3 = copyTradeDetail2;
                    z3 = z2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    pUU.AEQbTJ("DEX", "dexRunCatching", th);
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    copyTradeDetail3 = copyTradeDetail2;
                    z3 = z2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = getExpireTimeDataUseCase$getExpireTimeData$1.Z$0;
                copyTradeDetail3 = (CopyTradeDetail) getExpireTimeDataUseCase$getExpireTimeData$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAwaitFirst);
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    copyTradeDetail2 = copyTradeDetail3;
                    z2 = z3;
                    pUU.AEQbTJ("DEX", "dexRunCatching", th);
                    Result.Application application222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    copyTradeDetail3 = copyTradeDetail2;
                    z3 = z2;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objAwaitFirst);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("GetExpireTimeDataUseCase", "fetchExpireConfig error", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = yDY.AhwBna();
            }
            listEZpvd = (java.util.List) objM7377constructorimpl;
            java.lang.Object obj22 = null;
            if (copyTradeDetail3 != null) {
            }
            Intrinsics.copydefault(listEZpvd);
            it = listEZpvd.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            expireTimeConfig = (ExpireTimeConfig) obj22;
            if (expireTimeConfig != null) {
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
