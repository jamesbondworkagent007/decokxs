package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
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
import com.engagelab.privates.common.utils.FileUtils;
import com.engagelab.privates.common.utils.GZipUtil;
import com.engagelab.privates.common.utils.SM4Util;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.common.utils.SystemUtil;
import com.engagelab.privates.core.api.MTReporter;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.okinc.liveness.lca.EopTrackEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class v {
    public static int c = 200;
    public static volatile v d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f347a = false;
    public String b;

    public class a implements Comparator<File> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(v vVar) {
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
    public static v a() {
        if (d == null) {
            synchronized (v.class) {
                d = new v();
            }
        }
        return d;
    }

    public void a(Context context, Bundle bundle) {
        try {
            bundle.setClassLoader(MTReporter.class.getClassLoader());
            if (bundle.containsKey(MTCoreConstants.Protocol.KEY_PROTOCOL)) {
                MTReporter mTReporter = (MTReporter) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL);
                JSONObject jSONObject = new JSONObject(mTReporter.getContent());
                jSONObject.put("type", mTReporter.getType());
                JSONObject jSONObjectA = a(context, jSONObject);
                if (jSONObjectA == null) {
                    return;
                }
                if (a(context, mTReporter.getType(), jSONObjectA, a(context, jSONObjectA.toString())) == 0) {
                    a(context);
                    return;
                }
                return;
            }
            a(context);
        } catch (Throwable th) {
            MTCommonLog.w("MTReportBusiness", "report failed " + th.getMessage());
        }
    }

    public final int a(Context context, String str, JSONObject jSONObject, File file) {
        byte[] bArrEncryptBytes;
        String str2 = str;
        try {
            if (!SystemUtil.isNetworkConnecting(context)) {
                MTCommonLog.d("MTReportBusiness", "can't report, network is disConnected");
                return -1;
            }
            long jO = w.o(context);
            if (jO == 0) {
                MTCommonLog.d("MTReportBusiness", "uid is 0");
                return -1;
            }
            List<String> httpAddress = MTCoreGlobal.getHttpAddress(context);
            if (httpAddress.isEmpty()) {
                MTCommonLog.d("MTReportBusiness", "there are no report url");
                return -1;
            }
            jSONObject.put("uid", jO);
            byte[] bArrZip = GZipUtil.zip(jSONObject.toString().getBytes(MTCommonConstants.UTF_8));
            String md5AesKey = AESUtil.getMd5AesKey(AESUtil.generateSeed());
            String iv = AESUtil.getIv(new String(new byte[]{Ascii.VT, Ascii.CR, Ascii.DC2, 80, 82, 81, 82, 86, 82, 87, 82, 84, 3, 50, 9, 67}, Charset.forName(C.UTF8_NAME)), 'b');
            int encryptType = MTGlobal.getEncryptType();
            if (encryptType != 2) {
                bArrEncryptBytes = AESUtil.encryptBytes(bArrZip, md5AesKey, iv);
                encryptType = 1;
            } else {
                bArrEncryptBytes = SM4Util.encryptBytes(bArrZip, md5AesKey, iv);
            }
            String str3 = "Basic " + Base64.encodeToString((jO + ":" + StringUtil.getBytesSHA1(jO + StringUtil.getMD5Utf8(w.e(context)) + StringUtil.getBytesSHA1(bArrEncryptBytes)) + ":" + md5AesKey).getBytes(), 10);
            ArrayList<String> arrayList = new ArrayList();
            for (int i = 0; i < 3; i++) {
                arrayList.addAll(httpAddress);
            }
            for (String str4 : arrayList) {
                if (str2.contains("sgm") && !str4.contains("/v3/sgm/report")) {
                    str4 = str4 + "/v3/sgm/report";
                }
                if (!str2.contains("sgm") && !str4.contains("/v3/report")) {
                    str4 = str4 + "/v3/report";
                }
                int iA = y.a(context, str4, str3, bArrEncryptBytes);
                if (iA == 200) {
                    MTCommonLog.d("MTReportBusiness", "report success encrypt:" + encryptType + ", url:" + str4 + ", fileName:" + file.getName() + MTCommonLog.toLogString(jSONObject));
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
                MTCommonLog.d("MTReportBusiness", "report failed code:" + iA + ", url:" + str4 + ", fileName:" + file.getName() + MTCommonLog.toLogString(jSONObject));
                str2 = str;
            }
            return -1;
        } catch (Throwable th) {
            MTCommonLog.w("MTReportBusiness", "report failed " + th.getMessage());
            return -1;
        }
    }

    public File a(Context context, String str) {
        try {
            if (TextUtils.isEmpty(this.b)) {
                File filesDir = context.getFilesDir();
                String appKey = MTGlobal.getAppKey(context);
                StringBuilder sb = new StringBuilder();
                sb.append(filesDir.getAbsolutePath());
                String str2 = File.separator;
                sb.append(str2);
                sb.append("com_engagelab_privates_core");
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

    public final JSONObject a(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put("itime", System.currentTimeMillis() / 1000);
            jSONObject.put("account_id", "");
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put("content", jSONArray);
            jSONObject2.put(MTPushConstants.PlatformNode.KEY_PLATFORM, IEncryptorType.DEFAULT_ENCRYPTOR);
            jSONObject2.put("uid", w.o(context));
            jSONObject2.put("app_version", MTGlobal.getAppVersionName(context));
            jSONObject2.put("app_key", MTGlobal.getAppKey(context));
            jSONObject2.put(AppsFlyerProperties.CHANNEL, MTGlobal.getAppChannel(context));
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

    public void a(Context context) {
        synchronized (this) {
            if (this.f347a) {
                return;
            }
            MTCommonLog.d("MTReportBusiness", "report cache begin");
            this.f347a = true;
            if (TextUtils.isEmpty(this.b)) {
                this.f347a = false;
                MTCommonLog.d("MTReportBusiness", "there are no report cache");
                return;
            }
            File file = new File(this.b);
            if (!file.exists()) {
                this.f347a = false;
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
                            String strOptString = jSONObject.optString("type");
                            MTCommonLog.d("MTReportBusiness", "reportCache file:" + file2.getAbsolutePath());
                            a(context, strOptString, jSONObject, file2);
                        } catch (Throwable th) {
                            MTCommonLog.w("MTReportBusiness", "reportCache failed " + th.getMessage());
                        }
                    } else {
                        MTCommonLog.d("MTReportBusiness", "cacheFile [" + file2.getAbsolutePath() + "] is no exist");
                    }
                }
                this.f347a = false;
                MTCommonLog.d("MTReportBusiness", "report cache finish");
                return;
            }
            this.f347a = false;
            MTCommonLog.d("MTReportBusiness", "there are no report cache");
        }
    }
}
