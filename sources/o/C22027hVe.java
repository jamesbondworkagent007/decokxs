package o;

import com.okinc.business.dexlogic.bean.OrderDetailBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hVe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22027hVe extends hUT {
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.hUT
    public java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22027hVe(@NotNull OrderDetailBean orderDetailBean, @NotNull java.lang.String str) {
        super(orderDetailBean);
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }
}
