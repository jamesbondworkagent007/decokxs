package o;

import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStrategyNumResponse;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingConfigUseCase$getCanCreateChainMap$1;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingConfigUseCase$getMaxActiveStrategyNum$1;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingConfigUseCase$getStrategyOrderCount$1;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingConfigUseCase$getTotalActiveStrategyNum$1;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gWI {
    public final InterfaceC20053gZd AEQbTJ;
    public final C28196kSl EZpvd;
    public final kYD KWHzl;
    public final C19702gMd OLrzqt;
    public final gWK copydefault;

    @yCM
    public gWI(@NotNull kYD kyd, @NotNull gWK gwk, @NotNull InterfaceC20053gZd interfaceC20053gZd, @NotNull C28196kSl c28196kSl, @NotNull C19702gMd c19702gMd) {
        Intrinsics.checkNotNullParameter(kyd, "");
        Intrinsics.checkNotNullParameter(gwk, "");
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        this.KWHzl = kyd;
        this.copydefault = gwk;
        this.AEQbTJ = interfaceC20053gZd;
        this.EZpvd = c28196kSl;
        this.OLrzqt = c19702gMd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<? extends java.util.Map<java.lang.String, java.lang.Boolean>>> continuation) {
        CopyTradingConfigUseCase$getCanCreateChainMap$1 copyTradingConfigUseCase$getCanCreateChainMap$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof CopyTradingConfigUseCase$getCanCreateChainMap$1) {
            copyTradingConfigUseCase$getCanCreateChainMap$1 = (CopyTradingConfigUseCase$getCanCreateChainMap$1) continuation;
            int i = copyTradingConfigUseCase$getCanCreateChainMap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingConfigUseCase$getCanCreateChainMap$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingConfigUseCase$getCanCreateChainMap$1 = new CopyTradingConfigUseCase$getCanCreateChainMap$1(this, continuation);
            }
        }
        java.lang.Object objGEmmrt = copyTradingConfigUseCase$getCanCreateChainMap$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingConfigUseCase$getCanCreateChainMap$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objGEmmrt);
                Result.Application application = Result.Companion;
                kYD kyd = this.KWHzl;
                copyTradingConfigUseCase$getCanCreateChainMap$1.label = 1;
                objGEmmrt = kyd.gEmmrt(copyTradingConfigUseCase$getCanCreateChainMap$1);
                if (objGEmmrt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objGEmmrt);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) ((AbstractC43419rot) objGEmmrt).AEQbTJ());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            return Result.m7377constructorimpl(objM7377constructorimpl);
        }
        Result.Application application3 = Result.Companion;
        java.util.HashMap map = new java.util.HashMap();
        for (DefiChainInfo defiChainInfo : (java.util.List) objM7377constructorimpl) {
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(defiChainInfo.getChainId(), C56443yFo.KWHzl(defiChainInfo.getSupportCopyTradeCreate()));
            map.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        return Result.m7377constructorimpl(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        CopyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1 copyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object next;
        if (continuation instanceof CopyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1) {
            copyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1 = (CopyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1) continuation;
            int i = copyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1 = new CopyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1(this, continuation);
            }
        }
        java.lang.Object objGEmmrt = copyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objGEmmrt);
                Result.Application application = Result.Companion;
                kYD kyd = this.KWHzl;
                copyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1.label = 1;
                objGEmmrt = kyd.gEmmrt(copyTradingConfigUseCase$getIsNeedUpgradeTeeVersion$1);
                if (objGEmmrt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objGEmmrt);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) ((AbstractC43419rot) objGEmmrt).AEQbTJ());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Result.Application application3 = Result.Companion;
            java.util.Iterator it = ((java.util.List) objM7377constructorimpl).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((DefiChainInfo) next).isUpgradeRequired()) {
                    break;
                }
            }
            objM7377constructorimpl = C56443yFo.KWHzl(next != null);
        }
        return Result.m7377constructorimpl(objM7377constructorimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        CopyTradingConfigUseCase$getMaxActiveStrategyNum$1 copyTradingConfigUseCase$getMaxActiveStrategyNum$1;
        InterfaceC20053gZd interfaceC20053gZd;
        if (continuation instanceof CopyTradingConfigUseCase$getMaxActiveStrategyNum$1) {
            copyTradingConfigUseCase$getMaxActiveStrategyNum$1 = (CopyTradingConfigUseCase$getMaxActiveStrategyNum$1) continuation;
            int i = copyTradingConfigUseCase$getMaxActiveStrategyNum$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingConfigUseCase$getMaxActiveStrategyNum$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingConfigUseCase$getMaxActiveStrategyNum$1 = new CopyTradingConfigUseCase$getMaxActiveStrategyNum$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = copyTradingConfigUseCase$getMaxActiveStrategyNum$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingConfigUseCase$getMaxActiveStrategyNum$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            interfaceC20053gZd = this.AEQbTJ;
            C28196kSl c28196kSl = this.EZpvd;
            copyTradingConfigUseCase$getMaxActiveStrategyNum$1.L$0 = interfaceC20053gZd;
            copyTradingConfigUseCase$getMaxActiveStrategyNum$1.label = 1;
            objOLrzqt = c28196kSl.OLrzqt(copyTradingConfigUseCase$getMaxActiveStrategyNum$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objOLrzqt);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC20053gZd = (InterfaceC20053gZd) copyTradingConfigUseCase$getMaxActiveStrategyNum$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        copyTradingConfigUseCase$getMaxActiveStrategyNum$1.L$0 = null;
        copyTradingConfigUseCase$getMaxActiveStrategyNum$1.label = 2;
        objOLrzqt = interfaceC20053gZd.copydefault((java.lang.String) objOLrzqt, copyTradingConfigUseCase$getMaxActiveStrategyNum$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        CopyTradingConfigUseCase$getTotalActiveStrategyNum$1 copyTradingConfigUseCase$getTotalActiveStrategyNum$1;
        InterfaceC20053gZd interfaceC20053gZd;
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot actionBar;
        if (continuation instanceof CopyTradingConfigUseCase$getTotalActiveStrategyNum$1) {
            copyTradingConfigUseCase$getTotalActiveStrategyNum$1 = (CopyTradingConfigUseCase$getTotalActiveStrategyNum$1) continuation;
            int i = copyTradingConfigUseCase$getTotalActiveStrategyNum$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingConfigUseCase$getTotalActiveStrategyNum$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingConfigUseCase$getTotalActiveStrategyNum$1 = new CopyTradingConfigUseCase$getTotalActiveStrategyNum$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = copyTradingConfigUseCase$getTotalActiveStrategyNum$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingConfigUseCase$getTotalActiveStrategyNum$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            interfaceC20053gZd = this.AEQbTJ;
            C28196kSl c28196kSl = this.EZpvd;
            copyTradingConfigUseCase$getTotalActiveStrategyNum$1.L$0 = interfaceC20053gZd;
            copyTradingConfigUseCase$getTotalActiveStrategyNum$1.label = 1;
            objOLrzqt = c28196kSl.OLrzqt(copyTradingConfigUseCase$getTotalActiveStrategyNum$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                abstractC43419rot = (AbstractC43419rot) objOLrzqt;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    actionBar = new AbstractC43419rot.StateListAnimator(C56443yFo.AEQbTJ(((CopyTradeStrategyNumResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getTotalCount()));
                } else {
                    if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    actionBar = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
                }
                java.lang.Integer num = (java.lang.Integer) actionBar.copydefault();
                return C56443yFo.AEQbTJ(num == null ? num.intValue() : 0);
            }
            interfaceC20053gZd = (InterfaceC20053gZd) copyTradingConfigUseCase$getTotalActiveStrategyNum$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        copyTradingConfigUseCase$getTotalActiveStrategyNum$1.L$0 = null;
        copyTradingConfigUseCase$getTotalActiveStrategyNum$1.label = 2;
        objOLrzqt = interfaceC20053gZd.OLrzqt((java.lang.String) objOLrzqt, copyTradingConfigUseCase$getTotalActiveStrategyNum$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) objOLrzqt;
        if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
        }
        java.lang.Integer num2 = (java.lang.Integer) actionBar.copydefault();
        return C56443yFo.AEQbTJ(num2 == null ? num2.intValue() : 0);
    }

    public final Flow<java.lang.Integer> EZpvd() {
        return FlowKt.callbackFlow(new CopyTradingConfigUseCase$getStrategyOrderCount$1(this, null));
    }
}
