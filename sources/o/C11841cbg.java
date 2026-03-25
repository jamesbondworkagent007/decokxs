package o;

import com.okinc.business.defi.api.model.tx.signdata.StarkNetMessageSignData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11841cbg extends AbstractC12442cmy {
    public final C11761caF EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11841cbg(@NotNull C11761caF c11761caF) {
        super(c11761caF);
        Intrinsics.checkNotNullParameter(c11761caF, "");
        this.EZpvd = c11761caF;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54897xZj.EZpvd.OLrzqt(str, ((StarkNetMessageSignData) this.EZpvd.QVsKAR()).getData());
    }
}
