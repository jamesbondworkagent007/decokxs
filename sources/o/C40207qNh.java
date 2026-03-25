package o;

import com.okinc.market.search.features.navigation.options.usecase.GetNavOptionsChainsVoUseCase$onExecute$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qNh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40207qNh extends AbstractC49400uno<java.lang.String, java.util.List<? extends InterfaceC41644quh>> {
    public final InterfaceC54577xNn AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C40207qNh(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = interfaceC54577xNn;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(java.lang.String str, @NotNull Continuation<? super java.util.List<? extends InterfaceC41644quh>> continuation) throws java.lang.Throwable {
        GetNavOptionsChainsVoUseCase$onExecute$1 getNavOptionsChainsVoUseCase$onExecute$1;
        C40207qNh c40207qNh;
        C40207qNh c40207qNh2;
        xLJ xlj;
        java.lang.String string;
        if (continuation instanceof GetNavOptionsChainsVoUseCase$onExecute$1) {
            getNavOptionsChainsVoUseCase$onExecute$1 = (GetNavOptionsChainsVoUseCase$onExecute$1) continuation;
            int i = getNavOptionsChainsVoUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNavOptionsChainsVoUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getNavOptionsChainsVoUseCase$onExecute$1 = new GetNavOptionsChainsVoUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getNavOptionsChainsVoUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getNavOptionsChainsVoUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC54577xNn interfaceC54577xNn = this.AEQbTJ;
            if (interfaceC54577xNn != null) {
                getNavOptionsChainsVoUseCase$onExecute$1.L$0 = this;
                getNavOptionsChainsVoUseCase$onExecute$1.L$1 = str;
                getNavOptionsChainsVoUseCase$onExecute$1.label = 1;
                if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, getNavOptionsChainsVoUseCase$onExecute$1, 3, null) == objCopydefault) {
                    return objCopydefault;
                }
                c40207qNh = this;
            } else {
                throw new java.lang.RuntimeException("GetOptionsSimpleUseCase error, tradeManager initialize failed");
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) getNavOptionsChainsVoUseCase$onExecute$1.L$1;
                c40207qNh2 = (C40207qNh) getNavOptionsChainsVoUseCase$onExecute$1.L$0;
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
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it2 = arrayList2.iterator();
                while (true) {
                    java.lang.String str2 = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it2.next();
                    java.lang.CharSequence charSequence = (java.lang.CharSequence) ((kotlin.Pair) next).getSecond();
                    if (str != null && (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString()) != null) {
                        str2 = string;
                    }
                    if (StringsKt__StringsKt.AhwBna(charSequence, (java.lang.CharSequence) str2, true)) {
                        arrayList3.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (java.lang.Object obj2 : arrayList3) {
                    java.lang.String strAEQbTJ = TaskDescription.AEQbTJ((java.lang.String) ((kotlin.Pair) obj2).getSecond()).AEQbTJ();
                    java.lang.Object arrayList4 = linkedHashMap.get(strAEQbTJ);
                    if (arrayList4 == null) {
                        arrayList4 = new java.util.ArrayList();
                        linkedHashMap.put(strAEQbTJ, arrayList4);
                    }
                    ((java.util.List) arrayList4).add(obj2);
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                if (linkedHashMap.size() != 2) {
                    C56443yFo.KWHzl(arrayList5.addAll(c40207qNh2.AEQbTJ(arrayList3)));
                } else {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        java.lang.String str3 = (java.lang.String) entry.getKey();
                        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list = (java.util.List) entry.getValue();
                        java.lang.String upperCase = str3.toUpperCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USD")) {
                            arrayList5.add(new C41648qul(pVX.LoaderManager.wlaJM));
                        } else if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USDT")) {
                            arrayList5.add(new C41648qul(pVX.LoaderManager.AuCTelauCTel));
                        }
                        arrayList5.addAll(c40207qNh2.AEQbTJ(list));
                    }
                }
                return arrayList5;
            }
            str = (java.lang.String) getNavOptionsChainsVoUseCase$onExecute$1.L$1;
            c40207qNh = (C40207qNh) getNavOptionsChainsVoUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            ((Result) objEZpvd).m7386unboximpl();
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c40207qNh.AEQbTJ.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            throw new java.lang.RuntimeException("GetOptionsSimpleUseCase error, tradeCore is null");
        }
        interfaceC54581xNrOLrzqt.AxsJAY();
        getNavOptionsChainsVoUseCase$onExecute$1.L$0 = c40207qNh;
        getNavOptionsChainsVoUseCase$onExecute$1.L$1 = str;
        getNavOptionsChainsVoUseCase$onExecute$1.label = 2;
        objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("OPTION", getNavOptionsChainsVoUseCase$onExecute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        c40207qNh2 = c40207qNh;
        if (!(objEZpvd instanceof xLJ)) {
        }
        if (xlj != null) {
        }
    }

    private final java.util.List<C41646quj> AEQbTJ(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ActionBar actionBarAEQbTJ = TaskDescription.AEQbTJ((java.lang.String) ((kotlin.Pair) it.next()).getSecond());
            arrayList.add(new C41646quj(TaskDescription.AEQbTJ(actionBarAEQbTJ), actionBarAEQbTJ));
        }
        return arrayList;
    }
}
