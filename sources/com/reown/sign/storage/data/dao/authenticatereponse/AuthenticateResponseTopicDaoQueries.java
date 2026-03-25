package com.reown.sign.storage.data.dao.authenticatereponse;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AssetManager;
import o.AssistContent;
import o.Configuration;
import o.ContentResolver;
import o.PackageManager;
import o.VoiceInteractor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class AuthenticateResponseTopicDaoQueries extends ContentResolver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticateResponseTopicDaoQueries(@NotNull PackageManager packageManager) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
    }

    public final <T> AssistContent<T> getListOfTopics(@NotNull final Function2<? super String, ? super String, ? extends T> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return VoiceInteractor.OLrzqt(-812935773, new String[]{"AuthenticateResponseTopicDao"}, getDriver(), "AuthenticateResponseTopicDao.sq", "getListOfTopics", "SELECT ard.pairingTopic, ard.responseTopic\nFROM AuthenticateResponseTopicDao ard", new Function1<AssetManager, T>() { // from class: com.reown.sign.storage.data.dao.authenticatereponse.AuthenticateResponseTopicDaoQueries.getListOfTopics.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                Function2<String, String, T> function22 = function2;
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl2);
                return function22.invoke(strKWHzl, strKWHzl2);
            }
        });
    }

    public final AssistContent<GetListOfTopics> getListOfTopics() {
        return getListOfTopics(new Function2<String, String, GetListOfTopics>() { // from class: com.reown.sign.storage.data.dao.authenticatereponse.AuthenticateResponseTopicDaoQueries.getListOfTopics.2
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final GetListOfTopics invoke(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new GetListOfTopics(str, str2);
            }
        });
    }

    public final void insertOrAbort(@NotNull final String str, @NotNull final String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        getDriver().AEQbTJ(1853327784, "INSERT OR ABORT INTO AuthenticateResponseTopicDao(pairingTopic, responseTopic)\nVALUES (?,?)", 2, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.authenticatereponse.AuthenticateResponseTopicDaoQueries.insertOrAbort.1
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
        notifyQueries(1853327784, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.authenticatereponse.AuthenticateResponseTopicDaoQueries.insertOrAbort.2
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
                function1.invoke("AuthenticateResponseTopicDao");
            }
        });
    }

    public final void deleteByPairingTopic(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-477408843, "DELETE FROM AuthenticateResponseTopicDao\nWHERE pairingTopic = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.authenticatereponse.AuthenticateResponseTopicDaoQueries.deleteByPairingTopic.1
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
        notifyQueries(-477408843, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.authenticatereponse.AuthenticateResponseTopicDaoQueries.deleteByPairingTopic.2
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
                function1.invoke("AuthenticateResponseTopicDao");
            }
        });
    }
}
