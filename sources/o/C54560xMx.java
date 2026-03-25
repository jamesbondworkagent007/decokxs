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

/* JADX INFO: renamed from: o.xMx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54560xMx {
    public final java.util.ArrayList<InstrumentInfo> EZpvd = new java.util.ArrayList<>();
    public TradeConfigData OLrzqt;

    public final void OLrzqt(@NotNull final Function1<? super ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        final xMD xmd = new xMD();
        xmd.KWHzl(new Function1() { // from class: o.xMu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54560xMx.copydefault(xmd, this, (kotlin.Pair) obj);
            }
        });
        xmd.copydefault(new Function1() { // from class: o.xMz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54560xMx.EZpvd(function1, (kotlin.Pair) obj);
            }
        });
        xmd.OLrzqt(new Function1() { // from class: o.xMB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54560xMx.OLrzqt(function1, this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        xmd.fIwbmz();
    }

    public static final Unit copydefault(xMD xmd, C54560xMx c54560xMx, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.EZpvd("RefreshOptionsTask", "runLoaderBasic resp: " + pair.getFirst());
        java.lang.String str = (java.lang.String) pair.getFirst();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) xmd.KWHzl())) {
            c54560xMx.EZpvd.clear();
            java.util.ArrayList<InstrumentInfo> arrayList = c54560xMx.EZpvd;
            java.lang.Object data = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data, "");
            arrayList.addAll((java.util.ArrayList) data);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) xmd.EZpvd())) {
            java.lang.Object data2 = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data2, "");
            if (C33129mqd.KWHzl((java.util.Collection) data2)) {
                java.lang.Object data3 = ((ResponseData) pair.getSecond()).getData();
                Intrinsics.copydefault(data3, "");
                c54560xMx.OLrzqt = (TradeConfigData) CollectionsKt___CollectionsKt.firstOrNull((java.util.ArrayList) data3);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.EZpvd("RefreshOptionsTask", "runLoaderBasic error: " + ((ResponseData) pair.getSecond()).getMsg());
        function1.invoke(new ResponseData(0, ((ResponseData) pair.getSecond()).getMsg(), null, null, null, null, 61, null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, C54560xMx c54560xMx, boolean z) {
        pUU.EZpvd("RefreshOptionsTask", "runLoaderBasic status: " + z);
        if (z) {
            function1.invoke(new ResponseData(0, null, null, null, new kotlin.Pair(c54560xMx.EZpvd, c54560xMx.OLrzqt), null, 46, null));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull final Function1<? super ResponseData<InstrumentInfo>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        xBP xbp = new xBP();
        xbp.AEQbTJ("OPTION");
        xbp.OLrzqt(str);
        xbp.KWHzl(new Function1() { // from class: o.xMA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54560xMx.copydefault(function1, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbp, 0L, 1, null);
    }

    public static final Unit copydefault(Function1 function1, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.ArrayList arrayList = (java.util.ArrayList) responseData.getData();
        pUU.EZpvd("RefreshOptionsTask", "loadBizDetail: " + (arrayList != null ? java.lang.Integer.valueOf(arrayList.hashCode()) : null));
        int code = responseData.getCode();
        java.lang.String msg = responseData.getMsg();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) responseData.getData();
        function1.invoke(new ResponseData(code, msg, null, null, arrayList2 != null ? (InstrumentInfo) CollectionsKt___CollectionsKt.firstOrNull(arrayList2) : null, null, 44, null));
        return Unit.INSTANCE;
    }
}
