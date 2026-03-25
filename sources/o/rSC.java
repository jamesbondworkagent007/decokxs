package o;

import androidx.activity.result.ActivityResultLauncher;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public interface rSC extends InterfaceC43217rlC {
    public static final ActionBar Companion = ActionBar.OLrzqt;

    void KWHzl(@NotNull android.content.Context context, VendorConfig vendorConfig, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.Integer> list, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, ActivityResultLauncher<android.content.Intent> activityResultLauncher2);

    void KWHzl(FacialExtParams facialExtParams);

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
        }
    }
}
