package o;

import com.okinc.business.invest_biz.data.bean.AggregateData;
import com.okinc.business.invest_biz.data.bean.InvestChip;
import com.okinc.business.invest_biz.data.bean.InvestSearchData;
import com.okinc.business.invest_biz.data.usecase.GetAggregateListUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.GetAggregateListUseCaseImpl$invoke$2;
import com.okinc.business.invest_biz.data.usecase.SearchKeywordRequest;
import com.okinc.business.invest_biz.data.usecase.V2ProductQuery;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFI implements iFH {
    public final InterfaceC23717iGs AEQbTJ;
    public final InterfaceC23589iBz EZpvd;
    public final Json KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C23580iBq copydefault;

    public iFI(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C23580iBq c23580iBq, @NotNull InterfaceC23717iGs interfaceC23717iGs, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c23580iBq, "");
        Intrinsics.checkNotNullParameter(interfaceC23717iGs, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.EZpvd = interfaceC23589iBz;
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = c23580iBq;
        this.AEQbTJ = interfaceC23717iGs;
        this.KWHzl = json;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public iFI(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC23717iGs interfaceC23717iGs, @NotNull Json json) {
        this(interfaceC23589iBz, coroutineDispatcher, C23580iBq.AEQbTJ, interfaceC23717iGs, json);
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC23717iGs, "");
        Intrinsics.checkNotNullParameter(json, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iFH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull V2ProductQuery v2ProductQuery, @NotNull Continuation<? super Result<AggregateData>> continuation) {
        GetAggregateListUseCaseImpl$invoke$1 getAggregateListUseCaseImpl$invoke$1;
        if (continuation instanceof GetAggregateListUseCaseImpl$invoke$1) {
            getAggregateListUseCaseImpl$invoke$1 = (GetAggregateListUseCaseImpl$invoke$1) continuation;
            int i = getAggregateListUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAggregateListUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAggregateListUseCaseImpl$invoke$1 = new GetAggregateListUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getAggregateListUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAggregateListUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            GetAggregateListUseCaseImpl$invoke$2 getAggregateListUseCaseImpl$invoke$2 = new GetAggregateListUseCaseImpl$invoke$2(this, v2ProductQuery, null);
            getAggregateListUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getAggregateListUseCaseImpl$invoke$2, getAggregateListUseCaseImpl$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.Object EZpvd(@NotNull V2ProductQuery v2ProductQuery, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt;
        java.lang.String strEZpvd = EZpvd(v2ProductQuery.getKeyword());
        java.lang.String strCopydefault = copydefault(v2ProductQuery.getKeyword());
        return (!(strEZpvd.length() == 0 && strCopydefault.length() == 0) && (objOLrzqt = this.AEQbTJ.OLrzqt(strEZpvd, strCopydefault, v2ProductQuery.getNetwork(), v2ProductQuery.getInvestType(), continuation)) == C56442yFn.copydefault()) ? objOLrzqt : Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(java.util.List<InvestChip> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        InvestSearchData investSearchDataOLrzqt = ((InvestChip) CollectionsKt___CollectionsKt.AubY(list)).OLrzqt();
        return C33129mqd.gEmmrt(investSearchDataOLrzqt != null ? investSearchDataOLrzqt.getSymbol() : null);
    }

    public final java.lang.String copydefault(java.util.List<InvestChip> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        InvestSearchData investSearchDataAEQbTJ = ((InvestChip) CollectionsKt___CollectionsKt.AubY(list)).AEQbTJ();
        return C33129mqd.gEmmrt(investSearchDataAEQbTJ != null ? investSearchDataAEQbTJ.getSymbol() : null);
    }

    public final java.lang.String KWHzl(java.util.List<InvestChip> list) {
        java.util.List<java.lang.Integer> ids;
        java.util.List<java.lang.Integer> ids2;
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        for (InvestChip investChip : list) {
            InvestSearchData investSearchDataAEQbTJ = investChip.AEQbTJ();
            if (investSearchDataAEQbTJ != null && (ids2 = investSearchDataAEQbTJ.getIds()) != null) {
                C56406yEe.KWHzl(arrayList2, ids2);
            }
            InvestSearchData investSearchDataOLrzqt = investChip.OLrzqt();
            if (investSearchDataOLrzqt != null && (ids = investSearchDataOLrzqt.getIds()) != null) {
                C56406yEe.KWHzl(arrayList, ids);
                i++;
            }
        }
        Json json = this.KWHzl;
        SearchKeywordRequest searchKeywordRequest = new SearchKeywordRequest(arrayList2, arrayList, i);
        json.getSerializersModule();
        return json.encodeToString(SearchKeywordRequest.Companion.serializer(), searchKeywordRequest);
    }
}
