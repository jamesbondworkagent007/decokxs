package o;

import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20066gZq {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final OrderStrategyType OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C20066gZq copy$default(C20066gZq c20066gZq, java.lang.String str, java.lang.String str2, int i, OrderStrategyType orderStrategyType, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c20066gZq.KWHzl;
        }
        if ((i2 & 2) != 0) {
            str2 = c20066gZq.AEQbTJ;
        }
        if ((i2 & 4) != 0) {
            i = c20066gZq.copydefault;
        }
        if ((i2 & 8) != 0) {
            orderStrategyType = c20066gZq.OLrzqt;
        }
        return c20066gZq.AEQbTJ(str, str2, i, orderStrategyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C20066gZq AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull OrderStrategyType orderStrategyType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(orderStrategyType, "");
        return new C20066gZq(str, str2, i, orderStrategyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderStrategyType EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20066gZq)) {
            return false;
        }
        C20066gZq c20066gZq = (C20066gZq) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c20066gZq.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c20066gZq.AEQbTJ) && this.copydefault == c20066gZq.copydefault && this.OLrzqt == c20066gZq.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OrderItemData(orderId=" + this.KWHzl + ", chainId=" + this.AEQbTJ + ", strategyMode=" + this.copydefault + ", orderStrategyType=" + this.OLrzqt + ")";
    }

    public C20066gZq(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull OrderStrategyType orderStrategyType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(orderStrategyType, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.copydefault = i;
        this.OLrzqt = orderStrategyType;
    }
}
