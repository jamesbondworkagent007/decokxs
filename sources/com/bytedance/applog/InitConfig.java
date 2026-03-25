package com.bytedance.applog;

import android.accounts.Account;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.bytedance.applog.network.INetworkClient;
import com.bytedance.applog.network.INetworkClientV2;
import com.bytedance.applog.store.IEventDropStrategy;
import com.bytedance.applog.store.kv.KVStoreConfig;
import com.bytedance.bdtracker.a0;
import com.bytedance.bdtracker.b6;
import com.bytedance.bdtracker.e5;
import com.bytedance.bdtracker.o2;
import com.bytedance.bdtracker.r;
import com.bytedance.mpaas.IEncryptor;
import com.google.android.exoplayer2.C;
import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public class InitConfig {
    public String A;

    @Deprecated
    public String B;
    public SSLSocketFactory B0;
    public Map<String, Object> C;

    @Deprecated
    public Account D;
    public boolean E;
    public INetworkClient F;
    public INetworkClientV2 G;
    public boolean I;
    public IEventDropStrategy K0;
    public String N;
    public String O;
    public ISensitiveInfoProvider P;
    public List<String> V;
    public String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106a;
    public boolean a0;
    public String b;
    public String d;
    public String e;
    public a0 f;
    public String g;
    public String h;
    public ILogger i;
    public String j;

    @Deprecated
    public String k;
    public IPicker l;

    @Deprecated
    public boolean m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f107o;
    public String q;

    @Deprecated
    public boolean r;
    public String s;
    public UriConfig t;
    public String u;

    @Deprecated
    public String v;
    public int w;
    public int x;
    public int y;

    @Deprecated
    public String z;
    public boolean c = true;

    @Deprecated
    public boolean n = false;
    public int p = 0;
    public boolean H = true;
    public boolean J = false;
    public boolean K = true;
    public boolean L = true;
    public boolean M = true;
    public boolean Q = true;
    public boolean R = true;
    public boolean S = false;
    public boolean T = false;
    public boolean U = false;
    public boolean W = false;
    public boolean X = false;
    public boolean Y = true;
    public IpcDataChecker b0 = null;

    @Deprecated
    public String c0 = null;

    @Deprecated
    public String d0 = null;
    public boolean e0 = true;
    public boolean f0 = false;
    public boolean g0 = false;
    public boolean h0 = true;
    public boolean i0 = true;
    public boolean j0 = true;
    public boolean k0 = false;
    public boolean l0 = false;
    public boolean m0 = false;
    public boolean n0 = false;
    public boolean o0 = false;
    public boolean p0 = true;
    public int q0 = 6;
    public boolean r0 = true;
    public boolean s0 = true;
    public int t0 = 2000;
    public int u0 = 0;
    public Map<String, String> v0 = null;
    public DynamicValueCallback<Map<String, String>> w0 = null;
    public boolean x0 = true;

    @Deprecated
    public boolean y0 = true;
    public boolean z0 = true;
    public final Set<String> A0 = new HashSet(4);
    public KVStoreConfig C0 = KVStoreConfig.DEFAULT_CONFIG;
    public DynamicValueCallback<String> D0 = null;
    public boolean E0 = true;
    public boolean F0 = true;
    public boolean G0 = true;
    public boolean H0 = true;
    public boolean I0 = true;
    public boolean J0 = false;

    public interface IpcDataChecker {
        boolean checkIpcData(@NonNull String[] strArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig(@NonNull String str, @NonNull String str2) {
        this.f106a = str;
        this.d = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void addLoaderFilter(String str) {
        this.A0.add(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean autoStart() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig clearABCacheOnUserChange(boolean z) {
        this.Y = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void clearDidAndIid(String str) {
        this.E = true;
        this.e = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig disableDeferredALink() {
        this.X = false;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig enableDeferredALink() {
        this.X = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Account getAccount() {
        return this.D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getAid() {
        String str;
        String strTrim = this.f106a.trim();
        if (!strTrim.startsWith("rangers://")) {
            return strTrim;
        }
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        try {
            URI uri = new URI(strTrim);
            String strReplace = uri.getPath().replace("/", "");
            String host = uri.getHost();
            if (!TextUtils.isEmpty(strReplace) && !TextUtils.isEmpty(host)) {
                try {
                    str = new String(Base64.decode(strReplace.getBytes(C.UTF8_NAME), 2));
                } catch (Throwable unused) {
                    str = "";
                }
                if (host.equalsIgnoreCase(e5.a(str))) {
                    this.b = str;
                    return str;
                }
            }
        } catch (Throwable unused2) {
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public String getAliyunUdid() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public boolean getAnonymous() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAppImei() {
        return this.Z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAppName() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getAutoTrackEventType() {
        return this.q0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getChannel() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getClearKey() {
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, Object> getCommonHeader() {
        return this.C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DynamicValueCallback<String> getCustomOaidCallback() {
        return this.D0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDbName() {
        if (!TextUtils.isEmpty(this.N)) {
            return this.N;
        }
        return r.a((Object) getAid()) + "@bd_tea_agent.db";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IEncryptor getEncryptor() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IEventDropStrategy getEventDropStrategy() {
        return this.K0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getGaidTimeOutMilliSeconds() {
        return this.t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getGoogleAid() {
        return this.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getH5BridgeAllowlist() {
        return this.V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DynamicValueCallback<Map<String, String>> getHttpHeaderCallback() {
        return this.w0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public Map<String, String> getHttpHeaders() {
        return this.v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IpcDataChecker getIpcDataChecker() {
        return this.b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KVStoreConfig getKvStoreConfig() {
        return this.C0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getLanguage() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<String> getLoaderFilters() {
        return this.A0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public boolean getLocalTest() {
        return this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ILogger getLogger() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public String getManifestVersion() {
        return this.z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getManifestVersionCode() {
        return this.y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public INetworkClient getNetworkClient() {
        return this.F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public INetworkClientV2 getNetworkClientV2() {
        return this.G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public boolean getNotReuqestSender() {
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IPicker getPicker() {
        return this.l;
    }

    @Deprecated
    public b6 getPreInstallCallback() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getProcess() {
        return this.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getRegion() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getReleaseBuild() {
        return this.q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ISensitiveInfoProvider getSensitiveInfoProvider() {
        return this.P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSpName() {
        return this.O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SSLSocketFactory getSslSocketFactory() {
        return this.B0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getTrackCrashType() {
        return this.u0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public String getTweakedChannel() {
        return this.v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getUpdateVersionCode() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UriConfig getUriConfig() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public String getUserUniqueId() {
        return this.c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public String getUserUniqueIdType() {
        return this.d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getVersion() {
        return this.u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getVersionCode() {
        return this.w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getVersionMinor() {
        return this.A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public String getZiJieCloudPkg() {
        return this.B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAbEnable() {
        return this.J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAbTestExposureEventRepeatEnabled() {
        return this.G0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAndroidIdEnabled() {
        return this.j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAutoActive() {
        return this.H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAutoTrackEnabled() {
        return this.K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAutoTrackFragmentEnabled() {
        return this.g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isCPUAbiEnabled() {
        return this.H0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isClearABCacheOnUserChange() {
        return this.Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isClearDidAndIid() {
        return this.E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isClickFillPagePropertiesEnable() {
        return this.J0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isCongestionControlEnable() {
        return this.M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isDeferredALinkEnabled() {
        return this.X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isDisplayDensityAndDpiEnabled() {
        return this.I0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isEventFilterEnable() {
        return this.a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isExposureEnabled() {
        return this.k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isGaidEnabled() {
        return this.s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isH5BridgeAllowAll() {
        return this.W;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isH5BridgeEnable() {
        return this.S;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isH5CollectEnable() {
        return this.T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isHandleLifeCycle() {
        return this.L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isHarmonyEnabled() {
        return this.f0;
    }

    @Deprecated
    public boolean isIccIdEnabled() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isImeiEnable() {
        return this.R;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isLaunchTerminateEnabled() {
        return this.z0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isLogEnable() {
        return this.U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isMacEnable() {
        return this.Q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isMetaSecEnabled() {
        return this.h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isMigrateEnabled() {
        return this.r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isMonitorEnabled() {
        return this.m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isOaidEnabled() {
        return this.i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isOperatorInfoEnabled() {
        return this.p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public boolean isPageMetaAnnotationEnable() {
        return this.y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isPlayEnable() {
        return this.f107o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isReportOaidEnable() {
        return this.o0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isResponseEncryptEnabled() {
        return this.F0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isScreenOrientationEnabled() {
        return this.n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isScrollObserveEnabled() {
        return this.l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSerialNumberEnable() {
        return this.x0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSilenceInBackground() {
        return this.I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isTrackEventEnabled() {
        return this.e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isUseBridgeUpdateUUIDEnabled() {
        return this.E0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InitConfig putCommonHeader(Map<String, Object> map) {
        this.C = map;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAbEnable(boolean z) {
        this.J = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAbTestExposureEventRepeatEnabled(boolean z) {
        this.G0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InitConfig setAccount(Account account) {
        this.D = account;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InitConfig setAliyunUdid(String str) {
        this.k = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAndroidIdEnabled(boolean z) {
        this.j0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InitConfig setAnonymous(boolean z) {
        this.m = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAppImei(String str) {
        this.Z = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setAppName(String str) {
        this.s = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAutoActive(boolean z) {
        this.H = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setAutoStart(boolean z) {
        this.c = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAutoTrackEnabled(boolean z) {
        this.K = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAutoTrackEventType(int i) {
        this.q0 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAutoTrackFragmentEnabled(boolean z) {
        this.g0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCPUAbiEnabled(boolean z) {
        this.H0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setChannel(@NonNull String str) {
        this.d = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setClickFillPagePropertiesEnable(boolean z) {
        this.J0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCongestionControlEnable(boolean z) {
        this.M = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCustomOaidCallback(DynamicValueCallback<String> dynamicValueCallback) {
        this.D0 = dynamicValueCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setDbName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.N = str;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDisplayDensityAndDpiEnabled(boolean z) {
        this.I0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setEnablePlay(boolean z) {
        this.f107o = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setEncryptor(IEncryptor iEncryptor) {
        this.f = new a0(iEncryptor, IEncryptorType.DEFAULT_ENCRYPTOR);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setEncryptor(IEncryptor iEncryptor, String str) {
        this.f = new a0(iEncryptor, str);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setEventDropStrategy(IEventDropStrategy iEventDropStrategy) {
        this.K0 = iEventDropStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setEventFilterEnable(boolean z) {
        this.a0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setExposureEnabled(boolean z) {
        this.k0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setGaidEnabled(boolean z) {
        this.s0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setGaidTimeOutMilliSeconds(int i) {
        this.t0 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setGoogleAid(String str) {
        this.g = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setH5BridgeAllowAll(boolean z) {
        this.W = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setH5BridgeAllowlist(List<String> list) {
        this.V = list;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setH5BridgeEnable(boolean z) {
        this.S = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setH5CollectEnable(boolean z) {
        this.T = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setHandleLifeCycle(boolean z) {
        this.L = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setHarmonyEnable(boolean z) {
        this.f0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public void setHttpHeaders(Map<String, String> map) {
        this.v0 = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setHttpHeadersCallback(DynamicValueCallback<Map<String, String>> dynamicValueCallback) {
        this.w0 = dynamicValueCallback;
    }

    @Deprecated
    public void setIccIdEnabled(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setImeiEnable(boolean z) {
        this.R = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setIpcDataChecker(IpcDataChecker ipcDataChecker) {
        this.b0 = ipcDataChecker;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setKvStoreConfig(KVStoreConfig kVStoreConfig) {
        this.C0 = kVStoreConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setLanguage(String str) {
        this.h = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLaunchTerminateEnabled(boolean z) {
        this.z0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InitConfig setLocalTest(boolean z) {
        this.n = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setLogEnable(boolean z) {
        this.U = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setLogger(ILogger iLogger) {
        this.i = iLogger;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMacEnable(boolean z) {
        this.Q = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setMainProcess() {
        this.p = 1;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InitConfig setManifestVersion(String str) {
        this.z = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setManifestVersionCode(int i) {
        this.y = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMetaSecEnabled(boolean z) {
        this.h0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMigrateEnabled(boolean z) {
        this.r0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMonitorEnabled(boolean z) {
        o2.b(this);
        this.m0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setNetworkClient(INetworkClient iNetworkClient) {
        this.F = iNetworkClient;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNetworkClient(INetworkClientV2 iNetworkClientV2) {
        this.G = iNetworkClientV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InitConfig setNotRequestSender(boolean z) {
        this.r = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOaidEnabled(boolean z) {
        this.i0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOperatorInfoEnabled(boolean z) {
        this.p0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public void setPageMetaAnnotationEnable(boolean z) {
        this.y0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setPicker(IPicker iPicker) {
        this.l = iPicker;
        return this;
    }

    @Deprecated
    public InitConfig setPreInstallChannelCallback(b6 b6Var) {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setProcess(int i) {
        this.p = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setRegion(String str) {
        this.j = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setReleaseBuild(String str) {
        this.q = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setReportOaidEnable(boolean z) {
        this.o0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setResponseEncryptEnabled(boolean z) {
        this.F0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setScreenOrientationEnabled(boolean z) {
        this.n0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setScrollObserveEnabled(boolean z) {
        this.l0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSensitiveInfoProvider(ISensitiveInfoProvider iSensitiveInfoProvider) {
        this.P = iSensitiveInfoProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSerialNumberEnable(boolean z) {
        this.x0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSilenceInBackground(boolean z) {
        this.I = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setSpName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.O = str;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.B0 = sSLSocketFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTrackCrashType(int i) {
        this.u0 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTrackEventEnabled(boolean z) {
        this.e0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InitConfig setTweakedChannel(String str) {
        this.v = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setUpdateVersionCode(int i) {
        this.x = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setUriConfig(int i) {
        this.t = UriConfig.createUriConfig(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setUriConfig(UriConfig uriConfig) {
        this.t = uriConfig;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUseBridgeUpdateUUIDEnabled(boolean z) {
        this.E0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InitConfig setUserUniqueId(String str) {
        this.c0 = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InitConfig setUserUniqueIdType(String str) {
        this.d0 = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setVersion(String str) {
        this.u = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setVersionCode(int i) {
        this.w = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitConfig setVersionMinor(String str) {
        this.A = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InitConfig setZiJieCloudPkg(String str) {
        this.B = str;
        return this;
    }
}
