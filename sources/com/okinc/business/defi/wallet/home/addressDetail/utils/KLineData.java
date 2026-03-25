package com.okinc.business.defi.wallet.home.addressDetail.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class KLineData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String assetAmount;
    private final String dateTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KLineData copy$default(KLineData kLineData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kLineData.dateTime;
        }
        if ((i & 2) != 0) {
            str2 = kLineData.assetAmount;
        }
        return kLineData.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KLineData copy(String str, String str2) {
        return new KLineData(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KLineData)) {
            return false;
        }
        KLineData kLineData = (KLineData) obj;
        return Intrinsics.EZpvd((Object) this.dateTime, (Object) kLineData.dateTime) && Intrinsics.EZpvd((Object) this.assetAmount, (Object) kLineData.assetAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetAmount() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDateTime() {
        return this.dateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.dateTime;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.assetAmount;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KLineData(dateTime=" + this.dateTime + ", assetAmount=" + this.assetAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.addressDetail.utils.KLineData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KLineData> serializer() {
            return KLineData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KLineData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, KLineData$$serializer.INSTANCE.getDescriptor());
        }
        this.dateTime = str;
        this.assetAmount = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(KLineData kLineData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, kLineData.dateTime);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, kLineData.assetAmount);
    }

    public KLineData(String str, String str2) {
        this.dateTime = str;
        this.assetAmount = str2;
    }
}
