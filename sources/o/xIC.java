package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.UserTierData;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xIC {
    public static final xIC AEQbTJ = new xIC();

    private xIC() {
    }

    public final InterfaceC58217yxC KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, @NotNull final InterfaceC55701xos<java.util.List<UserTierData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class))).getTier(str, str2, str3, str5, str6), new Function1() { // from class: o.xIF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIC.EZpvd(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIC.EZpvd(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }
}
