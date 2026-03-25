package com.amplifyframework.auth;

import com.amplifyframework.core.Consumer;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.InterfaceC52697wV;
import o.InterfaceC52805wZ;
import o.InterfaceC57843yq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSCredentialsProviderKt {
    public static final <T extends AWSCredentials> InterfaceC52805wZ convertToSdkCredentialsProvider(@NotNull final AWSCredentialsProvider<? extends T> aWSCredentialsProvider) {
        Intrinsics.checkNotNullParameter(aWSCredentialsProvider, "");
        return new InterfaceC52805wZ() { // from class: com.amplifyframework.auth.AWSCredentialsProviderKt.convertToSdkCredentialsProvider.1
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
            public Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) {
                AWSCredentialsProvider<T> aWSCredentialsProvider2 = aWSCredentialsProvider;
                final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
                aWSCredentialsProvider2.fetchAWSCredentials((Consumer<T>) new Consumer() { // from class: com.amplifyframework.auth.AWSCredentialsProviderKt$convertToSdkCredentialsProvider$1$resolve$2$1
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    /* JADX WARN: Incorrect types in method signature: (TT;)V */
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(@NotNull AWSCredentials aWSCredentials) {
                        Intrinsics.checkNotNullParameter(aWSCredentials, "");
                        Continuation<InterfaceC52697wV> continuation2 = c56434yFf;
                        Result.Application application = Result.Companion;
                        continuation2.resumeWith(Result.m7377constructorimpl(AWSCredentialsKt.toSdkCredentials(aWSCredentials)));
                    }
                }, new Consumer() { // from class: com.amplifyframework.auth.AWSCredentialsProviderKt$convertToSdkCredentialsProvider$1$resolve$2$2
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(@NotNull AuthException authException) {
                        Intrinsics.checkNotNullParameter(authException, "");
                        Continuation<InterfaceC52697wV> continuation2 = c56434yFf;
                        Result.Application application = Result.Companion;
                        continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
                    }
                });
                Object objKWHzl = c56434yFf.KWHzl();
                if (objKWHzl == C56442yFn.copydefault()) {
                    C56447yFs.copydefault(continuation);
                }
                return objKWHzl;
            }
        };
    }
}
