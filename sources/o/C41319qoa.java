package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qoa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41319qoa extends C40512qYp {
    public C41319qoa(@NotNull CategoryGroupVo categoryGroupVo, @NotNull C41407qqI c41407qqI, @NotNull C41524qsT c41524qsT, @NotNull C41216qmd c41216qmd) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(c41407qqI, "");
        Intrinsics.checkNotNullParameter(c41524qsT, "");
        Intrinsics.checkNotNullParameter(c41216qmd, "");
        register(C41325qog.class, new C41258qnS(c41407qqI, categoryGroupVo));
        register(C41334qop.class, new C41257qnR(categoryGroupVo, c41524qsT, c41216qmd));
    }
}
