package org.koin.androidx.scope;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import o.C59999ztb;
import o.C60002zte;
import o.C60060zuj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class LifecycleViewModelScopeDelegate$2 implements DefaultLifecycleObserver {
    public final /* synthetic */ C59999ztb EZpvd;
    public final /* synthetic */ C60002zte KWHzl;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (this.KWHzl.copydefault() == null) {
            this.KWHzl.EZpvd((C60060zuj) this.EZpvd.KWHzl.invoke(this.EZpvd.EZpvd));
        }
        this.EZpvd.OLrzqt = this.KWHzl.copydefault();
    }
}
