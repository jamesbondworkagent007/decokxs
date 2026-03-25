package com.engagelab.privates.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.DeviceUtil;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes21.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f337a = Pattern.compile("^[a-zA-Z0-9_]+");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONObject a(Context context) {
        String str;
        String str2;
        String str3;
        String str4 = "MTAnalyticsHelper";
        try {
            try {
                String cpuInfo = DeviceUtil.getCpuInfo();
                try {
                    String resolution = DeviceUtil.getResolution(context);
                    Locale locale = Locale.ENGLISH;
                    String str5 = String.format(locale, "%.1f", Double.valueOf(DeviceUtil.getScreenSize(context)));
                    String str6 = String.format(locale, Build.VERSION.RELEASE, new Object[0]);
                    String str7 = String.format(locale, Build.MODEL, new Object[0]);
                    String str8 = String.format(locale, Build.BRAND, new Object[0]);
                    String str9 = String.format(locale, Build.PRODUCT, new Object[0]);
                    String str10 = String.format(locale, Build.FINGERPRINT, new Object[0]);
                    String string = context.getResources().getConfiguration().locale.toString();
                    String str11 = String.format(locale, Build.MANUFACTURER, new Object[0]);
                    long rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
                    if (rawOffset > 0) {
                        str2 = Marker.ANY_NON_NULL_MARKER + rawOffset;
                    } else if (rawOffset < 0) {
                        str2 = "-" + rawOffset;
                    } else {
                        str2 = "" + rawOffset;
                    }
                    long ramSize = DeviceUtil.getRamSize(context);
                    long romSize = DeviceUtil.getRomSize(context);
                    str = "MTAnalyticsHelper";
                    try {
                        int cpuCoreCount = DeviceUtil.getCpuCoreCount();
                        String str12 = str2;
                        String cpuHardwareInfo = DeviceUtil.getCpuHardwareInfo();
                        int cPUMaxFreqKHz = DeviceUtil.getCPUMaxFreqKHz();
                        JSONObject jSONObject = new JSONObject();
                        if (TextUtils.isEmpty(cpuInfo)) {
                            cpuInfo = "";
                            str3 = cpuInfo;
                        } else {
                            str3 = "";
                        }
                        jSONObject.put("cpu_info", cpuInfo);
                        jSONObject.put("cpu_count", cpuCoreCount);
                        jSONObject.put("cpu_max_freq", cPUMaxFreqKHz);
                        jSONObject.put("cpu_hardware", cpuHardwareInfo);
                        jSONObject.put("ram", ramSize);
                        jSONObject.put("rom", romSize);
                        if (TextUtils.isEmpty(resolution)) {
                            resolution = str3;
                        }
                        jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, resolution);
                        if (TextUtils.isEmpty(str5)) {
                            str5 = str3;
                        }
                        jSONObject.put("screensize", str5);
                        if (TextUtils.isEmpty(str6)) {
                            str6 = str3;
                        }
                        jSONObject.put("os_version", str6);
                        if (TextUtils.isEmpty(str7)) {
                            str7 = str3;
                        }
                        jSONObject.put("model", str7);
                        if (TextUtils.isEmpty(str8)) {
                            str8 = str3;
                        }
                        jSONObject.put("brand", str8);
                        if (TextUtils.isEmpty(str9)) {
                            str9 = str3;
                        }
                        jSONObject.put("product", str9);
                        TextUtils.isEmpty(str3);
                        String str13 = str3;
                        jSONObject.put("serial", str13);
                        jSONObject.put("fingerprint", TextUtils.isEmpty(str10) ? str13 : str10);
                        jSONObject.put("language", TextUtils.isEmpty(string) ? str13 : string);
                        jSONObject.put("manufacturer", TextUtils.isEmpty(str11) ? str13 : str11);
                        jSONObject.put("timezone", TextUtils.isEmpty(str12) ? str13 : str12);
                        jSONObject.put("mac", str13);
                        jSONObject.put("meid", str13);
                        return jSONObject;
                    } catch (JSONException e) {
                        e = e;
                        str4 = str;
                        MTCommonLog.w(str4, "package json exception: " + e.getMessage());
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        MTCommonLog.w(str, "getDeviceInfo exception: " + th.getMessage());
                        return null;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    str = "MTAnalyticsHelper";
                }
            } catch (Throwable th2) {
                th = th2;
                str = "MTAnalyticsHelper";
            }
        } catch (JSONException e3) {
            e = e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(String str) {
        try {
            if (str == null) {
                MTCommonLog.w("MTAnalyticsHelper", "id is null");
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (str.getBytes().length <= 256) {
                return true;
            }
            MTCommonLog.w("MTAnalyticsHelper", "id: [" + str + "] length can't be no more than 256");
            return false;
        } catch (Throwable th) {
            MTCommonLog.w("MTAnalyticsHelper", "isValidId t:" + th.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean c(String str) {
        try {
            if (str == null) {
                MTCommonLog.w("MTAnalyticsHelper", "key is null");
                return false;
            }
            if (!f337a.matcher(str).matches()) {
                MTCommonLog.w("MTAnalyticsHelper", "key is invalid, key:" + str);
                return false;
            }
            if (str.getBytes().length <= 256) {
                return true;
            }
            MTCommonLog.w("MTAnalyticsHelper", "key: [" + str + "] length can't be no more than 256");
            return false;
        } catch (Throwable th) {
            MTCommonLog.w("MTAnalyticsHelper", "isValidKey t:" + th.getMessage());
            return false;
        }
    }

    public static boolean b(Object obj) {
        if (obj != null) {
            return true;
        }
        try {
            MTCommonLog.w("MTAnalyticsHelper", "value is null");
            return false;
        } catch (Throwable th) {
            MTCommonLog.w("MTAnalyticsHelper", "isValidValue t:" + th.getMessage());
            return true;
        }
    }

    public static boolean a(String str, Object obj) {
        return c(str) && b(obj);
    }

    public static Object a(Object obj) {
        try {
            if (obj instanceof String) {
                return a((String) obj);
            }
            if (obj instanceof Short) {
                return Short.valueOf(a(Short.toString(((Short) obj).shortValue())));
            }
            if (obj instanceof Integer) {
                return Integer.valueOf(a(Integer.toString(((Integer) obj).intValue())));
            }
            if (obj instanceof Long) {
                return Long.valueOf(a(Long.toString(((Long) obj).longValue())));
            }
            if (obj instanceof Float) {
                return Float.valueOf(a(Float.toString(((Float) obj).floatValue())));
            }
            if (obj instanceof Double) {
                return Double.valueOf(a(Double.toString(((Double) obj).doubleValue())));
            }
            if (obj instanceof Byte) {
                return Byte.valueOf(a(Byte.toString(((Byte) obj).byteValue())));
            }
            if (obj instanceof Boolean) {
                return obj;
            }
            MTCommonLog.w("MTAnalyticsHelper", "value:" + obj + " is no basic data type");
            return null;
        } catch (Throwable th) {
            MTCommonLog.w("MTAnalyticsHelper", "cutoutValue failed " + th.getMessage());
            return obj;
        }
    }

    public static String a(String str) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            if (256 > bytes.length) {
                return str;
            }
            String str2 = new String(bytes, 0, 256, "utf-8");
            MTCommonLog.d("MTAnalyticsHelper", "cutout value:" + str2);
            return str2;
        } catch (Throwable th) {
            MTCommonLog.w("MTAnalyticsHelper", "cutoutString failed " + th.getMessage());
            return str;
        }
    }
}
