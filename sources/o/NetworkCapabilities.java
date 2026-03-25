package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.LocalSocket;
import o.Network;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkCapabilities {
    public static final java.util.Map<java.lang.String, Function2<Network.TaskDescription, BX, Unit>> AEQbTJ = C56424yEw.KWHzl();

    public static final Network AEQbTJ(@NotNull LocalSocket.TaskDescription taskDescription, @NotNull BX bx) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(bx, "");
        Network.Application application = Network.copydefault;
        Network.TaskDescription taskDescription2 = new Network.TaskDescription();
        taskDescription2.KWHzl(taskDescription.isConnected());
        copydefault(taskDescription2, taskDescription, bx);
        DL dlGEmmrt = taskDescription.gEmmrt();
        taskDescription2.OLrzqt(dlGEmmrt != null ? dlGEmmrt.toString() : null);
        Function2<Network.TaskDescription, BX, Unit> function2 = AEQbTJ.get((java.lang.String) C58108yv.OLrzqt(bx.OLrzqt(), C57578yl.EZpvd.copydefault()));
        if (function2 != null) {
            function2.invoke(taskDescription2, bx);
        }
        return taskDescription2.AEQbTJ();
    }

    public static final void copydefault(Network.TaskDescription taskDescription, LocalSocket.TaskDescription taskDescription2, BX bx) {
        taskDescription.OLrzqt(java.lang.Boolean.valueOf(taskDescription2.AuCTel()));
        taskDescription.AEQbTJ(java.lang.Boolean.valueOf(taskDescription2.fJNWhG()));
    }
}
