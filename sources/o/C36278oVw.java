package o;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: o.oVw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36278oVw {
    public static java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        return C36246oUr.copydefault().AubY().getSharedPreferences("IndicatorParam_" + str, 0).getString(str2, "");
    }

    public static java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return C36246oUr.copydefault().AubY().getSharedPreferences("IndicatorParam_" + str, 0).getString(str2 + "_sub_parameter", "");
    }

    public static void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        SharedPreferences.Editor editorEdit = C36246oUr.copydefault().AubY().getSharedPreferences("IndicatorParam_" + str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }

    public static void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        SharedPreferences.Editor editorEdit = C36246oUr.copydefault().AubY().getSharedPreferences("IndicatorParam_" + str, 0).edit();
        editorEdit.putString(str2 + "_sub_parameter", str3);
        editorEdit.apply();
    }

    public static java.lang.Boolean EZpvd(java.lang.String str, java.lang.String str2) {
        return java.lang.Boolean.valueOf(C36246oUr.copydefault().AubY().getSharedPreferences("IndicatorParam_" + str, 0).getBoolean(str2 + "ratio", true));
    }

    public static void OLrzqt(java.lang.String str, java.lang.String str2, boolean z) {
        SharedPreferences.Editor editorEdit = C36246oUr.copydefault().AubY().getSharedPreferences("IndicatorParam_" + str, 0).edit();
        editorEdit.putBoolean(str2 + "ratio", z);
        editorEdit.apply();
    }
}
