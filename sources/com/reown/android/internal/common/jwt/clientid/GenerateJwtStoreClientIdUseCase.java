package com.reown.android.internal.common.jwt.clientid;

import android.content.SharedPreferences;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import com.reown.android.utils.ExtensionsKt;
import com.reown.foundation.crypto.data.repository.ClientIdJwtRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GenerateJwtStoreClientIdUseCase {
    public final ClientIdJwtRepository clientIdJwtRepository;
    public final SharedPreferences sharedPreferences;

    public GenerateJwtStoreClientIdUseCase(@NotNull ClientIdJwtRepository clientIdJwtRepository, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(clientIdJwtRepository, "");
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.clientIdJwtRepository = clientIdJwtRepository;
        this.sharedPreferences = sharedPreferences;
    }

    public final String invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.clientIdJwtRepository.generateJWT(ExtensionsKt.strippedUrl(str), new Function1<String, Unit>() { // from class: com.reown.android.internal.common.jwt.clientid.GenerateJwtStoreClientIdUseCase.invoke.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                invoke2(str2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str2) {
                Intrinsics.checkNotNullParameter(str2, "");
                SharedPreferences.Editor editorEdit = GenerateJwtStoreClientIdUseCase.this.sharedPreferences.edit();
                Intrinsics.checkNotNullExpressionValue(editorEdit, "");
                editorEdit.putString(CoreNetworkModuleKt.KEY_CLIENT_ID, str2);
                editorEdit.apply();
            }
        });
    }
}
