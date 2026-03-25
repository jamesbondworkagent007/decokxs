package o;

import com.okinc.network.model.CallChainExtraInfo;
import com.okinc.network.okg.config.NetworkStringEnum;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.executor.OKDohConfig;
import com.okinc.network.okg.dns.model.DOHProcessParam;
import com.okinc.network.okg.request.tag.NonOKXRequest;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43334rnN implements Interceptor {
    public static final Application Companion = new Application(null);
    public final java.lang.String AEQbTJ;
    public final DohTypeEnum copydefault;

    /* JADX INFO: renamed from: o.rnN$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
        }
    }

    public C43334rnN(@NotNull DohTypeEnum dohTypeEnum) {
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        this.copydefault = dohTypeEnum;
        java.lang.String upperCase = dohTypeEnum.getType().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        this.AEQbTJ = upperCase + "_DnsInterceptor";
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.lang.Exception {
        boolean z;
        boolean z2;
        java.lang.String strEZpvd;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z3;
        boolean z4;
        java.lang.String strInvoke;
        Intrinsics.checkNotNullParameter(chain, "");
        long jNanoTime = java.lang.System.nanoTime();
        Request request = chain.request();
        if (!C43371rny.OLrzqt.KWHzl()) {
            try {
                Response responseProceed = chain.proceed(request);
                long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - jNanoTime);
                pUU.KWHzl(this.AEQbTJ, "disabled doh logic, request success --> " + C43466rpn.OLrzqt.KWHzl(responseProceed) + ",cost: " + millis + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
                return responseProceed;
            } catch (java.lang.IllegalStateException e) {
                throw new SocketException(java.lang.String.valueOf(e));
            }
        }
        HttpUrl httpUrlUrl = request.url();
        java.lang.String strHost = httpUrlUrl.host();
        java.lang.String strEncodedPath = httpUrlUrl.encodedPath();
        java.lang.String strEZpvd2 = C43372rnz.copydefault.EZpvd(this.copydefault);
        java.lang.String strHeader = request.header("Subdomain-Strategy");
        SubdomainStrategy subdomainStrategyOLrzqt = C43347rna.EZpvd.OLrzqt(this.copydefault, strHeader);
        java.lang.String strAEQbTJ = subdomainStrategyOLrzqt instanceof SubdomainStrategy.Subdomain ? ((SubdomainStrategy.Subdomain) subdomainStrategyOLrzqt).AEQbTJ() : null;
        DOHProcessParam dOHProcessParam = new DOHProcessParam();
        HttpUrl httpUrlOLrzqt = OLrzqt(httpUrlUrl, subdomainStrategyOLrzqt, strEZpvd2, dOHProcessParam);
        KWHzl(httpUrlUrl, subdomainStrategyOLrzqt, dOHProcessParam);
        dOHProcessParam.setHolderUrl(httpUrlUrl);
        dOHProcessParam.setRequestUrl(httpUrlOLrzqt);
        if (strHeader != null) {
            dOHProcessParam.setOriginSubdomainStrategy(subdomainStrategyOLrzqt);
        }
        java.lang.String strKWHzl = KWHzl(httpUrlUrl, strEZpvd2, dOHProcessParam);
        Request.Builder builderNewBuilder = request.newBuilder();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) httpUrlUrl.host(), (java.lang.Object) strEZpvd2);
        boolean zOLrzqt = OLrzqt(zEZpvd, httpUrlOLrzqt);
        boolean z5 = strKWHzl != null;
        if (strKWHzl != null) {
            z = zOLrzqt;
            z2 = z5;
            strEZpvd = strKWHzl;
        } else if (zOLrzqt) {
            copydefault(strHost, strEZpvd2, builderNewBuilder, strEncodedPath);
            strKWHzl = httpUrlOLrzqt.host();
            z = zOLrzqt;
            z2 = z5;
            strEZpvd = strKWHzl;
        } else {
            strEZpvd = EZpvd(dOHProcessParam.getRequestUrlIsCORHost(), strAEQbTJ);
            if (strEZpvd == null || strEZpvd.length() == 0) {
                java.lang.String str4 = this.AEQbTJ;
                java.lang.String type = this.copydefault.getType();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                z = zOLrzqt;
                sb.append("DNS_AWAIT -> ");
                sb.append(type);
                sb.append(",host = ");
                sb.append(strHost);
                sb.append(" url=");
                sb.append(strEncodedPath);
                pUU.KWHzl(str4, sb.toString());
                strEZpvd = AEQbTJ(dOHProcessParam.getRequestUrlIsCORHost(), strEncodedPath, strAEQbTJ);
                if (strEZpvd == null || strEZpvd.length() == 0) {
                    pUU.valueOf(this.AEQbTJ, "DNS_AWAIT -> " + this.copydefault.getType() + " timeout, host = " + strHost + " url = " + strEncodedPath);
                    Function1<NetworkStringEnum, java.lang.String> function1ZsXlph = C43292rmY.OLrzqt.zsXlph();
                    if (function1ZsXlph == null || (strInvoke = function1ZsXlph.invoke(NetworkStringEnum.NETWORK_ERROR)) == null) {
                        strInvoke = this.copydefault.getType() + " Dns Timeout";
                    }
                    throw new SocketTimeoutException(strInvoke);
                }
                z2 = z5;
                pUU.KWHzl(this.AEQbTJ, "DNS_AWAIT -> " + this.copydefault.getType() + " finished, host = " + strHost + " url = " + strEncodedPath + " replaceHost = " + strEZpvd);
            } else {
                z = zOLrzqt;
                z2 = z5;
            }
            dOHProcessParam.setDohUrl(httpUrlUrl.newBuilder().host(strEZpvd).build());
            builderNewBuilder.header("change", "1");
        }
        if (zEZpvd) {
            builderNewBuilder.header("Host", strEZpvd);
        }
        builderNewBuilder.url(httpUrlUrl.newBuilder().host(strEZpvd).build());
        builderNewBuilder.removeHeader("Subdomain-Strategy");
        builderNewBuilder.tag(DOHProcessParam.class, dOHProcessParam);
        KWHzl(request, httpUrlUrl, dOHProcessParam);
        Request requestBuild = builderNewBuilder.build();
        try {
            pUU.KWHzl(this.AEQbTJ, "request start --> " + requestBuild.url().encodedPath());
            Response responseProceed2 = chain.proceed(requestBuild);
            long millis2 = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - jNanoTime);
            java.lang.String str5 = this.AEQbTJ;
            C43466rpn c43466rpn = C43466rpn.OLrzqt;
            java.lang.String strKWHzl2 = c43466rpn.KWHzl(responseProceed2);
            java.lang.String strEZpvd3 = c43466rpn.EZpvd(chain);
            java.lang.String type2 = this.copydefault.getType();
            java.lang.String simpleString = dOHProcessParam.toSimpleString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("request success --> ");
            sb2.append(strKWHzl2);
            sb2.append(",ip:");
            sb2.append(strEZpvd3);
            str3 = ",cost: ";
            try {
                sb2.append(str3);
                sb2.append(millis2);
                sb2.append("ms,type: ");
                sb2.append(type2);
                sb2.append(", useDebugHost:");
                z4 = z2;
                try {
                    sb2.append(z4);
                    str2 = ",isDirect: ";
                    try {
                        sb2.append(str2);
                        z3 = z;
                        try {
                            sb2.append(z3);
                            str = ", dohParam:";
                            try {
                                sb2.append(str);
                                sb2.append(simpleString);
                                pUU.KWHzl(str5, sb2.toString());
                                return responseProceed2;
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                C43466rpn c43466rpn2 = C43466rpn.OLrzqt;
                                java.lang.String strEZpvd4 = c43466rpn2.EZpvd(e);
                                java.lang.Exception exc = e;
                                pUU.KWHzl(this.AEQbTJ, "request failed -->" + requestBuild.url() + ", type: " + this.copydefault.getType() + ", ip:" + c43466rpn2.EZpvd(chain) + ",useDebugHost: " + z4 + str2 + z3 + str + dOHProcessParam.toSimpleString() + str3 + java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - jNanoTime) + "ms, cancel:" + c43466rpn2.OLrzqt(chain) + ",exception : " + strEZpvd4);
                                throw exc;
                            }
                        } catch (java.lang.Exception e3) {
                            e = e3;
                            str = ", dohParam:";
                        }
                    } catch (java.lang.Exception e4) {
                        e = e4;
                        str = ", dohParam:";
                        z3 = z;
                        C43466rpn c43466rpn22 = C43466rpn.OLrzqt;
                        java.lang.String strEZpvd42 = c43466rpn22.EZpvd(e);
                        java.lang.Exception exc2 = e;
                        pUU.KWHzl(this.AEQbTJ, "request failed -->" + requestBuild.url() + ", type: " + this.copydefault.getType() + ", ip:" + c43466rpn22.EZpvd(chain) + ",useDebugHost: " + z4 + str2 + z3 + str + dOHProcessParam.toSimpleString() + str3 + java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - jNanoTime) + "ms, cancel:" + c43466rpn22.OLrzqt(chain) + ",exception : " + strEZpvd42);
                        throw exc2;
                    }
                } catch (java.lang.Exception e5) {
                    e = e5;
                    str = ", dohParam:";
                    str2 = ",isDirect: ";
                }
            } catch (java.lang.Exception e6) {
                e = e6;
                str = ", dohParam:";
                str2 = ",isDirect: ";
                z3 = z;
                z4 = z2;
                C43466rpn c43466rpn222 = C43466rpn.OLrzqt;
                java.lang.String strEZpvd422 = c43466rpn222.EZpvd(e);
                java.lang.Exception exc22 = e;
                pUU.KWHzl(this.AEQbTJ, "request failed -->" + requestBuild.url() + ", type: " + this.copydefault.getType() + ", ip:" + c43466rpn222.EZpvd(chain) + ",useDebugHost: " + z4 + str2 + z3 + str + dOHProcessParam.toSimpleString() + str3 + java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - jNanoTime) + "ms, cancel:" + c43466rpn222.OLrzqt(chain) + ",exception : " + strEZpvd422);
                throw exc22;
            }
        } catch (java.lang.Exception e7) {
            e = e7;
            str = ", dohParam:";
            str2 = ",isDirect: ";
            str3 = ",cost: ";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(@NotNull HttpUrl httpUrl, @NotNull SubdomainStrategy subdomainStrategy, @NotNull DOHProcessParam dOHProcessParam) {
        java.lang.String strAhwBna;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(subdomainStrategy, "");
        Intrinsics.checkNotNullParameter(dOHProcessParam, "");
        if (C43466rpn.OLrzqt.KWHzl(httpUrl)) {
            dOHProcessParam.setSubdomainSite("OTHER");
            return;
        }
        if (subdomainStrategy instanceof SubdomainStrategy.Subdomain) {
            strAhwBna = ((SubdomainStrategy.Subdomain) subdomainStrategy).AEQbTJ();
        } else if (!(subdomainStrategy instanceof SubdomainStrategy.Global)) {
            if (!(subdomainStrategy instanceof SubdomainStrategy.Auto)) {
                throw new NoWhenBranchMatchedException();
            }
            strAhwBna = C43655rtQ.OLrzqt.AhwBna();
            if (strAhwBna == null) {
                strAhwBna = "OKX_GLOBAL";
            }
        }
        dOHProcessParam.setSubdomainSite(strAhwBna);
    }

    public final boolean OLrzqt(boolean z, HttpUrl httpUrl) {
        if (!z) {
            return true;
        }
        java.lang.String strHost = httpUrl.host();
        if (this.copydefault == DohTypeEnum.HTTP) {
            C43372rnz c43372rnz = C43372rnz.copydefault;
            if (c43372rnz.AhwBna() && c43372rnz.copydefault(strHost)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String KWHzl(HttpUrl httpUrl, java.lang.String str, DOHProcessParam dOHProcessParam) {
        java.lang.String strEZpvd = EZpvd(dOHProcessParam);
        if (!Intrinsics.EZpvd((java.lang.Object) httpUrl.host(), (java.lang.Object) str)) {
            strEZpvd = null;
        }
        if (strEZpvd == null || strEZpvd.length() == 0) {
            return null;
        }
        return strEZpvd;
    }

    public final HttpUrl OLrzqt(HttpUrl httpUrl, SubdomainStrategy subdomainStrategy, java.lang.String str, DOHProcessParam dOHProcessParam) {
        java.lang.String strFJNWhG;
        kotlin.Pair pairOLrzqt;
        java.lang.String strKWHzl;
        int i = Activity.copydefault[this.copydefault.ordinal()];
        if (i == 1) {
            strFJNWhG = C43292rmY.OLrzqt.fJNWhG();
        } else if (i == 2) {
            strFJNWhG = C43292rmY.OLrzqt.zuBGHE();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            strFJNWhG = C43292rmY.OLrzqt.AxsJAY();
        }
        if (!Intrinsics.EZpvd((java.lang.Object) httpUrl.host(), (java.lang.Object) str)) {
            java.lang.String strHost = httpUrl.host();
            HttpUrl httpUrl2 = HttpUrl.Companion.parse(strFJNWhG);
            if (!Intrinsics.EZpvd((java.lang.Object) strHost, (java.lang.Object) (httpUrl2 != null ? httpUrl2.host() : null))) {
                return httpUrl;
            }
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) httpUrl.host(), (java.lang.Object) str);
        if (subdomainStrategy instanceof SubdomainStrategy.Subdomain) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ((SubdomainStrategy.Subdomain) subdomainStrategy).AEQbTJ());
        } else if (subdomainStrategy instanceof SubdomainStrategy.Global) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null);
        } else {
            if (!(subdomainStrategy instanceof SubdomainStrategy.Auto)) {
                throw new NoWhenBranchMatchedException();
            }
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Boolean.valueOf(C43347rna.EZpvd.EZpvd()), null);
        }
        dOHProcessParam.setRequestUrlIsCORHost(((java.lang.Boolean) pairOLrzqt.getFirst()).booleanValue());
        if (!zEZpvd && !((java.lang.Boolean) pairOLrzqt.getFirst()).booleanValue()) {
            return httpUrl;
        }
        if (((java.lang.Boolean) pairOLrzqt.getFirst()).booleanValue()) {
            strKWHzl = C43372rnz.copydefault.AEQbTJ(this.copydefault, (java.lang.String) pairOLrzqt.getSecond());
        } else {
            strKWHzl = OKDohConfig.Companion.KWHzl(this.copydefault);
        }
        if (strKWHzl == null) {
            pUU.valueOf(this.AEQbTJ, "replaceHost is null");
            return httpUrl;
        }
        return httpUrl.newBuilder().host(strKWHzl).build();
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, Request.Builder builder, java.lang.String str3) {
        boolean zEZpvd;
        int i = Activity.copydefault[this.copydefault.ordinal()];
        if (i == 1) {
            HttpUrl httpUrl = HttpUrl.Companion.parse(C43292rmY.OLrzqt.fJNWhG());
            zEZpvd = Intrinsics.EZpvd((java.lang.Object) (httpUrl != null ? httpUrl.host() : null), (java.lang.Object) str);
        } else if (i == 2) {
            HttpUrl httpUrl2 = HttpUrl.Companion.parse(C43292rmY.OLrzqt.zuBGHE());
            zEZpvd = Intrinsics.EZpvd((java.lang.Object) (httpUrl2 != null ? httpUrl2.host() : null), (java.lang.Object) str);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            HttpUrl httpUrl3 = HttpUrl.Companion.parse(C43292rmY.OLrzqt.AxsJAY());
            zEZpvd = Intrinsics.EZpvd((java.lang.Object) (httpUrl3 != null ? httpUrl3.host() : null), (java.lang.Object) str);
        }
        if (!C43292rmY.OLrzqt.iwGUEr() || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2) || zEZpvd) {
            return;
        }
        builder.tag(NonOKXRequest.class, new NonOKXRequest());
        pUU.KWHzl(this.AEQbTJ, "will remove private headershost = " + str + ", path: " + str3);
    }

    public final void KWHzl(Request request, HttpUrl httpUrl, DOHProcessParam dOHProcessParam) {
        HttpUrl dohUrl = dOHProcessParam.getDohUrl();
        if (dohUrl == null) {
            dohUrl = dOHProcessParam.getRequestUrl();
        }
        if (dohUrl != null) {
            C43365rns.OLrzqt.AhwBna().put(httpUrl.encodedPath(), C56390yDp.OLrzqt(dohUrl.host(), dOHProcessParam.getSubdomainSite()));
        }
        CallChainExtraInfo callChainExtraInfo = (CallChainExtraInfo) request.tag(CallChainExtraInfo.class);
        if (callChainExtraInfo != null) {
            callChainExtraInfo.setConnectUrl(dohUrl);
        }
    }

    public final java.lang.String EZpvd(boolean z, java.lang.String str) {
        return C43372rnz.copydefault.EZpvd(this.copydefault, z, str);
    }

    public final java.lang.String AEQbTJ(boolean z, java.lang.String str, java.lang.String str2) {
        C43372rnz c43372rnz = C43372rnz.copydefault;
        ReentrantLock reentrantLockOLrzqt = c43372rnz.OLrzqt(this.copydefault, z, str2);
        java.util.concurrent.locks.Condition conditionCopydefault = c43372rnz.copydefault(this.copydefault, z, str2);
        if (reentrantLockOLrzqt != null && conditionCopydefault != null) {
            reentrantLockOLrzqt.lock();
            int i = 15;
            while (true) {
                try {
                    try {
                        java.lang.String strEZpvd = EZpvd(z, str2);
                        if ((strEZpvd != null && strEZpvd.length() != 0) || i <= 0) {
                            break;
                        }
                        conditionCopydefault.await(1L, java.util.concurrent.TimeUnit.SECONDS);
                        i--;
                    } catch (java.lang.Exception e) {
                        pUU.copydefault(this.AEQbTJ, "awaitHost doDoh timeout, requestPath:" + str + ", e: " + e);
                    }
                } finally {
                    reentrantLockOLrzqt.unlock();
                }
            }
        } else if (z) {
            AEQbTJ(str, str2);
        }
        return EZpvd(z, str2);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        C43655rtQ c43655rtQ = C43655rtQ.OLrzqt;
        java.lang.String str3 = "need setCORDomain first. path:" + str + ", useSite:" + c43655rtQ.AhwBna() + ", forceSite:" + str2;
        yHO<java.lang.Throwable, java.util.Map<java.lang.String, java.lang.String>, java.lang.Boolean, Unit> yhoIsConnected = C43292rmY.OLrzqt.isConnected();
        if (yhoIsConnected != null) {
            yhoIsConnected.invoke(new java.lang.RuntimeException(str3), C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", "missing_call_setcordomain"), C56390yDp.OLrzqt("request_path", str), C56390yDp.OLrzqt("user_site", java.lang.String.valueOf(c43655rtQ.AhwBna())), C56390yDp.OLrzqt("force_site", java.lang.String.valueOf(str2))), java.lang.Boolean.FALSE);
        }
    }

    public final java.lang.String EZpvd(DOHProcessParam dOHProcessParam) {
        return C43372rnz.copydefault.EZpvd(this.copydefault, !dOHProcessParam.getRequestUrlIsCORHost());
    }

    /* JADX INFO: renamed from: o.rnN$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rnN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
