package o;

import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeStateSwap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hus, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23262hus extends AbstractC23259hup {
    public final void copydefault(@NotNull java.lang.String str, @NotNull Function1<? super TradeState, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            function1.invoke(((TradeStateSwap) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) TradeStateSwap.Companion.serializer(), str)).getDexData());
        } catch (java.lang.Exception e) {
            java.lang.String name = C23262hus.class.getName();
            java.lang.String message = e.getMessage();
            pUU.copydefault(name, message != null ? message : "");
        }
    }
}
