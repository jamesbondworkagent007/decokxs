package o;

import com.okinc.components.track.ABTestManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.pOz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38174pOz {
    public static final C38174pOz copydefault = new C38174pOz();

    private C38174pOz() {
    }

    public final boolean EZpvd() {
        ABTestManager aBTestManager = ABTestManager.AEQbTJ;
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(aBTestManager, "lifecycle_ok_core_switch", null, 2, null), (java.lang.Object) "true") && (C33129mqd.AhwBna(ABTestManager.getValue$default(aBTestManager, "kyc_feature_restriction_ok_core_switch", null, 2, null)) >= 1);
    }
}
