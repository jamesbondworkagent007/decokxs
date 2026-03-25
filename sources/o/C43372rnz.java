package o;

import androidx.work.WorkRequest;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.config.NetworkStringEnum;
import com.okinc.network.okg.cor.CombinedExecutors;
import com.okinc.network.okg.cor.SingleExecutor;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.DomainsUtils;
import com.okinc.network.okg.dns.OKDnsManager$initCorHost$1;
import com.okinc.network.okg.dns.OKDnsManager$sendCORSuccessEvent$1;
import com.okinc.network.okg.dns.OKDnsManager$setCORDomain$1;
import com.okinc.network.okg.dns.OKDnsManager$setCORDomain$success$1;
import com.okinc.network.okg.dns.OKDnsManager$setH5CORDomain$1;
import com.okinc.network.okg.dns.OKDnsManager$setH5CORDomainInternal$1;
import com.okinc.network.okg.dns.OKDnsManager$setH5CORDomainInternal$success$1;
import com.okinc.network.okg.dns.OKDnsManager$setH5CORDomainWithFrom$1;
import com.okinc.network.okg.dns.executor.OKDohConfig;
import com.okinc.network.okg.dns.model.DoHChain;
import com.okinc.network.okg.dns.model.NetType;
import com.okinc.network.request.SchemeType;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C43396roW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43372rnz {
    public static volatile boolean EZpvd = false;
    public static boolean values;
    public static final C43372rnz copydefault = new C43372rnz();
    public static C43349rnc gEmmrt = new C43349rnc();
    public static C43348rnb KWHzl = new C43348rnb();
    public static C43354rnh fetchVPNInfo = new C43354rnh();
    public static boolean fARcdN = true;
    public static boolean AkhnZx = true;
    public static int AhwBna = 1;
    public static ConcurrentLinkedDeque<java.lang.String> AYXKKw = new ConcurrentLinkedDeque<>();
    public static MutableSharedFlow<java.lang.String> valueOf = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    public static AtomicBoolean DbNXlk = new AtomicBoolean(true);
    public static final InterfaceC54816xWj AEQbTJ = new ActionBar();
    public static final C43396roW.ActionBar isConnected = new C43396roW.ActionBar() { // from class: o.rnB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C43396roW.ActionBar
        public final void copydefault(java.lang.String str) {
            C43372rnz.EZpvd(str);
        }
    };
    public static boolean djBIcL = SPUtils.getBoolean("enable_direct_connect", false);
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.rnz$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DohTypeEnum.values().length];
            try {
                iArr[DohTypeEnum.HTTP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DohTypeEnum.V5.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DohTypeEnum.DEXPRI.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43354rnh AkhnZx() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return !values || EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43348rnb gEmmrt() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<java.lang.String> isConnected() {
        return valueOf;
    }

    private C43372rnz() {
    }

    /* JADX INFO: renamed from: o.rnz$ActionBar */
    public static final class ActionBar implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            C43372rnz c43372rnz = C43372rnz.copydefault;
            pUU.KWHzl("OKDnsManager", "1 ---> onAppEnterForeground, canFetchDohWhenForeground: " + c43372rnz.copydefault());
            C43466rpn.OLrzqt.EZpvd(true);
            if (c43372rnz.copydefault()) {
                c43372rnz.OLrzqt(3L);
            }
            C43372rnz.EZpvd = true;
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            pUU.KWHzl("OKDnsManager", "2 ---> onAppEnterBackground");
            C43466rpn.OLrzqt.EZpvd(false);
            C43372rnz.copydefault.fIwbmz();
        }
    }

    public static final void EZpvd(java.lang.String str) {
        pUU.KWHzl("OKDnsManager", "onNetworkChange networkType: " + str);
        copydefault.OLrzqt(3L);
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AYXKKw.contains(str);
    }

    public final void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            if (AYXKKw.contains(str)) {
                return;
            }
            AYXKKw.add(str);
            return;
        }
        AYXKKw.remove(str);
    }

    public static /* synthetic */ void updateConfig$default(C43372rnz c43372rnz, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        c43372rnz.AEQbTJ(z, z2);
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        djBIcL = z;
        SPUtils.put("enable_direct_connect", java.lang.Boolean.valueOf(z));
        fARcdN = z2;
    }

    public final void KWHzl(boolean z, java.lang.Integer num) {
        AkhnZx = z;
        if (num != null) {
            AhwBna = num.intValue();
        }
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull java.util.List<DoHChain> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        pUU.KWHzl("OKDnsManager", "start, chainConfigList:" + list);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            gEmmrt.copydefault((DoHChain) it.next());
        }
        initCorHost$OKNetwork_network$default(this, null, 1, null);
        values = C43308rmo.OLrzqt(context);
        C43466rpn c43466rpn = C43466rpn.OLrzqt;
        c43466rpn.EZpvd(values);
        if (values) {
            if (C43292rmY.OLrzqt.ejfBZ() && ejfBZ()) {
                pUU.KWHzl("OKDnsManager", "start fetch doh logic with runAfterFirstPageFinished");
                c43466rpn.AEQbTJ(new Function0() { // from class: o.rnG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C43372rnz.KWHzl();
                    }
                });
            } else {
                pUU.KWHzl("OKDnsManager", "init with foreground, start fetch doh logic!");
                startFetchDoh$default(this, 0L, 1, null);
            }
        }
        C54819xWm.KWHzl().AEQbTJ(AEQbTJ);
        C43396roW.EZpvd().EZpvd(isConnected);
    }

    public static final Unit KWHzl() {
        startFetchDoh$default(copydefault, 0L, 1, null);
        return Unit.INSTANCE;
    }

    public final boolean ejfBZ() {
        java.util.Iterator<Map.Entry<DoHChain, C43326rnF>> it = gEmmrt.EZpvd().iterator();
        while (it.hasNext()) {
            if (!AEQbTJ(it.next().getValue().copydefault())) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void startFetchDoh$default(C43372rnz c43372rnz, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        c43372rnz.OLrzqt(j);
    }

    public final void OLrzqt(long j) {
        gEmmrt.OLrzqt(j);
        KWHzl.KWHzl(j);
        fetchVPNInfo.EZpvd(j);
        pUU.KWHzl("OKDnsManager", "--- start fetch doh --- " + j);
    }

    public final void fIwbmz() {
        gEmmrt.KWHzl();
        KWHzl.KWHzl();
        fetchVPNInfo.KWHzl();
        pUU.KWHzl("OKDnsManager", "--- stopFetchDohWhenInBg ---");
    }

    public final java.lang.String values() {
        return KWHzl(DohTypeEnum.HTTP);
    }

    public final java.lang.String KWHzl(DohTypeEnum dohTypeEnum) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(KWHzl("", getExecutorWithDohType$default(this, dohTypeEnum, false, null, 4, null)));
        if (C43347rna.EZpvd.EZpvd()) {
            sb.append(KWHzl("", getExecutorWithDohType$default(this, dohTypeEnum, true, null, 4, null)));
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String KWHzl(java.lang.String str, C43326rnF c43326rnF) {
        if (c43326rnF != null) {
            return "\n" + str + "\nlastFullLogStatus: \n" + c43326rnF.AEQbTJ() + "\nlogStatus:\n" + c43326rnF.djBIcL() + "\n";
        }
        return str + ", Empty Log";
    }

    public static /* synthetic */ java.lang.String getHost$default(C43372rnz c43372rnz, DohTypeEnum dohTypeEnum, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return c43372rnz.EZpvd(dohTypeEnum, z, str);
    }

    public final java.lang.String EZpvd(@NotNull DohTypeEnum dohTypeEnum, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        C43326rnF c43326rnFKWHzl = KWHzl(dohTypeEnum, z, str);
        if (c43326rnFKWHzl != null) {
            return c43326rnFKWHzl.valueOf();
        }
        return null;
    }

    public final java.lang.String copydefault(@NotNull DoHChain doHChain, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(doHChain, "");
        C43326rnF c43326rnFKWHzl = KWHzl(doHChain, z, str);
        if (c43326rnFKWHzl == null) {
            return null;
        }
        return c43326rnFKWHzl.valueOf();
    }

    public static /* synthetic */ C43326rnF getExecutorWithChainType$default(C43372rnz c43372rnz, DoHChain doHChain, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return c43372rnz.KWHzl(doHChain, z, str);
    }

    public final C43326rnF KWHzl(DoHChain doHChain, boolean z, java.lang.String str) {
        if (!z) {
            if (gEmmrt.KWHzl(doHChain)) {
                return gEmmrt.copydefault(doHChain);
            }
            pUU.copydefault("OKDnsManager", "getExecutorWithChainType, dnsExecutor dnsExecutors don't contain " + doHChain);
            return null;
        }
        if (str == null) {
            str = C43655rtQ.OLrzqt.AhwBna();
        }
        if (str == null) {
            pUU.copydefault("OKDnsManager", "getExecutorWithChainType, cannot get cor host for null site. pls call [setCORDomain] first");
            return null;
        }
        DohTypeEnum dohTypeEnumOLrzqt = C43466rpn.OLrzqt.OLrzqt(doHChain);
        if (dohTypeEnumOLrzqt == null) {
            pUU.copydefault("OKDnsManager", "getExecutorWithChainType, no cor config for " + doHChain);
            return null;
        }
        CombinedExecutors combinedExecutorsCopydefault = KWHzl.copydefault(str);
        if (combinedExecutorsCopydefault != null) {
            int i = Activity.AEQbTJ[dohTypeEnumOLrzqt.ordinal()];
            if (i == 1) {
                return combinedExecutorsCopydefault.getHttpExecutor();
            }
            if (i == 2) {
                return combinedExecutorsCopydefault.getV5Executor();
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return combinedExecutorsCopydefault.getDexExecutor();
        }
        SingleExecutor singleExecutorEZpvd = fetchVPNInfo.EZpvd(str);
        if (singleExecutorEZpvd != null) {
            if (dohTypeEnumOLrzqt == singleExecutorEZpvd.getType()) {
                return singleExecutorEZpvd.getExecutor();
            }
            pUU.copydefault("OKDnsManager", "getExecutorWithChainType, get wrong type for h5 cor.expected:" + dohTypeEnumOLrzqt + ", real:" + singleExecutorEZpvd.getType());
            return null;
        }
        pUU.copydefault("OKDnsManager", "getExecutorWithChainType, corExecutors for site:" + str + " is null. pls call [setCORDomain] first");
        return null;
    }

    public static /* synthetic */ C43326rnF getExecutorWithDohType$default(C43372rnz c43372rnz, DohTypeEnum dohTypeEnum, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return c43372rnz.KWHzl(dohTypeEnum, z, str);
    }

    public final C43326rnF KWHzl(DohTypeEnum dohTypeEnum, boolean z, java.lang.String str) {
        DoHChain okxHttpMain;
        if (!z) {
            int i = Activity.AEQbTJ[dohTypeEnum.ordinal()];
            if (i == 1) {
                okxHttpMain = DomainsUtils.INSTANCE.getOkxHttpMain();
            } else if (i == 2) {
                okxHttpMain = DomainsUtils.INSTANCE.getOkxWsV5();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                okxHttpMain = DomainsUtils.INSTANCE.getWeb3WsDex();
            }
            if (gEmmrt.KWHzl(okxHttpMain)) {
                return gEmmrt.copydefault(okxHttpMain);
            }
            return null;
        }
        if (str == null) {
            str = C43655rtQ.OLrzqt.AhwBna();
        }
        if (str == null) {
            pUU.copydefault("OKDnsManager", "getExecutorWithDohType, cannot get cor host for null site. pls call [setCORDomain] first");
            return null;
        }
        CombinedExecutors combinedExecutorsCopydefault = KWHzl.copydefault(str);
        if (combinedExecutorsCopydefault != null) {
            int i2 = Activity.AEQbTJ[dohTypeEnum.ordinal()];
            if (i2 == 1) {
                return combinedExecutorsCopydefault.getHttpExecutor();
            }
            if (i2 == 2) {
                return combinedExecutorsCopydefault.getV5Executor();
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return combinedExecutorsCopydefault.getDexExecutor();
        }
        SingleExecutor singleExecutorEZpvd = fetchVPNInfo.EZpvd(str);
        if (singleExecutorEZpvd != null) {
            if (dohTypeEnum == singleExecutorEZpvd.getType()) {
                return singleExecutorEZpvd.getExecutor();
            }
            pUU.copydefault("OKDnsManager", "getExecutorWithDohType, get wrong type for h5 cor.expected:" + dohTypeEnum + ", real:" + singleExecutorEZpvd.getType());
            return null;
        }
        pUU.copydefault("OKDnsManager", "getExecutorWithDohType, corExecutors for site:" + str + " is null. pls call [setCORDomain] first");
        return null;
    }

    public final boolean AEQbTJ(@NotNull DohTypeEnum dohTypeEnum, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        C43326rnF c43326rnFKWHzl = KWHzl(dohTypeEnum, z, str);
        if (c43326rnFKWHzl == null) {
            return false;
        }
        return c43326rnFKWHzl.KWHzl(dohTypeEnum);
    }

    public final java.lang.String EZpvd(@NotNull DohTypeEnum dohTypeEnum) {
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        int i = Activity.AEQbTJ[dohTypeEnum.ordinal()];
        if (i == 1) {
            return DomainsUtils.INSTANCE.getOkxHttpMain().getHolder().getHost();
        }
        if (i == 2) {
            return DomainsUtils.INSTANCE.getOkxWsV5().getHolder().getHost();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return DomainsUtils.INSTANCE.getWeb3WsDex().getHolder().getHost();
    }

    public final ReentrantLock OLrzqt(@NotNull DohTypeEnum dohTypeEnum, boolean z, java.lang.String str) {
        DoHChain okxHttpMain;
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        if (!z) {
            int i = Activity.AEQbTJ[dohTypeEnum.ordinal()];
            if (i == 1) {
                okxHttpMain = DomainsUtils.INSTANCE.getOkxHttpMain();
            } else if (i == 2) {
                okxHttpMain = DomainsUtils.INSTANCE.getOkxWsV5();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                okxHttpMain = DomainsUtils.INSTANCE.getWeb3WsDex();
            }
            if (gEmmrt.KWHzl(okxHttpMain)) {
                return gEmmrt.copydefault(okxHttpMain).EZpvd();
            }
            return null;
        }
        if (str == null) {
            str = C43655rtQ.OLrzqt.AhwBna();
        }
        java.lang.String str2 = "getWaitLock, corExecutors for site:" + str + " is null. pls call [setCORDomain] first";
        if (str == null) {
            pUU.copydefault("OKDnsManager", str2);
            return null;
        }
        CombinedExecutors combinedExecutorsCopydefault = KWHzl.copydefault(str);
        if (combinedExecutorsCopydefault == null) {
            pUU.copydefault("OKDnsManager", str2);
            return null;
        }
        int i2 = Activity.AEQbTJ[dohTypeEnum.ordinal()];
        if (i2 == 1) {
            return combinedExecutorsCopydefault.getHttpExecutor().EZpvd();
        }
        if (i2 == 2) {
            return combinedExecutorsCopydefault.getV5Executor().EZpvd();
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return combinedExecutorsCopydefault.getDexExecutor().EZpvd();
    }

    public final java.util.concurrent.locks.Condition copydefault(@NotNull DohTypeEnum dohTypeEnum, boolean z, java.lang.String str) {
        DoHChain okxHttpMain;
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        if (!z) {
            int i = Activity.AEQbTJ[dohTypeEnum.ordinal()];
            if (i == 1) {
                okxHttpMain = DomainsUtils.INSTANCE.getOkxHttpMain();
            } else if (i == 2) {
                okxHttpMain = DomainsUtils.INSTANCE.getOkxWsV5();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                okxHttpMain = DomainsUtils.INSTANCE.getWeb3WsDex();
            }
            if (gEmmrt.KWHzl(okxHttpMain)) {
                return gEmmrt.copydefault(okxHttpMain).OLrzqt();
            }
            return null;
        }
        if (str == null) {
            str = C43655rtQ.OLrzqt.AhwBna();
        }
        java.lang.String str2 = "getWaitCondition, corExecutors for site:" + str + " is null. pls call [setCORDomain] first";
        if (str == null) {
            pUU.copydefault("OKDnsManager", str2);
            return null;
        }
        CombinedExecutors combinedExecutorsCopydefault = KWHzl.copydefault(str);
        if (combinedExecutorsCopydefault == null) {
            pUU.copydefault("OKDnsManager", str2);
            return null;
        }
        int i2 = Activity.AEQbTJ[dohTypeEnum.ordinal()];
        if (i2 == 1) {
            return combinedExecutorsCopydefault.getHttpExecutor().OLrzqt();
        }
        if (i2 == 2) {
            return combinedExecutorsCopydefault.getV5Executor().OLrzqt();
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return combinedExecutorsCopydefault.getDexExecutor().OLrzqt();
    }

    public final java.util.ArrayList<java.lang.String> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C43368rnv.copydefault.copydefault(str);
    }

    public final java.lang.String EZpvd(@NotNull DohTypeEnum dohTypeEnum, boolean z) {
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        int i = Activity.AEQbTJ[dohTypeEnum.ordinal()];
        if (i == 1) {
            return C43368rnv.copydefault.copydefault(z);
        }
        if (i == 2) {
            return C43368rnv.copydefault.KWHzl(z);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C43368rnv.copydefault.EZpvd(z);
    }

    public final java.util.ArrayList<java.lang.String> KWHzl(@NotNull DohTypeEnum dohTypeEnum, @NotNull java.lang.String str) {
        SchemeType schemeType;
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i = Activity.AEQbTJ[dohTypeEnum.ordinal()];
        if (i == 1) {
            schemeType = SchemeType.HTTP;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            schemeType = SchemeType.WS;
        }
        return C43365rns.OLrzqt.EZpvd(OKDohConfig.Companion.KWHzl(schemeType), str);
    }

    public final boolean AuCTel() {
        return DbNXlk.get();
    }

    public final void EZpvd(boolean z) {
        DbNXlk.set(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OKDnsManager$setCORDomain$1 oKDnsManager$setCORDomain$1;
        java.lang.Object objEZpvd;
        if (continuation instanceof OKDnsManager$setCORDomain$1) {
            oKDnsManager$setCORDomain$1 = (OKDnsManager$setCORDomain$1) continuation;
            int i = oKDnsManager$setCORDomain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKDnsManager$setCORDomain$1.label = i - Integer.MIN_VALUE;
            } else {
                oKDnsManager$setCORDomain$1 = new OKDnsManager$setCORDomain$1(this, continuation);
            }
        }
        java.lang.Object objWithTimeoutOrNull = oKDnsManager$setCORDomain$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKDnsManager$setCORDomain$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithTimeoutOrNull);
            if (str.length() == 0 || str2.length() == 0 || str3.length() == 0 || str4.length() == 0) {
                java.lang.String str5 = "setCORDomain, failed! Not allowed empty params. userSite:" + str + ", httpHost:" + str2 + ", wsv5Host:" + str3 + ", wsDexHost:" + str4;
                pUU.valueOf("OKDnsManager", str5);
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.io.IOException(str5)));
            }
            OKDnsManager$setCORDomain$success$1 oKDnsManager$setCORDomain$success$1 = new OKDnsManager$setCORDomain$success$1(str, str2, str3, str4, null);
            oKDnsManager$setCORDomain$1.label = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, oKDnsManager$setCORDomain$success$1, oKDnsManager$setCORDomain$1);
            if (objWithTimeoutOrNull == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithTimeoutOrNull);
        }
        java.lang.Boolean bool = (java.lang.Boolean) objWithTimeoutOrNull;
        pUU.KWHzl("OKDnsManager", "setCORDomain, finish. result:" + (bool != null));
        Function1<NetworkStringEnum, java.lang.String> function1ZsXlph = C43292rmY.OLrzqt.zsXlph();
        java.lang.String strInvoke = function1ZsXlph != null ? function1ZsXlph.invoke(NetworkStringEnum.NETWORK_ERROR) : null;
        if (bool != null) {
            Result.Application application2 = Result.Companion;
            objEZpvd = Unit.INSTANCE;
        } else {
            Result.Application application3 = Result.Companion;
            objEZpvd = C56391yDq.EZpvd(new java.io.IOException(strInvoke));
        }
        return Result.m7377constructorimpl(objEZpvd);
    }

    /* JADX INFO: renamed from: setH5CORDomain-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8707setH5CORDomainBWLJW6A$default(C43372rnz c43372rnz, java.lang.String str, java.lang.String str2, long j, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = WorkRequest.MIN_BACKOFF_MILLIS;
        }
        return c43372rnz.OLrzqt(str, str2, j, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OKDnsManager$setH5CORDomain$1 oKDnsManager$setH5CORDomain$1;
        if (continuation instanceof OKDnsManager$setH5CORDomain$1) {
            oKDnsManager$setH5CORDomain$1 = (OKDnsManager$setH5CORDomain$1) continuation;
            int i = oKDnsManager$setH5CORDomain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKDnsManager$setH5CORDomain$1.label = i - Integer.MIN_VALUE;
            } else {
                oKDnsManager$setH5CORDomain$1 = new OKDnsManager$setH5CORDomain$1(this, continuation);
            }
        }
        OKDnsManager$setH5CORDomain$1 oKDnsManager$setH5CORDomain$12 = oKDnsManager$setH5CORDomain$1;
        java.lang.Object obj = oKDnsManager$setH5CORDomain$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKDnsManager$setH5CORDomain$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        oKDnsManager$setH5CORDomain$12.label = 1;
        java.lang.Object objKWHzl = KWHzl(str, str2, j, "native", oKDnsManager$setH5CORDomain$12);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OKDnsManager$setH5CORDomainWithFrom$1 oKDnsManager$setH5CORDomainWithFrom$1;
        java.lang.Object objEZpvd;
        if (continuation instanceof OKDnsManager$setH5CORDomainWithFrom$1) {
            oKDnsManager$setH5CORDomainWithFrom$1 = (OKDnsManager$setH5CORDomainWithFrom$1) continuation;
            int i = oKDnsManager$setH5CORDomainWithFrom$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKDnsManager$setH5CORDomainWithFrom$1.label = i - Integer.MIN_VALUE;
            } else {
                oKDnsManager$setH5CORDomainWithFrom$1 = new OKDnsManager$setH5CORDomainWithFrom$1(this, continuation);
            }
        }
        OKDnsManager$setH5CORDomainWithFrom$1 oKDnsManager$setH5CORDomainWithFrom$12 = oKDnsManager$setH5CORDomainWithFrom$1;
        java.lang.Object obj = oKDnsManager$setH5CORDomainWithFrom$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKDnsManager$setH5CORDomainWithFrom$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            oKDnsManager$setH5CORDomainWithFrom$12.L$0 = str;
            oKDnsManager$setH5CORDomainWithFrom$12.L$1 = str2;
            oKDnsManager$setH5CORDomainWithFrom$12.L$2 = str3;
            oKDnsManager$setH5CORDomainWithFrom$12.label = 1;
            objEZpvd = EZpvd(str, str2, str3, j, oKDnsManager$setH5CORDomainWithFrom$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (java.lang.String) oKDnsManager$setH5CORDomainWithFrom$12.L$2;
            str2 = (java.lang.String) oKDnsManager$setH5CORDomainWithFrom$12.L$1;
            str = (java.lang.String) oKDnsManager$setH5CORDomainWithFrom$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        C43461rpi.copydefault.copydefault(Result.m7384isSuccessimpl(objEZpvd), str, str2, str3);
        return objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OKDnsManager$setH5CORDomainInternal$1 oKDnsManager$setH5CORDomainInternal$1;
        if (continuation instanceof OKDnsManager$setH5CORDomainInternal$1) {
            oKDnsManager$setH5CORDomainInternal$1 = (OKDnsManager$setH5CORDomainInternal$1) continuation;
            int i = oKDnsManager$setH5CORDomainInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKDnsManager$setH5CORDomainInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                oKDnsManager$setH5CORDomainInternal$1 = new OKDnsManager$setH5CORDomainInternal$1(this, continuation);
            }
        }
        java.lang.Object objWithTimeoutOrNull = oKDnsManager$setH5CORDomainInternal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKDnsManager$setH5CORDomainInternal$1.label;
        java.lang.String str4 = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithTimeoutOrNull);
            pUU.KWHzl("OKDnsManager", "setH5CORDomain, start. userSite:" + str + ", httpHost:" + str2 + ", from:" + str3);
            if (str.length() == 0 && str2.length() == 0) {
                EZpvd();
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(Unit.INSTANCE);
            }
            if (str.length() == 0 || str2.length() == 0) {
                pUU.KWHzl("OKDnsManager", "setH5CORDomain, needIgnore true. return failed");
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.io.IOException("setH5CORDomain, needIgnore true. return failed")));
            }
            OKDnsManager$setH5CORDomainInternal$success$1 oKDnsManager$setH5CORDomainInternal$success$1 = new OKDnsManager$setH5CORDomainInternal$success$1(str, str2, null);
            oKDnsManager$setH5CORDomainInternal$1.label = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, oKDnsManager$setH5CORDomainInternal$success$1, oKDnsManager$setH5CORDomainInternal$1);
            if (objWithTimeoutOrNull == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithTimeoutOrNull);
        }
        java.lang.Boolean bool = (java.lang.Boolean) objWithTimeoutOrNull;
        pUU.KWHzl("OKDnsManager", "setH5CORDomain, finish. result:" + (bool != null));
        Function1<NetworkStringEnum, java.lang.String> function1ZsXlph = C43292rmY.OLrzqt.zsXlph();
        if (function1ZsXlph != null) {
            str4 = ((java.lang.Object) function1ZsXlph.invoke(NetworkStringEnum.NETWORK_ERROR)) + "-timeout";
        }
        Result.Application application3 = Result.Companion;
        return Result.m7377constructorimpl(bool != null ? Unit.INSTANCE : C56391yDq.EZpvd(new java.io.IOException(str4)));
    }

    public final void EZpvd() {
        pUU.KWHzl("OKDnsManager", "clearH5CORDomain, start");
        fetchVPNInfo.copydefault(null);
        fetchVPNInfo.AEQbTJ();
    }

    public final void KWHzl(java.lang.String str) {
        pUU.KWHzl("OKDnsManager", "clearCORDomain, start. userSite:" + str);
        AhwBna(str);
        if (str == null) {
            KWHzl.copydefault();
        } else {
            KWHzl.AEQbTJ(str);
        }
        KWHzl.AEQbTJ();
    }

    public final void AhwBna(java.lang.String str) {
        java.lang.String strEZpvd = fetchVPNInfo.EZpvd();
        if (strEZpvd == null) {
            return;
        }
        CombinedExecutors combinedExecutorsCopydefault = KWHzl.copydefault(strEZpvd);
        java.lang.String queryHost = combinedExecutorsCopydefault != null ? combinedExecutorsCopydefault.getHttpExecutor().copydefault().getQueryHost() : null;
        SingleExecutor singleExecutorEZpvd = fetchVPNInfo.EZpvd(strEZpvd);
        if (queryHost == null || singleExecutorEZpvd != null) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strEZpvd) || str == null) {
            fetchVPNInfo.EZpvd(strEZpvd, queryHost);
            fetchVPNInfo.EZpvd(0L);
            pUU.KWHzl("OKDnsManager", "restartH5CORIfNeed, restart success for " + strEZpvd + ". domain:" + queryHost);
        }
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        CombinedExecutors combinedExecutorsCopydefault = KWHzl.copydefault(str);
        if (combinedExecutorsCopydefault == null) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) combinedExecutorsCopydefault.getHttpExecutor().copydefault().getQueryHost(), (java.lang.Object) str2) && Intrinsics.EZpvd((java.lang.Object) combinedExecutorsCopydefault.getV5Executor().copydefault().getQueryHost(), (java.lang.Object) str3) && Intrinsics.EZpvd((java.lang.Object) combinedExecutorsCopydefault.getDexExecutor().copydefault().getQueryHost(), (java.lang.Object) str4)) {
            return;
        }
        pUU.KWHzl("OKDnsManager", "clearSameSiteCache, clear cache:" + str);
        C43365rns.OLrzqt.OLrzqt(str);
    }

    public final boolean AEQbTJ(InterfaceC43328rnH interfaceC43328rnH) {
        java.lang.String queryHost = interfaceC43328rnH.getQueryHost();
        if (queryHost.length() == 0) {
            return false;
        }
        if (!copydefault(queryHost)) {
            return C43365rns.OLrzqt.AEQbTJ(interfaceC43328rnH.dohHostKey(), interfaceC43328rnH.getCORUserSite()).length() != 0;
        }
        pUU.KWHzl("OKDnsManager", "isCORDomainAllSuccess, canDirectConnect:" + queryHost);
        return true;
    }

    public final boolean gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        CombinedExecutors combinedExecutorsCopydefault = KWHzl.copydefault(str);
        if (combinedExecutorsCopydefault == null) {
            return false;
        }
        java.util.Iterator it = yDY.gEmmrt(combinedExecutorsCopydefault.getHttpExecutor().copydefault(), combinedExecutorsCopydefault.getV5Executor().copydefault(), combinedExecutorsCopydefault.getDexExecutor().copydefault()).iterator();
        while (it.hasNext()) {
            if (!AEQbTJ((InterfaceC43328rnH) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (gEmmrt(str)) {
            return true;
        }
        SingleExecutor singleExecutorEZpvd = fetchVPNInfo.EZpvd(str);
        if (singleExecutorEZpvd == null) {
            return false;
        }
        return AEQbTJ(singleExecutorEZpvd.getExecutor().copydefault());
    }

    public static /* synthetic */ void sendCORSuccessEvent$OKNetwork_network$default(C43372rnz c43372rnz, java.lang.String str, CoroutineDispatcher coroutineDispatcher, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineDispatcher = Dispatchers.getDefault();
        }
        c43372rnz.AEQbTJ(str, coroutineDispatcher);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        if (KWHzl.EZpvd(str) || fetchVPNInfo.AEQbTJ(str)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new OKDnsManager$sendCORSuccessEvent$1(str, null), 3, null);
        }
    }

    public static /* synthetic */ void initCorHost$OKNetwork_network$default(C43372rnz c43372rnz, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(C43466rpn.OLrzqt.OLrzqt()));
        }
        c43372rnz.KWHzl(coroutineScope);
    }

    public final void KWHzl(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        java.lang.String strAhwBna = C43655rtQ.OLrzqt.AhwBna();
        pUU.KWHzl("OKDnsManager", "initCorHost, start,site:" + strAhwBna);
        if (strAhwBna != null) {
            KWHzl.KWHzl(strAhwBna);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKDnsManager$initCorHost$1(null), 3, null);
    }

    public static /* synthetic */ java.lang.String getCORHost$OKNetwork_network$default(C43372rnz c43372rnz, DohTypeEnum dohTypeEnum, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c43372rnz.AEQbTJ(dohTypeEnum, str);
    }

    public final java.lang.String AEQbTJ(@NotNull DohTypeEnum dohTypeEnum, java.lang.String str) {
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        if (str == null) {
            str = C43655rtQ.OLrzqt.AhwBna();
        }
        if (str == null) {
            pUU.copydefault("OKDnsManager", "getCORHost, cannot get cor host for null site. pls call [setCORDomain] first");
            return null;
        }
        CombinedExecutors combinedExecutorsCopydefault = KWHzl.copydefault(str);
        if (combinedExecutorsCopydefault != null) {
            int i = Activity.AEQbTJ[dohTypeEnum.ordinal()];
            if (i == 1) {
                return combinedExecutorsCopydefault.getHttpExecutor().copydefault().getQueryHost();
            }
            if (i == 2) {
                return combinedExecutorsCopydefault.getV5Executor().copydefault().getQueryHost();
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return combinedExecutorsCopydefault.getDexExecutor().copydefault().getQueryHost();
        }
        SingleExecutor singleExecutorEZpvd = fetchVPNInfo.EZpvd(str);
        if (singleExecutorEZpvd != null) {
            if (dohTypeEnum == singleExecutorEZpvd.getType()) {
                return singleExecutorEZpvd.getExecutor().copydefault().getQueryHost();
            }
            pUU.copydefault("OKDnsManager", "getCORHost, get wrong type for h5 cor.expected:" + dohTypeEnum + ", real:" + singleExecutorEZpvd.getType());
            return null;
        }
        pUU.copydefault("OKDnsManager", "getCORHost, corExecutors for site:" + str + " is null. pls call [setCORDomain] first");
        return null;
    }

    public final java.util.Enumeration<DoHChain> DbNXlk() {
        return gEmmrt.copydefault();
    }

    public final java.util.List<java.lang.String> valueOf() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(OKDohConfig.Companion.KWHzl(DohTypeEnum.HTTP));
        arrayList.addAll(KWHzl.EZpvd());
        return arrayList;
    }

    public final java.util.List<java.lang.String> djBIcL() {
        java.lang.String strEZpvd;
        java.lang.String strValueOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Map.Entry<DoHChain, C43326rnF> entry : gEmmrt.EZpvd()) {
            if (entry.getKey().getNetType() == NetType.HTTP && (strValueOf = entry.getValue().valueOf()) != null) {
                arrayList.add(strValueOf);
            }
        }
        java.util.Iterator<T> it = KWHzl.OLrzqt().iterator();
        while (it.hasNext()) {
            java.lang.String strEZpvd2 = copydefault.EZpvd(DohTypeEnum.HTTP, true, (java.lang.String) it.next());
            if (strEZpvd2 != null) {
                arrayList.add(strEZpvd2);
            }
        }
        Map.Entry<java.lang.String, SingleExecutor> entryOLrzqt = fetchVPNInfo.OLrzqt();
        if (entryOLrzqt != null && (strEZpvd = copydefault.EZpvd(DohTypeEnum.HTTP, true, entryOLrzqt.getKey())) != null) {
            arrayList.add(strEZpvd);
        }
        return arrayList;
    }

    public final java.lang.String fetchVPNInfo() {
        return fetchVPNInfo.EZpvd();
    }

    public final void EZpvd(@NotNull DoHChain doHChain, @NotNull DoHChain doHChain2, @NotNull DoHChain doHChain3, @NotNull DoHChain doHChain4, @NotNull DoHChain doHChain5) {
        Intrinsics.checkNotNullParameter(doHChain, "");
        Intrinsics.checkNotNullParameter(doHChain2, "");
        Intrinsics.checkNotNullParameter(doHChain3, "");
        Intrinsics.checkNotNullParameter(doHChain4, "");
        Intrinsics.checkNotNullParameter(doHChain5, "");
        DomainsUtils.INSTANCE.setupDomains(doHChain, doHChain2, doHChain3, doHChain4, doHChain5);
    }
}
