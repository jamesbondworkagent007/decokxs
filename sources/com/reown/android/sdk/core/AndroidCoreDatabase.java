package com.reown.android.sdk.core;

import com.reown.android.sdk.core.android.AndroidCoreDatabaseImplKt;
import com.reown.android.sdk.storage.data.dao.EventDao;
import com.reown.android.sdk.storage.data.dao.EventQueries;
import com.reown.android.sdk.storage.data.dao.IdentitiesQueries;
import com.reown.android.sdk.storage.data.dao.JsonRpcHistoryDao;
import com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries;
import com.reown.android.sdk.storage.data.dao.MetaData;
import com.reown.android.sdk.storage.data.dao.MetaDataQueries;
import com.reown.android.sdk.storage.data.dao.PairingQueries;
import com.reown.android.sdk.storage.data.dao.PushMessageQueries;
import com.reown.android.sdk.storage.data.dao.VerifyContext;
import com.reown.android.sdk.storage.data.dao.VerifyContextQueries;
import com.reown.android.sdk.storage.data.dao.VerifyPublicKeyQueries;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56524yIo;
import o.ColorStateList;
import o.ComponentCallbacks2;
import o.IntentSender;
import o.PackageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface AndroidCoreDatabase extends ComponentCallbacks2 {
    public static final Companion Companion = Companion.$$INSTANCE;

    EventQueries getEventQueries();

    IdentitiesQueries getIdentitiesQueries();

    JsonRpcHistoryQueries getJsonRpcHistoryQueries();

    MetaDataQueries getMetaDataQueries();

    PairingQueries getPairingQueries();

    PushMessageQueries getPushMessageQueries();

    VerifyContextQueries getVerifyContextQueries();

    VerifyPublicKeyQueries getVerifyPublicKeyQueries();

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final ColorStateList<IntentSender.Activity<Unit>> getSchema() {
            return AndroidCoreDatabaseImplKt.getSchema(C56524yIo.AEQbTJ(AndroidCoreDatabase.class));
        }

        public final AndroidCoreDatabase invoke(@NotNull PackageManager packageManager, @NotNull EventDao.Adapter adapter, @NotNull JsonRpcHistoryDao.Adapter adapter2, @NotNull MetaData.Adapter adapter3, @NotNull VerifyContext.Adapter adapter4) {
            Intrinsics.checkNotNullParameter(packageManager, "");
            Intrinsics.checkNotNullParameter(adapter, "");
            Intrinsics.checkNotNullParameter(adapter2, "");
            Intrinsics.checkNotNullParameter(adapter3, "");
            Intrinsics.checkNotNullParameter(adapter4, "");
            return AndroidCoreDatabaseImplKt.newInstance(C56524yIo.AEQbTJ(AndroidCoreDatabase.class), packageManager, adapter, adapter2, adapter3, adapter4);
        }
    }
}
