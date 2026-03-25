package com.okinc.okimcore.stickers.local;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC44488sRr;
import o.sFC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class StickerEntity implements InterfaceC44488sRr {
    public static final int $stable = 0;
    private final String packId;
    private final String path;
    private final long position;
    private final String stickerId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StickerEntity copy$default(StickerEntity stickerEntity, String str, String str2, long j, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stickerEntity.stickerId;
        }
        if ((i & 2) != 0) {
            str2 = stickerEntity.packId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = stickerEntity.position;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = stickerEntity.path;
        }
        return stickerEntity.copy(str, str4, j2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.stickerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.packId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StickerEntity copy(@NotNull String str, @NotNull String str2, long j, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new StickerEntity(str, str2, j, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerEntity)) {
            return false;
        }
        StickerEntity stickerEntity = (StickerEntity) obj;
        return Intrinsics.EZpvd((Object) this.stickerId, (Object) stickerEntity.stickerId) && Intrinsics.EZpvd((Object) this.packId, (Object) stickerEntity.packId) && this.position == stickerEntity.position && Intrinsics.EZpvd((Object) this.path, (Object) stickerEntity.path);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPackId() {
        return this.packId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44488sRr
    public String getStickerId() {
        return this.stickerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.stickerId.hashCode() * 31) + this.packId.hashCode()) * 31) + Long.hashCode(this.position)) * 31) + this.path.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StickerEntity(stickerId=" + this.stickerId + ", packId=" + this.packId + ", position=" + this.position + ", path=" + this.path + ")";
    }

    public StickerEntity(@NotNull String str, @NotNull String str2, long j, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.stickerId = str;
        this.packId = str2;
        this.position = j;
        this.path = str3;
    }

    @Override // o.InterfaceC44488sRr
    public String getIconUrl() {
        return sFC.OLrzqt(this.path);
    }
}
