package com.okinc.okrisk.service;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class DimBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String et;
    private final int pm;
    private final String sid;
    private final String st;
    private final String sv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DimBody copy$default(DimBody dimBody, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dimBody.sid;
        }
        if ((i2 & 2) != 0) {
            str2 = dimBody.et;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = dimBody.st;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = dimBody.pm;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = dimBody.sv;
        }
        return dimBody.copy(str, str5, str6, i3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.et;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.st;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.pm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DimBody copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DimBody(str, str2, str3, i, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DimBody)) {
            return false;
        }
        DimBody dimBody = (DimBody) obj;
        return Intrinsics.EZpvd((Object) this.sid, (Object) dimBody.sid) && Intrinsics.EZpvd((Object) this.et, (Object) dimBody.et) && Intrinsics.EZpvd((Object) this.st, (Object) dimBody.st) && this.pm == dimBody.pm && Intrinsics.EZpvd((Object) this.sv, (Object) dimBody.sv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEt() {
        return this.et;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPm() {
        return this.pm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSid() {
        return this.sid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSt() {
        return this.st;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSv() {
        return this.sv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.sid.hashCode() * 31) + this.et.hashCode()) * 31) + this.st.hashCode()) * 31) + Integer.hashCode(this.pm)) * 31) + this.sv.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DimBody(sid=" + this.sid + ", et=" + this.et + ", st=" + this.st + ", pm=" + this.pm + ", sv=" + this.sv + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.service.DimBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DimBody> serializer() {
            return DimBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DimBody(int i, String str, String str2, String str3, int i2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, DimBody$$serializer.INSTANCE.getDescriptor());
        }
        this.sid = str;
        this.et = str2;
        this.st = str3;
        this.pm = i2;
        this.sv = str4;
    }

    public static final /* synthetic */ void write$Self$OKRiskLibrary_okrisk_impl(DimBody dimBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dimBody.sid);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dimBody.et);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dimBody.st);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, dimBody.pm);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, dimBody.sv);
    }

    public DimBody(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.sid = str;
        this.et = str2;
        this.st = str3;
        this.pm = i;
        this.sv = str4;
    }
}
