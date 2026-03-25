package o;

import com.okinc.market.search.features.navigation.options.usecase.GetNavOptionsSimpleVoUseCase$onExecute$1;
import com.okinc.market.ticker.repo.IndexTickersRepository;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qNi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40208qNi extends AbstractC49400uno<java.lang.String, java.util.List<? extends C41650qun>> {
    public final IndexTickersRepository AEQbTJ;
    public final InterfaceC54577xNn EZpvd;
    public final InterfaceC49497upf OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((java.lang.String) obj, (Continuation<? super java.util.List<C41650qun>>) continuation);
    }

    @yCM
    public C40208qNi(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC49497upf interfaceC49497upf, InterfaceC54577xNn interfaceC54577xNn, @NotNull IndexTickersRepository indexTickersRepository) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(indexTickersRepository, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = interfaceC49497upf;
        this.EZpvd = interfaceC54577xNn;
        this.AEQbTJ = indexTickersRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(java.lang.String str, @NotNull Continuation<? super java.util.List<C41650qun>> continuation) throws java.lang.Throwable {
        GetNavOptionsSimpleVoUseCase$onExecute$1 getNavOptionsSimpleVoUseCase$onExecute$1;
        C40208qNi c40208qNi;
        xND xndAEQbTJ;
        java.lang.String str2;
        InterfaceC54581xNr interfaceC54581xNr;
        xLJ xlj;
        C40208qNi c40208qNi2;
        InterfaceC54581xNr interfaceC54581xNr2;
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list;
        java.lang.String string;
        if (continuation instanceof GetNavOptionsSimpleVoUseCase$onExecute$1) {
            getNavOptionsSimpleVoUseCase$onExecute$1 = (GetNavOptionsSimpleVoUseCase$onExecute$1) continuation;
            int i = getNavOptionsSimpleVoUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNavOptionsSimpleVoUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getNavOptionsSimpleVoUseCase$onExecute$1 = new GetNavOptionsSimpleVoUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getNavOptionsSimpleVoUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getNavOptionsSimpleVoUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            InterfaceC49497upf interfaceC49497upf = this.OLrzqt;
            if (!C41388qpq.KWHzl((interfaceC49497upf == null || (xndAEQbTJ = interfaceC49497upf.AEQbTJ()) == null) ? null : xndAEQbTJ.fetchVPNInfo())) {
                return null;
            }
            InterfaceC54577xNn interfaceC54577xNn = this.EZpvd;
            if (interfaceC54577xNn != null) {
                getNavOptionsSimpleVoUseCase$onExecute$1.L$0 = this;
                getNavOptionsSimpleVoUseCase$onExecute$1.L$1 = str;
                getNavOptionsSimpleVoUseCase$onExecute$1.label = 1;
                if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, getNavOptionsSimpleVoUseCase$onExecute$1, 3, null) == objCopydefault) {
                    return objCopydefault;
                }
                c40208qNi = this;
            } else {
                throw new java.lang.RuntimeException("GetOptionsSimpleUseCase error, tradeManager initialize failed");
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) getNavOptionsSimpleVoUseCase$onExecute$1.L$2;
                    interfaceC54581xNr2 = (InterfaceC54581xNr) getNavOptionsSimpleVoUseCase$onExecute$1.L$1;
                    c40208qNi2 = (C40208qNi) getNavOptionsSimpleVoUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    return c40208qNi2.copydefault(list, interfaceC54581xNr2, (java.util.Map) objOLrzqt);
                }
                interfaceC54581xNr = (InterfaceC54581xNr) getNavOptionsSimpleVoUseCase$onExecute$1.L$2;
                java.lang.String str3 = (java.lang.String) getNavOptionsSimpleVoUseCase$onExecute$1.L$1;
                C40208qNi c40208qNi3 = (C40208qNi) getNavOptionsSimpleVoUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                str2 = str3;
                c40208qNi = c40208qNi3;
                xlj = objOLrzqt instanceof xLJ ? (xLJ) objOLrzqt : null;
                if (xlj != null) {
                    throw new java.lang.RuntimeException("GetOptionsSimpleUseCase error, optionsBiz is null");
                }
                java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listZsXlph = xlj.zsXlph();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listZsXlph) {
                    java.lang.CharSequence charSequence = (java.lang.CharSequence) ((kotlin.Pair) obj).getSecond();
                    if (str2 == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str2).toString()) == null) {
                        string = "";
                    }
                    if (StringsKt__StringsKt.AhwBna(charSequence, (java.lang.CharSequence) string, true)) {
                        arrayList.add(obj);
                    }
                }
                IndexTickersRepository indexTickersRepository = c40208qNi.AEQbTJ;
                getNavOptionsSimpleVoUseCase$onExecute$1.L$0 = c40208qNi;
                getNavOptionsSimpleVoUseCase$onExecute$1.L$1 = interfaceC54581xNr;
                getNavOptionsSimpleVoUseCase$onExecute$1.L$2 = arrayList;
                getNavOptionsSimpleVoUseCase$onExecute$1.label = 3;
                objOLrzqt = indexTickersRepository.OLrzqt(false, "USD", getNavOptionsSimpleVoUseCase$onExecute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c40208qNi2 = c40208qNi;
                interfaceC54581xNr2 = interfaceC54581xNr;
                list = arrayList;
                return c40208qNi2.copydefault(list, interfaceC54581xNr2, (java.util.Map) objOLrzqt);
            }
            str = (java.lang.String) getNavOptionsSimpleVoUseCase$onExecute$1.L$1;
            c40208qNi = (C40208qNi) getNavOptionsSimpleVoUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            ((Result) objOLrzqt).m7386unboximpl();
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c40208qNi.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            throw new java.lang.RuntimeException("GetOptionsSimpleUseCase error, tradeCore is null");
        }
        interfaceC54581xNrOLrzqt.AxsJAY();
        getNavOptionsSimpleVoUseCase$onExecute$1.L$0 = c40208qNi;
        getNavOptionsSimpleVoUseCase$onExecute$1.L$1 = str;
        getNavOptionsSimpleVoUseCase$onExecute$1.L$2 = interfaceC54581xNrOLrzqt;
        getNavOptionsSimpleVoUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("OPTION", getNavOptionsSimpleVoUseCase$onExecute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        str2 = str;
        interfaceC54581xNr = interfaceC54581xNrOLrzqt;
        objOLrzqt = objEZpvd;
        if (objOLrzqt instanceof xLJ) {
        }
        if (xlj != null) {
        }
    }

    private final ActionBar OLrzqt(java.lang.String str) {
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

    private final java.util.List<C41650qun> copydefault(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, InterfaceC54581xNr interfaceC54581xNr, java.util.Map<java.lang.String, IndexTickersData> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IndexTickersData indexTickersData = map.get(((kotlin.Pair) it.next()).getSecond());
            C41650qun c41650qun = null;
            if (indexTickersData != null) {
                java.lang.String upperCase = OLrzqt(indexTickersData.getInstId()).copydefault().toUpperCase(java.util.Locale.ROOT);
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
