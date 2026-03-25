package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qde, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40740qde extends C40512qYp {
    public C40740qde(@NotNull CategoryGroupVo categoryGroupVo, @NotNull C41465qrN c41465qrN, @NotNull C41216qmd c41216qmd) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(c41465qrN, "");
        Intrinsics.checkNotNullParameter(c41216qmd, "");
        register(C40752qdq.class, new C40682qcZ(categoryGroupVo, c41465qrN, c41216qmd));
    }
}
