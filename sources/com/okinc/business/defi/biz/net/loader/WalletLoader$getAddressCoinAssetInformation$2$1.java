package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.biz.net.bean.AddressCoinDetailRequest;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13934dbu;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC13915dbb;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletLoader$getAddressCoinAssetInformation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<AddressTokenAsset>>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ Long $chainId;
    final /* synthetic */ String $symbol;
    final /* synthetic */ C13934dbu $this_runOrErrorResponse;
    final /* synthetic */ String $tokenAddress;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$getAddressCoinAssetInformation$2$1(C13934dbu c13934dbu, String str, String str2, Long l, String str3, Continuation<? super WalletLoader$getAddressCoinAssetInformation$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c13934dbu;
        this.$symbol = str;
        this.$address = str2;
        this.$chainId = l;
        this.$tokenAddress = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletLoader$getAddressCoinAssetInformation$2$1(this.$this_runOrErrorResponse, this.$symbol, this.$address, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<AddressTokenAsset>> continuation) {
        return ((WalletLoader$getAddressCoinAssetInformation$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC13915dbb interfaceC13915dbbEZpvd = this.$this_runOrErrorResponse.EZpvd();
            AddressCoinDetailRequest addressCoinDetailRequest = new AddressCoinDetailRequest(this.$symbol, C56402yEa.EZpvd(this.$address), this.$chainId, this.$tokenAddress);
            this.label = 1;
            obj = interfaceC13915dbbEZpvd.EZpvd(addressCoinDetailRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
