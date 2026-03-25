package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface rDG {
    void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull OKComplianceRestrictionService.Feature feature, yHO<? super java.lang.Boolean, ? super java.lang.Boolean, ? super FeatureRestrictionInfo, Unit> yho);

    void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull Function0<Unit> function0);
}
