package com.okinc.im.imui.capture;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.oCS;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessageSightRecordActivityViewModel extends ViewModel {
    public final oCS copydefault;

    @yCM
    public BroadcastMessageSightRecordActivityViewModel(@NotNull oCS ocs) {
        Intrinsics.checkNotNullParameter(ocs, "");
        this.copydefault = ocs;
    }

    public final void copydefault(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessageSightRecordActivityViewModel$confirmSend$1(this, function0, function02, null), 3, null);
    }
}
