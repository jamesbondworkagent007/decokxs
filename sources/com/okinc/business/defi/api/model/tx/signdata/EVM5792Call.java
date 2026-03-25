package com.okinc.business.defi.api.model.tx.signdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonObject;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EVM5792Call implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EVM5792Call> CREATOR = new Creator();
    private final Map<String, JsonObject> capabilities;
    private String data;
    private final String to;
    private final String value;

    public static final class Creator implements Parcelable.Creator<EVM5792Call> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EVM5792Call createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EVM5792Call(parcel.readString(), parcel.readString(), parcel.readString(), null, 8, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EVM5792Call[] newArray(int i) {
            return new EVM5792Call[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EVM5792Call() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ void getCapabilities$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, JsonObject> getCapabilities() {
        return this.capabilities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(String str) {
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.to);
        parcel.writeString(this.data);
        parcel.writeString(this.value);
    }

    public EVM5792Call(String str, String str2, String str3, Map<String, JsonObject> map) {
        this.to = str;
        this.data = str2;
        this.value = str3;
        this.capabilities = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r5v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, com.google.gson.JsonObject>):void (m)] (LINE:47) call: com.okinc.business.defi.api.model.tx.signdata.EVM5792Call.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ EVM5792Call(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : map);
    }
}
