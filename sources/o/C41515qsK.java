package o;

import com.okinc.market.quotation.domain.options.more.GetOptionsSimpleVoUseCase$onExecute$1;
import com.okinc.market.ticker.repo.IndexTickersRepository;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41515qsK extends AbstractC49400uno<Unit, java.util.List<? extends C41650qun>> {
    public static final int copydefault = 8;
    public final InterfaceC49497upf AEQbTJ;
    public final InterfaceC54577xNn EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final IndexTickersRepository OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C41515qsK(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC49497upf interfaceC49497upf, InterfaceC54577xNn interfaceC54577xNn, @NotNull IndexTickersRepository indexTickersRepository) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(indexTickersRepository, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = interfaceC49497upf;
        this.EZpvd = interfaceC54577xNn;
        this.OLrzqt = indexTickersRepository;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<C41650qun>> continuation) throws java.lang.Throwable {
        GetOptionsSimpleVoUseCase$onExecute$1 getOptionsSimpleVoUseCase$onExecute$1;
        C41515qsK c41515qsK;
        xND xndAEQbTJ;
        InterfaceC54581xNr interfaceC54581xNr;
        xLJ xlj;
        C41515qsK c41515qsK2;
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list;
        if (continuation instanceof GetOptionsSimpleVoUseCase$onExecute$1) {
            getOptionsSimpleVoUseCase$onExecute$1 = (GetOptionsSimpleVoUseCase$onExecute$1) continuation;
            int i = getOptionsSimpleVoUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOptionsSimpleVoUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getOptionsSimpleVoUseCase$onExecute$1 = new GetOptionsSimpleVoUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getOptionsSimpleVoUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getOptionsSimpleVoUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49497upf interfaceC49497upf = this.AEQbTJ;
            if (!C41388qpq.KWHzl((interfaceC49497upf == null || (xndAEQbTJ = interfaceC49497upf.AEQbTJ()) == null) ? null : xndAEQbTJ.fetchVPNInfo())) {
                return null;
            }
            InterfaceC54577xNn interfaceC54577xNn = this.EZpvd;
            if (interfaceC54577xNn != null) {
                getOptionsSimpleVoUseCase$onExecute$1.L$0 = this;
                getOptionsSimpleVoUseCase$onExecute$1.label = 1;
                if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, getOptionsSimpleVoUseCase$onExecute$1, 3, null) == objCopydefault) {
                    return objCopydefault;
                }
                c41515qsK = this;
            } else {
                throw new java.lang.RuntimeException("GetOptionsSimpleUseCase error, tradeManager initialize failed");
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) getOptionsSimpleVoUseCase$onExecute$1.L$2;
                    interfaceC54581xNr = (InterfaceC54581xNr) getOptionsSimpleVoUseCase$onExecute$1.L$1;
                    c41515qsK2 = (C41515qsK) getOptionsSimpleVoUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return c41515qsK2.AEQbTJ(list, interfaceC54581xNr, (java.util.Map) obj);
                }
                InterfaceC54581xNr interfaceC54581xNr2 = (InterfaceC54581xNr) getOptionsSimpleVoUseCase$onExecute$1.L$1;
                C41515qsK c41515qsK3 = (C41515qsK) getOptionsSimpleVoUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                interfaceC54581xNr = interfaceC54581xNr2;
                c41515qsK = c41515qsK3;
                xlj = obj instanceof xLJ ? (xLJ) obj : null;
                if (xlj != null) {
                    throw new java.lang.RuntimeException("GetOptionsSimpleUseCase error, optionsBiz is null");
                }
                java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listZsXlph = xlj.zsXlph();
                IndexTickersRepository indexTickersRepository = c41515qsK.OLrzqt;
                getOptionsSimpleVoUseCase$onExecute$1.L$0 = c41515qsK;
                getOptionsSimpleVoUseCase$onExecute$1.L$1 = interfaceC54581xNr;
                getOptionsSimpleVoUseCase$onExecute$1.L$2 = listZsXlph;
                getOptionsSimpleVoUseCase$onExecute$1.label = 3;
                java.lang.Object objOLrzqt = indexTickersRepository.OLrzqt(false, "USD", getOptionsSimpleVoUseCase$onExecute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                obj = objOLrzqt;
                c41515qsK2 = c41515qsK;
                list = listZsXlph;
                return c41515qsK2.AEQbTJ(list, interfaceC54581xNr, (java.util.Map) obj);
            }
            c41515qsK = (C41515qsK) getOptionsSimpleVoUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c41515qsK.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            throw new java.lang.RuntimeException("GetOptionsSimpleUseCase error, tradeCore is null");
        }
        interfaceC54581xNrOLrzqt.AxsJAY();
        getOptionsSimpleVoUseCase$onExecute$1.L$0 = c41515qsK;
        getOptionsSimpleVoUseCase$onExecute$1.L$1 = interfaceC54581xNrOLrzqt;
        getOptionsSimpleVoUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("OPTION", getOptionsSimpleVoUseCase$onExecute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        interfaceC54581xNr = interfaceC54581xNrOLrzqt;
        obj = objEZpvd;
        if (obj instanceof xLJ) {
        }
        if (xlj != null) {
        }
    }

    public final ActionBar AEQbTJ(java.lang.String str) {
        java.lang.Object next;
        java.util.List listSplit$default;
        java.lang.String str2 = str == null ? "" : str;
        java.util.Iterator<T> it = Activity.copydefault.EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) next, false, 2, (java.lang.Object) null)) {
                break;
            }
        }
        java.lang.String str3 = (java.lang.String) next;
        if (str3 != null && (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{str3}, false, 0, 6, (java.lang.Object) null)) != null) {
            if (listSplit$default.size() < 2) {
                listSplit$default = null;
            }
            if (listSplit$default != null) {
                java.lang.String str4 = (java.lang.String) listSplit$default.get(0);
                java.util.Locale locale = java.util.Locale.ROOT;
                java.lang.String lowerCase = str4.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                java.lang.String lowerCase2 = ((java.lang.String) listSplit$default.get(1)).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                return new ActionBar(lowerCase, lowerCase2);
            }
        }
        return new ActionBar(null, null, 3, null);
    }

    public final java.util.List<C41650qun> AEQbTJ(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, InterfaceC54581xNr interfaceC54581xNr, java.util.Map<java.lang.String, IndexTickersData> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IndexTickersData indexTickersData = map.get(((kotlin.Pair) it.next()).getSecond());
            C41650qun c41650qun = null;
            if (indexTickersData != null) {
                java.lang.String upperCase = AEQbTJ(indexTickersData.getInstId()).copydefault().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                TradeCoinInfo tradeCoinInfoAhwBna = interfaceC54581xNr.AhwBna(upperCase);
                java.lang.String url = tradeCoinInfoAhwBna != null ? tradeCoinInfoAhwBna.getUrl() : null;
                c41650qun = new C41650qun(upperCase, url, "$" + pTB.formatRoundToMax$default(C33129mqd.EZpvd(indexTickersData.getIdxPx()), 2, null, 2, null), indexTickersData);
            }
            if (c41650qun != null) {
                arrayList.add(c41650qun);
            }
        }
        return arrayList;
    }
}
