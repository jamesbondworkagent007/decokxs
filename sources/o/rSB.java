package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface rSB extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str);

    void EZpvd(@NotNull android.content.Context context, @NotNull VendorConfig vendorConfig, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, FacialExtParams facialExtParams);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, FacialExtParams facialExtParams);
}
