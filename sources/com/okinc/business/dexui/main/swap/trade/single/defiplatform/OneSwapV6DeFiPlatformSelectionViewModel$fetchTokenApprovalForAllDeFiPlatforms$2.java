package com.okinc.business.dexui.main.swap.trade.single.defiplatform;

import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.network.okg.response.ResponseData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.reactive.ChannelKt;
import o.AbstractC58185ywX;
import o.C23237huT;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class OneSwapV6DeFiPlatformSelectionViewModel$fetchTokenApprovalForAllDeFiPlatforms$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $fromAmount;
    final /* synthetic */ DexMultiTokenInfoBean $fromCoinInfo;
    final /* synthetic */ String $fromTokenContractAddress;
    final /* synthetic */ String $toTokenContractAddress;
    final /* synthetic */ String $userWalletAddress;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ OneSwapV6DeFiPlatformSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSwapV6DeFiPlatformSelectionViewModel$fetchTokenApprovalForAllDeFiPlatforms$2(OneSwapV6DeFiPlatformSelectionViewModel oneSwapV6DeFiPlatformSelectionViewModel, String str, String str2, String str3, String str4, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str5, Continuation<? super OneSwapV6DeFiPlatformSelectionViewModel$fetchTokenApprovalForAllDeFiPlatforms$2> continuation) {
        super(2, continuation);
        this.this$0 = oneSwapV6DeFiPlatformSelectionViewModel;
        this.$userWalletAddress = str;
        this.$chainId = str2;
        this.$fromTokenContractAddress = str3;
        this.$toTokenContractAddress = str4;
        this.$fromCoinInfo = dexMultiTokenInfoBean;
        this.$fromAmount = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneSwapV6DeFiPlatformSelectionViewModel$fetchTokenApprovalForAllDeFiPlatforms$2(this.this$0, this.$userWalletAddress, this.$chainId, this.$fromTokenContractAddress, this.$toTokenContractAddress, this.$fromCoinInfo, this.$fromAmount, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneSwapV6DeFiPlatformSelectionViewModel$fetchTokenApprovalForAllDeFiPlatforms$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[Catch: all -> 0x00d5, TryCatch #1 {all -> 0x00d5, blocks: (B:6:0x0020, B:17:0x006b, B:19:0x0073, B:14:0x0058, B:21:0x007f, B:23:0x0087, B:26:0x008e, B:28:0x009b, B:29:0x00a3, B:31:0x00a9, B:32:0x00c7, B:33:0x00cf), top: B:48:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:6:0x0020, B:17:0x006b, B:19:0x0073, B:14:0x0058, B:21:0x007f, B:23:0x0087, B:26:0x008e, B:28:0x009b, B:29:0x00a3, B:31:0x00a9, B:32:0x00c7, B:33:0x00cf), top: B:48:0x0020 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0068 -> B:17:0x006b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        ReceiveChannel receiveChannel;
        Throwable th;
        OneSwapV6DeFiPlatformSelectionViewModel oneSwapV6DeFiPlatformSelectionViewModel;
        ChannelIterator it;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        Map map;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58185ywX batchTokenApproveAllowanceStatus$default = C23237huT.getBatchTokenApproveAllowanceStatus$default(this.this$0.EZpvd, this.$userWalletAddress, this.$chainId, this.$fromTokenContractAddress, this.$toTokenContractAddress, null, 16, null);
            OneSwapV6DeFiPlatformSelectionViewModel oneSwapV6DeFiPlatformSelectionViewModel2 = this.this$0;
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.$fromCoinInfo;
            str = this.$fromAmount;
            ReceiveChannel channel$default = ChannelKt.toChannel$default(batchTokenApproveAllowanceStatus$default, 0, 1, null);
            try {
                oneSwapV6DeFiPlatformSelectionViewModel = oneSwapV6DeFiPlatformSelectionViewModel2;
                it = channel$default.iterator();
                dexMultiTokenInfoBean = dexMultiTokenInfoBean2;
                receiveChannel = channel$default;
                this.L$0 = oneSwapV6DeFiPlatformSelectionViewModel;
                this.L$1 = dexMultiTokenInfoBean;
                this.L$2 = str;
                this.L$3 = receiveChannel;
                this.L$4 = it;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == objCopydefault) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th2) {
                receiveChannel = channel$default;
                th = th2;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) this.L$4;
            receiveChannel = (ReceiveChannel) this.L$3;
            str = (String) this.L$2;
            dexMultiTokenInfoBean = (DexMultiTokenInfoBean) this.L$1;
            oneSwapV6DeFiPlatformSelectionViewModel = (OneSwapV6DeFiPlatformSelectionViewModel) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                if (((Boolean) obj).booleanValue()) {
                    ResponseData responseData = (ResponseData) it.next();
                    if (responseData.getCode() == 0 && (map = (Map) responseData.getData()) != null && !map.isEmpty()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Map map2 = (Map) responseData.getData();
                        if (map2 != null) {
                            for (Map.Entry entry : map2.entrySet()) {
                                linkedHashMap.put((String) entry.getKey(), ((DeFiPlatformTokenApprovalInfo) entry.getValue()).checkApproveStatusGroupForSwap(dexMultiTokenInfoBean.getDecimals(), str));
                            }
                        }
                        oneSwapV6DeFiPlatformSelectionViewModel.copydefault.setValue(linkedHashMap);
                    }
                    this.L$0 = oneSwapV6DeFiPlatformSelectionViewModel;
                    this.L$1 = dexMultiTokenInfoBean;
                    this.L$2 = str;
                    this.L$3 = receiveChannel;
                    this.L$4 = it;
                    this.label = 1;
                    obj = it.hasNext(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Unit unit = Unit.INSTANCE;
                        ChannelsKt.cancelConsumed(receiveChannel, null);
                        return Unit.INSTANCE;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel, th);
                    throw th4;
                }
            }
        }
    }
}
