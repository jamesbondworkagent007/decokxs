package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.wallet.mine.search.data.model.DiscoverSearchParam;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13915dbb;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletLoader$getSearchResult$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<WalletSearchResponse>>, Object> {
    final /* synthetic */ Long $chainId;
    final /* synthetic */ DiscoverSearchParam $discoverSearchParam;
    final /* synthetic */ String $keyword;
    final /* synthetic */ List<String> $sources;
    final /* synthetic */ C13934dbu $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$getSearchResult$2$1(C13934dbu c13934dbu, String str, Long l, List<String> list, DiscoverSearchParam discoverSearchParam, Continuation<? super WalletLoader$getSearchResult$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c13934dbu;
        this.$keyword = str;
        this.$chainId = l;
        this.$sources = list;
        this.$discoverSearchParam = discoverSearchParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletLoader$getSearchResult$2$1(this.$this_runOrErrorResponse, this.$keyword, this.$chainId, this.$sources, this.$discoverSearchParam, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<WalletSearchResponse>> continuation) {
        return ((WalletLoader$getSearchResult$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC13915dbb interfaceC13915dbbEZpvd = this.$this_runOrErrorResponse.EZpvd();
            WalletSearchRequest walletSearchRequest = new WalletSearchRequest(this.$keyword, this.$chainId, this.$sources, this.$discoverSearchParam);
            this.label = 1;
            obj = InterfaceC13915dbb.Application.getSearchResult$default(interfaceC13915dbbEZpvd, walletSearchRequest, null, this, 2, null);
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
