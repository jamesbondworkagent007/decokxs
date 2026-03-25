package com.okinc.business.appupdate.impl;

import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.AbstractC43215rlA;
import o.InterfaceC33209msD;
import o.InterfaceC46518tXh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UpgradeDependencyExtensionImpl extends AbstractC43215rlA implements InterfaceC33209msD {
    public static final int $stable = 0;

    @Override // o.InterfaceC33209msD
    public InterfaceC46518tXh getUpdateManageableContainer(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull FragmentManager fragmentManager, boolean z) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        return AppUpdateServiceImplKt.getAppUpdateService().getUpdateManageableContainer(abstractActivityC33041mov, fragmentManager, z);
    }

    @Override // o.InterfaceC33209msD
    public void onActivityResult(int i, int i2, Intent intent) {
        AppUpdateServiceImplKt.getAppUpdateService().onActivityResult(i, i2, intent);
    }
}
