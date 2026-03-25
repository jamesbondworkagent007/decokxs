package o;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jaf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26350jaf extends AbstractC27470jvm {
    public final Function2<C26356jal, InvestUserRewardElementInfo, Unit> OLrzqt;
    public final Function1<C26356jal, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super o.jal, ? super com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.jal, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26350jaf(@NotNull Function2<? super C26356jal, ? super InvestUserRewardElementInfo, Unit> function2, @NotNull Function1<? super C26356jal, Unit> function1) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function2;
        this.copydefault = function1;
        register(C26356jal.class, new iZY(function2, function1));
    }
}
