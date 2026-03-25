package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.content.Context;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.C15974ebF;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56443yFo;
import o.C56447yFs;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onStarknetSendTransaction$2$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $caip2ChainId;
    final /* synthetic */ JsonObject $content;
    final /* synthetic */ DAppInfo $dAppInfo;
    final /* synthetic */ String $messageId;
    final /* synthetic */ String $walletId;
    Object L$0;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$onStarknetSendTransaction$2$1$1(C15974ebF c15974ebF, String str, DAppInfo dAppInfo, JsonObject jsonObject, String str2, String str3, Continuation<? super DAppMethodHelper$onStarknetSendTransaction$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = c15974ebF;
        this.$caip2ChainId = str;
        this.$dAppInfo = dAppInfo;
        this.$content = jsonObject;
        this.$walletId = str2;
        this.$messageId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DAppMethodHelper$onStarknetSendTransaction$2$1$1(this.this$0, this.$caip2ChainId, this.$dAppInfo, this.$content, this.$walletId, this.$messageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((DAppMethodHelper$onStarknetSendTransaction$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objAEQbTJ;
        DappInteractionArgs dappInteractionArgs;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15974ebF c15974ebF = this.this$0;
            String str = this.$caip2ChainId;
            this.label = 1;
            objAEQbTJ = c15974ebF.AEQbTJ(str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return obj;
                }
                dappInteractionArgs = (DappInteractionArgs) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                DappInteractionArgs dappInteractionArgs2 = dappInteractionArgs;
                CoroutineDispatcher coroutineDispatcher = this.this$0.AkhnZx;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappInteractionArgs2, null);
                this.L$0 = null;
                this.label = 3;
                Object objWithContext = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
                return objWithContext != objCopydefault ? objCopydefault : objWithContext;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        dappInteractionArgs = new DappInteractionArgs(this.$walletId, null, (String) objAEQbTJ, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), this.$content.toString(), null, "dapp", C56443yFo.AEQbTJ(5), null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33022, null);
        C15974ebF c15974ebF2 = this.this$0;
        this.L$0 = dappInteractionArgs;
        this.label = 2;
        objOLrzqt = c15974ebF2.OLrzqt((Continuation<? super WeakReference<Context>>) this);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        DappInteractionArgs dappInteractionArgs22 = dappInteractionArgs;
        CoroutineDispatcher coroutineDispatcher2 = this.this$0.AkhnZx;
        AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappInteractionArgs22, null);
        this.L$0 = null;
        this.label = 3;
        Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, anonymousClass12, this);
        if (objWithContext2 != objCopydefault) {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onStarknetSendTransaction$2$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ DappInteractionArgs $args;
        final /* synthetic */ String $messageId;
        final /* synthetic */ WeakReference<Context> $weakContext;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ C15974ebF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15974ebF c15974ebF, String str, WeakReference<Context> weakReference, DappInteractionArgs dappInteractionArgs, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15974ebF;
            this.$messageId = str;
            this.$weakContext = weakReference;
            this.$args = dappInteractionArgs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$messageId, this.$weakContext, this.$args, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C15974ebF c15974ebF = this.this$0;
                String str = this.$messageId;
                WeakReference<Context> weakReference = this.$weakContext;
                DappInteractionArgs dappInteractionArgs = this.$args;
                this.L$0 = c15974ebF;
                this.L$1 = str;
                this.L$2 = weakReference;
                this.L$3 = dappInteractionArgs;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                cancellableContinuationImpl.initCancellability();
                c15974ebF.copydefault(str, cancellableContinuationImpl);
                Context context = weakReference.get();
                if (context != null) {
                    MethodHelperActivity.Companion.AEQbTJ(context, str, dappInteractionArgs, "tx_hash", false, c15974ebF);
                } else {
                    c15974ebF.OLrzqt(str, "");
                }
                obj = cancellableContinuationImpl.getResult();
                if (obj == C56442yFn.copydefault()) {
                    C56447yFs.copydefault(this);
                }
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
}
