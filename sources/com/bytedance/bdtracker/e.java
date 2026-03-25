package com.bytedance.bdtracker;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.bytedance.applog.event.AutoTrackEventType;
import com.bytedance.applog.exception.AppCrashType;
import com.bytedance.applog.log.EventBus;
import com.bytedance.mpaas.IEncryptor;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class e implements EventBus.DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InitConfig f160a;
    public final /* synthetic */ d b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public e(d dVar, InitConfig initConfig) {
        this.b = dVar;
        this.f160a = initConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.log.EventBus.DataFetcher
    public Object fetch() {
        String strJoin;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.b.m);
            jSONObject.put(AppsFlyerProperties.CHANNEL, this.f160a.getChannel());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("AppLog 版本号", "6.17.6");
            jSONObject2.put("AppLog 版本地区", "海外");
            jSONObject2.put("AppLog版本序号", 6170690);
            jSONObject2.put("请求加密开关", this.b.E);
            jSONObject2.put("响应加密开关", this.f160a.isResponseEncryptEnabled());
            if (this.b.E) {
                IEncryptor encryptor = this.f160a.getEncryptor();
                jSONObject2.put("是否配置了自定义加密", encryptor == null ? "未配置" : "客户端已配置");
                jSONObject2.put("自定义加密类型", (!(encryptor instanceof a0) || IEncryptorType.DEFAULT_ENCRYPTOR.equals(((a0) encryptor).encryptorType())) ? "默认加密类型" : ((a0) encryptor).encryptorType());
            }
            jSONObject2.put("日志开关", this.f160a.isLogEnable());
            jSONObject2.put("自定义日志打印", this.f160a.getLogger() != null);
            jSONObject2.put("AB实验开关", this.f160a.isAbEnable());
            jSONObject2.put("自动启动图开关", this.f160a.autoStart());
            jSONObject2.put("自动激活开关", this.f160a.isAutoActive());
            jSONObject2.put("H5 打通开关", this.f160a.isH5BridgeEnable());
            jSONObject2.put("H5 全埋点注入", this.f160a.isH5CollectEnable());
            jSONObject2.put("H5 打通是否允许更新用户信息开关", this.f160a.isUseBridgeUpdateUUIDEnabled());
            if (this.f160a.getH5BridgeAllowlist() != null && !this.f160a.getH5BridgeAllowlist().isEmpty()) {
                jSONObject2.put("H5 域名白名单", TextUtils.join("、", this.f160a.getH5BridgeAllowlist()));
            }
            jSONObject2.put("不过滤 H5 域名开关", this.f160a.isH5BridgeAllowAll());
            jSONObject2.put("全埋点开关", this.f160a.isAutoTrackEnabled());
            ArrayList arrayList = new ArrayList();
            if (AutoTrackEventType.a(this.f160a.getAutoTrackEventType(), 4)) {
                arrayList.add("点击事件");
            }
            if (AutoTrackEventType.a(this.f160a.getAutoTrackEventType(), 2)) {
                arrayList.add("页面事件");
            }
            if (AutoTrackEventType.a(this.f160a.getAutoTrackEventType(), 8)) {
                arrayList.add("页面离开事件");
            }
            if (!arrayList.isEmpty()) {
                jSONObject.put("全埋点类型", TextUtils.join("、", arrayList));
            }
            jSONObject2.put("视图曝光开关", this.f160a.isExposureEnabled());
            jSONObject2.put("采集屏幕方向开关", this.f160a.isScreenOrientationEnabled());
            jSONObject2.put("初始化 UUID", this.f160a.getUserUniqueId());
            jSONObject2.put("初始化 UUID 类型", this.f160a.getUserUniqueIdType());
            jSONObject2.put("采集 OAID 开关", this.f160a.isOaidEnabled());
            jSONObject2.put("补偿 OAID 开关", this.f160a.isReportOaidEnable());
            jSONObject2.put("采集 MAC 开关", this.f160a.isMacEnable());
            jSONObject2.put("采集 ANDROID ID 开关", this.f160a.isAndroidIdEnabled());
            jSONObject2.put("采集运营商信息开关", this.f160a.isOperatorInfoEnabled());
            jSONObject2.put("采集 SerialNumber 开关", this.f160a.isSerialNumberEnable());
            jSONObject2.put("自动采集 FRAGMENT 开关", this.f160a.isAutoTrackFragmentEnabled());
            jSONObject2.put("后台静默开关", this.f160a.isSilenceInBackground());
            jSONObject2.put("鸿蒙设备采集开关", this.f160a.isHarmonyEnabled());
            jSONObject2.put("隐私模式开关", this.b.x);
            jSONObject2.put("采集 Crash", AppCrashType.hasCrashType(this.f160a.getTrackCrashType(), 1) ? "JAVA" : "不采集");
            jSONObject2.put("ALINK 监听", this.b.z != null);
            jSONObject2.put("自定义激活参数", this.b.A != null);
            jSONObject2.put("延迟深度链接开关", this.f160a.isDeferredALinkEnabled());
            jSONObject2.put("缓存文件名称", this.f160a.getSpName());
            jSONObject2.put("数据库文件名称", this.f160a.getDbName());
            jSONObject2.put("监听生命周期", this.f160a.isHandleLifeCycle());
            jSONObject2.put("小版本号", this.f160a.getVersionMinor());
            jSONObject2.put("版本号编码", String.valueOf(this.f160a.getVersionCode()));
            jSONObject2.put("版本号", this.f160a.getVersion());
            jSONObject2.put("应用名称", this.f160a.getAppName());
            jSONObject2.put("圈选配置", this.f160a.getPicker() != null);
            jSONObject2.put("当前进程", this.b.f151o.j() ? "主进程" : "子进程");
            jSONObject2.put("地区", this.f160a.getRegion());
            jSONObject2.put("语言", this.f160a.getLanguage());
            jSONObject2.put("PLAY 开关", this.f160a.isPlayEnable());
            jSONObject2.put("Gaid 开关", this.f160a.isGaidEnabled());
            jSONObject2.put("屏幕信息开关", this.f160a.isDisplayDensityAndDpiEnabled());
            jSONObject2.put("CPU Abi 开关", this.f160a.isCPUAbiEnabled());
            jSONObject2.put("曝光事件是否重复产生开关", this.f160a.isAbTestExposureEventRepeatEnabled());
            jSONObject2.put("LaunchTerminate 开关", this.f160a.isLaunchTerminateEnabled());
            if (this.f160a.isGaidEnabled()) {
                jSONObject2.put("GAID 获取超时时间", this.f160a.getGaidTimeOutMilliSeconds());
            }
            jSONObject2.put("PageMeta 接口注解开关", this.f160a.isPageMetaAnnotationEnable());
            if (this.f160a.getUriConfig() != null) {
                ArrayList arrayList2 = new ArrayList();
                if (this.f160a.getUriConfig().getSendUris() != null) {
                    arrayList2.addAll(Arrays.asList(this.f160a.getUriConfig().getSendUris()));
                }
                if (r.d(this.f160a.getUriConfig().getRegisterUri())) {
                    arrayList2.add(this.f160a.getUriConfig().getRegisterUri());
                }
                if (r.d(this.f160a.getUriConfig().getSettingUri())) {
                    arrayList2.add(this.f160a.getUriConfig().getSettingUri());
                }
                if (r.d(this.f160a.getUriConfig().getAbUri())) {
                    arrayList2.add(this.f160a.getUriConfig().getAbUri());
                }
                if (r.d(this.f160a.getUriConfig().getActiveUri())) {
                    arrayList2.add(this.f160a.getUriConfig().getActiveUri());
                }
                if (r.d(this.f160a.getUriConfig().getSettingUri())) {
                    arrayList2.add(this.f160a.getUriConfig().getSettingUri());
                }
                if (r.d(this.f160a.getUriConfig().getBusinessUri())) {
                    arrayList2.add(this.f160a.getUriConfig().getBusinessUri());
                }
                if (r.d(this.f160a.getUriConfig().getProfileUri())) {
                    arrayList2.add(this.f160a.getUriConfig().getProfileUri());
                }
                if (r.d(this.f160a.getUriConfig().getReportOaidUri())) {
                    arrayList2.add(this.f160a.getUriConfig().getReportOaidUri());
                }
                if (r.d(this.f160a.getUriConfig().getAlinkAttributionUri())) {
                    arrayList2.add(this.f160a.getUriConfig().getAlinkAttributionUri());
                }
                if (r.d(this.f160a.getUriConfig().getAlinkQueryUri())) {
                    arrayList2.add(this.f160a.getUriConfig().getAlinkQueryUri());
                }
                strJoin = TextUtils.join("、", arrayList2);
            } else {
                strJoin = "SaaS 默认";
            }
            jSONObject2.put("服务域名配置", strJoin);
            jSONObject.put("config", jSONObject2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
