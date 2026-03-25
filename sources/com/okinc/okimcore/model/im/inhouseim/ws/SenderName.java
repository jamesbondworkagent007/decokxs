package com.okinc.okimcore.model.im.inhouseim.ws;

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
public final class SenderName {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String avatar;
    private final String enNickname;
    private final String nickname;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SenderName() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SenderName copy$default(SenderName senderName, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = senderName.nickname;
        }
        if ((i & 2) != 0) {
            str2 = senderName.enNickname;
        }
        if ((i & 4) != 0) {
            str3 = senderName.avatar;
        }
        return senderName.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SenderName copy(String str, String str2, String str3) {
        return new SenderName(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SenderName)) {
            return false;
        }
        SenderName senderName = (SenderName) obj;
        return Intrinsics.EZpvd((Object) this.nickname, (Object) senderName.nickname) && Intrinsics.EZpvd((Object) this.enNickname, (Object) senderName.enNickname) && Intrinsics.EZpvd((Object) this.avatar, (Object) senderName.avatar);
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
    public int hashCode() {
        String str = this.nickname;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.enNickname;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.avatar;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SenderName(nickname=" + this.nickname + ", enNickname=" + this.enNickname + ", avatar=" + this.avatar + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.SenderName.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SenderName> serializer() {
            return SenderName$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SenderName(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str;
        }
        if ((i & 2) == 0) {
            this.enNickname = null;
        } else {
            this.enNickname = str2;
        }
        if ((i & 4) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(SenderName senderName, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || senderName.nickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, senderName.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || senderName.enNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, senderName.enNickname);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && senderName.avatar == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, senderName.avatar);
    }

    public SenderName(String str, String str2, String str3) {
        this.nickname = str;
        this.enNickname = str2;
        this.avatar = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:63) call: com.okinc.okimcore.model.im.inhouseim.ws.SenderName.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SenderName(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
