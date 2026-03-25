package com.okinc.business.market.features.vibes.domain;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class VibesOverviewData {
    public final String followers;
    public final List<VibesKolData> kolList;
    public final String mentionedKolCount;
    public final String relevance;
    public final String score;
    public final String twitterCreateTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(VibesKolData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VibesOverviewData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.features.vibes.domain.VibesOverviewData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VibesOverviewData copy$default(VibesOverviewData vibesOverviewData, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vibesOverviewData.score;
        }
        if ((i & 2) != 0) {
            str2 = vibesOverviewData.relevance;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = vibesOverviewData.followers;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = vibesOverviewData.twitterCreateTime;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = vibesOverviewData.mentionedKolCount;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            list = vibesOverviewData.kolList;
        }
        return vibesOverviewData.AEQbTJ(str, str6, str7, str8, str9, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesOverviewData AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<VibesKolData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new VibesOverviewData(str, str2, str3, str4, str5, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.mentionedKolCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.relevance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.twitterCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibesOverviewData)) {
            return false;
        }
        VibesOverviewData vibesOverviewData = (VibesOverviewData) obj;
        return Intrinsics.EZpvd((Object) this.score, (Object) vibesOverviewData.score) && Intrinsics.EZpvd((Object) this.relevance, (Object) vibesOverviewData.relevance) && Intrinsics.EZpvd((Object) this.followers, (Object) vibesOverviewData.followers) && Intrinsics.EZpvd((Object) this.twitterCreateTime, (Object) vibesOverviewData.twitterCreateTime) && Intrinsics.EZpvd((Object) this.mentionedKolCount, (Object) vibesOverviewData.mentionedKolCount) && Intrinsics.EZpvd(this.kolList, vibesOverviewData.kolList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.score.hashCode() * 31) + this.relevance.hashCode()) * 31) + this.followers.hashCode()) * 31) + this.twitterCreateTime.hashCode()) * 31) + this.mentionedKolCount.hashCode()) * 31) + this.kolList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VibesOverviewData(score=" + this.score + ", relevance=" + this.relevance + ", followers=" + this.followers + ", twitterCreateTime=" + this.twitterCreateTime + ", mentionedKolCount=" + this.mentionedKolCount + ", kolList=" + this.kolList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.vibes.domain.VibesOverviewData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VibesOverviewData> serializer() {
            return VibesOverviewData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VibesOverviewData(int i, String str, String str2, String str3, String str4, String str5, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.score = "";
        } else {
            this.score = str;
        }
        if ((i & 2) == 0) {
            this.relevance = "";
        } else {
            this.relevance = str2;
        }
        if ((i & 4) == 0) {
            this.followers = "";
        } else {
            this.followers = str3;
        }
        if ((i & 8) == 0) {
            this.twitterCreateTime = "";
        } else {
            this.twitterCreateTime = str4;
        }
        if ((i & 16) == 0) {
            this.mentionedKolCount = "";
        } else {
            this.mentionedKolCount = str5;
        }
        if ((i & 32) == 0) {
            this.kolList = yDY.AhwBna();
        } else {
            this.kolList = list;
        }
    }

    public static final /* synthetic */ void EZpvd(VibesOverviewData vibesOverviewData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) vibesOverviewData.score, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, vibesOverviewData.score);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) vibesOverviewData.relevance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, vibesOverviewData.relevance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) vibesOverviewData.followers, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, vibesOverviewData.followers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) vibesOverviewData.twitterCreateTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, vibesOverviewData.twitterCreateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) vibesOverviewData.mentionedKolCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, vibesOverviewData.mentionedKolCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(vibesOverviewData.kolList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], vibesOverviewData.kolList);
    }

    public VibesOverviewData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<VibesKolData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.score = str;
        this.relevance = str2;
        this.followers = str3;
        this.twitterCreateTime = str4;
        this.mentionedKolCount = str5;
        this.kolList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0028: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r10v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.vibes.domain.VibesKolData>):void (m)] (LINE:6) call: com.okinc.business.market.features.vibes.domain.VibesOverviewData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ VibesOverviewData(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? yDY.AhwBna() : list);
    }
}
