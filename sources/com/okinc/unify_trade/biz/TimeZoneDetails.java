package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TimeZoneDetails {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String userDownloadTimeZone;
    private final String userTimeZone;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TimeZoneDetails copy$default(TimeZoneDetails timeZoneDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timeZoneDetails.userDownloadTimeZone;
        }
        if ((i & 2) != 0) {
            str2 = timeZoneDetails.userTimeZone;
        }
        return timeZoneDetails.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userDownloadTimeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userTimeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeZoneDetails copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TimeZoneDetails(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeZoneDetails)) {
            return false;
        }
        TimeZoneDetails timeZoneDetails = (TimeZoneDetails) obj;
        return Intrinsics.EZpvd((Object) this.userDownloadTimeZone, (Object) timeZoneDetails.userDownloadTimeZone) && Intrinsics.EZpvd((Object) this.userTimeZone, (Object) timeZoneDetails.userTimeZone);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserDownloadTimeZone() {
        return this.userDownloadTimeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserTimeZone() {
        return this.userTimeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.userDownloadTimeZone.hashCode() * 31) + this.userTimeZone.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TimeZoneDetails(userDownloadTimeZone=" + this.userDownloadTimeZone + ", userTimeZone=" + this.userTimeZone + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TimeZoneDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TimeZoneDetails> serializer() {
            return TimeZoneDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TimeZoneDetails(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TimeZoneDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.userDownloadTimeZone = str;
        this.userTimeZone = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TimeZoneDetails timeZoneDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, timeZoneDetails.userDownloadTimeZone);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, timeZoneDetails.userTimeZone);
    }

    public TimeZoneDetails(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.userDownloadTimeZone = str;
        this.userTimeZone = str2;
    }
}
