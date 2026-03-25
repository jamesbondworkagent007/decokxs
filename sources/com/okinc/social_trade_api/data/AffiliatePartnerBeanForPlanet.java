package com.okinc.social_trade_api.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AffiliatePartnerBeanForPlanet {
    private final int currentNum;
    private final int maxNum;
    private final List<PartnerInfoForPlanet> partnerList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PartnerInfoForPlanet$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.social_trade_api.data.AffiliatePartnerBeanForPlanet */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AffiliatePartnerBeanForPlanet copy$default(AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = affiliatePartnerBeanForPlanet.partnerList;
        }
        if ((i3 & 2) != 0) {
            i = affiliatePartnerBeanForPlanet.currentNum;
        }
        if ((i3 & 4) != 0) {
            i2 = affiliatePartnerBeanForPlanet.maxNum;
        }
        return affiliatePartnerBeanForPlanet.copy(list, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PartnerInfoForPlanet> component1() {
        return this.partnerList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.currentNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.maxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AffiliatePartnerBeanForPlanet copy(@NotNull List<PartnerInfoForPlanet> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new AffiliatePartnerBeanForPlanet(list, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AffiliatePartnerBeanForPlanet)) {
            return false;
        }
        AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet = (AffiliatePartnerBeanForPlanet) obj;
        return Intrinsics.EZpvd(this.partnerList, affiliatePartnerBeanForPlanet.partnerList) && this.currentNum == affiliatePartnerBeanForPlanet.currentNum && this.maxNum == affiliatePartnerBeanForPlanet.maxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentNum() {
        return this.currentNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxNum() {
        return this.maxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PartnerInfoForPlanet> getPartnerList() {
        return this.partnerList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.partnerList.hashCode() * 31) + Integer.hashCode(this.currentNum)) * 31) + Integer.hashCode(this.maxNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AffiliatePartnerBeanForPlanet(partnerList=" + this.partnerList + ", currentNum=" + this.currentNum + ", maxNum=" + this.maxNum + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.AffiliatePartnerBeanForPlanet.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AffiliatePartnerBeanForPlanet> serializer() {
            return AffiliatePartnerBeanForPlanet$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AffiliatePartnerBeanForPlanet(int i, List list, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AffiliatePartnerBeanForPlanet$$serializer.INSTANCE.getDescriptor());
        }
        this.partnerList = list;
        this.currentNum = i2;
        this.maxNum = i3;
    }

    public static final /* synthetic */ void write$Self$OKSocialTrading_trading_eco_api(AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], affiliatePartnerBeanForPlanet.partnerList);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, affiliatePartnerBeanForPlanet.currentNum);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, affiliatePartnerBeanForPlanet.maxNum);
    }

    public AffiliatePartnerBeanForPlanet(@NotNull List<PartnerInfoForPlanet> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.partnerList = list;
        this.currentNum = i;
        this.maxNum = i2;
    }
}
