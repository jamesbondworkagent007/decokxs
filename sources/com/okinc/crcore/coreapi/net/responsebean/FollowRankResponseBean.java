package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class FollowRankResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String followerLimit;
    private final String followerNum;
    private final String nickName;
    private final String portrait;
    private final String targetId;
    private final String uniqueName;
    private final String yieldRatio;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FollowRankResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FollowRankResponseBean copy$default(FollowRankResponseBean followRankResponseBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = followRankResponseBean.uniqueName;
        }
        if ((i & 2) != 0) {
            str2 = followRankResponseBean.nickName;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = followRankResponseBean.portrait;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = followRankResponseBean.targetId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = followRankResponseBean.followerNum;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = followRankResponseBean.followerLimit;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = followRankResponseBean.yieldRatio;
        }
        return followRankResponseBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.followerNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.followerLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.yieldRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FollowRankResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new FollowRankResponseBean(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowRankResponseBean)) {
            return false;
        }
        FollowRankResponseBean followRankResponseBean = (FollowRankResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.uniqueName, (Object) followRankResponseBean.uniqueName) && Intrinsics.EZpvd((Object) this.nickName, (Object) followRankResponseBean.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) followRankResponseBean.portrait) && Intrinsics.EZpvd((Object) this.targetId, (Object) followRankResponseBean.targetId) && Intrinsics.EZpvd((Object) this.followerNum, (Object) followRankResponseBean.followerNum) && Intrinsics.EZpvd((Object) this.followerLimit, (Object) followRankResponseBean.followerLimit) && Intrinsics.EZpvd((Object) this.yieldRatio, (Object) followRankResponseBean.yieldRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerLimit() {
        return this.followerLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerNum() {
        return this.followerNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortrait() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYieldRatio() {
        return this.yieldRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.uniqueName.hashCode() * 31) + this.nickName.hashCode()) * 31) + this.portrait.hashCode()) * 31) + this.targetId.hashCode()) * 31) + this.followerNum.hashCode()) * 31) + this.followerLimit.hashCode()) * 31) + this.yieldRatio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FollowRankResponseBean(uniqueName=" + this.uniqueName + ", nickName=" + this.nickName + ", portrait=" + this.portrait + ", targetId=" + this.targetId + ", followerNum=" + this.followerNum + ", followerLimit=" + this.followerLimit + ", yieldRatio=" + this.yieldRatio + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.FollowRankResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FollowRankResponseBean> serializer() {
            return FollowRankResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FollowRankResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.uniqueName = "";
        } else {
            this.uniqueName = str;
        }
        if ((i & 2) == 0) {
            this.nickName = "";
        } else {
            this.nickName = str2;
        }
        if ((i & 4) == 0) {
            this.portrait = "";
        } else {
            this.portrait = str3;
        }
        if ((i & 8) == 0) {
            this.targetId = "";
        } else {
            this.targetId = str4;
        }
        if ((i & 16) == 0) {
            this.followerNum = "";
        } else {
            this.followerNum = str5;
        }
        if ((i & 32) == 0) {
            this.followerLimit = "";
        } else {
            this.followerLimit = str6;
        }
        if ((i & 64) == 0) {
            this.yieldRatio = "";
        } else {
            this.yieldRatio = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FollowRankResponseBean followRankResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) followRankResponseBean.uniqueName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, followRankResponseBean.uniqueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) followRankResponseBean.nickName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, followRankResponseBean.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) followRankResponseBean.portrait, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, followRankResponseBean.portrait);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) followRankResponseBean.targetId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, followRankResponseBean.targetId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) followRankResponseBean.followerNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, followRankResponseBean.followerNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) followRankResponseBean.followerLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, followRankResponseBean.followerLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) followRankResponseBean.yieldRatio, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, followRankResponseBean.yieldRatio);
    }

    public FollowRankResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.uniqueName = str;
        this.nickName = str2;
        this.portrait = str3;
        this.targetId = str4;
        this.followerNum = str5;
        this.followerLimit = str6;
        this.yieldRatio = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:17) call: com.okinc.crcore.coreapi.net.responsebean.FollowRankResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FollowRankResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
