package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.LeverageInfo;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56084xwD {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    public final java.util.ArrayList<TradeCoinInfo> KWHzl() {
        xNQ xnqEZpvd;
        java.util.ArrayList<TradeCoinInfo> arrayListKWHzl;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        return (interfaceC54581xNrCopydefault == null || (xnqEZpvd = interfaceC54581xNrCopydefault.EZpvd()) == null || (arrayListKWHzl = xnqEZpvd.KWHzl()) == null) ? new java.util.ArrayList<>() : arrayListKWHzl;
    }

    public final UserTradeConfigInfo AEQbTJ() {
        C54606xOp c54606xOpOcIXYQ;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (c54606xOpOcIXYQ = interfaceC54581xNrCopydefault.OcIXYQ()) == null) {
            return null;
        }
        return c54606xOpOcIXYQ.dNCPSb();
    }

    /* JADX INFO: renamed from: o.xwD$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xwD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final boolean djBIcL() {
        UserTradeConfigInfo userTradeConfigInfoAEQbTJ = AEQbTJ();
        return userTradeConfigInfoAEQbTJ != null && 1 == userTradeConfigInfoAEQbTJ.getRoleType();
    }

    public final boolean valueOf() {
        UserTradeConfigInfo userTradeConfigInfoAEQbTJ = AEQbTJ();
        return userTradeConfigInfoAEQbTJ != null && 1 == userTradeConfigInfoAEQbTJ.getSpotRoleType();
    }

    public final boolean gEmmrt() {
        UserTradeConfigInfo userTradeConfigInfoAEQbTJ = AEQbTJ();
        return userTradeConfigInfoAEQbTJ != null && 2 == userTradeConfigInfoAEQbTJ.getRoleType();
    }

    public final java.util.List<java.lang.String> OLrzqt() {
        UserTradeConfigInfo userTradeConfigInfoAEQbTJ = AEQbTJ();
        if (userTradeConfigInfoAEQbTJ != null) {
            return userTradeConfigInfoAEQbTJ.getSpotTraderInsts();
        }
        return null;
    }

    public final java.util.ArrayList<java.lang.String> EZpvd() {
        C54592xOb c54592xObORxRYg;
        java.util.ArrayList<java.lang.String> arrayListCopydefault;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        return (interfaceC54581xNrCopydefault == null || (c54592xObORxRYg = interfaceC54581xNrCopydefault.ORxRYg()) == null || (arrayListCopydefault = c54592xObORxRYg.copydefault()) == null) ? xVL.EZpvd.EZpvd() : arrayListCopydefault;
    }

    public java.util.List<ChargeGroupData> copydefault() {
        C54591xOa c54591xOaAwvSrB;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (c54591xOaAwvSrB = interfaceC54581xNrCopydefault.AwvSrB()) == null) {
            return null;
        }
        return c54591xOaAwvSrB.uzCIH();
    }

    public InterfaceC58217yxC copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull final InterfaceC55701xos<java.util.List<LeverageInfo>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getLeverageInfo(str, str2, str3), new Function1() { // from class: o.xwE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56084xwD.KWHzl(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xwK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56084xwD.EZpvd(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit KWHzl(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public java.lang.String AYXKKw() {
        java.lang.String posMode;
        UserTradeConfigInfo userTradeConfigInfoAEQbTJ = AEQbTJ();
        return (userTradeConfigInfoAEQbTJ == null || (posMode = userTradeConfigInfoAEQbTJ.getPosMode()) == null) ? "" : posMode;
    }

    public static final Unit EZpvd(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }
}
