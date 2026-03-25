package com.reown.android.internal.common.model;

import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class RelayProtocolOptions {
    public final String data;
    public final String protocol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RelayProtocolOptions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RelayProtocolOptions copy$default(RelayProtocolOptions relayProtocolOptions, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = relayProtocolOptions.protocol;
        }
        if ((i & 2) != 0) {
            str2 = relayProtocolOptions.data;
        }
        return relayProtocolOptions.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelayProtocolOptions copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new RelayProtocolOptions(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelayProtocolOptions)) {
            return false;
        }
        RelayProtocolOptions relayProtocolOptions = (RelayProtocolOptions) obj;
        return Intrinsics.EZpvd((Object) this.protocol, (Object) relayProtocolOptions.protocol) && Intrinsics.EZpvd((Object) this.data, (Object) relayProtocolOptions.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocol() {
        return this.protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.protocol.hashCode();
        String str = this.data;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RelayProtocolOptions(protocol=" + this.protocol + ", data=" + this.data + ")";
    }

    public RelayProtocolOptions(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.protocol = str;
        this.data = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("irn") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.reown.android.internal.common.model.RelayProtocolOptions.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RelayProtocolOptions(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "irn" : str, (i & 2) != 0 ? null : str2);
    }
}
