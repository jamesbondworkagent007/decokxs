package o;

import com.okinc.business.dex.tee.domain.usecase.limit.TeeGetLimitOrderDetailUseCase$getOrderDetailResult$1;
import com.okinc.business.dex.tee.domain.usecase.limit.TeeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19743gNr {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final gMV AEQbTJ;
    public final C19742gNq EZpvd;

    @yCM
    public C19743gNr(@NotNull gMV gmv, @NotNull C19742gNq c19742gNq) {
        Intrinsics.checkNotNullParameter(gmv, "");
        Intrinsics.checkNotNullParameter(c19742gNq, "");
        this.AEQbTJ = gmv;
        this.EZpvd = c19742gNq;
    }

    /* JADX INFO: renamed from: o.gNr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gNr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: getOrderDetailResult-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8602getOrderDetailResultBWLJW6A$default(C19743gNr c19743gNr, java.lang.Integer num, OrderStrategyType orderStrategyType, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return c19743gNr.copydefault(num, orderStrategyType, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.Integer num, @NotNull OrderStrategyType orderStrategyType, @NotNull java.lang.String str, @NotNull Continuation<? super Result<OrderDetailResult>> continuation) {
        TeeGetLimitOrderDetailUseCase$getOrderDetailResult$1 teeGetLimitOrderDetailUseCase$getOrderDetailResult$1;
        if (continuation instanceof TeeGetLimitOrderDetailUseCase$getOrderDetailResult$1) {
            teeGetLimitOrderDetailUseCase$getOrderDetailResult$1 = (TeeGetLimitOrderDetailUseCase$getOrderDetailResult$1) continuation;
            int i = teeGetLimitOrderDetailUseCase$getOrderDetailResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeGetLimitOrderDetailUseCase$getOrderDetailResult$1.label = i - Integer.MIN_VALUE;
            } else {
                teeGetLimitOrderDetailUseCase$getOrderDetailResult$1 = new TeeGetLimitOrderDetailUseCase$getOrderDetailResult$1(this, continuation);
            }
        }
        java.lang.Object obj = teeGetLimitOrderDetailUseCase$getOrderDetailResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeGetLimitOrderDetailUseCase$getOrderDetailResult$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        teeGetLimitOrderDetailUseCase$getOrderDetailResult$1.label = 1;
        java.lang.Object objEZpvd = EZpvd(num, orderStrategyType, str, teeGetLimitOrderDetailUseCase$getOrderDetailResult$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.Integer num, OrderStrategyType orderStrategyType, java.lang.String str, Continuation<? super Result<OrderDetailResult>> continuation) throws java.lang.Throwable {
        TeeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1 teeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1;
        C19743gNr c19743gNr;
        if (continuation instanceof TeeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1) {
            teeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1 = (TeeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1) continuation;
            int i = teeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1.label = i - Integer.MIN_VALUE;
            } else {
                teeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1 = new TeeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = teeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            gMV gmv = this.AEQbTJ;
            int type = orderStrategyType.getType();
            teeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1.L$0 = this;
            teeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1.label = 1;
            objAEQbTJ = gmv.AEQbTJ(num, type, str, teeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c19743gNr = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c19743gNr = (C19743gNr) teeGetLimitOrderDetailUseCase$getRemoteOrderDetailResult$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(c19743gNr.EZpvd.KWHzl((LimitOrderDetailBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()));
        }
        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()));
    }
}
