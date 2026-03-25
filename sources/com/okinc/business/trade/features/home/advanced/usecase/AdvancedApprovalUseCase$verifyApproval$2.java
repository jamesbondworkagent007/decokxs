package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.business.trade.features.home.ui.cefi.common.NeedApprove;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28146kQp;
import o.kQF;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedApprovalUseCase$verifyApproval$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ String $defiPlatformId;
    final /* synthetic */ DexMultiTokenInfoBean $fromToken;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kQF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedApprovalUseCase$verifyApproval$2(DexMultiTokenInfoBean dexMultiTokenInfoBean, kQF kqf, String str, String str2, Continuation<? super AdvancedApprovalUseCase$verifyApproval$2> continuation) {
        super(2, continuation);
        this.$fromToken = dexMultiTokenInfoBean;
        this.this$0 = kqf;
        this.$defiPlatformId = str;
        this.$amount = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedApprovalUseCase$verifyApproval$2 advancedApprovalUseCase$verifyApproval$2 = new AdvancedApprovalUseCase$verifyApproval$2(this.$fromToken, this.this$0, this.$defiPlatformId, this.$amount, continuation);
        advancedApprovalUseCase$verifyApproval$2.L$0 = obj;
        return advancedApprovalUseCase$verifyApproval$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedApprovalUseCase$verifyApproval$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Map map;
        kQF kqf;
        String str;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        String str2;
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.$fromToken;
            if (dexMultiTokenInfoBean2 == null || Intrinsics.EZpvd((Object) dexMultiTokenInfoBean2.getNeedApprove(), (Object) NeedApprove.NO.getValue())) {
                MutableStateFlow mutableStateFlow = this.this$0.copydefault;
                AdvancedApproveState advancedApproveState = AdvancedApproveState.APPROVED;
                this.label = 1;
                if (mutableStateFlow.emit(advancedApproveState, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            InterfaceC28146kQp interfaceC28146kQp = this.this$0.OLrzqt;
            DexMultiTokenInfoBean dexMultiTokenInfoBean3 = this.$fromToken;
            this.L$0 = coroutineScope;
            this.label = 2;
            obj = interfaceC28146kQp.EZpvd(dexMultiTokenInfoBean3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            map = (Map) obj;
            if (map == null) {
                kqf = this.this$0;
                str = this.$amount;
                dexMultiTokenInfoBean = this.$fromToken;
                str2 = this.$defiPlatformId;
                this.L$0 = null;
                this.label = 4;
                if (kqf.AEQbTJ(str, dexMultiTokenInfoBean, str2, this) == objCopydefault) {
                }
            }
        } else {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i != 2) {
                if (i == 3) {
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                map = (Map) obj;
                if (map == null && (deFiPlatformTokenApprovalInfo = (DeFiPlatformTokenApprovalInfo) map.get(this.$defiPlatformId)) != null) {
                    kQF kqf2 = this.this$0;
                    String str3 = this.$amount;
                    DexMultiTokenInfoBean dexMultiTokenInfoBean4 = this.$fromToken;
                    MutableStateFlow mutableStateFlow2 = kqf2.copydefault;
                    if (str3 == null) {
                        str3 = "";
                    }
                    AdvancedApproveState advancedApproveStateEZpvd = kqf2.EZpvd(str3, deFiPlatformTokenApprovalInfo, dexMultiTokenInfoBean4);
                    this.L$0 = coroutineScope;
                    this.label = 3;
                    if (mutableStateFlow2.emit(advancedApproveStateEZpvd, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    kqf = this.this$0;
                    str = this.$amount;
                    dexMultiTokenInfoBean = this.$fromToken;
                    str2 = this.$defiPlatformId;
                    this.L$0 = null;
                    this.label = 4;
                    if (kqf.AEQbTJ(str, dexMultiTokenInfoBean, str2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
