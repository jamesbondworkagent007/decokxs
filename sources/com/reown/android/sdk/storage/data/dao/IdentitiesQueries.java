package com.reown.android.sdk.storage.data.dao;

import com.reown.android.sdk.storage.data.dao.IdentitiesQueries;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AssetManager;
import o.AssistContent;
import o.Configuration;
import o.ContentResolver;
import o.IntentSender;
import o.PackageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class IdentitiesQueries extends ContentResolver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentitiesQueries(@NotNull PackageManager packageManager) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
    }

    public final AssistContent<String> getAccountIdByIdentity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GetAccountIdByIdentityQuery(this, str, new Function1<AssetManager, String>() { // from class: com.reown.android.sdk.storage.data.dao.IdentitiesQueries.getAccountIdByIdentity.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                return strKWHzl;
            }
        });
    }

    public final <T> AssistContent<T> getCacaoPayloadByIdentity(@NotNull String str, @NotNull final Function1<? super String, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new GetCacaoPayloadByIdentityQuery(this, str, new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.IdentitiesQueries.getCacaoPayloadByIdentity.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                return function1.invoke(assetManager.KWHzl(0));
            }
        });
    }

    public final AssistContent<GetCacaoPayloadByIdentity> getCacaoPayloadByIdentity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getCacaoPayloadByIdentity(str, new Function1<String, GetCacaoPayloadByIdentity>() { // from class: com.reown.android.sdk.storage.data.dao.IdentitiesQueries.getCacaoPayloadByIdentity.2
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final GetCacaoPayloadByIdentity invoke(String str2) {
                return new GetCacaoPayloadByIdentity(str2);
            }
        });
    }

    public final void insertOrAbortIdentity(@NotNull final String str, @NotNull final String str2, final String str3, final Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        getDriver().AEQbTJ(1929998314, "INSERT OR ABORT INTO Identities(identity, accountId, cacao_payload, is_owner)\nVALUES (?, ?, ?, ?)", 4, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.IdentitiesQueries.insertOrAbortIdentity.1
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
                configuration.OLrzqt(3, bool);
            }
        });
        notifyQueries(1929998314, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.IdentitiesQueries.insertOrAbortIdentity.2
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
                function1.invoke("Identities");
            }
        });
    }

    public final void removeIdentity(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-973529238, "DELETE FROM Identities\nWHERE identity = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.IdentitiesQueries.removeIdentity.1
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
        notifyQueries(-973529238, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.IdentitiesQueries.removeIdentity.2
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
                function1.invoke("Identities");
            }
        });
    }

    /* JADX INFO: loaded from: classes17.dex */
    public final class GetAccountIdByIdentityQuery<T> extends AssistContent<T> {
        public final String identity;
        public final /* synthetic */ IdentitiesQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIdentity() {
            return this.identity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Identities.sq:getAccountIdByIdentity";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAccountIdByIdentityQuery(@NotNull IdentitiesQueries identitiesQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = identitiesQueries;
            this.identity = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"Identities"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"Identities"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(-656635057, "SELECT accountId\nFROM Identities\nWHERE identity = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.IdentitiesQueries$GetAccountIdByIdentityQuery$execute$1
                public final /* synthetic */ IdentitiesQueries.GetAccountIdByIdentityQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.IdentitiesQueries$GetAccountIdByIdentityQuery<? extends T> */
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
                    configuration.copydefault(0, this.this$0.getIdentity());
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public final class GetCacaoPayloadByIdentityQuery<T> extends AssistContent<T> {
        public final String identity;
        public final /* synthetic */ IdentitiesQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIdentity() {
            return this.identity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Identities.sq:getCacaoPayloadByIdentity";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCacaoPayloadByIdentityQuery(@NotNull IdentitiesQueries identitiesQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = identitiesQueries;
            this.identity = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"Identities"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"Identities"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(-345344034, "SELECT cacao_payload\nFROM Identities\nWHERE identity = ? AND is_owner = 1", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.IdentitiesQueries$GetCacaoPayloadByIdentityQuery$execute$1
                public final /* synthetic */ IdentitiesQueries.GetCacaoPayloadByIdentityQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.IdentitiesQueries$GetCacaoPayloadByIdentityQuery<? extends T> */
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
                    configuration.copydefault(0, this.this$0.getIdentity());
                }
            });
        }
    }
}
