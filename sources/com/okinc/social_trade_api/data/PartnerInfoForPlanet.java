package com.okinc.social_trade_api.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class PartnerInfoForPlanet {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String nickName;
    private final String partnerUid;
    private final String portrait;
    private final String targetId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PartnerInfoForPlanet copy$default(PartnerInfoForPlanet partnerInfoForPlanet, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerInfoForPlanet.nickName;
        }
        if ((i & 2) != 0) {
            str2 = partnerInfoForPlanet.portrait;
        }
        if ((i & 4) != 0) {
            str3 = partnerInfoForPlanet.targetId;
        }
        if ((i & 8) != 0) {
            str4 = partnerInfoForPlanet.partnerUid;
        }
        return partnerInfoForPlanet.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.partnerUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PartnerInfoForPlanet copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new PartnerInfoForPlanet(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartnerInfoForPlanet)) {
            return false;
        }
        PartnerInfoForPlanet partnerInfoForPlanet = (PartnerInfoForPlanet) obj;
        return Intrinsics.EZpvd((Object) this.nickName, (Object) partnerInfoForPlanet.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) partnerInfoForPlanet.portrait) && Intrinsics.EZpvd((Object) this.targetId, (Object) partnerInfoForPlanet.targetId) && Intrinsics.EZpvd((Object) this.partnerUid, (Object) partnerInfoForPlanet.partnerUid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPartnerUid() {
        return this.partnerUid;
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
    public int hashCode() {
        return (((((this.nickName.hashCode() * 31) + this.portrait.hashCode()) * 31) + this.targetId.hashCode()) * 31) + this.partnerUid.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PartnerInfoForPlanet(nickName=" + this.nickName + ", portrait=" + this.portrait + ", targetId=" + this.targetId + ", partnerUid=" + this.partnerUid + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.PartnerInfoForPlanet.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PartnerInfoForPlanet> serializer() {
            return PartnerInfoForPlanet$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PartnerInfoForPlanet(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, PartnerInfoForPlanet$$serializer.INSTANCE.getDescriptor());
        }
        this.nickName = str;
        this.portrait = str2;
        this.targetId = str3;
        this.partnerUid = str4;
    }

    public static final /* synthetic */ void write$Self$OKSocialTrading_trading_eco_api(PartnerInfoForPlanet partnerInfoForPlanet, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, partnerInfoForPlanet.nickName);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, partnerInfoForPlanet.portrait);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, partnerInfoForPlanet.targetId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, partnerInfoForPlanet.partnerUid);
    }

    public PartnerInfoForPlanet(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.nickName = str;
        this.portrait = str2;
        this.targetId = str3;
        this.partnerUid = str4;
    }
}
