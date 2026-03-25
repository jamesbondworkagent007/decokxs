package o;

import com.just.agentweb.DefaultWebClient;
import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.okg.dns.DohPingInfo;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.LinkReporter;
import com.okinc.network.okg.dns.executor.OKDnsExecutor$getCnHttpDns$1;
import com.okinc.network.okg.dns.executor.OKDnsExecutor$getOverseaHttpDns$dnsGroupTasks$1;
import com.okinc.network.okg.dns.executor.OKDnsExecutor$getOverseaHttpDns$dnsGroupTasks$2;
import com.okinc.network.okg.dns.executor.OKDnsExecutor$getOverseaHttpDns$dnsGroupTasks$3;
import com.okinc.network.okg.dns.executor.OKDnsExecutor$handleDNSQueryResponse$2$result$1;
import com.okinc.network.okg.dns.executor.OKDohConfig;
import com.okinc.network.okg.dns.model.Answer;
import com.okinc.network.okg.dns.model.CnDecryptionNode;
import com.okinc.network.okg.dns.model.DNSQueryBean;
import com.okinc.network.okg.dns.model.DynamicCnameHostBean;
import com.okinc.network.okg.dns.model.Stages;
import com.okinc.network.request.SchemeType;
import com.okinc.network.util.DOHDispatcherIO;
import java.net.UnknownHostException;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.C43365rns;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43326rnF {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final CompletionService<DohPingInfo> AEQbTJ;
    public java.lang.String AYXKKw;
    public final ThreadPoolExecutor AhwBna;
    public long AkhnZx;
    public final CompletionService<java.util.ArrayList<C43365rns.Activity>> EZpvd;
    public final java.lang.String OLrzqt;
    public final java.util.concurrent.locks.Condition copydefault;
    public final CoroutineDispatcher djBIcL;
    public java.lang.String fetchVPNInfo;
    public final ReentrantLock gEmmrt;
    public InterfaceC58217yxC isConnected;
    public final InterfaceC43328rnH valueOf;
    public final CompletionService<C43365rns.TaskDescription> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReentrantLock EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl(int i) {
        return i == 0 ? "cloudflare-dns.com" : "dns.google";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.concurrent.locks.Condition OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC43328rnH copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.fetchVPNInfo;
    }

    public C43326rnF(@NotNull InterfaceC43328rnH interfaceC43328rnH, @NotNull ReentrantLock reentrantLock, @NotNull java.util.concurrent.locks.Condition condition, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC43328rnH, "");
        Intrinsics.checkNotNullParameter(reentrantLock, "");
        Intrinsics.checkNotNullParameter(condition, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.valueOf = interfaceC43328rnH;
        this.gEmmrt = reentrantLock;
        this.copydefault = condition;
        this.djBIcL = coroutineDispatcher;
        this.OLrzqt = "DNS-" + interfaceC43328rnH.logTag();
        this.AkhnZx = 60L;
        this.fetchVPNInfo = "";
        this.AYXKKw = "";
        ThreadPoolExecutor threadPoolExecutorKWHzl = C43357rnk.KWHzl.KWHzl(ThreadPoolType.DOH);
        this.AhwBna = threadPoolExecutorKWHzl;
        this.AEQbTJ = new ExecutorCompletionService(threadPoolExecutorKWHzl);
        this.values = new ExecutorCompletionService(threadPoolExecutorKWHzl);
        this.EZpvd = new ExecutorCompletionService(threadPoolExecutorKWHzl);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 o.rnH)
  (r2v0 java.util.concurrent.locks.ReentrantLock)
  (r3v0 java.util.concurrent.locks.Condition)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x000a: INVOKE 
  (wrap:com.okinc.network.util.DOHDispatcherIO:0x0006: INVOKE 
  (wrap:com.okinc.network.util.DOHDispatcherIO$Activity:0x0004: SGET  A[WRAPPED] (LINE:57) com.okinc.network.util.DOHDispatcherIO.Companion com.okinc.network.util.DOHDispatcherIO$Activity)
 VIRTUAL call: com.okinc.network.util.DOHDispatcherIO.Activity.KWHzl():com.okinc.network.util.DOHDispatcherIO A[MD:():com.okinc.network.util.DOHDispatcherIO (m), WRAPPED] (LINE:57))
 VIRTUAL call: com.okinc.network.util.DOHDispatcherIO.getDispatcher():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:57)) : (r4v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(o.rnH, java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Condition, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:54) call: o.rnF.<init>(o.rnH, java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Condition, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ C43326rnF(InterfaceC43328rnH interfaceC43328rnH, ReentrantLock reentrantLock, java.util.concurrent.locks.Condition condition, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC43328rnH, reentrantLock, condition, (i & 8) != 0 ? DOHDispatcherIO.Companion.KWHzl().getDispatcher() : coroutineDispatcher);
    }

    /* JADX INFO: renamed from: o.rnF$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rnF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void AEQbTJ(CoroutineDispatcher coroutineDispatcher) {
            C43372rnz.copydefault.EZpvd(true);
        }
    }

    public static /* synthetic */ void startTimer$default(C43326rnF c43326rnF, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        c43326rnF.KWHzl(j);
    }

    public final void KWHzl(long j) {
        if (!this.valueOf.isActive()) {
            pUU.KWHzl(this.OLrzqt, "is not active.stop timer!");
            gEmmrt();
            return;
        }
        pUU.KWHzl(this.OLrzqt, "start initialDelay: " + j);
        gEmmrt();
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(j, this.AkhnZx, java.util.concurrent.TimeUnit.SECONDS, C43357rnk.KWHzl.EZpvd(ThreadPoolType.DOH));
        final Function1 function1 = new Function1() { // from class: o.rnI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43326rnF.AEQbTJ(this.copydefault, (java.lang.Long) obj);
            }
        };
        this.isConnected = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rnJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43326rnF.AEQbTJ(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.rnF$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((C43365rns.TaskDescription) t).OLrzqt()), java.lang.Long.valueOf(((C43365rns.TaskDescription) t2).OLrzqt()));
        }
    }

    /* JADX INFO: renamed from: o.rnF$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((DohPingInfo) t).getFmtTime()), java.lang.Double.valueOf(((DohPingInfo) t2).getFmtTime()));
        }
    }

    /* JADX INFO: renamed from: o.rnF$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((DohPingInfo) t).getFmtTime()), java.lang.Double.valueOf(((DohPingInfo) t2).getFmtTime()));
        }
    }

    /* JADX INFO: renamed from: o.rnF$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((C43365rns.TaskDescription) t).OLrzqt()), java.lang.Long.valueOf(((C43365rns.TaskDescription) t2).OLrzqt()));
        }
    }

    /* JADX INFO: renamed from: o.rnF$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((C43365rns.TaskDescription) t).OLrzqt()), java.lang.Long.valueOf(((C43365rns.TaskDescription) t2).OLrzqt()));
        }
    }

    /* JADX INFO: renamed from: o.rnF$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((DohPingInfo) t).getFmtTime()), java.lang.Double.valueOf(((DohPingInfo) t2).getFmtTime()));
        }
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C43326rnF c43326rnF, java.lang.Long l) {
        pUU.KWHzl(c43326rnF.OLrzqt, "thread = " + java.lang.Thread.currentThread().getName());
        c43326rnF.AYXKKw = c43326rnF.fetchVPNInfo;
        c43326rnF.fetchVPNInfo = "";
        c43326rnF.KWHzl();
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        InterfaceC58217yxC interfaceC58217yxC = this.isConnected;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final java.lang.String valueOf() {
        java.lang.String queryHost = this.valueOf.getQueryHost();
        if (queryHost == null) {
            return null;
        }
        return (AYXKKw() && C43372rnz.copydefault.copydefault(queryHost)) ? queryHost : C43365rns.OLrzqt.AEQbTJ(this.valueOf.dohHostKey(), this.valueOf.getCORUserSite());
    }

    public final void KWHzl() {
        java.lang.String queryHost = this.valueOf.getQueryHost();
        if (queryHost == null || queryHost.length() == 0) {
            pUU.KWHzl(this.OLrzqt, "getHostAndDNS, queryHost is empty,ignore.");
        } else {
            djBIcL(queryHost);
        }
    }

    public final void djBIcL(@NotNull java.lang.String str) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.OLrzqt, "getHostAndDNS, start. queryHost:" + str);
        LinkReporter linkReporter = new LinkReporter();
        linkReporter.onStart();
        if (this.valueOf.isConfigForCOR()) {
            strKWHzl = C43372rnz.copydefault.AEQbTJ(DohTypeEnum.HTTP, this.valueOf.getCORUserSite());
        } else {
            strKWHzl = OKDohConfig.Companion.KWHzl(DohTypeEnum.HTTP);
        }
        java.lang.String str2 = strKWHzl;
        C43365rns c43365rns = C43365rns.OLrzqt;
        boolean z = C43365rns.canAccessOKX$default(c43365rns, this.OLrzqt, str2, 0, 4, null) || c43365rns.copydefault(this.OLrzqt);
        boolean zAYXKKw = AYXKKw();
        if (zAYXKKw) {
            Companion.AEQbTJ(this.djBIcL);
        }
        copydefault(z, zAYXKKw, str);
        linkReporter.onPrepareFinish();
        linkReporter.setBasicInfo(str, this.valueOf.getQueryScheme() == SchemeType.HTTP, this.valueOf.isConfigForCOR(), z, java.lang.System.currentTimeMillis(), C43453rpa.AEQbTJ.OLrzqt(), C43372rnz.copydefault.AuCTel());
        if (!z) {
            pUU.KWHzl(this.OLrzqt, "getHostAndDNS get cn dns");
            getCnHttpDns$default(this, str, 0, linkReporter, false, 8, null);
        } else {
            pUU.KWHzl(this.OLrzqt, "getHostAndDNS getOverseaHttpDns");
            OLrzqt(str, linkReporter);
        }
    }

    public final void copydefault(boolean z, boolean z2, java.lang.String str) {
        java.lang.Boolean boolValueOf;
        if (!z) {
            boolValueOf = java.lang.Boolean.FALSE;
        } else if (!z2) {
            boolValueOf = null;
        } else if (C43372rnz.copydefault.AhwBna() && C43365rns.canAccessOKX$default(C43365rns.OLrzqt, this.OLrzqt, str, 0, 4, null)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.String strEZpvd = EZpvd(arrayList, new java.util.ArrayList<>());
            boolValueOf = java.lang.Boolean.valueOf(!(strEZpvd == null || strEZpvd.length() == 0));
        } else {
            boolValueOf = java.lang.Boolean.FALSE;
        }
        if (boolValueOf != null) {
            C43372rnz c43372rnz = C43372rnz.copydefault;
            c43372rnz.copydefault(str, boolValueOf.booleanValue());
            java.lang.String cORUserSite = this.valueOf.getCORUserSite();
            if (boolValueOf.booleanValue() && cORUserSite != null) {
                pUU.KWHzl(this.OLrzqt, "setDirectConnectResult," + str + " connect success and sendCORSuccessEvent for " + cORUserSite);
                C43372rnz.sendCORSuccessEvent$OKNetwork_network$default(c43372rnz, cORUserSite, null, 2, null);
            }
        }
        pUU.KWHzl(this.OLrzqt, "OKDnsExecutor, setDirectConnectResult, host:" + str + ", connectSuccess:" + boolValueOf);
    }

    public static /* synthetic */ void getCnHttpDns$default(C43326rnF c43326rnF, java.lang.String str, int i, LinkReporter linkReporter, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        c43326rnF.AEQbTJ(str, i, linkReporter, z);
    }

    public final void AEQbTJ(java.lang.String str, int i, LinkReporter linkReporter, boolean z) {
        java.lang.String str2;
        copydefault("cn Start index=" + i + " pingOkxSuccess=" + z);
        C43365rns c43365rns = C43365rns.OLrzqt;
        java.util.ArrayList<java.lang.String> arrayListAEQbTJ = c43365rns.AEQbTJ();
        if (i < 0 || i >= arrayListAEQbTJ.size()) {
            c43365rns.AYXKKw(this.OLrzqt);
            java.lang.String strValueOf = valueOf();
            long j = (strValueOf == null || strValueOf.length() != 0) ? 5L : 2L;
            if (z) {
                try {
                    copydefault("sys dns start");
                    AEQbTJ(str);
                } catch (java.lang.Exception e) {
                    copydefault("cn End e=" + e);
                    this.AkhnZx = 60L;
                }
            } else {
                copydefault("cn End");
                this.AkhnZx = 60L;
            }
            linkReporter.onEnd("fallback-finished");
            KWHzl(j, "fallback-finished");
            return;
        }
        Stages stagesOnLinkStart = linkReporter.onLinkStart(2);
        java.lang.String str3 = arrayListAEQbTJ.get(i);
        Intrinsics.checkNotNullExpressionValue(str3, "");
        java.lang.String str4 = str3;
        if (C59449zhJ.startsWith$default(str4, DefaultWebClient.HTTP_SCHEME, false, 2, null) || C59449zhJ.startsWith$default(str4, DefaultWebClient.HTTPS_SCHEME, false, 2, null)) {
            str2 = str4 + OLrzqt(str);
        } else if (c43365rns.gEmmrt(str4)) {
            str2 = DefaultWebClient.HTTP_SCHEME + str4 + OLrzqt(str);
        } else {
            str2 = DefaultWebClient.HTTPS_SCHEME + str4 + OLrzqt(str);
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getUnconfined()), null, null, new OKDnsExecutor$getCnHttpDns$1(this, str2, i, z, linkReporter, stagesOnLinkStart, str4, str, null), 3, null);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, final LinkReporter linkReporter, final Stages stages, java.lang.String str3) {
        int i;
        int i2;
        java.util.ArrayList arrayList;
        java.util.List<Answer> answer;
        try {
            pUU.KWHzl(this.OLrzqt, "cloud doh request success,resp = " + str);
            DNSQueryBean dNSQueryBean = (DNSQueryBean) C33490mxT.EZpvd(str, DNSQueryBean.class);
            final java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i3 = Integer.MAX_VALUE;
            if (dNSQueryBean != null && (answer = dNSQueryBean.getAnswer()) != null) {
                for (Answer answer2 : answer) {
                    DynamicCnameHostBean dynamicCnameHostBeanKWHzl = C43323rnC.EZpvd.KWHzl(answer2.getData(), this.OLrzqt);
                    if (answer2.getType() == 16 && dynamicCnameHostBeanKWHzl != null) {
                        int iMin = java.lang.Math.min(i3, answer2.getTTL());
                        arrayList2.add(dynamicCnameHostBeanKWHzl);
                        linkReporter.onGetConfigSuccess(stages, str3, dynamicCnameHostBeanKWHzl.getCname(), answer2.getTTL(), dynamicCnameHostBeanKWHzl.getHostList(), answer2.getName(), null);
                        i3 = iMin;
                    }
                }
            }
            int i4 = i3;
            linkReporter.onPingCNameStart(stages);
            this.EZpvd.submit(new Callable() { // from class: o.rnL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return C43326rnF.KWHzl(arrayList2, linkReporter, stages);
                }
            });
            java.util.ArrayList<C43365rns.Activity> arrayList3 = this.EZpvd.take().get();
            pUU.EZpvd(this.OLrzqt, "cloud get host ips = " + arrayList3);
            linkReporter.onIsAvailableTestStart(stages);
            Intrinsics.copydefault(arrayList3);
            for (final C43365rns.Activity activity : arrayList3) {
                this.values.submit(new Callable() { // from class: o.rnK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return C43326rnF.EZpvd(activity);
                    }
                });
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            int size = arrayList3.size();
            int i5 = 0;
            while (i5 < size) {
                C43365rns.TaskDescription taskDescription = this.values.take().get();
                pUU.KWHzl(this.OLrzqt, "cloudIpInfo " + taskDescription);
                if (taskDescription.copydefault()) {
                    C43365rns.Activity activityEZpvd = taskDescription.EZpvd();
                    java.util.List<java.lang.String> hostList = activityEZpvd.AEQbTJ().getHostList();
                    java.util.ArrayList<java.lang.String> arrayList5 = new java.util.ArrayList<>();
                    arrayList5.add(activityEZpvd.copydefault());
                    java.lang.String strEZpvd = EZpvd(hostList, arrayList5);
                    if (strEZpvd != null && strEZpvd.length() != 0) {
                        taskDescription.KWHzl(strEZpvd);
                        arrayList4.add(taskDescription);
                    }
                    for (java.lang.String str4 : hostList) {
                        if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) strEZpvd)) {
                            java.lang.String str5 = strEZpvd;
                            i = i5;
                            i2 = size;
                            arrayList = arrayList4;
                            LinkReporter.onIsAvailableTestSuccess$default(linkReporter, stages, str5, activityEZpvd.copydefault(), null, 8, null);
                            break;
                        }
                        LinkReporter.onIsAvailableTestFail$default(linkReporter, stages, str4, activityEZpvd.copydefault(), null, 8, null);
                        arrayList4 = arrayList4;
                        i5 = i5;
                        size = size;
                        strEZpvd = strEZpvd;
                    }
                    i = i5;
                    i2 = size;
                    arrayList = arrayList4;
                } else {
                    i = i5;
                    i2 = size;
                    arrayList = arrayList4;
                }
                i5 = i + 1;
                arrayList4 = arrayList;
                size = i2;
            }
            java.util.ArrayList arrayList6 = arrayList4;
            java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList6, new ActionBar());
            java.util.ArrayList arrayList7 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            java.util.Iterator it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList7.add(((C43365rns.TaskDescription) it.next()).EZpvd());
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList(arrayList7);
            java.util.List listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd(arrayList6, new Fragment());
            java.util.ArrayList arrayList9 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd2, 10));
            java.util.Iterator it2 = listEZpvd2.iterator();
            while (it2.hasNext()) {
                arrayList9.add(((C43365rns.TaskDescription) it2.next()).KWHzl());
            }
            java.util.ArrayList arrayList10 = new java.util.ArrayList(arrayList9);
            if (!arrayList8.isEmpty() && !arrayList10.isEmpty()) {
                pUU.EZpvd(this.OLrzqt, "cloudFlare successIps: " + arrayList8 + ", successHosts: " + arrayList10);
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                for (C43365rns.TaskDescription taskDescription2 : CollectionsKt___CollectionsKt.EZpvd(arrayList6, new LoaderManager())) {
                    if (taskDescription2.KWHzl() != null) {
                        java.lang.String strKWHzl = taskDescription2.KWHzl();
                        Intrinsics.copydefault((java.lang.Object) strKWHzl);
                        arrayList11.add(new kotlin.Pair(strKWHzl, yDY.copydefault(taskDescription2.EZpvd().copydefault())));
                    }
                }
                if (!arrayList11.isEmpty()) {
                    pUU.valueOf(this.OLrzqt, "cloud dns host = " + ((kotlin.Pair) arrayList11.get(0)).getFirst() + " infoList = " + ((kotlin.Pair) arrayList11.get(0)).getSecond());
                    copydefault("cloud success selectHost = " + ((kotlin.Pair) arrayList11.get(0)).getFirst() + " infoList = " + ((kotlin.Pair) arrayList11.get(0)).getSecond());
                    AEQbTJ(str2, arrayList11, this.valueOf.getCORUserSite(), "oversea-finish");
                    long jValueOf = 60;
                    if (i4 >= 60) {
                        jValueOf = C33129mqd.valueOf(java.lang.Integer.valueOf(i4));
                    }
                    this.AkhnZx = jValueOf;
                }
                linkReporter.onEnd("oversea-finish");
                KWHzl(this.AkhnZx, "oversea-finish");
                return;
            }
            copydefault("successIps or successHosts empty, cnameInfo=" + arrayList3);
            AEQbTJ(str2, 0, linkReporter, true);
        } catch (java.lang.Exception e) {
            pUU.OLrzqt(this.OLrzqt, "getCloudFlareHttpDns response exception:", e);
            copydefault("cloud responseStr = " + str + " e = " + e);
            AEQbTJ(str2, 0, linkReporter, true);
        }
    }

    public static final java.util.ArrayList KWHzl(java.util.ArrayList arrayList, LinkReporter linkReporter, Stages stages) {
        java.util.ArrayList arrayList2 = (java.util.ArrayList) BuildersKt__BuildersKt.runBlocking$default(null, new OKDnsExecutor$handleDNSQueryResponse$2$result$1(arrayList, null), 1, null);
        if (arrayList2.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                linkReporter.onPingCNameFail(stages, ((DynamicCnameHostBean) next).getCname());
            }
        } else {
            java.util.Iterator it2 = arrayList2.iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "");
            while (it2.hasNext()) {
                java.lang.Object next2 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next2, "");
                C43365rns.Activity activity = (C43365rns.Activity) next2;
                LinkReporter.onPingCNameSuccess$default(linkReporter, stages, activity.AEQbTJ().getCname(), activity.copydefault(), null, 8, null);
            }
        }
        return arrayList2;
    }

    public static final C43365rns.TaskDescription EZpvd(C43365rns.Activity activity) {
        return C43365rns.OLrzqt.copydefault(activity);
    }

    public final void OLrzqt(final java.lang.String str, final LinkReporter linkReporter) {
        C43458rpf c43458rpf;
        pUU.KWHzl(this.OLrzqt, "getOverseaHttpDns, start");
        final Stages stagesOnLinkStart = linkReporter.onLinkStart(1);
        if (C43372rnz.copydefault.fJNWhG()) {
            c43458rpf = new C43458rpf(str, this.djBIcL, new OKDnsExecutor$getOverseaHttpDns$dnsGroupTasks$1(this), new OKDnsExecutor$getOverseaHttpDns$dnsGroupTasks$2(this));
        } else {
            c43458rpf = new C43458rpf(str, this.djBIcL, new OKDnsExecutor$getOverseaHttpDns$dnsGroupTasks$3(this));
        }
        c43458rpf.copydefault(new Function2() { // from class: o.rnE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C43326rnF.OLrzqt(this.copydefault, str, linkReporter, stagesOnLinkStart, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function1() { // from class: o.rnM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43326rnF.copydefault(this.OLrzqt, linkReporter, stagesOnLinkStart, str, (java.lang.Throwable) obj);
            }
        });
    }

    public static final Unit OLrzqt(C43326rnF c43326rnF, java.lang.String str, LinkReporter linkReporter, Stages stages, java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl(c43326rnF.OLrzqt, "getOverseaHttpDns, response:" + str2 + ", index:" + i);
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            c43326rnF.KWHzl(str2, str, linkReporter, stages, c43326rnF.KWHzl(i));
        } else {
            pUU.copydefault(c43326rnF.OLrzqt, "getOverseaHttpDns, responseStr.body is empty");
            c43326rnF.KWHzl(linkReporter, stages, str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C43326rnF c43326rnF, LinkReporter linkReporter, Stages stages, java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.OLrzqt(c43326rnF.OLrzqt, "getOverseaHttpDns, failed", th);
        c43326rnF.copydefault("cloud onFailure e = " + th);
        c43326rnF.KWHzl(linkReporter, stages, str);
        return Unit.INSTANCE;
    }

    public final void KWHzl(LinkReporter linkReporter, Stages stages, java.lang.String str) {
        linkReporter.onGetConfigFail(stages, KWHzl(0));
        AEQbTJ(str, 0, linkReporter, true);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.lang.String AYXKKw(java.lang.String str) throws java.io.IOException {
        Response responseExecute = C43365rns.OLrzqt.AYXKKw().newCall(new Request.Builder().url(str).addHeader("accept", "application/dns-json").build()).execute();
        try {
            if (AYXKKw()) {
                C43346rnZ.KWHzl.OLrzqt(false);
            }
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody != null && responseExecute.code() == 200) {
                java.lang.String strString = responseBodyBody.string();
                yFA.copydefault(responseExecute, null);
                return strString;
            }
            responseExecute.close();
            throw new java.io.IOException("queryDNS:" + str + ", error. code:" + responseExecute.code());
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                yFA.copydefault(responseExecute, th);
                throw th2;
            }
        }
    }

    public final java.lang.String AhwBna(java.lang.String str) {
        return AYXKKw(EZpvd(str));
    }

    public final java.lang.String gEmmrt(java.lang.String str) {
        return AYXKKw(KWHzl(str));
    }

    public final void copydefault(java.lang.String str) {
        this.fetchVPNInfo = this.fetchVPNInfo + str + "\n\n";
    }

    public static /* synthetic */ void updateDohInfoList$default(C43326rnF c43326rnF, java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        c43326rnF.AEQbTJ(str, (java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<java.lang.String>>>) list, str2, str3);
    }

    public final void AEQbTJ(java.lang.String str, java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<java.lang.String>>> list, java.lang.String str2, java.lang.String str3) {
        pUU.KWHzl(this.OLrzqt, "queryHost:" + str + ", updateDohInfoList, hostAndIps: " + list + ", userSite:" + str2 + ". from:" + str3);
        if (list.isEmpty()) {
            pUU.copydefault(this.OLrzqt, "updateDohInfoList, hostAndIps is empty. return");
            return;
        }
        kotlin.Pair<java.lang.String, ? extends java.util.List<java.lang.String>> pair = list.get(0);
        C43365rns c43365rns = C43365rns.OLrzqt;
        c43365rns.KWHzl(this.valueOf.dohIpKey(), pair.getFirst(), pair.getSecond());
        c43365rns.AEQbTJ(this.valueOf.dohHostKey(), pair.getFirst(), str2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        int i = 1;
        while (true) {
            if (i >= size) {
                break;
            }
            if (arrayList.size() >= C43372rnz.copydefault.OLrzqt()) {
                pUU.KWHzl(this.OLrzqt, "updateDohInfoList,  backupDohList is " + arrayList.size() + ", ignore others");
                break;
            }
            arrayList.add(C56424yEw.gEmmrt(C56390yDp.OLrzqt("query", str), C56390yDp.OLrzqt("host", list.get(i).getFirst()), C56390yDp.OLrzqt("ips", list.get(i).getSecond())));
            i++;
        }
        C43365rns.OLrzqt.AEQbTJ(this.valueOf.dohBackupHostKey(), arrayList, str2);
        AhwBna();
        if (str2 != null) {
            C43372rnz.sendCORSuccessEvent$OKNetwork_network$default(C43372rnz.copydefault, str2, null, 2, null);
        }
    }

    public final boolean KWHzl(@NotNull DohTypeEnum dohTypeEnum) {
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        java.lang.String cORUserSite = this.valueOf.getCORUserSite();
        pUU.KWHzl(this.OLrzqt, "useNextBackupDohConfig, start. userSite:" + cORUserSite);
        C43365rns c43365rns = C43365rns.OLrzqt;
        java.util.Map<java.lang.String, java.lang.Object> mapKWHzl = c43365rns.KWHzl(this.valueOf.dohBackupHostKey(), cORUserSite);
        if (mapKWHzl != null && !mapKWHzl.isEmpty()) {
            try {
                java.lang.Object obj = mapKWHzl.get("host");
                Intrinsics.copydefault(obj, "");
                java.lang.String str = (java.lang.String) obj;
                java.lang.Object obj2 = mapKWHzl.get("ips");
                Intrinsics.copydefault(obj2, "");
                java.util.List<java.lang.String> list = (java.util.List) obj2;
                if (str.length() != 0 && !list.isEmpty()) {
                    if (AEQbTJ(str, list, dohTypeEnum, cORUserSite)) {
                        pUU.KWHzl(this.OLrzqt, "useNextBackupDohConfig, backup and main config is same, ignore. host:" + str + ", ips:" + list);
                        return false;
                    }
                    c43365rns.KWHzl(this.valueOf.dohIpKey(), str, list);
                    c43365rns.AEQbTJ(this.valueOf.dohHostKey(), str, cORUserSite);
                    c43365rns.AhwBna(this.valueOf.dohBackupHostKey(), cORUserSite);
                    pUU.KWHzl(this.OLrzqt, "useNextBackupDohConfig, finished. dohConfig:" + this.valueOf.logTag() + ", host:" + str + ", ips:" + list);
                    copydefault("backup dns tag = " + this.valueOf.logTag() + " host = " + str + " ips = " + list);
                    return true;
                }
                pUU.valueOf(this.OLrzqt, "useNextBackupDohConfig, invalid host:" + str + " and ips:" + list + ". return");
                return false;
            } catch (java.lang.Exception e) {
                pUU.OLrzqt(this.OLrzqt, "useNextBackupDohConfig", e);
            }
        }
        return false;
    }

    public final boolean AEQbTJ(java.lang.String str, java.util.List<java.lang.String> list, DohTypeEnum dohTypeEnum, java.lang.String str2) {
        java.lang.String strAEQbTJ = C43365rns.OLrzqt.AEQbTJ(this.valueOf.dohHostKey(), str2);
        if (!Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) str)) {
            return false;
        }
        java.util.ArrayList<java.lang.String> arrayListKWHzl = C43372rnz.copydefault.KWHzl(dohTypeEnum, strAEQbTJ);
        if (arrayListKWHzl.size() != list.size()) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (!arrayListKWHzl.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void AEQbTJ(java.lang.String str) throws UnknownHostException {
        pUU.KWHzl(this.OLrzqt, "system dns " + str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(str);
        Intrinsics.checkNotNullExpressionValue(allByName, "");
        for (java.net.InetAddress inetAddress : allByName) {
            pUU.KWHzl(this.OLrzqt, inetAddress.getHostName() + "-" + inetAddress.getHostAddress());
            java.lang.String hostAddress = inetAddress.getHostAddress();
            if (hostAddress != null && C43365rns.OLrzqt.gEmmrt(hostAddress)) {
                arrayList.add(hostAddress);
            }
        }
        AEQbTJ(str, C56402yEa.EZpvd(new kotlin.Pair(str, arrayList)), this.valueOf.getCORUserSite(), "system-dns");
        copydefault(arrayList.isEmpty() ^ true ? "sys dns success" : "sys dns empty");
        this.AkhnZx = 60L;
    }

    public final void EZpvd(java.util.List<CnDecryptionNode> list, java.lang.String str, int i, boolean z, int i2, LinkReporter linkReporter, Stages stages) throws ExecutionException, java.lang.InterruptedException {
        double d;
        DohPingInfo dohPingInfo;
        java.lang.String str2;
        boolean z2;
        java.lang.String str3;
        int i3;
        java.util.ArrayList<DohPingInfo> arrayList;
        java.util.ArrayList<DohPingInfo> arrayList2;
        boolean z3;
        LinkReporter linkReporter2;
        java.util.ArrayList<DohPingInfo> arrayList3;
        java.util.ArrayList<DohPingInfo> arrayList4;
        int i4;
        boolean z4;
        java.util.ArrayList arrayList5;
        java.lang.String str4;
        double d2;
        java.lang.String str5;
        C43326rnF c43326rnF = this;
        LinkReporter linkReporter3 = linkReporter;
        Stages stages2 = stages;
        linkReporter.onIsAvailableTestStart(stages);
        int size = list.size();
        java.util.ArrayList<DohPingInfo> arrayList6 = new java.util.ArrayList<>();
        java.util.ArrayList<DohPingInfo> arrayList7 = new java.util.ArrayList<>();
        int i5 = 0;
        boolean z5 = true;
        while (i5 < size) {
            DohPingInfo dohPingInfo2 = c43326rnF.AEQbTJ.take().get();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            boolean zIsSuccess = dohPingInfo2.isSuccess();
            java.lang.String pingTime = dohPingInfo2.getPingTime();
            java.lang.String cname = dohPingInfo2.getCname();
            boolean z6 = z5;
            java.util.ArrayList<java.lang.String> hosts = dohPingInfo2.getHosts();
            int i6 = i5;
            java.util.ArrayList<java.lang.String> ips = dohPingInfo2.getIps();
            int i7 = size;
            int ttl = dohPingInfo2.getTTL();
            java.util.ArrayList<DohPingInfo> arrayList8 = arrayList7;
            java.lang.String log = dohPingInfo2.getLog();
            java.util.ArrayList<DohPingInfo> arrayList9 = arrayList6;
            double dValueOf = C43365rns.OLrzqt.valueOf(pingTime);
            dohPingInfo2.setFmtTime(dValueOf);
            if (zIsSuccess) {
                java.lang.String strEZpvd = c43326rnF.EZpvd(hosts, ips);
                boolean z7 = strEZpvd != null && strEZpvd.length() > 0;
                if (!ips.isEmpty()) {
                    dohPingInfo = dohPingInfo2;
                    java.util.Iterator<java.lang.String> it = hosts.iterator();
                    d = dValueOf;
                    Intrinsics.checkNotNullExpressionValue(it, "");
                    while (true) {
                        if (!it.hasNext()) {
                            str5 = strEZpvd;
                            break;
                        }
                        java.lang.String next = it.next();
                        Intrinsics.checkNotNullExpressionValue(next, "");
                        java.lang.String str6 = next;
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (z7 && Intrinsics.EZpvd((java.lang.Object) str6, (java.lang.Object) strEZpvd)) {
                            str5 = strEZpvd;
                            java.lang.String str7 = ips.get(0);
                            Intrinsics.checkNotNullExpressionValue(str7, "");
                            linkReporter3.onIsAvailableTestSuccess(stages2, str6, str7, java.lang.Long.valueOf(jElapsedRealtime2));
                            break;
                        }
                        java.util.Iterator<java.lang.String> it2 = it;
                        java.lang.String str8 = ips.get(0);
                        Intrinsics.checkNotNullExpressionValue(str8, "");
                        linkReporter3.onIsAvailableTestFail(stages2, str6, str8, java.lang.Long.valueOf(jElapsedRealtime2));
                        strEZpvd = strEZpvd;
                        it = it2;
                    }
                } else {
                    d = dValueOf;
                    str5 = strEZpvd;
                    dohPingInfo = dohPingInfo2;
                }
                z2 = z7;
                str2 = str5;
            } else {
                d = dValueOf;
                dohPingInfo = dohPingInfo2;
                str2 = null;
                z2 = false;
            }
            java.lang.String str9 = c43326rnF.OLrzqt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("node parse isSuccess: ");
            sb.append(z2);
            sb.append(", isPingSuccess=");
            sb.append(zIsSuccess);
            sb.append(" pingTime=");
            sb.append(pingTime);
            sb.append(" data=");
            sb.append(cname);
            sb.append(" hosts=");
            sb.append(hosts);
            java.lang.String str10 = str2;
            sb.append(" ips=");
            sb.append(ips);
            sb.append(" ttl=");
            sb.append(ttl);
            sb.append(" log=$");
            sb.append(log);
            sb.append(" time=");
            double d3 = d;
            sb.append(d3);
            pUU.KWHzl(str9, sb.toString());
            copydefault("node parse isSuccess: " + z2 + ", isPingSuccess=" + zIsSuccess + " pingTime=" + pingTime + " cname=" + cname + " hosts=" + hosts + " ips=" + ips + " ttl=" + ttl + " log=" + log);
            if (z2) {
                Intrinsics.copydefault((java.lang.Object) str10);
                DohPingInfo dohPingInfo3 = dohPingInfo;
                dohPingInfo3.setSuccessHost(str10);
                java.lang.String strValueOf = valueOf();
                if (strValueOf == null || strValueOf.length() != 0) {
                    i3 = i;
                    d2 = d3;
                    str3 = str;
                } else {
                    d2 = d3;
                    str3 = str;
                    AEQbTJ(str3, C56402yEa.EZpvd(new kotlin.Pair(str10, ips)), this.valueOf.getCORUserSite(), "cn-first-available");
                    pUU.KWHzl(this.OLrzqt, "cn dns host = " + str10 + " ips = " + ips + " ttl = " + ttl);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append("cn dns index = ");
                    i3 = i;
                    sb2.append(i3);
                    sb2.append(" it.data = ");
                    sb2.append(cname);
                    sb2.append(" host = ");
                    sb2.append(str10);
                    sb2.append(" ips = ");
                    sb2.append(ips);
                    sb2.append(" ttl = ");
                    sb2.append(ttl);
                    copydefault(sb2.toString());
                }
                if (dohPingInfo3.getNode().isProtectedNode()) {
                    arrayList2 = arrayList9;
                    arrayList2.add(dohPingInfo3);
                } else {
                    arrayList2 = arrayList9;
                    if (d2 <= i2) {
                        arrayList = arrayList8;
                        arrayList.add(dohPingInfo3);
                    }
                    z3 = false;
                }
                arrayList = arrayList8;
                z3 = false;
            } else {
                str3 = str;
                i3 = i;
                arrayList = arrayList8;
                arrayList2 = arrayList9;
                z3 = z6;
            }
            int i8 = i6;
            if (i8 != i7 - 1) {
                linkReporter2 = linkReporter;
                arrayList3 = arrayList2;
                arrayList4 = arrayList;
                i4 = i8;
            } else if (z3) {
                AEQbTJ(str3, i3 + 1, linkReporter, z);
                arrayList3 = arrayList2;
                arrayList4 = arrayList;
                i4 = i8;
                linkReporter2 = linkReporter;
            } else {
                if (arrayList.isEmpty()) {
                    arrayList5 = new java.util.ArrayList(CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Application()));
                } else {
                    arrayList5 = new java.util.ArrayList(CollectionsKt___CollectionsKt.EZpvd(arrayList, new StateListAnimator()));
                }
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.util.Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    DohPingInfo dohPingInfo4 = (DohPingInfo) it3.next();
                    LinkedHashSet<java.lang.String> linkedHashSetOLrzqt = OLrzqt(dohPingInfo4, arrayList, arrayList2);
                    if (dohPingInfo4.getSuccessHost().length() > 0) {
                        java.util.ArrayList<DohPingInfo> arrayList11 = arrayList2;
                        java.util.ArrayList<DohPingInfo> arrayList12 = arrayList;
                        boolean z8 = z3;
                        arrayList10.add(new kotlin.Pair(dohPingInfo4.getSuccessHost(), new java.util.ArrayList(linkedHashSetOLrzqt)));
                        java.util.Iterator it4 = it3;
                        int i9 = i8;
                        pUU.KWHzl(this.OLrzqt, "preferred dns successHost = " + dohPingInfo4.getSuccessHost() + " ips = " + linkedHashSetOLrzqt + " ttl = " + dohPingInfo4.getTTL() + " data=" + dohPingInfo4.getCname());
                        if (dohPingInfo4.getNode().isProtectedNode()) {
                            str4 = "preferred dns protectNode index = " + i3 + " ";
                        } else {
                            str4 = "preferred dns index = " + i3 + " it.cname = " + dohPingInfo4.getCname() + " successHost = " + dohPingInfo4.getSuccessHost() + " ips = " + linkedHashSetOLrzqt + " ttl = " + dohPingInfo4.getTTL();
                        }
                        copydefault(str4);
                        z3 = z8;
                        it3 = it4;
                        arrayList = arrayList12;
                        arrayList2 = arrayList11;
                        i8 = i9;
                    }
                }
                arrayList3 = arrayList2;
                arrayList4 = arrayList;
                i4 = i8;
                z4 = z3;
                if (!arrayList10.isEmpty()) {
                    AEQbTJ(str3, arrayList10, this.valueOf.getCORUserSite(), "cn-finish");
                    this.AkhnZx = C33129mqd.valueOf(java.lang.Integer.valueOf(((DohPingInfo) arrayList5.get(0)).getTTL()));
                    linkReporter2 = linkReporter;
                    linkReporter2.onEnd("cn-finish");
                    KWHzl(this.AkhnZx, "cn-finish");
                } else {
                    linkReporter2 = linkReporter;
                }
                i5 = i4 + 1;
                c43326rnF = this;
                linkReporter3 = linkReporter2;
                z5 = z4;
                size = i7;
                arrayList7 = arrayList4;
                arrayList6 = arrayList3;
                stages2 = stages;
            }
            z4 = z3;
            i5 = i4 + 1;
            c43326rnF = this;
            linkReporter3 = linkReporter2;
            z5 = z4;
            size = i7;
            arrayList7 = arrayList4;
            arrayList6 = arrayList3;
            stages2 = stages;
        }
    }

    public final LinkedHashSet<java.lang.String> OLrzqt(DohPingInfo dohPingInfo, java.util.ArrayList<DohPingInfo> arrayList, java.util.ArrayList<DohPingInfo> arrayList2) {
        LinkedHashSet<java.lang.String> linkedHashSet = new LinkedHashSet<>(dohPingInfo.getIps());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (Intrinsics.EZpvd((java.lang.Object) ((DohPingInfo) obj).getSuccessHost(), (java.lang.Object) dohPingInfo.getSuccessHost())) {
                arrayList4.add(obj);
            }
        }
        arrayList3.addAll(arrayList4);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (Intrinsics.EZpvd((java.lang.Object) ((DohPingInfo) obj2).getSuccessHost(), (java.lang.Object) dohPingInfo.getSuccessHost())) {
                arrayList5.add(obj2);
            }
        }
        arrayList3.addAll(arrayList5);
        if (arrayList3.size() > 1) {
            C56407yEf.copydefault(arrayList3, new Activity());
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(((DohPingInfo) it.next()).getIps());
        }
        if (arrayList3.isEmpty()) {
            try {
                java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(dohPingInfo.getCname());
                Intrinsics.copydefault(allByName);
                for (java.net.InetAddress inetAddress : allByName) {
                    java.lang.String hostAddress = inetAddress.getHostAddress();
                    if (hostAddress != null && C43365rns.OLrzqt.gEmmrt(hostAddress) && !dohPingInfo.getIps().contains(hostAddress)) {
                        linkedHashSet.add(hostAddress);
                    }
                }
            } catch (java.lang.Exception e) {
                java.lang.String str = this.OLrzqt;
                e.printStackTrace();
                pUU.valueOf(str, "handleNodeInfo exception: " + Unit.INSTANCE);
            }
        }
        pUU.KWHzl(this.OLrzqt, "preferred dns sameNodeSize = " + arrayList3.size() + " successHost = " + dohPingInfo.getSuccessHost() + " ips = " + linkedHashSet + " ttl = " + dohPingInfo.getTTL() + " data=" + dohPingInfo.getCname());
        return linkedHashSet;
    }

    public final void AhwBna() {
        try {
            this.gEmmrt.lock();
            this.copydefault.signalAll();
        } finally {
            this.gEmmrt.unlock();
        }
    }

    public final boolean AYXKKw() {
        return this.valueOf.getQueryScheme() == SchemeType.HTTP;
    }

    public final java.lang.String EZpvd(java.util.List<java.lang.String> list, java.util.ArrayList<java.lang.String> arrayList) {
        for (java.lang.String str : list) {
            if (C43370rnx.checkHostHttpCanConn$OKNetwork_network$default(C43370rnx.copydefault, str, arrayList, this.OLrzqt, null, 8, null)) {
                return str;
            }
        }
        return null;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return "https://cloudflare-dns.com/dns-query?name=httpdns" + str + "&type=TXT";
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return "https://dns.google/resolve?name=httpdns" + str + "&type=TXT";
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return "/v2/support/doh/route/query?name=" + str + "&type=1";
    }

    public final void KWHzl(long j, java.lang.String str) {
        if (!C43308rmo.OLrzqt(C32979mnm.EZpvd.OLrzqt())) {
            pUU.KWHzl(this.OLrzqt, "startNextTurnIfNecessary, ignore startTimer from:" + str);
            return;
        }
        KWHzl(j);
    }
}
