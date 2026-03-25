package com.okinc.okimcore.model.im;

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
public final class NickNameNotifyInfo {
    private String memberPetname;
    private String operatorNickname;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NickNameNotifyInfo() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NickNameNotifyInfo copy$default(NickNameNotifyInfo nickNameNotifyInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nickNameNotifyInfo.operatorNickname;
        }
        if ((i & 2) != 0) {
            str2 = nickNameNotifyInfo.memberPetname;
        }
        return nickNameNotifyInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.operatorNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.memberPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NickNameNotifyInfo copy(String str, String str2) {
        return new NickNameNotifyInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NickNameNotifyInfo)) {
            return false;
        }
        NickNameNotifyInfo nickNameNotifyInfo = (NickNameNotifyInfo) obj;
        return Intrinsics.EZpvd((Object) this.operatorNickname, (Object) nickNameNotifyInfo.operatorNickname) && Intrinsics.EZpvd((Object) this.memberPetname, (Object) nickNameNotifyInfo.memberPetname);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemberPetname() {
        return this.memberPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOperatorNickname() {
        return this.operatorNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.operatorNickname;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.memberPetname;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemberPetname(String str) {
        this.memberPetname = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOperatorNickname(String str) {
        this.operatorNickname = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NickNameNotifyInfo(operatorNickname=" + this.operatorNickname + ", memberPetname=" + this.memberPetname + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.NickNameNotifyInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NickNameNotifyInfo> serializer() {
            return NickNameNotifyInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NickNameNotifyInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.operatorNickname = null;
        } else {
            this.operatorNickname = str;
        }
        if ((i & 2) == 0) {
            this.memberPetname = null;
        } else {
            this.memberPetname = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(NickNameNotifyInfo nickNameNotifyInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || nickNameNotifyInfo.operatorNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, nickNameNotifyInfo.operatorNickname);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && nickNameNotifyInfo.memberPetname == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, nickNameNotifyInfo.memberPetname);
    }

    public NickNameNotifyInfo(String str, String str2) {
        this.operatorNickname = str;
        this.memberPetname = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:55) call: com.okinc.okimcore.model.im.NickNameNotifyInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NickNameNotifyInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
