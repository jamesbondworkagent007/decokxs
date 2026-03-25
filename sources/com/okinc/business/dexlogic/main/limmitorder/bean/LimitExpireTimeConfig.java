package com.okinc.business.dexlogic.main.limmitorder.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class LimitExpireTimeConfig {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean defaultShow;
    private final String id;
    private final String text;
    private final Long timeMills;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitExpireTimeConfig copy$default(LimitExpireTimeConfig limitExpireTimeConfig, String str, String str2, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitExpireTimeConfig.id;
        }
        if ((i & 2) != 0) {
            str2 = limitExpireTimeConfig.text;
        }
        if ((i & 4) != 0) {
            z = limitExpireTimeConfig.defaultShow;
        }
        if ((i & 8) != 0) {
            l = limitExpireTimeConfig.timeMills;
        }
        return limitExpireTimeConfig.copy(str, str2, z, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.defaultShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.timeMills;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitExpireTimeConfig copy(@NotNull String str, @NotNull String str2, boolean z, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LimitExpireTimeConfig(str, str2, z, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitExpireTimeConfig)) {
            return false;
        }
        LimitExpireTimeConfig limitExpireTimeConfig = (LimitExpireTimeConfig) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) limitExpireTimeConfig.id) && Intrinsics.EZpvd((Object) this.text, (Object) limitExpireTimeConfig.text) && this.defaultShow == limitExpireTimeConfig.defaultShow && Intrinsics.EZpvd(this.timeMills, limitExpireTimeConfig.timeMills);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDefaultShow() {
        return this.defaultShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTimeMills() {
        return this.timeMills;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.text.hashCode();
        int iHashCode3 = Boolean.hashCode(this.defaultShow);
        Long l = this.timeMills;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitExpireTimeConfig(id=" + this.id + ", text=" + this.text + ", defaultShow=" + this.defaultShow + ", timeMills=" + this.timeMills + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitExpireTimeConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitExpireTimeConfig> serializer() {
            return LimitExpireTimeConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitExpireTimeConfig(int i, String str, String str2, boolean z, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, LimitExpireTimeConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.text = str2;
        this.defaultShow = z;
        if ((i & 8) == 0) {
            this.timeMills = null;
        } else {
            this.timeMills = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitExpireTimeConfig limitExpireTimeConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, limitExpireTimeConfig.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, limitExpireTimeConfig.text);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, limitExpireTimeConfig.defaultShow);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && limitExpireTimeConfig.timeMills == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, limitExpireTimeConfig.timeMills);
    }

    public LimitExpireTimeConfig(@NotNull String str, @NotNull String str2, boolean z, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.text = str2;
        this.defaultShow = z;
        this.timeMills = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 boolean)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r4v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.Long):void (m)] (LINE:193) call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitExpireTimeConfig.<init>(java.lang.String, java.lang.String, boolean, java.lang.Long):void type: THIS */
    public /* synthetic */ LimitExpireTimeConfig(String str, String str2, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? null : l);
    }
}
