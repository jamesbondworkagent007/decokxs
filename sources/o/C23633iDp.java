package o;

import com.okinc.core.util.SPUtils;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23633iDp implements InterfaceC23636iDs {
    @yCM
    public C23633iDp() {
    }

    @Override // o.InterfaceC23636iDs
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        try {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56443yFo.KWHzl(SPUtils.getBoolean(str, z)));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
