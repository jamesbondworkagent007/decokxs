package o;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59999ztb implements yIO<LifecycleOwner, C60060zuj> {
    public final ComponentActivity AEQbTJ;
    public final C60022zty EZpvd;
    public final Function1<C60022zty, C60060zuj> KWHzl;
    public C60060zuj OLrzqt;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, o.yJA] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yIO
    public /* synthetic */ C60060zuj getValue(LifecycleOwner lifecycleOwner, yJA yja) {
        return AEQbTJ(lifecycleOwner, (yJA<?>) yja);
    }

    public C60060zuj AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull yJA<?> yja) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(yja, "");
        C60060zuj c60060zuj = this.OLrzqt;
        if (c60060zuj != null) {
            Intrinsics.copydefault(c60060zuj);
            return c60060zuj;
        }
        if (!AEQbTJ(lifecycleOwner)) {
            throw new java.lang.IllegalStateException(("can't get Scope for " + this.AEQbTJ + " - LifecycleOwner is not Active").toString());
        }
        C60060zuj c60060zujOLrzqt = this.EZpvd.OLrzqt(C59973ztB.OLrzqt(this.AEQbTJ).EZpvd());
        if (c60060zujOLrzqt == null) {
            c60060zujOLrzqt = this.KWHzl.invoke(this.EZpvd);
        }
        this.OLrzqt = c60060zujOLrzqt;
        this.EZpvd.KWHzl().EZpvd("got scope: " + this.OLrzqt + " for " + this.AEQbTJ);
        C60060zuj c60060zuj2 = this.OLrzqt;
        Intrinsics.copydefault(c60060zuj2);
        return c60060zuj2;
    }

    public final boolean AEQbTJ(LifecycleOwner lifecycleOwner) {
        return lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }
}
