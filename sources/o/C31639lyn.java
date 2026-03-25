package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.presentation.PaymentMethodParameter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lyn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31639lyn implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        lKM.Companion.OLrzqt(context, new PaymentMethodParameter("USD", "100", "BTC", "", TradeType.SELL, 1, 2, false, 0, false, (com.okinc.okpaymentapi.data.remote.model.management.Channel) null, (PaymentMethod) null, Utf8.MASK_2BYTES, (DefaultConstructorMarker) null));
    }
}
