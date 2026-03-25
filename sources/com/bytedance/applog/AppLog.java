package com.bytedance.applog;

import android.accounts.Account;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.alink.IALinkListener;
import com.bytedance.applog.event.EventBuilder;
import com.bytedance.applog.event.IEventHandler;
import com.bytedance.applog.exposure.ViewExposureManager;
import com.bytedance.applog.log.LogUtils;
import com.bytedance.applog.network.INetworkClient;
import com.bytedance.applog.oneid.IDBindCallback;
import com.bytedance.applog.profile.UserProfileCallback;
import com.bytedance.bdtracker.d;
import com.bytedance.bdtracker.f;
import com.bytedance.bdtracker.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AppLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IAppLogInstance f105a = newInstance();
    public static volatile boolean b = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void activateALink(Uri uri) {
        f105a.activateALink(uri);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void addDataObserver(IDataObserver iDataObserver) {
        f105a.addDataObserver(iDataObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void addEventJsonObserver(IEventJsonObserver iEventJsonObserver) {
        f105a.addEventJsonObserver(iEventJsonObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void addEventObserver(IEventObserver iEventObserver) {
        f105a.addEventObserver(iEventObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static void addEventObserver(IEventObserver iEventObserver, IPresetEventObserver iPresetEventObserver) {
        f105a.addEventObserver(iEventObserver, iPresetEventObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static String addNetCommonParams(Context context, String str, boolean z, Level level) {
        return f105a.addNetCommonParams(context, str, z, level);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void addSessionHook(ISessionObserver iSessionObserver) {
        f105a.addSessionHook(iSessionObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void bind(Map<String, String> map, IDBindCallback iDBindCallback) {
        f105a.bind(map, iDBindCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean clearDb() {
        return f105a.clearDb();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void flush() {
        f105a.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <T> T getAbConfig(String str, T t) {
        return (T) f105a.getAbConfig(str, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getAbSdkVersion() {
        return f105a.getAbSdkVersion();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static IActiveCustomParamsCallback getActiveCustomParams() {
        return f105a.getActiveCustomParams();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static String getAid() {
        return f105a.getAid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JSONObject getAllAbTestConfigs() {
        return f105a.getAllAbTestConfigs();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static f getAppContext() {
        return f105a.getAppContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getAppId() {
        return f105a.getAppId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getClientUdid() {
        return f105a.getClientUdid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Context getContext() {
        return f105a.getContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getDid() {
        return f105a.getDid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean getEncryptAndCompress() {
        return f105a.getEncryptAndCompress();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getExternalAbVersion() {
        return f105a.getExternalAbVersion();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static JSONObject getHeader() {
        return f105a.getHeader();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static IHeaderCustomTimelyCallback getHeaderCustomCallback() {
        return f105a.getHeaderCustomCallback();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <T> T getHeaderValue(String str, T t, Class<T> cls) {
        return (T) f105a.getHeaderValue(str, t, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getIid() {
        return f105a.getIid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InitConfig getInitConfig() {
        return f105a.getInitConfig();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static IAppLogInstance getInstance() {
        return f105a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static INetworkClient getNetClient() {
        return f105a.getNetClient();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getOpenUdid() {
        return f105a.getOpenUdid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static Map<String, String> getRequestHeader() {
        return f105a.getRequestHeader();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getSdkVersion() {
        return f105a.getSdkVersion();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getSessionId() {
        return f105a.getSessionId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getSsid() {
        return f105a.getSsid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void getSsidGroup(Map<String, String> map) {
        f105a.getSsidGroup(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static String getUdid() {
        return f105a.getUdid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static UriConfig getUriRuntime() {
        return f105a.getUriRuntime();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getUserID() {
        return f105a.getUserID();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getUserUniqueID() {
        return f105a.getUserUniqueID();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static ViewExposureManager getViewExposureManager() {
        return f105a.getViewExposureManager();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JSONObject getViewProperties(View view) {
        return f105a.getViewProperties(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean hasStarted() {
        return f105a.hasStarted();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void ignoreAutoTrackClick(View view) {
        f105a.ignoreAutoTrackClick(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void ignoreAutoTrackClickByViewType(Class<?>... clsArr) {
        f105a.ignoreAutoTrackClickByViewType(clsArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void ignoreAutoTrackPage(Class<?>... clsArr) {
        f105a.ignoreAutoTrackPage(clsArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void init(@NonNull Context context, @NonNull InitConfig initConfig) {
        synchronized (AppLog.class) {
            if (r.a(b, "Default AppLog is initialized, please create another instance by `AppLog.newInstance()`")) {
                return;
            }
            b = true;
            if (TextUtils.isEmpty(initConfig.getSpName())) {
                initConfig.setSpName("applog_stats");
            }
            f105a.init(context, initConfig);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void init(@NonNull Context context, @NonNull InitConfig initConfig, Activity activity) {
        synchronized (AppLog.class) {
            if (r.a(b, "Default AppLog is initialized, please create another instance by `new AppLogInstance()`")) {
                return;
            }
            b = true;
            if (TextUtils.isEmpty(initConfig.getSpName())) {
                initConfig.setSpName("applog_stats");
            }
            f105a.init(context, initConfig, activity);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void initH5Bridge(@NonNull View view, @NonNull String str) {
        f105a.initH5Bridge(view, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void initWebViewBridge(@NonNull View view, @NonNull String str) {
        f105a.initWebViewBridge(view, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isAutoTrackClickIgnored(View view) {
        return f105a.isAutoTrackClickIgnored(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isAutoTrackPageIgnored(Class<?> cls) {
        return f105a.isAutoTrackPageIgnored(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isH5BridgeEnable() {
        return f105a.isH5BridgeEnable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isH5CollectEnable() {
        return f105a.isH5CollectEnable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isNewUser() {
        return f105a.isNewUser();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isPrivacyMode() {
        return f105a.isPrivacyMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean manualActivate() {
        return f105a.manualActivate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static EventBuilder newEvent(@NonNull String str) {
        return f105a.newEvent(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static IAppLogInstance newInstance() {
        return new d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void onActivityPause() {
        f105a.onActivityPause();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void onActivityResumed(@NonNull Activity activity, int i) {
        f105a.onActivityResumed(activity, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void onEventV3(@NonNull String str) {
        f105a.onEventV3(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void onEventV3(@NonNull String str, @Nullable Bundle bundle) {
        f105a.onEventV3(str, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void onEventV3(@NonNull String str, @Nullable Bundle bundle, int i) {
        f105a.onEventV3(str, bundle, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void onEventV3(@NonNull String str, @Nullable JSONObject jSONObject) {
        f105a.onEventV3(str, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void onEventV3(@NonNull String str, @Nullable JSONObject jSONObject, int i) {
        f105a.onEventV3(str, jSONObject, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static void onMiscEvent(@NonNull String str, @Nullable JSONObject jSONObject) {
        f105a.onMiscEvent(str, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void onPause(@NonNull Context context) {
        f105a.onPause(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void onResume(@NonNull Context context) {
        f105a.onResume(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void pauseDurationEvent(String str) {
        f105a.pauseDurationEvent(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void profileAppend(JSONObject jSONObject) {
        f105a.profileAppend(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void profileIncrement(JSONObject jSONObject) {
        f105a.profileIncrement(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void profileSet(JSONObject jSONObject) {
        f105a.profileSet(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void profileSetOnce(JSONObject jSONObject) {
        f105a.profileSetOnce(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void profileUnset(String str) {
        f105a.profileUnset(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void pullAbTestConfigs() {
        f105a.pullAbTestConfigs();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void pullAbTestConfigs(int i, IPullAbTestConfigCallback iPullAbTestConfigCallback) {
        f105a.pullAbTestConfigs(i, iPullAbTestConfigCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static void putCommonParams(Context context, Map<String, String> map, boolean z, Level level) {
        f105a.putCommonParams(context, map, z, level);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static void registerHeaderCustomCallback(IHeaderCustomTimelyCallback iHeaderCustomTimelyCallback) {
        f105a.registerHeaderCustomCallback(iHeaderCustomTimelyCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void removeAllDataObserver() {
        f105a.removeAllDataObserver();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void removeDataObserver(IDataObserver iDataObserver) {
        f105a.removeDataObserver(iDataObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void removeEventJsonObserver(IEventJsonObserver iEventJsonObserver) {
        f105a.removeJsonEventObserver(iEventJsonObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void removeEventObserver(IEventObserver iEventObserver) {
        f105a.removeJsonEventObserver(iEventObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static void removeEventObserver(IEventObserver iEventObserver, IPresetEventObserver iPresetEventObserver) {
        f105a.removeEventObserver(iEventObserver, iPresetEventObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void removeHeaderInfo(String str) {
        f105a.removeHeaderInfo(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void removeOaidObserver(@Nullable IOaidObserver iOaidObserver) {
        f105a.removeOaidObserver(iOaidObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void removeSessionHook(ISessionObserver iSessionObserver) {
        f105a.removeSessionHook(iSessionObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void resumeDurationEvent(String str) {
        f105a.resumeDurationEvent(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setALinkListener(IALinkListener iALinkListener) {
        f105a.setALinkListener(iALinkListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static void setAccount(Account account) {
        f105a.setAccount(account);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setActiveCustomParams(IActiveCustomParamsCallback iActiveCustomParamsCallback) {
        f105a.setActiveCustomParams(iActiveCustomParamsCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static void setAppContext(@NonNull f fVar) {
        f105a.setAppContext(fVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setAppLanguageAndRegion(@NonNull String str, @NonNull String str2) {
        f105a.setAppLanguageAndRegion(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setAppTrack(JSONObject jSONObject) {
        f105a.setAppTrack(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setClipboardEnabled(boolean z) {
        f105a.setClipboardEnabled(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setDevToolsEnable(boolean z) {
        LogUtils.setEnable(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setEncryptAndCompress(boolean z) {
        f105a.setEncryptAndCompress(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setEventFilterByClient(List<String> list, boolean z) {
        f105a.setEventFilterByClient(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setEventHandler(IEventHandler iEventHandler) {
        f105a.setEventHandler(iEventHandler);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setExternalAbVersion(@NonNull String str) {
        f105a.setExternalAbVersion(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static void setExtraParams(IExtraParams iExtraParams) {
        f105a.setExtraParams(iExtraParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setGPSLocation(float f, float f2, String str) {
        f105a.setGPSLocation(f, f2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setGoogleAid(@NonNull String str) {
        f105a.setGoogleAid(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setHeaderInfo(String str, Object obj) {
        f105a.setHeaderInfo(str, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setHeaderInfo(HashMap<String, Object> map) {
        f105a.setHeaderInfo(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setOaidObserver(@Nullable IOaidObserver iOaidObserver) {
        f105a.setOaidObserver(iOaidObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setPrivacyMode(boolean z) {
        f105a.setPrivacyMode(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setPullAbTestConfigsThrottleMills(Long l) {
        f105a.setPullAbTestConfigsThrottleMills(l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setRangersEventVerifyEnable(boolean z, String str) {
        f105a.setRangersEventVerifyEnable(z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setTouchPoint(@NonNull String str) {
        f105a.setTouchPoint(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setTracerData(JSONObject jSONObject) {
        f105a.setTracerData(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setUriRuntime(UriConfig uriConfig) {
        f105a.setUriRuntime(uriConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setUserAgent(@NonNull String str) {
        f105a.setUserAgent(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setUserID(long j) {
        f105a.setUserID(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setUserUniqueID(@Nullable String str) {
        f105a.setUserUniqueID(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setUserUniqueID(@Nullable String str, @Nullable String str2) {
        f105a.setUserUniqueID(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setViewId(Dialog dialog, String str) {
        f105a.setViewId(dialog, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setViewId(View view, String str) {
        f105a.setViewId(view, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setViewId(Object obj, String str) {
        f105a.setViewId(obj, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setViewProperties(View view, JSONObject jSONObject) {
        f105a.setViewProperties(view, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void start() {
        f105a.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void startDurationEvent(String str) {
        f105a.startDurationEvent(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void startSimulator(@NonNull String str) {
        f105a.startSimulator(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void stopDurationEvent(String str, JSONObject jSONObject) {
        f105a.stopDurationEvent(str, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void stopDurationEvent(String str, JSONObject jSONObject, String str2) {
        f105a.stopDurationEvent(str, jSONObject, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void trackClick(View view) {
        f105a.trackClick(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void trackClick(View view, JSONObject jSONObject) {
        f105a.trackClick(view, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void trackPage(Activity activity) {
        f105a.trackPage(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void trackPage(Activity activity, JSONObject jSONObject) {
        f105a.trackPage(activity, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void trackPage(Object obj) {
        f105a.trackPage(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void trackPage(Object obj, JSONObject jSONObject) {
        f105a.trackPage(obj, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static void userProfileSetOnce(JSONObject jSONObject, UserProfileCallback userProfileCallback) {
        f105a.userProfileSetOnce(jSONObject, userProfileCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static void userProfileSync(JSONObject jSONObject, UserProfileCallback userProfileCallback) {
        f105a.userProfileSync(jSONObject, userProfileCallback);
    }
}
