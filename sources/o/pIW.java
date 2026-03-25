package o;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.lib.utils.OkUtils;
import o.C38002pIp;

/* JADX INFO: loaded from: classes9.dex */
public class pIW {
    public static java.lang.String AEQbTJ;
    public static java.io.File AhwBna;
    public static java.io.File EZpvd;
    public static java.io.File KWHzl;
    public static java.io.File OLrzqt;
    public static java.io.File copydefault;

    private pIW() {
    }

    public static void OLrzqt(android.content.Context context) {
        if (context != null) {
            try {
                AEQbTJ = context.getFilesDir().getAbsolutePath();
            } catch (java.lang.Exception e) {
                C38002pIp.Companion.iwGUEr().copydefault("Monitor.Dionysus", "Exception thrown when accessing the application filesystem", e);
            }
        }
    }

    public static java.io.File DbNXlk() {
        java.io.File file;
        synchronized (pIW.class) {
            if (AEQbTJ == null) {
                OLrzqt(OkUtils.KWHzl());
            }
            if (EZpvd == null) {
                java.io.File file2 = new java.io.File(AEQbTJ, "dionysus");
                EZpvd = file2;
                C38063pKw.EZpvd(file2.getAbsolutePath());
            }
            file = EZpvd;
        }
        return file;
    }

    public static java.io.File djBIcL() {
        java.io.File file;
        synchronized (pIW.class) {
            if (KWHzl == null) {
                java.io.File file2 = new java.io.File(new java.io.File(DbNXlk().getAbsolutePath(), "minidump"), OtpEventTracker.OTP_EVENT_VALUE_NEW);
                KWHzl = file2;
                C38063pKw.EZpvd(file2.getPath());
            }
            file = KWHzl;
        }
        return file;
    }

    public static java.io.File isConnected() {
        java.io.File file;
        synchronized (pIW.class) {
            if (copydefault == null) {
                java.io.File file2 = new java.io.File(new java.io.File(DbNXlk().getAbsolutePath(), "minidump"), "pending");
                copydefault = file2;
                C38063pKw.EZpvd(file2.getPath());
            }
            file = copydefault;
        }
        return file;
    }

    public static java.io.File EZpvd() {
        java.io.File file;
        synchronized (pIW.class) {
            if (OLrzqt == null) {
                java.io.File file2 = new java.io.File(DbNXlk(), "crashLog");
                OLrzqt = file2;
                C38063pKw.EZpvd(file2.getAbsolutePath());
            }
            file = OLrzqt;
        }
        return file;
    }

    public static java.io.File fetchVPNInfo() {
        java.io.File file;
        synchronized (pIW.class) {
            if (AhwBna == null) {
                java.io.File file2 = new java.io.File(DbNXlk(), "SUCrashLog");
                AhwBna = file2;
                C38063pKw.EZpvd(file2.getAbsolutePath());
            }
            file = AhwBna;
        }
        return file;
    }

    public static void copydefault() {
        C38063pKw.EZpvd(EZpvd(), new C37986pIN());
        C38063pKw.EZpvd(fetchVPNInfo(), new C37986pIN());
    }

