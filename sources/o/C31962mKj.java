package o;

import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.google.common.net.HttpHeaders;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.debugbox.LDNetDiagnoService.LDNetAsyncTaskEx;
import com.okinc.debugbox.LDNetDiagnoService.LDNetSocket;
import com.okinc.debugbox.LDNetDiagnoService.LDNetTraceRoute;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import o.C31958mKf;

/* JADX INFO: renamed from: o.mKj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C31962mKj extends LDNetAsyncTaskEx<java.lang.String, java.lang.String, java.lang.String> implements C31958mKf.Activity, LDNetTraceRoute.ActionBar, LDNetSocket.StateListAnimator {
    public java.lang.String AhwBna;
    public android.content.Context AkhnZx;
    public java.lang.String AuCTel;
    public java.lang.String AuCTelauCTel;
    public final java.lang.StringBuilder AubY;
    public java.util.List<java.lang.String> AwvSrB;
    public java.net.InetAddress[] AxsJAY;
    public final java.util.Map<java.lang.String, java.lang.String> DTwDnp;
    public java.lang.String DbNXlk;
    public java.lang.String ORxRYg;
    public java.lang.String OcIXYQ;
    public final CompletionService<java.lang.String> QKVWgx;
    public LDNetTraceRoute QOLQEE;
    public java.lang.String djBIcL;
    public java.lang.String ejfBZ;
    public java.lang.String fARcdN;
    public java.lang.String fIwbmz;
    public java.lang.String fJNWhG;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String gHZMYf;
    public boolean getFieldNames;
    public boolean getNewProxyInstance;
    public boolean hDKMBd;
    public java.lang.String isConnected;
    public boolean iwGUEr;
    public LDNetSocket sSMYrx;
    public boolean uzCIH;
    public java.lang.String values;
    public InterfaceC31959mKg wlaJM;
    public boolean zLjUOn;
    public C31958mKf zsXlph;
    public TelephonyManager zuBGHE;
    public static final BlockingQueue<java.lang.Runnable> AYXKKw = new LinkedBlockingQueue(2);
    public static final ThreadFactory valueOf = new ThreadFactory() { // from class: o.mKj.4
        public final AtomicInteger copydefault = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable, "Trace #" + this.copydefault.getAndIncrement());
            thread.setPriority(1);
            return thread;
        }
    };
    public static ExecutorService EZpvd = null;

    @Override // com.okinc.debugbox.LDNetDiagnoService.LDNetTraceRoute.ActionBar
    public void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.debugbox.LDNetDiagnoService.LDNetAsyncTaskEx
    public ExecutorService EZpvd() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.zLjUOn = z;
    }

    public C31962mKj() {
        this.AubY = new java.lang.StringBuilder(256);
        this.QKVWgx = new ExecutorCompletionService(ThreadUtils.copydefault());
        this.DTwDnp = new java.util.HashMap();
        this.uzCIH = false;
        this.zLjUOn = true;
        this.zuBGHE = null;
    }

    public C31962mKj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, InterfaceC31959mKg interfaceC31959mKg) {
        this.AubY = new java.lang.StringBuilder(256);
        this.QKVWgx = new ExecutorCompletionService(ThreadUtils.copydefault());
        this.DTwDnp = new java.util.HashMap();
        this.uzCIH = false;
        this.zLjUOn = true;
        this.zuBGHE = null;
        this.AkhnZx = context;
        this.isConnected = str;
        this.values = str2;
        this.DbNXlk = str3;
        this.ORxRYg = str4;
        this.OcIXYQ = str5;
        this.fIwbmz = str6;
        this.fJNWhG = str7;
        this.fetchVPNInfo = str8;
        this.gEmmrt = str9;
        this.djBIcL = str10;
        this.AhwBna = str11;
        this.wlaJM = interfaceC31959mKg;
        this.iwGUEr = false;
        this.AwvSrB = new java.util.ArrayList();
        this.zuBGHE = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        EZpvd = new ThreadPoolExecutor(1, 1, 10L, java.util.concurrent.TimeUnit.SECONDS, AYXKKw, valueOf);
        AhwBna();
    }

    public final void AhwBna() {
        this.DTwDnp.put("https://myip.ipip.net", "curl https://myip.ipip.net");
        this.DTwDnp.put("https://www.okx.com", "curl -I --connect-timeout 3 https://www.okx.com");
        this.DTwDnp.put("https://www.baidu.com", "curl -I https://www.baidu.com");
        this.DTwDnp.put("https://www.apple.com", "curl -I https://www.apple.com");
        this.DTwDnp.put("https://www.google.com.tw/", "curl -I --connect-timeout 3 https://www.google.com.tw/");
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd([Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // com.okinc.debugbox.LDNetDiagnoService.LDNetAsyncTaskEx
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.String EZpvd(java.lang.String... strArr) {
        if (bh_()) {
            return null;
        }
        return AYXKKw();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)V */
    @Override // com.okinc.debugbox.LDNetDiagnoService.LDNetAsyncTaskEx
    public void KWHzl(java.lang.String str) {
        if (bh_()) {
            return;
        }
        super.KWHzl(str);
        djBIcL("\n网络诊断结束：" + pTA.EZpvd(new Date()));
        AkhnZx();
        InterfaceC31959mKg interfaceC31959mKg = this.wlaJM;
        if (interfaceC31959mKg != null) {
            interfaceC31959mKg.OLrzqt(this.AubY.toString());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl([Ljava/lang/Object;)V */
    @Override // com.okinc.debugbox.LDNetDiagnoService.LDNetAsyncTaskEx
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(java.lang.String... strArr) {
        if (bh_()) {
            return;
        }
        super.KWHzl((java.lang.Object[]) strArr);
        InterfaceC31959mKg interfaceC31959mKg = this.wlaJM;
        if (interfaceC31959mKg != null) {
            interfaceC31959mKg.AEQbTJ(strArr[0]);
        }
    }

    @Override // com.okinc.debugbox.LDNetDiagnoService.LDNetAsyncTaskEx
    public void KWHzl() {
        AkhnZx();
    }

    public java.lang.String AYXKKw() throws java.lang.Throwable {
        if (android.text.TextUtils.isEmpty(this.fJNWhG)) {
            return "";
        }
        this.iwGUEr = true;
        this.AubY.setLength(0);
        djBIcL("domain：" + this.fJNWhG);
        djBIcL("用户ID：" + this.ORxRYg);
        djBIcL("开始诊断：" + pTA.EZpvd(new Date()));
        AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.mKh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) throws java.lang.Exception {
                this.EZpvd.AEQbTJ(interfaceC58251yxk);
            }
        }).subscribeOn(yBP.KWHzl()).subscribe();
        gEmmrt();
        djBIcL();
        if (this.hDKMBd) {
            djBIcL("\n开始TCP连接测试...");
            LDNetSocket lDNetSocketOLrzqt = LDNetSocket.OLrzqt();
            this.sSMYrx = lDNetSocketOLrzqt;
            lDNetSocketOLrzqt.copydefault = this.AxsJAY;
            lDNetSocketOLrzqt.EZpvd = this.AwvSrB;
            lDNetSocketOLrzqt.AEQbTJ(this);
            LDNetSocket lDNetSocket = this.sSMYrx;
            lDNetSocket.djBIcL = this.uzCIH;
            this.getNewProxyInstance = lDNetSocket.copydefault(this.fJNWhG);
            djBIcL("\n开始ping...");
            this.zsXlph = new C31958mKf(this, 4);
            djBIcL("ping...127.0.0.1");
            this.zsXlph.EZpvd("127.0.0.1", false);
            djBIcL("ping本机IP..." + this.AuCTelauCTel);
            this.zsXlph.EZpvd(this.AuCTelauCTel, false);
            if ("WIFI".equals(this.gHZMYf)) {
                djBIcL("ping本地网关..." + this.fARcdN);
                this.zsXlph.EZpvd(this.fARcdN, false);
            }
            djBIcL("ping本地DNS1..." + this.AuCTel);
            this.zsXlph.EZpvd(this.AuCTel, false);
            djBIcL("ping本地DNS2..." + this.ejfBZ);
            this.zsXlph.EZpvd(this.ejfBZ, false);
            if (this.zsXlph == null) {
                this.zsXlph = new C31958mKf(this, 4);
            }
            djBIcL("\n开始traceroute...");
            LDNetTraceRoute lDNetTraceRouteEZpvd = LDNetTraceRoute.EZpvd();
            this.QOLQEE = lDNetTraceRouteEZpvd;
            lDNetTraceRouteEZpvd.EZpvd(this);
            LDNetTraceRoute lDNetTraceRoute = this.QOLQEE;
            lDNetTraceRoute.AEQbTJ = this.zLjUOn;
            lDNetTraceRoute.copydefault(this.fJNWhG);
            valueOf();
        } else {
            djBIcL("\n\n当前主机未联网,请检查网络！");
        }
        return this.AubY.toString();
    }

    public final /* synthetic */ void AEQbTJ(InterfaceC58251yxk interfaceC58251yxk) throws java.lang.Exception {
        djBIcL("\n外网IP：" + C31963mKk.copydefault());
    }

    public void valueOf() {
        djBIcL("\n");
        for (final Map.Entry<java.lang.String, java.lang.String> entry : this.DTwDnp.entrySet()) {
            this.QKVWgx.submit(new Callable() { // from class: o.mKi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.KWHzl.KWHzl(entry);
                }
            });
        }
        for (int i = 0; i < this.DTwDnp.size(); i++) {
            try {
                this.QKVWgx.take().get();
                pUU.KWHzl("NetDiagnoService", "cloudIpInfo $str");
            } catch (java.lang.InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    public final /* synthetic */ java.lang.String KWHzl(Map.Entry entry) throws java.lang.Exception {
        return AYXKKw((java.lang.String) entry.getKey());
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AYXKKw(java.lang.String str) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.InputStream inputStream;
        HttpURLConnection httpURLConnection;
        java.io.InputStreamReader inputStreamReader;
        java.io.IOException e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n");
        sb.append(str);
        sb.append(" : ");
        sb.append("\n");
        pUU.EZpvd("NetDiagnoService", "runCommand $hostName  $command");
        java.io.BufferedReader bufferedReader = null;
        try {
            httpURLConnection = (HttpURLConnection) new java.net.URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.connect();
                if ("https://myip.ipip.net".equals(str)) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        inputStreamReader = new java.io.InputStreamReader(inputStream);
                        try {
                            try {
                                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(inputStreamReader);
                                while (true) {
                                    try {
                                        java.lang.String line = bufferedReader2.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        sb.append(line);
                                        sb.append("\n");
                                    } catch (java.io.IOException e2) {
                                        e = e2;
                                        bufferedReader = bufferedReader2;
                                        sb.append(e.getMessage());
                                        pUU.AEQbTJ("NetDiagnoService", e);
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (java.io.IOException e3) {
                                                pUU.AEQbTJ("tag", e3);
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                djBIcL(sb.toString());
                                                return sb.toString();
                                            }
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (inputStreamReader != null) {
                                            inputStreamReader.close();
                                        }
                                        if (httpURLConnection != null) {
                                        }
                                        djBIcL(sb.toString());
                                        return sb.toString();
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        bufferedReader = bufferedReader2;
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (java.io.IOException e4) {
                                                pUU.AEQbTJ("tag", e4);
                                                if (httpURLConnection == null) {
                                                    httpURLConnection.disconnect();
                                                    throw th;
                                                }
                                                throw th;
                                            }
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (inputStreamReader != null) {
                                            inputStreamReader.close();
                                        }
                                        if (httpURLConnection == null) {
                                        }
                                    }
                                }
                                bufferedReader = bufferedReader2;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                httpURLConnection = httpURLConnection;
                                bufferedReader = bufferedReader;
                            }
                        } catch (java.io.IOException e5) {
                            e = e5;
                            inputStreamReader = inputStreamReader;
                            bufferedReader = bufferedReader;
                        }
                    } catch (java.io.IOException e6) {
                        e = e6;
                        inputStreamReader = null;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } else {
                    sb.append("responseCode : ");
                    sb.append(httpURLConnection.getResponseCode());
                    sb.append("\n");
                    sb.append("Date : ");
                    sb.append(httpURLConnection.getHeaderField("Date"));
                    sb.append("\n");
                    sb.append("Connection: ");
                    sb.append(httpURLConnection.getHeaderField(HttpHeaders.CONNECTION));
                    sb.append("\n");
                    sb.append("Content-Length: ");
                    sb.append(httpURLConnection.getHeaderField("Content-Length"));
                    sb.append("\n");
                    sb.append("Server: ");
                    sb.append(httpURLConnection.getHeaderField(HttpHeaders.SERVER));
                    sb.append("\n");
                    inputStream = null;
                    inputStreamReader = null;
                }
                pUU.EZpvd("NetDiagnoService", "sb: " + ((java.lang.Object) sb));
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (java.io.IOException e7) {
                        pUU.AEQbTJ("tag", e7);
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
            } catch (java.io.IOException e8) {
                e = e8;
                inputStream = null;
                inputStreamReader = null;
            } catch (java.lang.Throwable th5) {
                th = th5;
                inputStream = null;
                inputStreamReader = null;
            }
        } catch (java.io.IOException e9) {
            e = e9;
            inputStream = null;
            httpURLConnection = null;
            inputStreamReader = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
            inputStream = null;
            httpURLConnection = null;
            inputStreamReader = null;
        }
        httpURLConnection.disconnect();
        djBIcL(sb.toString());
        return sb.toString();
    }

    public void AkhnZx() {
        if (this.iwGUEr) {
            LDNetSocket lDNetSocket = this.sSMYrx;
            if (lDNetSocket != null) {
                lDNetSocket.copydefault();
                this.sSMYrx = null;
            }
            if (this.zsXlph != null) {
                this.zsXlph = null;
            }
            LDNetTraceRoute lDNetTraceRoute = this.QOLQEE;
            if (lDNetTraceRoute != null) {
                lDNetTraceRoute.AEQbTJ();
                this.QOLQEE = null;
            }
            OLrzqt(true);
            ExecutorService executorService = EZpvd;
            if (executorService != null && !executorService.isShutdown()) {
                EZpvd.shutdown();
                EZpvd = null;
            }
            this.iwGUEr = false;
        }
        InterfaceC31959mKg interfaceC31959mKg = this.wlaJM;
        if (interfaceC31959mKg != null) {
            interfaceC31959mKg.copydefault();
        }
    }

    public final void djBIcL(java.lang.String str) {
        synchronized (this) {
            java.lang.StringBuilder sb = this.AubY;
            sb.append(str);
            sb.append("\n");
            OLrzqt((java.lang.Object[]) new java.lang.String[]{str + "\n"});
        }
    }

    @Override // com.okinc.debugbox.LDNetDiagnoService.LDNetTraceRoute.ActionBar
    public void EZpvd(java.lang.String str) {
        if (str == null) {
            return;
        }
        LDNetTraceRoute lDNetTraceRoute = this.QOLQEE;
        if (lDNetTraceRoute != null && lDNetTraceRoute.AEQbTJ) {
            if (str.contains(com.ibm.icu.text.DateFormat.MINUTE_SECOND) || str.contains("***")) {
                str = str + "\n";
            }
            this.AubY.append(str);
            OLrzqt((java.lang.Object[]) new java.lang.String[]{str});
            return;
        }
        djBIcL(str);
    }

    @Override // com.okinc.debugbox.LDNetDiagnoService.LDNetSocket.StateListAnimator
    public void AEQbTJ(java.lang.String str) {
        this.AubY.append(str);
        OLrzqt((java.lang.Object[]) new java.lang.String[]{str});
    }

    @Override // com.okinc.debugbox.LDNetDiagnoService.LDNetSocket.StateListAnimator
    public void copydefault(java.lang.String str) {
        this.AubY.append(str);
        OLrzqt((java.lang.Object[]) new java.lang.String[]{str});
    }

    public final void gEmmrt() {
        djBIcL("机器类型:\t" + android.os.Build.MANUFACTURER + ":" + android.os.Build.BRAND + ":" + android.os.Build.MODEL);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("系统版本:\t");
        java.lang.String str = Build.VERSION.RELEASE;
        sb.append(str);
        djBIcL(sb.toString());
        djBIcL("UA:\t" + this.OcIXYQ);
        djBIcL("系统版本:\t" + str);
        djBIcL("APP名称:\t" + C34703nhO.OLrzqt(this.AkhnZx));
        djBIcL("APP包名:\t" + C34703nhO.KWHzl(this.AkhnZx));
        djBIcL("APP版本:\t" + C34703nhO.valueOf(this.AkhnZx));
        if (android.text.TextUtils.isEmpty(this.fetchVPNInfo)) {
            this.fetchVPNInfo = C31963mKk.copydefault(this.AkhnZx);
        }
        djBIcL("运营商:\t" + this.fetchVPNInfo);
        if (this.zuBGHE != null && android.text.TextUtils.isEmpty(this.gEmmrt)) {
            this.gEmmrt = this.zuBGHE.getNetworkCountryIso();
        }
        djBIcL("ISOCountryCode:\t" + this.gEmmrt);
        if (this.zuBGHE != null && android.text.TextUtils.isEmpty(this.djBIcL)) {
            java.lang.String networkOperator = this.zuBGHE.getNetworkOperator();
            if (!android.text.TextUtils.isEmpty(networkOperator)) {
                this.djBIcL = networkOperator.substring(0, 3);
                if (networkOperator.length() >= 5) {
                    this.AhwBna = networkOperator.substring(3, 5);
                }
            }
        }
        djBIcL("MobileCountryCode:\t" + this.djBIcL);
        djBIcL("MobileNetworkCode:\t" + this.AhwBna);
    }

    public final void djBIcL() {
        if (C31963mKk.OLrzqt(this.AkhnZx).booleanValue()) {
            this.hDKMBd = true;
            djBIcL("当前是否联网:\t已联网");
        } else {
            this.hDKMBd = false;
            djBIcL("当前是否联网:\t未联网");
        }
        this.gHZMYf = C31963mKk.EZpvd(this.AkhnZx);
        djBIcL("当前联网类型:\t" + this.gHZMYf);
        if (this.hDKMBd) {
            if ("WIFI".equals(this.gHZMYf)) {
                this.AuCTelauCTel = C31963mKk.AEQbTJ(this.AkhnZx);
                this.fARcdN = C31963mKk.AhwBna(this.AkhnZx);
            } else {
                this.AuCTelauCTel = C31963mKk.AEQbTJ();
            }
            djBIcL("本地IP:\t" + this.AuCTelauCTel);
        } else {
            djBIcL("本地IP:\t127.0.0.1");
        }
        if (this.fARcdN != null) {
            djBIcL("本地网关:\t" + this.fARcdN);
        }
        if (this.hDKMBd) {
            this.AuCTel = C31963mKk.EZpvd("dns1");
            this.ejfBZ = C31963mKk.EZpvd("dns2");
            djBIcL("本地DNS:\t" + this.AuCTel + "," + this.ejfBZ);
        } else {
            djBIcL("本地DNS:\t0.0.0.0,0.0.0.0");
        }
        if (this.hDKMBd) {
            this.getFieldNames = valueOf(this.fJNWhG);
        }
    }

    public final boolean valueOf(java.lang.String str) throws java.lang.Throwable {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Map<java.lang.String, java.lang.Object> mapCopydefault = C31963mKk.copydefault(str);
        java.lang.String str2 = (java.lang.String) mapCopydefault.get("useTime");
        this.AxsJAY = (java.net.InetAddress[]) mapCopydefault.get("remoteInet");
        java.lang.String str3 = java.lang.Integer.parseInt(str2) > 5000 ? " (" + (java.lang.Integer.parseInt(str2) / 1000) + "s)" : " (" + str2 + "ms)";
        java.net.InetAddress[] inetAddressArr = this.AxsJAY;
        if (inetAddressArr != null) {
            int length = inetAddressArr.length;
            for (int i = 0; i < length; i++) {
                this.AwvSrB.add(this.AxsJAY[i].getHostAddress());
                sb.append(this.AxsJAY[i].getHostAddress());
                sb.append(",");
            }
            djBIcL("DNS解析结果:\t" + ((java.lang.Object) new java.lang.StringBuilder(sb.substring(0, sb.length() - 1))) + str3);
        } else {
            if (java.lang.Integer.parseInt(str2) <= 10000) {
                djBIcL("DNS解析结果:\t解析失败" + str3);
                return false;
            }
            java.util.Map<java.lang.String, java.lang.Object> mapCopydefault2 = C31963mKk.copydefault(str);
            java.lang.String str4 = (java.lang.String) mapCopydefault2.get("useTime");
            this.AxsJAY = (java.net.InetAddress[]) mapCopydefault2.get("remoteInet");
            java.lang.String str5 = java.lang.Integer.parseInt(str4) > 5000 ? " (" + (java.lang.Integer.parseInt(str4) / 1000) + "s)" : " (" + str4 + "ms)";
            java.net.InetAddress[] inetAddressArr2 = this.AxsJAY;
            if (inetAddressArr2 == null) {
                djBIcL("DNS解析结果:\t解析失败" + str5);
                return false;
            }
            int length2 = inetAddressArr2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                this.AwvSrB.add(this.AxsJAY[i2].getHostAddress());
                sb.append(this.AxsJAY[i2].getHostAddress());
                sb.append(",");
            }
            djBIcL("DNS解析结果:\t" + ((java.lang.Object) new java.lang.StringBuilder(sb.substring(0, sb.length() - 1))) + str5);
        }
        return true;
    }

    @Override // o.C31958mKf.Activity
    public void OLrzqt(java.lang.String str) {
        djBIcL(str);
    }
}
