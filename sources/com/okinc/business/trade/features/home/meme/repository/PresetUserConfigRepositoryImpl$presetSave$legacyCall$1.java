package com.okinc.business.trade.features.home.meme.repository;

import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
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
public final class PresetUserConfigRepositoryImpl$presetSave$legacyCall$1 extends SuspendLambda implements Function1<Continuation<? super AbstractC43419rot<? extends Object, ? extends OKServerException>>, Object> {
    final /* synthetic */ DexPresetResultVO $data;
    final /* synthetic */ PresetUserParams $req;
    int label;
    final /* synthetic */ kVD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresetUserConfigRepositoryImpl$presetSave$legacyCall$1(kVD kvd, PresetUserParams presetUserParams, DexPresetResultVO dexPresetResultVO, Continuation<? super PresetUserConfigRepositoryImpl$presetSave$legacyCall$1> continuation) {
        super(1, continuation);
        this.this$0 = kvd;
        this.$req = presetUserParams;
        this.$data = dexPresetResultVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PresetUserConfigRepositoryImpl$presetSave$legacyCall$1(this.this$0, this.$req, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super AbstractC43419rot<? extends Object, ? extends OKServerException>> continuation) {
        return invoke2((Continuation<? super AbstractC43419rot<? extends Object, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super AbstractC43419rot<? extends Object, OKServerException>> continuation) {
        return ((PresetUserConfigRepositoryImpl$presetSave$legacyCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.meme.repository.PresetUserConfigRepositoryImpl$presetSave$legacyCall$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ResponseData<Object>>, Object> {
        final /* synthetic */ PresetUserParams $req;
        int label;
        final /* synthetic */ kVD this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kVD kvd, PresetUserParams presetUserParams, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = kvd;
            this.$req = presetUserParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$req, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ResponseData<Object>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC23234huQ interfaceC23234huQ = this.this$0.EZpvd;
                PresetUserParams presetUserParams = this.$req;
                this.label = 1;
                obj = interfaceC23234huQ.copydefault(presetUserParams, this);
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$req, null);
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
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        kVD kvd = this.this$0;
        PresetUserParams presetUserParams = this.$req;
        DexPresetResultVO dexPresetResultVO = this.$data;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            kvd.KWHzl.put(kvd.copydefault(presetUserParams.getChainId(), presetUserParams.getUserWalletAddress()), dexPresetResultVO);
        }
        return abstractC43419rot;
    }
}
