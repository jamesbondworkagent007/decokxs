package com.okinc.business.trade.features.home.meme.repository;

import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;
import o.kAB;
import o.kVD;

/* JADX INFO: loaded from: classes18.dex */
public final class PresetUserConfigRepositoryImpl$presetReset$legacyCall$1 extends SuspendLambda implements Function1<Continuation<? super AbstractC43419rot<? extends DexPresetResultVO, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $presetType;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ kVD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresetUserConfigRepositoryImpl$presetReset$legacyCall$1(kVD kvd, String str, String str2, String str3, Continuation<? super PresetUserConfigRepositoryImpl$presetReset$legacyCall$1> continuation) {
        super(1, continuation);
        this.this$0 = kvd;
        this.$chainId = str;
        this.$presetType = str2;
        this.$walletAddress = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PresetUserConfigRepositoryImpl$presetReset$legacyCall$1(this.this$0, this.$chainId, this.$presetType, this.$walletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super AbstractC43419rot<? extends DexPresetResultVO, ? extends OKServerException>> continuation) {
        return invoke2((Continuation<? super AbstractC43419rot<DexPresetResultVO, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super AbstractC43419rot<DexPresetResultVO, OKServerException>> continuation) {
        return ((PresetUserConfigRepositoryImpl$presetReset$legacyCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.meme.repository.PresetUserConfigRepositoryImpl$presetReset$legacyCall$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ResponseData<DexPresetResultVO>>, Object> {
        final /* synthetic */ String $chainId;
        final /* synthetic */ String $presetType;
        final /* synthetic */ String $walletAddress;
        int label;
        final /* synthetic */ kVD this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kVD kvd, String str, String str2, String str3, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = kvd;
            this.$chainId = str;
            this.$presetType = str2;
            this.$walletAddress = str3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$chainId, this.$presetType, this.$walletAddress, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ResponseData<DexPresetResultVO>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ArrayList<PresetUserConfigBean> dexPresetResultVOList;
            PresetUserConfigBean presetUserConfigBean;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC23234huQ interfaceC23234huQ = this.this$0.EZpvd;
                String str = this.$chainId;
                String str2 = this.$presetType;
                this.label = 1;
                obj = interfaceC23234huQ.EZpvd(str, str2, this);
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
            String str3 = this.$presetType;
            String str4 = this.$chainId;
            String str5 = this.$walletAddress;
            DexPresetResultVO dexPresetResultVO = (DexPresetResultVO) ((ResponseData) obj).getData();
            if (dexPresetResultVO != null && (dexPresetResultVOList = dexPresetResultVO.getDexPresetResultVOList()) != null && (presetUserConfigBean = (PresetUserConfigBean) CollectionsKt___CollectionsKt.firstOrNull(dexPresetResultVOList)) != null) {
                kvd.EZpvd(str3, str4, str5, presetUserConfigBean);
            }
            return obj;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$chainId, this.$presetType, this.$walletAddress, null);
            this.label = 1;
            obj = kAB.EZpvd(anonymousClass1, this);
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
