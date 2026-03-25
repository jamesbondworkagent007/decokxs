package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_find.data.HotRankResponse;
import com.okinc.unify_find.data.MarketCapRank;
import com.okinc.unify_find.data.NewCoinGroupResponse;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.data.TurnOverRank;
import com.okinc.unify_find.data.UpDownRank;
import com.okinc.unify_find.module.RankListModule$getHotRank$cacheFlow$1$1;
import com.okinc.unify_find.module.RankListModule$getNewCoinRank$cacheFlow$1$1;
import com.okinc.unify_find.module.RankListModule$getUpDownRank$cacheFlow$1$1;
import com.okinc.unify_find.net.BizFindApiService;
import com.okinc.unify_trade.exception.BizSystemException;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xlm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55536xlm {
    public static final ActionBar Companion = new ActionBar(null);
    public static boolean OLrzqt = true;
    public static boolean KWHzl = true;
    public static boolean copydefault = true;

    /* JADX INFO: renamed from: o.xlm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xlm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.util.Map<java.lang.String, java.lang.String> copydefault(RankListRequest rankListRequest) {
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        java.lang.String strKWHzl = c33489mxS.KWHzl(RankListRequest.Companion.serializer(), rankListRequest);
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        return new java.util.HashMap((java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(c56529yIt), BuiltinSerializersKt.serializer(c56529yIt)), strKWHzl));
    }

    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ(RankListRequest rankListRequest) {
        return copydefault(rankListRequest);
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull RankListRequest rankListRequest, @NotNull final InterfaceC55701xos<java.util.List<HotRankResponse>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(rankListRequest, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        final boolean z = OLrzqt;
        AbstractC58185ywX abstractC58185ywXCopydefault = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.xlz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C55536xlm.EZpvd(z);
            }
        }).copydefault(yBP.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        final AbstractC58185ywX hotRank$default = BizFindApiService.StateListAnimator.getHotRank$default((BizFindApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizFindApiService.class), null, 1, null), copydefault(rankListRequest), z ? "FIRST_CACHE" : "NO_CACHE", 0, 4, null);
        final Function1 function1 = new Function1() { // from class: o.xlA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.copydefault(hotRank$default, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.xlB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C55536xlm.AEQbTJ(function1, obj);
            }
        });
        pUU.KWHzl("MarketCache", "getHotRank isFirstHot = " + OLrzqt);
        OLrzqt = false;
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return C33024moe.subscribeOnIO$default(abstractC58185ywXKWHzl, new Function1() { // from class: o.xlC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.AhwBna(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.AEQbTJ(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(boolean z) throws java.lang.InterruptedException {
        pUU.KWHzl("MarketCache", "getHotRank check prejob");
        pUU.KWHzl("MarketCache", "isFirstHot " + z);
        C44586sZi c44586sZi = C44586sZi.EZpvd;
        pUU.KWHzl("MarketCache", "hotjob " + c44586sZi.KWHzl());
        if (z && c44586sZi.KWHzl() != null) {
            pUU.KWHzl("MarketCache", "getHotRank check have prenetjob thread " + java.lang.Thread.currentThread().getName());
            BuildersKt__BuildersKt.runBlocking$default(null, new RankListModule$getHotRank$cacheFlow$1$1(null), 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(AbstractC58185ywX abstractC58185ywX, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        pUU.KWHzl("MarketCache", "start request data");
        return abstractC58185ywX;
    }

    public static final Unit AEQbTJ(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        pUU.KWHzl("MarketCache", "get hot request data");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC KWHzl(@NotNull final RankListRequest rankListRequest, @NotNull final InterfaceC55701xos<java.util.List<NewCoinGroupResponse>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(rankListRequest, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        pUU.KWHzl("MarketCache", "getHotRank isFirstNew = " + KWHzl);
        final boolean z = KWHzl;
        final java.lang.String str = z ? "FIRST_CACHE" : "NO_CACHE";
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.xls
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C55536xlm.OLrzqt(z);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.xlp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.OLrzqt(str, this, rankListRequest, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.xlr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C55536xlm.EZpvd(function1, obj);
            }
        });
        KWHzl = false;
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return C33024moe.subscribeOnIO$default(abstractC58185ywXKWHzl, new Function1() { // from class: o.xlo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.AYXKKw(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xlw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.AhwBna(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(boolean z) throws java.lang.InterruptedException {
        if (z && C44586sZi.EZpvd.AEQbTJ() != null) {
            BuildersKt__BuildersKt.runBlocking$default(null, new RankListModule$getNewCoinRank$cacheFlow$1$1(null), 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(java.lang.String str, C55536xlm c55536xlm, RankListRequest rankListRequest, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        pUU.KWHzl("MarketCache", "getNewCoinRank start request data cacheStrategy " + str);
        return BizFindApiService.StateListAnimator.getNewCoinRank$default((BizFindApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizFindApiService.class), null, 1, null), c55536xlm.copydefault(rankListRequest), str, 0, 4, null);
    }

    public static final Unit AYXKKw(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(@NotNull final RankListRequest rankListRequest, @NotNull final InterfaceC55701xos<java.util.List<UpDownRank>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(rankListRequest, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        java.lang.String zone = rankListRequest.getZone();
        if (zone == null || zone.length() == 0) {
            throw new java.lang.IllegalArgumentException("RankListRequest calRange filed can not be null");
        }
        pUU.KWHzl("MarketCache", "getHotRank isFirstPercent = " + copydefault);
        final boolean z = copydefault;
        final java.lang.String str = z ? "FIRST_CACHE" : "NO_CACHE";
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.xlE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C55536xlm.djBIcL(z);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.xll
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.AEQbTJ(str, this, rankListRequest, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.xln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C55536xlm.djBIcL(function1, obj);
            }
        });
        copydefault = false;
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return C33024moe.subscribeOnIO$default(abstractC58185ywXKWHzl, new Function1() { // from class: o.xlk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.valueOf(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xlq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.copydefault(interfaceC55701xos, rankListRequest, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit djBIcL(boolean z) throws java.lang.InterruptedException {
        if (z && C44586sZi.EZpvd.copydefault() != null) {
            BuildersKt__BuildersKt.runBlocking$default(null, new RankListModule$getUpDownRank$cacheFlow$1$1(null), 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(java.lang.String str, C55536xlm c55536xlm, RankListRequest rankListRequest, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        pUU.KWHzl("MarketCache", "getUpDownRank start request data cacheStrategy " + str);
        return BizFindApiService.StateListAnimator.getUpDownRank$default((BizFindApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizFindApiService.class), null, 1, null), c55536xlm.AEQbTJ(rankListRequest), str, 0, 4, null);
    }

    public static final Unit valueOf(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC EZpvd(@NotNull RankListRequest rankListRequest, @NotNull final InterfaceC55701xos<java.util.List<MarketCapRank>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(rankListRequest, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizFindApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizFindApiService.class), null, 1, null)).getMarketCapRank(copydefault(rankListRequest)), new Function1() { // from class: o.xlx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.gEmmrt(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xlv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.AYXKKw(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit gEmmrt(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull RankListRequest rankListRequest, @NotNull final InterfaceC55701xos<java.util.List<TurnOverRank>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(rankListRequest, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizFindApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizFindApiService.class), null, 1, null)).getTurnOverRank(AEQbTJ(rankListRequest)), new Function1() { // from class: o.xlu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.djBIcL(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xlt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55536xlm.valueOf(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit djBIcL(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InterfaceC55701xos interfaceC55701xos, RankListRequest rankListRequest, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if (responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                if (((java.util.List) data).size() > 0) {
                    java.lang.Object data2 = responseData.getData();
                    Intrinsics.copydefault(data2);
                    java.util.Map map = (java.util.Map) ((java.util.List) data2).get(0);
                    C55488xkr c55488xkr = C55488xkr.KWHzl;
                    java.lang.String zone = rankListRequest.getZone();
                    if (zone == null) {
                        zone = "";
                    }
                    java.util.Collection arrayList = (java.util.List) map.get(c55488xkr.KWHzl(zone));
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    interfaceC55701xos.EZpvd(true, arrayList, null);
                }
            }
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }
}
