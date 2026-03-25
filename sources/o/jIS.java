package o;

import com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jIS {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jIQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jIS.OLrzqt();
        }
    });

    @yCM
    public jIS() {
    }

    public final jIT EZpvd() {
        return (jIT) this.copydefault.getValue();
    }

    public static final jIT OLrzqt() {
        return (jIT) C38416pXz.copydefault(C56524yIo.AEQbTJ(jIT.class));
    }

    public java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, @NotNull Continuation<? super ResponseData<java.util.List<CalendarPo>>> continuation) {
        return EZpvd().OLrzqt(str, str2, str3, num, continuation);
    }
}
