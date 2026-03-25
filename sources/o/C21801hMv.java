package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hMv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21801hMv extends AbstractC21793hMn {
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC21793hMn
    public java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21801hMv(@NotNull OrderDetailResult orderDetailResult, @NotNull java.lang.String str) {
        super(orderDetailResult);
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }
}
