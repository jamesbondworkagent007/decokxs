package o;

import com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lgY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30723lgY extends C43316rmw {
    public C30723lgY(@NotNull Function1<? super UIPricingToken, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        register(UIPricingToken.class, new C30717lgS(function1));
    }
}
