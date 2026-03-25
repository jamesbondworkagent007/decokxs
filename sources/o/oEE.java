package o;

import com.okinc.im.usecase.message.SendReactionMessageUseCase$execute$2;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEE {
    public final sKH AEQbTJ;
    public final CoroutineDispatcher OLrzqt;
    public final C35771oDb copydefault;

    @yCM
    public oEE(@NotNull sKH skh, @NotNull C35771oDb c35771oDb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(c35771oDb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = skh;
        this.copydefault = c35771oDb;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object EZpvd(@NotNull WSSendReactionData wSSendReactionData, @NotNull Function0<Unit> function0, @NotNull Function2<? super OKMessage, ? super java.lang.Throwable, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new SendReactionMessageUseCase$execute$2(wSSendReactionData, this, function2, function0, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
