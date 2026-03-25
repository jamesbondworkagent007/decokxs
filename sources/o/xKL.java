package o;

import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xKL<Resp> extends xKK {
    void KWHzl(@NotNull Function1<? super ResponseData<Resp>, Unit> function1);

    public static final class ActionBar {
        public static <Resp> java.util.Map<java.lang.String, java.lang.String> AEQbTJ(@NotNull xKL<Resp> xkl) {
            return xKK.Activity.copydefault(xkl);
        }

        public static <Resp> java.lang.String KWHzl(@NotNull xKL<Resp> xkl) {
            return xKK.Activity.EZpvd(xkl);
        }
    }
}
