package com.okinc.okex.common.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SiteInfoBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final RegionDetails regionDetails;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SiteInfoBean() {
        this((RegionDetails) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SiteInfoBean copy$default(SiteInfoBean siteInfoBean, RegionDetails regionDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            regionDetails = siteInfoBean.regionDetails;
        }
        return siteInfoBean.copy(regionDetails);
    }

    @SerialName("regionDetails")
    public static /* synthetic */ void getRegionDetails$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegionDetails component1() {
        return this.regionDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SiteInfoBean copy(RegionDetails regionDetails) {
        return new SiteInfoBean(regionDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SiteInfoBean) && Intrinsics.EZpvd(this.regionDetails, ((SiteInfoBean) obj).regionDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegionDetails getRegionDetails() {
        return this.regionDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        RegionDetails regionDetails = this.regionDetails;
        if (regionDetails == null) {
            return 0;
        }
        return regionDetails.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SiteInfoBean(regionDetails=" + this.regionDetails + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.bean.SiteInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SiteInfoBean> serializer() {
            return SiteInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SiteInfoBean(int i, RegionDetails regionDetails, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.regionDetails = null;
        } else {
            this.regionDetails = regionDetails;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SiteInfoBean siteInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && siteInfoBean.regionDetails == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, RegionDetails$$serializer.INSTANCE, siteInfoBean.regionDetails);
    }

    public SiteInfoBean(RegionDetails regionDetails) {
        this.regionDetails = regionDetails;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.okex.common.bean.RegionDetails:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.common.bean.RegionDetails) : (r1v0 com.okinc.okex.common.bean.RegionDetails))
 A[MD:(com.okinc.okex.common.bean.RegionDetails):void (m)] (LINE:9) call: com.okinc.okex.common.bean.SiteInfoBean.<init>(com.okinc.okex.common.bean.RegionDetails):void type: THIS */
    public /* synthetic */ SiteInfoBean(RegionDetails regionDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : regionDetails);
    }
}
