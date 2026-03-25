package o;

import com.google.android.gms.wallet.PaymentsClient;
import com.okinc.buysell.di.BuySellModule;

/* JADX INFO: loaded from: classes7.dex */
public final class lyB implements InterfaceC58162ywA<PaymentsClient> {
    public final InterfaceC58164ywC<android.content.Context> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public PaymentsClient get() {
        return OLrzqt(this.copydefault.get());
    }

    public static PaymentsClient OLrzqt(android.content.Context context) {
        return (PaymentsClient) C58165ywD.KWHzl(BuySellModule.KWHzl.copydefault(context));
    }
}
