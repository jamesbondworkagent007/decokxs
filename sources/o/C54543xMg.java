package o;

import com.okinc.base.uploadlog.UpLoadLogException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.StableInstrumentInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import com.okinc.unify_trade.manager.CoinLoanCheckBoxBean;
import com.okinc.unify_trade.trade.biz.task.SpotLoaderInfo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xMg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54543xMg {
    public java.util.ArrayList<CountDownInfo> AEQbTJ;
    public TradeConfigData EZpvd;
    public xCB OLrzqt;
    public final java.util.ArrayList<InstrumentInfo> copydefault = new java.util.ArrayList<>();

    public final void OLrzqt(@NotNull final Function1<? super ResponseData<SpotLoaderInfo>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        xCB xcb = this.OLrzqt;
        if (xcb != null) {
            xcb.AYXKKw();
        }
        final C54554xMr c54554xMr = new C54554xMr();
        c54554xMr.KWHzl(new Function1() { // from class: o.xMn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54543xMg.EZpvd(c54554xMr, this, (kotlin.Pair) obj);
            }
        });
        c54554xMr.copydefault(new Function1() { // from class: o.xMl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54543xMg.copydefault(c54554xMr, function1, (kotlin.Pair) obj);
            }
        });
        c54554xMr.OLrzqt(new Function1() { // from class: o.xMo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54543xMg.OLrzqt(function1, this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c54554xMr.fIwbmz();
    }

    public static final Unit EZpvd(C54554xMr c54554xMr, C54543xMg c54543xMg, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.EZpvd("RefreshSpotTask", "runLoaderBasic resp: " + pair.getFirst());
        java.lang.String str = (java.lang.String) pair.getFirst();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54554xMr.AEQbTJ())) {
            c54543xMg.copydefault.clear();
            java.util.ArrayList<InstrumentInfo> arrayList = c54543xMg.copydefault;
            java.lang.Object data = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data, "");
            arrayList.addAll((java.util.List) data);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54554xMr.KWHzl())) {
            java.lang.Object data2 = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data2, "");
            if (C33129mqd.KWHzl((java.util.Collection) data2)) {
                java.lang.Object data3 = ((ResponseData) pair.getSecond()).getData();
                Intrinsics.copydefault(data3, "");
                c54543xMg.EZpvd = (TradeConfigData) CollectionsKt___CollectionsKt.firstOrNull((java.util.ArrayList) data3);
            } else {
                C6777aVl.Companion.EZpvd(new UpLoadLogException("SpotConfig exception" + c54554xMr.OLrzqt()));
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54554xMr.EZpvd())) {
            java.lang.Object data4 = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data4, "");
            if (C33129mqd.KWHzl((java.util.Collection) data4)) {
                if (c54543xMg.AEQbTJ == null) {
                    c54543xMg.AEQbTJ = new java.util.ArrayList<>();
                }
                java.util.ArrayList<CountDownInfo> arrayList2 = c54543xMg.AEQbTJ;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                java.util.ArrayList<CountDownInfo> arrayList3 = c54543xMg.AEQbTJ;
                if (arrayList3 != null) {
                    xLW xlw = new xLW();
                    java.lang.Object data5 = ((ResponseData) pair.getSecond()).getData();
                    Intrinsics.copydefault(data5, "");
                    arrayList3.addAll(xlw.KWHzl((java.util.List) data5));
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C54554xMr c54554xMr, Function1 function1, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.EZpvd("RefreshSpotTask", "runLoaderBasic error: " + ((ResponseData) pair.getSecond()).getMsg() + " -- tag: " + pair.getFirst());
        if (!Intrinsics.EZpvd(c54554xMr.EZpvd(), pair.getFirst())) {
            function1.invoke(new ResponseData(0, ((ResponseData) pair.getSecond()).getMsg(), null, null, null, null, 61, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, C54543xMg c54543xMg, boolean z) {
        pUU.EZpvd("RefreshSpotTask", "runLoaderBasic status: " + z);
        if (z) {
            function1.invoke(new ResponseData(0, null, null, null, new SpotLoaderInfo(c54543xMg.copydefault, c54543xMg.EZpvd, c54543xMg.AEQbTJ), null, 46, null));
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull Function1<? super ResponseData<java.util.List<CountDownInfo>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        xCB xcb = this.OLrzqt;
        if (xcb != null) {
            xcb.AYXKKw();
        }
        xCB xcb2 = new xCB();
        this.OLrzqt = xcb2;
        xcb2.OLrzqt("SPOT");
        xcb2.KWHzl(function1);
        xKK.Activity.execute$default(xcb2, 0L, 1, null);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull final Function1<? super ResponseData<kotlin.Pair<InstrumentInfo, CoinLoanCheckBoxBean>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        C54794xVo c54794xVo = C54794xVo.copydefault;
        final xLV xlv = new xLV(c54794xVo.AhwBna() || c54794xVo.EZpvd(), str, "SPOT");
        xlv.KWHzl(new Function1() { // from class: o.xMi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54543xMg.AEQbTJ(xlv, objectRef, objectRef2, (kotlin.Pair) obj);
            }
        });
        xlv.copydefault(new Function1() { // from class: o.xMm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54543xMg.EZpvd(xlv, function1, (kotlin.Pair) obj);
            }
        });
        xlv.OLrzqt(new Function1() { // from class: o.xMk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54543xMg.KWHzl(function1, objectRef, objectRef2, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        xlv.fIwbmz();
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.Object] */
    public static final Unit AEQbTJ(xLV xlv, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.EZpvd("RefreshSpotTask", "runLoaderBasic resp: " + pair.getFirst());
        java.lang.String str = (java.lang.String) pair.getFirst();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) xlv.KWHzl())) {
            java.lang.Object data = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data, "");
            objectRef.element = CollectionsKt___CollectionsKt.firstOrNull((java.util.ArrayList) data);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) xlv.copydefault())) {
            java.lang.Object data2 = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data2, "");
            objectRef2.element = CollectionsKt___CollectionsKt.firstOrNull((java.util.ArrayList) data2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(xLV xlv, Function1 function1, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.EZpvd("RefreshSpotTask", "loadBizDetail error: " + ((ResponseData) pair.getSecond()).getMsg() + " -- tag: " + pair.getFirst());
        if (!Intrinsics.EZpvd(xlv.copydefault(), pair.getFirst())) {
            function1.invoke(new ResponseData(0, ((ResponseData) pair.getSecond()).getMsg(), null, null, null, null, 61, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function1 function1, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, boolean z) {
        pUU.EZpvd("RefreshSpotTask", "loadBizDetail: " + z);
        if (z) {
            function1.invoke(new ResponseData(0, null, null, null, C56390yDp.OLrzqt(objectRef.element, objectRef2.element), null, 46, null));
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final Function1<? super ResponseData<StableInstrumentInfo>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        xBO xbo = new xBO();
        xbo.KWHzl(new Function1() { // from class: o.xMq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54543xMg.EZpvd(function1, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbo, 0L, 1, null);
    }

    public static final Unit EZpvd(Function1 function1, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.ArrayList arrayList = (java.util.ArrayList) responseData.getData();
        pUU.EZpvd("RefreshSpotTask", "loadInstrument: " + (arrayList != null ? java.lang.Integer.valueOf(arrayList.hashCode()) : null));
        int code = responseData.getCode();
        java.lang.String msg = responseData.getMsg();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) responseData.getData();
        function1.invoke(new ResponseData(code, msg, null, null, arrayList2 != null ? (StableInstrumentInfo) CollectionsKt___CollectionsKt.firstOrNull(arrayList2) : null, null, 44, null));
        return Unit.INSTANCE;
    }
}
