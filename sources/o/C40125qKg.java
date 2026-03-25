package o;

import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qKg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40125qKg extends C40512qYp {
    public C40125qKg(@NotNull DexChainGroupVo dexChainGroupVo, @NotNull C41421qqW c41421qqW) {
        Intrinsics.checkNotNullParameter(dexChainGroupVo, "");
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        register(C40128qKj.class, new qJY(dexChainGroupVo, c41421qqW));
    }
}
