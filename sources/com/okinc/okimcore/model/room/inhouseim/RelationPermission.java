package com.okinc.okimcore.model.room.inhouseim;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class RelationPermission {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean addContact;
    private final Boolean allowBlockUser;
    private final Boolean allowFile;
    private final Boolean allowPay;
    private final Boolean allowPlanetProfile;
    private final Boolean allowRemoveGroupMember;
    private final Boolean allowVoice;
    private final Boolean isAllowSendMessage;
    private final Boolean isAllowSingleChatInGroup;
    private final Boolean showKycBanner;
    private final Boolean showUnknownContactBanner;
    private final Boolean showVipPerformanceDetails;
    private final Boolean voiceCall;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RelationPermission() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.voiceCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.allowBlockUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.showVipPerformanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.allowRemoveGroupMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.allowPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.addContact;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isAllowSendMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.showKycBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isAllowSingleChatInGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.showUnknownContactBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.allowVoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.allowFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.allowPlanetProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationPermission copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13) {
        return new RelationPermission(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelationPermission)) {
            return false;
        }
        RelationPermission relationPermission = (RelationPermission) obj;
        return Intrinsics.EZpvd(this.voiceCall, relationPermission.voiceCall) && Intrinsics.EZpvd(this.addContact, relationPermission.addContact) && Intrinsics.EZpvd(this.isAllowSendMessage, relationPermission.isAllowSendMessage) && Intrinsics.EZpvd(this.showKycBanner, relationPermission.showKycBanner) && Intrinsics.EZpvd(this.isAllowSingleChatInGroup, relationPermission.isAllowSingleChatInGroup) && Intrinsics.EZpvd(this.showUnknownContactBanner, relationPermission.showUnknownContactBanner) && Intrinsics.EZpvd(this.allowVoice, relationPermission.allowVoice) && Intrinsics.EZpvd(this.allowFile, relationPermission.allowFile) && Intrinsics.EZpvd(this.allowPlanetProfile, relationPermission.allowPlanetProfile) && Intrinsics.EZpvd(this.allowBlockUser, relationPermission.allowBlockUser) && Intrinsics.EZpvd(this.showVipPerformanceDetails, relationPermission.showVipPerformanceDetails) && Intrinsics.EZpvd(this.allowRemoveGroupMember, relationPermission.allowRemoveGroupMember) && Intrinsics.EZpvd(this.allowPay, relationPermission.allowPay);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAddContact() {
        return this.addContact;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowBlockUser() {
        return this.allowBlockUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowFile() {
        return this.allowFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowPay() {
        return this.allowPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowPlanetProfile() {
        return this.allowPlanetProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowRemoveGroupMember() {
        return this.allowRemoveGroupMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowVoice() {
        return this.allowVoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowKycBanner() {
        return this.showKycBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowUnknownContactBanner() {
        return this.showUnknownContactBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowVipPerformanceDetails() {
        return this.showVipPerformanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getVoiceCall() {
        return this.voiceCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.voiceCall;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.addContact;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isAllowSendMessage;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.showKycBanner;
        int iHashCode4 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.isAllowSingleChatInGroup;
        int iHashCode5 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.showUnknownContactBanner;
        int iHashCode6 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.allowVoice;
        int iHashCode7 = bool7 == null ? 0 : bool7.hashCode();
        Boolean bool8 = this.allowFile;
        int iHashCode8 = bool8 == null ? 0 : bool8.hashCode();
        Boolean bool9 = this.allowPlanetProfile;
        int iHashCode9 = bool9 == null ? 0 : bool9.hashCode();
        Boolean bool10 = this.allowBlockUser;
        int iHashCode10 = bool10 == null ? 0 : bool10.hashCode();
        Boolean bool11 = this.showVipPerformanceDetails;
        int iHashCode11 = bool11 == null ? 0 : bool11.hashCode();
        Boolean bool12 = this.allowRemoveGroupMember;
        int iHashCode12 = bool12 == null ? 0 : bool12.hashCode();
        Boolean bool13 = this.allowPay;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool13 != null ? bool13.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isAllowSendMessage() {
        return this.isAllowSendMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isAllowSingleChatInGroup() {
        return this.isAllowSingleChatInGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RelationPermission(voiceCall=" + this.voiceCall + ", addContact=" + this.addContact + ", isAllowSendMessage=" + this.isAllowSendMessage + ", showKycBanner=" + this.showKycBanner + ", isAllowSingleChatInGroup=" + this.isAllowSingleChatInGroup + ", showUnknownContactBanner=" + this.showUnknownContactBanner + ", allowVoice=" + this.allowVoice + ", allowFile=" + this.allowFile + ", allowPlanetProfile=" + this.allowPlanetProfile + ", allowBlockUser=" + this.allowBlockUser + ", showVipPerformanceDetails=" + this.showVipPerformanceDetails + ", allowRemoveGroupMember=" + this.allowRemoveGroupMember + ", allowPay=" + this.allowPay + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.RelationPermission.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RelationPermission> serializer() {
            return RelationPermission$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RelationPermission(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.voiceCall = null;
        } else {
            this.voiceCall = bool;
        }
        if ((i & 2) == 0) {
            this.addContact = null;
        } else {
            this.addContact = bool2;
        }
        if ((i & 4) == 0) {
            this.isAllowSendMessage = null;
        } else {
            this.isAllowSendMessage = bool3;
        }
        if ((i & 8) == 0) {
            this.showKycBanner = null;
        } else {
            this.showKycBanner = bool4;
        }
        if ((i & 16) == 0) {
            this.isAllowSingleChatInGroup = null;
        } else {
            this.isAllowSingleChatInGroup = bool5;
        }
        if ((i & 32) == 0) {
            this.showUnknownContactBanner = null;
        } else {
            this.showUnknownContactBanner = bool6;
        }
        if ((i & 64) == 0) {
            this.allowVoice = null;
        } else {
            this.allowVoice = bool7;
        }
        if ((i & 128) == 0) {
            this.allowFile = null;
        } else {
            this.allowFile = bool8;
        }
        if ((i & 256) == 0) {
            this.allowPlanetProfile = null;
        } else {
            this.allowPlanetProfile = bool9;
        }
        if ((i & 512) == 0) {
            this.allowBlockUser = null;
        } else {
            this.allowBlockUser = bool10;
        }
        if ((i & 1024) == 0) {
            this.showVipPerformanceDetails = null;
        } else {
            this.showVipPerformanceDetails = bool11;
        }
        if ((i & 2048) == 0) {
            this.allowRemoveGroupMember = null;
        } else {
            this.allowRemoveGroupMember = bool12;
        }
        if ((i & 4096) == 0) {
            this.allowPay = null;
        } else {
            this.allowPay = bool13;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(RelationPermission relationPermission, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || relationPermission.voiceCall != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, relationPermission.voiceCall);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || relationPermission.addContact != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, relationPermission.addContact);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || relationPermission.isAllowSendMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, relationPermission.isAllowSendMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || relationPermission.showKycBanner != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, relationPermission.showKycBanner);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || relationPermission.isAllowSingleChatInGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, relationPermission.isAllowSingleChatInGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || relationPermission.showUnknownContactBanner != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, relationPermission.showUnknownContactBanner);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || relationPermission.allowVoice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, relationPermission.allowVoice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || relationPermission.allowFile != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, relationPermission.allowFile);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || relationPermission.allowPlanetProfile != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, relationPermission.allowPlanetProfile);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || relationPermission.allowBlockUser != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, relationPermission.allowBlockUser);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || relationPermission.showVipPerformanceDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, relationPermission.showVipPerformanceDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || relationPermission.allowRemoveGroupMember != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, relationPermission.allowRemoveGroupMember);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && relationPermission.allowPay == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, relationPermission.allowPay);
    }

    public RelationPermission(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13) {
        this.voiceCall = bool;
        this.addContact = bool2;
        this.isAllowSendMessage = bool3;
        this.showKycBanner = bool4;
        this.isAllowSingleChatInGroup = bool5;
        this.showUnknownContactBanner = bool6;
        this.allowVoice = bool7;
        this.allowFile = bool8;
        this.allowPlanetProfile = bool9;
        this.allowBlockUser = bool10;
        this.showVipPerformanceDetails = bool11;
        this.allowRemoveGroupMember = bool12;
        this.allowPay = bool13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0084: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005a: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:54) call: com.okinc.okimcore.model.room.inhouseim.RelationPermission.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ RelationPermission(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : bool6, (i & 64) != 0 ? null : bool7, (i & 128) != 0 ? null : bool8, (i & 256) != 0 ? null : bool9, (i & 512) != 0 ? null : bool10, (i & 1024) != 0 ? null : bool11, (i & 2048) != 0 ? null : bool12, (i & 4096) == 0 ? bool13 : null);
    }
}
