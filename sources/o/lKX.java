package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class lKX {
    public PaymentMethod AEQbTJ;
    public com.okinc.okpaymentapi.data.remote.model.management.Channel EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ lKX copy$default(lKX lkx, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            channel = lkx.EZpvd;
        }
        if ((i & 2) != 0) {
            paymentMethod = lkx.AEQbTJ;
        }
        return lkx.EZpvd(channel, paymentMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentMethod AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final com.okinc.okpaymentapi.data.remote.model.management.Channel EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lKX EZpvd(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod) {
        return new lKX(channel, paymentMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lKX)) {
            return false;
        }
        lKX lkx = (lKX) obj;
        return Intrinsics.EZpvd(this.EZpvd, lkx.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, lkx.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel = this.EZpvd;
        int iHashCode = channel == null ? 0 : channel.hashCode();
        PaymentMethod paymentMethod = this.AEQbTJ;
        return (iHashCode * 31) + (paymentMethod != null ? paymentMethod.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SelectedPaymentData(channel=" + this.EZpvd + ", paymentMethod=" + this.AEQbTJ + ")";
    }

    public lKX(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod) {
        this.EZpvd = channel;
        this.AEQbTJ = paymentMethod;
    }
}
