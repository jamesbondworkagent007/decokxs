package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pDY {
    public static final pDY copydefault = new pDY();

    private pDY() {
    }

    public final boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.checkSelfPermission(context, "android.permission.WRITE_CALENDAR") == 0;
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(android.net.Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        } catch (java.lang.Exception e) {
            pUU.copydefault("KlineCalendarPermissionHelper", "Failed to open app settings" + e.getMessage());
        }
    }

    public final ActivityResultLauncher<java.lang.String[]> copydefault(@NotNull final androidx.fragment.app.Fragment fragment, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @NotNull final Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        ActivityResultLauncher<java.lang.String[]> activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: o.pDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                pDY.KWHzl(function0, fragment, function03, function02, (java.util.Map) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void KWHzl(Function0 function0, androidx.fragment.app.Fragment fragment, Function0 function02, Function0 function03, java.util.Map map) {
        Intrinsics.copydefault(map);
        if (!map.isEmpty()) {
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!((java.lang.Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    FragmentActivity activity = fragment.getActivity();
                    if (activity != null) {
                        if (!ActivityCompat.shouldShowRequestPermissionRationale(activity, (java.lang.String) CollectionsKt___CollectionsKt.dNCPSb(map.keySet()))) {
                            function02.invoke();
                            return;
                        } else {
                            function03.invoke();
                            return;
                        }
                    }
                    function03.invoke();
                    return;
                }
            }
        }
        function0.invoke();
    }

    public final void EZpvd(@NotNull ActivityResultLauncher<java.lang.String[]> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        activityResultLauncher.unregister();
    }

    public final void copydefault(@NotNull androidx.fragment.app.Fragment fragment, @NotNull ActivityResultLauncher<java.lang.String[]> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        java.lang.String[] strArr = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
        for (int i = 0; i < 2; i++) {
            if (ContextCompat.checkSelfPermission(fragment.requireContext(), strArr[i]) != 0) {
                activityResultLauncher.launch(strArr);
                return;
            }
        }
    }
}
