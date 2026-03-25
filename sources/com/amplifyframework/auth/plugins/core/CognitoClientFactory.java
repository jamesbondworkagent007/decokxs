package com.amplifyframework.auth.plugins.core;

import com.amplifyframework.auth.AWSCognitoAuthMetadataType;
import com.amplifyframework.auth.plugins.core.data.AWSCognitoIdentityPoolConfiguration;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.Character;
import o.InterfaceC5037Ch;
import o.InterfaceC5039Cj;
import o.InterfaceC54725xT;
import o.InterfaceC54833xX;
import o.InterfaceC54860xY;
import o.InterfaceC54887xZ;
import o.InterfaceC56995ya;
import o.UncheckedIOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CognitoClientFactory {
    public static final CognitoClientFactory INSTANCE = new CognitoClientFactory();

    private CognitoClientFactory() {
    }

    public final Character createIdentityClient(@NotNull final AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, @NotNull final String str, @NotNull final String str2) {
        Intrinsics.checkNotNullParameter(aWSCognitoIdentityPoolConfiguration, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return Character.OLrzqt.copydefault(new Function1<Character.Activity.TaskDescription, Unit>() { // from class: com.amplifyframework.auth.plugins.core.CognitoClientFactory.createIdentityClient.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Character.Activity.TaskDescription taskDescription) {
                invoke2(taskDescription);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Character.Activity.TaskDescription taskDescription) {
                Intrinsics.checkNotNullParameter(taskDescription, "");
                taskDescription.OLrzqt(aWSCognitoIdentityPoolConfiguration.getRegion());
                List<InterfaceC54725xT<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj>> listIsConnected = taskDescription.isConnected();
                final String str3 = str;
                final String str4 = str2;
                listIsConnected.add(new InterfaceC54725xT<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj>() { // from class: com.amplifyframework.auth.plugins.core.CognitoClientFactory.createIdentityClient.1.1
                    @Override // o.InterfaceC54725xT
                    /* JADX INFO: renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
                    public Object mo5946modifyBeforeAttemptCompletiongIAlus(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends Object>> continuation) {
                        return InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
                    }

                    @Override // o.InterfaceC54725xT
                    /* JADX INFO: renamed from: modifyBeforeCompletion-gIAlu-s */
                    public Object mo5947modifyBeforeCompletiongIAlus(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends Object>> continuation) {
                        return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
                    }

                    @Override // o.InterfaceC54725xT
                    public Object modifyBeforeDeserialization(@NotNull InterfaceC54833xX<Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX, @NotNull Continuation<? super InterfaceC5039Cj> continuation) {
                        return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX, (Continuation) continuation);
                    }

                    @Override // o.InterfaceC54725xT
                    public Object modifyBeforeRetryLoop(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
                        return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ, (Continuation) continuation);
                    }

                    @Override // o.InterfaceC54725xT
                    public Object modifyBeforeSigning(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
                        return InterfaceC54725xT.StateListAnimator.KWHzl(this, interfaceC54887xZ, continuation);
                    }

                    @Override // o.InterfaceC54725xT
                    public Object modifyBeforeTransmit(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
                        return InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ, continuation);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readAfterAttempt(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
                        InterfaceC54725xT.StateListAnimator.EZpvd((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readAfterDeserialization(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
                        InterfaceC54725xT.StateListAnimator.copydefault((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readAfterExecution(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
                        InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readAfterSerialization(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                        InterfaceC54725xT.StateListAnimator.AEQbTJ(this, interfaceC54887xZ);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readAfterSigning(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                        InterfaceC54725xT.StateListAnimator.EZpvd(this, interfaceC54887xZ);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readAfterTransmit(@NotNull InterfaceC54833xX<Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
                        InterfaceC54725xT.StateListAnimator.EZpvd((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readBeforeAttempt(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                        InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readBeforeDeserialization(@NotNull InterfaceC54833xX<Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
                        InterfaceC54725xT.StateListAnimator.copydefault((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readBeforeExecution(@NotNull InterfaceC56995ya<Object> interfaceC56995ya) {
                        InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readBeforeSerialization(@NotNull InterfaceC56995ya<Object> interfaceC56995ya) {
                        InterfaceC54725xT.StateListAnimator.KWHzl(this, interfaceC56995ya);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readBeforeSigning(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                        InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ);
                    }

                    @Override // o.InterfaceC54725xT
                    public void readBeforeTransmit(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                        InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.ya<java.lang.Object>, kotlin.coroutines.Continuation<java.lang.Object>] */
                    @Override // o.InterfaceC54725xT
                    public Object modifyBeforeSerialization(@NotNull InterfaceC56995ya<Object> interfaceC56995ya, @NotNull Continuation<? super Object> continuation) {
                        UncheckedIOException.OLrzqt(interfaceC56995ya.KWHzl()).OLrzqt(AWSCognitoAuthMetadataType.AuthPluginsCore.getKey(), "2.14.12");
                        UncheckedIOException.OLrzqt(interfaceC56995ya.KWHzl()).OLrzqt(str3, str4);
                        return InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya, continuation);
                    }
                });
            }
        });
    }
}
