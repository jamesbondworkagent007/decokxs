package o;

import com.okinc.kline.ui.unlock.data.po.UnlockTokenEvent;
import com.okinc.kline.ui.unlock.ui.model.CountDownTime;
import com.okinc.kline.ui.unlock.ui.model.UnlockTokenStageDataVo;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pwX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39659pwX extends AbstractC49400uno<Triple<? extends java.util.List<? extends UnlockTokenEvent>, ? extends java.util.List<? extends UnlockTokenEvent>, ? extends java.lang.String>, C39705pxQ> {
    public final CoroutineDispatcher AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C39659pwX(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull Triple<? extends java.util.List<UnlockTokenEvent>, ? extends java.util.List<UnlockTokenEvent>, java.lang.String> triple, @NotNull Continuation<? super C39705pxQ> continuation) {
        java.util.List<UnlockTokenEvent> second = triple.getSecond();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(second, 10));
        for (UnlockTokenEvent unlockTokenEvent : second) {
            arrayList.add(new UnlockTokenStageDataVo(triple.getThird(), "", unlockTokenEvent.getUnlockedTs(), unlockTokenEvent.getUnlocked(), unlockTokenEvent.getPercOfUnlocked(), unlockTokenEvent.getUnlockedValue(), unlockTokenEvent.getPercOfUnlockedValue(), new CountDownTime(C33129mqd.valueOf(unlockTokenEvent.getUnlockedTs()), false, 2, null)));
        }
        return new C39705pxQ((arrayList.isEmpty() || triple.getSecond().isEmpty()) ? -1 : 0, arrayList);
    }
}
