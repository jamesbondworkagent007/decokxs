package com.reown.android.sdk.storage.data.dao;

import com.reown.android.sdk.storage.data.dao.PushMessageQueries;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AssetManager;
import o.AssistContent;
import o.Configuration;
import o.ContentResolver;
import o.IntentSender;
import o.PackageManager;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PushMessageQueries extends ContentResolver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushMessageQueries(@NotNull PackageManager packageManager) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
    }

    public final <T> AssistContent<T> getPushMessageById(@NotNull String str, @NotNull final yHO<? super String, ? super String, ? super String, ? extends T> yho) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yho, "");
        return new GetPushMessageByIdQuery(this, str, new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.PushMessageQueries.getPushMessageById.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHO<String, String, String, T> yho2 = yho;
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl3);
                return yho2.invoke(strKWHzl, strKWHzl2, strKWHzl3);
            }
        });
    }

    public final AssistContent<GetPushMessageById> getPushMessageById(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getPushMessageById(str, new yHO<String, String, String, GetPushMessageById>() { // from class: com.reown.android.sdk.storage.data.dao.PushMessageQueries.getPushMessageById.2
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.yHO
            public final GetPushMessageById invoke(@NotNull String str2, @NotNull String str3, @NotNull String str4) {
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                return new GetPushMessageById(str2, str3, str4);
            }
        });
    }

    public final AssistContent<Boolean> doesMessagesExistsByRequestId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DoesMessagesExistsByRequestIdQuery(this, str, new Function1<AssetManager, Boolean>() { // from class: com.reown.android.sdk.storage.data.dao.PushMessageQueries.doesMessagesExistsByRequestId.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                Boolean boolOLrzqt = assetManager.OLrzqt(0);
                Intrinsics.copydefault(boolOLrzqt);
                return boolOLrzqt;
            }
        });
    }

    public final void upsertMessage(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        getDriver().AEQbTJ(-856915717, "INSERT OR REPLACE INTO PushMessage(id, topic, blob, tag)\nVALUES (?, ?, ?, ?)", 4, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PushMessageQueries.upsertMessage.1
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
                configuration.OLrzqt(3, Long.valueOf(j));
            }
        });
        notifyQueries(-856915717, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PushMessageQueries.upsertMessage.2
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
                function1.invoke("PushMessage");
            }
        });
    }

    public final void deleteMessageByTopic(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-542250727, "DELETE FROM PushMessage\nWHERE topic = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PushMessageQueries.deleteMessageByTopic.1
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
        notifyQueries(-542250727, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PushMessageQueries.deleteMessageByTopic.2
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
                function1.invoke("PushMessage");
            }
        });
    }

    /* JADX INFO: loaded from: classes17.dex */
    public final class GetPushMessageByIdQuery<T> extends AssistContent<T> {
        public final String id;
        public final /* synthetic */ PushMessageQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PushMessage.sq:getPushMessageById";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetPushMessageByIdQuery(@NotNull PushMessageQueries pushMessageQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = pushMessageQueries;
            this.id = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"PushMessage"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"PushMessage"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(426083206, "SELECT id, topic, blob\nFROM PushMessage\nWHERE id = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.PushMessageQueries$GetPushMessageByIdQuery$execute$1
                public final /* synthetic */ PushMessageQueries.GetPushMessageByIdQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.PushMessageQueries$GetPushMessageByIdQuery<? extends T> */
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
                    configuration.copydefault(0, this.this$0.getId());
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public final class DoesMessagesExistsByRequestIdQuery<T> extends AssistContent<T> {
        public final String id;
        public final /* synthetic */ PushMessageQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PushMessage.sq:doesMessagesExistsByRequestId";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DoesMessagesExistsByRequestIdQuery(@NotNull PushMessageQueries pushMessageQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = pushMessageQueries;
            this.id = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"PushMessage"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"PushMessage"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(-318979531, "SELECT EXISTS(SELECT 1 FROM PushMessage WHERE id = ?)", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.PushMessageQueries$DoesMessagesExistsByRequestIdQuery$execute$1
                public final /* synthetic */ PushMessageQueries.DoesMessagesExistsByRequestIdQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.PushMessageQueries$DoesMessagesExistsByRequestIdQuery<? extends T> */
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
                    configuration.copydefault(0, this.this$0.getId());
                }
            });
        }
    }
}
