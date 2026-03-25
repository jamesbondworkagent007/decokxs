package com.reown.android.internal.common.explorer.data.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ProjectListing {
    public final int count;
    public final List<Project> projects;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.explorer.data.model.ProjectListing */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProjectListing copy$default(ProjectListing projectListing, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = projectListing.projects;
        }
        if ((i2 & 2) != 0) {
            i = projectListing.count;
        }
        return projectListing.copy(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Project> component1() {
        return this.projects;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectListing copy(@NotNull List<Project> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ProjectListing(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectListing)) {
            return false;
        }
        ProjectListing projectListing = (ProjectListing) obj;
        return Intrinsics.EZpvd(this.projects, projectListing.projects) && this.count == projectListing.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Project> getProjects() {
        return this.projects;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.projects.hashCode() * 31) + Integer.hashCode(this.count);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProjectListing(projects=" + this.projects + ", count=" + this.count + ")";
    }

    public ProjectListing(@NotNull List<Project> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.projects = list;
        this.count = i;
    }
}
