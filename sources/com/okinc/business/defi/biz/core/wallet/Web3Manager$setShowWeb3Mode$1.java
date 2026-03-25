package com.okinc.business.defi.biz.core.wallet;

import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C13023cxy;
import o.C14728dqt;
import o.C43248rlh;
import o.C56391yDq;
import o.C56442yFn;
import o.eVN;
import o.mNP;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class Web3Manager$setShowWeb3Mode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isE2EEnv;
    int label;
    final /* synthetic */ C13023cxy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3Manager$setShowWeb3Mode$1(boolean z, C13023cxy c13023cxy, Continuation<? super Web3Manager$setShowWeb3Mode$1> continuation) {
        super(2, continuation);
        this.$isE2EEnv = z;
        this.this$0 = c13023cxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3Manager$setShowWeb3Mode$1(this.$isE2EEnv, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3Manager$setShowWeb3Mode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("Web3Manager", "launch-inner-EnvironmentUtil.isE2EEnv() = " + this.$isE2EEnv);
            C14728dqt c14728dqt = C14728dqt.KWHzl;
            if (!c14728dqt.KWHzl()) {
                mNP mnp = mNP.AEQbTJ;
                if (mnp.copydefault()) {
                    pUU.KWHzl("Web3Manager", "isIndependentApp:" + c14728dqt.KWHzl() + ", EnvironmentUtil.isE2EEnv():" + mNP.AEQbTJ.copydefault());
                    eVN.AEQbTJ.OLrzqt(true);
                } else {
                    pUU.KWHzl("Web3Manager", "else-outer-EnvironmentUtil.isE2EEnv() = " + mnp.copydefault());
                    SharedFlow<FeatureRestrictionDiffSet> sharedFlowGHZMYf = ((OKComplianceRestrictionService) C43248rlh.KWHzl.AEQbTJ(OKComplianceRestrictionService.class)).gHZMYf();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlowGHZMYf, anonymousClass1, this) == objCopydefault) {
                        return objCopydefault;
                    }
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

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.Web3Manager$setShowWeb3Mode$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FeatureRestrictionDiffSet, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C13023cxy this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C13023cxy c13023cxy, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c13023cxy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FeatureRestrictionDiffSet featureRestrictionDiffSet, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(featureRestrictionDiffSet, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0023, B:12:0x0028, B:39:0x00a5, B:41:0x00ae, B:43:0x00b6, B:36:0x009a), top: B:51:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0023, B:12:0x0028, B:39:0x00a5, B:41:0x00ae, B:43:0x00b6, B:36:0x009a), top: B:51:0x000c }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                pUU.AEQbTJ("Web3Manager", "hasLocalWallet exception:", e);
                C13023cxy c13023cxy = this.this$0;
                this.label = 4;
                if (c13023cxy.OLrzqt(true, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                mNP mnp = mNP.AEQbTJ;
                pUU.KWHzl("Web3Manager", "else-inner-EnvironmentUtil.isE2EEnv() = " + mnp.copydefault());
                if (!mnp.copydefault()) {
                    if (this.this$0.OLrzqt()) {
                        if (this.this$0.copydefault()) {
                            C13023cxy c13023cxy2 = this.this$0;
                            this.label = 1;
                            obj = c13023cxy2.copydefault(this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            eVN.AEQbTJ.OLrzqt(true);
                            return Unit.INSTANCE;
                        }
                    } else {
                        eVN.AEQbTJ.OLrzqt(true);
                        return Unit.INSTANCE;
                    }
                } else {
                    eVN.AEQbTJ.OLrzqt(true);
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                    if (((Boolean) obj).booleanValue()) {
                        eVN.AEQbTJ.OLrzqt(false);
                        return Unit.INSTANCE;
                    }
                    C13023cxy c13023cxy3 = this.this$0;
                    this.label = 3;
                    if (C13023cxy.verifyWalletAssetApi$default(c13023cxy3, false, this, 1, null) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                C13023cxy c13023cxy4 = this.this$0;
                this.label = 2;
                obj = c13023cxy4.OLrzqt((Continuation<? super Boolean>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                eVN.AEQbTJ.OLrzqt(true);
                return Unit.INSTANCE;
            }
        }
    }
}
