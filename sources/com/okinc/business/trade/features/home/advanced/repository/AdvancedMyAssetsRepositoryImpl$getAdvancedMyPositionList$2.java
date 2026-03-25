package com.okinc.business.trade.features.home.advanced.repository;

import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;
import o.kQC;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMyAssetsRepositoryImpl$getAdvancedMyPositionList$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends DexMultiTokenInfoBean>>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ AdvancedAssetsFilter $filters;
    final /* synthetic */ List<DexMultiTokenInfoBean> $selectedTokens;
    final /* synthetic */ String $userUniqueId;
    int label;
    final /* synthetic */ kQC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMyAssetsRepositoryImpl$getAdvancedMyPositionList$2(kQC kqc, String str, String str2, String str3, AdvancedAssetsFilter advancedAssetsFilter, List<DexMultiTokenInfoBean> list, Continuation<? super AdvancedMyAssetsRepositoryImpl$getAdvancedMyPositionList$2> continuation) {
        super(1, continuation);
        this.this$0 = kqc;
        this.$userUniqueId = str;
        this.$accountId = str2;
        this.$chainId = str3;
        this.$filters = advancedAssetsFilter;
        this.$selectedTokens = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AdvancedMyAssetsRepositoryImpl$getAdvancedMyPositionList$2(this.this$0, this.$userUniqueId, this.$accountId, this.$chainId, this.$filters, this.$selectedTokens, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends DexMultiTokenInfoBean>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<DexMultiTokenInfoBean>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<DexMultiTokenInfoBean>>> continuation) {
        return ((AdvancedMyAssetsRepositoryImpl$getAdvancedMyPositionList$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return obj;
        }
        C56391yDq.AEQbTJ(obj);
        OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModelAEQbTJ = this.this$0.EZpvd.AEQbTJ();
        InterfaceC23234huQ interfaceC23234huQ = this.this$0.copydefault;
        String str = this.$userUniqueId;
        String str2 = this.$accountId;
        String str3 = this.$chainId;
        if (StringsKt__StringsKt.fARcdN((CharSequence) str3)) {
            str3 = null;
        }
        String str4 = this.$filters.getHidePricedTokens() ? "true" : "false";
        String sortByString = this.$filters.getSortByString();
        String str5 = this.$filters.getSortDesc() ? "true" : "false";
        List<DexMultiTokenInfoBean> list = this.$selectedTokens;
        String strJoinToString$default = list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: o.kQD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ((DexMultiTokenInfoBean) obj2).getChainId();
            }
        }, 31, null) : null;
        List<DexMultiTokenInfoBean> list2 = this.$selectedTokens;
        String strJoinToString$default2 = list2 != null ? CollectionsKt___CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new Function1() { // from class: o.kQB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ((DexMultiTokenInfoBean) obj2).getTokenContractAddress();
            }
        }, 31, null) : null;
        String hiddenValue = oKWalletHiddenSmallAssetTokenModelAEQbTJ.getEnableHidden() ? oKWalletHiddenSmallAssetTokenModelAEQbTJ.getHiddenValue() : null;
        this.label = 1;
        Object objEZpvd = interfaceC23234huQ.EZpvd(str, str2, str3, null, str4, sortByString, str5, strJoinToString$default, strJoinToString$default2, hiddenValue, this);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }
}
