package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotification;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.FilterAction;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC25766jFo;
import o.AbstractC25769jFr;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerAddressManagementBaseActivity$openNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ String $alias;
    final /* synthetic */ boolean $hasAlert;
    int label;
    final /* synthetic */ AbstractActivityC25766jFo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerAddressManagementBaseActivity$openNotification$1(boolean z, AbstractActivityC25766jFo abstractActivityC25766jFo, String str, String str2, Continuation<? super TrackerAddressManagementBaseActivity$openNotification$1> continuation) {
        super(2, continuation);
        this.$hasAlert = z;
        this.this$0 = abstractActivityC25766jFo;
        this.$address = str;
        this.$alias = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerAddressManagementBaseActivity$openNotification$1(this.$hasAlert, this.this$0, this.$address, this.$alias, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerAddressManagementBaseActivity$openNotification$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$hasAlert) {
                this.this$0.AEQbTJ(new FilterAction.Create(this.$address, this.$alias), new TokenFilter(null, null, "all", new PriceRangeFilter("100", "", (TokenAgeType) null, (String) null, (String) null, (String) null, false, 60, (DefaultConstructorMarker) null), null, false, false, null, false, false, null, null, null, 8115, null));
                return Unit.INSTANCE;
            }
            AbstractC25769jFr abstractC25769jFrAYXKKw = this.this$0.AYXKKw();
            String str = this.$address;
            this.label = 1;
            Object objAEQbTJ = abstractC25769jFrAYXKKw.AEQbTJ(str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objAEQbTJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        AbstractActivityC25766jFo abstractActivityC25766jFo = this.this$0;
        String str2 = this.$alias;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            abstractActivityC25766jFo.copydefault(AddressTrackerNotification.copy$default((AddressTrackerNotification) objM7386unboximpl, null, null, str2, false, null, null, null, 123, null));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
        }
        Result.m7376boximpl(objM7386unboximpl);
        return Unit.INSTANCE;
    }
}
