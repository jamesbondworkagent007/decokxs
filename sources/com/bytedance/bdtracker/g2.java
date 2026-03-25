package com.bytedance.bdtracker;

import android.os.Build;
import android.text.TextUtils;
import com.engagelab.privates.push.constants.MTPushConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class g2 extends q1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public g2() {
        super(true, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "Rom";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa A[PHI: r0
  0x00fa: PHI (r0v20 java.lang.String) = (r0v7 java.lang.String), (r0v9 java.lang.String), (r0v21 java.lang.String) binds: [B:67:0x015a, B:91:0x0218, B:51:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    @Override // com.bytedance.bdtracker.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(JSONObject jSONObject) throws JSONException {
        String str;
        String string;
        String str2;
        StringBuilder sb = new StringBuilder(16);
        if (n5.d()) {
            str = "MIUI-";
        } else {
            if (!n5.b()) {
                String strA = n5.a("ro.build.version.emui");
                String strA2 = TextUtils.isEmpty(strA) ? n5.a("ro.build.version.emui") : strA;
                if (TextUtils.isEmpty(strA2) || (!strA2.toLowerCase().contains("emotionui") && !strA2.toLowerCase().contains("magicui"))) {
                    String str3 = Build.BRAND;
                    if (TextUtils.isEmpty(str3) || !str3.toLowerCase().startsWith(MTPushConstants.Manufacturer.HUAWEI)) {
                        String str4 = Build.MANUFACTURER;
                        if ((!TextUtils.isEmpty(str4) && str4.toLowerCase().startsWith(MTPushConstants.Manufacturer.HUAWEI)) || ((!TextUtils.isEmpty(str3) && str3.toLowerCase().startsWith(MTPushConstants.Manufacturer.HONOR)) || (!TextUtils.isEmpty(str4) && str4.toLowerCase().startsWith(MTPushConstants.Manufacturer.HONOR)))) {
                            sb.append("EMUI-");
                        }
                        if (!TextUtils.isEmpty(strA)) {
                            sb.append(strA);
                            sb.append("-");
                        }
                    }
                }
                String str5 = Build.VERSION.INCREMENTAL;
                sb.append(str5);
                jSONObject.put("rom", sb.toString());
                string = "";
                if (n5.d()) {
                    if (n5.b()) {
                        str2 = Build.DISPLAY;
                        if (str2 != null && str2.toLowerCase().contains("flyme")) {
                            string = str2;
                        }
                    } else if (!n5.a()) {
                        String strA3 = n5.a("ro.build.version.emui");
                        if (strA3 == null || !(strA3.toLowerCase().contains("emotionui") || strA3.toLowerCase().contains("magicui"))) {
                            str2 = "";
                        } else {
                            str2 = strA3 + "_" + Build.DISPLAY;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            String strA4 = n5.a("ro.vivo.os.build.display.id");
                            if (TextUtils.isEmpty(strA4) || !strA4.toLowerCase().contains(n5.b)) {
                                str2 = Build.DISPLAY;
                                if (TextUtils.isEmpty(str2) || !str2.toLowerCase().contains(n5.f233a)) {
                                    String str6 = Build.MANUFACTURER + Build.BRAND;
                                    if (TextUtils.isEmpty(str6)) {
                                        if (!TextUtils.isEmpty(n5.a("ro.letv.release.version"))) {
                                            StringBuilder sbA = a.a("eui_");
                                            sbA.append(n5.a("ro.letv.release.version"));
                                            sbA.append("_");
                                            sbA.append(str2);
                                            string = sbA.toString();
                                        }
                                        if (TextUtils.isEmpty(string)) {
                                        }
                                    } else {
                                        String lowerCase = str6.toLowerCase();
                                        if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                                            string = n5.a("ro.build.uiversion") + "_" + str2;
                                        }
                                    }
                                } else {
                                    string = str2 + "_" + n5.a("ro.gn.sv.version");
                                }
                            } else {
                                string = n5.a("ro.vivo.os.build.display.id") + "_" + n5.a("ro.vivo.product.version");
                            }
                        }
                    } else if (n5.a()) {
                        StringBuilder sbA2 = a.a("coloros_");
                        sbA2.append(n5.a("ro.build.version.opporom"));
                        sbA2.append("_");
                        sbA2.append(Build.DISPLAY);
                        string = sbA2.toString();
                    }
                } else if (n5.d()) {
                    StringBuilder sbA3 = a.a("miui_");
                    sbA3.append(n5.a("ro.miui.ui.version.name"));
                    sbA3.append("_");
                    sbA3.append(str5);
                    string = sbA3.toString();
                }
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("rom_version", string);
                }
                return true;
            }
            str = "FLYME-";
        }
        sb.append(str);
        String str52 = Build.VERSION.INCREMENTAL;
        sb.append(str52);
        jSONObject.put("rom", sb.toString());
        string = "";
        if (n5.d()) {
        }
        if (!TextUtils.isEmpty(string)) {
        }
        return true;
    }
}
