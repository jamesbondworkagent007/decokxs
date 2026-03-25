package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_positions.data.Ccy;
import com.okinc.planet.biz_positions.data.CurrentPosType;
import com.okinc.planet.biz_positions.data.CurrentPosition;
import com.okinc.planet.biz_positions.data.Position;
import com.okinc.planet.biz_positions.data.YieldDetails;
import com.okinc.planet.biz_positions.domain.FetchCurrentFuturePositionUseCase$execute$1;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import com.okinc.planet.format.InstId;
import com.okinc.planet.serializer.PlanetNumericString;
import java.math.BigDecimal;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.InterfaceC46072tGu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46074tGw extends AbstractC46360tRl<Application, kotlin.Pair<? extends InterfaceC46072tGu.StateListAnimator, ? extends java.util.List<? extends InterfaceC46072tGu.Activity>>> {
    public final CoroutineDispatcher KWHzl;
    public final tQP OLrzqt;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.AbstractC46360tRl
    public /* synthetic */ java.lang.Object AEQbTJ(Application application, Continuation<? super kotlin.Pair<? extends InterfaceC46072tGu.StateListAnimator, ? extends java.util.List<? extends InterfaceC46072tGu.Activity>>> continuation) {
        return KWHzl(application, (Continuation<? super kotlin.Pair<InterfaceC46072tGu.StateListAnimator, ? extends java.util.List<InterfaceC46072tGu.Activity>>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46074tGw(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull tQP tqp) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(tqp, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = tqp;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x0050, B:25:0x0058, B:27:0x005e, B:28:0x006b), top: B:46:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Application application, @NotNull Continuation<? super kotlin.Pair<InterfaceC46072tGu.StateListAnimator, ? extends java.util.List<InterfaceC46072tGu.Activity>>> continuation) throws java.lang.Throwable {
        FetchCurrentFuturePositionUseCase$execute$1 fetchCurrentFuturePositionUseCase$execute$1;
        java.lang.Throwable th;
        C46074tGw c46074tGw;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof FetchCurrentFuturePositionUseCase$execute$1) {
            fetchCurrentFuturePositionUseCase$execute$1 = (FetchCurrentFuturePositionUseCase$execute$1) continuation;
            int i = fetchCurrentFuturePositionUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchCurrentFuturePositionUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchCurrentFuturePositionUseCase$execute$1 = new FetchCurrentFuturePositionUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = fetchCurrentFuturePositionUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchCurrentFuturePositionUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                tQP tqp = this.OLrzqt;
                java.lang.String strAEQbTJ = application.AEQbTJ();
                fetchCurrentFuturePositionUseCase$execute$1.L$0 = this;
                fetchCurrentFuturePositionUseCase$execute$1.label = 1;
                objEZpvd = tqp.EZpvd(strAEQbTJ, fetchCurrentFuturePositionUseCase$execute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c46074tGw = this;
                responseData = (ResponseData) objEZpvd;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                c46074tGw = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c46074tGw = (C46074tGw) fetchCurrentFuturePositionUseCase$execute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                responseData = (ResponseData) objEZpvd;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        CurrentPosition currentPosition = (CurrentPosition) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar.AEQbTJ());
        if (currentPosition == null || currentPosition.getPosData().isEmpty()) {
            return C56390yDp.OLrzqt(InterfaceC46072tGu.StateListAnimator.Companion.AEQbTJ(), yDY.AhwBna());
        }
        InterfaceC46072tGu.StateListAnimator stateListAnimatorOLrzqt = c46074tGw.OLrzqt(currentPosition);
        java.util.List<Position> posData = currentPosition.getPosData();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(posData, 10));
        java.util.Iterator<T> it = posData.iterator();
        while (it.hasNext()) {
            arrayList.add(c46074tGw.AEQbTJ((Position) it.next()));
        }
        return C56390yDp.OLrzqt(stateListAnimatorOLrzqt, arrayList);
    }

    public final InterfaceC46072tGu.Activity AEQbTJ(@NotNull Position position) {
        Intrinsics.checkNotNullParameter(position, "");
        java.lang.String strAEQbTJ = PlanetNumericString.AEQbTJ(position.getPos());
        java.lang.String posId = position.getPosId();
        java.lang.String cTime = position.getCTime();
        java.lang.String strEZpvd = InstId.EZpvd(position.getInstId());
        java.lang.String instType = position.getInstType();
        tRU truAEQbTJ = tRQ.AEQbTJ(position.getInstType(), position.getPosSide(), strAEQbTJ);
        java.lang.String mgnModeText = position.getMgnModeText();
        java.lang.String lever = position.getLever();
        java.lang.String quoteCcy = position.getQuoteCcy();
        java.lang.String marginCcy = position.getMarginCcy();
        BigDecimal upl = position.getUpl();
        BigDecimal fee = position.getFee();
        BigDecimal pnl = position.getPnl();
        BigDecimal fundingFee = position.getFundingFee();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        return new InterfaceC46072tGu.Activity(posId, cTime, strEZpvd, instType, truAEQbTJ, mgnModeText, lever, quoteCcy, marginCcy, upl, new YieldDetails.ContractCurrentYieldDetails(fee, pnl, fundingFee, bigDecimal, Ccy.m6962constructorimpl(position.getQuoteCcy()), "", position.getUpl(), CurrentPosType.InvalidPosType, position.getRealizedPnl(), null), position.getUplRatio(), position.getPosCcy(), strAEQbTJ, position.m7001getLast8XBoXJE(), position.m7004getNotionalUsd8XBoXJE(), position.m7002getMargin8XBoXJE(), position.getMgnRatio(), PlanetNumericString.AEQbTJ(position.getAvgPx()), position.m7000getBePx8XBoXJE(), position.m7003getMarkPx8XBoXJE(), PlanetNumericString.AEQbTJ(position.getLiqPx()), null, 4194304, null);
    }

    public final InterfaceC46072tGu.StateListAnimator OLrzqt(CurrentPosition currentPosition) {
        return new InterfaceC46072tGu.StateListAnimator(currentPosition.getLongLever(), currentPosition.getShortLever(), null, 4, null);
    }

    /* JADX INFO: renamed from: o.tGw$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.tGw.Application.<init>(java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-XHqIJw0$default, reason: not valid java name */
        public static /* synthetic */ Application m8718copyXHqIJw0$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.AEQbTJ;
            }
            return application.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && PlanetUniqueName.KWHzl(this.AEQbTJ, ((Application) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return PlanetUniqueName.OLrzqt(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(uniqueName=" + PlanetUniqueName.copydefault(this.AEQbTJ) + ")";
        }

        public Application(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }
}
