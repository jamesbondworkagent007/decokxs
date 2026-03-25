package o;

import com.google.common.net.HttpHeaders;
import com.google.gson.reflect.TypeToken;
import com.okinc.base.thread.TPM;
import com.okinc.base.uploadlog.OKUploadLog$startObserveUserEvent$1;
import com.okinc.base.uploadlog.UpLoadLogException;
import com.okinc.base.uploadlog.UploadLogTriggerMethodEnum;
import com.okinc.biz.util.UploadUtils;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.BaseResp;
import com.okinc.okuser.data.Token;
import com.okinc.okuser.data.User;
import io.reactivex.BackpressureStrategy;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C38002pIp;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.aVK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6750aVK {
    public static java.lang.String gEmmrt;
    public static InterfaceC58217yxC valueOf;
    public static final C6750aVK KWHzl = new C6750aVK();
    public static final CoroutineScope copydefault = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain()));
    public static java.lang.String OLrzqt = "";
    public static final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aVY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6750aVK.EZpvd();
        }
    });
    public static volatile AtomicBoolean AEQbTJ = new AtomicBoolean(false);
    public static final int EZpvd = 8;

    /* JADX INFO: renamed from: o.aVK$Activity */
    public static final class Activity extends TypeToken<BaseResp<java.lang.Object>> {
    }

    /* JADX INFO: renamed from: o.aVK$StateListAnimator */
    public static final class StateListAnimator extends TypeToken<BaseResp<java.lang.Object>> {
    }

    /* JADX INFO: renamed from: o.aVK$TaskDescription */
    public static final class TaskDescription implements TPM.Application {
        public final java.lang.String copydefault = "OKUploadLog";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.base.thread.TPM.Application
        public java.lang.String EZpvd() {
            return this.copydefault;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        gEmmrt = str;
    }

    private C6750aVK() {
    }

    public final AbstractC58253yxm gEmmrt() {
        return (AbstractC58253yxm) djBIcL.getValue();
    }

    public static final AbstractC58253yxm EZpvd() {
        return TPM.StateListAnimator.KWHzl.AEQbTJ(new TaskDescription());
    }

    public static /* synthetic */ void resetUploadState$OKBugReport_bugreport$default(C6750aVK c6750aVK, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c6750aVK.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        AEQbTJ.set(z);
    }

    public final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(copydefault, null, null, new OKUploadLog$startObserveUserEvent$1(null), 3, null);
    }

    public final void KWHzl(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "OKX_GLOBAL")) {
            return;
        }
        pUU.KWHzl("OKUploadLog", "User logged in to non-global site: " + str + ", marking flag");
        SPUtils.put("sp_key_non_global_site_logged", java.lang.Boolean.TRUE);
    }

    public final boolean valueOf() {
        boolean z = false;
        if (SPUtils.getBoolean("sp_key_non_global_site_logged", false)) {
            return true;
        }
        java.util.List<User> listCopydefault = C43292rmY.OLrzqt.AwvSrB().copydefault();
        if (!(listCopydefault instanceof java.util.Collection) || !listCopydefault.isEmpty()) {
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String siteCode = ((User) it.next()).getSiteCode();
                if (siteCode != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) siteCode) && !Intrinsics.EZpvd((java.lang.Object) siteCode, (java.lang.Object) "OKX_GLOBAL")) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            SPUtils.put("sp_key_non_global_site_logged", java.lang.Boolean.TRUE);
        }
        return z;
    }

    public final boolean djBIcL() {
        return C43655rtQ.OLrzqt.valueOf();
    }

    public static /* synthetic */ AbstractC58185ywX asyncGetLocalLogFiles$default(C6750aVK c6750aVK, boolean z, java.util.ArrayList arrayList, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 31457280;
        }
        return c6750aVK.copydefault(z, (java.util.ArrayList<java.io.File>) arrayList, j);
    }

    public final AbstractC58185ywX<java.io.File> copydefault(final boolean z, @NotNull final java.util.ArrayList<java.io.File> arrayList, final long j) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AbstractC58185ywX<java.io.File> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.aVX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C6750aVK.KWHzl(z, arrayList, j, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(gEmmrt()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void KWHzl(boolean z, java.util.ArrayList arrayList, long j, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        try {
            pUU.copydefault();
            java.io.File fileEZpvd = KWHzl.EZpvd(z, arrayList, j);
            if (fileEZpvd != null) {
                interfaceC58184ywW.onNext(fileEZpvd);
                interfaceC58184ywW.onComplete();
            } else {
                interfaceC58184ywW.onError(new java.lang.Throwable("log file is null"));
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            interfaceC58184ywW.onError(e);
        }
    }

    public final AbstractC58185ywX<java.util.List<java.io.File>> KWHzl() {
        AbstractC58185ywX<java.util.List<java.io.File>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.aWc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C6750aVK.EZpvd(interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(gEmmrt()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void EZpvd(InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        try {
            java.util.List<java.io.File> listCopydefault = KWHzl.copydefault();
            if (listCopydefault != null && !listCopydefault.isEmpty()) {
                pUU.copydefault("OKUploadLog", "fileList.size:" + listCopydefault.size());
                interfaceC58184ywW.onNext(listCopydefault);
                interfaceC58184ywW.onComplete();
            } else {
                interfaceC58184ywW.onError(new java.lang.Throwable("apk file is isNullOrEmpty"));
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            interfaceC58184ywW.onError(e);
        }
    }

    public final java.util.List<java.io.File> copydefault() {
        java.io.File file = new java.io.File(C43246rlf.OLrzqt.valueOf().getCacheDir(), "apkFiles");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (file.exists()) {
            java.io.File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (java.io.File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        Intrinsics.copydefault(file2);
                        arrayList.add(file2);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        file.mkdirs();
        EZpvd(file);
        OLrzqt(file);
        java.io.File[] fileArrListFiles2 = file.listFiles();
        if (fileArrListFiles2 != null) {
            for (java.io.File file3 : fileArrListFiles2) {
                if (file3.isFile()) {
                    Intrinsics.copydefault(file3);
                    arrayList.add(file3);
                }
            }
        }
        return arrayList;
    }

    public final void EZpvd(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        android.content.pm.ApplicationInfo applicationInfo = C43246rlf.OLrzqt.valueOf().getApplicationInfo();
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "");
        java.io.File file2 = new java.io.File(applicationInfo.sourceDir);
        java.lang.System.out.println("base apk exist:" + file2.exists());
        if (file2.exists()) {
            pUU.copydefault("OKUploadLog", "base apk:" + file2);
            if (OLrzqt.length() == 0) {
                java.lang.String strAEQbTJ = C38062pKv.AEQbTJ(file2);
                OLrzqt = strAEQbTJ;
                pUU.copydefault("OKUploadLog", "currentApkMd5 " + strAEQbTJ);
            }
            if (Intrinsics.EZpvd((java.lang.Object) OLrzqt, (java.lang.Object) SPUtils.getString("apk_md5_sp_key", "", "apk_md5_file_name"))) {
                return;
            }
            SPUtils.put("apk_md5_sp_key", C38062pKv.AEQbTJ(file2), "apk_md5_file_name");
            try {
                AEQbTJ(file2, file, OLrzqt, 20971520L);
            } catch (java.lang.Exception e) {
                pUU.copydefault("OKUploadLog", "splitFile " + e);
            }
        }
    }

    public final void OLrzqt(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        android.content.pm.ApplicationInfo applicationInfo = C43246rlf.OLrzqt.valueOf().getApplicationInfo();
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "");
        java.lang.String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                java.io.File file2 = new java.io.File(str);
                if (file2.exists()) {
                    pUU.copydefault("OKUploadLog", "split apk:" + file2);
                    try {
                        C6750aVK c6750aVK = KWHzl;
                        java.lang.String strAEQbTJ = C38062pKv.AEQbTJ(file2);
                        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
                        c6750aVK.AEQbTJ(file2, file, strAEQbTJ, 20971520L);
                    } catch (java.lang.Exception e) {
                        pUU.copydefault("OKUploadLog", "splitFile " + e);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void splitFile$default(C6750aVK c6750aVK, java.io.File file, java.io.File file2, java.lang.String str, long j, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 8) != 0) {
            j = 31457280;
        }
        c6750aVK.AEQbTJ(file, file2, str, j);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void AEQbTJ(@NotNull java.io.File file, @NotNull java.io.File file2, @NotNull java.lang.String str, long j) throws java.io.IOException {
        int i;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArr = new byte[4096];
        java.lang.String strCopydefault = xVW.copydefault();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        int i2 = 0;
        while (true) {
            try {
                java.io.File file3 = new java.io.File(file2, strCopydefault + "_" + str + "_" + file.getName() + ".part_" + i2);
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file3);
                int i3 = 0;
                do {
                    try {
                        i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        i3 += i;
                    } finally {
                    }
                } while (i3 + 4096 <= j);
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(fileOutputStream, null);
                if (i <= 0) {
                    yFA.copydefault(fileInputStream, null);
                    file3.renameTo(new java.io.File(file2, strCopydefault + "_" + str + "_" + file.getName() + ".part_end"));
                    return;
                }
                i2++;
            } finally {
            }
        }
    }

    public static /* synthetic */ AbstractC58185ywX asyncGetLocalLogFiles$default(C6750aVK c6750aVK, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c6750aVK.copydefault(z);
    }

    public final AbstractC58185ywX<java.io.File> copydefault(boolean z) {
        return asyncGetLocalLogFiles$default(this, z, new java.util.ArrayList(), 0L, 4, null);
    }

    public static /* synthetic */ java.io.File getLocalLogFiles$OKBugReport_bugreport$default(C6750aVK c6750aVK, boolean z, java.util.ArrayList arrayList, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 31457280;
        }
        return c6750aVK.EZpvd(z, arrayList, j);
    }

    public final java.io.File EZpvd(boolean z, @NotNull java.util.ArrayList<java.io.File> arrayList, long j) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(arrayList, "");
        try {
            java.lang.String str2 = gEmmrt;
            if (str2 != null) {
                str = str2;
            }
            java.lang.String str3 = "Android_" + str + "_" + xVW.copydefault();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            C6700aUL c6700aUL = C6700aUL.EZpvd;
            C32979mnm c32979mnm = C32979mnm.EZpvd;
            java.io.File fileOLrzqt = c6700aUL.OLrzqt(c32979mnm.OLrzqt());
            java.io.File fileKWHzl = c6700aUL.KWHzl(c32979mnm.OLrzqt());
            if (fileOLrzqt.exists()) {
                arrayList2.add(fileOLrzqt);
            }
            if (fileKWHzl.exists()) {
                arrayList2.add(fileKWHzl);
            }
            C38002pIp.Application application = C38002pIp.Companion;
            arrayList.addAll(application.fetchVPNInfo());
            arrayList.addAll(application.AEQbTJ());
            java.util.Set<java.io.File> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
            if (setOqFWZa != null) {
                for (java.io.File file : setOqFWZa) {
                    if (file != null && file.exists()) {
                        arrayList2.add(file);
                    }
                }
            }
            if (z) {
                if (j > 31457280) {
                    j = 31457280;
                }
                return pUU.copydefault(str3, j, arrayList2);
            }
            return pUU.EZpvd(str3, (java.util.List<java.io.File>) arrayList2);
        } catch (java.lang.Exception unused) {
            C6777aVl.Companion.EZpvd(new UpLoadLogException("get upload log fail"));
            return null;
        }
    }

    public static /* synthetic */ java.io.File getLocalLogFiles$OKBugReport_bugreport$default(C6750aVK c6750aVK, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c6750aVK.EZpvd(z);
    }

    public final java.io.File EZpvd(boolean z) {
        return getLocalLogFiles$OKBugReport_bugreport$default(this, z, new java.util.ArrayList(), 0L, 4, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.aVK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void uploadLogs$default(C6750aVK c6750aVK, java.lang.String str, boolean z, UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum, boolean z2, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            uploadLogTriggerMethodEnum = UploadLogTriggerMethodEnum.PUSH;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            function2 = null;
        }
        c6750aVK.KWHzl(str, z, uploadLogTriggerMethodEnum, z2, function2);
    }

    public final void KWHzl(java.lang.String str, boolean z, @NotNull UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum, boolean z2, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(uploadLogTriggerMethodEnum, "");
        if (!z2 && uploadLogTriggerMethodEnum != UploadLogTriggerMethodEnum.E2E_MONITOR_UPLOAD && djBIcL() && valueOf()) {
            pUU.KWHzl("OKUploadLog", "uploadLogs skipped for " + uploadLogTriggerMethodEnum.getDesc() + ": current site is global but user has logged in to non-global site before");
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.TRUE, null);
                return;
            }
            return;
        }
        uploadAppInfos$default(this, str, null, z, 31457280L, uploadLogTriggerMethodEnum, function2, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.aVK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void uploadAppInfos$default(C6750aVK c6750aVK, java.lang.String str, java.util.ArrayList arrayList, boolean z, long j, UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            arrayList = new java.util.ArrayList();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            j = 31457280;
        }
        if ((i & 16) != 0) {
            uploadLogTriggerMethodEnum = UploadLogTriggerMethodEnum.PUSH;
        }
        if ((i & 32) != 0) {
            function2 = null;
        }
        c6750aVK.copydefault(str, arrayList, z, j, uploadLogTriggerMethodEnum, function2);
    }

    public final void copydefault(final java.lang.String str, java.util.ArrayList<java.io.File> arrayList, boolean z, long j, final UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum, final Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        if (AEQbTJ.get()) {
            pUU.KWHzl("OKUploadLog", "upload log return immediately cause previous is going on!");
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.TRUE, null);
                return;
            }
            return;
        }
        AEQbTJ.set(true);
        AbstractC58185ywX<java.io.File> abstractC58185ywXCopydefault = copydefault(z, arrayList, C56548yJl.AEQbTJ(j, 31457280L));
        final Function1 function1 = new Function1() { // from class: o.aVU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6750aVK.AEQbTJ(str, uploadLogTriggerMethodEnum, function2, (java.io.File) obj);
            }
        };
        InterfaceC58227yxM<? super java.io.File> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.aVT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6750aVK.fJNWhG(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.aVW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6750aVK.gEmmrt(function2, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.aVV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6750aVK.AuCTel(function12, obj);
            }
        });
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.String str, UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum, Function2 function2, java.io.File file) {
        KWHzl.OLrzqt(file, str, uploadLogTriggerMethodEnum, function2);
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(Function2 function2, java.lang.Throwable th) {
        pUU.copydefault("OKUploadLog", "uploadLogs failed cause get log file error: " + th + " ");
        AEQbTJ.set(false);
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.FALSE, "get log file error!");
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void uploadApk$default(C6750aVK c6750aVK, java.lang.String str, UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            uploadLogTriggerMethodEnum = UploadLogTriggerMethodEnum.APK_UPLOAD;
        }
        c6750aVK.OLrzqt(str, uploadLogTriggerMethodEnum);
    }

    public final void OLrzqt(final java.lang.String str, @NotNull final UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum) {
        Intrinsics.checkNotNullParameter(uploadLogTriggerMethodEnum, "");
        if (AEQbTJ.get()) {
            pUU.KWHzl("OKUploadLog", "upload log return immediately cause previous is going on!");
            return;
        }
        AEQbTJ.set(true);
        AbstractC58185ywX<java.util.List<java.io.File>> abstractC58185ywXKWHzl = KWHzl();
        final Function1 function1 = new Function1() { // from class: o.aVN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6750aVK.OLrzqt(str, uploadLogTriggerMethodEnum, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<java.io.File>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.aVZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6750aVK.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.aWd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6750aVK.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.aWe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6750aVK.values(function12, obj);
            }
        });
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final java.lang.String str, final UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum, final java.util.List list) {
        KWHzl.gEmmrt().scheduleDirect(new java.lang.Runnable() { // from class: o.aVL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C6750aVK.AEQbTJ(list, str, uploadLogTriggerMethodEnum);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(java.util.List list, java.lang.String str, UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum) {
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            final java.io.File file = (java.io.File) it.next();
            KWHzl.copydefault(file, str, uploadLogTriggerMethodEnum, new Function2() { // from class: o.aWb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C6750aVK.OLrzqt(file, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                }
            });
        }
    }

    public static final Unit OLrzqt(java.io.File file, boolean z, java.lang.String str) {
        if (z) {
            file.delete();
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        pUU.copydefault("OKUploadLog", "uploadLogs failed cause get log file error: " + th + " ");
        AEQbTJ.set(false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.aVK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void upload$OKBugReport_bugreport$default(C6750aVK c6750aVK, java.io.File file, java.lang.String str, UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            function2 = null;
        }
        c6750aVK.OLrzqt(file, str, uploadLogTriggerMethodEnum, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(java.io.File file, java.lang.String str, @NotNull UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum, final Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ;
        Intrinsics.checkNotNullParameter(uploadLogTriggerMethodEnum, "");
        if (file == null) {
            pUU.copydefault("OKUploadLog", "upload log failed cause log file is empty!");
            AEQbTJ.set(false);
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.FALSE, "file empty");
                return;
            }
            return;
        }
        pUU.KWHzl("OKUploadLog", "uploadLogs file: " + file.getName() + ", jsonStr: " + str);
        java.util.HashMap map = new java.util.HashMap();
        map.put("file", file);
        map.put("triggerMethod", uploadLogTriggerMethodEnum.getDesc());
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "");
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    map.put(next, jSONObject.get(next));
                }
            } catch (java.lang.Throwable th) {
                pUU.AEQbTJ("OKUploadLog", "parse " + str + " error", th);
            }
        }
        java.util.HashMap<java.lang.String, java.lang.String> mapAEQbTJ = AEQbTJ();
        mapAEQbTJ.put("uploadSecret", C33485mxO.AEQbTJ(file.getName() + "0GdCLU"));
        InterfaceC58217yxC interfaceC58217yxC = valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXUploadFile$default = UploadUtils.uploadFile$default(UploadUtils.OLrzqt, C43292rmY.OLrzqt.fJNWhG() + "/v2/support/app/log/upload", map, new StateListAnimator(), mapAEQbTJ, null, 16, null);
        if (abstractC58185ywXUploadFile$default != null) {
            final Function1 function1 = new Function1() { // from class: o.aVM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6750aVK.EZpvd(function2, (java.lang.Throwable) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXOLrzqt = abstractC58185ywXUploadFile$default.OLrzqt(new InterfaceC58227yxM() { // from class: o.aVP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C6750aVK.valueOf(function1, obj);
                }
            });
            if (abstractC58185ywXOLrzqt != null) {
                final Function1 function12 = new Function1() { // from class: o.aVO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C6750aVK.KWHzl(function2, (BaseResp) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.aVQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C6750aVK.fetchVPNInfo(function12, obj);
                    }
                };
                final Function1 function13 = new Function1() { // from class: o.aVS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C6750aVK.valueOf(function2, (java.lang.Throwable) obj);
                    }
                };
                interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.aVR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C6750aVK.isConnected(function13, obj);
                    }
                });
            } else {
                interfaceC58217yxCAEQbTJ = null;
            }
        }
        valueOf = interfaceC58217yxCAEQbTJ;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function2 function2, java.lang.Throwable th) {
        pUU.valueOf("OKUploadLog", "upload log error: " + th);
        AEQbTJ.set(false);
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.FALSE, "upload exception!");
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function2 function2, BaseResp baseResp) {
        int i = baseResp.code;
        if (i == 0) {
            pUU.KWHzl("OKUploadLog", "upload log success!");
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.TRUE, null);
            }
            AEQbTJ.set(false);
        } else {
            pUU.valueOf("OKUploadLog", "upload log failed errorCode: " + i + ", msg: " + baseResp.msg);
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.FALSE, "code: " + baseResp.code + ", msg: " + baseResp.msg);
            }
            AEQbTJ.set(false);
        }
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(Function2 function2, java.lang.Throwable th) {
        pUU.valueOf("OKUploadLog", "upload log error: " + th);
        AEQbTJ.set(false);
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.FALSE, "upload exception!");
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.aVK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void uploadApkParts$OKBugReport_bugreport$default(C6750aVK c6750aVK, java.io.File file, java.lang.String str, UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            function2 = null;
        }
        c6750aVK.copydefault(file, str, uploadLogTriggerMethodEnum, (Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>) function2);
    }

    public final void copydefault(java.io.File file, java.lang.String str, @NotNull UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum, final Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(uploadLogTriggerMethodEnum, "");
        if (file == null) {
            pUU.copydefault("OKUploadLog", "upload log failed cause log file is empty!");
            AEQbTJ.set(false);
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.FALSE, "file empty");
                return;
            }
            return;
        }
        pUU.KWHzl("OKUploadLog", "uploadLogs file: " + file.getName() + ", jsonStr: " + str);
        java.util.HashMap map = new java.util.HashMap();
        map.put("file", file);
        map.put("triggerMethod", uploadLogTriggerMethodEnum.getDesc());
        java.util.HashMap<java.lang.String, java.lang.String> mapAEQbTJ = AEQbTJ();
        mapAEQbTJ.put("uploadSecret", C33485mxO.AEQbTJ(file.getName() + "0GdCLU"));
        AbstractC58185ywX abstractC58185ywXUploadFile$default = UploadUtils.uploadFile$default(UploadUtils.OLrzqt, C43292rmY.OLrzqt.fJNWhG() + "/v2/support/app/log/upload", map, new Activity(), mapAEQbTJ, null, 16, null);
        if (abstractC58185ywXUploadFile$default != null) {
            final Function1 function1 = new Function1() { // from class: o.aWa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6750aVK.copydefault(function2, (BaseResp) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.aWi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C6750aVK.DbNXlk(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.aWf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6750aVK.AYXKKw(function2, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXUploadFile$default.EZpvd(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.aWh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C6750aVK.fIwbmz(function12, obj);
                }
            });
        }
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function2 function2, BaseResp baseResp) {
        pUU.valueOf("OKUploadLog", "blockingSubscribe: " + java.lang.Thread.currentThread());
        int i = baseResp.code;
        if (i == 0) {
            pUU.KWHzl("OKUploadLog", "upload log success!");
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.TRUE, null);
            }
            AEQbTJ.set(false);
        } else {
            pUU.valueOf("OKUploadLog", "upload log failed errorCode: " + i + ", msg: " + baseResp.msg);
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.FALSE, "code: " + baseResp.code + ", msg: " + baseResp.msg);
            }
            AEQbTJ.set(false);
        }
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(Function2 function2, java.lang.Throwable th) {
        pUU.valueOf("OKUploadLog", "upload log error: " + th);
        AEQbTJ.set(false);
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.FALSE, "upload exception!");
        }
        return Unit.INSTANCE;
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ() {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        Token tokenAhwBna = c43292rmY.AwvSrB().AhwBna();
        java.lang.String value = tokenAhwBna != null ? tokenAhwBna.getValue() : null;
        if (value != null) {
            C33129mqd.OLrzqt((java.lang.CharSequence) value);
            map.put("Authorization", value);
        }
        map.put(HttpHeaders.REFERER, c43292rmY.fJNWhG());
        map.put("x-utc", C6848aXC.EZpvd.EZpvd());
        if (!android.text.TextUtils.isEmpty(xVW.copydefault())) {
            map.put("devId", xVW.copydefault());
        }
        return map;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.biz.util.UploadUtils.checkUploadLog$default(com.okinc.biz.util.UploadUtils, java.util.Map, kotlinx.coroutines.CoroutineDispatcher, java.lang.String, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super UploadUtils.StateListAnimator> continuation) {
        if (AEQbTJ.get()) {
            pUU.KWHzl("OKUploadLog", "checkUploadLog, return, mIsUploading is true. return false");
            return new UploadUtils.StateListAnimator(UploadUtils.UploadType.NO_NEED_UPLOAD_TYPE, false, 2, null);
        }
        return UploadUtils.checkUploadLog$default(UploadUtils.OLrzqt, AEQbTJ(), null, null, continuation, 6, null);
    }
}
