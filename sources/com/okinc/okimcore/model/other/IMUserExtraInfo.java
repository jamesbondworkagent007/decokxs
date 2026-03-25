package com.okinc.okimcore.model.other;

import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
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
public final class IMUserExtraInfo {
    private final String enPetname;
    private final OfficialTagInfo officialTag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IMUserExtraInfo() {
        this((OfficialTagInfo) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IMUserExtraInfo copy$default(IMUserExtraInfo iMUserExtraInfo, OfficialTagInfo officialTagInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            officialTagInfo = iMUserExtraInfo.officialTag;
        }
        if ((i & 2) != 0) {
            str = iMUserExtraInfo.enPetname;
        }
        return iMUserExtraInfo.copy(officialTagInfo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo component1() {
        return this.officialTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.enPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMUserExtraInfo copy(OfficialTagInfo officialTagInfo, String str) {
        return new IMUserExtraInfo(officialTagInfo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMUserExtraInfo)) {
            return false;
        }
        IMUserExtraInfo iMUserExtraInfo = (IMUserExtraInfo) obj;
        return Intrinsics.EZpvd(this.officialTag, iMUserExtraInfo.officialTag) && Intrinsics.EZpvd((Object) this.enPetname, (Object) iMUserExtraInfo.enPetname);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnPetname() {
        return this.enPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo getOfficialTag() {
        return this.officialTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        OfficialTagInfo officialTagInfo = this.officialTag;
        int iHashCode = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        String str = this.enPetname;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IMUserExtraInfo(officialTag=" + this.officialTag + ", enPetname=" + this.enPetname + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.IMUserExtraInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IMUserExtraInfo> serializer() {
            return IMUserExtraInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IMUserExtraInfo(int i, OfficialTagInfo officialTagInfo, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.officialTag = null;
        } else {
            this.officialTag = officialTagInfo;
        }
        if ((i & 2) == 0) {
            this.enPetname = null;
        } else {
            this.enPetname = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(IMUserExtraInfo iMUserExtraInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || iMUserExtraInfo.officialTag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, OfficialTagInfo$$serializer.INSTANCE, iMUserExtraInfo.officialTag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && iMUserExtraInfo.enPetname == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, iMUserExtraInfo.enPetname);
    }

    public IMUserExtraInfo(OfficialTagInfo officialTagInfo, String str) {
        this.officialTag = officialTagInfo;
        this.enPetname = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.remote.OfficialTagInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.OfficialTagInfo) : (r2v0 com.okinc.okimcore.model.remote.OfficialTagInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.String):void (m)] (LINE:9) call: com.okinc.okimcore.model.other.IMUserExtraInfo.<init>(com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.String):void type: THIS */
    public /* synthetic */ IMUserExtraInfo(OfficialTagInfo officialTagInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : officialTagInfo, (i & 2) != 0 ? null : str);
    }
}
