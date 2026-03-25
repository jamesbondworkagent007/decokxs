package o;

import com.okinc.unify_trade.biz.MpCategory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vnv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51488vnv implements InterfaceC47982uAp {
    public static final int copydefault = MpCategory.$stable;
    public final MpCategory EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpCategory AEQbTJ() {
        return this.EZpvd;
    }

    public C51488vnv(@NotNull MpCategory mpCategory) {
        Intrinsics.checkNotNullParameter(mpCategory, "");
        this.EZpvd = mpCategory;
    }

    /* JADX DEBUG: Method merged with bridge method: getFragment(Ljava/lang/Object;)Landroidx/fragment/app/Fragment; */
    @Override // o.InterfaceC47982uAp
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C51408vmU getFragment(java.lang.Object obj) {
        return C51408vmU.Companion.AEQbTJ(this.EZpvd);
    }
}
