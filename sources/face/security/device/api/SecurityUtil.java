package face.security.device.api;

import android.text.TextUtils;
import android.util.Base64;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.android.exoplayer2.C;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes12.dex */
public class SecurityUtil {
    private static final int MAX_TIME_OUT = 20;
    public static final int NET_EXCEPTION_CODE = -1;
    public static Field artMethodField;

    private static int dw(String str, String str2) {
        return -1;
    }

    public static String spr(String str, Map<String, String> map, Map<String, String> map2) {
        HashMap map3 = new HashMap();
        map3.put("TimestampKeep", fd(new Date()));
        map3.put("SignatureNonce", UUID.randomUUID().toString());
        if (map2 != null) {
            map2.remove(RequestParameters.SIGNATURE);
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    map3.put(key, value);
                }
            }
            String str2 = map2.get("Version");
            if (str2 != null && !str2.isEmpty() && str2.equals("2020-04-25")) {
                map3.put("Timestamp", fd(new Date()));
            }
        }
        try {
            map3.put(RequestParameters.SIGNATURE, cs(map3, C.UTF8_NAME));
        } catch (Throwable unused) {
            map3.put(RequestParameters.SIGNATURE, AbstractJsonLexerKt.NULL);
        }
        return httpPost(str, map, map3);
    }

    private static String fd(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "GMT"));
        return simpleDateFormat.format(date);
    }

    public static String cs(Map<String, String> map, String str) throws Exception {
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : strArr) {
            if (z) {
                z = false;
            } else {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb.append(encode(str2, str));
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(encode(map.get(str2), str));
        }
        return FaceSecDevice.gsRaw("POST" + ContainerUtils.FIELD_DELIMITER + encode("/", str) + ContainerUtils.FIELD_DELIMITER + encode(sb.toString(), str));
    }

    private static String encode(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return URLEncoder.encode(str, str2).replace(Marker.ANY_NON_NULL_MARKER, "%20").replace("*", "%2A").replace("%7E", "~");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0117 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x014a */
    /* JADX WARN: Can't wrap try/catch for region: R(9:22|69|23|(4:24|(1:26)(1:76)|49|50)|27|67|28|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010d, code lost:
    
        r9.printStackTrace();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String httpPost(String str, Map<String, String> map, Map<String, String> map2) throws Throwable {
        Throwable th;
        ?? r7;
        Exception e;
        HttpURLConnection httpURLConnection;
        String str2;
        int responseCode;
        StringBuilder sb;
        BufferedReader bufferedReader = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setRequestMethod("POST");
                    boolean z = true;
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setConnectTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                    httpURLConnection.setReadTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        if (z) {
                            z = false;
                        } else {
                            sb2.append(ContainerUtils.FIELD_DELIMITER);
                        }
                        sb2.append(encode(entry2.getKey(), C.UTF8_NAME));
                        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sb2.append(encode(entry2.getValue(), C.UTF8_NAME));
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(sb2.toString().getBytes());
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    responseCode = httpURLConnection.getResponseCode();
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                r7 = 0;
            }
            if (responseCode != 200) {
                String str3 = responseCode + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + Base64.encodeToString("net error".getBytes(), 2);
                httpURLConnection.disconnect();
                return str3;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
            try {
                sb = new StringBuilder();
            } catch (Exception e4) {
                e = e4;
                bufferedReader = bufferedReader2;
                e.printStackTrace();
                str2 = "-1#" + Base64.encodeToString(e.getMessage().getBytes(), 2);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                if (httpURLConnection != null) {
                }
                return str2;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = bufferedReader2;
                r7 = httpURLConnection;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                if (r7 != 0) {
                    r7.disconnect();
                    throw th;
                }
                throw th;
            }
            while (true) {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                httpURLConnection.disconnect();
                return str2;
            }
            str2 = responseCode + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + Base64.encodeToString(sb.toString().getBytes(), 2);
            inputStream.close();
            bufferedReader2.close();
            httpURLConnection.disconnect();
            return str2;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            r7 = str;
        }
    }

    public static String gsi(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String string = UUID.randomUUID().toString();
        if (string.isEmpty()) {
            return "";
        }
        String str2 = String.format("%s-%s-%d-%s", str, "h", Long.valueOf(System.currentTimeMillis()), string.replace("-", ""));
        String strSubstring = str2.substring(0, str2.length() - 4);
        int iAbs = Math.abs((strSubstring + "7849478494").hashCode());
        String strValueOf = String.valueOf(iAbs);
        if (strValueOf.length() > 4) {
            strValueOf = strValueOf.substring(strValueOf.length() - 4);
        } else if (strValueOf.length() < 4) {
            strValueOf = String.format("%4d", Integer.valueOf(iAbs));
        }
        return strSubstring + strValueOf;
    }

    public static void utilInit() {
        try {
            artMethodField = getField(Method.class, "artMethod");
        } catch (Exception unused) {
        }
    }

    public static Field getField(Class cls, String str) {
        while (cls != null && cls != Object.class) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static long getArtMethod(Member member) {
        Field field = artMethodField;
        if (field == null) {
            return 0L;
        }
        try {
            return ((Long) field.get(member)).longValue();
        } catch (IllegalAccessException unused) {
            return 0L;
        }
    }
}
