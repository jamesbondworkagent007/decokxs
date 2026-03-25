package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.domain.usecase.ColumnKey;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.domain.usecase.MarketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1;
import com.okinc.market.ext.UpDownColor;
import com.okinc.unify_find.data.UpDownRank;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C41090qkJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qjs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41072qjs extends AbstractC49400uno<C41086qkF, C41090qkJ> {
    public final C41662quz AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC54577xNn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41086qkF) obj, (Continuation<? super C41090qkJ>) continuation);
    }

    @yCM
    public C41072qjs(InterfaceC54577xNn interfaceC54577xNn, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.copydefault = interfaceC54577xNn;
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = c41662quz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41086qkF c41086qkF, @NotNull Continuation<? super C41090qkJ> continuation) throws java.lang.Throwable {
        MarketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1 marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1;
        C41072qjs c41072qjs;
        java.util.Map map;
        java.util.List<UpDownRank> list;
        C41090qkJ c41090qkJKWHzl;
        if (continuation instanceof MarketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1) {
            marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1 = (MarketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1) continuation;
            int i = marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1 = new MarketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", c41086qkF.AYXKKw()), C56390yDp.OLrzqt(TypedValues.CycleType.S_WAVE_PERIOD, c41086qkF.copydefault().getInputPara()), C56390yDp.OLrzqt("zone", c41086qkF.djBIcL()), C56390yDp.OLrzqt("rank", c41086qkF.AEQbTJ()), C56390yDp.OLrzqt("num", c41086qkF.OLrzqt()), C56390yDp.OLrzqt("plateType", c41086qkF.EZpvd()));
            C41662quz c41662quz = this.AEQbTJ;
            marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1.L$0 = this;
            marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1.L$1 = c41086qkF;
            marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1.label = 1;
            objValueOf = c41662quz.valueOf(mapGEmmrt, marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1);
            if (objValueOf == objCopydefault) {
                return objCopydefault;
            }
            c41072qjs = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41086qkF = (C41086qkF) marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1.L$1;
            c41072qjs = (C41072qjs) marketDiscoverTrendingCategoryGetUpDownRankUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objValueOf);
        }
        java.util.List list2 = (java.util.List) objValueOf;
        return (list2 == null || (map = (java.util.Map) list2.get(0)) == null || (list = (java.util.List) map.get(C55488xkr.KWHzl.KWHzl(c41086qkF.djBIcL()))) == null || (c41090qkJKWHzl = c41072qjs.KWHzl(list)) == null) ? new C41090qkJ(0, null, 3, null) : c41090qkJKWHzl;
    }

    public final C41090qkJ KWHzl(java.util.List<UpDownRank> list) {
        InterfaceC54577xNn interfaceC54577xNn = this.copydefault;
        if (interfaceC54577xNn == null || interfaceC54577xNn.OLrzqt() == null) {
            return new C41090qkJ(0, null, 3, null);
        }
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(list.size()), 2)) {
            return new C41090qkJ(0, null, 3, null);
        }
        LinkedHashMap<java.lang.String, java.util.List<UpDownRank>> linkedHashMap = new LinkedHashMap<>();
        int size = list.size();
        if (size == 3) {
            linkedHashMap.put("COLUMN_1", list.subList(0, 1));
            linkedHashMap.put("COLUMN_2", list.subList(1, 2));
            linkedHashMap.put("COLUMN_3", list.subList(2, 3));
        } else if (size == 4) {
            linkedHashMap.put("COLUMN_1", list.subList(0, 1));
            linkedHashMap.put("COLUMN_2", list.subList(1, 2));
            linkedHashMap.put("COLUMN_3", list.subList(2, 4));
        } else if (size == 5) {
            linkedHashMap.put("COLUMN_1", list.subList(0, 1));
            linkedHashMap.put("COLUMN_2", list.subList(1, 3));
            linkedHashMap.put("COLUMN_3", list.subList(3, 5));
        } else if (new android.util.Range(6, Integer.MAX_VALUE).contains(java.lang.Integer.valueOf(size))) {
            linkedHashMap.put("COLUMN_1", list.subList(0, 1));
            linkedHashMap.put("COLUMN_2", list.subList(1, 3));
            linkedHashMap.put("COLUMN_3", list.subList(3, 6));
        }
        LinkedHashMap<java.lang.String, java.util.List<C41090qkJ.ActionBar>> linkedHashMap2 = new LinkedHashMap<>();
        int size2 = 0;
        for (ColumnKey columnKey : ColumnKey.values()) {
            copydefault(columnKey.name(), size2, linkedHashMap, linkedHashMap2);
            java.util.List<UpDownRank> list2 = linkedHashMap.get(columnKey.name());
            size2 += list2 != null ? list2.size() : 0;
        }
        return new C41090qkJ(list.size(), linkedHashMap2);
    }

    private final void copydefault(java.lang.String str, int i, LinkedHashMap<java.lang.String, java.util.List<UpDownRank>> linkedHashMap, LinkedHashMap<java.lang.String, java.util.List<C41090qkJ.ActionBar>> linkedHashMap2) {
        C41072qjs c41072qjs = this;
        java.util.List<UpDownRank> list = linkedHashMap.get(str);
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                UpDownRank upDownRank = (UpDownRank) obj;
                arrayList.add(new C41090qkJ.ActionBar(i + i2, upDownRank.getInstId(), upDownRank.getInstType(), i2, upDownRank.getIconV2(), C41786qxQ.EZpvd(upDownRank.getInstId()), upDownRank.getChangePer(), UpDownColor.Companion.AEQbTJ(upDownRank.getChangePer()), c41072qjs.EZpvd(upDownRank.getInstId(), upDownRank.getInstType(), upDownRank.getLastPrice()), OLrzqt(str), EZpvd(str), c41072qjs.OLrzqt(str, i2), c41072qjs.KWHzl(str, list.size(), i2), 0, false, false, 0, 122880, null));
                i2++;
                c41072qjs = this;
            }
            linkedHashMap2.put(str, arrayList);
        }
    }

    private final float OLrzqt(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "COLUMN_1") ? 8.0f : 0.0f;
    }

    private final float EZpvd(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "COLUMN_1") ? 8.0f : 0.0f;
    }

    private final float OLrzqt(java.lang.String str, int i) {
        return (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "COLUMN_3") && i == 0) ? 8.0f : 0.0f;
    }

    public final float KWHzl(java.lang.String str, int i, int i2) {
        return (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "COLUMN_3") && i2 == i + (-1)) ? 8.0f : 0.0f;
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAEQbTJ;
        java.lang.String safeString$default;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn = this.copydefault;
        AbstractC54531xLw abstractC54531xLwOLrzqt = (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) ? null : interfaceC54581xNrOLrzqt.OLrzqt(str2);
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.valueOf(str) : null;
        if (abstractC54531xLwOLrzqt != null) {
            if (bizInstrumentValueOf == null || (instFamily = bizInstrumentValueOf.getInstFamily()) == null) {
                instFamily = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
            if (xmsGEmmrt != null && (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(str3)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLAEQbTJ = c54536xMLDjBIcL.AEQbTJ(true)) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null)) != null) {
                return safeString$default;
            }
        }
        return "--";
    }
}
