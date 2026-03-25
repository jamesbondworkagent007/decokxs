package com.reown.android.sdk.storage.data.dao;

import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.sdk.storage.data.dao.MetaData;
import com.reown.android.sdk.storage.data.dao.MetaDataQueries;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AssetManager;
import o.AssistContent;
import o.Configuration;
import o.ContentResolver;
import o.IntentSender;
import o.LoaderManager;
import o.PackageManager;
import o.yHR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class MetaDataQueries extends ContentResolver {
    public final MetaData.Adapter MetaDataAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaDataQueries(@NotNull PackageManager packageManager, @NotNull MetaData.Adapter adapter) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.MetaDataAdapter = adapter;
    }

    public final <T> AssistContent<T> getMetadataByTopicAndType(@NotNull String str, @NotNull AppMetaDataType appMetaDataType, @NotNull final yHR<? super String, ? super String, ? super String, ? super List<String>, ? super String, ? super String, ? super Boolean, ? extends T> yhr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        Intrinsics.checkNotNullParameter(yhr, "");
        return new GetMetadataByTopicAndTypeQuery(this, str, appMetaDataType, new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries.getMetadataByTopicAndType.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHR<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.List<java.lang.String>, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHR<String, String, String, List<String>, String, String, Boolean, T> yhr2 = yhr;
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl3);
                LoaderManager<List<String>, String> iconsAdapter = this.MetaDataAdapter.getIconsAdapter();
                String strKWHzl4 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl4);
                return (T) yhr2.invoke(strKWHzl, strKWHzl2, strKWHzl3, iconsAdapter.decode(strKWHzl4), assetManager.KWHzl(4), assetManager.KWHzl(5), assetManager.OLrzqt(6));
            }
        });
    }

    public final AssistContent<GetMetadataByTopicAndType> getMetadataByTopicAndType(@NotNull String str, @NotNull AppMetaDataType appMetaDataType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        return getMetadataByTopicAndType(str, appMetaDataType, new yHR<String, String, String, List<? extends String>, String, String, Boolean, GetMetadataByTopicAndType>() { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries.getMetadataByTopicAndType.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHR
            public /* bridge */ /* synthetic */ GetMetadataByTopicAndType invoke(String str2, String str3, String str4, List<? extends String> list, String str5, String str6, Boolean bool) {
                return invoke2(str2, str3, str4, (List<String>) list, str5, str6, bool);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final GetMetadataByTopicAndType invoke2(@NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, String str5, String str6, Boolean bool) {
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(list, "");
                return new GetMetadataByTopicAndType(str2, str3, str4, list, str5, str6, bool);
            }
        });
    }

    public final AssistContent<Long> getIdByTopicAndType(@NotNull String str, @NotNull AppMetaDataType appMetaDataType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        return new GetIdByTopicAndTypeQuery(this, str, appMetaDataType, new Function1<AssetManager, Long>() { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries.getIdByTopicAndType.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                return lEZpvd;
            }
        });
    }

    public final void insertOrAbortMetaData(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final List<String> list, final String str5, @NotNull final AppMetaDataType appMetaDataType, final String str6, final Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        getDriver().AEQbTJ(-203069208, "INSERT OR ABORT INTO MetaData(sequence_topic, name, description, url, icons, native, type, app_link, link_mode)\nVALUES (?,?,?,?,?,?,?,?,?)", 9, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries.insertOrAbortMetaData.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "");
                configuration.copydefault(0, str);
                configuration.copydefault(1, str2);
                configuration.copydefault(2, str3);
                configuration.copydefault(3, str4);
                configuration.copydefault(4, this.MetaDataAdapter.getIconsAdapter().encode(list));
                configuration.copydefault(5, str5);
                configuration.copydefault(6, this.MetaDataAdapter.getTypeAdapter().encode(appMetaDataType));
                configuration.copydefault(7, str6);
                configuration.OLrzqt(8, bool);
            }
        });
        notifyQueries(-203069208, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries.insertOrAbortMetaData.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super String, ? extends Unit> function1) {
                invoke2((Function1<? super String, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super String, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke("MetaData");
            }
        });
    }

    public final void updateMetaData(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final List<String> list, final String str4, @NotNull final AppMetaDataType appMetaDataType, final String str5, final Boolean bool, @NotNull final String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        Intrinsics.checkNotNullParameter(str6, "");
        getDriver().AEQbTJ(-1013678221, "UPDATE MetaData\nSET name = ?, description = ?, url = ?, icons = ?, native = ?, type = ?, app_link = ?, link_mode = ?\nWHERE sequence_topic = ?", 9, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries.updateMetaData.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "");
                configuration.copydefault(0, str);
                configuration.copydefault(1, str2);
                configuration.copydefault(2, str3);
                configuration.copydefault(3, this.MetaDataAdapter.getIconsAdapter().encode(list));
                configuration.copydefault(4, str4);
                configuration.copydefault(5, this.MetaDataAdapter.getTypeAdapter().encode(appMetaDataType));
                configuration.copydefault(6, str5);
                configuration.OLrzqt(7, bool);
                configuration.copydefault(8, str6);
            }
        });
        notifyQueries(-1013678221, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries.updateMetaData.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super String, ? extends Unit> function1) {
                invoke2((Function1<? super String, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super String, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke("MetaData");
            }
        });
    }

    public final void updateOrAbortMetaDataTopic(@NotNull final String str, @NotNull final String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        getDriver().AEQbTJ(1035703095, "UPDATE OR ABORT MetaData\nSET sequence_topic = ?\nWHERE sequence_topic = ?", 2, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries.updateOrAbortMetaDataTopic.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "");
                configuration.copydefault(0, str);
                configuration.copydefault(1, str2);
            }
        });
        notifyQueries(1035703095, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries.updateOrAbortMetaDataTopic.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super String, ? extends Unit> function1) {
                invoke2((Function1<? super String, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super String, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke("MetaData");
            }
        });
    }

    public final void deleteMetaDataFromTopic(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-118414128, "DELETE FROM MetaData\nWHERE sequence_topic = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries.deleteMetaDataFromTopic.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "");
                configuration.copydefault(0, str);
            }
        });
        notifyQueries(-118414128, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries.deleteMetaDataFromTopic.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super String, ? extends Unit> function1) {
                invoke2((Function1<? super String, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super String, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke("MetaData");
            }
        });
    }

    public final class GetMetadataByTopicAndTypeQuery<T> extends AssistContent<T> {
        public final String sequence_topic;
        public final /* synthetic */ MetaDataQueries this$0;
        public final AppMetaDataType type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSequence_topic() {
            return this.sequence_topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaDataType getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MetaData.sq:getMetadataByTopicAndType";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMetadataByTopicAndTypeQuery(@NotNull MetaDataQueries metaDataQueries, @NotNull String str, @NotNull AppMetaDataType appMetaDataType, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(appMetaDataType, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = metaDataQueries;
            this.sequence_topic = str;
            this.type = appMetaDataType;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"MetaData"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"MetaData"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            PackageManager driver = this.this$0.getDriver();
            final MetaDataQueries metaDataQueries = this.this$0;
            return driver.OLrzqt(922585187, "SELECT name, description, url, icons, native, app_link, link_mode\nFROM MetaData\nWHERE sequence_topic = ? AND type = ?", function1, 2, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries$GetMetadataByTopicAndTypeQuery$execute$1
                public final /* synthetic */ MetaDataQueries.GetMetadataByTopicAndTypeQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.MetaDataQueries$GetMetadataByTopicAndTypeQuery<? extends T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                    invoke2(configuration);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Configuration configuration) {
                    Intrinsics.checkNotNullParameter(configuration, "");
                    configuration.copydefault(0, this.this$0.getSequence_topic());
                    configuration.copydefault(1, metaDataQueries.MetaDataAdapter.getTypeAdapter().encode(this.this$0.getType()));
                }
            });
        }
    }

    public final class GetIdByTopicAndTypeQuery<T> extends AssistContent<T> {
        public final String sequence_topic;
        public final /* synthetic */ MetaDataQueries this$0;
        public final AppMetaDataType type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSequence_topic() {
            return this.sequence_topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaDataType getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MetaData.sq:getIdByTopicAndType";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetIdByTopicAndTypeQuery(@NotNull MetaDataQueries metaDataQueries, @NotNull String str, @NotNull AppMetaDataType appMetaDataType, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(appMetaDataType, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = metaDataQueries;
            this.sequence_topic = str;
            this.type = appMetaDataType;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"MetaData"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"MetaData"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            PackageManager driver = this.this$0.getDriver();
            final MetaDataQueries metaDataQueries = this.this$0;
            return driver.OLrzqt(1008864655, "SELECT id\nFROM MetaData\nWHERE sequence_topic = ? AND type = ?", function1, 2, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.MetaDataQueries$GetIdByTopicAndTypeQuery$execute$1
                public final /* synthetic */ MetaDataQueries.GetIdByTopicAndTypeQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.MetaDataQueries$GetIdByTopicAndTypeQuery<? extends T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                    invoke2(configuration);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Configuration configuration) {
                    Intrinsics.checkNotNullParameter(configuration, "");
                    configuration.copydefault(0, this.this$0.getSequence_topic());
                    configuration.copydefault(1, metaDataQueries.MetaDataAdapter.getTypeAdapter().encode(this.this$0.getType()));
                }
            });
        }
    }
}
