package o;

import com.okinc.business.defi.biz.net.bean.InfoListNew;
import com.okinc.business.defi.wallet.home.banner.BannerRepository$getBannerData$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18026fad {
    public CompletableDeferred<AbstractC43419rot<InfoListNew, OKServerException>> KWHzl;
    public final Mutex OLrzqt;
    public final C13934dbu copydefault;

    public C18026fad(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.copydefault = c13934dbu;
        this.OLrzqt = MutexKt.Mutex$default(false, 1, null);
    }

    public static /* synthetic */ java.lang.Object getBannerData$default(C18026fad c18026fad, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c18026fad.copydefault(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[PHI: r13
  0x00d6: PHI (r13v9 java.lang.Object) = (r13v7 java.lang.Object), (r13v1 java.lang.Object) binds: [B:36:0x00d3, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, kotlinx.coroutines.CompletableDeferred, kotlinx.coroutines.CompletableDeferred<o.rot<com.okinc.business.defi.biz.net.bean.InfoListNew, com.okinc.network.okg.response.OKServerException>>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, kotlinx.coroutines.CompletableDeferred<o.rot<com.okinc.business.defi.biz.net.bean.InfoListNew, com.okinc.network.okg.response.OKServerException>>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(boolean z, @NotNull Continuation<? super AbstractC43419rot<InfoListNew, OKServerException>> continuation) throws java.lang.Throwable {
        BannerRepository$getBannerData$1 bannerRepository$getBannerData$1;
        Ref.BooleanRef booleanRef;
        C18026fad c18026fad;
        Ref.ObjectRef objectRef;
        Mutex mutex;
        CompletableDeferred completableDeferred;
        if (continuation instanceof BannerRepository$getBannerData$1) {
            bannerRepository$getBannerData$1 = (BannerRepository$getBannerData$1) continuation;
            int i = bannerRepository$getBannerData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bannerRepository$getBannerData$1.label = i - Integer.MIN_VALUE;
            } else {
                bannerRepository$getBannerData$1 = new BannerRepository$getBannerData$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = bannerRepository$getBannerData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bannerRepository$getBannerData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objValueOf);
                booleanRef = new Ref.BooleanRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                Mutex mutex2 = this.OLrzqt;
                bannerRepository$getBannerData$1.L$0 = this;
                bannerRepository$getBannerData$1.L$1 = booleanRef;
                bannerRepository$getBannerData$1.L$2 = objectRef2;
                bannerRepository$getBannerData$1.L$3 = mutex2;
                bannerRepository$getBannerData$1.Z$0 = z;
                bannerRepository$getBannerData$1.label = 1;
                if (mutex2.lock(null, bannerRepository$getBannerData$1) == objCopydefault) {
                    return objCopydefault;
                }
                c18026fad = this;
                objectRef = objectRef2;
                mutex = mutex2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            C56391yDq.AEQbTJ(objValueOf);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (CompletableDeferred) bannerRepository$getBannerData$1.L$1;
                    objectRef = (Ref.ObjectRef) bannerRepository$getBannerData$1.L$0;
                    C56391yDq.AEQbTJ(objValueOf);
                    completableDeferred.complete(objValueOf);
                    CompletableDeferred completableDeferred2 = (CompletableDeferred) objectRef.element;
                    bannerRepository$getBannerData$1.L$0 = null;
                    bannerRepository$getBannerData$1.L$1 = null;
                    bannerRepository$getBannerData$1.L$2 = null;
                    bannerRepository$getBannerData$1.L$3 = null;
                    bannerRepository$getBannerData$1.label = 3;
                    objValueOf = completableDeferred2.await(bannerRepository$getBannerData$1);
                    return objValueOf != objCopydefault ? objCopydefault : objValueOf;
                }
                z = bannerRepository$getBannerData$1.Z$0;
                Mutex mutex3 = (Mutex) bannerRepository$getBannerData$1.L$3;
                Ref.ObjectRef objectRef3 = (Ref.ObjectRef) bannerRepository$getBannerData$1.L$2;
                booleanRef = (Ref.BooleanRef) bannerRepository$getBannerData$1.L$1;
                c18026fad = (C18026fad) bannerRepository$getBannerData$1.L$0;
                C56391yDq.AEQbTJ(objValueOf);
                mutex = mutex3;
                objectRef = objectRef3;
            }
            ?? r7 = c18026fad.KWHzl;
            if (r7 == 0 || z) {
                ?? CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                objectRef.element = CompletableDeferred$default;
                c18026fad.KWHzl = CompletableDeferred$default;
                booleanRef.element = true;
            } else {
                objectRef.element = r7;
                booleanRef.element = false;
            }
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            if (booleanRef.element) {
                completableDeferred = (CompletableDeferred) objectRef.element;
                C13934dbu c13934dbu = c18026fad.copydefault;
                bannerRepository$getBannerData$1.L$0 = objectRef;
                bannerRepository$getBannerData$1.L$1 = completableDeferred;
                bannerRepository$getBannerData$1.L$2 = null;
                bannerRepository$getBannerData$1.L$3 = null;
                bannerRepository$getBannerData$1.label = 2;
                objValueOf = c13934dbu.valueOf(bannerRepository$getBannerData$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
                completableDeferred.complete(objValueOf);
            }
            CompletableDeferred completableDeferred22 = (CompletableDeferred) objectRef.element;
            bannerRepository$getBannerData$1.L$0 = null;
            bannerRepository$getBannerData$1.L$1 = null;
            bannerRepository$getBannerData$1.L$2 = null;
            bannerRepository$getBannerData$1.L$3 = null;
            bannerRepository$getBannerData$1.label = 3;
            objValueOf = completableDeferred22.await(bannerRepository$getBannerData$1);
            if (objValueOf != objCopydefault) {
            }
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
