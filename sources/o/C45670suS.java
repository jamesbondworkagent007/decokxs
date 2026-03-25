package o;

import com.okinc.okex.lite.hero.coordinator.AsyncLoadHeroAwait$invoke$1;
import com.okinc.okex.lite.hero.coordinator.AsyncLoadHeroAwait$invoke$ongoingOperation$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.suS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C45670suS {
    public Deferred<Unit> AEQbTJ;
    public final C45743svz EZpvd;
    public final Mutex KWHzl;
    public final InterfaceC45711svG OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final CoroutineScope djBIcL;

    @yCM
    public C45670suS(@NotNull C45743svz c45743svz, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC45711svG interfaceC45711svG, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(c45743svz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC45711svG, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.EZpvd = c45743svz;
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = interfaceC45711svG;
        this.djBIcL = coroutineScope;
        this.KWHzl = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        AsyncLoadHeroAwait$invoke$1 asyncLoadHeroAwait$invoke$1;
        Mutex mutex;
        C45670suS c45670suS;
        Deferred<Unit> deferredAsync$default;
        C45670suS c45670suS2;
        if (continuation instanceof AsyncLoadHeroAwait$invoke$1) {
            asyncLoadHeroAwait$invoke$1 = (AsyncLoadHeroAwait$invoke$1) continuation;
            int i = asyncLoadHeroAwait$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                asyncLoadHeroAwait$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                asyncLoadHeroAwait$invoke$1 = new AsyncLoadHeroAwait$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = asyncLoadHeroAwait$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = asyncLoadHeroAwait$invoke$1.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    mutex = this.KWHzl;
                    asyncLoadHeroAwait$invoke$1.L$0 = this;
                    asyncLoadHeroAwait$invoke$1.L$1 = mutex;
                    asyncLoadHeroAwait$invoke$1.label = 1;
                    if (mutex.lock(null, asyncLoadHeroAwait$invoke$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    c45670suS = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c45670suS2 = (C45670suS) asyncLoadHeroAwait$invoke$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(obj);
                            return Unit.INSTANCE;
                        } catch (java.lang.Exception e) {
                            e = e;
                            c45670suS2.OLrzqt.OLrzqt("Hero loading failed for a caller", e);
                            throw e;
                        }
                    }
                    mutex = (Mutex) asyncLoadHeroAwait$invoke$1.L$1;
                    c45670suS = (C45670suS) asyncLoadHeroAwait$invoke$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                }
                asyncLoadHeroAwait$invoke$1.L$0 = c45670suS;
                asyncLoadHeroAwait$invoke$1.L$1 = null;
                asyncLoadHeroAwait$invoke$1.label = 2;
                if (deferredAsync$default.await(asyncLoadHeroAwait$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            } catch (java.lang.Exception e2) {
                e = e2;
                c45670suS2 = c45670suS;
                c45670suS2.OLrzqt.OLrzqt("Hero loading failed for a caller", e);
                throw e;
            }
            deferredAsync$default = c45670suS.AEQbTJ;
            if (deferredAsync$default != null && deferredAsync$default.isActive()) {
                c45670suS.OLrzqt.AEQbTJ("Hero loading already in progress, joining existing one");
            } else {
                c45670suS.OLrzqt.AEQbTJ("Starting new hero loading operation");
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(c45670suS.djBIcL, null, null, new AsyncLoadHeroAwait$invoke$ongoingOperation$1$1(c45670suS, null), 3, null);
                c45670suS.AEQbTJ = deferredAsync$default;
            }
        } finally {
            mutex.unlock(null);
        }
    }
}
