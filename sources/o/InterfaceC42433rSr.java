package o;

import androidx.activity.result.ActivityResultLauncher;
import com.okinc.ok_kyc_core.data.amani.AmaniNFCParams;
import com.okinc.ok_kyc_core.data.amani.AmaniVideoCallParams;
import com.okinc.ok_kyc_core_api.amani.AmaniUiModel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rSr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC42433rSr extends InterfaceC43217rlC {
    public static final TaskDescription Companion = TaskDescription.KWHzl;

    AmaniUiModel EZpvd(android.content.Intent intent);

    void EZpvd(@NotNull android.app.Activity activity, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void EZpvd(@NotNull android.content.Context context, @NotNull AmaniNFCParams amaniNFCParams, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    void copydefault(@NotNull android.content.Context context, @NotNull AmaniVideoCallParams amaniVideoCallParams, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    /* JADX INFO: renamed from: o.rSr$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }
}
