package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58027ytY;
import o.C58093yul;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58098yuq extends yBS<java.lang.Long> {
    public final C58093yul.StateListAnimator OLrzqt;

    @Override // o.InterfaceC60097zve
    public void onComplete() {
    }

    @Override // o.InterfaceC60097zve
    public /* synthetic */ void onNext(java.lang.Object obj) {
        EZpvd(((java.lang.Number) obj).longValue());
    }

    public C58098yuq(@NotNull C58093yul.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.OLrzqt = stateListAnimator;
    }

    public void EZpvd(long j) {
        this.OLrzqt.AEQbTJ(AbstractC58027ytY.TaskDescription.OLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Throwable;)V */
    @Override // o.InterfaceC60097zve
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Void onError(@NotNull java.lang.Throwable th) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(th, "");
        throw th;
    }
}
