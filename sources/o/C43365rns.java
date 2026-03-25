package o;

import androidx.work.WorkRequest;
import com.google.gson.reflect.TypeToken;
import com.okinc.biz.util.SiteSPUtils;
import com.okinc.core.util.SPUtils;
import com.okinc.network.model.ConnectTestResult;
import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.okg.dns.DnsCommonManager$isDomainReachable$1;
import com.okinc.network.okg.dns.DnsCommonManager$startNodeParseTaskV2$1;
import com.okinc.network.okg.dns.DnsCommonManager$startParseCloudCnameTaskV2$1;
import com.okinc.network.okg.dns.DohPingInfo;
import com.okinc.network.okg.dns.DomainsUtils;
import com.okinc.network.okg.dns.executor.OKDohConfig;
import com.okinc.network.okg.dns.model.CnDecryptionNode;
import com.okinc.network.okg.dns.model.DynamicCnameHostBean;
import com.okinc.network.okg.log.LruLinkedHashMap;
import com.okinc.network.proxy.SafeProxySelector;
import com.okinc.network.request.SchemeType;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.InterfaceC43456rpd;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43365rns {
    public static final OkHttpClient.Builder AEQbTJ;
    public static volatile boolean AYXKKw;
    public static volatile long AhwBna;
    public static final OkHttpClient AkhnZx;
    public static final LruLinkedHashMap<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> DbNXlk;
    public static final int EZpvd;
    public static final OkHttpClient.Builder KWHzl;
    public static final C43365rns OLrzqt;
    public static final java.util.ArrayList<java.lang.String> copydefault;
    public static final OkHttpClient djBIcL;
    public static final java.lang.Object fetchVPNInfo;
    public static java.util.ArrayList<java.lang.String> gEmmrt;
    public static final InterfaceC56387yDm valueOf;
    public static final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> AEQbTJ() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkHttpClient AYXKKw() {
        return AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LruLinkedHashMap<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> AhwBna() {
        return DbNXlk;
    }

    public final int OLrzqt(int i) {
        if (i > 0) {
            return i;
        }
        return 300;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkHttpClient djBIcL() {
        return djBIcL;
    }

    private C43365rns() {
    }

    static {
        C43365rns c43365rns = new C43365rns();
        OLrzqt = c43365rns;
        DbNXlk = new LruLinkedHashMap<>(128);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        c43365rns.OLrzqt(builder, 3L);
        AEQbTJ = builder;
        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
        c43365rns.OLrzqt(builder2, 3L);
        KWHzl = builder2;
        C43398roY c43398roY = C43398roY.copydefault;
        djBIcL = c43398roY.AEQbTJ(builder).build();
        AkhnZx = c43398roY.AEQbTJ(builder2).build();
        copydefault = yDY.copydefault("https://8.210.73.205", "https://47.97.124.22", "https://47.242.92.56", "www.okx-dns.com", "www.okx-dns1.com", "www.okx-dns2.com", "https://47.98.188.132", "https://47.99.54.158");
        values = C56392yDr.copydefault(new Function0() { // from class: o.rnp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43365rns.KWHzl();
            }
        });
        valueOf = C56392yDr.copydefault(new Function0() { // from class: o.rnt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43365rns.EZpvd();
            }
        });
        fetchVPNInfo = new java.lang.Object();
        gEmmrt = c43365rns.AEQbTJ(SPUtils.getArrayList("cn_dns_ip_sp_key_v2", java.lang.String.class));
        EZpvd = 8;
    }

    public final void OLrzqt(OkHttpClient.Builder builder, long j) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        builder.callTimeout(j, timeUnit).connectTimeout(j, timeUnit).readTimeout(j, timeUnit).retryOnConnectionFailure(false).addInterceptor(new C43335rnO(0, null, 3, 0 == true ? 1 : 0)).dispatcher(C43357rnk.KWHzl.copydefault(ThreadPoolType.DOH)).proxySelector(new SafeProxySelector(null, 1, null));
    }

    public final C43396roW valueOf() {
        return (C43396roW) values.getValue();
    }

    public static final C43396roW KWHzl() {
        return C43396roW.EZpvd();
    }

    public final InterfaceC43456rpd gEmmrt() {
        return (InterfaceC43456rpd) valueOf.getValue();
    }

    public static final InterfaceC43456rpd EZpvd() {
        return ((InterfaceC43269rmB) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC43269rmB.class)).DCUTEIdCUTEI();
    }

    public final void copydefault(java.util.ArrayList<java.lang.String> arrayList) {
        java.util.ArrayList<java.lang.String> arrayListAEQbTJ;
        if (arrayList == null || arrayList.isEmpty()) {
            SPUtils.put("cn_dns_ip_sp_key_v2", null);
            arrayListAEQbTJ = AEQbTJ((java.util.ArrayList<java.lang.String>) null);
        } else {
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>(arrayList);
            SPUtils.put("cn_dns_ip_sp_key_v2", arrayList2);
            arrayListAEQbTJ = AEQbTJ(arrayList2);
        }
        gEmmrt = arrayListAEQbTJ;
    }

    public final java.util.ArrayList<java.lang.String> AEQbTJ(java.util.ArrayList<java.lang.String> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (arrayList != null && (!arrayList.isEmpty())) {
            arrayList2.addAll(arrayList);
        }
        arrayList2.addAll(copydefault);
        return new java.util.ArrayList<>(CollectionsKt___CollectionsKt.QbewEr(arrayList2));
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            for (java.lang.String str2 : (java.lang.String[]) new Regex("\n").split(str, 0).toArray(new java.lang.String[0])) {
                if (new Regex("((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))").containsMatchIn(str2)) {
                    java.lang.String strSubstring = str2.substring(StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str2, "(", 0, false, 6, (java.lang.Object) null) + 1, StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str2, ")", 0, false, 6, (java.lang.Object) null));
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    return strSubstring;
                }
            }
            return null;
        } catch (java.lang.Exception e) {
            pUU.valueOf("DNS_Log", "ping 域名解析 ip异常 line = " + str + " error = " + e);
            return null;
        }
    }

    public final boolean valueOf(java.lang.String str, java.lang.String str2) {
        return Pattern.matches(str, str2);
    }

    public final boolean gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return valueOf("((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))", str);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, THROW, INVOKE, THROW, IF, INVOKE, THROW, IF, INVOKE, IF, IF, INVOKE, IF, IF, SGET, IGET, CHECK_CAST, INVOKE, IGET, CHECK_CAST, INVOKE, INVOKE, SGET, IGET, CHECK_CAST, INVOKE, IGET, CHECK_CAST, INVOKE, SGET, IGET, CHECK_CAST, INVOKE, IGET, CHECK_CAST, INVOKE, INVOKE, INVOKE, INVOKE, GOTO, IF, INVOKE, ARITH, CMP_L, SGET, IGET, CHECK_CAST, INVOKE, IGET, CHECK_CAST, INVOKE, INVOKE, INVOKE, ARITH, CMP_L, INVOKE, INVOKE, INVOKE] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        r0.append("\n<<< Timeout after " + r14 + "ms >>>");
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0185 A[Catch: all -> 0x0192, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:50:0x0112, B:87:0x018e, B:88:0x0191, B:81:0x0185), top: B:92:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018e A[Catch: all -> 0x0192, TRY_ENTER, TryCatch #0 {, blocks: (B:50:0x0112, B:87:0x018e, B:88:0x0191, B:81:0x0185), top: B:92:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(int i, @NotNull java.lang.String str) {
        java.lang.Process process;
        java.lang.String str2;
        java.lang.Process processExec;
        java.io.InputStream inputStream;
        final java.lang.StringBuffer stringBuffer;
        long jCopydefault;
        java.lang.Thread thread;
        java.io.InputStream inputStream2;
        long j;
        long j2;
        java.io.OutputStream outputStream;
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        synchronized (fetchVPNInfo) {
            try {
                processExec = java.lang.Runtime.getRuntime().exec(new java.lang.String[]{"/system/bin/ping", "-c", java.lang.String.valueOf(i), "-w", "4", str});
                if (processExec != null) {
                    try {
                        inputStream = processExec.getInputStream();
                    } catch (java.lang.Exception e) {
                        e = e;
                        process = processExec;
                        try {
                            java.lang.String str3 = "Ping failed: " + e.getMessage();
                            pUU.AEQbTJ("DnsCommonManager", str3, e);
                            if (process != null) {
                            }
                            str2 = str3;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (process != null) {
                                process.destroy();
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        process = processExec;
                        if (process != null) {
                        }
                        throw th;
                    }
                } else {
                    inputStream = null;
                }
                java.io.InputStream errorStream = processExec != null ? processExec.getErrorStream() : null;
                stringBuffer = new java.lang.StringBuffer();
                jCopydefault = C56548yJl.copydefault((((long) i) * 4000) + ((long) 1000), WorkRequest.MIN_BACKOFF_MILLIS);
                final java.io.InputStream inputStream3 = inputStream;
                final java.io.InputStream inputStream4 = errorStream;
                inputStream2 = errorStream;
                thread = new java.lang.Thread(new java.lang.Runnable() { // from class: o.rno
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C43365rns.AEQbTJ(objectRef, inputStream3, objectRef2, inputStream4, stringBuffer);
                    }
                });
                thread.start();
            } catch (java.lang.Exception e2) {
                e = e2;
                process = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                process = null;
            }
            try {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                while (true) {
                    if (!thread.isAlive()) {
                        break;
                    }
                    if (java.lang.System.currentTimeMillis() - jCurrentTimeMillis > jCopydefault) {
                        break;
                    }
                    java.lang.Thread.sleep(50L);
                    e = e;
                    process = processExec;
                    java.lang.String str32 = "Ping failed: " + e.getMessage();
                    pUU.AEQbTJ("DnsCommonManager", str32, e);
                    if (process != null) {
                        process.destroy();
                    }
                    str2 = str32;
                }
                if (processExec != null) {
                    try {
                        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                        while (true) {
                            try {
                                processExec.exitValue();
                                break;
                            } catch (java.lang.IllegalThreadStateException unused) {
                                if (java.lang.System.currentTimeMillis() - jCurrentTimeMillis2 > 100) {
                                    processExec.destroy();
                                    break;
                                }
                                java.lang.Thread.sleep(10L);
                            }
                        }
                    } catch (java.lang.InterruptedException unused2) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
                C43365rns c43365rns = OLrzqt;
                c43365rns.KWHzl((java.io.Closeable) objectRef.element);
                c43365rns.KWHzl((java.io.Closeable) objectRef2.element);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (processExec != null && (outputStream = processExec.getOutputStream()) != null) {
                    outputStream.close();
                }
                java.lang.String string = stringBuffer.toString();
                Intrinsics.copydefault((java.lang.Object) string);
                str2 = string.length() > 0 ? string : null;
                if (processExec != null) {
                    processExec.destroy();
                }
            } finally {
                if (processExec != null) {
                    try {
                        while (true) {
                            try {
                                break;
                            } catch (java.lang.IllegalThreadStateException unused3) {
                                if ((j2 > j ? 1 : (j2 == j ? 0 : -1)) > 0) {
                                    break;
                                }
                            }
                        }
                    } catch (java.lang.InterruptedException unused4) {
                    }
                }
            }
        }
        return str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(Ref.ObjectRef objectRef, java.io.InputStream inputStream, Ref.ObjectRef objectRef2, java.io.InputStream inputStream2, java.lang.StringBuffer stringBuffer) {
        T bufferedReader;
        if (inputStream != null) {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("DnsCommonManager", "Read stream error", e);
                return;
            }
        } else {
            bufferedReader = 0;
        }
        objectRef.element = bufferedReader;
        objectRef2.element = inputStream2 != null ? new java.io.BufferedReader(new java.io.InputStreamReader(inputStream2)) : 0;
        java.io.BufferedReader bufferedReader2 = (java.io.BufferedReader) objectRef.element;
        if (bufferedReader2 != null) {
            OLrzqt.copydefault(bufferedReader2, "[Ping-DATA]", stringBuffer);
        }
        java.io.BufferedReader bufferedReader3 = (java.io.BufferedReader) objectRef2.element;
        if (bufferedReader3 != null) {
            OLrzqt.copydefault(bufferedReader3, "[Ping-ERROR]", stringBuffer);
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void copydefault(java.io.BufferedReader bufferedReader, java.lang.String str, java.lang.StringBuffer stringBuffer) {
        if (bufferedReader == null) {
            return;
        }
        while (true) {
            try {
                java.lang.String line = bufferedReader.readLine();
                if (line != null) {
                    stringBuffer.append(str + " " + ((java.lang.Object) line) + "\n");
                } else {
                    Unit unit = Unit.INSTANCE;
                    yFA.copydefault(bufferedReader, null);
                    return;
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    yFA.copydefault(bufferedReader, th);
                    throw th2;
                }
            }
        }
    }

    public final void KWHzl(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException e) {
                pUU.AEQbTJ("DnsCommonManager", "closeQuietly error", e);
            }
        }
    }

    public final double valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.AEQbTJ(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C59449zhJ.replace$default(str, com.ibm.icu.text.DateFormat.MINUTE_SECOND, "", false, 4, (java.lang.Object) null)).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        DnsCommonManager$isDomainReachable$1 dnsCommonManager$isDomainReachable$1;
        if (continuation instanceof DnsCommonManager$isDomainReachable$1) {
            dnsCommonManager$isDomainReachable$1 = (DnsCommonManager$isDomainReachable$1) continuation;
            int i = dnsCommonManager$isDomainReachable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dnsCommonManager$isDomainReachable$1.label = i - Integer.MIN_VALUE;
            } else {
                dnsCommonManager$isDomainReachable$1 = new DnsCommonManager$isDomainReachable$1(this, continuation);
            }
        }
        DnsCommonManager$isDomainReachable$1 dnsCommonManager$isDomainReachable$12 = dnsCommonManager$isDomainReachable$1;
        java.lang.Object connectableIPV4FromDomain$default = dnsCommonManager$isDomainReachable$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dnsCommonManager$isDomainReachable$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(connectableIPV4FromDomain$default);
            InterfaceC43456rpd interfaceC43456rpdGEmmrt = gEmmrt();
            dnsCommonManager$isDomainReachable$12.L$0 = str;
            dnsCommonManager$isDomainReachable$12.label = 1;
            connectableIPV4FromDomain$default = InterfaceC43456rpd.TaskDescription.getConnectableIPV4FromDomain$default(interfaceC43456rpdGEmmrt, str, 0, 4000, null, dnsCommonManager$isDomainReachable$12, 10, null);
            if (connectableIPV4FromDomain$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) dnsCommonManager$isDomainReachable$12.L$0;
            C56391yDq.AEQbTJ(connectableIPV4FromDomain$default);
        }
        ConnectTestResult connectTestResult = (ConnectTestResult) connectableIPV4FromDomain$default;
        pUU.KWHzl("DnsCommonManager", "isDomainReachable-->>>host: " + str + ", reachable:" + connectTestResult);
        return C56443yFo.KWHzl(connectTestResult.getIp() != null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull CnDecryptionNode cnDecryptionNode, int i, @NotNull Continuation<? super DohPingInfo> continuation) throws java.lang.Throwable {
        DnsCommonManager$startNodeParseTaskV2$1 dnsCommonManager$startNodeParseTaskV2$1;
        DohPingInfo dohPingInfo;
        if (continuation instanceof DnsCommonManager$startNodeParseTaskV2$1) {
            dnsCommonManager$startNodeParseTaskV2$1 = (DnsCommonManager$startNodeParseTaskV2$1) continuation;
            int i2 = dnsCommonManager$startNodeParseTaskV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dnsCommonManager$startNodeParseTaskV2$1.label = i2 - Integer.MIN_VALUE;
            } else {
                dnsCommonManager$startNodeParseTaskV2$1 = new DnsCommonManager$startNodeParseTaskV2$1(this, continuation);
            }
        }
        DnsCommonManager$startNodeParseTaskV2$1 dnsCommonManager$startNodeParseTaskV2$12 = dnsCommonManager$startNodeParseTaskV2$1;
        java.lang.Object obj = dnsCommonManager$startNodeParseTaskV2$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = dnsCommonManager$startNodeParseTaskV2$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            DohPingInfo dohPingInfo2 = new DohPingInfo();
            dohPingInfo2.setNode(cnDecryptionNode);
            dohPingInfo2.setHosts(cnDecryptionNode.getHosts());
            dohPingInfo2.setTTL(cnDecryptionNode.getTTL());
            dohPingInfo2.setCname(cnDecryptionNode.getData());
            dohPingInfo2.setLog("");
            if (cnDecryptionNode.isProtectedNode()) {
                i = 10000;
            } else if (i <= 0) {
                i = 2000;
            }
            int i4 = i;
            InterfaceC43456rpd interfaceC43456rpdGEmmrt = gEmmrt();
            java.lang.String data = cnDecryptionNode.getData();
            CoroutineDispatcher unconfined = Dispatchers.getUnconfined();
            dnsCommonManager$startNodeParseTaskV2$12.L$0 = dohPingInfo2;
            dnsCommonManager$startNodeParseTaskV2$12.label = 1;
            java.lang.Object connectableIPV4FromDomain$default = InterfaceC43456rpd.TaskDescription.getConnectableIPV4FromDomain$default(interfaceC43456rpdGEmmrt, data, 0, i4, unconfined, dnsCommonManager$startNodeParseTaskV2$12, 2, null);
            if (connectableIPV4FromDomain$default == objCopydefault) {
                return objCopydefault;
            }
            obj = connectableIPV4FromDomain$default;
            dohPingInfo = dohPingInfo2;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dohPingInfo = (DohPingInfo) dnsCommonManager$startNodeParseTaskV2$12.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        ConnectTestResult connectTestResult = (ConnectTestResult) obj;
        if (connectTestResult.getIp() == null) {
            dohPingInfo.setSuccess(false);
            dohPingInfo.setIps(new java.util.ArrayList<>());
        } else {
            dohPingInfo.setSuccess(true);
            dohPingInfo.setIps(yDY.copydefault(connectTestResult.getIp()));
            dohPingInfo.setPingTime(connectTestResult.getConnectionCostMs() + " ms");
            dohPingInfo.setFmtTime((double) connectTestResult.getConnectionCostMs());
        }
        return dohPingInfo;
    }

    public static /* synthetic */ boolean canAccessOKX$default(C43365rns c43365rns, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 3000;
        }
        return c43365rns.KWHzl(str, str2, i);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final boolean KWHzl(@NotNull java.lang.String str, java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null) {
            return false;
        }
        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(str2, 443);
            Socket socket = new Socket();
            try {
                socket.connect(inetSocketAddress, i);
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(socket, null);
                pUU.KWHzl(str, "canAccess " + str2 + " true");
                return true;
            } finally {
            }
        } catch (java.lang.Exception e) {
            pUU.valueOf(str, "canAccess " + str2 + " e=" + e);
            return false;
        }
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C43453rpa.AEQbTJ.OLrzqt() && KWHzl(str, "www.google.com", 1000);
    }

    /* JADX INFO: renamed from: o.rns$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final DynamicCnameHostBean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, DynamicCnameHostBean dynamicCnameHostBean, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dynamicCnameHostBean = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                str = activity.AEQbTJ;
            }
            return activity.copydefault(dynamicCnameHostBean, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DynamicCnameHostBean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull DynamicCnameHostBean dynamicCnameHostBean, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(dynamicCnameHostBean, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(dynamicCnameHostBean, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        public Activity(@NotNull DynamicCnameHostBean dynamicCnameHostBean, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(dynamicCnameHostBean, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = dynamicCnameHostBean;
            this.AEQbTJ = str;
        }

        public java.lang.String toString() {
            return "cname:" + this.EZpvd.getCname() + ", ip:" + this.AEQbTJ + ", host:" + this.EZpvd.getHostList();
        }
    }

    /* JADX INFO: renamed from: o.rns$TaskDescription */
    public static final class TaskDescription {
        public final boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final long KWHzl;
        public final Activity OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, Activity activity, long j, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activity = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                j = taskDescription.KWHzl;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                z = taskDescription.AEQbTJ;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                str = taskDescription.EZpvd;
            }
            return taskDescription.KWHzl(activity, j2, z2, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull Activity activity, long j, boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(activity, j, z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && this.KWHzl == taskDescription.KWHzl && this.AEQbTJ == taskDescription.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.OLrzqt.hashCode() * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.EZpvd.hashCode();
        }

        public TaskDescription(@NotNull Activity activity, long j, boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = activity;
            this.KWHzl = j;
            this.AEQbTJ = z;
            this.EZpvd = str;
        }

        public java.lang.String toString() {
            return "isSuccess=" + this.AEQbTJ + " cnameInfo=" + this.OLrzqt + " time=" + this.KWHzl + " successHost=" + this.copydefault + " msg=" + this.EZpvd;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final TaskDescription copydefault(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (C59449zhJ.startsWith$default(activity.copydefault(), "127.", false, 2, null) || Intrinsics.EZpvd((java.lang.Object) activity.copydefault(), (java.lang.Object) "0.0.0.0")) {
            return new TaskDescription(activity, 0L, false, "");
        }
        InetSocketAddress inetSocketAddress = new InetSocketAddress(activity.copydefault(), 443);
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            Socket socket = new Socket();
            try {
                socket.connect(inetSocketAddress, 3000);
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(socket, null);
                return new TaskDescription(activity, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, true, "");
            } finally {
            }
        } catch (java.lang.Exception e) {
            return new TaskDescription(activity, 0L, false, e.toString());
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> list, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        SiteSPUtils.INSTANCE.put(EZpvd(str), list, "doh_backup", str2);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = SiteSPUtils.INSTANCE.getArrayList(EZpvd(str), java.util.Map.class, "doh_backup", str2);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        java.lang.Object obj = arrayList.get(0);
        Intrinsics.copydefault(obj, "");
        return (java.util.Map) obj;
    }

    public final boolean AhwBna(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = EZpvd(str);
        SiteSPUtils siteSPUtils = SiteSPUtils.INSTANCE;
        java.util.ArrayList arrayList = siteSPUtils.getArrayList(strEZpvd, java.util.Map.class, "doh_backup", str2);
        if (arrayList == null || arrayList.size() <= 1) {
            return false;
        }
        java.util.List listSubList = arrayList.subList(1, arrayList.size());
        Intrinsics.checkNotNullExpressionValue(listSubList, "");
        siteSPUtils.put(strEZpvd, listSubList, "doh_backup", str2);
        return true;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return str + "_" + valueOf().OLrzqt();
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SiteSPUtils siteSPUtils = SiteSPUtils.INSTANCE;
        SiteSPUtils.put$default(siteSPUtils, str, str2, null, str3, 4, null);
        SiteSPUtils.put$default(siteSPUtils, EZpvd(str), str2, null, str3, 4, null);
        saveHttpDohHostPrefix$default(this, str, str2, str3 != null, false, 8, null);
    }

    public final void OLrzqt(java.lang.String str) {
        SiteSPUtils siteSPUtils = SiteSPUtils.INSTANCE;
        siteSPUtils.clear(null, str);
        siteSPUtils.clear("doh_backup", str);
        C43363rnq.Companion.copydefault().EZpvd();
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        SiteSPUtils siteSPUtils = SiteSPUtils.INSTANCE;
        java.lang.String string$default = SiteSPUtils.getString$default(siteSPUtils, EZpvd(str), "", null, str2, 4, null);
        if (string$default.length() == 0) {
            string$default = SiteSPUtils.getString$default(siteSPUtils, str, "", null, str2, 4, null);
        }
        if (C43363rnq.Companion.copydefault().AEQbTJ()) {
            saveHttpDohHostPrefix$default(this, str, string$default, str2 != null, false, 8, null);
        }
        return string$default;
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        return str + "_" + str2 + "_" + valueOf().OLrzqt();
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return str + "_" + str2;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        SPUtils.put(copydefault(str, str2), list);
        SPUtils.put(OLrzqt(str, str2), list);
    }

    public final java.util.ArrayList<java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList<java.lang.String> arrayList = SPUtils.getArrayList(OLrzqt(str, str2), java.lang.String.class);
        if (arrayList == null || arrayList.isEmpty()) {
            arrayList = SPUtils.getArrayList(copydefault(str, str2), java.lang.String.class);
        }
        if (arrayList == null || arrayList.isEmpty()) {
            arrayList = SPUtils.getArrayList(str, java.lang.String.class);
        }
        return arrayList == null ? new java.util.ArrayList<>() : arrayList;
    }

    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str + "_ip_json";
        if (AYXKKw) {
            pUU.valueOf(str2, "ipJson isUpdating");
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - AhwBna;
        if (jCurrentTimeMillis < 120000) {
            pUU.valueOf(str2, "更新间隔小于2分钟, intervalTime=" + jCurrentTimeMillis);
            return;
        }
        AYXKKw = true;
        djBIcL.newCall(new Request.Builder().url("https://d1stg7nxvupg0p.cloudfront.net/app/mobile-doh.json").build()).enqueue(new ActionBar(str2));
    }

    /* JADX INFO: renamed from: o.rns$ActionBar */
    public static final class ActionBar implements okhttp3.Callback {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX INFO: renamed from: o.rns$ActionBar$TaskDescription */
        public static final class TaskDescription extends TypeToken<java.util.ArrayList<java.lang.String>> {
        }

        public ActionBar(java.lang.String str) {
            this.EZpvd = str;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, java.io.IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            C43365rns c43365rns = C43365rns.OLrzqt;
            C43365rns.AYXKKw = false;
            pUU.valueOf(this.EZpvd, "e=" + iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            if (response.body() != null && response.code() == 200) {
                try {
                    ResponseBody responseBodyBody = response.body();
                    Intrinsics.copydefault(responseBodyBody);
                    java.lang.String strString = responseBodyBody.string();
                    pUU.valueOf(this.EZpvd, "stringBody=" + strString);
                    java.lang.String strAEQbTJ = C43367rnu.AEQbTJ(strString, C43367rnu.OLrzqt());
                    Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
                    java.util.ArrayList<java.lang.String> arrayList = (java.util.ArrayList) C33490mxT.KWHzl(strAEQbTJ, new TaskDescription());
                    if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
                        C43365rns c43365rns = C43365rns.OLrzqt;
                        C43365rns.AhwBna = java.lang.System.currentTimeMillis();
                        c43365rns.copydefault(arrayList);
                    }
                    pUU.valueOf(this.EZpvd, "decode decodeStr=" + strAEQbTJ + " decodeIps=" + arrayList);
                } catch (java.lang.Exception e) {
                    pUU.valueOf(this.EZpvd, "parse error=" + e);
                }
            } else {
                pUU.valueOf(this.EZpvd, "code = " + response.code());
            }
            C43365rns c43365rns2 = C43365rns.OLrzqt;
            C43365rns.AYXKKw = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00af -> B:21:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.ArrayList<DynamicCnameHostBean> arrayList, @NotNull Continuation<? super java.util.ArrayList<Activity>> continuation) throws java.lang.Throwable {
        DnsCommonManager$startParseCloudCnameTaskV2$1 dnsCommonManager$startParseCloudCnameTaskV2$1;
        C43365rns c43365rns;
        java.util.ArrayList arrayList2;
        java.util.Iterator<DynamicCnameHostBean> it;
        C43365rns c43365rns2;
        if (continuation instanceof DnsCommonManager$startParseCloudCnameTaskV2$1) {
            dnsCommonManager$startParseCloudCnameTaskV2$1 = (DnsCommonManager$startParseCloudCnameTaskV2$1) continuation;
            int i = dnsCommonManager$startParseCloudCnameTaskV2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dnsCommonManager$startParseCloudCnameTaskV2$1.label = i - Integer.MIN_VALUE;
                c43365rns = this;
            } else {
                c43365rns = this;
                dnsCommonManager$startParseCloudCnameTaskV2$1 = new DnsCommonManager$startParseCloudCnameTaskV2$1(c43365rns, continuation);
            }
        }
        java.lang.Object obj = dnsCommonManager$startParseCloudCnameTaskV2$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dnsCommonManager$startParseCloudCnameTaskV2$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("DnsCommonManager", "--->>>startParseCloudCnameTaskV2: " + arrayList);
            arrayList2 = new java.util.ArrayList();
            it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            c43365rns2 = c43365rns;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DynamicCnameHostBean dynamicCnameHostBean = (DynamicCnameHostBean) dnsCommonManager$startParseCloudCnameTaskV2$1.L$3;
            java.util.Iterator<DynamicCnameHostBean> it2 = (java.util.Iterator) dnsCommonManager$startParseCloudCnameTaskV2$1.L$2;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) dnsCommonManager$startParseCloudCnameTaskV2$1.L$1;
            C43365rns c43365rns3 = (C43365rns) dnsCommonManager$startParseCloudCnameTaskV2$1.L$0;
            C56391yDq.AEQbTJ(obj);
            c43365rns2 = c43365rns3;
            ConnectTestResult connectTestResult = (ConnectTestResult) obj;
            pUU.KWHzl("DnsCommonManager", "-startParseCloudCnameTaskV2-->>>" + dynamicCnameHostBean.getCname() + ", " + connectTestResult);
            if (connectTestResult.getIp() != null) {
                arrayList3.add(new Activity(dynamicCnameHostBean, connectTestResult.getIp()));
            }
            it = it2;
            arrayList2 = arrayList3;
            if (it.hasNext()) {
                DynamicCnameHostBean next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                DynamicCnameHostBean dynamicCnameHostBean2 = next;
                InterfaceC43456rpd interfaceC43456rpdGEmmrt = c43365rns2.gEmmrt();
                java.lang.String cname = dynamicCnameHostBean2.getCname();
                CoroutineDispatcher unconfined = Dispatchers.getUnconfined();
                dnsCommonManager$startParseCloudCnameTaskV2$1.L$0 = c43365rns2;
                dnsCommonManager$startParseCloudCnameTaskV2$1.L$1 = arrayList2;
                dnsCommonManager$startParseCloudCnameTaskV2$1.L$2 = it;
                dnsCommonManager$startParseCloudCnameTaskV2$1.L$3 = dynamicCnameHostBean2;
                dnsCommonManager$startParseCloudCnameTaskV2$1.label = 1;
                C43365rns c43365rns4 = c43365rns2;
                java.lang.Object connectableIPV4FromDomain$default = InterfaceC43456rpd.TaskDescription.getConnectableIPV4FromDomain$default(interfaceC43456rpdGEmmrt, cname, 0, 0, unconfined, dnsCommonManager$startParseCloudCnameTaskV2$1, 6, null);
                if (connectableIPV4FromDomain$default == objCopydefault) {
                    return objCopydefault;
                }
                arrayList3 = arrayList2;
                obj = connectableIPV4FromDomain$default;
                c43365rns2 = c43365rns4;
                it2 = it;
                dynamicCnameHostBean = dynamicCnameHostBean2;
                ConnectTestResult connectTestResult2 = (ConnectTestResult) obj;
                pUU.KWHzl("DnsCommonManager", "-startParseCloudCnameTaskV2-->>>" + dynamicCnameHostBean.getCname() + ", " + connectTestResult2);
                if (connectTestResult2.getIp() != null) {
                }
                it = it2;
                arrayList2 = arrayList3;
                if (it.hasNext()) {
                    return arrayList2;
                }
            }
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        if (str != null) {
            OLrzqt.AEQbTJ("", str, false, true);
        }
    }

    public static /* synthetic */ void saveHttpDohHostPrefix$default(C43365rns c43365rns, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        c43365rns.AEQbTJ(str, str2, z, z2);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        if (z) {
            return;
        }
        try {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) OKDohConfig.Companion.EZpvd(SchemeType.HTTP, DomainsUtils.INSTANCE.getOkxHttpMain().getTarget().getHost())) || z2) {
                C43363rnq.Companion.copydefault().KWHzl(str2);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("DnsCommonManager", "saveHttpDohHostPrefix,  error:" + e);
        }
    }

    public final boolean OLrzqt(@NotNull java.util.ArrayList<java.lang.String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!OLrzqt.gEmmrt((java.lang.String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
