package o;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C25649jBf {
    public final android.util.LruCache<java.lang.String, java.util.List<CommonGroupData>> copydefault = new android.util.LruCache<>(20);
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.util.LruCache<java.lang.String, java.util.List<CommonGroupData>> copydefault() {
        return this.copydefault;
    }

    @yCM
    public C25649jBf() {
    }

    /* JADX INFO: renamed from: o.jBf$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jBf.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<CommonGroupData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.put(str, list);
    }
}
