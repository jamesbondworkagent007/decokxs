package o;

import android.app.Application;
import android.content.pm.PackageManager;
import com.amplitude.android.AutocaptureOption;
import com.amplitude.android.plugins.AndroidLifecyclePlugin$setup$1;
import com.amplitude.core.platform.Plugin;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JH implements Application.ActivityLifecycleCallbacks, com.amplitude.core.platform.Plugin {
    public static final Activity Companion = new Activity(null);
    public JZ AEQbTJ;
    public Job AYXKKw;
    public android.content.pm.PackageInfo AhwBna;
    public boolean EZpvd;
    public C5216Je KWHzl;
    public C5214Jc OLrzqt;
    public final JP copydefault;
    public final java.util.Set<java.lang.Integer> djBIcL;
    public final java.util.Set<java.lang.Integer> gEmmrt;
    public final Plugin.Type valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public void AEQbTJ(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        this.AEQbTJ = jz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public Plugin.Type EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    public JH(@NotNull JP jp2) {
        Intrinsics.checkNotNullParameter(jp2, "");
        this.copydefault = jp2;
        this.valueOf = Plugin.Type.Utility;
        this.djBIcL = new LinkedHashSet();
        this.gEmmrt = new LinkedHashSet();
    }

    @Override // com.amplitude.core.platform.Plugin
    public void KWHzl(@NotNull JZ jz) {
        android.content.pm.PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(jz, "");
        super.KWHzl(jz);
        this.OLrzqt = (C5214Jc) jz;
        C5244Kg c5244KgDjBIcL = jz.djBIcL();
        Intrinsics.copydefault(c5244KgDjBIcL, "");
        C5216Je c5216Je = (C5216Je) c5244KgDjBIcL;
        this.KWHzl = c5216Je;
        if (c5216Je == null) {
            Intrinsics.gEmmrt("");
            c5216Je = null;
        }
        android.content.Context contextCopydefault = c5216Je.copydefault();
        Intrinsics.copydefault(contextCopydefault, "");
        android.app.Application application = (android.app.Application) contextCopydefault;
        C5216Je c5216Je2 = this.KWHzl;
        if (c5216Je2 == null) {
            Intrinsics.gEmmrt("");
            c5216Je2 = null;
        }
        if (c5216Je2.AEQbTJ().contains(AutocaptureOption.APP_LIFECYCLES)) {
            try {
                packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "");
            } catch (PackageManager.NameNotFoundException unused) {
                jz.DbNXlk().EZpvd("Cannot find package with application.packageName: " + application.getPackageName());
                packageInfo = new android.content.pm.PackageInfo();
            }
            this.AhwBna = packageInfo;
            C5214Jc c5214Jc = this.OLrzqt;
            if (c5214Jc == null) {
                Intrinsics.gEmmrt("");
                c5214Jc = null;
            }
            JT jt = new JT(c5214Jc);
            android.content.pm.PackageInfo packageInfo2 = this.AhwBna;
            if (packageInfo2 == null) {
                Intrinsics.gEmmrt("");
                packageInfo2 = null;
            }
            jt.AEQbTJ(packageInfo2);
            this.AYXKKw = BuildersKt__Builders_commonKt.launch$default(jz.AYXKKw(), Dispatchers.getMain(), null, new AndroidLifecyclePlugin$setup$1(this, null), 2, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.djBIcL.add(java.lang.Integer.valueOf(activity.hashCode()));
        C5216Je c5216Je = this.KWHzl;
        C5214Jc c5214Jc = null;
        if (c5216Je == null) {
            Intrinsics.gEmmrt("");
            c5216Je = null;
        }
        if (c5216Je.AEQbTJ().contains(AutocaptureOption.SCREEN_VIEWS)) {
            C5214Jc c5214Jc2 = this.OLrzqt;
            if (c5214Jc2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c5214Jc = c5214Jc2;
            }
            new JT(c5214Jc).OLrzqt(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!this.djBIcL.contains(java.lang.Integer.valueOf(activity.hashCode()))) {
            onActivityCreated(activity, activity.getIntent().getExtras());
        }
        this.gEmmrt.add(java.lang.Integer.valueOf(activity.hashCode()));
        C5216Je c5216Je = this.KWHzl;
        C5214Jc c5214Jc = null;
        if (c5216Je == null) {
            Intrinsics.gEmmrt("");
            c5216Je = null;
        }
        if (c5216Je.AEQbTJ().contains(AutocaptureOption.APP_LIFECYCLES) && this.gEmmrt.size() == 1) {
            C5214Jc c5214Jc2 = this.OLrzqt;
            if (c5214Jc2 == null) {
                Intrinsics.gEmmrt("");
                c5214Jc2 = null;
            }
            JT jt = new JT(c5214Jc2);
            android.content.pm.PackageInfo packageInfo = this.AhwBna;
            if (packageInfo == null) {
                Intrinsics.gEmmrt("");
                packageInfo = null;
            }
            jt.OLrzqt(packageInfo, this.EZpvd);
            this.EZpvd = false;
        }
        C5216Je c5216Je2 = this.KWHzl;
        if (c5216Je2 == null) {
            Intrinsics.gEmmrt("");
            c5216Je2 = null;
        }
        if (c5216Je2.AEQbTJ().contains(AutocaptureOption.DEEP_LINKS)) {
            C5214Jc c5214Jc3 = this.OLrzqt;
            if (c5214Jc3 == null) {
                Intrinsics.gEmmrt("");
                c5214Jc3 = null;
            }
            new JT(c5214Jc3).valueOf(activity);
        }
        C5216Je c5216Je3 = this.KWHzl;
        if (c5216Je3 == null) {
            Intrinsics.gEmmrt("");
            c5216Je3 = null;
        }
        if (c5216Je3.AEQbTJ().contains(AutocaptureOption.SCREEN_VIEWS)) {
            C5214Jc c5214Jc4 = this.OLrzqt;
            if (c5214Jc4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c5214Jc = c5214Jc4;
            }
            new JT(c5214Jc).AYXKKw(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        C5214Jc c5214Jc = this.OLrzqt;
        C5214Jc c5214Jc2 = null;
        if (c5214Jc == null) {
            Intrinsics.gEmmrt("");
            c5214Jc = null;
        }
        c5214Jc.AEQbTJ(Companion.KWHzl());
        C5216Je c5216Je = this.KWHzl;
        if (c5216Je == null) {
            Intrinsics.gEmmrt("");
            c5216Je = null;
        }
        if (c5216Je.AEQbTJ().contains(AutocaptureOption.ELEMENT_INTERACTIONS)) {
            C5214Jc c5214Jc3 = this.OLrzqt;
            if (c5214Jc3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c5214Jc2 = c5214Jc3;
            }
            new JT(c5214Jc2).KWHzl(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        C5214Jc c5214Jc = this.OLrzqt;
        C5214Jc c5214Jc2 = null;
        if (c5214Jc == null) {
            Intrinsics.gEmmrt("");
            c5214Jc = null;
        }
        c5214Jc.KWHzl(Companion.KWHzl());
        C5216Je c5216Je = this.KWHzl;
        if (c5216Je == null) {
            Intrinsics.gEmmrt("");
            c5216Je = null;
        }
        if (c5216Je.AEQbTJ().contains(AutocaptureOption.ELEMENT_INTERACTIONS)) {
            C5214Jc c5214Jc3 = this.OLrzqt;
            if (c5214Jc3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c5214Jc2 = c5214Jc3;
            }
            new JT(c5214Jc2).AEQbTJ(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.gEmmrt.remove(java.lang.Integer.valueOf(activity.hashCode()));
        C5216Je c5216Je = this.KWHzl;
        C5214Jc c5214Jc = null;
        if (c5216Je == null) {
            Intrinsics.gEmmrt("");
            c5216Je = null;
        }
        if (c5216Je.AEQbTJ().contains(AutocaptureOption.APP_LIFECYCLES) && this.gEmmrt.isEmpty()) {
            C5214Jc c5214Jc2 = this.OLrzqt;
            if (c5214Jc2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c5214Jc = c5214Jc2;
            }
            new JT(c5214Jc).OLrzqt();
            this.EZpvd = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.djBIcL.remove(java.lang.Integer.valueOf(activity.hashCode()));
        C5216Je c5216Je = this.KWHzl;
        C5214Jc c5214Jc = null;
        if (c5216Je == null) {
            Intrinsics.gEmmrt("");
            c5216Je = null;
        }
        if (c5216Je.AEQbTJ().contains(AutocaptureOption.SCREEN_VIEWS)) {
            C5214Jc c5214Jc2 = this.OLrzqt;
            if (c5214Jc2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c5214Jc = c5214Jc2;
            }
            new JT(c5214Jc).copydefault(activity);
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final long KWHzl() {
            return java.lang.System.currentTimeMillis();
        }
    }
}
