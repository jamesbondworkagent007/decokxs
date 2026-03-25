package o;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import o.C34733nhs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nhq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34731nhq {
    public static final C34731nhq copydefault = new C34731nhq();
    public static final java.util.Set<java.lang.String> EZpvd = new LinkedHashSet();
    public static final int KWHzl = 8;

    private C34731nhq() {
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C34733nhs.ActionBar actionBar = C34733nhs.Companion;
        C34733nhs.StateListAnimator stateListAnimatorKWHzl = actionBar.KWHzl();
        if (stateListAnimatorKWHzl != null) {
            stateListAnimatorKWHzl.EZpvd("DynamicFeatureManager", "register module: " + str);
        }
        java.util.Set<java.lang.String> set = EZpvd;
        if (set.contains(str)) {
            C34733nhs.StateListAnimator stateListAnimatorKWHzl2 = actionBar.KWHzl();
            if (stateListAnimatorKWHzl2 != null) {
                stateListAnimatorKWHzl2.EZpvd("DynamicFeatureManager", "Module " + str + " already registered");
            }
            return true;
        }
        try {
            java.lang.Class.forName("com.okinc.dynamicfeature." + str + ".autoregister.AutoRegister").getMethod("registerModule", java.lang.String.class).invoke(null, str);
            set.add(str);
            return true;
        } catch (java.lang.Exception e) {
            C34733nhs.StateListAnimator stateListAnimatorKWHzl3 = C34733nhs.Companion.KWHzl();
            if (stateListAnimatorKWHzl3 != null) {
                stateListAnimatorKWHzl3.EZpvd("DynamicFeatureManager", "Register for module " + str + " failed", e);
            }
            return false;
        }
    }
}
