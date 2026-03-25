package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14491dmU {
    public static volatile C14491dmU KWHzl;
    public final ConcurrentHashMap<java.lang.String, Application> OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dmU.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C14491dmU(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C14491dmU() {
        this.OLrzqt = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.dmU$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dmU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C14491dmU OLrzqt() {
            C14491dmU c14491dmU = C14491dmU.KWHzl;
            if (c14491dmU == null) {
                synchronized (this) {
                    c14491dmU = C14491dmU.KWHzl;
                    if (c14491dmU == null) {
                        c14491dmU = new C14491dmU(null);
                        ActionBar actionBar = C14491dmU.Companion;
                        C14491dmU.KWHzl = c14491dmU;
                    }
                }
            }
            return c14491dmU;
        }
    }

    public final Application KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Application application = new Application(str, jCurrentTimeMillis, string, str2);
        pUU.KWHzl("SecuritySignaturePermissionCheck", "addConnection connectionInfo=" + application);
        this.OLrzqt.put(str, application);
        return application;
    }

    public final Application OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Application application = this.OLrzqt.get(str);
        pUU.KWHzl("SecuritySignaturePermissionCheck", "getConnectionInfo connectionInfo=" + application);
        return application;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!KWHzl()) {
            pUU.KWHzl("SecuritySignaturePermissionCheck", "no need check");
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl("no need check");
        }
        try {
            Application applicationOLrzqt = OLrzqt(str);
            pUU.KWHzl("SecuritySignaturePermissionCheck", "verifyClient: " + (applicationOLrzqt != null ? applicationOLrzqt.EZpvd() : null));
            if (applicationOLrzqt != null && Intrinsics.EZpvd((java.lang.Object) applicationOLrzqt.EZpvd(), (java.lang.Object) str2)) {
                pUU.KWHzl("SecuritySignaturePermissionCheck", "verifyClient success");
                copydefault(str);
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl("");
            }
            pUU.valueOf("SecuritySignaturePermissionCheck", "verifyClient failure");
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("connection not found")));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SecuritySignaturePermissionCheck", "verifyClient Exception", e);
            Result.Application application4 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("SecuritySignaturePermissionCheck", "removeConnection packageName=" + str);
        this.OLrzqt.remove(str);
    }

    public final boolean KWHzl() {
        java.lang.String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_security_signature_permission_check_enabled", AmplitudeName.WEB3);
        if (strAEQbTJ == null) {
            strAEQbTJ = DebugKt.DEBUG_PROPERTY_VALUE_ON;
        }
        return android.text.TextUtils.equals(strAEQbTJ, DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    /* JADX INFO: renamed from: o.dmU$Application */
    public static final class Application {
        public final java.lang.String EZpvd;
        public final long KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i & 2) != 0) {
                j = application.KWHzl;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                str2 = application.OLrzqt;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                str3 = application.copydefault;
            }
            return application.EZpvd(str, j2, str4, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Application(str, j, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && this.KWHzl == application.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.EZpvd.hashCode() * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ClientConnectionInfo(packageName=" + this.EZpvd + ", connectTime=" + this.KWHzl + ", token=" + this.OLrzqt + ", version=" + this.copydefault + ")";
        }

        public Application(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.EZpvd = str;
            this.KWHzl = j;
            this.OLrzqt = str2;
            this.copydefault = str3;
        }
    }
}
