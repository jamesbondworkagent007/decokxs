package com.okinc.business.defi.wallet.connect.viewmodel;

import com.okinc.business.defi.biz.net.bean.ParseENSResp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C16103edc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletTrackerAddressViewModel$checkENSDomainAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $domain;
    int label;
    final /* synthetic */ C16103edc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTrackerAddressViewModel$checkENSDomainAsync$1(String str, C16103edc c16103edc, Continuation<? super DefiWalletTrackerAddressViewModel$checkENSDomainAsync$1> continuation) {
        super(2, continuation);
        this.$domain = str;
        this.this$0 = c16103edc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletTrackerAddressViewModel$checkENSDomainAsync$1(this.$domain, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DefiWalletTrackerAddressViewModel$checkENSDomainAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$domain.length() == 0) {
                return null;
            }
            C13934dbu c13934dbu = this.this$0.gEmmrt;
            String str = this.$domain;
            this.label = 1;
            obj = c13934dbu.DbNXlk(str, this);
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
        if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
            if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String address = ((ParseENSResp) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getAddress();
        if (address == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) address))) {
            return null;
        }
        return address;
    }
}
