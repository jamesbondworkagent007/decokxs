package o;

import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xKo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54496xKo<Resp> implements InterfaceC54492xKk<Resp> {
    public Function1<? super ResponseData<Resp>, Unit> KWHzl;

    public C54496xKo(Function1<? super ResponseData<Resp>, Unit> function1) {
        this.KWHzl = function1;
    }

    @Override // o.InterfaceC54492xKk
    public void KWHzl(@NotNull ResponseData<Resp> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        Function1<? super ResponseData<Resp>, Unit> function1 = this.KWHzl;
        if (function1 != null) {
            function1.invoke(responseData);
        }
    }
}
