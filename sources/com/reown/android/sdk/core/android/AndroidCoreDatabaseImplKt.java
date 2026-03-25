package com.reown.android.sdk.core.android;

import com.reown.android.sdk.core.AndroidCoreDatabase;
import com.reown.android.sdk.core.android.AndroidCoreDatabaseImpl;
import com.reown.android.sdk.storage.data.dao.EventDao;
import com.reown.android.sdk.storage.data.dao.JsonRpcHistoryDao;
import com.reown.android.sdk.storage.data.dao.MetaData;
import com.reown.android.sdk.storage.data.dao.VerifyContext;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.ColorStateList;
import o.IntentSender;
import o.InterfaceC56551yJo;
import o.PackageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class AndroidCoreDatabaseImplKt {
    public static final ColorStateList<IntentSender.Activity<Unit>> getSchema(@NotNull InterfaceC56551yJo<AndroidCoreDatabase> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return AndroidCoreDatabaseImpl.Schema.INSTANCE;
    }

    public static final AndroidCoreDatabase newInstance(@NotNull InterfaceC56551yJo<AndroidCoreDatabase> interfaceC56551yJo, @NotNull PackageManager packageManager, @NotNull EventDao.Adapter adapter, @NotNull JsonRpcHistoryDao.Adapter adapter2, @NotNull MetaData.Adapter adapter3, @NotNull VerifyContext.Adapter adapter4) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        Intrinsics.checkNotNullParameter(adapter2, "");
        Intrinsics.checkNotNullParameter(adapter3, "");
        Intrinsics.checkNotNullParameter(adapter4, "");
        return new AndroidCoreDatabaseImpl(packageManager, adapter, adapter2, adapter3, adapter4);
    }
}
