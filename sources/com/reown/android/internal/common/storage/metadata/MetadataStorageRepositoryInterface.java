package com.reown.android.internal.common.storage.metadata;

import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.foundation.common.model.Topic;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface MetadataStorageRepositoryInterface {
    void deleteMetaData(@NotNull Topic topic);

    boolean existsByTopicAndType(@NotNull Topic topic, @NotNull AppMetaDataType appMetaDataType);

    AppMetaData getByTopicAndType(@NotNull Topic topic, @NotNull AppMetaDataType appMetaDataType);

    void insertOrAbortMetadata(@NotNull Topic topic, @NotNull AppMetaData appMetaData, @NotNull AppMetaDataType appMetaDataType);

    void updateMetaData(@NotNull Topic topic, @NotNull AppMetaData appMetaData, @NotNull AppMetaDataType appMetaDataType);

    Object updateOrAbortMetaDataTopic(@NotNull Topic topic, @NotNull Topic topic2, @NotNull Continuation<? super Unit> continuation);

    void upsertPeerMetadata(@NotNull Topic topic, @NotNull AppMetaData appMetaData, @NotNull AppMetaDataType appMetaDataType);
}
