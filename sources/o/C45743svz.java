package o;

import com.okinc.okex.lite.hero.usecase.HeroLoadInitUseCase$tryLoadHero$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C45743svz {
    public final C45706svB EZpvd;
    public final C45708svD KWHzl;

    @yCM
    public C45743svz(@NotNull C45706svB c45706svB, @NotNull C45708svD c45708svD) {
        Intrinsics.checkNotNullParameter(c45706svB, "");
        Intrinsics.checkNotNullParameter(c45708svD, "");
        this.EZpvd = c45706svB;
        this.KWHzl = c45708svD;
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objOLrzqt = OLrzqt(continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        HeroLoadInitUseCase$tryLoadHero$1 heroLoadInitUseCase$tryLoadHero$1;
        if (continuation instanceof HeroLoadInitUseCase$tryLoadHero$1) {
            heroLoadInitUseCase$tryLoadHero$1 = (HeroLoadInitUseCase$tryLoadHero$1) continuation;
            int i = heroLoadInitUseCase$tryLoadHero$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                heroLoadInitUseCase$tryLoadHero$1.label = i - Integer.MIN_VALUE;
            } else {
                heroLoadInitUseCase$tryLoadHero$1 = new HeroLoadInitUseCase$tryLoadHero$1(this, continuation);
            }
        }
        java.lang.Object obj = heroLoadInitUseCase$tryLoadHero$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = heroLoadInitUseCase$tryLoadHero$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.EZpvd.copydefault(false, false)) {
                    C45708svD c45708svD = this.KWHzl;
                    heroLoadInitUseCase$tryLoadHero$1.label = 1;
                    if (c45708svD.EZpvd(heroLoadInitUseCase$tryLoadHero$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("HeroLoadInitUseCase", "tryLoadHero failed: " + e.getMessage(), e);
            return Unit.INSTANCE;
        }
    }
}
