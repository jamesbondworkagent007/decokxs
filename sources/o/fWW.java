package o;

import com.okinc.business.defi.wallet.tee.review.viewmodel.repository.ObtainWalletRepositoryImpl$fetchWalletById$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fWW implements fWR {
    public volatile AbstractC12782ctV EZpvd;
    public final Mutex OLrzqt;
    public final C12827cuN copydefault;

    @yCM
    public fWW(@NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.copydefault = c12827cuN;
        this.OLrzqt = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // o.fWR
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC12782ctV> continuation) {
        return EZpvd(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, Continuation<? super AbstractC12782ctV> continuation) throws java.lang.Throwable {
        ObtainWalletRepositoryImpl$fetchWalletById$1 obtainWalletRepositoryImpl$fetchWalletById$1;
        Mutex mutex;
        fWW fww;
        fWW fww2;
        Mutex mutex2;
        AbstractC12782ctV abstractC12782ctV;
        if (continuation instanceof ObtainWalletRepositoryImpl$fetchWalletById$1) {
            obtainWalletRepositoryImpl$fetchWalletById$1 = (ObtainWalletRepositoryImpl$fetchWalletById$1) continuation;
            int i = obtainWalletRepositoryImpl$fetchWalletById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                obtainWalletRepositoryImpl$fetchWalletById$1.label = i - Integer.MIN_VALUE;
            } else {
                obtainWalletRepositoryImpl$fetchWalletById$1 = new ObtainWalletRepositoryImpl$fetchWalletById$1(this, continuation);
            }
        }
        java.lang.Object obj = obtainWalletRepositoryImpl$fetchWalletById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = obtainWalletRepositoryImpl$fetchWalletById$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                mutex = this.OLrzqt;
                obtainWalletRepositoryImpl$fetchWalletById$1.L$0 = this;
                obtainWalletRepositoryImpl$fetchWalletById$1.L$1 = str;
                obtainWalletRepositoryImpl$fetchWalletById$1.L$2 = mutex;
                obtainWalletRepositoryImpl$fetchWalletById$1.label = 1;
                if (mutex.lock(null, obtainWalletRepositoryImpl$fetchWalletById$1) == objCopydefault) {
                    return objCopydefault;
                }
                fww = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) obtainWalletRepositoryImpl$fetchWalletById$1.L$1;
                    fww2 = (fWW) obtainWalletRepositoryImpl$fetchWalletById$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        fww2.EZpvd = (AbstractC12782ctV) obj;
                        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) obj;
                        mutex = mutex2;
                        abstractC12782ctV = abstractC12782ctV2;
                        mutex.unlock(null);
                        return abstractC12782ctV;
                    } catch (java.lang.Throwable th) {
                        mutex = mutex2;
                        th = th;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex3 = (Mutex) obtainWalletRepositoryImpl$fetchWalletById$1.L$2;
                java.lang.String str2 = (java.lang.String) obtainWalletRepositoryImpl$fetchWalletById$1.L$1;
                fww = (fWW) obtainWalletRepositoryImpl$fetchWalletById$1.L$0;
                C56391yDq.AEQbTJ(obj);
                mutex = mutex3;
                str = str2;
            }
            if (fww.EZpvd != null) {
                AbstractC12782ctV abstractC12782ctV3 = fww.EZpvd;
                if (Intrinsics.EZpvd((java.lang.Object) (abstractC12782ctV3 != null ? abstractC12782ctV3.DbNXlk() : null), (java.lang.Object) str)) {
                    abstractC12782ctV = fww.EZpvd;
                    mutex.unlock(null);
                    return abstractC12782ctV;
                }
            }
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = fww.copydefault.OLrzqt(str, false);
            obtainWalletRepositoryImpl$fetchWalletById$1.L$0 = fww;
            obtainWalletRepositoryImpl$fetchWalletById$1.L$1 = mutex;
            obtainWalletRepositoryImpl$fetchWalletById$1.L$2 = null;
            obtainWalletRepositoryImpl$fetchWalletById$1.label = 2;
            java.lang.Object objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, obtainWalletRepositoryImpl$fetchWalletById$1);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            fww2 = fww;
            Mutex mutex4 = mutex;
            obj = objAwait;
            mutex2 = mutex4;
            fww2.EZpvd = (AbstractC12782ctV) obj;
            AbstractC12782ctV abstractC12782ctV22 = (AbstractC12782ctV) obj;
            mutex = mutex2;
            abstractC12782ctV = abstractC12782ctV22;
            mutex.unlock(null);
            return abstractC12782ctV;
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
    }
}
