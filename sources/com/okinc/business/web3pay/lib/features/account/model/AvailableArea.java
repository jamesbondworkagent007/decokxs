package com.okinc.business.web3pay.lib.features.account.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AvailableArea {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String code;
    private final String fullName;
    private final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AvailableArea copy$default(AvailableArea availableArea, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableArea.fullName;
        }
        if ((i & 2) != 0) {
            str2 = availableArea.name;
        }
        if ((i & 4) != 0) {
            str3 = availableArea.code;
        }
        return availableArea.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AvailableArea copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AvailableArea(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableArea)) {
            return false;
        }
        AvailableArea availableArea = (AvailableArea) obj;
        return Intrinsics.EZpvd((Object) this.fullName, (Object) availableArea.fullName) && Intrinsics.EZpvd((Object) this.name, (Object) availableArea.name) && Intrinsics.EZpvd((Object) this.code, (Object) availableArea.code);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.fullName.hashCode() * 31) + this.name.hashCode()) * 31) + this.code.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AvailableArea(fullName=" + this.fullName + ", name=" + this.name + ", code=" + this.code + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.account.model.AvailableArea.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AvailableArea> serializer() {
            return AvailableArea$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AvailableArea(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AvailableArea$$serializer.INSTANCE.getDescriptor());
        }
        this.fullName = str;
        this.name = str2;
        this.code = str3;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(AvailableArea availableArea, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, availableArea.fullName);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, availableArea.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, availableArea.code);
    }

    public AvailableArea(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.fullName = str;
        this.name = str2;
        this.code = str3;
    }
}
