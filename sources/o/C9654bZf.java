package o;

import com.okinc.business.defi.api.model.tx.signdata.SolanaMessageSignData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bZf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9654bZf extends AbstractC12442cmy {
    public final C9476bWM EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9654bZf(@NotNull C9476bWM c9476bWM) {
        super(c9476bWM);
        Intrinsics.checkNotNullParameter(c9476bWM, "");
        this.EZpvd = c9476bWM;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54892xZe.KWHzl.copydefault(str, ((SolanaMessageSignData) this.EZpvd.QVsKAR()).getData());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54892xZe.KWHzl.AEQbTJ(str, ((SolanaMessageSignData) this.EZpvd.QVsKAR()).getData());
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C54892xZe.KWHzl.KWHzl(str, str2);
    }
}
