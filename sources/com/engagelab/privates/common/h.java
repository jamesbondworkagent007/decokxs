package com.engagelab.privates.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObservable;
import com.engagelab.privates.common.observer.MTObserver;
import com.engagelab.privates.common.utils.AESUtil;
import com.engagelab.privates.common.utils.DeviceUtil;
import com.engagelab.privates.common.utils.FileUtils;
import com.engagelab.privates.common.utils.GZipUtil;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.common.utils.SystemUtil;
import com.engagelab.privates.core.api.MTCorePrivatesApi;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.adapter.internal.CommonCode;
import com.okinc.liveness.lca.EopTrackEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class h {
    public static int c = 200;
    public static volatile h d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f333a = false;
    public String b;

    public class a implements Comparator<File> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(h hVar) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified < 0) {
                return -1;
            }
            return jLastModified > 0 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static h a() {
        if (d == null) {
            synchronized (h.class) {
                d = new h();
            }
        }
        return d;
    }

    public JSONObject a(Context context, String str, JSONObject jSONObject) {
        try {
            jSONObject.put("type", str);
            jSONObject.put("random_id", a(8));
            jSONObject.put("itime", System.currentTimeMillis() / 1000);
            String strB = i.b(context);
            jSONObject.put("account_id", TextUtils.isEmpty(strB) ? new JSONObject() : new JSONObject(strB));
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put("content", jSONArray);
            jSONObject2.put(MTPushConstants.PlatformNode.KEY_PLATFORM, IEncryptorType.DEFAULT_ENCRYPTOR);
            jSONObject2.put("uid", MTCorePrivatesApi.getUserId(context));
            jSONObject2.put("device_id", MTGlobal.getDeviceId(context));
            jSONObject2.put(MTCoreConstants.Register.KEY_REGISTRATION_ID, MTCorePrivatesApi.getRegistrationId(context));
            jSONObject2.put("app_version", MTGlobal.getAppVersionName(context));
            jSONObject2.put("app_key", MTGlobal.getAppKey(context));
            jSONObject2.put(AppsFlyerProperties.CHANNEL, MTGlobal.getAppChannel(context));
            jSONObject2.put("model", Build.MODEL);
            jSONObject2.put("manufacturer", Build.MANUFACTURER);
            jSONObject2.put("os_version", String.format(Locale.ENGLISH, Build.VERSION.RELEASE, new Object[0]));
            jSONObject2.put(CommonCode.MapKey.HAS_RESOLUTION, DeviceUtil.getResolution(context));
            jSONObject2.put("mac_address", "");
            jSONObject2.put("carrier", DeviceUtil.getCarrier(context));
            jSONObject2.put("ssid", DeviceUtil.getSsid(context));
            jSONObject2.put("generation", MTGlobal.getNetworkName());
            for (MTObserver mTObserver : MTObservable.getInstance().observeQueue) {
                if (mTObserver.isSdk() && !TextUtils.isEmpty(mTObserver.getSdkName()) && !TextUtils.isEmpty(mTObserver.getSdkVersion())) {
                    jSONObject2.put(mTObserver.getSdkName(), mTObserver.getSdkVersion());
                }
            }
            return jSONObject2;
        } catch (Throwable th) {
            MTCommonLog.w("MTReportBusiness", "prepareReportJson failed " + th.getMessage());
            return null;
        }
    }

    public void a(Context context, JSONObject jSONObject) {
        try {
            if (a(context, jSONObject, a(context, jSONObject.toString())) == 0) {
                a(context);
            }
        } catch (Throwable th) {
            MTCommonLog.w("MTReportBusiness", "report failed " + th.getMessage());
        }
    }

    public final File a(Context context, String str) {
        try {
            if (TextUtils.isEmpty(this.b)) {
                File filesDir = context.getFilesDir();
                String appKey = MTGlobal.getAppKey(context);
                StringBuilder sb = new StringBuilder();
                sb.append(filesDir.getAbsolutePath());
                String str2 = File.separator;
                sb.append(str2);
                sb.append("com_engagelab_privates_analysis");
                sb.append(str2);
                sb.append(appKey);
                this.b = sb.toString();
            }
            String str3 = this.b + File.separator + System.currentTimeMillis();
            MTCommonLog.d("MTReportBusiness", "save file:" + str3);
            File file = new File(str3);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                return null;
            }
            if (!file.exists() && !file.createNewFile()) {
                return null;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(str.getBytes(MTCommonConstants.UTF_8));
            fileOutputStream.close();
            return file;
        } catch (Throwable th) {
            MTCommonLog.w("MTReportBusiness", "saveReportContent failed " + th.getMessage());
            return null;
        }
    }

    public final int a(Context context, JSONObject jSONObject, File file) {
        try {
        } catch (Throwable th) {
            MTCommonLog.w("MTReportBusiness", "report failed " + th.getMessage());
        }
        if (!SystemUtil.isNetworkConnecting(context)) {
            MTCommonLog.d("MTReportBusiness", "can't report, network is disConnected");
            return -1;
        }
        if (j.a().getReportNetworkState() == 1 && MTGlobal.getNetworkType() != 1) {
            MTCommonLog.w("MTReportBusiness", "can't report, current network is not wifi");
            return -1;
        }
        if (j.a().getReportNetworkState() == 2 && MTGlobal.getNetworkType() <= 1) {
            MTCommonLog.w("MTReportBusiness", "can't report, current network is not mobile");
            return -1;
        }
        List<String> httpAddress = MTCoreGlobal.getHttpAddress(context);
        if (httpAddress.isEmpty()) {
            return -1;
        }
        byte[] bArrZip = GZipUtil.zip(jSONObject.toString().getBytes(MTCommonConstants.UTF_8));
        String str = AESUtil.get16Md5AesKey(AESUtil.generateSeed());
        byte[] bArrEncryptBytes = AESUtil.encryptBytes(bArrZip, str, "Ps203a@K!sdkYO8T");
        String deviceId = MTGlobal.getDeviceId(context);
        String str2 = "Basic " + Base64.encodeToString((deviceId + ":" + StringUtil.getMD5Utf8(deviceId + StringUtil.getBytesMD5(bArrEncryptBytes)) + ":" + str).getBytes(), 10);
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.addAll(httpAddress);
        }
        for (String str3 : arrayList) {
            if (!str3.contains("/v1/sdk/report")) {
                str3 = str3 + "/v1/sdk/report";
            }
            int iA = k.a(context, str3, str2, bArrEncryptBytes);
            if (iA == 200) {
                MTCommonLog.d("MTReportBusiness", "report success url:" + str3 + ", fileName:" + file.getName() + MTCommonLog.toLogString(jSONObject));
                if (!file.exists()) {
                    return 0;
                }
                boolean zDelete = file.delete();
                StringBuilder sb = new StringBuilder();
                sb.append("delete ");
                sb.append(zDelete ? "success" : EopTrackEvent.KEY_RESULT_FAILED);
                sb.append(" file:");
                sb.append(file.getAbsolutePath());
                MTCommonLog.d("MTReportBusiness", sb.toString());
                return 0;
            }
            MTCommonLog.d("MTReportBusiness", "report failed code:" + iA + ", url:" + str3 + ", file:" + file.getName() + MTCommonLog.toLogString(jSONObject));
        }
        return -1;
    }

    public void a(Context context) {
        if (this.f333a) {
            MTCommonLog.d("MTReportBusiness", "is reporting cache");
            return;
        }
        MTCommonLog.d("MTReportBusiness", "report cache begin");
        this.f333a = true;
        if (TextUtils.isEmpty(this.b)) {
            this.f333a = false;
            MTCommonLog.d("MTReportBusiness", "there are no report cache");
            return;
        }
        File file = new File(this.b);
        if (!file.exists()) {
            this.f333a = false;
            MTCommonLog.d("MTReportBusiness", "there are no report cache");
            return;
        }
        FileUtils.deleteCacheFileMaximum(this.b, c);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            List<File> listAsList = Arrays.asList(fileArrListFiles);
            Collections.sort(listAsList, new a(this));
            for (File file2 : listAsList) {
                if (file2.exists()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        byte[] bArr = new byte[fileInputStream.available()];
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                        String str = new String(bArr, MTCommonConstants.UTF_8);
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject(str);
                        MTCommonLog.d("MTReportBusiness", "reportCache file:" + file2.getAbsolutePath());
                        a(context, jSONObject, file2);
                    } catch (Throwable th) {
                        MTCommonLog.w("MTReportBusiness", "reportCache failed " + th.getMessage());
                    }
                } else {
                    MTCommonLog.d("MTReportBusiness", "cacheFile [" + file2.getAbsolutePath() + "] is no exist");
                }
            }
            this.f333a = false;
            MTCommonLog.d("MTReportBusiness", "report cache finish");
            return;
        }
        this.f333a = false;
        MTCommonLog.d("MTReportBusiness", "there are no report cache");
    }

    public final String a(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }
}
