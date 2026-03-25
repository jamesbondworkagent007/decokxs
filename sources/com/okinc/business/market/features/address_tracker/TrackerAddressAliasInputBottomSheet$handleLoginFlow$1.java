package com.okinc.business.market.features.address_tracker;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.dexlogic.main.market.detail.TrackingAddressViewModel;
import com.okinc.business.market.features.address_tracker.TrackerAddressAliasInputBottomSheet$handleLoginFlow$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25389ivm;
import o.C25633jAq;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9854bdT;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerAddressAliasInputBottomSheet$handleLoginFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $addressAlias;
    final /* synthetic */ String $holderAddress;
    int label;
    final /* synthetic */ C25633jAq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerAddressAliasInputBottomSheet$handleLoginFlow$1(C25633jAq c25633jAq, String str, String str2, Continuation<? super TrackerAddressAliasInputBottomSheet$handleLoginFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c25633jAq;
        this.$holderAddress = str;
        this.$addressAlias = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerAddressAliasInputBottomSheet$handleLoginFlow$1(this.this$0, this.$holderAddress, this.$addressAlias, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerAddressAliasInputBottomSheet$handleLoginFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TrackingAddressViewModel trackingAddressViewModelAEQbTJ = this.this$0.AEQbTJ();
            this.label = 1;
            objEZpvd = trackingAddressViewModelAEQbTJ.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objEZpvd)) {
            objEZpvd = null;
        }
        DappSignArgs dappSignArgs = (DappSignArgs) objEZpvd;
        if (dappSignArgs == null) {
            return Unit.INSTANCE;
        }
        InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class);
        Context contextRequireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final C25633jAq c25633jAq = this.this$0;
        final String str = this.$holderAddress;
        final String str2 = this.$addressAlias;
        interfaceC9854bdT.EZpvd(contextRequireContext, dappSignArgs, new Function1() { // from class: o.jAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return TrackerAddressAliasInputBottomSheet$handleLoginFlow$1.invokeSuspend$lambda$0(c25633jAq, str, str2, (android.os.Bundle) obj2);
            }
        }, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C25633jAq c25633jAq, String str, String str2, Bundle bundle) {
        LifecycleOwner viewLifecycleOwner = c25633jAq.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TrackerAddressAliasInputBottomSheet$handleLoginFlow$1$1$1(c25633jAq, bundle, str, str2, null), 3, null);
        return Unit.INSTANCE;
    }
}
