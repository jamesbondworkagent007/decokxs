package o;

import com.amplitude.android.migration.MigrationManager$safePerformMigration$1;
import com.amplitude.android.storage.StorageVersion;
import com.amplitude.common.Logger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5237Jz {
    public final C5216Je AEQbTJ;
    public final C5214Jc EZpvd;
    public final Logger KWHzl;
    public final android.content.SharedPreferences OLrzqt;
    public final int copydefault;

    public C5237Jz(@NotNull C5214Jc c5214Jc) {
        Intrinsics.checkNotNullParameter(c5214Jc, "");
        this.EZpvd = c5214Jc;
        C5244Kg c5244KgDjBIcL = c5214Jc.djBIcL();
        Intrinsics.copydefault(c5244KgDjBIcL, "");
        C5216Je c5216Je = (C5216Je) c5244KgDjBIcL;
        this.AEQbTJ = c5216Je;
        this.KWHzl = c5214Jc.DbNXlk();
        android.content.SharedPreferences sharedPreferences = c5216Je.copydefault().getSharedPreferences("amplitude-android-" + c5216Je.fetchVPNInfo(), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this.OLrzqt = sharedPreferences;
        this.copydefault = sharedPreferences.getInt("storage_version", 0);
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        int i = this.copydefault;
        StorageVersion storageVersion = StorageVersion.V3;
        if (i < storageVersion.getRawValue()) {
            this.KWHzl.OLrzqt("Migrating storage to version " + storageVersion.getRawValue());
            java.lang.Object objEZpvd = EZpvd(continuation);
            return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
        }
        this.EZpvd.DbNXlk().OLrzqt("Storage already at version " + storageVersion.getRawValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MigrationManager$safePerformMigration$1 migrationManager$safePerformMigration$1;
        C5237Jz c5237Jz;
        C5237Jz c5237Jz2;
        C5216Je c5216Je;
        C5237Jz c5237Jz3;
        JK jk;
        if (continuation instanceof MigrationManager$safePerformMigration$1) {
            migrationManager$safePerformMigration$1 = (MigrationManager$safePerformMigration$1) continuation;
            int i = migrationManager$safePerformMigration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                migrationManager$safePerformMigration$1.label = i - Integer.MIN_VALUE;
            } else {
                migrationManager$safePerformMigration$1 = new MigrationManager$safePerformMigration$1(this, continuation);
            }
        }
        java.lang.Object obj = migrationManager$safePerformMigration$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = migrationManager$safePerformMigration$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                C5244Kg c5244KgDjBIcL = this.EZpvd.djBIcL();
                Intrinsics.copydefault(c5244KgDjBIcL, "");
                C5216Je c5216Je2 = (C5216Je) c5244KgDjBIcL;
                if (c5216Je2.ejfBZ()) {
                    JL jl = new JL(this.EZpvd);
                    migrationManager$safePerformMigration$1.L$0 = this;
                    migrationManager$safePerformMigration$1.L$1 = c5216Je2;
                    migrationManager$safePerformMigration$1.label = 1;
                    if (jl.EZpvd(migrationManager$safePerformMigration$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                c5237Jz2 = this;
                c5216Je = c5216Je2;
            } catch (java.lang.Throwable th) {
                th = th;
                c5237Jz = this;
                c5237Jz.KWHzl.EZpvd("Failed to migrate storage: " + th.getMessage());
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5237Jz = (C5237Jz) migrationManager$safePerformMigration$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        c5237Jz.OLrzqt.edit().putInt("storage_version", StorageVersion.V3.getRawValue()).apply();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        c5237Jz.KWHzl.EZpvd("Failed to migrate storage: " + th.getMessage());
                    }
                    return Unit.INSTANCE;
                }
                c5216Je = (C5216Je) migrationManager$safePerformMigration$1.L$1;
                c5237Jz3 = (C5237Jz) migrationManager$safePerformMigration$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    jk = new JK(c5237Jz3.EZpvd, c5216Je);
                    migrationManager$safePerformMigration$1.L$0 = c5237Jz3;
                    migrationManager$safePerformMigration$1.L$1 = null;
                    migrationManager$safePerformMigration$1.label = 3;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    c5237Jz = c5237Jz3;
                    c5237Jz.KWHzl.EZpvd("Failed to migrate storage: " + th.getMessage());
                }
                if (jk.KWHzl(migrationManager$safePerformMigration$1) != objCopydefault) {
                    return objCopydefault;
                }
                c5237Jz = c5237Jz3;
                c5237Jz.OLrzqt.edit().putInt("storage_version", StorageVersion.V3.getRawValue()).apply();
                return Unit.INSTANCE;
            }
            c5216Je = (C5216Je) migrationManager$safePerformMigration$1.L$1;
            c5237Jz2 = (C5237Jz) migrationManager$safePerformMigration$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th4) {
                th = th4;
                c5237Jz = c5237Jz2;
                c5237Jz.KWHzl.EZpvd("Failed to migrate storage: " + th.getMessage());
            }
        }
        JN jn = new JN(c5237Jz2.EZpvd, c5216Je);
        migrationManager$safePerformMigration$1.L$0 = c5237Jz2;
        migrationManager$safePerformMigration$1.L$1 = c5216Je;
        migrationManager$safePerformMigration$1.label = 2;
        if (jn.EZpvd(migrationManager$safePerformMigration$1) == objCopydefault) {
            return objCopydefault;
        }
        c5237Jz3 = c5237Jz2;
        jk = new JK(c5237Jz3.EZpvd, c5216Je);
        migrationManager$safePerformMigration$1.L$0 = c5237Jz3;
        migrationManager$safePerformMigration$1.L$1 = null;
        migrationManager$safePerformMigration$1.label = 3;
        if (jk.KWHzl(migrationManager$safePerformMigration$1) != objCopydefault) {
        }
    }
}
