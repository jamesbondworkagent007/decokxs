package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.futures_grid.domain.AdjustPositionMarginBalanceUseCase$execute$1;
import com.okinc.tradingbot.impl.futures_grid.dto.AdjustMarginBalanceRequest;
import com.okinc.tradingbot.impl.futures_grid.dto.AdjustMarginBalanceResponse;
import com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vfk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51053vfk extends vNH<ActionBar, StateListAnimator> {
    public final InterfaceC50055vAf AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C51053vfk(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC50055vAf;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.vfk$ActionBar */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.Boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final MarginBalanceType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, MarginBalanceType marginBalanceType, java.lang.Boolean bool, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                marginBalanceType = actionBar.copydefault;
            }
            MarginBalanceType marginBalanceType2 = marginBalanceType;
            if ((i & 4) != 0) {
                bool = actionBar.KWHzl;
            }
            java.lang.Boolean bool2 = bool;
            if ((i & 8) != 0) {
                str2 = actionBar.OLrzqt;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                str3 = actionBar.EZpvd;
            }
            return actionBar.AEQbTJ(str, marginBalanceType2, bool2, str4, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.String str, @NotNull MarginBalanceType marginBalanceType, java.lang.Boolean bool, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(marginBalanceType, "");
            return new ActionBar(str, marginBalanceType, bool, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MarginBalanceType KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && this.copydefault == actionBar.copydefault && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            java.lang.Boolean bool = this.KWHzl;
            int iHashCode3 = bool == null ? 0 : bool.hashCode();
            java.lang.String str = this.OLrzqt;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.EZpvd;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.AEQbTJ + ", type=" + this.copydefault + ", reinvest=" + this.KWHzl + ", amt=" + this.OLrzqt + ", percent=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull MarginBalanceType marginBalanceType, java.lang.Boolean bool, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(marginBalanceType, "");
            this.AEQbTJ = str;
            this.copydefault = marginBalanceType;
            this.KWHzl = bool;
            this.OLrzqt = str2;
            this.EZpvd = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:19) call: o.vfk.ActionBar.<init>(java.lang.String, com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, MarginBalanceType marginBalanceType, java.lang.Boolean bool, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, marginBalanceType, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
        }
    }

    /* JADX INFO: renamed from: o.vfk$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(algoId=" + this.copydefault + ", algoClOrdId=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull ActionBar actionBar, @NotNull Continuation<? super StateListAnimator> continuation) throws java.lang.Throwable {
        AdjustPositionMarginBalanceUseCase$execute$1 adjustPositionMarginBalanceUseCase$execute$1;
        AbstractC43419rot actionBar2;
        AbstractC43419rot stateListAnimator;
        AbstractC43419rot actionBar3;
        ResponseData responseData;
        if (continuation instanceof AdjustPositionMarginBalanceUseCase$execute$1) {
            adjustPositionMarginBalanceUseCase$execute$1 = (AdjustPositionMarginBalanceUseCase$execute$1) continuation;
            int i = adjustPositionMarginBalanceUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adjustPositionMarginBalanceUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                adjustPositionMarginBalanceUseCase$execute$1 = new AdjustPositionMarginBalanceUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = adjustPositionMarginBalanceUseCase$execute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = adjustPositionMarginBalanceUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                AdjustMarginBalanceRequest adjustMarginBalanceRequest = new AdjustMarginBalanceRequest(actionBar.copydefault(), actionBar.KWHzl(), actionBar.AEQbTJ(), actionBar.OLrzqt(), actionBar.EZpvd());
                InterfaceC50055vAf interfaceC50055vAf = this.AEQbTJ;
                adjustPositionMarginBalanceUseCase$execute$1.label = 1;
                objCopydefault = interfaceC50055vAf.copydefault(adjustMarginBalanceRequest, adjustPositionMarginBalanceUseCase$execute$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            responseData = (ResponseData) objCopydefault;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar2 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
            AdjustMarginBalanceResponse adjustMarginBalanceResponse = (AdjustMarginBalanceResponse) actionBar3.AEQbTJ();
            return new StateListAnimator(adjustMarginBalanceResponse.getAlgoId(), adjustMarginBalanceResponse.getAlgoClOrdId());
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar2;
        if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            actionBar3 = new AbstractC43419rot.StateListAnimator((AdjustMarginBalanceResponse) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()));
        } else {
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar3 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
        }
        AdjustMarginBalanceResponse adjustMarginBalanceResponse2 = (AdjustMarginBalanceResponse) actionBar3.AEQbTJ();
        return new StateListAnimator(adjustMarginBalanceResponse2.getAlgoId(), adjustMarginBalanceResponse2.getAlgoClOrdId());
    }
}
