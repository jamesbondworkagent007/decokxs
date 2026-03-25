package com.okinc.crcore.coreapi.net.responsebean.dex;

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
public final class DappInsightsSummaryResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int beta;
    private final SummaryDetail summaryDetail;
    private final String taskId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappInsightsSummaryResponseBean() {
        this(0, (SummaryDetail) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DappInsightsSummaryResponseBean copy$default(DappInsightsSummaryResponseBean dappInsightsSummaryResponseBean, int i, SummaryDetail summaryDetail, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dappInsightsSummaryResponseBean.beta;
        }
        if ((i2 & 2) != 0) {
            summaryDetail = dappInsightsSummaryResponseBean.summaryDetail;
        }
        if ((i2 & 4) != 0) {
            str = dappInsightsSummaryResponseBean.taskId;
        }
        return dappInsightsSummaryResponseBean.copy(i, summaryDetail, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.beta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SummaryDetail component2() {
        return this.summaryDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.taskId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappInsightsSummaryResponseBean copy(int i, @NotNull SummaryDetail summaryDetail, @NotNull String str) {
        Intrinsics.checkNotNullParameter(summaryDetail, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new DappInsightsSummaryResponseBean(i, summaryDetail, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DappInsightsSummaryResponseBean)) {
            return false;
        }
        DappInsightsSummaryResponseBean dappInsightsSummaryResponseBean = (DappInsightsSummaryResponseBean) obj;
        return this.beta == dappInsightsSummaryResponseBean.beta && Intrinsics.EZpvd(this.summaryDetail, dappInsightsSummaryResponseBean.summaryDetail) && Intrinsics.EZpvd((Object) this.taskId, (Object) dappInsightsSummaryResponseBean.taskId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBeta() {
        return this.beta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SummaryDetail getSummaryDetail() {
        return this.summaryDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTaskId() {
        return this.taskId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.beta) * 31) + this.summaryDetail.hashCode()) * 31) + this.taskId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappInsightsSummaryResponseBean(beta=" + this.beta + ", summaryDetail=" + this.summaryDetail + ", taskId=" + this.taskId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.DappInsightsSummaryResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappInsightsSummaryResponseBean> serializer() {
            return DappInsightsSummaryResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappInsightsSummaryResponseBean(int i, int i2, SummaryDetail summaryDetail, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.beta = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.summaryDetail = new SummaryDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.summaryDetail = summaryDetail;
        }
        if ((i & 4) == 0) {
            this.taskId = "";
        } else {
            this.taskId = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DappInsightsSummaryResponseBean dappInsightsSummaryResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dappInsightsSummaryResponseBean.beta != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, dappInsightsSummaryResponseBean.beta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(dappInsightsSummaryResponseBean.summaryDetail, new SummaryDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, SummaryDetail$$serializer.INSTANCE, dappInsightsSummaryResponseBean.summaryDetail);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) dappInsightsSummaryResponseBean.taskId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dappInsightsSummaryResponseBean.taskId);
    }

    public DappInsightsSummaryResponseBean(int i, @NotNull SummaryDetail summaryDetail, @NotNull String str) {
        Intrinsics.checkNotNullParameter(summaryDetail, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.beta = i;
        this.summaryDetail = summaryDetail;
        this.taskId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.SummaryDetail:?: TERNARY null = ((wrap:int:0x0005: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.SummaryDetail:0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.dex.SummaryDetail.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 com.okinc.crcore.coreapi.net.responsebean.dex.SummaryDetail))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(int, com.okinc.crcore.coreapi.net.responsebean.dex.SummaryDetail, java.lang.String):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.dex.DappInsightsSummaryResponseBean.<init>(int, com.okinc.crcore.coreapi.net.responsebean.dex.SummaryDetail, java.lang.String):void type: THIS */
    public /* synthetic */ DappInsightsSummaryResponseBean(int i, SummaryDetail summaryDetail, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new SummaryDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : summaryDetail, (i2 & 4) != 0 ? "" : str);
    }
}
