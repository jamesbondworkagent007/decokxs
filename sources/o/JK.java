package o;

import com.amplitude.android.storage.AndroidStorageContextV2$migrateToLatestVersion$1;
import com.amplitude.common.Logger;
import com.amplitude.core.Storage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JK {
    public final JM AEQbTJ;
    public final C5214Jc EZpvd;
    public final java.util.List<java.io.File> KWHzl;
    public final C5314My OLrzqt;
    public final JM copydefault;

    public JK(@NotNull C5214Jc c5214Jc, @NotNull C5216Je c5216Je) {
        Intrinsics.checkNotNullParameter(c5214Jc, "");
        Intrinsics.checkNotNullParameter(c5216Je, "");
        this.EZpvd = c5214Jc;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.KWHzl = arrayList;
        this.AEQbTJ = AEQbTJ(c5216Je, "amplitude-disk-queue", "amplitude-android-" + c5216Je.fetchVPNInfo());
        this.copydefault = AEQbTJ(c5216Je, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + c5216Je.fetchVPNInfo());
        ME meCopydefault = copydefault(c5214Jc, c5216Je);
        arrayList.add(meCopydefault.djBIcL());
        this.OLrzqt = new C5314My(meCopydefault);
    }

    public final ME copydefault(C5214Jc c5214Jc, C5216Je c5216Je) {
        java.io.File dir = c5216Je.copydefault().getDir("amplitude-kotlin-" + c5216Je.fetchVPNInfo(), 0);
        java.lang.String strFetchVPNInfo = c5216Je.fetchVPNInfo();
        java.lang.String strORxRYg = c5216Je.ORxRYg();
        MM mmIsConnected = c5216Je.isConnected();
        Logger logger = c5216Je.AuCTel().getLogger(c5214Jc);
        java.lang.String str = "amplitude-identity-" + c5216Je.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(dir, "");
        return new ME(strFetchVPNInfo, strORxRYg, null, mmIsConnected, dir, str, logger, 4, null);
    }

    public final JM AEQbTJ(C5216Je c5216Je, java.lang.String str, java.lang.String str2) {
        java.io.File dir = c5216Je.copydefault().getDir(str, 0);
        java.util.List<java.io.File> list = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(dir, "");
        list.add(dir);
        android.content.SharedPreferences sharedPreferences = c5216Je.copydefault().getSharedPreferences(str2, 0);
        java.lang.String strFetchVPNInfo = c5216Je.fetchVPNInfo();
        Logger logger = c5216Je.AuCTel().getLogger(this.EZpvd);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return new JM(strFetchVPNInfo, logger, sharedPreferences, dir, this.EZpvd.values());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AndroidStorageContextV2$migrateToLatestVersion$1 androidStorageContextV2$migrateToLatestVersion$1;
        JK jk;
        JK jk2;
        if (continuation instanceof AndroidStorageContextV2$migrateToLatestVersion$1) {
            androidStorageContextV2$migrateToLatestVersion$1 = (AndroidStorageContextV2$migrateToLatestVersion$1) continuation;
            int i = androidStorageContextV2$migrateToLatestVersion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidStorageContextV2$migrateToLatestVersion$1.label = i - Integer.MIN_VALUE;
            } else {
                androidStorageContextV2$migrateToLatestVersion$1 = new AndroidStorageContextV2$migrateToLatestVersion$1(this, continuation);
            }
        }
        java.lang.Object obj = androidStorageContextV2$migrateToLatestVersion$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = androidStorageContextV2$migrateToLatestVersion$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            new JC(this.OLrzqt, this.EZpvd.isConnected(), this.EZpvd.DbNXlk()).KWHzl();
            if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd.djBIcL().fetchVPNInfo(), (java.lang.Object) "$default_instance")) {
                Storage storageFIwbmz = this.EZpvd.fIwbmz();
                JM jm = storageFIwbmz instanceof JM ? (JM) storageFIwbmz : null;
                if (jm != null) {
                    C5236Jy c5236Jy = new C5236Jy(this.AEQbTJ, jm, this.EZpvd.DbNXlk());
                    androidStorageContextV2$migrateToLatestVersion$1.L$0 = this;
                    androidStorageContextV2$migrateToLatestVersion$1.label = 1;
                    if (c5236Jy.KWHzl(androidStorageContextV2$migrateToLatestVersion$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                jk = this;
            } else {
                jk = this;
                while (r9.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jk2 = (JK) androidStorageContextV2$migrateToLatestVersion$1.L$0;
                C56391yDq.AEQbTJ(obj);
                jk = jk2;
                for (java.io.File file : jk.KWHzl) {
                    java.lang.String[] list = file.list();
                    if (list != null && list.length == 0) {
                        file.delete();
                    }
                }
                return Unit.INSTANCE;
            }
            jk = (JK) androidStorageContextV2$migrateToLatestVersion$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Storage storageFetchVPNInfo = jk.EZpvd.fetchVPNInfo();
        JM jm2 = storageFetchVPNInfo instanceof JM ? (JM) storageFetchVPNInfo : null;
        if (jm2 != null) {
            C5236Jy c5236Jy2 = new C5236Jy(jk.copydefault, jm2, jk.EZpvd.DbNXlk());
            androidStorageContextV2$migrateToLatestVersion$1.L$0 = jk;
            androidStorageContextV2$migrateToLatestVersion$1.label = 2;
            if (c5236Jy2.KWHzl(androidStorageContextV2$migrateToLatestVersion$1) == objCopydefault) {
                return objCopydefault;
            }
            jk2 = jk;
            jk = jk2;
        }
        while (r9.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
