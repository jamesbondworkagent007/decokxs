package o;

import androidx.lifecycle.Lifecycle;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_find.data.RankTag;
import com.okinc.unify_find.net.BizFindApiService;
import com.okinc.unify_trade.exception.BizSystemException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xli, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55532xli {
    public InterfaceC58151yvq<Lifecycle.Event> KWHzl;

    public C55532xli(@NotNull InterfaceC58151yvq<Lifecycle.Event> interfaceC58151yvq) {
        Intrinsics.checkNotNullParameter(interfaceC58151yvq, "");
        this.KWHzl = interfaceC58151yvq;
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull final InterfaceC55701xos<java.util.List<RankTag>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        AbstractC58185ywX<R> abstractC58185ywXEZpvd = ((BizFindApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizFindApiService.class), null, 1, null)).getConceptTagKLine(map).EZpvd((InterfaceC58241yxa<? super ResponseData<java.util.List<RankTag>>, ? extends R>) this.KWHzl.EZpvd());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return C33024moe.subscribeOnIO$default(abstractC58185ywXEZpvd, new Function1() { // from class: o.xlg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55532xli.OLrzqt(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xlh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55532xli.AEQbTJ(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }
}
