package com.reown.android.internal.common.storage.pairing;

import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Pairing;
import com.reown.foundation.common.model.Topic;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface PairingStorageRepositoryInterface {
    void deletePairing(@NotNull Topic topic);

    Object getListOfPairings(@NotNull Continuation<? super List<Pairing>> continuation);

    Object getListOfPairingsWithoutRequestReceived(@NotNull Continuation<? super List<Pairing>> continuation);

    Pairing getPairingOrNullByTopic(@NotNull Topic topic);

    boolean hasTopic(@NotNull Topic topic);

    void insertPairing(@NotNull Pairing pairing);

    void setRequestReceived(@NotNull Topic topic);

    void updateExpiry(@NotNull Topic topic, @NotNull Expiry expiry);
}
