package o;

import com.okinc.affiliate.bean.AffiliateIMActionType;
import com.okinc.affiliate.bean.AffiliateIMPermission;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.axh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8171axh extends InterfaceC43216rlB {
    AbstractC58185ywX<AffiliateIMPermission> EZpvd();

    void EZpvd(@NotNull android.app.Activity activity, int i, @NotNull java.util.ArrayList<java.lang.String> arrayList);

    AbstractC58185ywX<java.lang.Boolean> KWHzl();

    void KWHzl(@NotNull android.app.Activity activity, @NotNull AffiliateIMActionType affiliateIMActionType);

    /* JADX INFO: renamed from: o.axh$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        public static /* synthetic */ void navAffiliateIMDataSelect$default(InterfaceC8171axh interfaceC8171axh, android.app.Activity activity, AffiliateIMActionType affiliateIMActionType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navAffiliateIMDataSelect");
            }
            if ((i & 2) != 0) {
                affiliateIMActionType = AffiliateIMActionType.GroupChat;
            }
            interfaceC8171axh.KWHzl(activity, affiliateIMActionType);
        }
    }
}
