package com.reown.android.internal.common.explorer.data.model;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class Listing {

    /* JADX INFO: renamed from: app, reason: collision with root package name */
    public final App f1048app;
    public final String appType;
    public final List<String> chains;
    public final String description;
    public final Desktop desktop;
    public final Uri homepage;
    public final String id;
    public final String imageId;
    public final ImageUrl imageUrl;
    public final List<Injected> injected;
    public final Metadata metadata;
    public final Mobile mobile;
    public final String name;
    public final List<String> sdks;
    public final List<SupportedStandard> supportedStandards;
    public final String updatedAt;
    public final List<String> versions;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageUrl component10() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final App component11() {
        return this.f1048app;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Injected> component12() {
        return this.injected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Mobile component13() {
        return this.mobile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Desktop component14() {
        return this.desktop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedStandard> component15() {
        return this.supportedStandards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Metadata component16() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri component4() {
        return this.homepage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.versions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.sdks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.appType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Listing copy(@NotNull String str, @NotNull String str2, String str3, @NotNull Uri uri, @NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull String str4, @NotNull String str5, @NotNull ImageUrl imageUrl, @NotNull App app2, List<Injected> list4, @NotNull Mobile mobile, @NotNull Desktop desktop, @NotNull List<SupportedStandard> list5, @NotNull Metadata metadata, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(imageUrl, "");
        Intrinsics.checkNotNullParameter(app2, "");
        Intrinsics.checkNotNullParameter(mobile, "");
        Intrinsics.checkNotNullParameter(desktop, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(metadata, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new Listing(str, str2, str3, uri, list, list2, list3, str4, str5, imageUrl, app2, list4, mobile, desktop, list5, metadata, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Listing)) {
            return false;
        }
        Listing listing = (Listing) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) listing.id) && Intrinsics.EZpvd((Object) this.name, (Object) listing.name) && Intrinsics.EZpvd((Object) this.description, (Object) listing.description) && Intrinsics.EZpvd(this.homepage, listing.homepage) && Intrinsics.EZpvd(this.chains, listing.chains) && Intrinsics.EZpvd(this.versions, listing.versions) && Intrinsics.EZpvd(this.sdks, listing.sdks) && Intrinsics.EZpvd((Object) this.appType, (Object) listing.appType) && Intrinsics.EZpvd((Object) this.imageId, (Object) listing.imageId) && Intrinsics.EZpvd(this.imageUrl, listing.imageUrl) && Intrinsics.EZpvd(this.f1048app, listing.f1048app) && Intrinsics.EZpvd(this.injected, listing.injected) && Intrinsics.EZpvd(this.mobile, listing.mobile) && Intrinsics.EZpvd(this.desktop, listing.desktop) && Intrinsics.EZpvd(this.supportedStandards, listing.supportedStandards) && Intrinsics.EZpvd(this.metadata, listing.metadata) && Intrinsics.EZpvd((Object) this.updatedAt, (Object) listing.updatedAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final App getApp() {
        return this.f1048app;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppType() {
        return this.appType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChains() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Desktop getDesktop() {
        return this.desktop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getHomepage() {
        return this.homepage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageId() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageUrl getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Injected> getInjected() {
        return this.injected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Mobile getMobile() {
        return this.mobile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSdks() {
        return this.sdks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedStandard> getSupportedStandards() {
        return this.supportedStandards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getVersions() {
        return this.versions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.name.hashCode();
        String str = this.description;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.homepage.hashCode();
        int iHashCode5 = this.chains.hashCode();
        int iHashCode6 = this.versions.hashCode();
        int iHashCode7 = this.sdks.hashCode();
        int iHashCode8 = this.appType.hashCode();
        int iHashCode9 = this.imageId.hashCode();
        int iHashCode10 = this.imageUrl.hashCode();
        int iHashCode11 = this.f1048app.hashCode();
        List<Injected> list = this.injected;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.mobile.hashCode()) * 31) + this.desktop.hashCode()) * 31) + this.supportedStandards.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Listing(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", homepage=" + this.homepage + ", chains=" + this.chains + ", versions=" + this.versions + ", sdks=" + this.sdks + ", appType=" + this.appType + ", imageId=" + this.imageId + ", imageUrl=" + this.imageUrl + ", app=" + this.f1048app + ", injected=" + this.injected + ", mobile=" + this.mobile + ", desktop=" + this.desktop + ", supportedStandards=" + this.supportedStandards + ", metadata=" + this.metadata + ", updatedAt=" + this.updatedAt + ")";
    }

    public Listing(@NotNull String str, @NotNull String str2, String str3, @NotNull Uri uri, @NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull String str4, @NotNull String str5, @NotNull ImageUrl imageUrl, @NotNull App app2, List<Injected> list4, @NotNull Mobile mobile, @NotNull Desktop desktop, @NotNull List<SupportedStandard> list5, @NotNull Metadata metadata, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(imageUrl, "");
        Intrinsics.checkNotNullParameter(app2, "");
        Intrinsics.checkNotNullParameter(mobile, "");
        Intrinsics.checkNotNullParameter(desktop, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(metadata, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.homepage = uri;
        this.chains = list;
        this.versions = list2;
        this.sdks = list3;
        this.appType = str4;
        this.imageId = str5;
        this.imageUrl = imageUrl;
        this.f1048app = app2;
        this.injected = list4;
        this.mobile = mobile;
        this.desktop = desktop;
        this.supportedStandards = list5;
        this.metadata = metadata;
        this.updatedAt = str6;
    }
}
