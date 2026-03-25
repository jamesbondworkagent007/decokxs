package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C30806liB;
import o.C30808liD;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainVM$initSettingModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdvancedMainConfig $config;
    final /* synthetic */ boolean $fullReset;
    int label;
    final /* synthetic */ AdvancedMainVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMainVM$initSettingModel$1(AdvancedMainVM advancedMainVM, boolean z, AdvancedMainConfig advancedMainConfig, Continuation<? super AdvancedMainVM$initSettingModel$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMainVM;
        this.$fullReset = z;
        this.$config = advancedMainConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMainVM$initSettingModel$1(this.this$0, this.$fullReset, this.$config, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMainVM$initSettingModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C30808liD c30808liDCopydefault;
        String chainId;
        String strFetchVPNInfo;
        String tokenSymbol;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.valueOf;
            boolean z = this.$fullReset;
            AdvancedMainConfig advancedMainConfig = this.$config;
            AdvancedMainVM advancedMainVM = this.this$0;
            do {
                value = mutableStateFlow.getValue();
                c30808liDCopydefault = z ? C30808liD.Companion.copydefault() : ((C30806liB) value).copydefault();
                chainId = advancedMainConfig.getChainId();
                strFetchVPNInfo = advancedMainVM.fetchVPNInfo();
                DexMultiTokenInfoBean nativeTokenInfo = advancedMainConfig.getNativeTokenInfo();
                tokenSymbol = nativeTokenInfo != null ? nativeTokenInfo.getTokenSymbol() : null;
                if (tokenSymbol == null) {
                    tokenSymbol = "";
                }
            } while (!mutableStateFlow.compareAndSet(value, new C30806liB(false, false, advancedMainConfig.getSupportAutoMode(), c30808liDCopydefault.copydefault((24851 & 1) != 0 ? c30808liDCopydefault.fARcdN : null, (24851 & 2) != 0 ? c30808liDCopydefault.OLrzqt : chainId, (24851 & 4) != 0 ? c30808liDCopydefault.fetchVPNInfo : null, (24851 & 8) != 0 ? c30808liDCopydefault.isConnected : 0, (24851 & 16) != 0 ? c30808liDCopydefault.EZpvd : null, (24851 & 32) != 0 ? c30808liDCopydefault.DbNXlk : null, (24851 & 64) != 0 ? c30808liDCopydefault.gEmmrt : 0, (24851 & 128) != 0 ? c30808liDCopydefault.djBIcL : false, (24851 & 256) != 0 ? c30808liDCopydefault.KWHzl : null, (24851 & 512) != 0 ? c30808liDCopydefault.values : strFetchVPNInfo, (24851 & 1024) != 0 ? c30808liDCopydefault.AkhnZx : null, (24851 & 2048) != 0 ? c30808liDCopydefault.AhwBna : null, (24851 & 4096) != 0 ? c30808liDCopydefault.AuCTel : null, (24851 & 8192) != 0 ? c30808liDCopydefault.valueOf : false, (24851 & 16384) != 0 ? c30808liDCopydefault.AYXKKw : tokenSymbol), 3, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
