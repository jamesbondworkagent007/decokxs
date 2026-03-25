package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.deeplink.DeeplinkUtil$processData$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.baa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9702baa {
    public static final C9702baa copydefault = new C9702baa();

    private C9702baa() {
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull android.os.Bundle bundle, @NotNull C9708bag c9708bag, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(c9708bag, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        if (C22416heu.KWHzl(str)) {
            return;
        }
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        FragmentActivity fragmentActivity = activityOLrzqt instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt : null;
        if (fragmentActivity == null) {
            return;
        }
        bundle.putString("url", str);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new DeeplinkUtil$processData$1(str, fragmentActivity, bundle, c9708bag, interfaceC25414iwK, kkg, null), 3, null);
    }
}
