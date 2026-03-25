package com.okinc.business.defi.wallet.connect.viewmodel;

import com.okinc.business.defi.biz.net.bean.EosAccountResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.Channel;
import o.C16103edc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletTrackerAddressViewModel$checkAddress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $ensDomain;
    final /* synthetic */ String $eosAccount;
    final /* synthetic */ String $nearAddress;
    final /* synthetic */ String $originalAddress;
    final /* synthetic */ Long $singleChainId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C16103edc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTrackerAddressViewModel$checkAddress$1(C16103edc c16103edc, String str, String str2, String str3, String str4, Long l, Continuation<? super DefiWalletTrackerAddressViewModel$checkAddress$1> continuation) {
        super(2, continuation);
        this.this$0 = c16103edc;
        this.$ensDomain = str;
        this.$eosAccount = str2;
        this.$nearAddress = str3;
        this.$originalAddress = str4;
        this.$singleChainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiWalletTrackerAddressViewModel$checkAddress$1 defiWalletTrackerAddressViewModel$checkAddress$1 = new DefiWalletTrackerAddressViewModel$checkAddress$1(this.this$0, this.$ensDomain, this.$eosAccount, this.$nearAddress, this.$originalAddress, this.$singleChainId, continuation);
        defiWalletTrackerAddressViewModel$checkAddress$1.L$0 = obj;
        return defiWalletTrackerAddressViewModel$checkAddress$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletTrackerAddressViewModel$checkAddress$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredOLrzqt;
        Deferred deferredKWHzl;
        Object objAwait;
        Object objAwait2;
        Deferred deferred;
        String str;
        Object objAwait3;
        String str2;
        int i;
        Channel channel;
        C16103edc.Activity activity;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredEZpvd = this.this$0.EZpvd(coroutineScope, this.$ensDomain);
            deferredOLrzqt = this.this$0.OLrzqt(coroutineScope, this.$eosAccount);
            deferredKWHzl = this.this$0.KWHzl(coroutineScope, this.$nearAddress);
            this.L$0 = deferredOLrzqt;
            this.L$1 = deferredKWHzl;
            this.label = 1;
            objAwait = deferredEZpvd.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    i = this.I$0;
                    String str3 = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str2 = str3;
                    objAwait3 = obj;
                    boolean zBooleanValue = ((Boolean) objAwait3).booleanValue();
                    channel = this.this$0.copydefault;
                    activity = new C16103edc.Activity(C16103edc.Application.AEQbTJ(i == 0, str2 != null, zBooleanValue), this.$originalAddress, this.$singleChainId, str2, null);
                    this.L$0 = null;
                    this.label = 4;
                    if (channel.send(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                str = (String) this.L$1;
                Deferred deferred2 = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                deferred = deferred2;
                objAwait2 = obj;
                EosAccountResp eosAccountResp = (EosAccountResp) objAwait2;
                String ownerKey = eosAccountResp == null ? eosAccountResp.getOwnerKey() : null;
                int i3 = ((ownerKey != null || StringsKt__StringsKt.fARcdN((CharSequence) ownerKey)) ? 1 : 0) ^ 1;
                this.L$0 = str;
                this.L$1 = null;
                this.I$0 = i3;
                this.label = 3;
                objAwait3 = deferred.await(this);
                if (objAwait3 != objCopydefault) {
                    return objCopydefault;
                }
                str2 = str;
                i = i3;
                boolean zBooleanValue2 = ((Boolean) objAwait3).booleanValue();
                channel = this.this$0.copydefault;
                activity = new C16103edc.Activity(C16103edc.Application.AEQbTJ(i == 0, str2 != null, zBooleanValue2), this.$originalAddress, this.$singleChainId, str2, null);
                this.L$0 = null;
                this.label = 4;
                if (channel.send(activity, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            deferredKWHzl = (Deferred) this.L$1;
            Deferred deferred3 = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            deferredOLrzqt = deferred3;
            objAwait = obj;
        }
        String str4 = (String) objAwait;
        this.L$0 = deferredKWHzl;
        this.L$1 = str4;
        this.label = 2;
        objAwait2 = deferredOLrzqt.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        deferred = deferredKWHzl;
        str = str4;
        EosAccountResp eosAccountResp2 = (EosAccountResp) objAwait2;
        if (eosAccountResp2 == null) {
        }
        if (ownerKey != null) {
            int i32 = ((ownerKey != null || StringsKt__StringsKt.fARcdN((CharSequence) ownerKey)) ? 1 : 0) ^ 1;
            this.L$0 = str;
            this.L$1 = null;
            this.I$0 = i32;
            this.label = 3;
            objAwait3 = deferred.await(this);
            if (objAwait3 != objCopydefault) {
            }
        }
        return Unit.INSTANCE;
    }
}
