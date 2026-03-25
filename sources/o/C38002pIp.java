package o;

import com.okinc.lib.dionysus.bean.AppLaunchData;
import com.okinc.lib.dionysus.bean.LastStartUpInfo;
import com.okinc.lib.dionysus.crash.DeviceInfoHelper;
import com.okinc.lib.dionysus.crash.bean.CrashData;
import com.okinc.lib.dionysus.crash.bean.CrashReportBody;
import com.okinc.lib.dionysus.reflection.Reflection;
import com.okinc.lib.utils.OkUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38002pIp {
    public static long AEQbTJ;
    public static volatile boolean AYXKKw;
    public static volatile boolean AhwBna;
    public static volatile boolean EZpvd;
    public static volatile long KWHzl;
    public static volatile long copydefault;
    public static volatile boolean djBIcL;
    public final boolean AkhnZx;
    public final InterfaceC38050pKj AuCTel;
    public final boolean DbNXlk;
    public final pIE ejfBZ;
    public final int fARcdN;
    public final pIB fIwbmz;
    public final java.lang.Class<?> fJNWhG;
    public final boolean fetchVPNInfo;
    public pIA gEmmrt;
    public java.lang.String hDKMBd;
    public final boolean isConnected;
    public final int valueOf;
    public final boolean values;
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Class<?> AYXKKw() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC38050pKj valueOf() {
        return this.AuCTel;
    }

    public C38002pIp(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, @NotNull java.lang.Class<?> cls, @NotNull InterfaceC38050pKj interfaceC38050pKj, pIE pie, pIB pib) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(interfaceC38050pKj, "");
        this.isConnected = z;
        this.DbNXlk = z2;
        this.values = z3;
        this.AkhnZx = z4;
        this.fARcdN = i;
        this.fetchVPNInfo = z5;
        this.valueOf = i2;
        this.fJNWhG = cls;
        this.AuCTel = interfaceC38050pKj;
        this.ejfBZ = pie;
        this.fIwbmz = pib;
        this.hDKMBd = "";
    }

    public final void copydefault(java.lang.String str) throws DeviceInfoHelper.DeviceInfoException {
        this.hDKMBd = str;
        DeviceInfoHelper.KWHzl(OkUtils.KWHzl());
    }

    /* JADX INFO: renamed from: o.pIp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pIp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final long isConnected() {
            return C38002pIp.AEQbTJ;
        }

        public final pIA gEmmrt() {
            return pIC.EZpvd.KWHzl().gEmmrt;
        }

        public final pIB OLrzqt() {
            return pIC.EZpvd.KWHzl().fIwbmz;
        }

        public final InterfaceC38050pKj iwGUEr() {
            return pIC.EZpvd.KWHzl().valueOf();
        }

        public final boolean AuCTel() {
            return pIC.EZpvd.KWHzl().values;
        }

        public final boolean fIwbmz() {
            return pIC.EZpvd.KWHzl().DbNXlk;
        }

        public final boolean fARcdN() {
            return pIC.EZpvd.KWHzl().AkhnZx;
        }

        public final int uzCIH() {
            return pIC.EZpvd.KWHzl().fARcdN;
        }

        public final boolean AkhnZx() {
            return C38002pIp.EZpvd;
        }

        public final void EZpvd(boolean z) {
            C38002pIp.EZpvd = z;
        }

        public final boolean ejfBZ() {
            return pIC.EZpvd.KWHzl().isConnected;
        }

        public final boolean getNewProxyInstance() {
            return C38002pIp.djBIcL;
        }

        public final void getFieldNames() {
            synchronized (this) {
                pIF.log$default("recordStartUpFinish true", false, null, null, 7, null);
                C38002pIp.djBIcL = true;
            }
        }

        public final void copydefault(@NotNull java.lang.String str) throws DeviceInfoHelper.DeviceInfoException {
            Intrinsics.checkNotNullParameter(str, "");
            pIC.EZpvd.KWHzl().copydefault(str);
        }

        public final java.lang.String values() {
            return pIC.EZpvd.KWHzl().hDKMBd;
        }

        public final java.util.List<java.lang.Long> AubY() {
            java.util.List<java.lang.Long> listAhwBna;
            java.io.File fileValues = pIW.values();
            java.lang.String strAEQbTJ = C38057pKq.AEQbTJ(fileValues);
            try {
                Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
                LastStartUpInfo lastStartUpInfo = (LastStartUpInfo) C33490mxT.EZpvd(strAEQbTJ, LastStartUpInfo.class);
                if (lastStartUpInfo == null || (listAhwBna = lastStartUpInfo.startTimeList) == null) {
                    listAhwBna = yDY.AhwBna();
                }
            } catch (java.lang.Exception e) {
                pIF.log$default("=> updateStartUpInfoFile JSON.parseObject error: " + e.getMessage(), true, null, null, 6, null);
                listAhwBna = yDY.AhwBna();
            }
            LastStartUpInfo lastStartUpInfo2 = new LastStartUpInfo();
            lastStartUpInfo2.startTimeList.addAll(listAhwBna);
            long jKWHzl = KWHzl();
            pIF.log$default("=> appLaunchTime: " + KWHzl(jKWHzl) + " " + jKWHzl, true, null, null, 6, null);
            lastStartUpInfo2.startTimeList.add(java.lang.Long.valueOf(jKWHzl));
            if (lastStartUpInfo2.startTimeList.size() > 5) {
                lastStartUpInfo2.startTimeList.remove(0);
            }
            java.lang.String strOLrzqt = C33490mxT.OLrzqt(lastStartUpInfo2);
            java.util.List<java.lang.Long> list = lastStartUpInfo2.startTimeList;
            Intrinsics.checkNotNullExpressionValue(list, "");
            pIF.log$default("=> updateStartUpInfoFile JSON str: " + KWHzl(list), false, null, null, 7, null);
            C38057pKq.KWHzl(fileValues);
            C38057pKq.copydefault(fileValues, strOLrzqt);
            return listAhwBna;
        }

        public final java.lang.String KWHzl(long j) {
            java.lang.String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(j));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }

        public final boolean fJNWhG() {
            return C38002pIp.AhwBna;
        }

        public final void OLrzqt(boolean z) {
            C38002pIp.AhwBna = z;
        }

        public final long KWHzl() {
            return C38002pIp.KWHzl;
        }

        public final long copydefault() {
            return C38002pIp.copydefault;
        }

        public final void EZpvd() {
            try {
                C38063pKw.EZpvd(pIW.AYXKKw());
                C38063pKw.EZpvd(pIW.AEQbTJ());
                pIF.log$default("=> clearCrashMark: true", true, null, null, 6, null);
            } catch (java.lang.Throwable unused) {
                pIF.log$default("=> clearCrashMark: false", true, null, null, 6, null);
            }
        }

        public final int DbNXlk() {
            int size = 0;
            if (!fARcdN()) {
                return 0;
            }
            try {
                java.lang.String strAEQbTJ = C38057pKq.AEQbTJ(pIW.AEQbTJ());
                Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
                AppLaunchData appLaunchData = (AppLaunchData) C33490mxT.EZpvd(strAEQbTJ, AppLaunchData.class);
                if (appLaunchData == null) {
                    appLaunchData = new AppLaunchData();
                }
                if (appLaunchData.getLaunchDataList() != null && appLaunchData.getLaunchDataList().size() > 0) {
                    size = appLaunchData.getLaunchDataList().size();
                }
            } catch (java.lang.Exception e) {
                iwGUEr().copydefault("Monitor.Dionysus", "getLaunchNum ", e);
            }
            iwGUEr().EZpvd("Monitor.Dionysus", "getLaunchNum num:" + size);
            return size;
        }

        public static /* synthetic */ boolean showErrorIgnoreInit$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return application.KWHzl(str);
        }

        public final boolean KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return EZpvd(false, str);
        }

        public static /* synthetic */ boolean showErrorIgnoreInit$default(Application application, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return application.EZpvd(z, str);
        }

        public final boolean EZpvd(boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (!fIwbmz()) {
                pIF.log$default("=> showErrorIgnoreInit = false", false, null, str, 3, null);
                return false;
            }
            if (!ejfBZ()) {
                int iDbNXlk = DbNXlk();
                pIF.log$default("=> showErrorIgnoreInit:launchNum:" + iDbNXlk + " process:" + C38059pKs.copydefault() + "[main=" + C38059pKs.KWHzl() + "]", false, null, str, 3, null);
                if (fARcdN() && iDbNXlk >= uzCIH()) {
                    pIF.log$default("=> showErrorIgnoreInit = true launchNum:" + iDbNXlk, false, null, str, 3, null);
                    return true;
                }
                int iAEQbTJ = AEQbTJ(str);
                pIC pic = pIC.EZpvd;
                pIF.log$default("=> " + iAEQbTJ + "/" + pic.KWHzl().valueOf + " recorded ", false, null, str, 3, null);
                boolean z2 = iAEQbTJ >= pic.KWHzl().valueOf;
                pIF.log$default("=> showErrorIgnoreInit = " + z2, false, null, str, 3, null);
                if (z2 && z) {
                    copydefault(true);
                }
                return z2;
            }
            pIF.log$default("=> showErrorIgnoreInit = false", false, null, str, 3, null);
            return false;
        }

        public final int AEQbTJ(@NotNull java.lang.String str) {
            java.lang.String strAEQbTJ;
            java.util.ArrayList<CrashData.CrashInfo> crashList;
            Intrinsics.checkNotNullParameter(str, "");
            java.io.File fileAYXKKw = pIW.AYXKKw();
            pIF.log$default("=> showErrorIgnoreInit file exists=" + fileAYXKKw.exists() + "," + fileAYXKKw, false, null, str, 3, null);
            try {
                if (fileAYXKKw.exists() && (strAEQbTJ = C38057pKq.AEQbTJ(fileAYXKKw)) != null && strAEQbTJ.length() != 0) {
                    CrashData crashData = (CrashData) C33490mxT.EZpvd(strAEQbTJ, CrashData.class);
                    pIF.log$default("=> showErrorIgnoreInit crashData: " + crashData, false, null, str, 3, null);
                    if (crashData != null && (crashList = crashData.getCrashList()) != null) {
                        return crashList.size();
                    }
                }
            } catch (java.lang.Exception e) {
                pIF.log$default("=> showErrorIgnoreInit JSON.parseObject error: " + e.getMessage(), true, null, str, 2, null);
            }
            return 0;
        }

        public final void hDKMBd() {
            android.app.Application applicationCopydefault = OkUtils.copydefault();
            pIC pic = pIC.EZpvd;
            android.content.Intent intent = new android.content.Intent(applicationCopydefault, pic.KWHzl().AYXKKw());
            intent.setFlags(268468224);
            OkUtils.copydefault().startActivity(intent);
            pIF.log$default("=> jumpDefaultErrorPage: " + pic.KWHzl().AYXKKw(), false, null, null, 7, null);
        }

        public final CrashReportBody valueOf() {
            java.lang.String strAhwBna = AhwBna();
            if (strAhwBna != null) {
                return (CrashReportBody) C33490mxT.EZpvd(strAhwBna, CrashReportBody.class);
            }
            return null;
        }

        public final java.lang.String AhwBna() {
            java.io.File fileDjBIcL = djBIcL();
            if (fileDjBIcL != null) {
                return C38057pKq.AEQbTJ(fileDjBIcL);
            }
            return null;
        }

        public final java.io.File AYXKKw() {
            return pIW.AhwBna();
        }

        public final java.io.File djBIcL() {
            return pIW.gEmmrt();
        }

        public final java.util.List<java.io.File> fetchVPNInfo() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.io.File[] fileArrValueOf = pIW.valueOf();
            Intrinsics.checkNotNullExpressionValue(fileArrValueOf, "");
            C56406yEe.KWHzl(arrayList, fileArrValueOf);
            return arrayList;
        }

        public final java.util.ArrayList<java.io.File> AEQbTJ() {
            java.util.ArrayList<java.io.File> arrayList = new java.util.ArrayList<>();
            java.io.File[] fileArrOLrzqt = pIW.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(fileArrOLrzqt, "");
            C56406yEe.KWHzl(arrayList, fileArrOLrzqt);
            return arrayList;
        }

        public final void KWHzl(pIQ piq, boolean z) {
            java.io.File fileAYXKKw = AYXKKw();
            if (fileAYXKKw != null && fileAYXKKw.exists()) {
                pIM.OLrzqt.AEQbTJ(fileAYXKKw, piq, z);
            } else {
                pIF.log$default("postCrashLog crash file not exist", false, null, null, 7, null);
            }
        }

        public final void copydefault(boolean z) {
            if (C38059pKs.KWHzl()) {
                KWHzl(new C0914Application(), z);
            }
        }

        /* JADX INFO: renamed from: o.pIp$Application$Application, reason: collision with other inner class name */
        public static final class C0914Application implements pIQ {
            @Override // o.pIQ
            public void copydefault(java.io.IOException iOException, java.lang.String str) {
                pIF.log$default("onFailure--" + str, true, null, null, 6, null);
            }

            /* JADX DEBUG: Class process forced to load method for inline: o.pIF.log$default(java.lang.String, boolean, java.lang.String, java.lang.String, int, java.lang.Object):void */
            @Override // o.pIQ
            public void EZpvd(java.io.File file) {
                Intrinsics.checkNotNullParameter(file, "");
                pIF.log$default("onSuccess--deleteFile:" + C38063pKw.EZpvd(file), false, null, null, 7, null);
            }
        }

        public final java.util.List<java.lang.String> KWHzl(java.util.List<java.lang.Long> list) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(KWHzl(((java.lang.Number) it.next()).longValue()));
            }
            return arrayList;
        }
    }

    public final void AhwBna() {
        KWHzl = java.lang.System.currentTimeMillis();
        copydefault = android.os.SystemClock.elapsedRealtime();
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context, new C38003pIq(context));
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull pIA pia) {
        CrashData crashData;
        java.util.List<java.lang.Long> list;
        java.util.Iterator it;
        long j;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pia, "");
        AhwBna();
        OkUtils.OLrzqt(context);
        OkUtils.OLrzqt(valueOf());
        pIF.log$default("install isDebug:" + this.isConnected + " isEnable:" + this.DbNXlk + " isEnableSafeMode:" + this.values + " isEnableLaunchNum:" + this.AkhnZx + " isSyncToAppCenter:" + this.fetchVPNInfo + " process:" + C38059pKs.copydefault() + "[main=" + C38059pKs.KWHzl() + "]", false, null, null, 7, null);
        pIW.OLrzqt(OkUtils.KWHzl());
        if (C38059pKs.KWHzl() && !AYXKKw && this.DbNXlk) {
            try {
                java.io.File fileDjBIcL = pIW.djBIcL();
                Intrinsics.checkNotNullExpressionValue(fileDjBIcL, "");
                pIE pie = this.ejfBZ;
                if (pie != null) {
                    pie.AEQbTJ(fileDjBIcL.getAbsolutePath());
                }
                java.util.List<java.lang.Long> listAubY = Companion.AubY();
                java.util.List<java.io.File> listCopydefault = C38063pKw.copydefault(fileDjBIcL, new java.io.FileFilter() { // from class: o.pIu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.io.FileFilter
                    public final boolean accept(java.io.File file) {
                        return C38002pIp.KWHzl(file);
                    }
                }, true);
                pIF.log$default("=> dump fileList:" + listCopydefault.size() + " " + listCopydefault, false, null, null, 7, null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                Intrinsics.copydefault(listCopydefault);
                if (!listCopydefault.isEmpty()) {
                    java.util.Iterator it2 = listCopydefault.iterator();
                    while (it2.hasNext()) {
                        java.io.File file = (java.io.File) it2.next();
                        long jAhwBna = C38063pKw.AhwBna(file);
                        java.lang.String path = file.getPath();
                        Application application = Companion;
                        pIF.log$default("native crash dmp:" + path + "  fileLastModifiedTime:" + application.KWHzl(jAhwBna) + " \nstartUpInfoList:" + application.KWHzl(listAubY), false, null, null, 7, null);
                        java.util.Iterator<T> it3 = listAubY.iterator();
                        while (it3.hasNext()) {
                            long jLongValue = jAhwBna - ((java.lang.Number) it3.next()).longValue();
                            if (1 > jLongValue || jLongValue >= 30000) {
                                list = listAubY;
                                it = it2;
                                j = jAhwBna;
                            } else {
                                java.lang.String path2 = file.getPath();
                                java.lang.String strValueOf = C38063pKw.valueOf(file);
                                it = it2;
                                long jGEmmrt = C38063pKw.gEmmrt(file);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                list = listAubY;
                                sb.append("=======>start up native crash dmp:");
                                sb.append(path2);
                                sb.append(" LastModifiedTime:");
                                sb.append(jAhwBna);
                                sb.append(" FileSize:");
                                sb.append(strValueOf);
                                sb.append(" FileLength:");
                                sb.append(jGEmmrt);
                                pIF.log$default(sb.toString(), false, null, null, 7, null);
                                j = jAhwBna;
                                arrayList.add(new CrashData.CrashInfo(jAhwBna, jLongValue, true, true, C38063pKw.gEmmrt(file)));
                            }
                            it2 = it;
                            listAubY = list;
                            jAhwBna = j;
                        }
                    }
                }
                pIF.log$default("=> sync native nativeCrashData: " + arrayList.size(), false, null, null, 7, null);
                if (!arrayList.isEmpty()) {
                    AEQbTJ = ((CrashData.CrashInfo) arrayList.get(0)).dmpFileSize;
                    java.io.File fileAYXKKw = pIW.AYXKKw();
                    java.lang.String strAEQbTJ = C38057pKq.AEQbTJ(fileAYXKKw);
                    if (strAEQbTJ == null || (crashData = (CrashData) C33490mxT.EZpvd(strAEQbTJ, CrashData.class)) == null) {
                        crashData = new CrashData();
                    }
                    crashData.getCrashList().addAll(arrayList);
                    pIF.log$default("=> sync CrashData size: " + crashData.getCrashList().size(), false, null, null, 7, null);
                    java.lang.String strOLrzqt = C33490mxT.OLrzqt(crashData);
                    C38057pKq.KWHzl(fileAYXKKw);
                    C38057pKq.copydefault(fileAYXKKw, strOLrzqt);
                }
                gEmmrt();
            } catch (java.lang.Exception e) {
                pIF.log$default("=> sync native crash error: " + e.getMessage(), true, null, null, 6, null);
            }
            pIW.KWHzl();
            if (Companion.KWHzl("Dionysus init")) {
                try {
                    pIF.log$default("=> hookInstrumentation: " + pIO.EZpvd(pIS.EZpvd()), true, null, null, 6, null);
                } catch (java.lang.Exception e2) {
                    pIF.log$default("=> hookInstrumentation: " + e2.getMessage(), true, null, null, 6, null);
                }
                try {
                    Reflection.KWHzl(context);
                } catch (java.lang.Throwable th) {
                    pIF.log$default("=> Reflection.unseal android P : " + th.getMessage(), true, null, null, 6, null);
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                pIF.log$default("=> ignore hookInstrumentation", false, null, null, 7, null);
            }
            AYXKKw = true;
            this.gEmmrt = pia;
            pIW.copydefault();
            new C38000pIn(context, pia).AEQbTJ();
            OkUtils.copydefault().registerActivityLifecycleCallbacks(new C38005pIs(true));
            pIF.log$default("=> Initialized", false, null, null, 7, null);
        }
    }

    public static final boolean KWHzl(java.io.File file) {
        java.lang.String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return C59449zhJ.endsWith$default(name, "dmp", false, 2, null);
    }

    public final void gEmmrt() {
        boolean zEZpvd;
        java.lang.StringBuilder sb;
        java.io.File fileDjBIcL = pIW.djBIcL();
        Intrinsics.checkNotNullExpressionValue(fileDjBIcL, "");
        java.util.List<java.io.File> listCopydefault = C38063pKw.copydefault(fileDjBIcL, new java.io.FileFilter() { // from class: o.pIv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FileFilter
            public final boolean accept(java.io.File file) {
                return C38002pIp.copydefault(file);
            }
        }, true);
        pIF.log$default("=> isSyncToAppCenter:" + this.fetchVPNInfo + " fileList：" + listCopydefault + " ", false, null, null, 7, null);
        Intrinsics.copydefault(listCopydefault);
        if ((!listCopydefault.isEmpty()) && this.fetchVPNInfo) {
            for (java.io.File file : listCopydefault) {
                try {
                    try {
                        long jAhwBna = C38063pKw.AhwBna(file);
                        C56529yIt c56529yIt = C56529yIt.KWHzl;
                        java.lang.String str = java.lang.String.format("%s_%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(jAhwBna), file.getName()}, 2));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        C38063pKw.KWHzl(file.getAbsolutePath(), new java.io.File(pIW.isConnected(), str).getAbsolutePath(), true);
                        pIF.log$default("======>syncToAppCenter copy native crash dmp to AppCenter and PendingDir success", false, null, null, 7, null);
                        zEZpvd = C38063pKw.EZpvd(file);
                        sb = new java.lang.StringBuilder();
                    } catch (java.lang.Exception e) {
                        pIF.log$default("======>syncToAppCenter copy native crash dmp to AppCenterMinidumpDirectory and PendingMinidumpDirectory fail: " + e.getMessage(), true, null, null, 6, null);
                        pIF.log$default("======>syncToAppCenter copy native crash dmp to AppCenter and PendingDir success", false, null, null, 7, null);
                        zEZpvd = C38063pKw.EZpvd(file);
                        sb = new java.lang.StringBuilder();
                    }
                    sb.append("======>syncToAppCenter delete native crash dmp from newMinidumpDir: ");
                    sb.append(zEZpvd);
                    pIF.log$default(sb.toString(), false, null, null, 7, null);
                } catch (java.lang.Throwable th) {
                    pIF.log$default("======>syncToAppCenter copy native crash dmp to AppCenter and PendingDir success", false, null, null, 7, null);
                    pIF.log$default("======>syncToAppCenter delete native crash dmp from newMinidumpDir: " + C38063pKw.EZpvd(file), false, null, null, 7, null);
                    throw th;
                }
            }
        }
    }

    public static final boolean copydefault(java.io.File file) {
        java.lang.String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return C59449zhJ.endsWith$default(name, "dmp", false, 2, null);
    }
}
