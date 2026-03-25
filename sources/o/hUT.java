package o;

import com.okinc.business.dexlogic.bean.OrderDetailBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public abstract class hUT {
    public final OrderDetailBean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderDetailBean KWHzl() {
        return this.EZpvd;
    }

    public abstract java.lang.String copydefault();

    public hUT(@NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        this.EZpvd = orderDetailBean;
    }
}
