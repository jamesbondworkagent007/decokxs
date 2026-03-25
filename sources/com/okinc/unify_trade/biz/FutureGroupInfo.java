package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class FutureGroupInfo {
    private String ccyType;
    private String ctType;
    private String sort;
    private String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FutureGroupInfo copy$default(FutureGroupInfo futureGroupInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futureGroupInfo.text;
        }
        if ((i & 2) != 0) {
            str2 = futureGroupInfo.ccyType;
        }
        if ((i & 4) != 0) {
            str3 = futureGroupInfo.ctType;
        }
        if ((i & 8) != 0) {
            str4 = futureGroupInfo.sort;
        }
        return futureGroupInfo.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ccyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FutureGroupInfo copy(String str, String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new FutureGroupInfo(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FutureGroupInfo)) {
            return false;
        }
        FutureGroupInfo futureGroupInfo = (FutureGroupInfo) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) futureGroupInfo.text) && Intrinsics.EZpvd((Object) this.ccyType, (Object) futureGroupInfo.ccyType) && Intrinsics.EZpvd((Object) this.ctType, (Object) futureGroupInfo.ctType) && Intrinsics.EZpvd((Object) this.sort, (Object) futureGroupInfo.sort);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyType() {
        return this.ccyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtType() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSort() {
        return this.sort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.text;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ccyType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.ctType.hashCode();
        String str3 = this.sort;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcyType(String str) {
        this.ccyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ctType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSort(String str) {
        this.sort = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setText(String str) {
        this.text = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FutureGroupInfo(text=" + this.text + ", ccyType=" + this.ccyType + ", ctType=" + this.ctType + ", sort=" + this.sort + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FutureGroupInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FutureGroupInfo> serializer() {
            return FutureGroupInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FutureGroupInfo(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, FutureGroupInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.ccyType = str2;
        this.ctType = str3;
        if ((i & 8) == 0) {
            this.sort = "";
        } else {
            this.sort = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FutureGroupInfo futureGroupInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, futureGroupInfo.text);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, futureGroupInfo.ccyType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, futureGroupInfo.ctType);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) futureGroupInfo.sort, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, futureGroupInfo.sort);
    }

    public FutureGroupInfo(String str, String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.text = str;
        this.ccyType = str2;
        this.ctType = str3;
        this.sort = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.unify_trade.biz.FutureGroupInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FutureGroupInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }
}
