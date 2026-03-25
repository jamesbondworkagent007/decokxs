package com.okinc.business.defi.wallet.transfer.receive.exchange;

import com.okinc.assets.backend.api.model.AddressList;
import com.okinc.assets.backend.api.model.GetDepositSupportResponse;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C10854bwM;
import o.C21113gtd;
import o.C54862xYb;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC8224ayh;

/* JADX INFO: loaded from: classes5.dex */
public final class ShowExchangeEntryViewModel$isShowExchangeEntry$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<ExchangeAddressData, Unit> $callback;
    final /* synthetic */ C10854bwM $coinMeta;
    final /* synthetic */ Integer $currencyId;
    final /* synthetic */ boolean $isNeedExchangeAdrList;
    final /* synthetic */ boolean $isSingleTransfer;
    int label;
    final /* synthetic */ C21113gtd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShowExchangeEntryViewModel$isShowExchangeEntry$1(C21113gtd c21113gtd, Integer num, boolean z, C10854bwM c10854bwM, boolean z2, Function1<? super ExchangeAddressData, Unit> function1, Continuation<? super ShowExchangeEntryViewModel$isShowExchangeEntry$1> continuation) {
        super(2, continuation);
        this.this$0 = c21113gtd;
        this.$currencyId = num;
        this.$isSingleTransfer = z;
        this.$coinMeta = c10854bwM;
        this.$isNeedExchangeAdrList = z2;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShowExchangeEntryViewModel$isShowExchangeEntry$1(this.this$0, this.$currencyId, this.$isSingleTransfer, this.$coinMeta, this.$isNeedExchangeAdrList, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShowExchangeEntryViewModel$isShowExchangeEntry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C10854bwM c10854bwMKWHzl;
        ArrayList arrayList;
        ArrayList<AddressList> addressList;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC8224ayh interfaceC8224ayhEZpvd = this.this$0.EZpvd();
            Integer num = this.$currencyId;
            Boolean boolKWHzl = C56443yFo.KWHzl(this.$isSingleTransfer && (c10854bwMKWHzl = this.$coinMeta.KWHzl()) != null && c10854bwMKWHzl.DGgnkA());
            this.label = 1;
            obj = interfaceC8224ayhEZpvd.OLrzqt(num, boolKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        boolean z = this.$isNeedExchangeAdrList;
        C21113gtd c21113gtd = this.this$0;
        Integer num2 = this.$currencyId;
        Function1<ExchangeAddressData, Unit> function1 = this.$callback;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            GetDepositSupportResponse getDepositSupportResponse = (GetDepositSupportResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            boolean z2 = Intrinsics.EZpvd(getDepositSupportResponse.getSupport(), C56443yFo.KWHzl(true)) && (!z || ((addressList = getDepositSupportResponse.getAddressList()) != null && (addressList.isEmpty() ^ true)));
            ArrayList<AddressList> addressList2 = getDepositSupportResponse.getAddressList();
            if (addressList2 != null) {
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(addressList2, 10));
                for (AddressList addressList3 : addressList2) {
                    arrayList2.add(new ExchangeAddressData.AddressBean(addressList3.getAddress(), addressList3.getTag(), addressList3.getMemo()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Integer currencyId = getDepositSupportResponse.getCurrencyId();
            String depositLimit = getDepositSupportResponse.getDepositLimit();
            c21113gtd.AEQbTJ(new ExchangeAddressData(currencyId, num2, depositLimit != null ? C54862xYb.convertToBigDecimalString$default(depositLimit, false, 1, null) : null, arrayList, C56443yFo.KWHzl(z2)));
            if (function1 != null) {
                function1.invoke(c21113gtd.copydefault());
            }
        }
        Function1<ExchangeAddressData, Unit> function12 = this.$callback;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            if (function12 != null) {
                function12.invoke(null);
            }
        }
        return Unit.INSTANCE;
    }
}
