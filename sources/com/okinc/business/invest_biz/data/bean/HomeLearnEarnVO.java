package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HomeLearnEarnVO {
    public final String jumpUrl;
    public final List<LearnCardItem> learnCards;
    public final String subTitle;
    public final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(LearnCardItem$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeLearnEarnVO() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.HomeLearnEarnVO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeLearnEarnVO copy$default(HomeLearnEarnVO homeLearnEarnVO, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeLearnEarnVO.jumpUrl;
        }
        if ((i & 2) != 0) {
            str2 = homeLearnEarnVO.title;
        }
        if ((i & 4) != 0) {
            str3 = homeLearnEarnVO.subTitle;
        }
        if ((i & 8) != 0) {
            list = homeLearnEarnVO.learnCards;
        }
        return homeLearnEarnVO.KWHzl(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeLearnEarnVO KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<LearnCardItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new HomeLearnEarnVO(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LearnCardItem> KWHzl() {
        return this.learnCards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeLearnEarnVO)) {
            return false;
        }
        HomeLearnEarnVO homeLearnEarnVO = (HomeLearnEarnVO) obj;
        return Intrinsics.EZpvd((Object) this.jumpUrl, (Object) homeLearnEarnVO.jumpUrl) && Intrinsics.EZpvd((Object) this.title, (Object) homeLearnEarnVO.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) homeLearnEarnVO.subTitle) && Intrinsics.EZpvd(this.learnCards, homeLearnEarnVO.learnCards);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.jumpUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.learnCards.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeLearnEarnVO(jumpUrl=" + this.jumpUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", learnCards=" + this.learnCards + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.HomeLearnEarnVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeLearnEarnVO> serializer() {
            return HomeLearnEarnVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeLearnEarnVO(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.jumpUrl = "";
        } else {
            this.jumpUrl = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.subTitle = "";
        } else {
            this.subTitle = str3;
        }
        if ((i & 8) == 0) {
            this.learnCards = yDY.AhwBna();
        } else {
            this.learnCards = list;
        }
    }

    public static final /* synthetic */ void EZpvd(HomeLearnEarnVO homeLearnEarnVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) homeLearnEarnVO.jumpUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, homeLearnEarnVO.jumpUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) homeLearnEarnVO.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, homeLearnEarnVO.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) homeLearnEarnVO.subTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, homeLearnEarnVO.subTitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(homeLearnEarnVO.learnCards, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], homeLearnEarnVO.learnCards);
    }

    public HomeLearnEarnVO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<LearnCardItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.jumpUrl = str;
        this.title = str2;
        this.subTitle = str3;
        this.learnCards = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:276)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.LearnCardItem>):void (m)] (LINE:268) call: com.okinc.business.invest_biz.data.bean.HomeLearnEarnVO.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ HomeLearnEarnVO(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}
