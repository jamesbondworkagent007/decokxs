package o;

import com.okinc.market.quotation.domain.options.more.GetOptionsChainsVoUseCase$onExecute$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41512qsH extends AbstractC49400uno<Unit, java.util.List<? extends InterfaceC41644quh>> {
    public static final int AEQbTJ = 8;
    public final InterfaceC54577xNn EZpvd;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Unit) obj, (Continuation<? super java.util.List<? extends InterfaceC41644quh>>) continuation);
    }

    @yCM
    public C41512qsH(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = interfaceC54577xNn;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<? extends InterfaceC41644quh>> continuation) throws java.lang.Throwable {
        GetOptionsChainsVoUseCase$onExecute$1 getOptionsChainsVoUseCase$onExecute$1;
        C41512qsH c41512qsH;
        C41512qsH c41512qsH2;
        xLJ xlj;
        if (continuation instanceof GetOptionsChainsVoUseCase$onExecute$1) {
            getOptionsChainsVoUseCase$onExecute$1 = (GetOptionsChainsVoUseCase$onExecute$1) continuation;
            int i = getOptionsChainsVoUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOptionsChainsVoUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getOptionsChainsVoUseCase$onExecute$1 = new GetOptionsChainsVoUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getOptionsChainsVoUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getOptionsChainsVoUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC54577xNn interfaceC54577xNn = this.EZpvd;
            if (interfaceC54577xNn != null) {
                getOptionsChainsVoUseCase$onExecute$1.L$0 = this;
                getOptionsChainsVoUseCase$onExecute$1.label = 1;
                if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, getOptionsChainsVoUseCase$onExecute$1, 3, null) == objCopydefault) {
                    return objCopydefault;
                }
                c41512qsH = this;
            } else {
                throw new java.lang.RuntimeException("GetOptionsSimpleUseCase error, tradeManager initialize failed");
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c41512qsH2 = (C41512qsH) getOptionsChainsVoUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                xlj = !(objEZpvd instanceof xLJ) ? (xLJ) objEZpvd : null;
                if (xlj != null) {
                    throw new java.lang.RuntimeException("GetOptionsSimpleUseCase error, optionsBiz is null");
                }
                java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listZsXlph = xlj.zsXlph();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listZsXlph, 10));
                java.util.Iterator<T> it = listZsXlph.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) ((kotlin.Pair) it.next()).getFirst());
                }
                java.util.List<java.lang.String> listOLrzqt = C41428qqd.OLrzqt.OLrzqt(arrayList);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : listZsXlph) {
                    if (listOLrzqt.contains(((kotlin.Pair) obj).getFirst())) {
                        arrayList2.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (java.lang.Object obj2 : arrayList2) {
                    java.lang.String strAEQbTJ = TaskDescription.AEQbTJ((java.lang.String) ((kotlin.Pair) obj2).getSecond()).AEQbTJ();
                    java.lang.Object arrayList3 = linkedHashMap.get(strAEQbTJ);
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList();
                        linkedHashMap.put(strAEQbTJ, arrayList3);
                    }
                    ((java.util.List) arrayList3).add(obj2);
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                if (linkedHashMap.size() != 2) {
                    C56443yFo.KWHzl(arrayList4.addAll(c41512qsH2.EZpvd(arrayList2)));
                } else {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        java.lang.String str = (java.lang.String) entry.getKey();
                        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list = (java.util.List) entry.getValue();
                        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USD")) {
                            arrayList4.add(new C41648qul(pVX.LoaderManager.wlaJM));
                        } else if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USDT")) {
                            arrayList4.add(new C41648qul(pVX.LoaderManager.AuCTelauCTel));
                        }
                        arrayList4.addAll(c41512qsH2.EZpvd(list));
                    }
                }
                return arrayList4;
            }
            c41512qsH = (C41512qsH) getOptionsChainsVoUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            ((Result) objEZpvd).m7386unboximpl();
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c41512qsH.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            throw new java.lang.RuntimeException("GetOptionsSimpleUseCase error, tradeCore is null");
        }
        interfaceC54581xNrOLrzqt.AxsJAY();
        getOptionsChainsVoUseCase$onExecute$1.L$0 = c41512qsH;
        getOptionsChainsVoUseCase$onExecute$1.label = 2;
        objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("OPTION", getOptionsChainsVoUseCase$onExecute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        c41512qsH2 = c41512qsH;
        if (!(objEZpvd instanceof xLJ)) {
        }
        if (xlj != null) {
        }
    }

    public final java.util.List<C41646quj> EZpvd(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ActionBar actionBarAEQbTJ = TaskDescription.AEQbTJ((java.lang.String) ((kotlin.Pair) it.next()).getSecond());
            arrayList.add(new C41646quj(TaskDescription.AEQbTJ(actionBarAEQbTJ), actionBarAEQbTJ));
        }
        return arrayList;
    }
}
