package com.okinc.business.defi.dapp.utils;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappDeeplinkRegexBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private DappHistoryBlack dappHistoryBlackList;
    private String deeplink;
    private List<String> defaultUaConfig;
    private List<String> jsBridgeMethodBlackList;
    private String minVersion;
    private List<String> noDohUrlConfig;
    private final Map<String, String> paramsMap;
    private final String regex;
    private final List<KeyValueBean> regexMatchs;
    private Map<String, Integer> uaConfig;
    private String uaString;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappDeeplinkRegexBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DappDeeplinkRegexBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappDeeplinkRegexBean createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(KeyValueBean.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i5 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
            }
            return new DappDeeplinkRegexBean(string, arrayList, linkedHashMap2, string2, string3, linkedHashMap, parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0 ? DappHistoryBlack.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappDeeplinkRegexBean[] newArray(int i) {
            return new DappDeeplinkRegexBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.regex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component10() {
        return this.jsBridgeMethodBlackList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappHistoryBlack component11() {
        return this.dappHistoryBlackList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KeyValueBean> component2() {
        return this.regexMatchs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.paramsMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.minVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Integer> component6() {
        return this.uaConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.uaString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.noDohUrlConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component9() {
        return this.defaultUaConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappDeeplinkRegexBean copy(@NotNull String str, @NotNull List<KeyValueBean> list, @NotNull Map<String, String> map, @NotNull String str2, @NotNull String str3, Map<String, Integer> map2, String str4, List<String> list2, List<String> list3, List<String> list4, DappHistoryBlack dappHistoryBlack) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DappDeeplinkRegexBean(str, list, map, str2, str3, map2, str4, list2, list3, list4, dappHistoryBlack);
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
        if (!(obj instanceof DappDeeplinkRegexBean)) {
            return false;
        }
        DappDeeplinkRegexBean dappDeeplinkRegexBean = (DappDeeplinkRegexBean) obj;
        return Intrinsics.EZpvd((Object) this.regex, (Object) dappDeeplinkRegexBean.regex) && Intrinsics.EZpvd(this.regexMatchs, dappDeeplinkRegexBean.regexMatchs) && Intrinsics.EZpvd(this.paramsMap, dappDeeplinkRegexBean.paramsMap) && Intrinsics.EZpvd((Object) this.deeplink, (Object) dappDeeplinkRegexBean.deeplink) && Intrinsics.EZpvd((Object) this.minVersion, (Object) dappDeeplinkRegexBean.minVersion) && Intrinsics.EZpvd(this.uaConfig, dappDeeplinkRegexBean.uaConfig) && Intrinsics.EZpvd((Object) this.uaString, (Object) dappDeeplinkRegexBean.uaString) && Intrinsics.EZpvd(this.noDohUrlConfig, dappDeeplinkRegexBean.noDohUrlConfig) && Intrinsics.EZpvd(this.defaultUaConfig, dappDeeplinkRegexBean.defaultUaConfig) && Intrinsics.EZpvd(this.jsBridgeMethodBlackList, dappDeeplinkRegexBean.jsBridgeMethodBlackList) && Intrinsics.EZpvd(this.dappHistoryBlackList, dappDeeplinkRegexBean.dappHistoryBlackList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappHistoryBlack getDappHistoryBlackList() {
        return this.dappHistoryBlackList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDefaultUaConfig() {
        return this.defaultUaConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getJsBridgeMethodBlackList() {
        return this.jsBridgeMethodBlackList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinVersion() {
        return this.minVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getNoDohUrlConfig() {
        return this.noDohUrlConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getParamsMap() {
        return this.paramsMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRegex() {
        return this.regex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KeyValueBean> getRegexMatchs() {
        return this.regexMatchs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Integer> getUaConfig() {
        return this.uaConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUaString() {
        return this.uaString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.regex.hashCode();
        int iHashCode2 = this.regexMatchs.hashCode();
        int iHashCode3 = this.paramsMap.hashCode();
        int iHashCode4 = this.deeplink.hashCode();
        int iHashCode5 = this.minVersion.hashCode();
        Map<String, Integer> map = this.uaConfig;
        int iHashCode6 = map == null ? 0 : map.hashCode();
        String str = this.uaString;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        List<String> list = this.noDohUrlConfig;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.defaultUaConfig;
        int iHashCode9 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.jsBridgeMethodBlackList;
        int iHashCode10 = list3 == null ? 0 : list3.hashCode();
        DappHistoryBlack dappHistoryBlack = this.dappHistoryBlackList;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (dappHistoryBlack != null ? dappHistoryBlack.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappHistoryBlackList(DappHistoryBlack dappHistoryBlack) {
        this.dappHistoryBlackList = dappHistoryBlack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeeplink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deeplink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultUaConfig(List<String> list) {
        this.defaultUaConfig = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJsBridgeMethodBlackList(List<String> list) {
        this.jsBridgeMethodBlackList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoDohUrlConfig(List<String> list) {
        this.noDohUrlConfig = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUaConfig(Map<String, Integer> map) {
        this.uaConfig = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUaString(String str) {
        this.uaString = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappDeeplinkRegexBean(regex=" + this.regex + ", regexMatchs=" + this.regexMatchs + ", paramsMap=" + this.paramsMap + ", deeplink=" + this.deeplink + ", minVersion=" + this.minVersion + ", uaConfig=" + this.uaConfig + ", uaString=" + this.uaString + ", noDohUrlConfig=" + this.noDohUrlConfig + ", defaultUaConfig=" + this.defaultUaConfig + ", jsBridgeMethodBlackList=" + this.jsBridgeMethodBlackList + ", dappHistoryBlackList=" + this.dappHistoryBlackList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.regex);
        List<KeyValueBean> list = this.regexMatchs;
        parcel.writeInt(list.size());
        Iterator<KeyValueBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Map<String, String> map = this.paramsMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.deeplink);
        parcel.writeString(this.minVersion);
        Map<String, Integer> map2 = this.uaConfig;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, Integer> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeInt(entry2.getValue().intValue());
            }
        }
        parcel.writeString(this.uaString);
        parcel.writeStringList(this.noDohUrlConfig);
        parcel.writeStringList(this.defaultUaConfig);
        parcel.writeStringList(this.jsBridgeMethodBlackList);
        DappHistoryBlack dappHistoryBlack = this.dappHistoryBlackList;
        if (dappHistoryBlack == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dappHistoryBlack.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.utils.DappDeeplinkRegexBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappDeeplinkRegexBean> serializer() {
            return DappDeeplinkRegexBean$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(KeyValueBean$$serializer.INSTANCE), new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, new LinkedHashMapSerializer(stringSerializer, IntSerializer.INSTANCE), null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null};
    }

    public /* synthetic */ DappDeeplinkRegexBean(int i, String str, List list, Map map, String str2, String str3, Map map2, String str4, List list2, List list3, List list4, DappHistoryBlack dappHistoryBlack, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, DappDeeplinkRegexBean$$serializer.INSTANCE.getDescriptor());
        }
        this.regex = str;
        this.regexMatchs = list;
        this.paramsMap = map;
        this.deeplink = str2;
        this.minVersion = str3;
        this.uaConfig = map2;
        this.uaString = str4;
        if ((i & 128) == 0) {
            this.noDohUrlConfig = null;
        } else {
            this.noDohUrlConfig = list2;
        }
        if ((i & 256) == 0) {
            this.defaultUaConfig = null;
        } else {
            this.defaultUaConfig = list3;
        }
        if ((i & 512) == 0) {
            this.jsBridgeMethodBlackList = null;
        } else {
            this.jsBridgeMethodBlackList = list4;
        }
        if ((i & 1024) == 0) {
            this.dappHistoryBlackList = null;
        } else {
            this.dappHistoryBlackList = dappHistoryBlack;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(DappDeeplinkRegexBean dappDeeplinkRegexBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dappDeeplinkRegexBean.regex);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], dappDeeplinkRegexBean.regexMatchs);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], dappDeeplinkRegexBean.paramsMap);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, dappDeeplinkRegexBean.deeplink);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, dappDeeplinkRegexBean.minVersion);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], dappDeeplinkRegexBean.uaConfig);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, dappDeeplinkRegexBean.uaString);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dappDeeplinkRegexBean.noDohUrlConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], dappDeeplinkRegexBean.noDohUrlConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || dappDeeplinkRegexBean.defaultUaConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], dappDeeplinkRegexBean.defaultUaConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || dappDeeplinkRegexBean.jsBridgeMethodBlackList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], dappDeeplinkRegexBean.jsBridgeMethodBlackList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && dappDeeplinkRegexBean.dappHistoryBlackList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, DappHistoryBlack$$serializer.INSTANCE, dappDeeplinkRegexBean.dappHistoryBlackList);
    }

    public DappDeeplinkRegexBean(@NotNull String str, @NotNull List<KeyValueBean> list, @NotNull Map<String, String> map, @NotNull String str2, @NotNull String str3, Map<String, Integer> map2, String str4, List<String> list2, List<String> list3, List<String> list4, DappHistoryBlack dappHistoryBlack) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.regex = str;
        this.regexMatchs = list;
        this.paramsMap = map;
        this.deeplink = str2;
        this.minVersion = str3;
        this.uaConfig = map2;
        this.uaString = str4;
        this.noDohUrlConfig = list2;
        this.defaultUaConfig = list3;
        this.jsBridgeMethodBlackList = list4;
        this.dappHistoryBlackList = dappHistoryBlack;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.util.List)
  (r18v0 java.util.Map)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.util.Map)
  (r22v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r24v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r25v0 java.util.List))
  (wrap:com.okinc.business.defi.dapp.utils.DappHistoryBlack:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.dapp.utils.DappHistoryBlack) : (r26v0 com.okinc.business.defi.dapp.utils.DappHistoryBlack))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.dapp.utils.KeyValueBean>, java.util.Map<java.lang.String, java.lang.String>, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, com.okinc.business.defi.dapp.utils.DappHistoryBlack):void (m)] (LINE:396) call: com.okinc.business.defi.dapp.utils.DappDeeplinkRegexBean.<init>(java.lang.String, java.util.List, java.util.Map, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.List, java.util.List, java.util.List, com.okinc.business.defi.dapp.utils.DappHistoryBlack):void type: THIS */
    public /* synthetic */ DappDeeplinkRegexBean(String str, List list, Map map, String str2, String str3, Map map2, String str4, List list2, List list3, List list4, DappHistoryBlack dappHistoryBlack, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, map, str2, str3, map2, str4, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : list4, (i & 1024) != 0 ? null : dappHistoryBlack);
    }
}
