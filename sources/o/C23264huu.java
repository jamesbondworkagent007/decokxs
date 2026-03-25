package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.LimitState;
import com.okinc.business.dexlogic.main.limmitorder.bean.TradeStateLimit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.huu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23264huu extends AbstractC23259hup {
    public final void copydefault(@NotNull java.lang.String str, @NotNull Function1<? super LimitState, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            function1.invoke(((TradeStateLimit) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) TradeStateLimit.Companion.serializer(), str)).getDexData());
        } catch (java.lang.Exception e) {
            java.lang.String name = C23264huu.class.getName();
            java.lang.String message = e.getMessage();
            pUU.copydefault(name, message != null ? message : "");
        }
    }
}
