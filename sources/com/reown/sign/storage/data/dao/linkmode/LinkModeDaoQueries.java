package com.reown.sign.storage.data.dao.linkmode;

import com.reown.sign.storage.data.dao.linkmode.LinkModeDaoQueries;
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
public final class LinkModeDaoQueries extends ContentResolver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkModeDaoQueries(@NotNull PackageManager packageManager) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
    }

    public final AssistContent<String> isEnabled(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new IsEnabledQuery(this, str, new Function1<AssetManager, String>() { // from class: com.reown.sign.storage.data.dao.linkmode.LinkModeDaoQueries.isEnabled.1
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

    public final void insertOrIgnore(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-446418728, "INSERT OR IGNORE INTO LinkModeDao (app_link)\nVALUES (?)", 1, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.linkmode.LinkModeDaoQueries.insertOrIgnore.1
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
        notifyQueries(-446418728, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.linkmode.LinkModeDaoQueries.insertOrIgnore.2
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
                function1.invoke("LinkModeDao");
            }
        });
    }

    /* JADX INFO: loaded from: classes17.dex */
    public final class IsEnabledQuery<T> extends AssistContent<T> {
        public final String app_link;
        public final /* synthetic */ LinkModeDaoQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getApp_link() {
            return this.app_link;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LinkModeDao.sq:isEnabled";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IsEnabledQuery(@NotNull LinkModeDaoQueries linkModeDaoQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = linkModeDaoQueries;
            this.app_link = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"LinkModeDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"LinkModeDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(1708459789, "SELECT app_link\nFROM LinkModeDao\nWHERE ? = app_link", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.linkmode.LinkModeDaoQueries$IsEnabledQuery$execute$1
                public final /* synthetic */ LinkModeDaoQueries.IsEnabledQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.linkmode.LinkModeDaoQueries$IsEnabledQuery<? extends T> */
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
                    configuration.copydefault(0, this.this$0.getApp_link());
                }
            });
        }
    }
}
