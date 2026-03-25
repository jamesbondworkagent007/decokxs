package o;

import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.trade.core.init.InitStatus;
import com.okinc.unify_trade.trade.utils.TradeAbTestManager;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xNW {
    public final boolean DbNXlk;
    public volatile long fARcdN;
    public AtomicReference<InitStatus> fIwbmz;
    public long fetchVPNInfo;
    public final InterfaceC56387yDm isConnected;
    public C54588xNy valueOf;
    public InitStatus values;
    public final java.lang.String djBIcL = "trade_init";
    public final CopyOnWriteArrayList<AbstractC54602xOl> gEmmrt = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<AbstractC54602xOl> AkhnZx = new CopyOnWriteArrayList<>();

    public abstract boolean AhwBna();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54588xNy AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AuCTel() {
        return this.fARcdN;
    }

    public abstract java.lang.String EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C54588xNy c54588xNy) {
        this.valueOf = c54588xNy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean bE_() {
        return this.DbNXlk;
    }

    public abstract java.util.List<xKK> djBIcL();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AtomicReference<InitStatus> ejfBZ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.djBIcL;
    }

    public abstract void gEmmrt();

    public xNW() {
        InitStatus initStatus = InitStatus.UNINIT;
        this.fIwbmz = new AtomicReference<>(initStatus);
        this.values = initStatus;
        pUU.KWHzl("trade_init", "InitTask创建: " + EZpvd() + " - hashCode=" + hashCode());
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.xNZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(xNW.values());
            }
        });
    }

    public final boolean getNewProxyInstance() {
        return ((java.lang.Boolean) this.isConnected.getValue()).booleanValue();
    }

    public static final boolean values() {
        return C55697xoo.OLrzqt.isConnected();
    }

    public final void AEQbTJ(@NotNull InitStatus initStatus) {
        Intrinsics.checkNotNullParameter(initStatus, "");
        this.fIwbmz.set(initStatus);
    }

    public final void OLrzqt(@NotNull AbstractC54602xOl abstractC54602xOl, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC54602xOl, "");
        if (z) {
            this.gEmmrt.add(abstractC54602xOl);
        } else {
            this.AkhnZx.add(abstractC54602xOl);
        }
    }

    public static /* synthetic */ void notifyResult$default(xNW xnw, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyResult");
        }
        if ((i & 2) != 0) {
            str = "";
        }
        xnw.AEQbTJ(z, str);
    }

    public final void AEQbTJ(boolean z, @NotNull java.lang.String str) {
        InitStatus initStatusCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            initStatusCopydefault = InitStatus.SUCCESS;
        } else {
            initStatusCopydefault = copydefault(str);
        }
        AEQbTJ(initStatusCopydefault);
        this.fetchVPNInfo = java.lang.System.currentTimeMillis();
        java.lang.String str2 = this.djBIcL;
        java.lang.String strEZpvd = EZpvd();
        long j = this.fetchVPNInfo;
        long j2 = this.fARcdN;
        pUU.KWHzl(str2, strEZpvd + " load time = " + (j - j2) + " state=" + this.fIwbmz.get());
        EZpvd(z || bE_(), str);
        isConnected();
    }

    public final void EZpvd(boolean z, java.lang.String str) {
        pUU.EZpvd(this.djBIcL, "forceCallBacks size= " + this.gEmmrt.size());
        pUU.EZpvd(this.djBIcL, "normalCallbacks size= " + this.AkhnZx.size());
        java.util.Iterator<T> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            ((AbstractC54602xOl) it.next()).KWHzl(z, false, true, str);
        }
        java.util.Iterator<T> it2 = this.AkhnZx.iterator();
        while (it2.hasNext()) {
            ((AbstractC54602xOl) it2.next()).KWHzl(z, false, true, str);
        }
    }

    public static /* synthetic */ InitStatus resetPreState$default(xNW xnw, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetPreState");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return xnw.copydefault(str);
    }

    public final InitStatus copydefault(java.lang.String str) {
        if (this.values == InitStatus.SUCCESS) {
            pUU.copydefault(this.djBIcL, EZpvd() + " load error,msg = " + str + ",restore preState success state");
            return this.values;
        }
        pUU.copydefault(this.djBIcL, EZpvd() + " load error,msg = " + str + ",no restore preState success state");
        return InitStatus.FAILURE;
    }

    public final void OLrzqt(boolean z, @NotNull AbstractC54602xOl abstractC54602xOl) {
        Intrinsics.checkNotNullParameter(abstractC54602xOl, "");
        if (fIwbmz()) {
            pUU.KWHzl(this.djBIcL, EZpvd() + " ignoreNoLogin, just return");
            abstractC54602xOl.KWHzl(true, false, false, "");
            return;
        }
        pUU.KWHzl(this.djBIcL, EZpvd() + " state=" + this.fIwbmz.get());
        if (this.fIwbmz.get() == InitStatus.SUCCESS && !z) {
            pUU.KWHzl(this.djBIcL, EZpvd() + " loadHttp success, just return");
            abstractC54602xOl.KWHzl(true, true, false, "");
            return;
        }
        OLrzqt(abstractC54602xOl, z);
        long jFetchVPNInfo = fetchVPNInfo();
        if (AEQbTJ(jFetchVPNInfo)) {
            pUU.copydefault(this.djBIcL, EZpvd() + " is loading wait " + jFetchVPNInfo + "ms, just addCallback and return");
            return;
        }
        this.values = this.fIwbmz.get();
        AEQbTJ(InitStatus.LOADING);
        pUU.KWHzl(this.djBIcL, EZpvd() + " start loadHttp, waiting for callback...");
        this.fARcdN = java.lang.System.currentTimeMillis();
        gEmmrt();
    }

    public final long fetchVPNInfo() {
        return java.lang.System.currentTimeMillis() - this.fARcdN;
    }

    public final boolean AEQbTJ(long j) {
        if (this.fIwbmz.get() == InitStatus.LOADING) {
            if (j < 30000) {
                return true;
            }
            C54515xLg.OLrzqt.EZpvd("timeout", C33129mqd.gEmmrt(30000L), EZpvd(), "total loading timeout");
        }
        return false;
    }

    public final boolean fIwbmz() {
        return AhwBna() && !getNewProxyInstance();
    }

    public void valueOf() {
        DbNXlk();
        InitStatus initStatus = this.fIwbmz.get();
        InitStatus initStatus2 = InitStatus.SUCCESS;
        if (initStatus != initStatus2) {
            AEQbTJ(resetPreState$default(this, null, 1, null));
        }
        if (this.fIwbmz.get() == InitStatus.LOADING) {
            AEQbTJ(InitStatus.UNINIT);
        }
        EZpvd(this.fIwbmz.get() == initStatus2, "");
        isConnected();
        this.fARcdN = 0L;
    }

    public final void isConnected() {
        this.gEmmrt.clear();
        this.AkhnZx.clear();
    }

    public final void DbNXlk() {
        java.util.Iterator<xKK> it = djBIcL().iterator();
        while (it.hasNext()) {
            it.next().AYXKKw();
        }
    }

    public boolean hDKMBd() {
        return TradeAbTestManager.copydefault.copydefault();
    }

    public final boolean fARcdN() {
        return this.fIwbmz.get() == InitStatus.SUCCESS || bE_() || fIwbmz();
    }

    public final java.lang.String AEQbTJ(java.lang.Exception exc) {
        if (exc != null) {
            if (exc instanceof BizApiException) {
                return ((BizApiException) exc).getMsg();
            }
            if (exc instanceof BizSystemException) {
                java.lang.String message = ((BizSystemException) exc).getMessage();
                if (message != null) {
                    return message;
                }
            } else {
                java.lang.String message2 = exc.getMessage();
                if (message2 != null) {
                    return message2;
                }
            }
        }
        return "";
    }
}
