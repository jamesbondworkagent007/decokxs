package o;

import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mIc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C31901mIc<B extends ViewDataBinding> extends C43312rms<B> {
    public final mHV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mHV EZpvd() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31901mIc(@NotNull B b, mHV mhv) {
        super(b.getRoot(), b);
        Intrinsics.checkNotNullParameter(b, "");
        this.copydefault = mhv;
    }
}
