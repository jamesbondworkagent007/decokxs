package o;

import android.icu.util.Calendar;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40890qgV extends AbstractC49400uno<java.lang.Long, java.lang.Long> {
    public final CoroutineDispatcher AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl(((java.lang.Number) obj).longValue(), (Continuation<? super java.lang.Long>) continuation);
    }

    @yCM
    public C40890qgV(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    public java.lang.Object KWHzl(long j, @NotNull Continuation<? super java.lang.Long> continuation) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return C56443yFo.KWHzl(calendar.getTimeInMillis());
    }
}
