package com.okinc.business.market.features.address_tracker;

import com.okinc.business.dexlogic.main.market.detail.TrackingAddressViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C25633jAq;
import o.C33070mpX;
import o.C52761wXj;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25647jBd;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerAddressAliasInputBottomSheet$updateAlias$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $addressAlias;
    final /* synthetic */ String $holderAddress;
    int label;
    final /* synthetic */ C25633jAq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerAddressAliasInputBottomSheet$updateAlias$1(C25633jAq c25633jAq, String str, String str2, Continuation<? super TrackerAddressAliasInputBottomSheet$updateAlias$1> continuation) {
        super(2, continuation);
        this.this$0 = c25633jAq;
        this.$holderAddress = str;
        this.$addressAlias = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerAddressAliasInputBottomSheet$updateAlias$1(this.this$0, this.$holderAddress, this.$addressAlias, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerAddressAliasInputBottomSheet$updateAlias$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TrackingAddressViewModel trackingAddressViewModelAEQbTJ = this.this$0.AEQbTJ();
            String str = this.$holderAddress;
            String str2 = this.$addressAlias;
            this.label = 1;
            objAEQbTJ = trackingAddressViewModelAEQbTJ.AEQbTJ(str, str2, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        C25633jAq c25633jAq = this.this$0;
        String str3 = this.$addressAlias;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            InterfaceC25647jBd interfaceC25647jBd = (InterfaceC25647jBd) objAEQbTJ;
            if (Intrinsics.EZpvd(interfaceC25647jBd, InterfaceC25647jBd.ActionBar.KWHzl)) {
                Function1 function1 = c25633jAq.copydefault;
                if (function1 != null) {
                    function1.invoke(str3);
                }
            } else {
                Integer numKWHzl = InterfaceC25647jBd.Companion.KWHzl(interfaceC25647jBd);
                if (numKWHzl != null) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(numKWHzl.intValue()), C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
                }
            }
        }
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq), C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
        }
        this.this$0.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
