package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.content.Context;
import android.webkit.ValueCallback;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SignType;
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
import o.C15974ebF;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.C59449zhJ;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onTypedDataSign$2$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $caip2ChainId;
    final /* synthetic */ DAppInfo $dAppInfo;
    final /* synthetic */ String $message;
    final /* synthetic */ String $messageId;
    final /* synthetic */ String $walletId;
    Object L$0;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$onTypedDataSign$2$1$1(C15974ebF c15974ebF, String str, String str2, String str3, DAppInfo dAppInfo, String str4, Continuation<? super DAppMethodHelper$onTypedDataSign$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = c15974ebF;
        this.$caip2ChainId = str;
        this.$messageId = str2;
        this.$message = str3;
        this.$dAppInfo = dAppInfo;
        this.$walletId = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DAppMethodHelper$onTypedDataSign$2$1$1(this.this$0, this.$caip2ChainId, this.$messageId, this.$message, this.$dAppInfo, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((DAppMethodHelper$onTypedDataSign$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[PHI: r13
  0x0070: PHI (r13v10 java.lang.Object) = (r13v9 java.lang.Object), (r13v0 java.lang.Object) binds: [B:19:0x006d, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15974ebF c15974ebF = this.this$0;
            String str2 = this.$caip2ChainId;
            this.label = 1;
            obj = c15974ebF.AEQbTJ(str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C56391yDq.AEQbTJ(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                WeakReference weakReference = (WeakReference) obj;
                CoroutineDispatcher coroutineDispatcher = this.this$0.AkhnZx;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$messageId, this.$message, this.$dAppInfo, this.$walletId, str, weakReference, null);
                this.L$0 = null;
                this.label = 3;
                obj = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
                return obj != objCopydefault ? objCopydefault : obj;
            }
            C56391yDq.AEQbTJ(obj);
        }
        str = (String) obj;
        C15974ebF c15974ebF2 = this.this$0;
        this.L$0 = str;
        this.label = 2;
        obj = c15974ebF2.OLrzqt((Continuation<? super WeakReference<Context>>) this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        WeakReference weakReference2 = (WeakReference) obj;
        CoroutineDispatcher coroutineDispatcher2 = this.this$0.AkhnZx;
        AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, this.$messageId, this.$message, this.$dAppInfo, this.$walletId, str, weakReference2, null);
        this.L$0 = null;
        this.label = 3;
        obj = BuildersKt.withContext(coroutineDispatcher2, anonymousClass12, this);
        if (obj != objCopydefault) {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onTypedDataSign$2$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ String $chainId;
        final /* synthetic */ DAppInfo $dAppInfo;
        final /* synthetic */ String $message;
        final /* synthetic */ String $messageId;
        final /* synthetic */ String $walletId;
        final /* synthetic */ WeakReference<Context> $weakContext;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ C15974ebF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15974ebF c15974ebF, String str, String str2, DAppInfo dAppInfo, String str3, String str4, WeakReference<Context> weakReference, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15974ebF;
            this.$messageId = str;
            this.$message = str2;
            this.$dAppInfo = dAppInfo;
            this.$walletId = str3;
            this.$chainId = str4;
            this.$weakContext = weakReference;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$messageId, this.$message, this.$dAppInfo, this.$walletId, this.$chainId, this.$weakContext, continuation);
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
                String str2 = this.$message;
                DAppInfo dAppInfo = this.$dAppInfo;
                String str3 = this.$walletId;
                String str4 = this.$chainId;
                WeakReference<Context> weakReference = this.$weakContext;
                this.L$0 = c15974ebF;
                this.L$1 = str;
                this.L$2 = str2;
                this.L$3 = dAppInfo;
                this.L$4 = str3;
                this.L$5 = str4;
                this.L$6 = weakReference;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                cancellableContinuationImpl.initCancellability();
                c15974ebF.copydefault(str, cancellableContinuationImpl);
                c15974ebF.fIwbmz.copydefault("okCalTypedData", "[" + str2 + ", true]", new TaskDescription(dAppInfo, str2, str3, str4, weakReference, c15974ebF, str));
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onTypedDataSign$2$1$1$1$TaskDescription */
        public static final class TaskDescription<T> implements ValueCallback {
            public final /* synthetic */ String AEQbTJ;
            public final /* synthetic */ String EZpvd;
            public final /* synthetic */ String KWHzl;
            public final /* synthetic */ DAppInfo OLrzqt;
            public final /* synthetic */ String copydefault;
            public final /* synthetic */ C15974ebF djBIcL;
            public final /* synthetic */ WeakReference<Context> valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(DAppInfo dAppInfo, String str, String str2, String str3, WeakReference<Context> weakReference, C15974ebF c15974ebF, String str4) {
                this.OLrzqt = dAppInfo;
                this.KWHzl = str;
                this.AEQbTJ = str2;
                this.copydefault = str3;
                this.valueOf = weakReference;
                this.djBIcL = c15974ebF;
                this.EZpvd = str4;
            }

            /* JADX DEBUG: Method merged with bridge method: onReceiveValue(Ljava/lang/Object;)V */
            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public final void onReceiveValue(String str) {
                String strReplace$default;
                PlatformItem platformItem = new PlatformItem(0L, this.OLrzqt.getName(), this.OLrzqt.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.OLrzqt.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null);
                if (str == null || (strReplace$default = C59449zhJ.replace$default(str, "\\", "", false, 4, (Object) null)) == null) {
                    strReplace$default = this.KWHzl;
                }
                DappSignArgs dappSignArgs = new DappSignArgs(this.AEQbTJ, this.copydefault, platformItem, strReplace$default, false, 5, "okx_connect", null, false, false, DappSignArgs.SIGN_TYPEDMESSAGE, SignType.TYPED_MESSAGE, null, this.KWHzl, null, false, null, 119680, null);
                Context context = this.valueOf.get();
                if (context != null) {
                    MethodHelperActivity.Companion.OLrzqt(context, this.EZpvd, dappSignArgs, this.djBIcL);
                } else {
                    this.djBIcL.OLrzqt(this.EZpvd, "");
                }
            }
        }
    }
}
