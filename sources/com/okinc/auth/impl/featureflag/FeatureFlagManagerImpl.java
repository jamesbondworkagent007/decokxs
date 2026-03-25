package com.okinc.auth.impl.featureflag;

import com.okinc.components.track.ABTestManager;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43215rlA;
import o.C43251rlk;
import o.C56391yDq;
import o.InterfaceC5687aBF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FeatureFlagManagerImpl extends AbstractC43215rlA implements InterfaceC5687aBF {
    @Override // o.InterfaceC5687aBF
    public boolean copydefault(@NotNull FeatureFlag featureFlag, boolean z) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(featureFlag, "");
        ABTestManager aBTestManager = ABTestManager.AEQbTJ;
        String value$default = ABTestManager.getValue$default(aBTestManager, featureFlag.getKey(), null, 2, null);
        if (value$default == null || value$default.length() == 0) {
            return z;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(Boolean.valueOf(Intrinsics.EZpvd((Object) ABTestManager.getValue$default(aBTestManager, featureFlag.getKey(), null, 2, null), (Object) featureFlag.getTreatment())));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = Boolean.valueOf(z);
        }
        return ((Boolean) objM7377constructorimpl).booleanValue();
    }

    public static final class Module {
        public static final Module copydefault = new Module();

        private Module() {
        }

        public final InterfaceC5687aBF KWHzl() {
            return (InterfaceC5687aBF) C43251rlk.copydefault(InterfaceC5687aBF.class);
        }
    }
}
