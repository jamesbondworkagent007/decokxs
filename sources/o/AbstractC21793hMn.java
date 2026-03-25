package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hMn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC21793hMn {
    public final OrderDetailResult OLrzqt;

    public abstract java.lang.String AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderDetailResult OLrzqt() {
        return this.OLrzqt;
    }

    public AbstractC21793hMn(@NotNull OrderDetailResult orderDetailResult) {
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        this.OLrzqt = orderDetailResult;
    }
}
