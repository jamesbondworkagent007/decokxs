package o;

import com.okinc.lib.dionysus.crash.bean.ErrorAttachmentLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6777aVl {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public java.lang.String AEQbTJ;
    public android.app.Application EZpvd;
    public boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aVl$ActionBar) A[MD:(o.aVl$ActionBar):void (m)] call: o.aVl.<init>(o.aVl$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C6777aVl(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void EZpvd(@NotNull java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map, java.lang.Boolean bool) {
        Companion.OLrzqt(th, map, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void copydefault(@NotNull java.lang.Throwable th) {
        Companion.EZpvd(th);
    }

    public C6777aVl(ActionBar actionBar) {
        this.copydefault = actionBar.AEQbTJ();
        this.AEQbTJ = actionBar.KWHzl();
        this.OLrzqt = actionBar.OLrzqt();
        this.EZpvd = actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.aVl$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aVl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void EZpvd(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            EZpvd(th, null, java.lang.Boolean.FALSE);
        }

        public final void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C6769aVd.OLrzqt.OLrzqt(str);
        }

        public final void OLrzqt(@NotNull java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(th, "");
            EZpvd(th, map, bool);
        }

        public final void OLrzqt(@NotNull java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(th, "");
            C6769aVd.OLrzqt.AEQbTJ(th, map);
        }

        public final void copydefault(java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map, java.lang.Iterable<? extends ErrorAttachmentLog> iterable) {
            C6769aVd c6769aVd = C6769aVd.OLrzqt;
            if (th == null) {
                th = new java.lang.Throwable("custom report exception");
            }
            c6769aVd.AEQbTJ(th, map);
        }

        public final void EZpvd(java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map, java.lang.Boolean bool) {
            C6769aVd.OLrzqt.AEQbTJ(th, map);
        }
    }

    public final void OLrzqt(java.lang.String str) {
        this.AEQbTJ = str;
        java.lang.String str2 = str == null ? "N/A" : str;
        java.lang.String str3 = str2 + "_" + xVW.copydefault();
        pUU.KWHzl("OKBugReport", "updateAppCenterCrashUserId crashUserId: " + str3);
        C6769aVd c6769aVd = C6769aVd.OLrzqt;
        c6769aVd.EZpvd(str3);
        c6769aVd.EZpvd("device_id", xVW.copydefault());
        c6769aVd.EZpvd("uuid", str == null ? "" : str);
        C6750aVK.KWHzl.AEQbTJ(str);
    }

    public final void EZpvd(java.lang.String str) {
        this.AEQbTJ = str;
        java.lang.String str2 = str == null ? "N/A" : str;
        pUU.KWHzl("OKBugReport", "updateAppCenterCrashUserId crashUserId: " + (str2 + "_" + xVW.copydefault()));
        C6750aVK.KWHzl.AEQbTJ(str);
    }

    public final void copydefault(@NotNull android.app.Application application, @NotNull java.lang.String str, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        C6766aVa c6766aVa = new C6766aVa();
        C6769aVd.OLrzqt.KWHzl(application, str, str2, c6766aVa, z);
        c6766aVa.AEQbTJ();
        OLrzqt(str2);
    }

    public final boolean AEQbTJ(android.content.Context context) {
        return C33551myb.EZpvd(context);
    }

    public final void OLrzqt() {
        pUU.KWHzl("OKBugReport", "OKBugReport enable:" + this.OLrzqt);
        if (!AEQbTJ(this.EZpvd) || !this.OLrzqt) {
            pUU.KWHzl("OKBugReport", "OKBugReport do not init");
            return;
        }
        java.lang.String str = this.AEQbTJ;
        if (str == null || str.length() == 0) {
            EZpvd(this.AEQbTJ);
        }
        C6750aVK.KWHzl.AhwBna();
        pUU.EZpvd("OKBugReport", "OKBugReport init success");
    }

    /* JADX INFO: renamed from: o.aVl$ActionBar */
    public static final class ActionBar {
        public boolean AEQbTJ;
        public boolean KWHzl;
        public java.lang.String OLrzqt;
        public final android.app.Application copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.app.Application EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(boolean z) {
            this.AEQbTJ = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(boolean z) {
            this.KWHzl = z;
            return this;
        }

        public ActionBar(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            this.copydefault = application;
            this.OLrzqt = "";
            this.KWHzl = true;
        }

        public final C6777aVl copydefault() {
            C6777aVl c6777aVl = new C6777aVl(this, null);
            c6777aVl.OLrzqt();
            return c6777aVl;
        }
    }
}
