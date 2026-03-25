package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamOwner {
    public static final int $stable = 8;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("enNickname")
    private final String enNickname;

    @SerializedName("isFollowed")
    private final Boolean isFollowed;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("tags")
    private final List<Integer> tags;

    @SerializedName("userUid")
    private final long userUid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isFollowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component6() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivestreamOwner copy(long j, String str, String str2, String str3, Boolean bool, List<Integer> list) {
        return new LivestreamOwner(j, str, str2, str3, bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivestreamOwner)) {
            return false;
        }
        LivestreamOwner livestreamOwner = (LivestreamOwner) obj;
        return this.userUid == livestreamOwner.userUid && Intrinsics.EZpvd((Object) this.nickname, (Object) livestreamOwner.nickname) && Intrinsics.EZpvd((Object) this.enNickname, (Object) livestreamOwner.enNickname) && Intrinsics.EZpvd((Object) this.avatar, (Object) livestreamOwner.avatar) && Intrinsics.EZpvd(this.isFollowed, livestreamOwner.isFollowed) && Intrinsics.EZpvd(this.tags, livestreamOwner.tags);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnNickname() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.userUid);
        String str = this.nickname;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.enNickname;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.avatar;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.isFollowed;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        List<Integer> list = this.tags;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFollowed() {
        return this.isFollowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivestreamOwner(userUid=" + this.userUid + ", nickname=" + this.nickname + ", enNickname=" + this.enNickname + ", avatar=" + this.avatar + ", isFollowed=" + this.isFollowed + ", tags=" + this.tags + ")";
    }

    public LivestreamOwner(long j, String str, String str2, String str3, Boolean bool, List<Integer> list) {
        this.userUid = j;
        this.nickname = str;
        this.enNickname = str2;
        this.avatar = str3;
        this.isFollowed = bool;
        this.tags = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (r11v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List<java.lang.Integer>):void (m)] (LINE:125) call: com.okinc.oklive.app.data.model.remote.LivestreamOwner.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ LivestreamOwner(long j, String str, String str2, String str3, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : list);
    }

    public final List<OwnerTagType> getOwnerTagTypes() {
        List<Integer> list = this.tags;
        if (list == null) {
            return yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            OwnerTagType ownerTagTypeKWHzl = OwnerTagType.Companion.KWHzl(((Number) it.next()).intValue());
            if (ownerTagTypeKWHzl != null) {
                arrayList.add(ownerTagTypeKWHzl);
            }
        }
        return arrayList;
    }
}
