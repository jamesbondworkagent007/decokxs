package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC4401Bcs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mfV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32538mfV {
    public static final C32538mfV copydefault = new C32538mfV();

    private C32538mfV() {
    }

    public final java.lang.String EZpvd(@NotNull AbstractC4401Bcs abstractC4401Bcs) {
        Intrinsics.checkNotNullParameter(abstractC4401Bcs, "");
        if (abstractC4401Bcs instanceof AbstractC4401Bcs.ActionBar) {
            return SubdomainStrategy.Auto.KWHzl.toString();
        }
        if (abstractC4401Bcs instanceof AbstractC4401Bcs.Activity) {
            return SubdomainStrategy.Global.INSTANCE.toString();
        }
        if (abstractC4401Bcs instanceof AbstractC4401Bcs.StateListAnimator) {
            return new SubdomainStrategy.Subdomain(((AbstractC4401Bcs.StateListAnimator) abstractC4401Bcs).EZpvd()).toString();
        }
        throw new NoWhenBranchMatchedException();
    }
}
