package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class ProjectListingDTO {
    public final int count;
    public final Map<String, ProjectDTO> projects;
    public final int total;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.explorer.data.network.model.ProjectListingDTO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProjectListingDTO copy$default(ProjectListingDTO projectListingDTO, Map map, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = projectListingDTO.projects;
        }
        if ((i3 & 2) != 0) {
            i = projectListingDTO.count;
        }
        if ((i3 & 4) != 0) {
            i2 = projectListingDTO.total;
        }
        return projectListingDTO.copy(map, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, ProjectDTO> component1() {
        return this.projects;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectListingDTO copy(@Json(name = "projects") @NotNull Map<String, ProjectDTO> map, @Json(name = "count") int i, @Json(name = "total") int i2) {
        Intrinsics.checkNotNullParameter(map, "");
        return new ProjectListingDTO(map, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectListingDTO)) {
            return false;
        }
        ProjectListingDTO projectListingDTO = (ProjectListingDTO) obj;
        return Intrinsics.EZpvd(this.projects, projectListingDTO.projects) && this.count == projectListingDTO.count && this.total == projectListingDTO.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, ProjectDTO> getProjects() {
        return this.projects;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.projects.hashCode() * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.total);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProjectListingDTO(projects=" + this.projects + ", count=" + this.count + ", total=" + this.total + ")";
    }

    public ProjectListingDTO(@Json(name = "projects") @NotNull Map<String, ProjectDTO> map, @Json(name = "count") int i, @Json(name = "total") int i2) {
        Intrinsics.checkNotNullParameter(map, "");
        this.projects = map;
        this.count = i;
        this.total = i2;
    }
}
