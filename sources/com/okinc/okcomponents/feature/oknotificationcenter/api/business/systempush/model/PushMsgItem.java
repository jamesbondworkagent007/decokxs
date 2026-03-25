package com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PushMsgItem {
    public static final int $stable = 0;
    private final String bizType;
    private final String content;
    private final Long createTime;
    private final String data;
    private final Long id;
    private final String imageUrl;
    private final Integer linkType;
    private final String messageName;
    private final String title;
    private final Integer type;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PushMsgItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.linkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.messageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PushMsgItem copy(Long l, String str, String str2, String str3, String str4, Integer num, Long l2, String str5, String str6, Integer num2, String str7) {
        return new PushMsgItem(l, str, str2, str3, str4, num, l2, str5, str6, num2, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushMsgItem)) {
            return false;
        }
        PushMsgItem pushMsgItem = (PushMsgItem) obj;
        return Intrinsics.EZpvd(this.id, pushMsgItem.id) && Intrinsics.EZpvd((Object) this.title, (Object) pushMsgItem.title) && Intrinsics.EZpvd((Object) this.content, (Object) pushMsgItem.content) && Intrinsics.EZpvd((Object) this.url, (Object) pushMsgItem.url) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) pushMsgItem.imageUrl) && Intrinsics.EZpvd(this.type, pushMsgItem.type) && Intrinsics.EZpvd(this.createTime, pushMsgItem.createTime) && Intrinsics.EZpvd((Object) this.bizType, (Object) pushMsgItem.bizType) && Intrinsics.EZpvd((Object) this.data, (Object) pushMsgItem.data) && Intrinsics.EZpvd(this.linkType, pushMsgItem.linkType) && Intrinsics.EZpvd((Object) this.messageName, (Object) pushMsgItem.messageName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLinkType() {
        return this.linkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageName() {
        return this.messageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.id;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.title;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.url;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.imageUrl;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.type;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Long l2 = this.createTime;
        int iHashCode7 = l2 == null ? 0 : l2.hashCode();
        String str5 = this.bizType;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.data;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        Integer num2 = this.linkType;
        int iHashCode10 = num2 == null ? 0 : num2.hashCode();
        String str7 = this.messageName;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PushMsgItem(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", url=" + this.url + ", imageUrl=" + this.imageUrl + ", type=" + this.type + ", createTime=" + this.createTime + ", bizType=" + this.bizType + ", data=" + this.data + ", linkType=" + this.linkType + ", messageName=" + this.messageName + ")";
    }

    public PushMsgItem(Long l, String str, String str2, String str3, String str4, Integer num, Long l2, String str5, String str6, Integer num2, String str7) {
        this.id = l;
        this.title = str;
        this.content = str2;
        this.url = str3;
        this.imageUrl = str4;
        this.type = num;
        this.createTime = l2;
        this.bizType = str5;
        this.data = str6;
        this.linkType = num2;
        this.messageName = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PushMsgItem(Long l, String str, String str2, String str3, String str4, Integer num, Long l2, String str5, String str6, Integer num2, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? l : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 0 : num, (i & 64) == 0 ? l2 : 0L, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? 0 : num2, (i & 1024) == 0 ? str7 : "");
    }
}
