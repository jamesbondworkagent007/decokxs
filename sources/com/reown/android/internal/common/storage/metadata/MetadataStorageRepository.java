package com.reown.android.internal.common.storage.metadata;

import android.database.sqlite.SQLiteException;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.sdk.storage.data.dao.MetaDataQueries;
import com.reown.foundation.common.model.Topic;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.yHR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class MetadataStorageRepository implements MetadataStorageRepositoryInterface {
    public final MetaDataQueries metaDataQueries;

    public MetadataStorageRepository(@NotNull MetaDataQueries metaDataQueries) {
        Intrinsics.checkNotNullParameter(metaDataQueries, "");
        this.metaDataQueries = metaDataQueries;
    }

    @Override // com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface
    public void insertOrAbortMetadata(@NotNull Topic topic, @NotNull AppMetaData appMetaData, @NotNull AppMetaDataType appMetaDataType) throws SQLiteException {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        MetaDataQueries metaDataQueries = this.metaDataQueries;
        String value = topic.getValue();
        String name = appMetaData.getName();
        String description = appMetaData.getDescription();
        String url = appMetaData.getUrl();
        List<String> icons = appMetaData.getIcons();
        Redirect redirect = appMetaData.getRedirect();
        String str = redirect != null ? redirect.getNative() : null;
        Redirect redirect2 = appMetaData.getRedirect();
        String universal = redirect2 != null ? redirect2.getUniversal() : null;
        Redirect redirect3 = appMetaData.getRedirect();
        metaDataQueries.insertOrAbortMetaData(value, name, description, url, icons, str, appMetaDataType, universal, redirect3 != null ? Boolean.valueOf(redirect3.getLinkMode()) : null);
    }

    @Override // com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface
    public void updateMetaData(@NotNull Topic topic, @NotNull AppMetaData appMetaData, @NotNull AppMetaDataType appMetaDataType) throws SQLiteException {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        MetaDataQueries metaDataQueries = this.metaDataQueries;
        String name = appMetaData.getName();
        String description = appMetaData.getDescription();
        String url = appMetaData.getUrl();
        List<String> icons = appMetaData.getIcons();
        Redirect redirect = appMetaData.getRedirect();
        String str = redirect != null ? redirect.getNative() : null;
        Redirect redirect2 = appMetaData.getRedirect();
        String universal = redirect2 != null ? redirect2.getUniversal() : null;
        Redirect redirect3 = appMetaData.getRedirect();
        metaDataQueries.updateMetaData(name, description, url, icons, str, appMetaDataType, universal, redirect3 != null ? Boolean.valueOf(redirect3.getLinkMode()) : null, topic.getValue());
    }

    @Override // com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface
    public Object updateOrAbortMetaDataTopic(@NotNull Topic topic, @NotNull Topic topic2, @NotNull Continuation<? super Unit> continuation) throws SQLiteException {
        this.metaDataQueries.updateOrAbortMetaDataTopic(topic2.getValue(), topic.getValue());
        return Unit.INSTANCE;
    }

    @Override // com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface
    public void upsertPeerMetadata(@NotNull Topic topic, @NotNull AppMetaData appMetaData, @NotNull AppMetaDataType appMetaDataType) throws SQLiteException {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        if (!existsByTopicAndType(topic, appMetaDataType)) {
            insertOrAbortMetadata(topic, appMetaData, appMetaDataType);
        } else {
            updateMetaData(topic, appMetaData, appMetaDataType);
        }
    }

    @Override // com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface
    public void deleteMetaData(@NotNull Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        this.metaDataQueries.deleteMetaDataFromTopic(topic.getValue());
    }

    @Override // com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface
    public boolean existsByTopicAndType(@NotNull Topic topic, @NotNull AppMetaDataType appMetaDataType) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        return this.metaDataQueries.getIdByTopicAndType(topic.getValue(), appMetaDataType).executeAsOneOrNull() != null;
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.metadata.MetadataStorageRepository$getByTopicAndType$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yHR<String, String, String, List<? extends String>, String, String, Boolean, AppMetaData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Object obj) {
            super(7, obj, MetadataStorageRepository.class, "toMetadata", "toMetadata(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/reown/android/internal/common/model/AppMetaData;", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final AppMetaData invoke2(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, String str4, String str5, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            return ((MetadataStorageRepository) this.receiver).toMetadata(str, str2, str3, list, str4, str5, bool);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHR
        public /* bridge */ /* synthetic */ AppMetaData invoke(String str, String str2, String str3, List<? extends String> list, String str4, String str5, Boolean bool) {
            return invoke2(str, str2, str3, (List<String>) list, str4, str5, bool);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: RowType */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface
    public AppMetaData getByTopicAndType(@NotNull Topic topic, @NotNull AppMetaDataType appMetaDataType) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        return (AppMetaData) this.metaDataQueries.getMetadataByTopicAndType(topic.getValue(), appMetaDataType, new AnonymousClass1(this)).executeAsOneOrNull();
    }

    public final AppMetaData toMetadata(String str, String str2, String str3, List<String> list, String str4, String str5, Boolean bool) {
        return new AppMetaData(str2, str3, list, str, new Redirect(str4, str5, bool != null ? bool.booleanValue() : false), null, 32, null);
    }
}
