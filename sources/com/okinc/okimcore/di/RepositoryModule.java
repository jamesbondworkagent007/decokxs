package com.okinc.okimcore.di;

import android.content.Context;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;
import kotlin.jvm.internal.Intrinsics;
import o.C44489sRs;
import o.sED;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class RepositoryModule {
    public final C44489sRs copydefault(@NotNull sED sed, @NotNull InHouseIMUploadMediaService inHouseIMUploadMediaService, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(sed, "");
        Intrinsics.checkNotNullParameter(inHouseIMUploadMediaService, "");
        Intrinsics.checkNotNullParameter(context, "");
        return new C44489sRs(sed, inHouseIMUploadMediaService, context);
    }
}
