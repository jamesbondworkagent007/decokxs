package com.bytedance.applog;

import android.accounts.Account;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.alink.IALinkListener;
import com.bytedance.applog.event.EventBuilder;
import com.bytedance.applog.event.IEventHandler;
import com.bytedance.applog.exposure.ViewExposureManager;
import com.bytedance.applog.network.INetworkClient;
import com.bytedance.applog.oneid.IDBindCallback;
import com.bytedance.applog.profile.UserProfileCallback;
import com.bytedance.bdtracker.f;
import com.bytedance.bdtracker.f1;
import com.bytedance.bdtracker.f4;
import com.bytedance.bdtracker.m2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface IAppLogInstance {
    void activateALink(Uri uri);

    void addDataObserver(IDataObserver iDataObserver);

    void addEventJsonObserver(IEventJsonObserver iEventJsonObserver);

    void addEventObserver(IEventObserver iEventObserver);

    @Deprecated
    void addEventObserver(IEventObserver iEventObserver, IPresetEventObserver iPresetEventObserver);

    @Deprecated
    String addNetCommonParams(Context context, String str, boolean z, Level level);

    void addSessionHook(ISessionObserver iSessionObserver);

    void bind(Map<String, String> map, IDBindCallback iDBindCallback);

    void clearAbTestConfigsCache();

    boolean clearDb();

    void flush();

    IALinkListener getALinkListener();

    <T> T getAbConfig(String str, T t);

    String getAbSdkVersion();

    IActiveCustomParamsCallback getActiveCustomParams();

    @Deprecated
    String getAid();

    JSONObject getAllAbTestConfigs();

    @Deprecated
    f getAppContext();

    String getAppId();

    String getClientUdid();

    Context getContext();

    String getDeepLinkUrl();

    String getDid();

    boolean getEncryptAndCompress();

    f1 getEventFilterByClient();

    IEventHandler getEventHandler();

    String getExternalAbVersion();

    @Deprecated
    JSONObject getHeader();

    @Deprecated
    IHeaderCustomTimelyCallback getHeaderCustomCallback();

    <T> T getHeaderValue(String str, T t, Class<T> cls);

    String getIid();

    InitConfig getInitConfig();

    int getLaunchFrom();

    m2 getMonitor();

    INetworkClient getNetClient();

    String getOpenUdid();

    @Deprecated
    Map<String, String> getRequestHeader();

    String getSdkVersion();

    String getSessionId();

    String getSsid();

    void getSsidGroup(Map<String, String> map);

    @Deprecated
    String getUdid();

    UriConfig getUriRuntime();

    String getUserID();

    String getUserUniqueID();

    ViewExposureManager getViewExposureManager();

    JSONObject getViewProperties(View view);

    boolean hasStarted();

    void ignoreAutoTrackClick(View view);

    void ignoreAutoTrackClickByViewType(Class<?>... clsArr);

    void ignoreAutoTrackPage(Class<?>... clsArr);

    void init(@NonNull Context context, @NonNull InitConfig initConfig);

    void init(@NonNull Context context, @NonNull InitConfig initConfig, Activity activity);

    void initH5Bridge(@NonNull View view, @NonNull String str);

    void initMetaSec(@NonNull Context context);

    void initWebViewBridge(@NonNull View view, @NonNull String str);

    boolean isAutoTrackClickIgnored(View view);

    boolean isAutoTrackPageIgnored(Class<?> cls);

    boolean isBavEnabled();

    boolean isH5BridgeEnable();

    boolean isH5CollectEnable();

    boolean isNewUser();

    boolean isPrivacyMode();

    boolean manualActivate();

    EventBuilder newEvent(@NonNull String str);

    void onActivityPause();

    void onActivityResumed(@NonNull Activity activity, int i);

    void onEventV3(@NonNull String str);

    void onEventV3(@NonNull String str, @Nullable Bundle bundle);

    void onEventV3(@NonNull String str, @Nullable Bundle bundle, int i);

    void onEventV3(@NonNull String str, @Nullable JSONObject jSONObject);

    void onEventV3(@NonNull String str, @Nullable JSONObject jSONObject, int i);

    @Deprecated
    void onMiscEvent(@NonNull String str, @Nullable JSONObject jSONObject);

    void onPause(@NonNull Context context);

    void onResume(@NonNull Context context);

    void pauseDurationEvent(String str);

    void profileAppend(JSONObject jSONObject);

    void profileIncrement(JSONObject jSONObject);

    void profileSet(JSONObject jSONObject);

    void profileSetOnce(JSONObject jSONObject);

    void profileUnset(String str);

    void pullAbTestConfigs();

    void pullAbTestConfigs(int i, IPullAbTestConfigCallback iPullAbTestConfigCallback);

    @Deprecated
    void putCommonParams(Context context, Map<String, String> map, boolean z, Level level);

    void receive(f4 f4Var);

    void receive(String[] strArr);

    @Deprecated
    void registerHeaderCustomCallback(IHeaderCustomTimelyCallback iHeaderCustomTimelyCallback);

    void removeAllDataObserver();

    void removeDataObserver(IDataObserver iDataObserver);

    @Deprecated
    void removeEventObserver(IEventObserver iEventObserver, IPresetEventObserver iPresetEventObserver);

    void removeHeaderInfo(String str);

    void removeJsonEventObserver(IEventJsonObserver iEventJsonObserver);

    void removeJsonEventObserver(IEventObserver iEventObserver);

    void removeOaidObserver(@Nullable IOaidObserver iOaidObserver);

    void removeSessionHook(ISessionObserver iSessionObserver);

    void resumeDurationEvent(String str);

    void setALinkListener(IALinkListener iALinkListener);

    @Deprecated
    void setAccount(Account account);

    void setActiveCustomParams(IActiveCustomParamsCallback iActiveCustomParamsCallback);

    @Deprecated
    void setAppContext(@NonNull f fVar);

    void setAppLanguageAndRegion(@NonNull String str, @NonNull String str2);

    void setAppTrack(JSONObject jSONObject);

    void setClipboardEnabled(boolean z);

    void setEncryptAndCompress(boolean z);

    void setEventFilterByClient(List<String> list, boolean z);

    void setEventHandler(IEventHandler iEventHandler);

    void setExternalAbVersion(@NonNull String str);

    @Deprecated
    void setExtraParams(IExtraParams iExtraParams);

    void setGPSLocation(float f, float f2, String str);

    void setGoogleAid(@NonNull String str);

    void setHeaderInfo(String str, Object obj);

    void setHeaderInfo(HashMap<String, Object> map);

    void setLaunchFrom(int i);

    void setOaidObserver(@Nullable IOaidObserver iOaidObserver);

    void setPrivacyMode(boolean z);

    void setPullAbTestConfigsThrottleMills(Long l);

    void setRangersEventVerifyEnable(boolean z, String str);

    void setTouchPoint(@NonNull String str);

    void setTracerData(JSONObject jSONObject);

    void setUriRuntime(UriConfig uriConfig);

    void setUserAgent(@NonNull String str);

    void setUserID(long j);

    void setUserUniqueID(@Nullable String str);

    void setUserUniqueID(@Nullable String str, @Nullable String str2);

    void setViewId(Dialog dialog, String str);

    void setViewId(View view, String str);

    void setViewId(Object obj, String str);

    void setViewProperties(View view, JSONObject jSONObject);

    void start();

    void startDurationEvent(String str);

    void startSimulator(@NonNull String str);

    void stopDurationEvent(String str, JSONObject jSONObject);

    void stopDurationEvent(String str, JSONObject jSONObject, String str2);

    void trackClick(View view);

    void trackClick(View view, JSONObject jSONObject);

    void trackPage(Activity activity);

    void trackPage(Activity activity, JSONObject jSONObject);

    void trackPage(Object obj);

    void trackPage(Object obj, JSONObject jSONObject);

    @Deprecated
    void userProfileSetOnce(JSONObject jSONObject, UserProfileCallback userProfileCallback);

    @Deprecated
    void userProfileSync(JSONObject jSONObject, UserProfileCallback userProfileCallback);
}
