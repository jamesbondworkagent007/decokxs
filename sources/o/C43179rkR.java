package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.mlnservice.utils.GrowthIMBridgeHelper$getIMGroupUnreadCount$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.InterfaceC35180nqU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rkR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43179rkR {
    public static Job KWHzl;
    public static final C43179rkR OLrzqt = new C43179rkR();
    public static final int EZpvd = 8;

    private C43179rkR() {
    }

    public final void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        copydefault();
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU == null) {
            return;
        }
        KWHzl = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new GrowthIMBridgeHelper$getIMGroupUnreadCount$1(abstractActivityC33041mov, interfaceC35180nqU, str, function1, null), 3, null);
    }

    public final void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            InterfaceC35180nqU.ActionBar.startChatActivity$default(interfaceC35180nqU, abstractActivityC33041mov, str, null, null, null, null, null, 124, null);
        }
    }

    public final void copydefault() {
        Job job = KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        KWHzl = null;
    }
}
