package com.reown.android.verify.domain;

import android.database.sqlite.SQLiteException;
import com.reown.android.sdk.storage.data.dao.VerifyPublicKey;
import com.reown.android.sdk.storage.data.dao.VerifyPublicKeyQueries;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyPublicKeyStorageRepository {
    public final VerifyPublicKeyQueries queries;

    public VerifyPublicKeyStorageRepository(@NotNull VerifyPublicKeyQueries verifyPublicKeyQueries) {
        Intrinsics.checkNotNullParameter(verifyPublicKeyQueries, "");
        this.queries = verifyPublicKeyQueries;
    }

    public final void upsertPublicKey(@NotNull String str, long j) throws SQLiteException {
        Intrinsics.checkNotNullParameter(str, "");
        this.queries.upsertKey(str, j);
    }

    public final Pair<String, Long> getPublicKey() throws SQLiteException {
        VerifyPublicKey verifyPublicKeyExecuteAsOneOrNull = this.queries.getKey().executeAsOneOrNull();
        if (verifyPublicKeyExecuteAsOneOrNull == null) {
            return new Pair<>(null, null);
        }
        return new Pair<>(verifyPublicKeyExecuteAsOneOrNull.getKey(), Long.valueOf(verifyPublicKeyExecuteAsOneOrNull.getExpires_at()));
    }
}
