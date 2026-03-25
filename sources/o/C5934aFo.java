package o;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import com.okinc.auth.api.passkey.PasskeyManagementRequest;
import com.okinc.auth.api.passkey.PasskeyManagementState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5934aFo implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        ComponentActivity componentActivity = context instanceof ComponentActivity ? (ComponentActivity) context : null;
        if (componentActivity == null) {
            pUU.copydefault("PasskeyDeeplinkHandler", "Context is not a ComponentActivity, cannot execute deeplink");
        } else {
            componentActivity.getActivityResultRegistry().register(C5934aFo.class.getSimpleName(), ((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).valueOf(), new ActivityResultCallback() { // from class: o.aFm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    C5934aFo.KWHzl((PasskeyManagementState) obj);
                }
            }).launch(new PasskeyManagementRequest(false, false));
        }
    }

    public static final void KWHzl(PasskeyManagementState passkeyManagementState) {
        pUU.KWHzl("PasskeyDeeplinkHandler", "passkeyManagementState: " + passkeyManagementState);
    }
}
