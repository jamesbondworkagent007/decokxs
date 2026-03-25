package com.okinc.business.market.data.model.smart_money;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalAlertItemData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long eventTime;
    public final String marketCap;
    public final String price;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalAlertItemData copy$default(SignalAlertItemData signalAlertItemData, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = signalAlertItemData.eventTime;
        }
        if ((i & 2) != 0) {
            str = signalAlertItemData.marketCap;
        }
        if ((i & 4) != 0) {
            str2 = signalAlertItemData.price;
        }
        return signalAlertItemData.EZpvd(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalAlertItemData EZpvd(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SignalAlertItemData(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalAlertItemData)) {
            return false;
        }
        SignalAlertItemData signalAlertItemData = (SignalAlertItemData) obj;
        return this.eventTime == signalAlertItemData.eventTime && Intrinsics.EZpvd((Object) this.marketCap, (Object) signalAlertItemData.marketCap) && Intrinsics.EZpvd((Object) this.price, (Object) signalAlertItemData.price);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.eventTime) * 31) + this.marketCap.hashCode()) * 31) + this.price.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalAlertItemData(eventTime=" + this.eventTime + ", marketCap=" + this.marketCap + ", price=" + this.price + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalAlertItemData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalAlertItemData> serializer() {
            return SignalAlertItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalAlertItemData(int i, long j, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SignalAlertItemData$$serializer.INSTANCE.getDescriptor());
        }
        this.eventTime = j;
        if ((i & 2) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str;
        }
        if ((i & 4) == 0) {
            this.price = "";
        } else {
            this.price = str2;
        }
    }

    public static final /* synthetic */ void AEQbTJ(SignalAlertItemData signalAlertItemData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, signalAlertItemData.eventTime);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signalAlertItemData.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signalAlertItemData.marketCap);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) signalAlertItemData.price, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, signalAlertItemData.price);
    }

    public SignalAlertItemData(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.eventTime = j;
        this.marketCap = str;
        this.price = str2;
    }
}
