package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xMa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54537xMa {
    public final java.util.ArrayList<InstrumentInfo> EZpvd = new java.util.ArrayList<>();
    public TradeConfigData copydefault;

    public final void copydefault(@NotNull final Function1<? super ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        final C54544xMh c54544xMh = new C54544xMh();
        c54544xMh.KWHzl(new Function1() { // from class: o.xMd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54537xMa.OLrzqt(c54544xMh, this, (kotlin.Pair) obj);
            }
        });
        c54544xMh.copydefault(new Function1() { // from class: o.xMe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54537xMa.AEQbTJ(function1, (kotlin.Pair) obj);
            }
        });
        c54544xMh.OLrzqt(new Function1() { // from class: o.xMj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54537xMa.OLrzqt(function1, this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c54544xMh.fIwbmz();
    }

    public static final Unit OLrzqt(C54544xMh c54544xMh, C54537xMa c54537xMa, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.EZpvd("RefreshMarginTask", "runLoaderBasic resp: " + pair.getFirst());
        java.lang.String str = (java.lang.String) pair.getFirst();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54544xMh.copydefault())) {
            c54537xMa.EZpvd.clear();
            java.util.ArrayList<InstrumentInfo> arrayList = c54537xMa.EZpvd;
            java.lang.Object data = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data, "");
            arrayList.addAll((java.util.ArrayList) data);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54544xMh.OLrzqt())) {
            java.lang.Object data2 = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data2, "");
            if (C33129mqd.KWHzl((java.util.Collection) data2)) {
                java.lang.Object data3 = ((ResponseData) pair.getSecond()).getData();
                Intrinsics.copydefault(data3, "");
                c54537xMa.copydefault = (TradeConfigData) CollectionsKt___CollectionsKt.firstOrNull((java.util.ArrayList) data3);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function1 function1, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.EZpvd("RefreshMarginTask", "runLoaderBasic error: " + ((ResponseData) pair.getSecond()).getMsg());
        function1.invoke(new ResponseData(0, ((ResponseData) pair.getSecond()).getMsg(), null, null, null, null, 61, null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, C54537xMa c54537xMa, boolean z) {
        pUU.EZpvd("RefreshMarginTask", "runLoaderBasic status: " + z);
        if (z) {
            function1.invoke(new ResponseData(0, null, null, null, new kotlin.Pair(c54537xMa.EZpvd, c54537xMa.copydefault), null, 46, null));
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull final Function1<? super ResponseData<InstrumentInfo>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        xBP xbp = new xBP();
        xbp.AEQbTJ("MARGIN");
        xbp.OLrzqt(str);
        xbp.KWHzl(new Function1() { // from class: o.xMf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54537xMa.KWHzl(function1, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbp, 0L, 1, null);
    }

    public static final Unit KWHzl(Function1 function1, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.ArrayList arrayList = (java.util.ArrayList) responseData.getData();
        pUU.EZpvd("RefreshMarginTask", "loadBizDetail: " + (arrayList != null ? java.lang.Integer.valueOf(arrayList.hashCode()) : null));
        int code = responseData.getCode();
        java.lang.String msg = responseData.getMsg();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) responseData.getData();
        function1.invoke(new ResponseData(code, msg, null, null, arrayList2 != null ? (InstrumentInfo) CollectionsKt___CollectionsKt.firstOrNull(arrayList2) : null, null, 44, null));
        return Unit.INSTANCE;
    }
}
