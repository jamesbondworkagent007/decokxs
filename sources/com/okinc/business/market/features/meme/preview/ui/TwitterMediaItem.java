package com.okinc.business.market.features.meme.preview.ui;

import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TwitterMediaItem {
    public final String EZpvd;
    public final MediaType KWHzl;
    public final String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TwitterMediaItem copy$default(TwitterMediaItem twitterMediaItem, String str, MediaType mediaType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twitterMediaItem.EZpvd;
        }
        if ((i & 2) != 0) {
            mediaType = twitterMediaItem.KWHzl;
        }
        if ((i & 4) != 0) {
            str2 = twitterMediaItem.copydefault;
        }
        return twitterMediaItem.AEQbTJ(str, mediaType, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterMediaItem AEQbTJ(@NotNull String str, @NotNull MediaType mediaType, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mediaType, "");
        return new TwitterMediaItem(str, mediaType, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaType copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterMediaItem)) {
            return false;
        }
        TwitterMediaItem twitterMediaItem = (TwitterMediaItem) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) twitterMediaItem.EZpvd) && this.KWHzl == twitterMediaItem.KWHzl && Intrinsics.EZpvd((Object) this.copydefault, (Object) twitterMediaItem.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        String str = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterMediaItem(url=" + this.EZpvd + ", type=" + this.KWHzl + ", thumbnailUrl=" + this.copydefault + ")";
    }

    public TwitterMediaItem(@NotNull String str, @NotNull MediaType mediaType, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mediaType, "");
        this.EZpvd = str;
        this.KWHzl = mediaType;
        this.copydefault = str2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MediaType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MediaType[] $VALUES;
        public static final MediaType PHOTO = new MediaType("PHOTO", 0);
        public static final MediaType VIDEO = new MediaType("VIDEO", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MediaType[] $values() {
            return new MediaType[]{PHOTO, VIDEO};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MediaType> getEntries() {
            return $ENTRIES;
        }

        private MediaType(String str, int i) {
        }

        static {
            MediaType[] mediaTypeArr$values = $values();
            $VALUES = mediaTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(mediaTypeArr$values);
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) $VALUES.clone();
        }
    }
}
