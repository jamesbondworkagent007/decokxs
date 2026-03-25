package com.reown.android.internal;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@JsonClass(generateAdapter = true)
public final class Proposal {
    public final List<String> chains;
    public final List<String> events;
    public final List<Extension> extensions;
    public final List<String> methods;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.Proposal */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Proposal copy$default(Proposal proposal, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = proposal.chains;
        }
        if ((i & 2) != 0) {
            list2 = proposal.methods;
        }
        if ((i & 4) != 0) {
            list3 = proposal.events;
        }
        if ((i & 8) != 0) {
            list4 = proposal.extensions;
        }
        return proposal.copy(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.events;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Extension> component4() {
        return this.extensions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Proposal copy(@Json(name = "chains") @NotNull List<String> list, @Json(name = "methods") @NotNull List<String> list2, @Json(name = "events") @NotNull List<String> list3, @Json(name = "extension") List<Extension> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new Proposal(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Proposal)) {
            return false;
        }
        Proposal proposal = (Proposal) obj;
        return Intrinsics.EZpvd(this.chains, proposal.chains) && Intrinsics.EZpvd(this.methods, proposal.methods) && Intrinsics.EZpvd(this.events, proposal.events) && Intrinsics.EZpvd(this.extensions, proposal.extensions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChains() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getEvents() {
        return this.events;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Extension> getExtensions() {
        return this.extensions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getMethods() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chains.hashCode();
        int iHashCode2 = this.methods.hashCode();
        int iHashCode3 = this.events.hashCode();
        List<Extension> list = this.extensions;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Proposal(chains=" + this.chains + ", methods=" + this.methods + ", events=" + this.events + ", extensions=" + this.extensions + ")";
    }

    public Proposal(@Json(name = "chains") @NotNull List<String> list, @Json(name = "methods") @NotNull List<String> list2, @Json(name = "events") @NotNull List<String> list3, @Json(name = "extension") List<Extension> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.chains = list;
        this.methods = list2;
        this.events = list3;
        this.extensions = list4;
    }

    @JsonClass(generateAdapter = true)
    public static final class Extension {
        public final List<String> chains;
        public final List<String> events;
        public final List<String> methods;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.Proposal$Extension */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Extension copy$default(Extension extension, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = extension.chains;
            }
            if ((i & 2) != 0) {
                list2 = extension.methods;
            }
            if ((i & 4) != 0) {
                list3 = extension.events;
            }
            return extension.copy(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component1() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component2() {
            return this.methods;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component3() {
            return this.events;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Extension copy(@Json(name = "chains") @NotNull List<String> list, @Json(name = "methods") @NotNull List<String> list2, @Json(name = "events") @NotNull List<String> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            return new Extension(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Extension)) {
                return false;
            }
            Extension extension = (Extension) obj;
            return Intrinsics.EZpvd(this.chains, extension.chains) && Intrinsics.EZpvd(this.methods, extension.methods) && Intrinsics.EZpvd(this.events, extension.events);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getChains() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getEvents() {
            return this.events;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getMethods() {
            return this.methods;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.chains.hashCode() * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Extension(chains=" + this.chains + ", methods=" + this.methods + ", events=" + this.events + ")";
        }

        public Extension(@Json(name = "chains") @NotNull List<String> list, @Json(name = "methods") @NotNull List<String> list2, @Json(name = "events") @NotNull List<String> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.chains = list;
            this.methods = list2;
            this.events = list3;
        }
    }
}
