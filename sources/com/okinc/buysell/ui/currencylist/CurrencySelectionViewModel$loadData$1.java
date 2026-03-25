package com.okinc.buysell.ui.currencylist;

import android.graphics.drawable.Drawable;
import com.okinc.buysell.ui.currencylist.CurrencySelectionViewModel;
import com.okinc.buysell.util.PaymentLogger;
import com.okinc.fiat.api.bean.DefaultCurrency;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel;
import com.okinc.okpaymentapi.data.remote.model.management.BalanceAccountType;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC43419rot;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.mHA;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class CurrencySelectionViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Deferred<AbstractC43419rot<?, OKServerException>>> $asyncTasks;
    final /* synthetic */ PaymentLogger.Type $loggerType;
    final /* synthetic */ boolean $shouldGetAvailableChannel;
    final /* synthetic */ long $startTime;
    final /* synthetic */ TradeType $tradeType;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ CurrencySelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends kotlinx.coroutines.Deferred<? extends o.rot<?, com.okinc.network.okg.response.OKServerException>>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CurrencySelectionViewModel$loadData$1(List<? extends Deferred<? extends AbstractC43419rot<?, OKServerException>>> list, CurrencySelectionViewModel currencySelectionViewModel, PaymentLogger.Type type, long j, TradeType tradeType, boolean z, Continuation<? super CurrencySelectionViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.$asyncTasks = list;
        this.this$0 = currencySelectionViewModel;
        this.$loggerType = type;
        this.$startTime = j;
        this.$tradeType = tradeType;
        this.$shouldGetAvailableChannel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrencySelectionViewModel$loadData$1(this.$asyncTasks, this.this$0, this.$loggerType, this.$startTime, this.$tradeType, this.$shouldGetAvailableChannel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrencySelectionViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:62:0x01c0) to fix multi-entry loop: BACK_EDGE: B:62:0x01c0 -> B:63:0x01c4 */
    /* JADX DEBUG: Type inference failed for r0v11. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v14. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v18. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v23. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v24. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v8. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r6v12. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r8v12. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|122|(1:(1:(15:6|7|8|52|(1:54)(1:55)|56|(1:58)|59|63|(6:65|(1:67)(1:68)|69|(1:71)|72|73)(6:74|120|25|(4:27|(4:29|(7:31|126|32|33|124|34|(3:36|(2:38|41)|42)(3:39|(1:41)|42))(2:45|(3:47|48|(1:50)(6:51|52|(0)(0)|56|(0)|59)))|60|62)(2:61|128)|63|(0)(0))(18:75|76|(1:78)|79|(2:80|(2:82|(2:130|84)(1:131))(2:129|85))|86|(1:88)|89|(4:92|(3:133|94|136)(1:135)|134|90)|132|95|(1:97)(1:98)|(1:100)|101|(2:102|(2:104|(2:138|106)(1:139))(1:137))|107|118|119)|109|110)|113|(1:116)|117|118|119)(2:9|10))(3:11|12|13))(3:16|17|(1:19)(2:20|(1:22)))|23|24|120|25|(0)(0)|109|110|113|(0)|117|118|119) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ec, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ed, code lost:
    
        r30 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:36:0x00fc, B:39:0x0105], limit reached: 137 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1 A[Catch: Exception -> 0x02ec, TryCatch #0 {Exception -> 0x02ec, blocks: (B:25:0x00bb, B:27:0x00c1, B:29:0x00cc, B:31:0x00d7), top: B:120:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0191 A[Catch: Exception -> 0x0059, TryCatch #1 {Exception -> 0x0059, blocks: (B:7:0x0037, B:52:0x016a, B:54:0x0191, B:56:0x019e, B:58:0x01ab, B:63:0x01c4, B:65:0x01c8, B:69:0x01dd, B:72:0x0214, B:55:0x0198, B:12:0x0053, B:23:0x00a3, B:17:0x0078, B:19:0x0080, B:20:0x0085), top: B:122:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0198 A[Catch: Exception -> 0x0059, TryCatch #1 {Exception -> 0x0059, blocks: (B:7:0x0037, B:52:0x016a, B:54:0x0191, B:56:0x019e, B:58:0x01ab, B:63:0x01c4, B:65:0x01c8, B:69:0x01dd, B:72:0x0214, B:55:0x0198, B:12:0x0053, B:23:0x00a3, B:17:0x0078, B:19:0x0080, B:20:0x0085), top: B:122:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ab A[Catch: Exception -> 0x0059, TryCatch #1 {Exception -> 0x0059, blocks: (B:7:0x0037, B:52:0x016a, B:54:0x0191, B:56:0x019e, B:58:0x01ab, B:63:0x01c4, B:65:0x01c8, B:69:0x01dd, B:72:0x0214, B:55:0x0198, B:12:0x0053, B:23:0x00a3, B:17:0x0078, B:19:0x0080, B:20:0x0085), top: B:122:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c8 A[Catch: Exception -> 0x0059, TryCatch #1 {Exception -> 0x0059, blocks: (B:7:0x0037, B:52:0x016a, B:54:0x0191, B:56:0x019e, B:58:0x01ab, B:63:0x01c4, B:65:0x01c8, B:69:0x01dd, B:72:0x0214, B:55:0x0198, B:12:0x0053, B:23:0x00a3, B:17:0x0078, B:19:0x0080, B:20:0x0085), top: B:122:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0220  */
    /* JADX WARN: Type inference failed for: r0v27, types: [T] */
    /* JADX WARN: Type inference failed for: r0v45, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r2v23, types: [T] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0167 -> B:52:0x016a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String message;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Object objAwaitAll;
        TradeType tradeType;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        Iterator it;
        long j;
        CurrencySelectionViewModel currencySelectionViewModel;
        PaymentLogger.Type type;
        String str;
        Object obj2;
        Object next;
        AbstractC43419rot abstractC43419rot;
        Iterator it2;
        ?? r2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String str2 = "";
        try {
        } catch (Exception e) {
            e = e;
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            objectRef2 = new Ref.ObjectRef();
            objectRef2.element = "";
            objectRef3 = new Ref.ObjectRef();
            objectRef3.element = yDY.AhwBna();
            List<Deferred<AbstractC43419rot<?, OKServerException>>> list = this.$asyncTasks;
            if (list.isEmpty()) {
                objAwaitAll = yDY.AhwBna();
            } else {
                Deferred[] deferredArr = (Deferred[]) list.toArray(new Deferred[0]);
                Deferred[] deferredArr2 = (Deferred[]) Arrays.copyOf(deferredArr, deferredArr.length);
                this.L$0 = objectRef;
                this.L$1 = objectRef2;
                this.L$2 = objectRef3;
                this.label = 1;
                objAwaitAll = AwaitKt.awaitAll(deferredArr2, this);
                if (objAwaitAll == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                Object objKWHzl = this.L$8;
                AbstractC43419rot abstractC43419rot2 = (AbstractC43419rot) this.L$7;
                it = (Iterator) this.L$6;
                currencySelectionViewModel = (CurrencySelectionViewModel) this.L$5;
                tradeType = (TradeType) this.L$4;
                type = (PaymentLogger.Type) this.L$3;
                objectRef4 = (Ref.ObjectRef) this.L$2;
                objectRef5 = (Ref.ObjectRef) this.L$1;
                objectRef6 = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Object obj3 = objCopydefault;
                AbstractC43419rot abstractC43419rot3 = abstractC43419rot2;
                Ref.ObjectRef objectRef7 = objectRef6;
                Object obj4 = obj3;
                mHA.OLrzqt.OLrzqt(currencySelectionViewModel.gEmmrt, C56443yFo.KWHzl(Intrinsics.EZpvd((Object) ((CryptoListModel) objKWHzl).getBalanceAccountType(), (Object) BalanceAccountType.TRADING.getValue())));
                ?? buyCurrencyList = tradeType != TradeType.BUY ? ((CryptoListModel) objKWHzl).getBuyCurrencyList() : ((CryptoListModel) objKWHzl).getSellCurrencyList();
                objectRef4.element = buyCurrencyList;
                BuySellCurrency buySellCurrency = (BuySellCurrency) CollectionsKt___CollectionsKt.firstOrNull(buyCurrencyList);
                if (buySellCurrency != null) {
                    objectRef5.element = buySellCurrency.getCurrency();
                }
                objectRef6 = objectRef7;
                AbstractC43419rot abstractC43419rot4 = abstractC43419rot3;
                if (!(abstractC43419rot4 instanceof AbstractC43419rot.ActionBar)) {
                    OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot4).KWHzl();
                    C55328xhq c55328xhq = C55328xhq.OLrzqt;
                    String message2 = oKServerException.getMessage();
                    C55328xhq.show$default(c55328xhq, message2 == null ? str2 : message2, (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                    mHA mha = mHA.OLrzqt;
                    mha.OLrzqt(currencySelectionViewModel.AYXKKw, C56443yFo.KWHzl(true));
                    mha.OLrzqt(currencySelectionViewModel.gEmmrt, C56443yFo.KWHzl(false));
                    currencySelectionViewModel.KWHzl(false);
                    PaymentLogger paymentLogger = PaymentLogger.EZpvd;
                    String message3 = oKServerException.getMessage();
                    if (message3 == null) {
                        message3 = str2;
                    }
                    paymentLogger.AEQbTJ(type, message3);
                    return Unit.INSTANCE;
                }
                objCopydefault = obj4;
                if (it.hasNext()) {
                    str = str2;
                    if (((CharSequence) objectRef6.element).length() == 0) {
                        objectRef6.element = objectRef5.element;
                    }
                    Iterator it3 = ((Iterable) objectRef4.element).iterator();
                    while (true) {
                        obj2 = null;
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        if (Intrinsics.EZpvd(((BuySellCurrency) next).getCurrency(), objectRef6.element)) {
                            break;
                        }
                    }
                    BuySellCurrency buySellCurrency2 = (BuySellCurrency) next;
                    if (buySellCurrency2 == null) {
                        buySellCurrency2 = (BuySellCurrency) CollectionsKt___CollectionsKt.AuCTelauCTel((List) objectRef4.element);
                    }
                    Iterable iterable = (Iterable) objectRef4.element;
                    List arrayList = new ArrayList();
                    for (Object obj5 : iterable) {
                        if (((BuySellCurrency) obj5).getChannelAvailable()) {
                            arrayList.add(obj5);
                        }
                    }
                    if (!this.$shouldGetAvailableChannel) {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = (List) objectRef4.element;
                    }
                    Iterator it4 = ((Iterable) objectRef4.element).iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next2 = it4.next();
                        if (Intrinsics.EZpvd(((BuySellCurrency) next2).getCurrency(), objectRef6.element)) {
                            obj2 = next2;
                            break;
                        }
                    }
                    mHA.OLrzqt.OLrzqt(this.this$0.AhwBna, new CurrencySelectionViewModel.TaskDescription(buySellCurrency2, arrayList, (BuySellCurrency) obj2));
                    PaymentLogger.EZpvd.EZpvd(this.$loggerType, "currencyList4: " + (System.currentTimeMillis() - this.$startTime));
                    return Unit.INSTANCE;
                }
                AbstractC43419rot abstractC43419rot5 = (AbstractC43419rot) it.next();
                if (abstractC43419rot5 instanceof AbstractC43419rot.StateListAnimator) {
                    objKWHzl = ((AbstractC43419rot.StateListAnimator) abstractC43419rot5).KWHzl();
                    if (objKWHzl instanceof DefaultCurrency) {
                        try {
                            PaymentLogger paymentLogger2 = PaymentLogger.EZpvd;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                StringBuilder sb = new StringBuilder();
                                sb.append("currencyList2: ");
                                abstractC43419rot = abstractC43419rot5;
                                it2 = it;
                                sb.append(jCurrentTimeMillis - j);
                                paymentLogger2.EZpvd(type, sb.toString());
                                if (tradeType == TradeType.BUY) {
                                    String buy = ((DefaultCurrency) objKWHzl).getBuy();
                                    r2 = buy;
                                    if (buy == null) {
                                        r2 = str;
                                    }
                                    objectRef6.element = r2;
                                } else {
                                    String sell = ((DefaultCurrency) objKWHzl).getSell();
                                    r2 = sell;
                                    if (sell == null) {
                                        r2 = str;
                                    }
                                    objectRef6.element = r2;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                        str = str2;
                    } else {
                        str = str2;
                        abstractC43419rot = abstractC43419rot5;
                        it2 = it;
                        if (objKWHzl instanceof CryptoListModel) {
                            PaymentLogger paymentLogger3 = PaymentLogger.EZpvd;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            StringBuilder sb2 = new StringBuilder();
                            Object obj6 = objCopydefault;
                            sb2.append("currencyList3: ");
                            sb2.append(jCurrentTimeMillis2 - j);
                            paymentLogger3.EZpvd(type, sb2.toString());
                            this.L$0 = objectRef6;
                            this.L$1 = objectRef5;
                            this.L$2 = objectRef4;
                            this.L$3 = type;
                            this.L$4 = tradeType;
                            this.L$5 = currencySelectionViewModel;
                            this.L$6 = it2;
                            abstractC43419rot3 = abstractC43419rot;
                            this.L$7 = abstractC43419rot3;
                            this.L$8 = objKWHzl;
                            this.J$0 = j;
                            this.label = 2;
                            obj3 = obj6;
                            if (currencySelectionViewModel.fetchVPNInfo.copydefault((CryptoListModel) objKWHzl, this) == obj3) {
                                return obj3;
                            }
                            it = it2;
                            str2 = str;
                            Ref.ObjectRef objectRef72 = objectRef6;
                            Object obj42 = obj3;
                            mHA.OLrzqt.OLrzqt(currencySelectionViewModel.gEmmrt, C56443yFo.KWHzl(Intrinsics.EZpvd((Object) ((CryptoListModel) objKWHzl).getBalanceAccountType(), (Object) BalanceAccountType.TRADING.getValue())));
                            if (tradeType != TradeType.BUY) {
                            }
                            objectRef4.element = buyCurrencyList;
                            BuySellCurrency buySellCurrency3 = (BuySellCurrency) CollectionsKt___CollectionsKt.firstOrNull(buyCurrencyList);
                            if (buySellCurrency3 != null) {
                            }
                            objectRef6 = objectRef72;
                            AbstractC43419rot abstractC43419rot42 = abstractC43419rot3;
                        }
                    }
                    obj42 = objCopydefault;
                    abstractC43419rot42 = abstractC43419rot;
                    it = it2;
                    str2 = str;
                } else {
                    obj42 = objCopydefault;
                    abstractC43419rot42 = abstractC43419rot5;
                    it = it;
                    str2 = str2;
                }
                if (!(abstractC43419rot42 instanceof AbstractC43419rot.ActionBar)) {
                }
                e = e3;
                str2 = str;
                mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, C56443yFo.KWHzl(true));
                this.this$0.KWHzl(false);
                PaymentLogger paymentLogger4 = PaymentLogger.EZpvd;
                PaymentLogger.Type type2 = this.$loggerType;
                message = e.getMessage();
                if (message != null) {
                    str2 = message;
                }
                paymentLogger4.AEQbTJ(type2, str2);
                return Unit.INSTANCE;
            }
            objectRef3 = (Ref.ObjectRef) this.L$2;
            objectRef2 = (Ref.ObjectRef) this.L$1;
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwaitAll = obj;
        }
        PaymentLogger.Type type3 = this.$loggerType;
        long j2 = this.$startTime;
        tradeType = this.$tradeType;
        CurrencySelectionViewModel currencySelectionViewModel2 = this.this$0;
        objectRef4 = objectRef3;
        objectRef5 = objectRef2;
        objectRef6 = objectRef;
        it = ((List) objAwaitAll).iterator();
        j = j2;
        currencySelectionViewModel = currencySelectionViewModel2;
        type = type3;
        if (it.hasNext()) {
        }
        e = e3;
        str2 = str;
        mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, C56443yFo.KWHzl(true));
        this.this$0.KWHzl(false);
        PaymentLogger paymentLogger42 = PaymentLogger.EZpvd;
        PaymentLogger.Type type22 = this.$loggerType;
        message = e.getMessage();
        if (message != null) {
        }
        paymentLogger42.AEQbTJ(type22, str2);
        return Unit.INSTANCE;
    }
}
