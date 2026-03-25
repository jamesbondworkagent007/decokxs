package o;

import com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequestParam;
import com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeResponse;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatRequest;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingSocketUseCase$subscribeCTSocket$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gWM {
    public final gLS EZpvd;
    public final InterfaceC20053gZd KWHzl;

    @yCM
    public gWM(@NotNull InterfaceC20053gZd interfaceC20053gZd, @NotNull gLS gls) {
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        Intrinsics.checkNotNullParameter(gls, "");
        this.KWHzl = interfaceC20053gZd;
        this.EZpvd = gls;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull CopyTradeStatRequest.TimeRange timeRange, java.lang.String str, java.lang.String str2, int i, @NotNull Continuation<? super AbstractC43419rot<java.lang.String, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        CopyTradingSocketUseCase$subscribeCTSocket$1 copyTradingSocketUseCase$subscribeCTSocket$1;
        if (continuation instanceof CopyTradingSocketUseCase$subscribeCTSocket$1) {
            copyTradingSocketUseCase$subscribeCTSocket$1 = (CopyTradingSocketUseCase$subscribeCTSocket$1) continuation;
            int i2 = copyTradingSocketUseCase$subscribeCTSocket$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                copyTradingSocketUseCase$subscribeCTSocket$1.label = i2 - Integer.MIN_VALUE;
            } else {
                copyTradingSocketUseCase$subscribeCTSocket$1 = new CopyTradingSocketUseCase$subscribeCTSocket$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = copyTradingSocketUseCase$subscribeCTSocket$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = copyTradingSocketUseCase$subscribeCTSocket$1.label;
        int i4 = 1;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC20053gZd interfaceC20053gZd = this.KWHzl;
            java.lang.String str3 = str == null ? "" : str;
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = this.EZpvd.AEQbTJ();
            java.lang.String str4 = null;
            byte b = 0;
            java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
            CTSubscribeRequest cTSubscribeRequest = new CTSubscribeRequest(str4, new CTSubscribeRequestParam(strDbNXlk == null ? "" : strDbNXlk, str3, 0, timeRange.getCode(), str2 == null ? "" : str2, i, 4, (DefaultConstructorMarker) null), i4, (DefaultConstructorMarker) (b == true ? 1 : 0));
            copyTradingSocketUseCase$subscribeCTSocket$1.label = 1;
            objCopydefault = interfaceC20053gZd.copydefault(cTSubscribeRequest, copyTradingSocketUseCase$subscribeCTSocket$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objCopydefault;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC43419rot.StateListAnimator(((CTSubscribeResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getRequestId());
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ java.lang.Object subscribeCTSocket$default(gWM gwm, CopyTradeStatRequest.TimeRange timeRange, java.lang.String str, java.lang.String str2, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            timeRange = CopyTradeStatRequest.TimeRange.LastSevenDay;
        }
        CopyTradeStatRequest.TimeRange timeRange2 = timeRange;
        java.lang.String str3 = (i2 & 2) != 0 ? null : str;
        java.lang.String str4 = (i2 & 4) != 0 ? null : str2;
        if ((i2 & 8) != 0) {
            i = 1;
        }
        return gwm.OLrzqt(timeRange2, str3, str4, i, continuation);
    }

    public static /* synthetic */ java.lang.Object unSubscribeCTSocket$default(gWM gwm, CopyTradeStatRequest.TimeRange timeRange, java.lang.String str, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            timeRange = CopyTradeStatRequest.TimeRange.LastSevenDay;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return gwm.KWHzl(timeRange, str, i, continuation);
    }

    public final java.lang.Object KWHzl(@NotNull CopyTradeStatRequest.TimeRange timeRange, java.lang.String str, int i, @NotNull Continuation<? super AbstractC43419rot<? extends JsonElement, ? extends java.lang.Exception>> continuation) {
        InterfaceC20053gZd interfaceC20053gZd = this.KWHzl;
        java.lang.String str2 = str == null ? "" : str;
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = this.EZpvd.AEQbTJ();
        java.lang.String str3 = null;
        byte b = 0;
        java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
        return interfaceC20053gZd.EZpvd(new CTSubscribeRequest(str3, new CTSubscribeRequestParam(strDbNXlk == null ? "" : strDbNXlk, str2, 0, timeRange.getCode(), (java.lang.String) null, i, 20, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) (b == true ? 1 : 0)), continuation);
    }
}
