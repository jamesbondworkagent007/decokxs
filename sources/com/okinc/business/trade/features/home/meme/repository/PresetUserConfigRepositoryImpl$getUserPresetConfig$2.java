package com.okinc.business.trade.features.home.meme.repository;

import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;
import o.kVD;

/* JADX INFO: loaded from: classes7.dex */
public final class PresetUserConfigRepositoryImpl$getUserPresetConfig$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<DexPresetResultVO>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ kVD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresetUserConfigRepositoryImpl$getUserPresetConfig$2(kVD kvd, String str, String str2, Continuation<? super PresetUserConfigRepositoryImpl$getUserPresetConfig$2> continuation) {
        super(1, continuation);
        this.this$0 = kvd;
        this.$chainId = str;
        this.$walletAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PresetUserConfigRepositoryImpl$getUserPresetConfig$2(this.this$0, this.$chainId, this.$walletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<DexPresetResultVO>> continuation) {
        return ((PresetUserConfigRepositoryImpl$getUserPresetConfig$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.EZpvd;
            String str = this.$chainId;
            String str2 = this.$walletAddress;
            this.label = 1;
            obj = interfaceC23234huQ.copydefault(str, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        kVD kvd = this.this$0;
        String str3 = this.$chainId;
        String str4 = this.$walletAddress;
        DexPresetResultVO dexPresetResultVO = (DexPresetResultVO) ((ResponseData) obj).getData();
        if (dexPresetResultVO != null) {
            kvd.KWHzl.put(kvd.copydefault(str3, str4), dexPresetResultVO);
        }
        return obj;
    }
}
