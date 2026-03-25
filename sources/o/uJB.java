package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.botList.domain.GetBacktestListPreviewUseCase$execute$1;
import com.okinc.tradingbot.impl.botList.dto.BacktestListPreviewDto;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class uJB extends vNH<Unit, BacktestListPreviewDto> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC50055vAf KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uJB(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC50055vAf;
        this.OLrzqt = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uJB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final uJB EZpvd() {
            return ((InterfaceC51009vet) C58114yvF.OLrzqt(C32979mnm.EZpvd.OLrzqt(), InterfaceC51009vet.class)).hrjNmC();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Unit unit, @NotNull Continuation<? super BacktestListPreviewDto> continuation) throws java.lang.Throwable {
        GetBacktestListPreviewUseCase$execute$1 getBacktestListPreviewUseCase$execute$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        AbstractC43419rot actionBar2;
        ResponseData responseData;
        if (continuation instanceof GetBacktestListPreviewUseCase$execute$1) {
            getBacktestListPreviewUseCase$execute$1 = (GetBacktestListPreviewUseCase$execute$1) continuation;
            int i = getBacktestListPreviewUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getBacktestListPreviewUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getBacktestListPreviewUseCase$execute$1 = new GetBacktestListPreviewUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getBacktestListPreviewUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getBacktestListPreviewUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC50055vAf interfaceC50055vAf = this.KWHzl;
                getBacktestListPreviewUseCase$execute$1.label = 1;
                objAEQbTJ = interfaceC50055vAf.AEQbTJ(getBacktestListPreviewUseCase$execute$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
            return actionBar2.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            BacktestListPreviewDto backtestListPreviewDto = (BacktestListPreviewDto) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            if (backtestListPreviewDto == null) {
                backtestListPreviewDto = new BacktestListPreviewDto(0, 0, 0, 7, (DefaultConstructorMarker) null);
            }
            actionBar2 = new AbstractC43419rot.StateListAnimator(backtestListPreviewDto);
        } else {
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar2 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
        }
        return actionBar2.AEQbTJ();
    }
}
