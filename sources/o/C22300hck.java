package o;

import com.okinc.business.dex.trade.swap.config.data.SwapConfigRepositoryImpl$fetchConfig$1;
import com.okinc.business.dex.trade.swap.config.data.SwapConfigRepositoryImpl$fetchConfig$apiResult$1;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22300hck implements InterfaceC22299hcj {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final ConcurrentHashMap<java.lang.String, Result<DexPresetResultVO>> AEQbTJ;
    public final InterfaceC23234huQ KWHzl;

    @yCM
    public C22300hck(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.KWHzl = interfaceC23234huQ;
        this.AEQbTJ = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.hck$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hck.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC22299hcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<DexPresetResultVO>> continuation) {
        SwapConfigRepositoryImpl$fetchConfig$1 swapConfigRepositoryImpl$fetchConfig$1;
        C22300hck c22300hck;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof SwapConfigRepositoryImpl$fetchConfig$1) {
            swapConfigRepositoryImpl$fetchConfig$1 = (SwapConfigRepositoryImpl$fetchConfig$1) continuation;
            int i = swapConfigRepositoryImpl$fetchConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                swapConfigRepositoryImpl$fetchConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                swapConfigRepositoryImpl$fetchConfig$1 = new SwapConfigRepositoryImpl$fetchConfig$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = swapConfigRepositoryImpl$fetchConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = swapConfigRepositoryImpl$fetchConfig$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            Result<DexPresetResultVO> result = this.AEQbTJ.get(str);
            if (result != null && Result.m7384isSuccessimpl(result.m7386unboximpl())) {
                return result.m7386unboximpl();
            }
            SwapConfigRepositoryImpl$fetchConfig$apiResult$1 swapConfigRepositoryImpl$fetchConfig$apiResult$1 = new SwapConfigRepositoryImpl$fetchConfig$apiResult$1(this, str, null);
            swapConfigRepositoryImpl$fetchConfig$1.L$0 = this;
            swapConfigRepositoryImpl$fetchConfig$1.L$1 = str;
            swapConfigRepositoryImpl$fetchConfig$1.label = 1;
            objEZpvd = kAB.EZpvd(swapConfigRepositoryImpl$fetchConfig$apiResult$1, swapConfigRepositoryImpl$fetchConfig$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c22300hck = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) swapConfigRepositoryImpl$fetchConfig$1.L$1;
            c22300hck = (C22300hck) swapConfigRepositoryImpl$fetchConfig$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objEZpvd;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC43419rot.ActionBar actionBar = (AbstractC43419rot.ActionBar) abstractC43419rot;
            pUU.AEQbTJ("SwapConfigRepository", "Failed to get config for " + str, (java.lang.Throwable) actionBar.KWHzl());
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar.KWHzl()));
        }
        c22300hck.AEQbTJ.put(str, Result.m7376boximpl(objM7377constructorimpl));
        return objM7377constructorimpl;
    }

    @Override // o.InterfaceC22299hcj
    public Result<DexPresetResultVO> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.get(str);
    }
}
