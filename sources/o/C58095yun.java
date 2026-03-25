package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58027ytY;
import o.C58093yul;
import o.InterfaceC58092yuk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yun, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58095yun extends yBS<InterfaceC58092yuk.Activity> {
    public final C58093yul.StateListAnimator EZpvd;

    public C58095yun(@NotNull C58093yul.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.EZpvd = stateListAnimator;
    }

    /* JADX DEBUG: Method merged with bridge method: onNext(Ljava/lang/Object;)V */
    @Override // o.InterfaceC60097zve
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onNext(@NotNull InterfaceC58092yuk.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd.AEQbTJ(new AbstractC58027ytY.Application.TaskDescription(activity));
    }

    @Override // o.InterfaceC60097zve
    public void onComplete() {
        this.EZpvd.AEQbTJ(AbstractC58027ytY.Application.ActionBar.copydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Throwable;)V */
    @Override // o.InterfaceC60097zve
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Void onError(@NotNull java.lang.Throwable th) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(th, "");
        throw th;
    }
}
