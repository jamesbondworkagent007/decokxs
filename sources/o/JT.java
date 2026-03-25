package o;

import android.content.pm.PackageManager;
import android.view.Window;
import com.amplitude.android.utilities.DefaultEventUtils$startFragmentViewedEventTracking$1;
import com.amplitude.android.utilities.DefaultEventUtils$startUserInteractionEventTracking$1$1;
import com.amplitude.android.utilities.DefaultEventUtils$trackAppUpdatedInstalledEvent$1;
import com.amplitude.core.Storage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C5240Kc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JT {
    public static final Activity Companion = new Activity(null);
    public final C5214Jc OLrzqt;
    public final InterfaceC56387yDm copydefault;

    public JT(@NotNull C5214Jc c5214Jc) {
        Intrinsics.checkNotNullParameter(c5214Jc, "");
        this.OLrzqt = c5214Jc;
        this.copydefault = C56392yDr.copydefault(new Function0<java.lang.Boolean>() { // from class: com.amplitude.android.utilities.DefaultEventUtils$isFragmentActivityAvailable$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(C5240Kc.EZpvd.OLrzqt("androidx.fragment.app.FragmentActivity", this.this$0.OLrzqt.DbNXlk()));
            }
        });
    }

    public final void AEQbTJ(@NotNull android.content.pm.PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "");
        java.lang.String str = packageInfo.versionName;
        java.lang.String string = JW.AEQbTJ(packageInfo).toString();
        Storage storageFIwbmz = this.OLrzqt.fIwbmz();
        java.lang.String strCopydefault = storageFIwbmz.copydefault(Storage.Constants.APP_VERSION);
        java.lang.String strCopydefault2 = storageFIwbmz.copydefault(Storage.Constants.APP_BUILD);
        if (strCopydefault2 == null) {
            JZ.track$default(this.OLrzqt, "[Amplitude] Application Installed", C56424yEw.gEmmrt(C56390yDp.OLrzqt("[Amplitude] Version", str), C56390yDp.OLrzqt("[Amplitude] Build", string)), (C5247Kj) null, 4, (java.lang.Object) null);
        } else if (!Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) strCopydefault2)) {
            JZ.track$default(this.OLrzqt, "[Amplitude] Application Updated", C56424yEw.gEmmrt(C56390yDp.OLrzqt("[Amplitude] Previous Version", strCopydefault), C56390yDp.OLrzqt("[Amplitude] Previous Build", strCopydefault2), C56390yDp.OLrzqt("[Amplitude] Version", str), C56390yDp.OLrzqt("[Amplitude] Build", string)), (C5247Kj) null, 4, (java.lang.Object) null);
        }
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt.AYXKKw(), this.OLrzqt.fJNWhG(), null, new DefaultEventUtils$trackAppUpdatedInstalledEvent$1(storageFIwbmz, str, string, null), 2, null);
    }

    public final void OLrzqt(@NotNull android.content.pm.PackageInfo packageInfo, boolean z) {
        Intrinsics.checkNotNullParameter(packageInfo, "");
        JZ.track$default(this.OLrzqt, "[Amplitude] Application Opened", C56424yEw.gEmmrt(C56390yDp.OLrzqt("[Amplitude] From Background", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("[Amplitude] Version", packageInfo.versionName), C56390yDp.OLrzqt("[Amplitude] Build", JW.AEQbTJ(packageInfo).toString())), (C5247Kj) null, 4, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        JZ.track$default(this.OLrzqt, "[Amplitude] Application Backgrounded", (java.util.Map) null, (C5247Kj) null, 6, (java.lang.Object) null);
    }

    public final void valueOf(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        android.content.Intent intent = activity.getIntent();
        if (intent != null) {
            android.net.Uri uriEZpvd = EZpvd(activity);
            java.lang.String string = uriEZpvd != null ? uriEZpvd.toString() : null;
            android.net.Uri data = intent.getData();
            if (data != null) {
                java.lang.String string2 = data.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                JZ.track$default(this.OLrzqt, "[Amplitude] Deep Link Opened", C56424yEw.gEmmrt(C56390yDp.OLrzqt("[Amplitude] Link URL", string2), C56390yDp.OLrzqt("[Amplitude] Link Referrer", string)), (C5247Kj) null, 4, (java.lang.Object) null);
            }
        }
    }

    public final void AYXKKw(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        try {
            JZ.track$default(this.OLrzqt, "[Amplitude] Screen Viewed", C56423yEv.EZpvd(C56390yDp.OLrzqt("[Amplitude] Screen Name", Companion.AEQbTJ(activity))), (C5247Kj) null, 4, (java.lang.Object) null);
        } catch (PackageManager.NameNotFoundException e) {
            this.OLrzqt.DbNXlk().EZpvd("Failed to get activity info: " + e);
        } catch (java.lang.Exception e2) {
            this.OLrzqt.DbNXlk().EZpvd("Failed to track screen viewed event: " + e2);
        }
    }

    public final void KWHzl(@NotNull android.app.Activity activity) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "");
        android.view.Window window = activity.getWindow();
        if (window != null) {
            Window.Callback callback = window.getCallback();
            if (callback == null) {
                callback = new WindowCallbackC5228Jq();
            } else {
                Intrinsics.checkNotNullExpressionValue(callback, "");
            }
            window.setCallback(new C5223Jl(callback, activity, new DefaultEventUtils$startUserInteractionEventTracking$1$1(this.OLrzqt), C5232Ju.OLrzqt.AEQbTJ().invoke(this.OLrzqt.DbNXlk()), this.OLrzqt.DbNXlk(), null, null, null, 224, null));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.OLrzqt.DbNXlk().EZpvd("Failed to track user interaction event: Activity window is null");
        }
    }

    public final void AEQbTJ(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        android.view.Window window = activity.getWindow();
        if (window != null) {
            Window.Callback callback = window.getCallback();
            C5223Jl c5223Jl = callback instanceof C5223Jl ? (C5223Jl) callback : null;
            if (c5223Jl != null) {
                Window.Callback callbackKWHzl = c5223Jl.KWHzl();
                window.setCallback(java.lang.Boolean.valueOf(callbackKWHzl instanceof WindowCallbackC5228Jq).booleanValue() ? null : callbackKWHzl);
                return;
            }
            return;
        }
        this.OLrzqt.DbNXlk().EZpvd("Failed to stop user interaction event tracking: Activity window is null");
    }

    public final boolean KWHzl() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public final void OLrzqt(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (KWHzl()) {
            C5226Jo.copydefault.copydefault(activity, new DefaultEventUtils$startFragmentViewedEventTracking$1(this.OLrzqt), this.OLrzqt.DbNXlk());
        }
    }

    public final void copydefault(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (KWHzl()) {
            C5226Jo.copydefault.AEQbTJ(activity, this.OLrzqt.DbNXlk());
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String AEQbTJ(@NotNull android.app.Activity activity) {
            java.lang.CharSequence charSequenceLoadLabel;
            java.lang.String string;
            Intrinsics.checkNotNullParameter(activity, "");
            android.content.pm.PackageManager packageManager = activity.getPackageManager();
            android.content.pm.ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(activity.getComponentName(), 128) : null;
            if (activityInfo != null && (charSequenceLoadLabel = activityInfo.loadLabel(packageManager)) != null && (string = charSequenceLoadLabel.toString()) != null) {
                return string;
            }
            if (activityInfo != null) {
                return activityInfo.name;
            }
            return null;
        }
    }

    public final android.net.Uri EZpvd(android.app.Activity activity) {
        return activity.getReferrer();
    }
}
