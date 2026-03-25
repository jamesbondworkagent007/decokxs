package com.okinc.business.defi.dapp.net;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WhiteList implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private HashMap<String, String> genesisHashToChainMap;
    private int requestTranslateCharCount;
    private int requestTranslateRecordCount;
    private String webDeskConfigList;
    private String whiteMainlandHost;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WhiteList> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WhiteList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhiteList createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i3 = parcel.readInt();
                HashMap map2 = new HashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    map2.put(parcel.readString(), parcel.readString());
                }
                map = map2;
            }
            return new WhiteList(string, string2, i, i2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhiteList[] newArray(int i) {
            return new WhiteList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.dapp.net.WhiteList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WhiteList copy$default(WhiteList whiteList, String str, String str2, int i, int i2, HashMap map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = whiteList.whiteMainlandHost;
        }
        if ((i3 & 2) != 0) {
            str2 = whiteList.webDeskConfigList;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = whiteList.requestTranslateCharCount;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = whiteList.requestTranslateRecordCount;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            map = whiteList.genesisHashToChainMap;
        }
        return whiteList.copy(str, str3, i4, i5, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.whiteMainlandHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.webDeskConfigList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.requestTranslateCharCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.requestTranslateRecordCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component5() {
        return this.genesisHashToChainMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WhiteList copy(@NotNull String str, String str2, int i, int i2, HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WhiteList(str, str2, i, i2, map);
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
        if (!(obj instanceof WhiteList)) {
            return false;
        }
        WhiteList whiteList = (WhiteList) obj;
        return Intrinsics.EZpvd((Object) this.whiteMainlandHost, (Object) whiteList.whiteMainlandHost) && Intrinsics.EZpvd((Object) this.webDeskConfigList, (Object) whiteList.webDeskConfigList) && this.requestTranslateCharCount == whiteList.requestTranslateCharCount && this.requestTranslateRecordCount == whiteList.requestTranslateRecordCount && Intrinsics.EZpvd(this.genesisHashToChainMap, whiteList.genesisHashToChainMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getGenesisHashToChainMap() {
        return this.genesisHashToChainMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRequestTranslateCharCount() {
        return this.requestTranslateCharCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRequestTranslateRecordCount() {
        return this.requestTranslateRecordCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebDeskConfigList() {
        return this.webDeskConfigList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWhiteMainlandHost() {
        return this.whiteMainlandHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.whiteMainlandHost.hashCode();
        String str = this.webDeskConfigList;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Integer.hashCode(this.requestTranslateCharCount);
        int iHashCode4 = Integer.hashCode(this.requestTranslateRecordCount);
        HashMap<String, String> map = this.genesisHashToChainMap;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGenesisHashToChainMap(HashMap<String, String> map) {
        this.genesisHashToChainMap = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestTranslateCharCount(int i) {
        this.requestTranslateCharCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestTranslateRecordCount(int i) {
        this.requestTranslateRecordCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWebDeskConfigList(String str) {
        this.webDeskConfigList = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWhiteMainlandHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.whiteMainlandHost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WhiteList(whiteMainlandHost=" + this.whiteMainlandHost + ", webDeskConfigList=" + this.webDeskConfigList + ", requestTranslateCharCount=" + this.requestTranslateCharCount + ", requestTranslateRecordCount=" + this.requestTranslateRecordCount + ", genesisHashToChainMap=" + this.genesisHashToChainMap + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.whiteMainlandHost);
        parcel.writeString(this.webDeskConfigList);
        parcel.writeInt(this.requestTranslateCharCount);
        parcel.writeInt(this.requestTranslateRecordCount);
        HashMap<String, String> map = this.genesisHashToChainMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.WhiteList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WhiteList> serializer() {
            return WhiteList$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, new HashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ WhiteList(int i, String str, String str2, int i2, int i3, HashMap map, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WhiteList$$serializer.INSTANCE.getDescriptor());
        }
        this.whiteMainlandHost = str;
        if ((i & 2) == 0) {
            this.webDeskConfigList = null;
        } else {
            this.webDeskConfigList = str2;
        }
        if ((i & 4) == 0) {
            this.requestTranslateCharCount = 0;
        } else {
            this.requestTranslateCharCount = i2;
        }
        if ((i & 8) == 0) {
            this.requestTranslateRecordCount = 0;
        } else {
            this.requestTranslateRecordCount = i3;
        }
        if ((i & 16) == 0) {
            this.genesisHashToChainMap = null;
        } else {
            this.genesisHashToChainMap = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(WhiteList whiteList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, whiteList.whiteMainlandHost);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || whiteList.webDeskConfigList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, whiteList.webDeskConfigList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || whiteList.requestTranslateCharCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, whiteList.requestTranslateCharCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || whiteList.requestTranslateRecordCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, whiteList.requestTranslateRecordCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && whiteList.genesisHashToChainMap == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], whiteList.genesisHashToChainMap);
    }

    public WhiteList(@NotNull String str, String str2, int i, int i2, HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        this.whiteMainlandHost = str;
        this.webDeskConfigList = str2;
        this.requestTranslateCharCount = i;
        this.requestTranslateRecordCount = i2;
        this.genesisHashToChainMap = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r12v0 java.util.HashMap))
 A[MD:(java.lang.String, java.lang.String, int, int, java.util.HashMap<java.lang.String, java.lang.String>):void (m)] (LINE:168) call: com.okinc.business.defi.dapp.net.WhiteList.<init>(java.lang.String, java.lang.String, int, int, java.util.HashMap):void type: THIS */
    public /* synthetic */ WhiteList(String str, String str2, int i, int i2, HashMap map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : map);
    }
}
