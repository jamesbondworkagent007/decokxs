package com.reown.android.internal.common.explorer.domain.usecase;

import com.reown.android.internal.common.explorer.ExplorerRepository;
import com.reown.android.internal.common.explorer.data.model.Project;
import com.reown.android.internal.common.explorer.data.model.ProjectListing;
import java.util.Comparator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetProjectsWithPaginationUseCase {
    public final ExplorerRepository explorerRepository;

    public GetProjectsWithPaginationUseCase(@NotNull ExplorerRepository explorerRepository) {
        Intrinsics.checkNotNullParameter(explorerRepository, "");
        this.explorerRepository = explorerRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: invoke-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7192invokeyxL6bBk(int i, int i2, boolean z, boolean z2, @NotNull Continuation<? super Result<? extends List<Project>>> continuation) {
        GetProjectsWithPaginationUseCase$invoke$1 getProjectsWithPaginationUseCase$invoke$1;
        if (continuation instanceof GetProjectsWithPaginationUseCase$invoke$1) {
            getProjectsWithPaginationUseCase$invoke$1 = (GetProjectsWithPaginationUseCase$invoke$1) continuation;
            int i3 = getProjectsWithPaginationUseCase$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getProjectsWithPaginationUseCase$invoke$1.label = i3 - Integer.MIN_VALUE;
            } else {
                getProjectsWithPaginationUseCase$invoke$1 = new GetProjectsWithPaginationUseCase$invoke$1(this, continuation);
            }
        }
        GetProjectsWithPaginationUseCase$invoke$1 getProjectsWithPaginationUseCase$invoke$12 = getProjectsWithPaginationUseCase$invoke$1;
        Object projects = getProjectsWithPaginationUseCase$invoke$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = getProjectsWithPaginationUseCase$invoke$12.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(projects);
                Result.Application application = Result.Companion;
                ExplorerRepository explorerRepository = this.explorerRepository;
                getProjectsWithPaginationUseCase$invoke$12.label = 1;
                projects = explorerRepository.getProjects(i, i2, z, z2, getProjectsWithPaginationUseCase$invoke$12);
                if (projects == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(projects);
            }
            return Result.m7377constructorimpl(CollectionsKt___CollectionsKt.EZpvd(((ProjectListing) projects).getProjects(), new Comparator() { // from class: com.reown.android.internal.common.explorer.domain.usecase.GetProjectsWithPaginationUseCase$invoke_yxL6bBk$lambda$1$$inlined$sortedBy$1
                /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    Long order = ((Project) t).getOrder();
                    long jLongValue = order != null ? order.longValue() : Long.MAX_VALUE;
                    Long order2 = ((Project) t2).getOrder();
                    return yET.KWHzl(Long.valueOf(jLongValue), Long.valueOf(order2 != null ? order2.longValue() : Long.MAX_VALUE));
                }
            }));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
