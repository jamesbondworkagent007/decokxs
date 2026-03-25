package o;

import com.okinc.business.dexlogic.bean.MemeSimpleDexData;
import com.okinc.business.dexlogic.bean.MemeSimplePushBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hum, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23256hum extends AbstractC23259hup {
    public final void copydefault(@NotNull java.lang.String str, @NotNull Function1<? super MemeSimpleDexData, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            function1.invoke(((MemeSimplePushBean) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) MemeSimplePushBean.Companion.serializer(), str)).getDexData());
        } catch (java.lang.Exception e) {
            java.lang.String name = C23256hum.class.getName();
            java.lang.String message = e.getMessage();
            pUU.copydefault(name, message != null ? message : "");
        }
    }
}
