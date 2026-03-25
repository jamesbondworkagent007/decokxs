package o;

import com.okinc.unify_trade.biz.MpCategory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vtb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51786vtb implements InterfaceC47982uAp {
    public static final int OLrzqt = MpCategory.$stable;
    public final MpCategory EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpCategory AEQbTJ() {
        return this.EZpvd;
    }

    public C51786vtb(@NotNull MpCategory mpCategory) {
        Intrinsics.checkNotNullParameter(mpCategory, "");
        this.EZpvd = mpCategory;
    }

    /* JADX DEBUG: Method merged with bridge method: getFragment(Ljava/lang/Object;)Landroidx/fragment/app/Fragment; */
    @Override // o.InterfaceC47982uAp
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C51415vmb getFragment(java.lang.Object obj) {
        return C51415vmb.Companion.KWHzl(this.EZpvd);
    }
}
