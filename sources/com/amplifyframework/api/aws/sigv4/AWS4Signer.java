package com.amplifyframework.api.aws.sigv4;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignedBodyHeader;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import o.C55338xi;
import o.C55497xl;
import o.C55815xr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC5037Ch;
import o.InterfaceC5045Cp;
import o.InterfaceC52697wV;
import o.InterfaceC52805wZ;
import o.InterfaceC55285xh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AWS4Signer {
    private AwsSignedBodyHeader awsSignedBodyHeaderType;
    private final String regionName;

    /* JADX INFO: renamed from: com.amplifyframework.api.aws.sigv4.AWS4Signer$sign$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWS4Signer.this.sign(null, null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AwsSignedBodyHeader getAwsSignedBodyHeaderType() {
        return this.awsSignedBodyHeaderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAwsSignedBodyHeaderType(@NotNull AwsSignedBodyHeader awsSignedBodyHeader) {
        Intrinsics.checkNotNullParameter(awsSignedBodyHeader, "");
        this.awsSignedBodyHeaderType = awsSignedBodyHeader;
    }

    public AWS4Signer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.regionName = str;
        this.awsSignedBodyHeaderType = AwsSignedBodyHeader.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sign(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull InterfaceC52805wZ interfaceC52805wZ, @NotNull String str, @NotNull Continuation<? super C55497xl<InterfaceC5037Ch>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AWS4Signer aWS4Signer;
        InterfaceC5037Ch interfaceC5037Ch2;
        C55338xi.Activity activity;
        C55338xi.Activity activity2;
        C55338xi.Activity activity3;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objKWHzl = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C55338xi.StateListAnimator stateListAnimator = C55338xi.AEQbTJ;
            C55338xi.Activity activity4 = new C55338xi.Activity();
            activity4.AEQbTJ(this.regionName);
            activity4.OLrzqt(true);
            activity4.EZpvd(str);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = interfaceC5037Ch;
            anonymousClass1.L$2 = activity4;
            anonymousClass1.L$3 = activity4;
            anonymousClass1.L$4 = activity4;
            anonymousClass1.label = 1;
            Object objResolve$default = InterfaceC5045Cp.StateListAnimator.resolve$default(interfaceC52805wZ, null, anonymousClass1, 1, null);
            if (objResolve$default == objCopydefault) {
                return objCopydefault;
            }
            aWS4Signer = this;
            interfaceC5037Ch2 = interfaceC5037Ch;
            activity = activity4;
            activity2 = activity;
            objKWHzl = objResolve$default;
            activity3 = activity2;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objKWHzl);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C55338xi.Activity) anonymousClass1.L$4;
            activity3 = (C55338xi.Activity) anonymousClass1.L$3;
            activity2 = (C55338xi.Activity) anonymousClass1.L$2;
            interfaceC5037Ch2 = (InterfaceC5037Ch) anonymousClass1.L$1;
            aWS4Signer = (AWS4Signer) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        activity.AEQbTJ((InterfaceC52697wV) objKWHzl);
        activity3.AEQbTJ(aWS4Signer.awsSignedBodyHeaderType);
        C55338xi c55338xiEZpvd = activity2.EZpvd();
        InterfaceC55285xh interfaceC55285xhCopydefault = C55815xr.copydefault();
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.label = 2;
        objKWHzl = interfaceC55285xhCopydefault.KWHzl(interfaceC5037Ch2, c55338xiEZpvd, anonymousClass1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX INFO: renamed from: com.amplifyframework.api.aws.sigv4.AWS4Signer$signBlocking$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C55497xl<InterfaceC5037Ch>>, Object> {
        final /* synthetic */ InterfaceC52805wZ $credentialsProvider;
        final /* synthetic */ InterfaceC5037Ch $httpRequest;
        final /* synthetic */ String $serviceName;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15741(InterfaceC5037Ch interfaceC5037Ch, InterfaceC52805wZ interfaceC52805wZ, String str, Continuation<? super C15741> continuation) {
            super(2, continuation);
            this.$httpRequest = interfaceC5037Ch;
            this.$credentialsProvider = interfaceC52805wZ;
            this.$serviceName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWS4Signer.this.new C15741(this.$httpRequest, this.$credentialsProvider, this.$serviceName, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super C55497xl<InterfaceC5037Ch>> continuation) {
            return ((C15741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AWS4Signer aWS4Signer = AWS4Signer.this;
                InterfaceC5037Ch interfaceC5037Ch = this.$httpRequest;
                InterfaceC52805wZ interfaceC52805wZ = this.$credentialsProvider;
                String str = this.$serviceName;
                this.label = 1;
                obj = aWS4Signer.sign(interfaceC5037Ch, interfaceC52805wZ, str, this);
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

    public final C55497xl<InterfaceC5037Ch> signBlocking(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull InterfaceC52805wZ interfaceC52805wZ, @NotNull String str) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
        Intrinsics.checkNotNullParameter(str, "");
        return (C55497xl) BuildersKt__BuildersKt.runBlocking$default(null, new C15741(interfaceC5037Ch, interfaceC52805wZ, str, null), 1, null);
    }
}
