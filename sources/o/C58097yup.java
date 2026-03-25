package o;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58027ytY;
import o.C58093yul;
import o.InterfaceC58028ytZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yup, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58097yup extends yBS<InterfaceC58028ytZ.StateListAnimator> {
    public final C58093yul.StateListAnimator AEQbTJ;
    public final AtomicInteger copydefault;

    public C58097yup(@NotNull C58093yul.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.AEQbTJ = stateListAnimator;
        this.copydefault = new AtomicInteger();
    }

    @Override // o.yBS
    public void OLrzqt() {
        OLrzqt(1L);
    }

    /* JADX DEBUG: Method merged with bridge method: onNext(Ljava/lang/Object;)V */
    @Override // o.InterfaceC60097zve
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onNext(@NotNull InterfaceC58028ytZ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (this.copydefault.decrementAndGet() < 0) {
            this.copydefault.set(0);
        }
        this.AEQbTJ.AEQbTJ(new AbstractC58027ytY.StateListAnimator.Activity(stateListAnimator));
    }

    @Override // o.InterfaceC60097zve
    public void onComplete() {
        this.AEQbTJ.AEQbTJ(AbstractC58027ytY.StateListAnimator.TaskDescription.AEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Throwable;)V */
    @Override // o.InterfaceC60097zve
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Void onError(@NotNull java.lang.Throwable th) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(th, "");
        throw th;
    }

    public final void KWHzl() {
        if (this.copydefault.get() == 0) {
            this.copydefault.incrementAndGet();
            OLrzqt(1L);
        }
    }
}
