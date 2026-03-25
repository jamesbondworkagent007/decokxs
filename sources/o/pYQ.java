package o;

import com.okinc.market.discover.features.filter.data.model.TokenGroupVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pYQ extends C40512qYp {
    public pYQ(@NotNull pYC pyc) {
        Intrinsics.checkNotNullParameter(pyc, "");
        register(TokenGroupVo.class, new pYR(pyc));
    }
}
