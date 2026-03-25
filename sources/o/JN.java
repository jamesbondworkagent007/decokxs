package o;

import com.amplitude.android.storage.AndroidStorageContextV1$migrateToLatestVersion$1;
import com.amplitude.common.Logger;
import com.amplitude.core.Storage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JN {
    public final C5214Jc AEQbTJ;
    public final JM EZpvd;
    public final JM KWHzl;
    public final C5314My OLrzqt;
    public final java.util.List<java.io.File> copydefault;

    public JN(@NotNull C5214Jc c5214Jc, @NotNull C5216Je c5216Je) {
        Intrinsics.checkNotNullParameter(c5214Jc, "");
        Intrinsics.checkNotNullParameter(c5216Je, "");
        this.AEQbTJ = c5214Jc;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.copydefault = arrayList;
        this.EZpvd = EZpvd(c5216Je, "amplitude-disk-queue", "amplitude-android-" + c5216Je.ORxRYg());
        this.KWHzl = EZpvd(c5216Je, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + c5216Je.ORxRYg());
        ME meOLrzqt = OLrzqt(c5214Jc, c5216Je);
        arrayList.add(meOLrzqt.djBIcL());
        this.OLrzqt = new C5314My(meOLrzqt);
    }

    public final JM EZpvd(C5216Je c5216Je, java.lang.String str, java.lang.String str2) {
        java.io.File dir = c5216Je.copydefault().getDir(str, 0);
        java.util.List<java.io.File> list = this.copydefault;
        Intrinsics.checkNotNullExpressionValue(dir, "");
        list.add(dir);
        android.content.SharedPreferences sharedPreferences = c5216Je.copydefault().getSharedPreferences(str2, 0);
        java.lang.String strORxRYg = c5216Je.ORxRYg();
        Logger logger = c5216Je.AuCTel().getLogger(this.AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return new JM(strORxRYg, logger, sharedPreferences, dir, this.AEQbTJ.values());
    }

    public final ME OLrzqt(C5214Jc c5214Jc, C5216Je c5216Je) {
        java.io.File dir = c5216Je.copydefault().getDir("amplitude-kotlin-" + c5216Je.fetchVPNInfo(), 0);
        java.lang.String strFetchVPNInfo = c5216Je.fetchVPNInfo();
        java.lang.String strORxRYg = c5216Je.ORxRYg();
        MM mmIsConnected = c5216Je.isConnected();
        Logger logger = c5214Jc != null ? c5216Je.AuCTel().getLogger(c5214Jc) : null;
        java.lang.String str = "amplitude-identity-" + c5216Je.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(dir, "");
        return new ME(strFetchVPNInfo, strORxRYg, null, mmIsConnected, dir, str, logger, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AndroidStorageContextV1$migrateToLatestVersion$1 androidStorageContextV1$migrateToLatestVersion$1;
        JN jn;
        JN jn2;
        if (continuation instanceof AndroidStorageContextV1$migrateToLatestVersion$1) {
            androidStorageContextV1$migrateToLatestVersion$1 = (AndroidStorageContextV1$migrateToLatestVersion$1) continuation;
            int i = androidStorageContextV1$migrateToLatestVersion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidStorageContextV1$migrateToLatestVersion$1.label = i - Integer.MIN_VALUE;
            } else {
                androidStorageContextV1$migrateToLatestVersion$1 = new AndroidStorageContextV1$migrateToLatestVersion$1(this, continuation);
            }
        }
        java.lang.Object obj = androidStorageContextV1$migrateToLatestVersion$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = androidStorageContextV1$migrateToLatestVersion$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            new JC(this.OLrzqt, this.AEQbTJ.isConnected(), this.AEQbTJ.DbNXlk()).KWHzl();
            Storage storageFIwbmz = this.AEQbTJ.fIwbmz();
            JM jm = storageFIwbmz instanceof JM ? (JM) storageFIwbmz : null;
            if (jm != null) {
                C5236Jy c5236Jy = new C5236Jy(this.EZpvd, jm, this.AEQbTJ.DbNXlk());
                androidStorageContextV1$migrateToLatestVersion$1.L$0 = this;
                androidStorageContextV1$migrateToLatestVersion$1.label = 1;
                if (c5236Jy.KWHzl(androidStorageContextV1$migrateToLatestVersion$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            jn = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn2 = (JN) androidStorageContextV1$migrateToLatestVersion$1.L$0;
                C56391yDq.AEQbTJ(obj);
                jn = jn2;
                for (java.io.File file : jn.copydefault) {
                    java.lang.String[] list = file.list();
                    if (list != null && list.length == 0) {
                        file.delete();
                    }
                }
                return Unit.INSTANCE;
            }
            jn = (JN) androidStorageContextV1$migrateToLatestVersion$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Storage storageFetchVPNInfo = jn.AEQbTJ.fetchVPNInfo();
        JM jm2 = storageFetchVPNInfo instanceof JM ? (JM) storageFetchVPNInfo : null;
        if (jm2 != null) {
            C5236Jy c5236Jy2 = new C5236Jy(jn.KWHzl, jm2, jn.AEQbTJ.DbNXlk());
            androidStorageContextV1$migrateToLatestVersion$1.L$0 = jn;
            androidStorageContextV1$migrateToLatestVersion$1.label = 2;
            if (c5236Jy2.KWHzl(androidStorageContextV1$migrateToLatestVersion$1) == objCopydefault) {
                return objCopydefault;
            }
            jn2 = jn;
            jn = jn2;
        }
        while (r9.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
