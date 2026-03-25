package com.okinc.buysell.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class QuickConvertParams implements Parcelable {
    private final String apy;
    private final List<QuickConvertTokenInfo> tokenInfos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuickConvertParams> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(QuickConvertTokenInfo$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<QuickConvertParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickConvertParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(QuickConvertTokenInfo.CREATOR.createFromParcel(parcel));
            }
            return new QuickConvertParams(arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickConvertParams[] newArray(int i) {
            return new QuickConvertParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.buysell.api.QuickConvertParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickConvertParams copy$default(QuickConvertParams quickConvertParams, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = quickConvertParams.tokenInfos;
        }
        if ((i & 2) != 0) {
            str = quickConvertParams.apy;
        }
        return quickConvertParams.copy(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<QuickConvertTokenInfo> component1() {
        return this.tokenInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuickConvertParams copy(@NotNull List<QuickConvertTokenInfo> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new QuickConvertParams(list, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickConvertParams)) {
            return false;
        }
        QuickConvertParams quickConvertParams = (QuickConvertParams) obj;
        return Intrinsics.EZpvd(this.tokenInfos, quickConvertParams.tokenInfos) && Intrinsics.EZpvd((Object) this.apy, (Object) quickConvertParams.apy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<QuickConvertTokenInfo> getTokenInfos() {
        return this.tokenInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.tokenInfos.hashCode() * 31) + this.apy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuickConvertParams(tokenInfos=" + this.tokenInfos + ", apy=" + this.apy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<QuickConvertTokenInfo> list = this.tokenInfos;
        parcel.writeInt(list.size());
        Iterator<QuickConvertTokenInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.apy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.api.QuickConvertParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QuickConvertParams> serializer() {
            return QuickConvertParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QuickConvertParams(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, QuickConvertParams$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenInfos = list;
        if ((i & 2) == 0) {
            this.apy = "";
        } else {
            this.apy = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_api(QuickConvertParams quickConvertParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], quickConvertParams.tokenInfos);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) quickConvertParams.apy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, quickConvertParams.apy);
    }

    public QuickConvertParams(@NotNull List<QuickConvertTokenInfo> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenInfos = list;
        this.apy = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.buysell.api.QuickConvertTokenInfo>, java.lang.String):void (m)] (LINE:247) call: com.okinc.buysell.api.QuickConvertParams.<init>(java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ QuickConvertParams(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? "" : str);
    }
}
