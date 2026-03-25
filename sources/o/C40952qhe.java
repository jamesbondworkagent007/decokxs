package o;

import android.icu.util.Calendar;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40952qhe extends AbstractC49400uno<java.lang.Long, java.lang.Long> {
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return AEQbTJ(((java.lang.Number) obj).longValue(), continuation);
    }

    @yCM
    public C40952qhe(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    public java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super java.lang.Long> continuation) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return C56443yFo.KWHzl(calendar.getTimeInMillis());
    }
}
