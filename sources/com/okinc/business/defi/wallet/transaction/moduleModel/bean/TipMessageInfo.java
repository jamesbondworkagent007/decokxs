package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TipMessageInfo {
    public static final int $stable = 0;
    private final ImageItem image;
    private final Integer level;
    private final String tipMessage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TipMessageInfo copy$default(TipMessageInfo tipMessageInfo, String str, Integer num, ImageItem imageItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tipMessageInfo.tipMessage;
        }
        if ((i & 2) != 0) {
            num = tipMessageInfo.level;
        }
        if ((i & 4) != 0) {
            imageItem = tipMessageInfo.image;
        }
        return tipMessageInfo.copy(str, num, imageItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tipMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageItem component3() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TipMessageInfo copy(String str, Integer num, ImageItem imageItem) {
        return new TipMessageInfo(str, num, imageItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TipMessageInfo)) {
            return false;
        }
        TipMessageInfo tipMessageInfo = (TipMessageInfo) obj;
        return Intrinsics.EZpvd((Object) this.tipMessage, (Object) tipMessageInfo.tipMessage) && Intrinsics.EZpvd(this.level, tipMessageInfo.level) && Intrinsics.EZpvd(this.image, tipMessageInfo.image);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageItem getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipMessage() {
        return this.tipMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tipMessage;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.level;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        ImageItem imageItem = this.image;
        return (((iHashCode * 31) + iHashCode2) * 31) + (imageItem != null ? imageItem.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TipMessageInfo(tipMessage=" + this.tipMessage + ", level=" + this.level + ", image=" + this.image + ")";
    }

    public TipMessageInfo(String str, Integer num, ImageItem imageItem) {
        this.tipMessage = str;
        this.level = num;
        this.image = imageItem;
    }
}
