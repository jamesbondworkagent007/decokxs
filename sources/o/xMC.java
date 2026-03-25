package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import com.okinc.unify_trade.trade.biz.task.swap.SwapLoaderInfo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xMC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public TradeConfigData AEQbTJ;
    public xCB EZpvd;
    public final java.util.ArrayList<InstrumentInfo> OLrzqt = new java.util.ArrayList<>();
    public java.util.ArrayList<CountDownInfo> copydefault;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xMC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void copydefault(@NotNull final Function1<? super ResponseData<SwapLoaderInfo>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        final xMG xmg = new xMG();
        xmg.KWHzl(new Function1() { // from class: o.xME
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xMC.KWHzl(xmg, this, (kotlin.Pair) obj);
            }
        });
        xmg.copydefault(new Function1() { // from class: o.xMF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xMC.AEQbTJ(function1, (kotlin.Pair) obj);
            }
        });
        xmg.OLrzqt(new Function1() { // from class: o.xMH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xMC.EZpvd(function1, this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        xmg.fIwbmz();
    }

    public static final Unit KWHzl(xMG xmg, xMC xmc, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.EZpvd("RefreshSwapTask", "runLoaderBasic resp: " + pair.getFirst());
        java.lang.String str = (java.lang.String) pair.getFirst();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) xmg.AEQbTJ())) {
            java.lang.Object data = ((ResponseData) pair.getSecond()).getData();
            java.util.ArrayList arrayList = data instanceof java.util.ArrayList ? (java.util.ArrayList) data : null;
            pUU.KWHzl("RefreshSwapTask", "instrumentUseCase size =" + (arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null));
            xmc.OLrzqt.clear();
            java.util.ArrayList<InstrumentInfo> arrayList2 = xmc.OLrzqt;
            java.lang.Object data2 = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data2, "");
            arrayList2.addAll((java.util.ArrayList) data2);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) xmg.KWHzl())) {
            java.lang.Object data3 = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data3, "");
            if (C33129mqd.KWHzl((java.util.Collection) data3)) {
                java.lang.Object data4 = ((ResponseData) pair.getSecond()).getData();
                Intrinsics.copydefault(data4, "");
                xmc.AEQbTJ = (TradeConfigData) CollectionsKt___CollectionsKt.firstOrNull((java.util.ArrayList) data4);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) xmg.EZpvd())) {
            java.lang.Object data5 = ((ResponseData) pair.getSecond()).getData();
            if (C33129mqd.KWHzl((java.util.Collection) (data5 instanceof java.util.List ? (java.util.List) data5 : null))) {
                if (xmc.copydefault == null) {
                    xmc.copydefault = new java.util.ArrayList<>();
                }
                java.util.ArrayList<CountDownInfo> arrayList3 = xmc.copydefault;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                java.util.ArrayList<CountDownInfo> arrayList4 = xmc.copydefault;
                if (arrayList4 != null) {
                    xLW xlw = new xLW();
                    java.lang.Object data6 = ((ResponseData) pair.getSecond()).getData();
                    Intrinsics.copydefault(data6, "");
                    arrayList4.addAll(xlw.KWHzl((java.util.List) data6));
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function1 function1, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.KWHzl("RefreshSwapTask", "runLoaderBasic error: " + ((ResponseData) pair.getSecond()).getMsg());
        function1.invoke(new ResponseData(0, ((ResponseData) pair.getSecond()).getMsg(), null, null, null, null, 61, null));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1, xMC xmc, boolean z) {
        pUU.KWHzl("RefreshSwapTask", "runLoaderBasic status: " + z);
        if (z) {
            function1.invoke(new ResponseData(0, null, null, null, new SwapLoaderInfo(xmc.OLrzqt, xmc.AEQbTJ, xmc.copydefault), null, 46, null));
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull final Function1<? super ResponseData<InstrumentInfo>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        xBP xbp = new xBP();
        xbp.AEQbTJ("SWAP");
        xbp.OLrzqt(str);
        xbp.KWHzl(new Function1() { // from class: o.xMI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xMC.OLrzqt(function1, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbp, 0L, 1, null);
    }

    public static final Unit OLrzqt(Function1 function1, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.ArrayList arrayList = (java.util.ArrayList) responseData.getData();
        pUU.EZpvd("RefreshSwapTask", "loadBizDetail: " + (arrayList != null ? java.lang.Integer.valueOf(arrayList.hashCode()) : null));
        int code = responseData.getCode();
        java.lang.String msg = responseData.getMsg();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) responseData.getData();
        function1.invoke(new ResponseData(code, msg, null, null, arrayList2 != null ? (InstrumentInfo) CollectionsKt___CollectionsKt.firstOrNull(arrayList2) : null, null, 44, null));
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull Function1<? super ResponseData<java.util.List<CountDownInfo>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        xCB xcb = this.EZpvd;
        if (xcb != null) {
            xcb.AYXKKw();
        }
        xCB xcb2 = new xCB();
        this.EZpvd = xcb2;
        xcb2.OLrzqt("SWAP");
        xcb2.KWHzl(function1);
        xKK.Activity.execute$default(xcb2, 0L, 1, null);
    }
}
