package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56083xwC {
    public InterfaceC58217yxC copydefault(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull java.lang.String str6, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.Boolean bool3, java.lang.String str13, java.lang.String str14, java.lang.Boolean bool4, @NotNull java.lang.String str15, java.lang.String str16, @NotNull final InterfaceC55701xos<MaxAvailableResp> interfaceC55701xos) {
        java.lang.String str17;
        java.lang.String str18;
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        if (bool2 != null && bool2.booleanValue()) {
            str18 = "buy";
        } else {
            if (bool2 == null || bool2.booleanValue()) {
                str17 = null;
                return C33024moe.subscribeOnIO$default(bizApiService.getMaxAvailable(str, str2, str3, str4, str5, str6, bool, str17, str7, str8, str9, str10, str11, str12, bool3, str13, str14, bool4, str15, str16), new Function1() { // from class: o.xwB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C56083xwC.OLrzqt(interfaceC55701xos, (java.lang.Throwable) obj);
                    }
                }, (Function0) null, new Function1() { // from class: o.xwF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C56083xwC.EZpvd(interfaceC55701xos, (ResponseData) obj);
                    }
                }, 2, (java.lang.Object) null);
            }
            str18 = "sell";
        }
        str17 = str18;
        return C33024moe.subscribeOnIO$default(bizApiService.getMaxAvailable(str, str2, str3, str4, str5, str6, bool, str17, str7, str8, str9, str10, str11, str12, bool3, str13, str14, bool4, str15, str16), new Function1() { // from class: o.xwB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56083xwC.OLrzqt(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xwF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56083xwC.EZpvd(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        MaxAvailableResp maxAvailableResp;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                maxAvailableResp = (MaxAvailableResp) ((java.util.List) data).get(0);
            } else {
                maxAvailableResp = null;
            }
            interfaceC55701xos.EZpvd(true, maxAvailableResp, null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }
}
