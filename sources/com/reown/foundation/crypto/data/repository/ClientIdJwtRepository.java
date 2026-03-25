package com.reown.foundation.crypto.data.repository;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface ClientIdJwtRepository {
    String generateJWT(@NotNull String str, @NotNull Function1<? super String, Unit> function1);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.foundation.crypto.data.repository.ClientIdJwtRepository */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ String generateJWT$default(ClientIdJwtRepository clientIdJwtRepository, String str, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateJWT");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<String, Unit>() { // from class: com.reown.foundation.crypto.data.repository.ClientIdJwtRepository.generateJWT.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str2) {
                        Intrinsics.checkNotNullParameter(str2, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                        invoke2(str2);
                        return Unit.INSTANCE;
                    }
                };
            }
            return clientIdJwtRepository.generateJWT(str, function1);
        }
    }
}
