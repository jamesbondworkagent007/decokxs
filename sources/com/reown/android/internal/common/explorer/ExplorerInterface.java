package com.reown.android.internal.common.explorer;

import com.reown.android.internal.common.explorer.data.model.Project;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface ExplorerInterface {
    /* JADX INFO: renamed from: getProjects-yxL6bBk, reason: not valid java name */
    Object mo7190getProjectsyxL6bBk(int i, int i2, boolean z, boolean z2, @NotNull Continuation<? super Result<? extends List<Project>>> continuation);
}
