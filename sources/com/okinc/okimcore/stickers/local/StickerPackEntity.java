package com.okinc.okimcore.stickers.local;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC44494sRx;
import o.sFC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class StickerPackEntity implements InterfaceC44494sRx {
    public static final int $stable = 0;
    public static final String CUSTOM_PACK_ID = "custom_pack";
    public static final Activity Companion = new Activity(null);
    private final String packId;
    private final String pathDay;
    private final String pathNight;
    private final long position;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StickerPackEntity copy$default(StickerPackEntity stickerPackEntity, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stickerPackEntity.packId;
        }
        if ((i & 2) != 0) {
            str2 = stickerPackEntity.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = stickerPackEntity.pathDay;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = stickerPackEntity.pathNight;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            j = stickerPackEntity.position;
        }
        return stickerPackEntity.copy(str, str5, str6, str7, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.packId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pathDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pathNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StickerPackEntity copy(@NotNull String str, @NotNull String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new StickerPackEntity(str, str2, str3, str4, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerPackEntity)) {
            return false;
        }
        StickerPackEntity stickerPackEntity = (StickerPackEntity) obj;
        return Intrinsics.EZpvd((Object) this.packId, (Object) stickerPackEntity.packId) && Intrinsics.EZpvd((Object) this.title, (Object) stickerPackEntity.title) && Intrinsics.EZpvd((Object) this.pathDay, (Object) stickerPackEntity.pathDay) && Intrinsics.EZpvd((Object) this.pathNight, (Object) stickerPackEntity.pathNight) && this.position == stickerPackEntity.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44494sRx
    public String getPackId() {
        return this.packId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPathDay() {
        return this.pathDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPathNight() {
        return this.pathNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44494sRx
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.packId.hashCode();
        int iHashCode2 = this.title.hashCode();
        String str = this.pathDay;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.pathNight;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.position);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StickerPackEntity(packId=" + this.packId + ", title=" + this.title + ", pathDay=" + this.pathDay + ", pathNight=" + this.pathNight + ", position=" + this.position + ")";
    }

    public StickerPackEntity(@NotNull String str, @NotNull String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.packId = str;
        this.title = str2;
        this.pathDay = str3;
        this.pathNight = str4;
        this.position = j;
    }

    @Override // o.InterfaceC44494sRx
    public String getIconUrlDay() {
        String str = this.pathDay;
        if (str != null) {
            return sFC.OLrzqt(str);
        }
        return null;
    }

    @Override // o.InterfaceC44494sRx
    public String getIconUrlNight() {
        String str = this.pathNight;
        if (str != null) {
            return sFC.OLrzqt(str);
        }
        return null;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.stickers.local.StickerPackEntity.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
