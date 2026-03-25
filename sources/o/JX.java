package o;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.amplitude.common.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JX {
    public ConnectivityManager.NetworkCallback AEQbTJ;
    public TaskDescription KWHzl;
    public final Logger OLrzqt;
    public final android.content.Context copydefault;

    public interface TaskDescription {
        void AEQbTJ();

        void OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.KWHzl = taskDescription;
    }

    public JX(@NotNull android.content.Context context, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.copydefault = context;
        this.OLrzqt = logger;
    }

    public final void AEQbTJ() {
        try {
            OLrzqt();
        } catch (java.lang.Throwable th) {
            this.OLrzqt.KWHzl("Error starting network listener: " + th.getMessage());
        }
    }

    public final void OLrzqt() {
        java.lang.Object systemService = this.copydefault.getSystemService("connectivity");
        Intrinsics.copydefault(systemService, "");
        android.net.NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
        ActionBar actionBar = new ActionBar();
        this.AEQbTJ = actionBar;
        Intrinsics.copydefault(actionBar);
        ((android.net.ConnectivityManager) systemService).registerNetworkCallback(networkRequestBuild, actionBar);
    }

    public static final class ActionBar extends ConnectivityManager.NetworkCallback {
        public ActionBar() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull android.net.Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            TaskDescription taskDescription = JX.this.KWHzl;
            if (taskDescription != null) {
                taskDescription.OLrzqt();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull android.net.Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            TaskDescription taskDescription = JX.this.KWHzl;
            if (taskDescription != null) {
                taskDescription.AEQbTJ();
            }
        }
    }
}
