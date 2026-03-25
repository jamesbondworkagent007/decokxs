package o;

import androidx.activity.result.ActivityResultCaller;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC30608leP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ldw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30588ldw extends wXX {
    public final Unit OLrzqt(@NotNull InterfaceC30619lea interfaceC30619lea) {
        Intrinsics.checkNotNullParameter(interfaceC30619lea, "");
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC30608leP interfaceC30608leP = parentFragment instanceof InterfaceC30608leP ? (InterfaceC30608leP) parentFragment : null;
        if (interfaceC30608leP == null) {
            return null;
        }
        InterfaceC30608leP.ActionBar.trackEvent$default(interfaceC30608leP, interfaceC30619lea, null, 2, null);
        return Unit.INSTANCE;
    }

    public final Unit OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC30608leP interfaceC30608leP = parentFragment instanceof InterfaceC30608leP ? (InterfaceC30608leP) parentFragment : null;
        if (interfaceC30608leP == null) {
            return null;
        }
        InterfaceC30608leP.ActionBar.trackView$default(interfaceC30608leP, str, null, 2, null);
        return Unit.INSTANCE;
    }
}
