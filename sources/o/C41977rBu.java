package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceTokenResp;
import com.okinc.ok_kyc_core.domain.usecase.GetAlifaceTokenUseCase$invoke$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41977rBu {
    public final InterfaceC41969rBm copydefault;

    public C41977rBu(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.copydefault = interfaceC41969rBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super kotlin.Pair<java.lang.String, java.lang.String>> continuation) throws java.lang.Throwable {
        GetAlifaceTokenUseCase$invoke$1 getAlifaceTokenUseCase$invoke$1;
        if (continuation instanceof GetAlifaceTokenUseCase$invoke$1) {
            getAlifaceTokenUseCase$invoke$1 = (GetAlifaceTokenUseCase$invoke$1) continuation;
            int i = getAlifaceTokenUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAlifaceTokenUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAlifaceTokenUseCase$invoke$1 = new GetAlifaceTokenUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getAlifaceTokenUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAlifaceTokenUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC41969rBm interfaceC41969rBm = this.copydefault;
                getAlifaceTokenUseCase$invoke$1.label = 1;
                objKWHzl = interfaceC41969rBm.KWHzl(getAlifaceTokenUseCase$invoke$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            java.lang.String token = ((AlifaceTokenResp) ((AbstractC43728ruk) objKWHzl).AEQbTJ()).getToken();
            if (token == null) {
                token = "";
            }
            return new kotlin.Pair(token, "");
        } catch (java.lang.Throwable th) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_AliVerify_GetToken_RPSDK", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rBr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C41977rBu.OLrzqt(th, (EventParamsList) obj);
                }
            });
            java.lang.String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            return new kotlin.Pair("", message);
        }
    }

    public static final Unit OLrzqt(java.lang.Throwable th, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("message", C33129mqd.gEmmrt(th.getMessage()), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }
}
