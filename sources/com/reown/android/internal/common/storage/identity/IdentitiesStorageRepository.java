package com.reown.android.internal.common.storage.identity;

import com.reown.android.internal.common.model.AccountId;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.sdk.storage.data.dao.IdentitiesQueries;
import com.squareup.moshi.Moshi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class IdentitiesStorageRepository {
    public final IdentitiesQueries identities;
    public final Moshi moshi;

    public IdentitiesStorageRepository(@NotNull IdentitiesQueries identitiesQueries, @NotNull Moshi.Builder builder) {
        Intrinsics.checkNotNullParameter(identitiesQueries, "");
        Intrinsics.checkNotNullParameter(builder, "");
        this.identities = identitiesQueries;
        this.moshi = builder.build();
    }

    /* JADX INFO: renamed from: insertIdentity-RiN_R_Q, reason: not valid java name */
    public final Object m7267insertIdentityRiN_R_Q(@NotNull String str, @NotNull String str2, @NotNull Cacao.Payload payload, boolean z, @NotNull Continuation<? super Unit> continuation) {
        this.identities.insertOrAbortIdentity(str, str2, this.moshi.adapter(Cacao.Payload.class).toJson(payload), C56443yFo.KWHzl(z));
        return Unit.INSTANCE;
    }

    public final Object removeIdentity(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        this.identities.removeIdentity(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: getAccountId-yrRQGmQ, reason: not valid java name */
    public final Object m7266getAccountIdyrRQGmQ(@NotNull String str, @NotNull Continuation<? super AccountId> continuation) {
        return AccountId.m7211constructorimpl(this.identities.getAccountIdByIdentity(str).executeAsOne());
    }

    public final Object getCacaoPayloadByIdentity(@NotNull String str, @NotNull Continuation<? super Cacao.Payload> continuation) {
        Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            String cacao_payload = this.identities.getCacaoPayloadByIdentity(str).executeAsOne().getCacao_payload();
            objM7377constructorimpl = Result.m7377constructorimpl(cacao_payload != null ? (Cacao.Payload) this.moshi.adapter(Cacao.Payload.class).fromJson(cacao_payload) : null);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
