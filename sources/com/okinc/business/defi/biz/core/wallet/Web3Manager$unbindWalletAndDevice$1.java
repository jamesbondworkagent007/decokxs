package com.okinc.business.defi.biz.core.wallet;

import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43419rot;
import o.C10856bwO;
import o.C13023cxy;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.cQM;
import o.xVW;

/* JADX INFO: loaded from: classes4.dex */
public final class Web3Manager$unbindWalletAndDevice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C13023cxy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3Manager$unbindWalletAndDevice$1(C13023cxy c13023cxy, Continuation<? super Web3Manager$unbindWalletAndDevice$1> continuation) {
        super(2, continuation);
        this.this$0 = c13023cxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3Manager$unbindWalletAndDevice$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3Manager$unbindWalletAndDevice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.Web3Manager$unbindWalletAndDevice$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC43419rot abstractC43419rot;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!SPUtils.getBoolean("isCheckedBindWalletAndDevice", false, "wallet_biz_sp_file")) {
                    cQM cqmEZpvd = this.this$0.EZpvd();
                    this.label = 1;
                    obj = cqmEZpvd.AEQbTJ(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    SPUtils.put("isCheckedBindWalletAndDevice", C56443yFo.KWHzl(true), "wallet_biz_sp_file");
                }
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    C10856bwO.copydefault("Web3Manager", 0, "unbind wallet onFailure  " + ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            if (((List) obj).isEmpty()) {
                C13934dbu c13934dbuAEQbTJ = this.this$0.AEQbTJ();
                String strCopydefault = xVW.copydefault();
                Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
                this.label = 2;
                obj = c13934dbuAEQbTJ.isConnected(strCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot = (AbstractC43419rot) obj;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                }
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
