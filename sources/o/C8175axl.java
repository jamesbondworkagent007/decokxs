package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.annual.download.AnnualImageMD5;
import com.okinc.annual.download.AnnualLottieMD5;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.axl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C8175axl {
    public static final C8175axl AEQbTJ = new C8175axl();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.axk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8175axl.AEQbTJ();
        }
    });
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.axm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8175axl.KWHzl();
        }
    });
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.axl$Activity */
    public static final class Activity extends TypeToken<java.util.List<? extends AnnualImageMD5>> {
    }

    /* JADX INFO: renamed from: o.axl$Application */
    public static final class Application extends TypeToken<java.util.List<? extends AnnualLottieMD5>> {
    }

    private C8175axl() {
    }

    public final java.lang.String gEmmrt() {
        return (java.lang.String) KWHzl.getValue();
    }

    public static final java.lang.String AEQbTJ() {
        return new java.io.File(C43246rlf.OLrzqt.valueOf().getFilesDir().getAbsolutePath(), "ok_growth_annual_2023").getAbsolutePath();
    }

    public static final Gson KWHzl() {
        return new Gson();
    }

    public final Gson valueOf() {
        return (Gson) EZpvd.getValue();
    }

    public final boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str2.length() == 0) {
            return true;
        }
        java.lang.String strGEmmrt = gEmmrt();
        java.lang.String str4 = java.io.File.separator;
        java.lang.String str5 = strGEmmrt + str4 + str + str4 + str2;
        if (!KWHzl(str5)) {
            return false;
        }
        if (str3.length() == 0) {
            return true;
        }
        return C59449zhJ.gEmmrt(str3, C33478mxH.KWHzl.OLrzqt(str5), true);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<AnnualLottieMD5> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (str2.length() == 0) {
            return true;
        }
        java.lang.String strGEmmrt = gEmmrt();
        java.lang.String str3 = java.io.File.separator;
        java.lang.String str4 = strGEmmrt + str3 + str + str3 + str2;
        java.io.File file = new java.io.File(str4);
        if (KWHzl(str4) && copydefault(file)) {
            if (list.isEmpty()) {
                return true;
            }
            java.io.File[] fileArrEZpvd = EZpvd(file);
            if (fileArrEZpvd != null && fileArrEZpvd.length != 0) {
                for (AnnualLottieMD5 annualLottieMD5 : list) {
                    java.lang.String lottieFileName = annualLottieMD5.getLottieFileName();
                    java.lang.String lottieFileMD5 = annualLottieMD5.getLottieFileMD5();
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) lottieFileName) && C33129mqd.OLrzqt((java.lang.CharSequence) lottieFileMD5)) {
                        for (java.io.File file2 : fileArrEZpvd) {
                            if (android.text.TextUtils.equals(lottieFileName, file2.getName())) {
                                C33478mxH c33478mxH = C33478mxH.KWHzl;
                                java.lang.String absolutePath = file2.getAbsolutePath();
                                Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                                if (C59449zhJ.gEmmrt(lottieFileMD5, c33478mxH.OLrzqt(absolutePath), true)) {
                                    break;
                                }
                            }
                        }
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<AnnualImageMD5> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (str2.length() == 0 || list.isEmpty()) {
            return true;
        }
        java.lang.String strGEmmrt = gEmmrt();
        java.lang.String str3 = java.io.File.separator;
        java.lang.String str4 = strGEmmrt + str3 + str + str3 + str2;
        java.io.File file = new java.io.File(str4);
        if (!KWHzl(str4) || !copydefault(file)) {
            return false;
        }
        java.io.File[] fileArrEZpvd = EZpvd(file);
        if (fileArrEZpvd != null && fileArrEZpvd.length != 0) {
            for (java.io.File file2 : fileArrEZpvd) {
                java.lang.String name = file2.getName();
                for (AnnualImageMD5 annualImageMD5 : list) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) annualImageMD5.getImageFileName()) && C59449zhJ.gEmmrt(annualImageMD5.getImageFileName(), name, true)) {
                        C33478mxH c33478mxH = C33478mxH.KWHzl;
                        java.lang.String absolutePath = file2.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                        java.lang.String strOLrzqt = c33478mxH.OLrzqt(absolutePath);
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) annualImageMD5.getImageFileMD5()) && !C59449zhJ.gEmmrt(annualImageMD5.getImageFileMD5(), strOLrzqt, true)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!KWHzl(str)) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return true;
        }
        return C59449zhJ.gEmmrt(str2, C33478mxH.KWHzl.OLrzqt(str), true);
    }

    public final void OLrzqt() {
        C6800aWH.AEQbTJ(gEmmrt());
        java.io.File file = new java.io.File(gEmmrt());
        java.lang.String strGEmmrt = gEmmrt();
        Intrinsics.checkNotNullExpressionValue(strGEmmrt, "");
        if (KWHzl(strGEmmrt)) {
            return;
        }
        file.mkdirs();
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C6800aWH.EZpvd(str);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return gEmmrt() + java.io.File.separator + str;
    }

    public final java.lang.String djBIcL() {
        java.lang.String strGEmmrt = gEmmrt();
        Intrinsics.checkNotNullExpressionValue(strGEmmrt, "");
        return strGEmmrt;
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.io.File file = new java.io.File(str);
        if (!KWHzl(str) || !copydefault(file)) {
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, "reNameDirectorFile rootFile not exit");
        }
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, "reNameDirectorFile childFileList isNullOrEmpty");
        }
        if (fileArrListFiles.length > 0) {
            java.io.File file2 = fileArrListFiles[0];
            pUU.KWHzl("AnnualDownLoadHelper", "reNameDirectorFile,child name is " + file2.getName());
            if (!file2.isDirectory()) {
                return new kotlin.Pair<>(java.lang.Boolean.FALSE, "reNameDirectorFile child isn't a isDirectory");
            }
            if (android.text.TextUtils.equals(file2.getName(), str2)) {
                return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
            }
            boolean zOLrzqt = C6800aWH.OLrzqt(file2, str2);
            return new kotlin.Pair<>(java.lang.Boolean.valueOf(zOLrzqt), zOLrzqt ? "" : "reNameDirectorFile rename fail");
        }
        return new kotlin.Pair<>(java.lang.Boolean.FALSE, "reNameDirectorFile not found");
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strDjBIcL = djBIcL();
        java.lang.String str3 = java.io.File.separator;
        java.lang.String str4 = strDjBIcL + str3 + str + str3 + str2;
        return KWHzl(str4) ? str4 : "";
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String strDjBIcL = djBIcL();
        java.lang.String str4 = java.io.File.separator;
        java.lang.String str5 = strDjBIcL + str4 + str + str4 + str2 + str4 + str3;
        return KWHzl(str5) ? str5 : "";
    }

    public final boolean KWHzl(int i) {
        try {
            java.lang.Integer num = SPUtils.getInt("ok_growth_annual_version", -1);
            if (num == null || num.intValue() != -1) {
                if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i), num)) {
                    return true;
                }
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("AnnualDownLoadHelper", "isVersionUpgrade error," + e.getMessage());
        }
        return false;
    }

    public final void AEQbTJ(int i) {
        try {
            java.lang.Integer num = SPUtils.getInt("ok_growth_annual_version", -1);
            if (num == null || num.intValue() != -1) {
                if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i), num)) {
                    return;
                }
            }
            SPUtils.put("ok_growth_annual_version", java.lang.Integer.valueOf(i));
        } catch (java.lang.Exception e) {
            pUU.copydefault("AnnualDownLoadHelper", "saveDownLoadVersion error," + e.getMessage());
        }
    }

    public final java.util.List<AnnualLottieMD5> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.Object objFromJson = valueOf().fromJson(str, new Application().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            return (java.util.List) objFromJson;
        } catch (java.lang.Exception e) {
            pUU.copydefault("AnnualDownLoadHelper", "parseJsonStrToArray error=" + e.getMessage());
            return yDY.AhwBna();
        }
    }

    public final java.util.List<AnnualImageMD5> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.Object objFromJson = valueOf().fromJson(str, new Activity().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            return (java.util.List) objFromJson;
        } catch (java.lang.Exception e) {
            pUU.copydefault("AnnualDownLoadHelper", "parseImgJsonStrToArray error=" + e.getMessage());
            return yDY.AhwBna();
        }
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new java.io.File(str).exists();
    }

    public final boolean copydefault(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return file.isDirectory();
    }

    public static final boolean OLrzqt(java.io.File file) {
        return (file == null || file.isDirectory()) ? false : true;
    }

    public final java.io.File[] EZpvd(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return file.listFiles(new java.io.FileFilter() { // from class: o.axj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FileFilter
            public final boolean accept(java.io.File file2) {
                return C8175axl.OLrzqt(file2);
            }
        });
    }
}
