package com.okinc.business.market.features.holdings.domain;

import com.okinc.business.defi.api.bean.OKWalletCloseTokenModel;
import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C28434kah;
import o.C28442kap;
import o.C28443kaq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class GetHoldingsUseCase$getActivePositionFilter$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C28443kaq>, Object> {
    final /* synthetic */ String $walletId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C28434kah this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHoldingsUseCase$getActivePositionFilter$2$1(String str, C28434kah c28434kah, Continuation<? super GetHoldingsUseCase$getActivePositionFilter$2$1> continuation) {
        super(2, continuation);
        this.$walletId = str;
        this.this$0 = c28434kah;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetHoldingsUseCase$getActivePositionFilter$2$1 getHoldingsUseCase$getActivePositionFilter$2$1 = new GetHoldingsUseCase$getActivePositionFilter$2$1(this.$walletId, this.this$0, continuation);
        getHoldingsUseCase$getActivePositionFilter$2$1.L$0 = obj;
        return getHoldingsUseCase$getActivePositionFilter$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C28443kaq> continuation) {
        return ((GetHoldingsUseCase$getActivePositionFilter$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7 A[LOOP:0: B:25:0x00c1->B:27:0x00c7, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        Deferred deferred2;
        OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModel;
        Deferred deferred3;
        Object objAwait;
        List<OKWalletCloseTokenModel> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetHoldingsUseCase$getActivePositionFilter$2$1$walletBalance$1(null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetHoldingsUseCase$getActivePositionFilter$2$1$walletBlacklist$1(this.$walletId, null), 3, null);
            Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetHoldingsUseCase$getActivePositionFilter$2$1$hideNativeToken$1(this.this$0, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.L$1 = deferredAsync$default3;
            this.label = 1;
            Object objAwait2 = deferredAsync$default.await(this);
            if (objAwait2 == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            deferred2 = deferredAsync$default3;
            obj = objAwait2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$1;
                    oKWalletHiddenSmallAssetTokenModel = (OKWalletHiddenSmallAssetTokenModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    boolean enableHidden = oKWalletHiddenSmallAssetTokenModel.getEnableHidden();
                    String hiddenValue = oKWalletHiddenSmallAssetTokenModel.getHiddenValue();
                    Intrinsics.copydefault(list);
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (OKWalletCloseTokenModel oKWalletCloseTokenModel : list) {
                        arrayList.add(new C28442kap(oKWalletCloseTokenModel.getGeneralChainId(), oKWalletCloseTokenModel.getContractAddress()));
                    }
                    return new C28443kaq(enableHidden, hiddenValue, zBooleanValue, arrayList);
                }
                oKWalletHiddenSmallAssetTokenModel = (OKWalletHiddenSmallAssetTokenModel) this.L$1;
                deferred3 = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                List list2 = (List) obj;
                this.L$0 = oKWalletHiddenSmallAssetTokenModel;
                this.L$1 = list2;
                this.label = 3;
                objAwait = deferred3.await(this);
                if (objAwait != objCopydefault) {
                    return objCopydefault;
                }
                list = list2;
                obj = objAwait;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                boolean enableHidden2 = oKWalletHiddenSmallAssetTokenModel.getEnableHidden();
                String hiddenValue2 = oKWalletHiddenSmallAssetTokenModel.getHiddenValue();
                Intrinsics.copydefault(list);
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                while (r0.hasNext()) {
                }
                return new C28443kaq(enableHidden2, hiddenValue2, zBooleanValue2, arrayList2);
            }
            deferred2 = (Deferred) this.L$1;
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModel2 = (OKWalletHiddenSmallAssetTokenModel) obj;
        this.L$0 = deferred2;
        this.L$1 = oKWalletHiddenSmallAssetTokenModel2;
        this.label = 2;
        Object objAwait3 = deferred.await(this);
        if (objAwait3 == objCopydefault) {
            return objCopydefault;
        }
        Deferred deferred4 = deferred2;
        oKWalletHiddenSmallAssetTokenModel = oKWalletHiddenSmallAssetTokenModel2;
        obj = objAwait3;
        deferred3 = deferred4;
        List list22 = (List) obj;
        this.L$0 = oKWalletHiddenSmallAssetTokenModel;
        this.L$1 = list22;
        this.label = 3;
        objAwait = deferred3.await(this);
        if (objAwait != objCopydefault) {
        }
    }
}
