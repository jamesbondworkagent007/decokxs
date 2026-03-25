package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMCtaInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String campaignEndTime;
    private final String campaignStartTime;
    private final InHouseIMCtaIcon icon;
    private final String link;
    private final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMCtaInfo() {
        this((String) null, (String) null, (InHouseIMCtaIcon) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMCtaInfo copy$default(InHouseIMCtaInfo inHouseIMCtaInfo, String str, String str2, InHouseIMCtaIcon inHouseIMCtaIcon, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inHouseIMCtaInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = inHouseIMCtaInfo.link;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            inHouseIMCtaIcon = inHouseIMCtaInfo.icon;
        }
        InHouseIMCtaIcon inHouseIMCtaIcon2 = inHouseIMCtaIcon;
        if ((i & 8) != 0) {
            str3 = inHouseIMCtaInfo.campaignStartTime;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = inHouseIMCtaInfo.campaignEndTime;
        }
        return inHouseIMCtaInfo.copy(str, str5, inHouseIMCtaIcon2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMCtaIcon component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.campaignStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.campaignEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMCtaInfo copy(String str, String str2, InHouseIMCtaIcon inHouseIMCtaIcon, String str3, String str4) {
        return new InHouseIMCtaInfo(str, str2, inHouseIMCtaIcon, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMCtaInfo)) {
            return false;
        }
        InHouseIMCtaInfo inHouseIMCtaInfo = (InHouseIMCtaInfo) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) inHouseIMCtaInfo.name) && Intrinsics.EZpvd((Object) this.link, (Object) inHouseIMCtaInfo.link) && Intrinsics.EZpvd(this.icon, inHouseIMCtaInfo.icon) && Intrinsics.EZpvd((Object) this.campaignStartTime, (Object) inHouseIMCtaInfo.campaignStartTime) && Intrinsics.EZpvd((Object) this.campaignEndTime, (Object) inHouseIMCtaInfo.campaignEndTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCampaignEndTime() {
        return this.campaignEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCampaignStartTime() {
        return this.campaignStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMCtaIcon getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLink() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.name;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.link;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        InHouseIMCtaIcon inHouseIMCtaIcon = this.icon;
        int iHashCode3 = inHouseIMCtaIcon == null ? 0 : inHouseIMCtaIcon.hashCode();
        String str3 = this.campaignStartTime;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.campaignEndTime;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMCtaInfo(name=" + this.name + ", link=" + this.link + ", icon=" + this.icon + ", campaignStartTime=" + this.campaignStartTime + ", campaignEndTime=" + this.campaignEndTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMCtaInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMCtaInfo> serializer() {
            return InHouseIMCtaInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMCtaInfo(int i, String str, String str2, InHouseIMCtaIcon inHouseIMCtaIcon, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.link = null;
        } else {
            this.link = str2;
        }
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = inHouseIMCtaIcon;
        }
        if ((i & 8) == 0) {
            this.campaignStartTime = null;
        } else {
            this.campaignStartTime = str3;
        }
        if ((i & 16) == 0) {
            this.campaignEndTime = null;
        } else {
            this.campaignEndTime = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMCtaInfo inHouseIMCtaInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inHouseIMCtaInfo.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inHouseIMCtaInfo.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMCtaInfo.link != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inHouseIMCtaInfo.link);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inHouseIMCtaInfo.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, InHouseIMCtaIcon$$serializer.INSTANCE, inHouseIMCtaInfo.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMCtaInfo.campaignStartTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, inHouseIMCtaInfo.campaignStartTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && inHouseIMCtaInfo.campaignEndTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, inHouseIMCtaInfo.campaignEndTime);
    }

    public InHouseIMCtaInfo(String str, String str2, InHouseIMCtaIcon inHouseIMCtaIcon, String str3, String str4) {
        this.name = str;
        this.link = str2;
        this.icon = inHouseIMCtaIcon;
        this.campaignStartTime = str3;
        this.campaignEndTime = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.remote.InHouseIMCtaIcon:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.InHouseIMCtaIcon) : (r7v0 com.okinc.okimcore.model.remote.InHouseIMCtaIcon))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.InHouseIMCtaIcon, java.lang.String, java.lang.String):void (m)] (LINE:187) call: com.okinc.okimcore.model.remote.InHouseIMCtaInfo.<init>(java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.InHouseIMCtaIcon, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InHouseIMCtaInfo(String str, String str2, InHouseIMCtaIcon inHouseIMCtaIcon, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : inHouseIMCtaIcon, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
