package o;

import com.okinc.business.defi.wallet.tee.converter.usecase.GetCoinAssetAndFilterTokenAssetUseCase$invoke$1;
import com.okinc.business.defi.wallet.tee.converter.usecase.GetCoinAssetAndFilterTokenAssetUseCase$invoke$assetResult$1$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.fTZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fVa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17862fVa {
    public final C10407bnq OLrzqt;
    public final CoroutineDispatcher copydefault;

    public C17862fVa(@NotNull C10407bnq c10407bnq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c10407bnq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = c10407bnq;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.fVa$TaskDescription */
    public static final class TaskDescription {
        public static final int copydefault = AbstractC43419rot.$stable;
        public final AbstractC43419rot<java.util.List<fTZ.Application>, OKServerException> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC43419rot<java.util.List<fTZ.Application>, OKServerException> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.rot<? extends java.util.List<o.fTZ$Application>, com.okinc.network.okg.response.OKServerException> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull AbstractC43419rot<? extends java.util.List<fTZ.Application>, OKServerException> abstractC43419rot, long j) {
            Intrinsics.checkNotNullParameter(abstractC43419rot, "");
            this.AEQbTJ = abstractC43419rot;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 o.rot)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:26)) : (r2v0 long))
 A[MD:(o.rot<? extends java.util.List<o.fTZ$Application>, com.okinc.network.okg.response.OKServerException>, long):void (m)] (LINE:24) call: o.fVa.TaskDescription.<init>(o.rot, long):void type: THIS */
        public /* synthetic */ TaskDescription(AbstractC43419rot abstractC43419rot, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC43419rot, (i & 2) != 0 ? java.lang.System.currentTimeMillis() : j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, final long j, @NotNull final InterfaceC56538yJb<java.lang.Double> interfaceC56538yJb, @NotNull Continuation<? super TaskDescription> continuation) throws java.lang.Throwable {
        GetCoinAssetAndFilterTokenAssetUseCase$invoke$1 getCoinAssetAndFilterTokenAssetUseCase$invoke$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof GetCoinAssetAndFilterTokenAssetUseCase$invoke$1) {
            getCoinAssetAndFilterTokenAssetUseCase$invoke$1 = (GetCoinAssetAndFilterTokenAssetUseCase$invoke$1) continuation;
            int i = getCoinAssetAndFilterTokenAssetUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCoinAssetAndFilterTokenAssetUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getCoinAssetAndFilterTokenAssetUseCase$invoke$1 = new GetCoinAssetAndFilterTokenAssetUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getCoinAssetAndFilterTokenAssetUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCoinAssetAndFilterTokenAssetUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = this.copydefault;
                GetCoinAssetAndFilterTokenAssetUseCase$invoke$assetResult$1$1 getCoinAssetAndFilterTokenAssetUseCase$invoke$assetResult$1$1 = new GetCoinAssetAndFilterTokenAssetUseCase$invoke$assetResult$1$1(this, abstractC12782ctV, null);
                getCoinAssetAndFilterTokenAssetUseCase$invoke$1.L$0 = interfaceC56538yJb;
                getCoinAssetAndFilterTokenAssetUseCase$invoke$1.J$0 = j;
                getCoinAssetAndFilterTokenAssetUseCase$invoke$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, getCoinAssetAndFilterTokenAssetUseCase$invoke$assetResult$1$1, getCoinAssetAndFilterTokenAssetUseCase$invoke$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = getCoinAssetAndFilterTokenAssetUseCase$invoke$1.J$0;
                interfaceC56538yJb = (InterfaceC56538yJb) getCoinAssetAndFilterTokenAssetUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((kotlin.Pair) objWithContext);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            Intrinsics.copydefault(thM7380exceptionOrNullimpl);
            return new TaskDescription(new AbstractC43419rot.ActionBar(C43422row.OLrzqt(thM7380exceptionOrNullimpl)), 0L, 2, null);
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        C10404bnn c10404bnn = (C10404bnn) ((kotlin.Pair) objM7377constructorimpl).getFirst();
        if (c10404bnn == null) {
            return new TaskDescription(new AbstractC43419rot.ActionBar(new OKServerException(0, C43422row.OLrzqt(), null, null, 13, null)), 0L, 2, null);
        }
        return new TaskDescription(new AbstractC43419rot.StateListAnimator(C59467zhb.AxsJAY(C59467zhb.wlaJM(C59467zhb.fetchVPNInfo(CollectionsKt___CollectionsKt.QVAiDq(c10404bnn.copydefault()), new Function1() { // from class: o.fUW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17862fVa.KWHzl(j, interfaceC56538yJb, (C10525bqB) obj);
            }
        })))), 0L, 2, null);
    }

    public static final fTZ.Application KWHzl(long j, InterfaceC56538yJb interfaceC56538yJb, C10525bqB c10525bqB) {
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        if (c10525bqB.gEmmrt() != j) {
            return null;
        }
        if (!c10525bqB.KWHzl().DCUTEIddSDPG() || interfaceC56538yJb.contains(java.lang.Double.valueOf(C33129mqd.AEQbTJ(c10525bqB.AhwBna())))) {
            return new fTZ.Application(true, false, c10525bqB.KWHzl(), c10525bqB.fIwbmz(), c10525bqB.AhwBna());
        }
        return null;
    }
}
