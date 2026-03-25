package o;

import com.amplitude.common.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JO {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final Logger AEQbTJ;
    public final android.content.Context EZpvd;
    public boolean OLrzqt;
    public final boolean copydefault;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public JO(@NotNull android.content.Context context, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.EZpvd = context;
        this.AEQbTJ = logger;
        this.OLrzqt = true;
        boolean zEZpvd = EZpvd(context, "android.permission.ACCESS_NETWORK_STATE");
        this.copydefault = zEZpvd;
        if (zEZpvd) {
            return;
        }
        logger.KWHzl("No ACCESS_NETWORK_STATE permission, offline mode is not supported. To enable, add <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" /> to your AndroidManifest.xml. Learn more at https://www.docs.developers.amplitude.com/data/sdks/android-kotlin/#offline-mode");
    }

    public final boolean KWHzl() {
        android.net.NetworkCapabilities networkCapabilities;
        if (!this.copydefault) {
            return true;
        }
        try {
            java.lang.Object systemService = this.EZpvd.getSystemService("connectivity");
            if (!(systemService instanceof android.net.ConnectivityManager)) {
                this.AEQbTJ.OLrzqt("Service is not an instance of ConnectivityManager. Offline mode is not supported");
                return true;
            }
            if (this.OLrzqt) {
                android.net.Network activeNetwork = ((android.net.ConnectivityManager) systemService).getActiveNetwork();
                if (activeNetwork == null || (networkCapabilities = ((android.net.ConnectivityManager) systemService).getNetworkCapabilities(activeNetwork)) == null) {
                    return false;
                }
                if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0)) {
                    return false;
                }
                return true;
            }
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) systemService).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        } catch (java.lang.Throwable th) {
            this.AEQbTJ.KWHzl("Error checking network connectivity: " + th.getMessage());
            this.AEQbTJ.KWHzl(C56379yDe.AEQbTJ(th));
            return true;
        }
    }

    public final boolean EZpvd(android.content.Context context, java.lang.String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
