package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.DcdBotQuotesDetail;
import com.okinc.unify_trade.biz.DcdQuotesReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xAx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54235xAx extends xKE<java.util.List<? extends DcdBotQuotesDetail>> {
    public DcdQuotesReq AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull DcdQuotesReq dcdQuotesReq) {
        Intrinsics.checkNotNullParameter(dcdQuotesReq, "");
        this.AEQbTJ = dcdQuotesReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.DcdBotQuotesDetail>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends DcdBotQuotesDetail>>> EZpvd() {
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        KSerializer<DcdQuotesReq> kSerializerSerializer = DcdQuotesReq.Companion.serializer();
        DcdQuotesReq dcdQuotesReq = this.AEQbTJ;
        if (dcdQuotesReq == null) {
            Intrinsics.gEmmrt("");
            dcdQuotesReq = null;
        }
        java.lang.String strKWHzl = c33489mxS.KWHzl(kSerializerSerializer, dcdQuotesReq);
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).fetchDcdQuotes((java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(c56529yIt), BuiltinSerializersKt.serializer(c56529yIt)), strKWHzl));
    }
}
