package o;

import com.okinc.business.defi.tee.bean.CacheState;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingWalletUseCase$canCreateTrade$1;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingWalletUseCase$canEditTrade$1;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingWalletUseCase$checkSAState$1;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingWalletUseCase$getSupportedChains$1;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gWN {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final InterfaceC19871gSk AEQbTJ;
    public final gLS copydefault;

    @yCM
    public gWN(@NotNull gLS gls, @NotNull InterfaceC19871gSk interfaceC19871gSk) {
        Intrinsics.checkNotNullParameter(gls, "");
        Intrinsics.checkNotNullParameter(interfaceC19871gSk, "");
        this.copydefault = gls;
        this.AEQbTJ = interfaceC19871gSk;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gWN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static /* synthetic */ java.lang.Object checkSAState$default(gWN gwn, java.lang.Long l, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return gwn.KWHzl(l, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.Long l, @NotNull Continuation<? super gLQ> continuation) throws java.lang.Throwable {
        CopyTradingWalletUseCase$checkSAState$1 copyTradingWalletUseCase$checkSAState$1;
        java.lang.Long l2;
        InterfaceC9738bbJ interfaceC9738bbJ;
        gWN gwn;
        java.lang.Object next;
        if (continuation instanceof CopyTradingWalletUseCase$checkSAState$1) {
            copyTradingWalletUseCase$checkSAState$1 = (CopyTradingWalletUseCase$checkSAState$1) continuation;
            int i = copyTradingWalletUseCase$checkSAState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingWalletUseCase$checkSAState$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingWalletUseCase$checkSAState$1 = new CopyTradingWalletUseCase$checkSAState$1(this, continuation);
            }
        }
        java.lang.Object obj = copyTradingWalletUseCase$checkSAState$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingWalletUseCase$checkSAState$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = this.copydefault.AEQbTJ();
            if (interfaceC9738bbJAEQbTJ == null) {
                return null;
            }
            copyTradingWalletUseCase$checkSAState$1.L$0 = this;
            copyTradingWalletUseCase$checkSAState$1.L$1 = l;
            copyTradingWalletUseCase$checkSAState$1.L$2 = interfaceC9738bbJAEQbTJ;
            copyTradingWalletUseCase$checkSAState$1.label = 1;
            java.lang.Object objEZpvd = EZpvd(copyTradingWalletUseCase$checkSAState$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            l2 = l;
            interfaceC9738bbJ = interfaceC9738bbJAEQbTJ;
            obj = objEZpvd;
            gwn = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC9738bbJ = (InterfaceC9738bbJ) copyTradingWalletUseCase$checkSAState$1.L$2;
            l2 = (java.lang.Long) copyTradingWalletUseCase$checkSAState$1.L$1;
            gwn = (gWN) copyTradingWalletUseCase$checkSAState$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.util.List list = (java.util.List) obj;
        gLS gls = gwn.copydefault;
        java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C56443yFo.KWHzl(C33129mqd.valueOf(((DefiChainInfo) it.next()).getChainId())));
        }
        java.util.Map<java.lang.Long, dTM> mapCopydefault = gls.copydefault(strDbNXlk, arrayList);
        java.util.Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((DefiChainInfo) next).isUpgradeRequired()) {
                break;
            }
        }
        boolean z = next != null;
        pUU.KWHzl("CopyTradingWalletUseCase", "chainsStatusMap: " + mapCopydefault);
        pUU.KWHzl("CopyTradingWalletUseCase", "mainWallet.teeExpireTimeStamp: " + interfaceC9738bbJ.fIwbmz());
        pUU.KWHzl("CopyTradingWalletUseCase", "upgradeRequired: " + z);
        if (!interfaceC9738bbJ.zLjUOn() || !interfaceC9738bbJ.AubY() || interfaceC9738bbJ.djBIcL()) {
            return new gLQ.ActionBar(true, interfaceC9738bbJ.DbNXlk());
        }
        if (mapCopydefault.isEmpty()) {
            return gLQ.Dialog.OLrzqt;
        }
        if (!interfaceC9738bbJ.DTwDnp() || interfaceC9738bbJ.QUSxYX() || interfaceC9738bbJ.AuCTel()) {
            return new gLQ.FragmentManager(true, interfaceC9738bbJ.DbNXlk(), true, interfaceC9738bbJ.AuCTel());
        }
        if (z) {
            return new gLQ.AssistContent(true, interfaceC9738bbJ.DbNXlk(), false, 4, null);
        }
        for (Map.Entry<java.lang.Long, dTM> entry : mapCopydefault.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            dTM value = entry.getValue();
            pUU.KWHzl("CopyTradingWalletUseCase", "Checking chain " + jLongValue + " with status: " + value);
            CacheState cacheStateCopydefault = value.copydefault();
            CacheState cacheState = CacheState.Ready;
            if (cacheStateCopydefault != cacheState) {
                pUU.copydefault("CopyTradingWalletUseCase", "Chain " + jLongValue + " TEE status not ready: " + value.copydefault());
            }
            if (value.EZpvd() && value.copydefault() == cacheState) {
                return gLQ.Dialog.OLrzqt;
            }
            if (!value.KWHzl() && value.copydefault() == cacheState) {
                return new gLQ.Activity(true, interfaceC9738bbJ.DbNXlk(), true);
            }
            if (!value.OLrzqt() && value.copydefault() == cacheState) {
                return new gLQ.AssistContent(true, interfaceC9738bbJ.DbNXlk(), true);
            }
        }
        if (!interfaceC9738bbJ.DTwDnp()) {
            return null;
        }
        if (!gwn.copydefault.KWHzl()) {
            return new gLQ.PendingIntent(interfaceC9738bbJ.DbNXlk());
        }
        return gwn.OLrzqt(l2, interfaceC9738bbJ.fIwbmz(), interfaceC9738bbJ.DbNXlk());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        CopyTradingWalletUseCase$canCreateTrade$1 copyTradingWalletUseCase$canCreateTrade$1;
        if (continuation instanceof CopyTradingWalletUseCase$canCreateTrade$1) {
            copyTradingWalletUseCase$canCreateTrade$1 = (CopyTradingWalletUseCase$canCreateTrade$1) continuation;
            int i = copyTradingWalletUseCase$canCreateTrade$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingWalletUseCase$canCreateTrade$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingWalletUseCase$canCreateTrade$1 = new CopyTradingWalletUseCase$canCreateTrade$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = copyTradingWalletUseCase$canCreateTrade$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingWalletUseCase$canCreateTrade$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            copyTradingWalletUseCase$canCreateTrade$1.label = 1;
            objEZpvd = EZpvd(copyTradingWalletUseCase$canCreateTrade$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.lang.Iterable iterable = (java.lang.Iterable) objEZpvd;
        if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).isEmpty()) {
            z = false;
        } else {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((DefiChainInfo) it.next()).getSupportCopyTradeCreate()) {
                    break;
                }
            }
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        CopyTradingWalletUseCase$canEditTrade$1 copyTradingWalletUseCase$canEditTrade$1;
        java.lang.Object next;
        if (continuation instanceof CopyTradingWalletUseCase$canEditTrade$1) {
            copyTradingWalletUseCase$canEditTrade$1 = (CopyTradingWalletUseCase$canEditTrade$1) continuation;
            int i = copyTradingWalletUseCase$canEditTrade$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingWalletUseCase$canEditTrade$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingWalletUseCase$canEditTrade$1 = new CopyTradingWalletUseCase$canEditTrade$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = copyTradingWalletUseCase$canEditTrade$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingWalletUseCase$canEditTrade$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            copyTradingWalletUseCase$canEditTrade$1.L$0 = str;
            copyTradingWalletUseCase$canEditTrade$1.label = 1;
            objEZpvd = EZpvd(copyTradingWalletUseCase$canEditTrade$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) copyTradingWalletUseCase$canEditTrade$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.Iterator it = ((java.lang.Iterable) objEZpvd).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        return C56443yFo.KWHzl(defiChainInfo != null ? defiChainInfo.getSupportCopyTradeCreate() : false);
    }

    public final gLQ OLrzqt(java.lang.Long l, long j, java.lang.String str) {
        if (this.copydefault.OLrzqt()) {
            return gLQ.TaskDescription.copydefault;
        }
        if (l != null && l.longValue() > j) {
            return new gLQ.StateListAnimator(str);
        }
        long jCurrentTimeMillis = j - java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            return new gLQ.FragmentManager(true, str, true, false, 8, null);
        }
        long jCeil = (long) java.lang.Math.ceil(jCurrentTimeMillis / java.util.concurrent.TimeUnit.DAYS.toMillis(1L));
        if (jCeil <= 3) {
            return new gLQ.Application(C56548yJl.copydefault(jCeil, 1L), str);
        }
        return gLQ.TaskDescription.copydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<DefiChainInfo>> continuation) throws java.lang.Throwable {
        CopyTradingWalletUseCase$getSupportedChains$1 copyTradingWalletUseCase$getSupportedChains$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof CopyTradingWalletUseCase$getSupportedChains$1) {
            copyTradingWalletUseCase$getSupportedChains$1 = (CopyTradingWalletUseCase$getSupportedChains$1) continuation;
            int i = copyTradingWalletUseCase$getSupportedChains$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingWalletUseCase$getSupportedChains$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingWalletUseCase$getSupportedChains$1 = new CopyTradingWalletUseCase$getSupportedChains$1(this, continuation);
            }
        }
        java.lang.Object obj = copyTradingWalletUseCase$getSupportedChains$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingWalletUseCase$getSupportedChains$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC19871gSk interfaceC19871gSk = this.AEQbTJ;
            copyTradingWalletUseCase$getSupportedChains$1.label = 1;
            objOLrzqt = interfaceC19871gSk.OLrzqt(copyTradingWalletUseCase$getSupportedChains$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        java.util.List list = (java.util.List) objOLrzqt;
        return list == null ? yDY.AhwBna() : list;
    }
}
