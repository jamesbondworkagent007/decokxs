package o;

import com.okinc.business.invest_biz.data.bean.InvestChip;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26551jeU extends C43316rmw {
    public C26551jeU(@NotNull Function1<? super InvestChip, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        register(InvestChip.class, new C26623jfn(function1));
    }
}
