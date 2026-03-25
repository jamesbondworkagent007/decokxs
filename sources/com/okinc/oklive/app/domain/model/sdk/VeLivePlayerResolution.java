package com.okinc.oklive.app.domain.model.sdk;

import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class VeLivePlayerResolution {
    public final ResolutionType KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VeLivePlayerResolution copy$default(VeLivePlayerResolution veLivePlayerResolution, ResolutionType resolutionType, int i, Object obj) {
        if ((i & 1) != 0) {
            resolutionType = veLivePlayerResolution.KWHzl;
        }
        return veLivePlayerResolution.EZpvd(resolutionType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VeLivePlayerResolution EZpvd(@NotNull ResolutionType resolutionType) {
        Intrinsics.checkNotNullParameter(resolutionType, "");
        return new VeLivePlayerResolution(resolutionType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VeLivePlayerResolution) && this.KWHzl == ((VeLivePlayerResolution) obj).KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VeLivePlayerResolution(resolutionType=" + this.KWHzl + ")";
    }

    public VeLivePlayerResolution(@NotNull ResolutionType resolutionType) {
        Intrinsics.checkNotNullParameter(resolutionType, "");
        this.KWHzl = resolutionType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResolutionType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ResolutionType[] $VALUES;
        public static final ResolutionType UHD = new ResolutionType("UHD", 0);
        public static final ResolutionType HD = new ResolutionType("HD", 1);
        public static final ResolutionType SD = new ResolutionType("SD", 2);
        public static final ResolutionType LD = new ResolutionType("LD", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ResolutionType[] $values() {
            return new ResolutionType[]{UHD, HD, SD, LD};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ResolutionType> getEntries() {
            return $ENTRIES;
        }

        private ResolutionType(String str, int i) {
        }

        static {
            ResolutionType[] resolutionTypeArr$values = $values();
            $VALUES = resolutionTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(resolutionTypeArr$values);
        }

        public static ResolutionType valueOf(String str) {
            return (ResolutionType) Enum.valueOf(ResolutionType.class, str);
        }

        public static ResolutionType[] values() {
            return (ResolutionType[]) $VALUES.clone();
        }
    }
}
