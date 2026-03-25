package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class LiteTransactionDownloadResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final Long id;
    public final Integer status;
    public final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiteTransactionDownloadResponseBean() {
        this((Long) null, (Integer) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiteTransactionDownloadResponseBean copy$default(LiteTransactionDownloadResponseBean liteTransactionDownloadResponseBean, Long l, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = liteTransactionDownloadResponseBean.id;
        }
        if ((i & 2) != 0) {
            num = liteTransactionDownloadResponseBean.status;
        }
        if ((i & 4) != 0) {
            str = liteTransactionDownloadResponseBean.url;
        }
        return liteTransactionDownloadResponseBean.AEQbTJ(l, num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiteTransactionDownloadResponseBean AEQbTJ(Long l, Integer num, String str) {
        return new LiteTransactionDownloadResponseBean(l, num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiteTransactionDownloadResponseBean)) {
            return false;
        }
        LiteTransactionDownloadResponseBean liteTransactionDownloadResponseBean = (LiteTransactionDownloadResponseBean) obj;
        return Intrinsics.EZpvd(this.id, liteTransactionDownloadResponseBean.id) && Intrinsics.EZpvd(this.status, liteTransactionDownloadResponseBean.status) && Intrinsics.EZpvd((Object) this.url, (Object) liteTransactionDownloadResponseBean.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.id;
        int iHashCode = l == null ? 0 : l.hashCode();
        Integer num = this.status;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.url;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiteTransactionDownloadResponseBean(id=" + this.id + ", status=" + this.status + ", url=" + this.url + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.LiteTransactionDownloadResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiteTransactionDownloadResponseBean> serializer() {
            return LiteTransactionDownloadResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiteTransactionDownloadResponseBean(int i, Long l, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = l;
        }
        if ((i & 2) == 0) {
            this.status = null;
        } else {
            this.status = num;
        }
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
    }

    public static final /* synthetic */ void AEQbTJ(LiteTransactionDownloadResponseBean liteTransactionDownloadResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || liteTransactionDownloadResponseBean.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, liteTransactionDownloadResponseBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || liteTransactionDownloadResponseBean.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, liteTransactionDownloadResponseBean.status);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && liteTransactionDownloadResponseBean.url == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, liteTransactionDownloadResponseBean.url);
    }

    public LiteTransactionDownloadResponseBean(Long l, Integer num, String str) {
        this.id = l;
        this.status = num;
        this.url = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.Integer, java.lang.String):void (m)] (LINE:7) call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.LiteTransactionDownloadResponseBean.<init>(java.lang.Long, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ LiteTransactionDownloadResponseBean(Long l, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }
}
