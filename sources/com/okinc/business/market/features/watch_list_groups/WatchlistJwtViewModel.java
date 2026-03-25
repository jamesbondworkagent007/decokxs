package com.okinc.business.market.features.watch_list_groups;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C28586kda;
import o.C28603kdr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistJwtViewModel extends ViewModel {
    public final C28586kda EZpvd;
    public final C28603kdr OLrzqt;

    @yCM
    public WatchlistJwtViewModel(@NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr) {
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        this.EZpvd = c28586kda;
        this.OLrzqt = c28603kdr;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Continuation<? super Result<Boolean>> continuation) throws Throwable {
        WatchlistJwtViewModel$isValidJwt$1 watchlistJwtViewModel$isValidJwt$1;
        Object objOLrzqt;
        WatchlistJwtViewModel watchlistJwtViewModel;
        Object objCopydefault;
        if (continuation instanceof WatchlistJwtViewModel$isValidJwt$1) {
            watchlistJwtViewModel$isValidJwt$1 = (WatchlistJwtViewModel$isValidJwt$1) continuation;
            int i = watchlistJwtViewModel$isValidJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchlistJwtViewModel$isValidJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                watchlistJwtViewModel$isValidJwt$1 = new WatchlistJwtViewModel$isValidJwt$1(this, continuation);
            }
        }
        Object obj = watchlistJwtViewModel$isValidJwt$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = watchlistJwtViewModel$isValidJwt$1.label;
        boolean zBooleanValue = false;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.EZpvd;
                watchlistJwtViewModel$isValidJwt$1.L$0 = this;
                watchlistJwtViewModel$isValidJwt$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(watchlistJwtViewModel$isValidJwt$1);
                if (objOLrzqt == objCopydefault2) {
                    return objCopydefault2;
                }
                watchlistJwtViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objCopydefault = ((Result) obj).m7386unboximpl();
                    Boolean boolKWHzl = C56443yFo.KWHzl(false);
                    if (Result.m7383isFailureimpl(objCopydefault)) {
                        objCopydefault = boolKWHzl;
                    }
                    zBooleanValue = ((Boolean) objCopydefault).booleanValue();
                    return Result.m7377constructorimpl(C56443yFo.KWHzl(zBooleanValue));
                }
                watchlistJwtViewModel = (WatchlistJwtViewModel) watchlistJwtViewModel$isValidJwt$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objOLrzqt)) {
                objOLrzqt = null;
            }
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            if (dexUserIdentity != null) {
                C28603kdr c28603kdr = watchlistJwtViewModel.OLrzqt;
                String strEZpvd = dexUserIdentity.EZpvd();
                watchlistJwtViewModel$isValidJwt$1.L$0 = null;
                watchlistJwtViewModel$isValidJwt$1.label = 2;
                objCopydefault = c28603kdr.copydefault(strEZpvd, watchlistJwtViewModel$isValidJwt$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                if (Result.m7383isFailureimpl(objCopydefault)) {
                }
                zBooleanValue = ((Boolean) objCopydefault).booleanValue();
                return Result.m7377constructorimpl(C56443yFo.KWHzl(zBooleanValue));
            }
            return Result.m7377constructorimpl(C56443yFo.KWHzl(zBooleanValue));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Continuation<? super Result<DappSignArgs>> continuation) throws Throwable {
        WatchlistJwtViewModel$generateSignMessage$1 watchlistJwtViewModel$generateSignMessage$1;
        Object objOLrzqt;
        WatchlistJwtViewModel watchlistJwtViewModel;
        Object objEZpvd;
        if (continuation instanceof WatchlistJwtViewModel$generateSignMessage$1) {
            watchlistJwtViewModel$generateSignMessage$1 = (WatchlistJwtViewModel$generateSignMessage$1) continuation;
            int i = watchlistJwtViewModel$generateSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchlistJwtViewModel$generateSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                watchlistJwtViewModel$generateSignMessage$1 = new WatchlistJwtViewModel$generateSignMessage$1(this, continuation);
            }
        }
        Object obj = watchlistJwtViewModel$generateSignMessage$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchlistJwtViewModel$generateSignMessage$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.EZpvd;
                watchlistJwtViewModel$generateSignMessage$1.L$0 = this;
                watchlistJwtViewModel$generateSignMessage$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(watchlistJwtViewModel$generateSignMessage$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                watchlistJwtViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objEZpvd);
                    return Result.m7377constructorimpl((DappSignArgs) objEZpvd);
                }
                watchlistJwtViewModel = (WatchlistJwtViewModel) watchlistJwtViewModel$generateSignMessage$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = watchlistJwtViewModel.OLrzqt;
            String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            watchlistJwtViewModel$generateSignMessage$1.L$0 = null;
            watchlistJwtViewModel$generateSignMessage$1.label = 2;
            objEZpvd = c28603kdr.EZpvd(strEZpvd, jOLrzqt, watchlistJwtViewModel$generateSignMessage$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            C56391yDq.AEQbTJ(objEZpvd);
            return Result.m7377constructorimpl((DappSignArgs) objEZpvd);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[Catch: all -> 0x0098, CancellationException -> 0x00ab, TryCatch #2 {CancellationException -> 0x00ab, all -> 0x0098, blocks: (B:12:0x0029, B:27:0x0082, B:29:0x0089, B:31:0x008f, B:17:0x0043, B:24:0x0064, B:20:0x0051), top: B:38:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Bundle bundle, @NotNull Continuation<? super Result<Boolean>> continuation) throws Throwable {
        WatchlistJwtViewModel$login$1 watchlistJwtViewModel$login$1;
        Object objOLrzqt;
        WatchlistJwtViewModel watchlistJwtViewModel;
        Object objKWHzl;
        if (continuation instanceof WatchlistJwtViewModel$login$1) {
            watchlistJwtViewModel$login$1 = (WatchlistJwtViewModel$login$1) continuation;
            int i = watchlistJwtViewModel$login$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchlistJwtViewModel$login$1.label = i - Integer.MIN_VALUE;
            } else {
                watchlistJwtViewModel$login$1 = new WatchlistJwtViewModel$login$1(this, continuation);
            }
        }
        WatchlistJwtViewModel$login$1 watchlistJwtViewModel$login$12 = watchlistJwtViewModel$login$1;
        Object obj = watchlistJwtViewModel$login$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchlistJwtViewModel$login$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.EZpvd;
                watchlistJwtViewModel$login$12.L$0 = this;
                watchlistJwtViewModel$login$12.L$1 = bundle;
                watchlistJwtViewModel$login$12.label = 1;
                objOLrzqt = c28586kda.OLrzqt(watchlistJwtViewModel$login$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                watchlistJwtViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objKWHzl);
                    Boolean bool = (Boolean) objKWHzl;
                    return Result.m7377constructorimpl(C56443yFo.KWHzl(bool == null ? bool.booleanValue() : false));
                }
                bundle = (Bundle) watchlistJwtViewModel$login$12.L$1;
                watchlistJwtViewModel = (WatchlistJwtViewModel) watchlistJwtViewModel$login$12.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            Bundle bundle2 = bundle;
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = watchlistJwtViewModel.OLrzqt;
            String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            watchlistJwtViewModel$login$12.L$0 = null;
            watchlistJwtViewModel$login$12.L$1 = null;
            watchlistJwtViewModel$login$12.label = 2;
            objKWHzl = c28603kdr.KWHzl(strEZpvd, jOLrzqt, bundle2, watchlistJwtViewModel$login$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            C56391yDq.AEQbTJ(objKWHzl);
            Boolean bool2 = (Boolean) objKWHzl;
            return Result.m7377constructorimpl(C56443yFo.KWHzl(bool2 == null ? bool2.booleanValue() : false));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
