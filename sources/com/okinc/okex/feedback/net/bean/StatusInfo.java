package com.okinc.okex.feedback.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class StatusInfo {
    private final String name;
    private final Long updateDate;
    private Boolean vaild;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StatusInfo copy$default(StatusInfo statusInfo, String str, Long l, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statusInfo.name;
        }
        if ((i & 2) != 0) {
            l = statusInfo.updateDate;
        }
        if ((i & 4) != 0) {
            bool = statusInfo.vaild;
        }
        return statusInfo.copy(str, l, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.updateDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.vaild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatusInfo copy(@NotNull String str, Long l, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new StatusInfo(str, l, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusInfo)) {
            return false;
        }
        StatusInfo statusInfo = (StatusInfo) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) statusInfo.name) && Intrinsics.EZpvd(this.updateDate, statusInfo.updateDate) && Intrinsics.EZpvd(this.vaild, statusInfo.vaild);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getUpdateDate() {
        return this.updateDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getVaild() {
        return this.vaild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        Long l = this.updateDate;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Boolean bool = this.vaild;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVaild(Boolean bool) {
        this.vaild = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StatusInfo(name=" + this.name + ", updateDate=" + this.updateDate + ", vaild=" + this.vaild + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.net.bean.StatusInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StatusInfo> serializer() {
            return StatusInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StatusInfo(int i, String str, Long l, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, StatusInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.updateDate = l;
        if ((i & 4) == 0) {
            this.vaild = Boolean.FALSE;
        } else {
            this.vaild = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(StatusInfo statusInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, statusInfo.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, statusInfo.updateDate);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(statusInfo.vaild, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, statusInfo.vaild);
    }

    public StatusInfo(@NotNull String str, Long l, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.updateDate = l;
        this.vaild = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.Long)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Long, java.lang.Boolean):void (m)] (LINE:35) call: com.okinc.okex.feedback.net.bean.StatusInfo.<init>(java.lang.String, java.lang.Long, java.lang.Boolean):void type: THIS */
    public /* synthetic */ StatusInfo(String str, Long l, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, (i & 4) != 0 ? Boolean.FALSE : bool);
    }
}
