package com.reown.sign.sign;

import com.reown.sign.SignDatabase;
import com.reown.sign.sign.SignDatabaseImpl;
import com.reown.sign.storage.data.dao.namespace.NamespaceDao;
import com.reown.sign.storage.data.dao.optionalnamespaces.OptionalNamespaceDao;
import com.reown.sign.storage.data.dao.proposal.ProposalDao;
import com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDao;
import com.reown.sign.storage.data.dao.session.SessionDao;
import com.reown.sign.storage.data.dao.temp.TempNamespaceDao;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.ColorStateList;
import o.IntentSender;
import o.InterfaceC56551yJo;
import o.PackageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignDatabaseImplKt {
    public static final ColorStateList<IntentSender.Activity<Unit>> getSchema(@NotNull InterfaceC56551yJo<SignDatabase> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return SignDatabaseImpl.Schema.INSTANCE;
    }

    public static final SignDatabase newInstance(@NotNull InterfaceC56551yJo<SignDatabase> interfaceC56551yJo, @NotNull PackageManager packageManager, @NotNull NamespaceDao.Adapter adapter, @NotNull OptionalNamespaceDao.Adapter adapter2, @NotNull ProposalDao.Adapter adapter3, @NotNull ProposalNamespaceDao.Adapter adapter4, @NotNull SessionDao.Adapter adapter5, @NotNull TempNamespaceDao.Adapter adapter6) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        Intrinsics.checkNotNullParameter(adapter2, "");
        Intrinsics.checkNotNullParameter(adapter3, "");
        Intrinsics.checkNotNullParameter(adapter4, "");
        Intrinsics.checkNotNullParameter(adapter5, "");
        Intrinsics.checkNotNullParameter(adapter6, "");
        return new SignDatabaseImpl(packageManager, adapter, adapter2, adapter3, adapter4, adapter5, adapter6);
    }
}
