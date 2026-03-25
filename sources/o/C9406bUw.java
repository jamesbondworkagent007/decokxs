package o;

import com.okinc.business.defi.api.model.tx.signdata.KaspaMessageSignData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bUw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9406bUw extends AbstractC12442cmy {
    public final C9319bTO copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9406bUw(@NotNull C9319bTO c9319bTO) {
        super(c9319bTO);
        Intrinsics.checkNotNullParameter(c9319bTO, "");
        this.copydefault = c9319bTO;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54888xZa.copydefault.EZpvd(str, ((KaspaMessageSignData) this.copydefault.QVsKAR()).getData());
    }
}
