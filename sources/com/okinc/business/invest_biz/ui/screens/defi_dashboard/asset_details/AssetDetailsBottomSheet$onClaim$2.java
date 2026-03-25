package com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsBottomSheet$onClaim$2;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26566jej;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes15.dex */
public final class AssetDetailsBottomSheet$onClaim$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<AssetDetailsResult, Unit> $handleResult;
    final /* synthetic */ AssetRawData $rawData;
    int label;
    final /* synthetic */ AssetDetailsBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsResult, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssetDetailsBottomSheet$onClaim$2(AssetDetailsBottomSheet assetDetailsBottomSheet, AssetRawData assetRawData, Function1<? super AssetDetailsResult, Unit> function1, Continuation<? super AssetDetailsBottomSheet$onClaim$2> continuation) {
        super(2, continuation);
        this.this$0 = assetDetailsBottomSheet;
        this.$rawData = assetRawData;
        this.$handleResult = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetDetailsBottomSheet$onClaim$2(this.this$0, this.$rawData, this.$handleResult, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AssetDetailsBottomSheet$onClaim$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26566jej c26566jej = this.this$0.KWHzl;
            if (c26566jej != null) {
                InvestAction investActionCopydefault = this.$rawData.copydefault();
                if (investActionCopydefault == null) {
                    investActionCopydefault = InvestAction.Claim;
                }
                InvestUserRewardsAction investUserRewardsActionGEmmrt = this.$rawData.gEmmrt();
                if (investUserRewardsActionGEmmrt == null) {
                    investUserRewardsActionGEmmrt = InvestUserRewardsAction.COMMON;
                }
                RewardType rewardTypeAhwBna = this.$rawData.AhwBna();
                String strOLrzqt = this.$rawData.OLrzqt();
                List<InvestUserRewardElementInfo> listKWHzl = this.$rawData.KWHzl();
                if (listKWHzl == null) {
                    listKWHzl = yDY.AhwBna();
                }
                Long lKWHzl = C56443yFo.KWHzl(this.$rawData.AEQbTJ().AEQbTJ().OLrzqt());
                final Function1<AssetDetailsResult, Unit> function1 = this.$handleResult;
                final AssetDetailsBottomSheet assetDetailsBottomSheet = this.this$0;
                Function0 function0 = new Function0() { // from class: o.iYK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AssetDetailsBottomSheet$onClaim$2.invokeSuspend$lambda$0(function1, assetDetailsBottomSheet);
                    }
                };
                this.label = 1;
                if (c26566jej.EZpvd(investActionCopydefault, investUserRewardsActionGEmmrt, strOLrzqt, listKWHzl, rewardTypeAhwBna, (3520 & 32) != 0 ? null : lKWHzl, (3520 & 64) != 0 ? null : null, (3520 & 128) != 0 ? null : null, (3520 & 256) != 0 ? null : null, (3520 & 512) != 0 ? false : false, (3520 & 1024) != 0 ? null : function0, (3520 & 2048) != 0 ? null : null, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Function1 function1, AssetDetailsBottomSheet assetDetailsBottomSheet) {
        if (function1 != null) {
            function1.invoke(new AssetDetailsResult(AssetDetailsResultType.REFRESH, 0L, 0L, null, 14, null));
        }
        assetDetailsBottomSheet.dismiss();
        return Unit.INSTANCE;
    }
}
