package com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils;

import QfgSZK.AEQbTJ;
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.response.OKServerException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pUU;
import o.yCR;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
@yCR
public final class CacheApiLoader {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils.CacheApiLoader.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ExpiryStrategy {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ExpiryStrategy[] $VALUES;
        public static final ExpiryStrategy LONG_EXPIRY;
        public static final ExpiryStrategy MID_EXPIRY;
        public static final ExpiryStrategy SHORT_EXPIRY = new ExpiryStrategy("SHORT_EXPIRY", 0, (int) TimeUnit.MINUTES.toSeconds(15));
        private final int expiryInSeconds;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ExpiryStrategy[] $values() {
            return new ExpiryStrategy[]{SHORT_EXPIRY, MID_EXPIRY, LONG_EXPIRY};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ExpiryStrategy> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getExpiryInSeconds() {
            return this.expiryInSeconds;
        }

        private ExpiryStrategy(String str, int i, int i2) {
            this.expiryInSeconds = i2;
        }

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            MID_EXPIRY = new ExpiryStrategy("MID_EXPIRY", 1, (int) timeUnit.toSeconds(1L));
            LONG_EXPIRY = new ExpiryStrategy("LONG_EXPIRY", 2, (int) timeUnit.toSeconds(7L));
            ExpiryStrategy[] expiryStrategyArr$values = $values();
            $VALUES = expiryStrategyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(expiryStrategyArr$values);
        }

        public static ExpiryStrategy valueOf(String str) {
            return (ExpiryStrategy) Enum.valueOf(ExpiryStrategy.class, str);
        }

        public static ExpiryStrategy[] values() {
            return (ExpiryStrategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T, R> Object copydefault(yHO<? super CacheStrategy, ? super Integer, ? super Continuation<? super AbstractC43419rot<? extends T, OKServerException>>, ? extends Object> yho, int i, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) throws Throwable {
        CacheApiLoader$fetchAndMapCache$1 cacheApiLoader$fetchAndMapCache$1;
        if (continuation instanceof CacheApiLoader$fetchAndMapCache$1) {
            cacheApiLoader$fetchAndMapCache$1 = (CacheApiLoader$fetchAndMapCache$1) continuation;
            int i2 = cacheApiLoader$fetchAndMapCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cacheApiLoader$fetchAndMapCache$1.label = i2 - Integer.MIN_VALUE;
            } else {
                cacheApiLoader$fetchAndMapCache$1 = new CacheApiLoader$fetchAndMapCache$1(this, continuation);
            }
        }
        Object objInvoke = cacheApiLoader$fetchAndMapCache$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = cacheApiLoader$fetchAndMapCache$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objInvoke);
                CacheStrategy cacheStrategy = CacheStrategy.ONLY_CACHE;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(i);
                cacheApiLoader$fetchAndMapCache$1.L$0 = function2;
                cacheApiLoader$fetchAndMapCache$1.label = 1;
                objInvoke = yho.invoke(cacheStrategy, numAEQbTJ, cacheApiLoader$fetchAndMapCache$1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objInvoke);
                    return objInvoke;
                }
                function2 = (Function2) cacheApiLoader$fetchAndMapCache$1.L$0;
                C56391yDq.AEQbTJ(objInvoke);
            }
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objInvoke;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                pUU.KWHzl("FirstCacheAlwaysNetworkApiLoader", "emit cache response: " + ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
                AEQbTJ aEQbTJ = (Object) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                cacheApiLoader$fetchAndMapCache$1.L$0 = null;
                cacheApiLoader$fetchAndMapCache$1.label = 2;
                objInvoke = function2.invoke(aEQbTJ, cacheApiLoader$fetchAndMapCache$1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
                return objInvoke;
            }
            pUU.KWHzl("FirstCacheAlwaysNetworkApiLoader", "emit empty cache response");
            return null;
        } catch (Exception e) {
            pUU.KWHzl("FirstCacheAlwaysNetworkApiLoader", "emit empty cache response due to exception " + e);
            return null;
        }
    }
}
