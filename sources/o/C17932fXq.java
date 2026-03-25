package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC17931fXp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fXq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17932fXq extends AbstractC17931fXp {
    public java.util.HashMap<AbstractC17931fXp.StateListAnimator, java.lang.Boolean> EZpvd = new java.util.HashMap<>();

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(new AbstractC17931fXp.StateListAnimator.C0846StateListAnimator(str));
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(new AbstractC17931fXp.StateListAnimator.C0846StateListAnimator(str));
    }

    public boolean EZpvd(@NotNull AbstractC17931fXp.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        java.lang.Boolean bool = this.EZpvd.get(stateListAnimator);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // o.AbstractC17931fXp
    public void copydefault(@NotNull AbstractC17931fXp.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.EZpvd.put(stateListAnimator, java.lang.Boolean.FALSE);
    }
}
