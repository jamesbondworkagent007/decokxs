package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hMs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21798hMs extends AbstractC21793hMn {
    public final java.lang.String EZpvd;
    public Function0<Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC21793hMn
    public java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21798hMs(@NotNull OrderDetailResult orderDetailResult, @NotNull java.lang.String str, Function0<Unit> function0) {
        super(orderDetailResult);
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.KWHzl = function0;
    }
}
