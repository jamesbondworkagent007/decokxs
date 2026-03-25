package com.amplifyframework.predictions.aws.service;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import o.C55338xi;
import o.C56391yDq;
import o.C56442yFn;
import o.C58108yv;
import o.C59462zhW;
import o.C59519zia;
import o.InterfaceC5037Ch;
import o.InterfaceC52697wV;
import o.InterfaceC52805wZ;
import o.InterfaceC57843yq;
import o.PathInterpolator;
import o.TranslateAnimation;
import o.ViewHierarchyEncoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AmazonPollyPresigningClient$getPresignedSynthesizeSpeechUrl$presignedRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC5037Ch>, Object> {
    final /* synthetic */ PresignedSynthesizeSpeechUrlOptions $options;
    final /* synthetic */ InterfaceC52805wZ $presignCredentialsProvider;
    final /* synthetic */ PathInterpolator $synthesizeSpeechRequest;
    int label;
    final /* synthetic */ AmazonPollyPresigningClient this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonPollyPresigningClient$getPresignedSynthesizeSpeechUrl$presignedRequest$1(InterfaceC52805wZ interfaceC52805wZ, AmazonPollyPresigningClient amazonPollyPresigningClient, PathInterpolator pathInterpolator, PresignedSynthesizeSpeechUrlOptions presignedSynthesizeSpeechUrlOptions, Continuation<? super AmazonPollyPresigningClient$getPresignedSynthesizeSpeechUrl$presignedRequest$1> continuation) {
        super(2, continuation);
        this.$presignCredentialsProvider = interfaceC52805wZ;
        this.this$0 = amazonPollyPresigningClient;
        this.$synthesizeSpeechRequest = pathInterpolator;
        this.$options = presignedSynthesizeSpeechUrlOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new AmazonPollyPresigningClient$getPresignedSynthesizeSpeechUrl$presignedRequest$1(this.$presignCredentialsProvider, this.this$0, this.$synthesizeSpeechRequest, this.$options, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super InterfaceC5037Ch> continuation) {
        return ((AmazonPollyPresigningClient$getPresignedSynthesizeSpeechUrl$presignedRequest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC52805wZ interfaceC52805wZ = this.$presignCredentialsProvider;
            InterfaceC57843yq interfaceC57843yqCopydefault = C58108yv.copydefault();
            this.label = 1;
            obj = interfaceC52805wZ.resolve(interfaceC57843yqCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        final InterfaceC52697wV interfaceC52697wV = (InterfaceC52697wV) obj;
        ViewHierarchyEncoder viewHierarchyEncoder = this.this$0.pollyClient;
        PathInterpolator pathInterpolator = this.$synthesizeSpeechRequest;
        final PresignedSynthesizeSpeechUrlOptions presignedSynthesizeSpeechUrlOptions = this.$options;
        Function1<C55338xi.Activity, Unit> function1 = new Function1<C55338xi.Activity, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AmazonPollyPresigningClient$getPresignedSynthesizeSpeechUrl$presignedRequest$1.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C55338xi.Activity activity) {
                invoke2(activity);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C55338xi.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                C59462zhW.Activity activity2 = C59462zhW.OLrzqt;
                activity.OLrzqt(C59462zhW.KWHzl(C59519zia.EZpvd(presignedSynthesizeSpeechUrlOptions.getExpires(), DurationUnit.SECONDS)));
                activity.AEQbTJ(interfaceC52697wV);
            }
        };
        this.label = 2;
        obj = TranslateAnimation.presignSynthesizeSpeech$default(viewHierarchyEncoder, pathInterpolator, null, function1, this, 2, null);
        return obj == objCopydefault ? objCopydefault : obj;
    }
}
