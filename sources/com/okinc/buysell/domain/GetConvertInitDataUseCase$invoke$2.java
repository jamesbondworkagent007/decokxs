package com.okinc.buysell.domain;

import com.okinc.crcore.coreapi.net.responsebean.EarnOption;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.crcore.shared.net.responsebean.CurrencySuggestionPairsBean;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C31653lza;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.lyK;
import o.lyU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class GetConvertInitDataUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C31653lza>, Object> {
    final /* synthetic */ String $fromCcy;
    final /* synthetic */ String $toCcy;
    final /* synthetic */ String $valuationUnit;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ lyU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetConvertInitDataUseCase$invoke$2(String str, String str2, lyU lyu, String str3, Continuation<? super GetConvertInitDataUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$fromCcy = str;
        this.$toCcy = str2;
        this.this$0 = lyu;
        this.$valuationUnit = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetConvertInitDataUseCase$invoke$2 getConvertInitDataUseCase$invoke$2 = new GetConvertInitDataUseCase$invoke$2(this.$fromCcy, this.$toCcy, this.this$0, this.$valuationUnit, continuation);
        getConvertInitDataUseCase$invoke$2.L$0 = obj;
        return getConvertInitDataUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C31653lza> continuation) {
        return ((GetConvertInitDataUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [28=5] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148 A[Catch: Exception -> 0x0286, TryCatch #0 {Exception -> 0x0286, blocks: (B:9:0x002b, B:61:0x0194, B:63:0x019d, B:65:0x01a3, B:66:0x01af, B:69:0x01bb, B:70:0x01cb, B:72:0x01d1, B:76:0x01e4, B:80:0x01eb, B:81:0x01ef, B:83:0x01f5, B:85:0x0206, B:89:0x0216, B:91:0x021a, B:92:0x021e, B:94:0x0224, B:97:0x023b, B:99:0x023f, B:108:0x025d, B:110:0x0265, B:118:0x027f, B:112:0x026c, B:114:0x0274, B:102:0x024e, B:68:0x01b5, B:14:0x0048, B:48:0x013d, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015a, B:57:0x015e, B:17:0x0059, B:36:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0107, B:44:0x0115, B:20:0x0065, B:32:0x00cd, B:23:0x0072, B:25:0x007c, B:28:0x00aa, B:29:0x00b0), top: B:123:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154 A[Catch: Exception -> 0x0286, TryCatch #0 {Exception -> 0x0286, blocks: (B:9:0x002b, B:61:0x0194, B:63:0x019d, B:65:0x01a3, B:66:0x01af, B:69:0x01bb, B:70:0x01cb, B:72:0x01d1, B:76:0x01e4, B:80:0x01eb, B:81:0x01ef, B:83:0x01f5, B:85:0x0206, B:89:0x0216, B:91:0x021a, B:92:0x021e, B:94:0x0224, B:97:0x023b, B:99:0x023f, B:108:0x025d, B:110:0x0265, B:118:0x027f, B:112:0x026c, B:114:0x0274, B:102:0x024e, B:68:0x01b5, B:14:0x0048, B:48:0x013d, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015a, B:57:0x015e, B:17:0x0059, B:36:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0107, B:44:0x0115, B:20:0x0065, B:32:0x00cd, B:23:0x0072, B:25:0x007c, B:28:0x00aa, B:29:0x00b0), top: B:123:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019d A[Catch: Exception -> 0x0286, TryCatch #0 {Exception -> 0x0286, blocks: (B:9:0x002b, B:61:0x0194, B:63:0x019d, B:65:0x01a3, B:66:0x01af, B:69:0x01bb, B:70:0x01cb, B:72:0x01d1, B:76:0x01e4, B:80:0x01eb, B:81:0x01ef, B:83:0x01f5, B:85:0x0206, B:89:0x0216, B:91:0x021a, B:92:0x021e, B:94:0x0224, B:97:0x023b, B:99:0x023f, B:108:0x025d, B:110:0x0265, B:118:0x027f, B:112:0x026c, B:114:0x0274, B:102:0x024e, B:68:0x01b5, B:14:0x0048, B:48:0x013d, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015a, B:57:0x015e, B:17:0x0059, B:36:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0107, B:44:0x0115, B:20:0x0065, B:32:0x00cd, B:23:0x0072, B:25:0x007c, B:28:0x00aa, B:29:0x00b0), top: B:123:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b5 A[Catch: Exception -> 0x0286, TryCatch #0 {Exception -> 0x0286, blocks: (B:9:0x002b, B:61:0x0194, B:63:0x019d, B:65:0x01a3, B:66:0x01af, B:69:0x01bb, B:70:0x01cb, B:72:0x01d1, B:76:0x01e4, B:80:0x01eb, B:81:0x01ef, B:83:0x01f5, B:85:0x0206, B:89:0x0216, B:91:0x021a, B:92:0x021e, B:94:0x0224, B:97:0x023b, B:99:0x023f, B:108:0x025d, B:110:0x0265, B:118:0x027f, B:112:0x026c, B:114:0x0274, B:102:0x024e, B:68:0x01b5, B:14:0x0048, B:48:0x013d, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015a, B:57:0x015e, B:17:0x0059, B:36:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0107, B:44:0x0115, B:20:0x0065, B:32:0x00cd, B:23:0x0072, B:25:0x007c, B:28:0x00aa, B:29:0x00b0), top: B:123:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d1 A[Catch: Exception -> 0x0286, TryCatch #0 {Exception -> 0x0286, blocks: (B:9:0x002b, B:61:0x0194, B:63:0x019d, B:65:0x01a3, B:66:0x01af, B:69:0x01bb, B:70:0x01cb, B:72:0x01d1, B:76:0x01e4, B:80:0x01eb, B:81:0x01ef, B:83:0x01f5, B:85:0x0206, B:89:0x0216, B:91:0x021a, B:92:0x021e, B:94:0x0224, B:97:0x023b, B:99:0x023f, B:108:0x025d, B:110:0x0265, B:118:0x027f, B:112:0x026c, B:114:0x0274, B:102:0x024e, B:68:0x01b5, B:14:0x0048, B:48:0x013d, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015a, B:57:0x015e, B:17:0x0059, B:36:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0107, B:44:0x0115, B:20:0x0065, B:32:0x00cd, B:23:0x0072, B:25:0x007c, B:28:0x00aa, B:29:0x00b0), top: B:123:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f5 A[Catch: Exception -> 0x0286, TryCatch #0 {Exception -> 0x0286, blocks: (B:9:0x002b, B:61:0x0194, B:63:0x019d, B:65:0x01a3, B:66:0x01af, B:69:0x01bb, B:70:0x01cb, B:72:0x01d1, B:76:0x01e4, B:80:0x01eb, B:81:0x01ef, B:83:0x01f5, B:85:0x0206, B:89:0x0216, B:91:0x021a, B:92:0x021e, B:94:0x0224, B:97:0x023b, B:99:0x023f, B:108:0x025d, B:110:0x0265, B:118:0x027f, B:112:0x026c, B:114:0x0274, B:102:0x024e, B:68:0x01b5, B:14:0x0048, B:48:0x013d, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015a, B:57:0x015e, B:17:0x0059, B:36:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0107, B:44:0x0115, B:20:0x0065, B:32:0x00cd, B:23:0x0072, B:25:0x007c, B:28:0x00aa, B:29:0x00b0), top: B:123:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021a A[Catch: Exception -> 0x0286, TryCatch #0 {Exception -> 0x0286, blocks: (B:9:0x002b, B:61:0x0194, B:63:0x019d, B:65:0x01a3, B:66:0x01af, B:69:0x01bb, B:70:0x01cb, B:72:0x01d1, B:76:0x01e4, B:80:0x01eb, B:81:0x01ef, B:83:0x01f5, B:85:0x0206, B:89:0x0216, B:91:0x021a, B:92:0x021e, B:94:0x0224, B:97:0x023b, B:99:0x023f, B:108:0x025d, B:110:0x0265, B:118:0x027f, B:112:0x026c, B:114:0x0274, B:102:0x024e, B:68:0x01b5, B:14:0x0048, B:48:0x013d, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015a, B:57:0x015e, B:17:0x0059, B:36:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0107, B:44:0x0115, B:20:0x0065, B:32:0x00cd, B:23:0x0072, B:25:0x007c, B:28:0x00aa, B:29:0x00b0), top: B:123:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objAwait;
        Object objAwait2;
        CoroutineScope coroutineScope2;
        List list;
        CurrencySuggestionPairsBean currencySuggestionPairsBean;
        Object objAwait3;
        List list2;
        CurrencySuggestionPairsBean currencySuggestionPairsBean2;
        String str;
        Pair pairOLrzqt;
        Object objAwait4;
        String str2;
        List list3;
        CurrencySuggestionPairsBean currencySuggestionPairsBean3;
        String str3;
        ConvertCurrencyBean from;
        Pair<ConvertCurrencyBean, ConvertCurrencyBean> pairOLrzqt2;
        Iterator it;
        Object next;
        Iterator it2;
        Object next2;
        ConvertCurrencyBean convertCurrencyBean;
        ConvertCurrencyBean convertCurrencyBean2;
        ConvertCurrencyBean convertCurrencyBean3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        Object obj2 = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                Pair<ConvertCurrencyBean, ConvertCurrencyBean> pairOLrzqt3 = lyK.copydefault.OLrzqt();
                String str4 = this.$fromCcy;
                if ((str4 != null ? new ConvertCurrencyBean(str4, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (Boolean) null, (String) null, (String) null, false, false, (String) null, false, 0, (String) null, (EarnOption) null, 262142, (DefaultConstructorMarker) null) : null) == null) {
                    pairOLrzqt3.getFirst();
                }
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetConvertInitDataUseCase$invoke$2$fromListResult$1(this.this$0, this.$valuationUnit, null), 3, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                objAwait = deferredAsync$default.await(this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else if (i == 1) {
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait = obj;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        currencySuggestionPairsBean2 = (CurrencySuggestionPairsBean) this.L$2;
                        List list4 = (List) this.L$1;
                        CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        coroutineScope2 = coroutineScope3;
                        list2 = list4;
                        objAwait3 = obj;
                        CurrencySuggestionPairsBean currencySuggestionPairsBean4 = (CurrencySuggestionPairsBean) objAwait3;
                        currencySuggestionPairsBean4.getFrom();
                        ConvertCurrencyBean from2 = currencySuggestionPairsBean4.getFrom();
                        String ccy = from2 == null ? from2.getCcy() : null;
                        ConvertCurrencyBean to = currencySuggestionPairsBean4.getTo();
                        pairOLrzqt = C56390yDp.OLrzqt(ccy, to == null ? to.getCcy() : null);
                        String str5 = (String) pairOLrzqt.component1();
                        String str6 = (String) pairOLrzqt.component2();
                        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new GetConvertInitDataUseCase$invoke$2$toListResult$1(this.this$0, str5, this.$valuationUnit, null), 3, null);
                        this.L$0 = coroutineScope2;
                        this.L$1 = list2;
                        this.L$2 = currencySuggestionPairsBean2;
                        this.L$3 = str5;
                        this.L$4 = str6;
                        this.label = 4;
                        objAwait4 = deferredAsync$default2.await(this);
                        if (objAwait4 != objCopydefault) {
                            return objCopydefault;
                        }
                        str2 = str6;
                        list3 = list2;
                        currencySuggestionPairsBean3 = currencySuggestionPairsBean2;
                        str3 = str5;
                        List list5 = (List) objAwait4;
                        from = currencySuggestionPairsBean3.getFrom();
                        if (from == null) {
                        }
                        ConvertCurrencyBean convertCurrencyBeanComponent1 = pairOLrzqt2.component1();
                        ConvertCurrencyBean convertCurrencyBeanComponent2 = pairOLrzqt2.component2();
                        it = list3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        ConvertCurrencyBean convertCurrencyBean4 = (ConvertCurrencyBean) next;
                        if (convertCurrencyBean4 != null) {
                        }
                        it2 = list5.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                            }
                        }
                        convertCurrencyBean = (ConvertCurrencyBean) next2;
                        if (convertCurrencyBean != null) {
                        }
                        z = C33129mqd.OLrzqt((CharSequence) this.$toCcy) ? false : false;
                        return new C31653lza(convertCurrencyBean, convertCurrencyBean2, list3, list5, z);
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.L$4;
                    str3 = (String) this.L$3;
                    CurrencySuggestionPairsBean currencySuggestionPairsBean5 = (CurrencySuggestionPairsBean) this.L$2;
                    List list6 = (List) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    list3 = list6;
                    currencySuggestionPairsBean3 = currencySuggestionPairsBean5;
                    objAwait4 = obj;
                    List list52 = (List) objAwait4;
                    from = currencySuggestionPairsBean3.getFrom();
                    if (from == null) {
                        pairOLrzqt2 = lyK.copydefault.OLrzqt();
                    } else {
                        ConvertCurrencyBean to2 = currencySuggestionPairsBean3.getTo();
                        if (to2 == null) {
                            to2 = lyK.copydefault.OLrzqt().getSecond();
                        }
                        pairOLrzqt2 = C56390yDp.OLrzqt(from, to2);
                        if (pairOLrzqt2 == null) {
                        }
                    }
                    ConvertCurrencyBean convertCurrencyBeanComponent12 = pairOLrzqt2.component1();
                    ConvertCurrencyBean convertCurrencyBeanComponent22 = pairOLrzqt2.component2();
                    it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((ConvertCurrencyBean) next).getCcy(), (Object) str3)) {
                            break;
                        }
                    }
                    ConvertCurrencyBean convertCurrencyBean42 = (ConvertCurrencyBean) next;
                    ConvertCurrencyBean convertCurrencyBean5 = convertCurrencyBean42 != null ? convertCurrencyBeanComponent12 : convertCurrencyBean42;
                    it2 = list52.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = it2.next();
                            ConvertCurrencyBean convertCurrencyBean6 = (ConvertCurrencyBean) next2;
                            if (Intrinsics.EZpvd((Object) convertCurrencyBean6.getCcy(), (Object) str2) && !Intrinsics.EZpvd((Object) convertCurrencyBean6.getCcy(), (Object) convertCurrencyBean5.getCcy())) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    convertCurrencyBean = (ConvertCurrencyBean) next2;
                    if (convertCurrencyBean != null) {
                        Iterator it3 = list52.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next3 = it3.next();
                            if (!Intrinsics.EZpvd((Object) ((ConvertCurrencyBean) next3).getCcy(), (Object) convertCurrencyBean5.getCcy())) {
                                obj2 = next3;
                                break;
                            }
                        }
                        ConvertCurrencyBean convertCurrencyBean7 = (ConvertCurrencyBean) obj2;
                        convertCurrencyBean2 = convertCurrencyBean7 == null ? (Intrinsics.EZpvd((Object) convertCurrencyBeanComponent22.getCcy(), (Object) convertCurrencyBean5.getCcy()) && (convertCurrencyBean3 = (ConvertCurrencyBean) CollectionsKt___CollectionsKt.firstOrNull(list52)) != null) ? convertCurrencyBean3 : convertCurrencyBeanComponent22 : convertCurrencyBean7;
                    } else {
                        convertCurrencyBean2 = convertCurrencyBean;
                    }
                    if ((C33129mqd.OLrzqt((CharSequence) this.$toCcy) || !(!list52.isEmpty())) && (!C33129mqd.OLrzqt((CharSequence) this.$fromCcy) || !(!list52.isEmpty()))) {
                    }
                    return new C31653lza(convertCurrencyBean5, convertCurrencyBean2, list3, list52, z);
                }
                list = (List) this.L$1;
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope2 = coroutineScope4;
                objAwait2 = obj;
                currencySuggestionPairsBean = (CurrencySuggestionPairsBean) objAwait2;
                if (!C33129mqd.OLrzqt((CharSequence) this.$toCcy) && (str = this.$fromCcy) != null && str.length() != 0) {
                    pairOLrzqt = C56390yDp.OLrzqt(this.$fromCcy, this.$toCcy);
                    list2 = list;
                    currencySuggestionPairsBean2 = currencySuggestionPairsBean;
                    String str52 = (String) pairOLrzqt.component1();
                    String str62 = (String) pairOLrzqt.component2();
                    Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new GetConvertInitDataUseCase$invoke$2$toListResult$1(this.this$0, str52, this.$valuationUnit, null), 3, null);
                    this.L$0 = coroutineScope2;
                    this.L$1 = list2;
                    this.L$2 = currencySuggestionPairsBean2;
                    this.L$3 = str52;
                    this.L$4 = str62;
                    this.label = 4;
                    objAwait4 = deferredAsync$default22.await(this);
                    if (objAwait4 != objCopydefault) {
                    }
                }
                Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new GetConvertInitDataUseCase$invoke$2$suggestionPair$2(this.this$0, this.$toCcy, this.$valuationUnit, null), 3, null);
                this.L$0 = coroutineScope2;
                this.L$1 = list;
                this.L$2 = currencySuggestionPairsBean;
                this.label = 3;
                objAwait3 = deferredAsync$default3.await(this);
                if (objAwait3 != objCopydefault) {
                    return objCopydefault;
                }
                list2 = list;
                currencySuggestionPairsBean2 = currencySuggestionPairsBean;
                CurrencySuggestionPairsBean currencySuggestionPairsBean42 = (CurrencySuggestionPairsBean) objAwait3;
                currencySuggestionPairsBean42.getFrom();
                ConvertCurrencyBean from22 = currencySuggestionPairsBean42.getFrom();
                if (from22 == null) {
                }
                ConvertCurrencyBean to3 = currencySuggestionPairsBean42.getTo();
                pairOLrzqt = C56390yDp.OLrzqt(ccy, to3 == null ? to3.getCcy() : null);
                String str522 = (String) pairOLrzqt.component1();
                String str622 = (String) pairOLrzqt.component2();
                Deferred deferredAsync$default222 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new GetConvertInitDataUseCase$invoke$2$toListResult$1(this.this$0, str522, this.$valuationUnit, null), 3, null);
                this.L$0 = coroutineScope2;
                this.L$1 = list2;
                this.L$2 = currencySuggestionPairsBean2;
                this.L$3 = str522;
                this.L$4 = str622;
                this.label = 4;
                objAwait4 = deferredAsync$default222.await(this);
                if (objAwait4 != objCopydefault) {
                }
            }
            List list7 = (List) objAwait;
            Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetConvertInitDataUseCase$invoke$2$suggestionPair$1(this.this$0, this.$toCcy, this.$valuationUnit, null), 3, null);
            this.L$0 = coroutineScope;
            this.L$1 = list7;
            this.label = 2;
            objAwait2 = deferredAsync$default4.await(this);
            if (objAwait2 == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope2 = coroutineScope;
            list = list7;
            currencySuggestionPairsBean = (CurrencySuggestionPairsBean) objAwait2;
            if (!C33129mqd.OLrzqt((CharSequence) this.$toCcy)) {
                pairOLrzqt = C56390yDp.OLrzqt(this.$fromCcy, this.$toCcy);
                list2 = list;
                currencySuggestionPairsBean2 = currencySuggestionPairsBean;
                String str5222 = (String) pairOLrzqt.component1();
                String str6222 = (String) pairOLrzqt.component2();
                Deferred deferredAsync$default2222 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new GetConvertInitDataUseCase$invoke$2$toListResult$1(this.this$0, str5222, this.$valuationUnit, null), 3, null);
                this.L$0 = coroutineScope2;
                this.L$1 = list2;
                this.L$2 = currencySuggestionPairsBean2;
                this.L$3 = str5222;
                this.L$4 = str6222;
                this.label = 4;
                objAwait4 = deferredAsync$default2222.await(this);
                if (objAwait4 != objCopydefault) {
                }
            }
            Deferred deferredAsync$default32 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new GetConvertInitDataUseCase$invoke$2$suggestionPair$2(this.this$0, this.$toCcy, this.$valuationUnit, null), 3, null);
            this.L$0 = coroutineScope2;
            this.L$1 = list;
            this.L$2 = currencySuggestionPairsBean;
            this.label = 3;
            objAwait3 = deferredAsync$default32.await(this);
            if (objAwait3 != objCopydefault) {
            }
        } catch (Exception e) {
            e.getMessage();
            lyK lyk = lyK.copydefault;
            return new C31653lza(lyk.OLrzqt().getFirst(), lyk.OLrzqt().getSecond(), yDY.AhwBna(), yDY.AhwBna(), false, 16, null);
        }
    }
}
