package o;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDK implements iDJ {
    public final java.util.Map<java.lang.String, iDV> EZpvd = new LinkedHashMap();

    @yCM
    public iDK() {
    }

    @Override // o.iDJ
    public java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        this.EZpvd.clear();
        return Unit.INSTANCE;
    }

    @Override // o.iDJ
    public iDV copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.get(str);
    }

    @Override // o.iDJ
    public void KWHzl(@NotNull java.lang.String str, @NotNull iDV idv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(idv, "");
        this.EZpvd.put(str, idv);
    }
}
