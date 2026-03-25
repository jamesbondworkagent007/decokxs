package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class SetAccountLevelReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String ccy;
    private final boolean collateralEnabled;
    private final String relationCcy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SetAccountLevelReq copy$default(SetAccountLevelReq setAccountLevelReq, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setAccountLevelReq.ccy;
        }
        if ((i & 2) != 0) {
            str2 = setAccountLevelReq.relationCcy;
        }
        if ((i & 4) != 0) {
            z = setAccountLevelReq.collateralEnabled;
        }
        return setAccountLevelReq.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.relationCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.collateralEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SetAccountLevelReq copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SetAccountLevelReq(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetAccountLevelReq)) {
            return false;
        }
        SetAccountLevelReq setAccountLevelReq = (SetAccountLevelReq) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) setAccountLevelReq.ccy) && Intrinsics.EZpvd((Object) this.relationCcy, (Object) setAccountLevelReq.relationCcy) && this.collateralEnabled == setAccountLevelReq.collateralEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCollateralEnabled() {
        return this.collateralEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRelationCcy() {
        return this.relationCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.ccy.hashCode() * 31) + this.relationCcy.hashCode()) * 31) + Boolean.hashCode(this.collateralEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SetAccountLevelReq(ccy=" + this.ccy + ", relationCcy=" + this.relationCcy + ", collateralEnabled=" + this.collateralEnabled + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.SetAccountLevelReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SetAccountLevelReq> serializer() {
            return SetAccountLevelReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SetAccountLevelReq(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SetAccountLevelReq$$serializer.INSTANCE.getDescriptor());
        }
        this.ccy = str;
        this.relationCcy = str2;
        this.collateralEnabled = z;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(SetAccountLevelReq setAccountLevelReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, setAccountLevelReq.ccy);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, setAccountLevelReq.relationCcy);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, setAccountLevelReq.collateralEnabled);
    }

    public SetAccountLevelReq(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ccy = str;
        this.relationCcy = str2;
        this.collateralEnabled = z;
    }
}
