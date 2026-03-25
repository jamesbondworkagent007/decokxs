package com.reown.android.sdk.storage.data.dao;

import com.reown.android.internal.common.model.Validation;
import com.reown.android.sdk.storage.data.dao.VerifyContext;
import com.reown.android.sdk.storage.data.dao.VerifyContextQueries;
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
import o.VoiceInteractor;
import o.yHS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyContextQueries extends ContentResolver {
    public final VerifyContext.Adapter VerifyContextAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyContextQueries(@NotNull PackageManager packageManager, @NotNull VerifyContext.Adapter adapter) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.VerifyContextAdapter = adapter;
    }

    public final <T> AssistContent<T> getVerifyContextById(long j, @NotNull final yHS<? super Long, ? super String, ? super Validation, ? super String, ? super Boolean, ? extends T> yhs) {
        Intrinsics.checkNotNullParameter(yhs, "");
        return new GetVerifyContextByIdQuery(this, j, new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyContextQueries.getVerifyContextById.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHS<? super java.lang.Long, ? super java.lang.String, ? super com.reown.android.internal.common.model.Validation, ? super java.lang.String, ? super java.lang.Boolean, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHS<Long, String, Validation, String, Boolean, T> yhs2 = yhs;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                LoaderManager<Validation, String> validationAdapter = this.VerifyContextAdapter.getValidationAdapter();
                String strKWHzl2 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl2);
                Validation validationDecode = validationAdapter.decode(strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl3);
                return (T) yhs2.invoke(lEZpvd, strKWHzl, validationDecode, strKWHzl3, assetManager.OLrzqt(4));
            }
        });
    }

    public final AssistContent<VerifyContext> getVerifyContextById(long j) {
        return getVerifyContextById(j, new yHS<Long, String, Validation, String, Boolean, VerifyContext>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyContextQueries.getVerifyContextById.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHS
            public /* synthetic */ VerifyContext invoke(Long l, String str, Validation validation, String str2, Boolean bool) {
                return invoke(l.longValue(), str, validation, str2, bool);
            }

            public final VerifyContext invoke(long j2, @NotNull String str, @NotNull Validation validation, @NotNull String str2, Boolean bool) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(validation, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new VerifyContext(j2, str, validation, str2, bool);
            }
        });
    }

    public final <T> AssistContent<T> geListOfVerifyContexts(@NotNull final yHS<? super Long, ? super String, ? super Validation, ? super String, ? super Boolean, ? extends T> yhs) {
        Intrinsics.checkNotNullParameter(yhs, "");
        return VoiceInteractor.OLrzqt(844063894, new String[]{"VerifyContext"}, getDriver(), "VerifyContext.sq", "geListOfVerifyContexts", "SELECT id, origin, validation, verify_url, is_scam\nFROM VerifyContext", new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyContextQueries.geListOfVerifyContexts.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHS<? super java.lang.Long, ? super java.lang.String, ? super com.reown.android.internal.common.model.Validation, ? super java.lang.String, ? super java.lang.Boolean, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHS<Long, String, Validation, String, Boolean, T> yhs2 = yhs;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                LoaderManager<Validation, String> validationAdapter = this.VerifyContextAdapter.getValidationAdapter();
                String strKWHzl2 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl2);
                Validation validationDecode = validationAdapter.decode(strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl3);
                return (T) yhs2.invoke(lEZpvd, strKWHzl, validationDecode, strKWHzl3, assetManager.OLrzqt(4));
            }
        });
    }

    public final AssistContent<VerifyContext> geListOfVerifyContexts() {
        return geListOfVerifyContexts(new yHS<Long, String, Validation, String, Boolean, VerifyContext>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyContextQueries.geListOfVerifyContexts.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHS
            public /* synthetic */ VerifyContext invoke(Long l, String str, Validation validation, String str2, Boolean bool) {
                return invoke(l.longValue(), str, validation, str2, bool);
            }

            public final VerifyContext invoke(long j, @NotNull String str, @NotNull Validation validation, @NotNull String str2, Boolean bool) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(validation, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new VerifyContext(j, str, validation, str2, bool);
            }
        });
    }

    public final void insertOrAbortVerifyContext(final Long l, @NotNull final String str, @NotNull final Validation validation, @NotNull final String str2, final Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(validation, "");
        Intrinsics.checkNotNullParameter(str2, "");
        getDriver().AEQbTJ(859993640, "INSERT OR ABORT INTO VerifyContext(id, origin, validation, verify_url, is_scam)\nVALUES (?, ?, ?, ?, ?)", 5, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyContextQueries.insertOrAbortVerifyContext.1
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
                configuration.OLrzqt(0, l);
                configuration.copydefault(1, str);
                configuration.copydefault(2, this.VerifyContextAdapter.getValidationAdapter().encode(validation));
                configuration.copydefault(3, str2);
                configuration.OLrzqt(4, bool);
            }
        });
        notifyQueries(859993640, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyContextQueries.insertOrAbortVerifyContext.2
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
                function1.invoke("VerifyContext");
            }
        });
    }

    public final void deleteVerifyContext(final long j) {
        getDriver().AEQbTJ(1781194981, "DELETE FROM VerifyContext\nWHERE id = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyContextQueries.deleteVerifyContext.1
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
                configuration.OLrzqt(0, Long.valueOf(j));
            }
        });
        notifyQueries(1781194981, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyContextQueries.deleteVerifyContext.2
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
                function1.invoke("VerifyContext");
            }
        });
    }

    public final class GetVerifyContextByIdQuery<T> extends AssistContent<T> {
        public final long id;
        public final /* synthetic */ VerifyContextQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "VerifyContext.sq:getVerifyContextById";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetVerifyContextByIdQuery(VerifyContextQueries verifyContextQueries, @NotNull long j, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = verifyContextQueries;
            this.id = j;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"VerifyContext"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"VerifyContext"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(1022112920, "SELECT id, origin, validation, verify_url, is_scam\nFROM VerifyContext\nWHERE id = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.VerifyContextQueries$GetVerifyContextByIdQuery$execute$1
                public final /* synthetic */ VerifyContextQueries.GetVerifyContextByIdQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.VerifyContextQueries$GetVerifyContextByIdQuery<? extends T> */
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
                    configuration.OLrzqt(0, Long.valueOf(this.this$0.getId()));
                }
            });
        }
    }
}