    public static void KWHzl() {
        try {
            java.io.File[] fileArrListFiles = isConnected().listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length <= 5) {
                return;
            }
            C38002pIp.Application application = C38002pIp.Companion;
            application.iwGUEr().EZpvd("Monitor.Dionysus", "clearPendingDmpFiles before sort:\n" + copydefault(fileArrListFiles));
            java.util.Arrays.sort(fileArrListFiles, java.util.Comparator.comparing(new java.util.function.Function() { // from class: o.pJa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ((java.io.File) obj).getName();
                }
            }));
            application.iwGUEr().EZpvd("Monitor.Dionysus", "clearPendingDmpFiles after sort:\n" + copydefault(fileArrListFiles));
            for (int i = 0; i < fileArrListFiles.length - 5; i++) {
                java.io.File file = fileArrListFiles[i];
                if (file != null && file.isFile()) {
                    boolean zEZpvd = C38063pKw.EZpvd(fileArrListFiles[i]);
                    C38002pIp.Companion.iwGUEr().EZpvd("Monitor.Dionysus", "clearPendingDmpFiles delete file :" + zEZpvd + " fileName:" + fileArrListFiles[i].getName());
                }
            }
        } catch (java.lang.Exception e) {
            C38002pIp.Companion.iwGUEr().copydefault("Monitor.Dionysus", "clearPendingDmpFiles fail:", e);
        }
    }

    public static java.lang.String copydefault(java.io.File[] fileArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (fileArr != null) {
            for (java.io.File file : fileArr) {
                if (file.isFile()) {
                    sb.append("\n");
                    sb.append(file.getName());
                }
            }
        }
        return sb.toString().trim();
    }

    public static java.io.File AhwBna() {
        return C38063pKw.OLrzqt(fetchVPNInfo(), new java.io.FilenameFilter() { // from class: o.pJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                return pIW.AkhnZx(file, str);
            }
        });
    }

    public static /* synthetic */ boolean AkhnZx(java.io.File file, java.lang.String str) {
        return str.endsWith(".json");
    }

    public static java.io.File gEmmrt() {
        java.io.File fileOLrzqt = C38063pKw.OLrzqt(fetchVPNInfo(), new java.io.FilenameFilter() { // from class: o.pJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                return pIW.valueOf(file, str);
            }
        });
        java.io.File fileOLrzqt2 = C38063pKw.OLrzqt(EZpvd(), new java.io.FilenameFilter() { // from class: o.pJh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                return pIW.AYXKKw(file, str);
            }
        });
        if (fileOLrzqt == null && fileOLrzqt2 != null) {
            return fileOLrzqt2;
        }
        if (fileOLrzqt2 == null && fileOLrzqt != null) {
            return fileOLrzqt;
        }
        if (fileOLrzqt2 == null || fileOLrzqt == null) {
            return null;
        }
        return fileOLrzqt.lastModified() > fileOLrzqt2.lastModified() ? fileOLrzqt : fileOLrzqt2;
    }

    public static /* synthetic */ boolean valueOf(java.io.File file, java.lang.String str) {
        return str.endsWith(".json");
    }

    public static /* synthetic */ boolean AYXKKw(java.io.File file, java.lang.String str) {
        return str.endsWith(".json");
    }

    public static /* synthetic */ boolean fetchVPNInfo(java.io.File file, java.lang.String str) {
        return str.endsWith(".dmp");
    }

    public static java.io.File[] valueOf() {
        java.io.File[] fileArrListFiles = isConnected().listFiles(new java.io.FilenameFilter() { // from class: o.pJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                return pIW.fetchVPNInfo(file, str);
            }
        });
        return (fileArrListFiles == null || fileArrListFiles.length == 0) ? new java.io.File[0] : fileArrListFiles;
    }

    public static /* synthetic */ boolean AhwBna(java.io.File file, java.lang.String str) {
        return str.endsWith(".json");
    }

    public static java.io.File[] OLrzqt() {
        java.io.File[] fileArrListFiles = EZpvd().listFiles(new java.io.FilenameFilter() { // from class: o.pJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                return pIW.AhwBna(file, str);
            }
        });
        java.io.File[] fileArrListFiles2 = fetchVPNInfo().listFiles(new java.io.FilenameFilter() { // from class: o.pJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                return pIW.djBIcL(file, str);
            }
        });
        if ((fileArrListFiles == null || fileArrListFiles.length == 0) && (fileArrListFiles2 == null || fileArrListFiles2.length == 0)) {
            return new java.io.File[0];
        }
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return fileArrListFiles2;
        }
        if (fileArrListFiles2 == null || fileArrListFiles2.length == 0) {
            return fileArrListFiles;
        }
        int length = fileArrListFiles.length;
        int length2 = fileArrListFiles2.length;
        java.io.File[] fileArr = new java.io.File[length + length2];
        java.lang.System.arraycopy(fileArrListFiles, 0, fileArr, 0, length);
        java.lang.System.arraycopy(fileArrListFiles2, 0, fileArr, length, length2);
        return fileArr;
    }

    public static /* synthetic */ boolean djBIcL(java.io.File file, java.lang.String str) {
        return str.endsWith(".json");
    }

    public static java.io.File values() {
        java.io.File file = new java.io.File(DbNXlk(), "lastSUInfo");
        C38063pKw.OLrzqt(file);
        return new java.io.File(file, "start_up_info.json");
    }

    public static java.io.File AYXKKw() {
        java.io.File file = new java.io.File(DbNXlk(), "crashNum");
        C38063pKw.OLrzqt(file);
        return new java.io.File(file, "dionysus_crash_num.json");
    }

    public static java.io.File AEQbTJ() {
        return new java.io.File(DbNXlk(), "dionysus_launch_num.json");
    }
}
