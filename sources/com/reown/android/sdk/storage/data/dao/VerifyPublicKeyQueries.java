package com.reown.android.sdk.storage.data.dao;

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
public final class VerifyPublicKeyQueries extends ContentResolver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPublicKeyQueries(@NotNull PackageManager packageManager) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
    }

    public final <T> AssistContent<T> getKey(@NotNull final Function2<? super String, ? super Long, ? extends T> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return VoiceInteractor.OLrzqt(-962554474, new String[]{"VerifyPublicKey"}, getDriver(), "VerifyPublicKey.sq", "getKey", "SELECT key, expires_at\nFROM VerifyPublicKey", new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyPublicKeyQueries.getKey.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Long, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                Function2<String, Long, T> function22 = function2;
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                Long lEZpvd = assetManager.EZpvd(1);
                Intrinsics.copydefault(lEZpvd);
                return function22.invoke(strKWHzl, lEZpvd);
            }
        });
    }

    public final AssistContent<VerifyPublicKey> getKey() {
        return getKey(new Function2<String, Long, VerifyPublicKey>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyPublicKeyQueries.getKey.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ VerifyPublicKey invoke(String str, Long l) {
                return invoke(str, l.longValue());
            }

            public final VerifyPublicKey invoke(@NotNull String str, long j) {
                Intrinsics.checkNotNullParameter(str, "");
                return new VerifyPublicKey(str, j);
            }
        });
    }

    public final void upsertKey(@NotNull final String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(66605347, "INSERT OR REPLACE INTO VerifyPublicKey(key, expires_at)\nVALUES (?, ?)", 2, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyPublicKeyQueries.upsertKey.1
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
                configuration.OLrzqt(1, Long.valueOf(j));
            }
        });
        notifyQueries(66605347, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.VerifyPublicKeyQueries.upsertKey.2
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
                function1.invoke("VerifyPublicKey");
            }
        });
    }
}
