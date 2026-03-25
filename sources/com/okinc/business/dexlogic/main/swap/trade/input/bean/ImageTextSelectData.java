package com.okinc.business.dexlogic.main.swap.trade.input.bean;

import com.okinc.business.dexlogic.bean.ConsumeData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageTextSelectData {
    public static final int $stable = 8;
    private ConsumeData<String> chainLogoUrl;
    private Object data;
    private final boolean iconClick;
    private ConsumeData<Integer> imageRes;
    private ConsumeData<String> imageUrl;
    private ConsumeData<String> text;
    private int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImageTextSelectData() {
        this(null, 0, null, null, null, null, false, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageTextSelectData copy$default(ImageTextSelectData imageTextSelectData, ConsumeData consumeData, int i, ConsumeData consumeData2, ConsumeData consumeData3, ConsumeData consumeData4, Object obj, boolean z, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            consumeData = imageTextSelectData.text;
        }
        if ((i2 & 2) != 0) {
            i = imageTextSelectData.type;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            consumeData2 = imageTextSelectData.imageUrl;
        }
        ConsumeData consumeData5 = consumeData2;
        if ((i2 & 8) != 0) {
            consumeData3 = imageTextSelectData.imageRes;
        }
        ConsumeData consumeData6 = consumeData3;
        if ((i2 & 16) != 0) {
            consumeData4 = imageTextSelectData.chainLogoUrl;
        }
        ConsumeData consumeData7 = consumeData4;
        if ((i2 & 32) != 0) {
            obj = imageTextSelectData.data;
        }
        Object obj3 = obj;
        if ((i2 & 64) != 0) {
            z = imageTextSelectData.iconClick;
        }
        return imageTextSelectData.copy(consumeData, i3, consumeData5, consumeData6, consumeData7, obj3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component3() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Integer> component4() {
        return this.imageRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component5() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component6() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.iconClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageTextSelectData copy(@NotNull ConsumeData<String> consumeData, int i, @NotNull ConsumeData<String> consumeData2, @NotNull ConsumeData<Integer> consumeData3, @NotNull ConsumeData<String> consumeData4, Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        Intrinsics.checkNotNullParameter(consumeData4, "");
        return new ImageTextSelectData(consumeData, i, consumeData2, consumeData3, consumeData4, obj, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageTextSelectData)) {
            return false;
        }
        ImageTextSelectData imageTextSelectData = (ImageTextSelectData) obj;
        return Intrinsics.EZpvd(this.text, imageTextSelectData.text) && this.type == imageTextSelectData.type && Intrinsics.EZpvd(this.imageUrl, imageTextSelectData.imageUrl) && Intrinsics.EZpvd(this.imageRes, imageTextSelectData.imageRes) && Intrinsics.EZpvd(this.chainLogoUrl, imageTextSelectData.chainLogoUrl) && Intrinsics.EZpvd(this.data, imageTextSelectData.data) && this.iconClick == imageTextSelectData.iconClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIconClick() {
        return this.iconClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Integer> getImageRes() {
        return this.imageRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.text.hashCode();
        int iHashCode2 = Integer.hashCode(this.type);
        int iHashCode3 = this.imageUrl.hashCode();
        int iHashCode4 = this.imageRes.hashCode();
        int iHashCode5 = this.chainLogoUrl.hashCode();
        Object obj = this.data;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + Boolean.hashCode(this.iconClick);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogoUrl(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.chainLogoUrl = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(Object obj) {
        this.data = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageRes(@NotNull ConsumeData<Integer> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.imageRes = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.imageUrl = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setText(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.text = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ImageTextSelectData(text=" + this.text + ", type=" + this.type + ", imageUrl=" + this.imageUrl + ", imageRes=" + this.imageRes + ", chainLogoUrl=" + this.chainLogoUrl + ", data=" + this.data + ", iconClick=" + this.iconClick + ")";
    }

    public ImageTextSelectData(@NotNull ConsumeData<String> consumeData, int i, @NotNull ConsumeData<String> consumeData2, @NotNull ConsumeData<Integer> consumeData3, @NotNull ConsumeData<String> consumeData4, Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        Intrinsics.checkNotNullParameter(consumeData4, "");
        this.text = consumeData;
        this.type = i;
        this.imageUrl = consumeData2;
        this.imageRes = consumeData3;
        this.chainLogoUrl = consumeData4;
        this.data = obj;
        this.iconClick = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) ("--"))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:16) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r11v0 int))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0017: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:18) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0024: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002e: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (0 int))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:19) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r13v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0033: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:20) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r14v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x003e: ARITH (r17v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.Object) : (null java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
 A[MD:(com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, int, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.Integer>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, java.lang.Object, boolean):void (m)] (LINE:15) call: com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData.<init>(com.okinc.business.dexlogic.bean.ConsumeData, int, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, java.lang.Object, boolean):void type: THIS */
    public /* synthetic */ ImageTextSelectData(ConsumeData consumeData, int i, ConsumeData consumeData2, ConsumeData consumeData3, ConsumeData consumeData4, Object obj, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ConsumeData((Object) "--", false, 2, (DefaultConstructorMarker) null) : consumeData, (i2 & 2) != 0 ? 3 : i, (i2 & 4) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData2, (i2 & 8) != 0 ? new ConsumeData((Object) 0, false, 2, (DefaultConstructorMarker) null) : consumeData3, (i2 & 16) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData4, (i2 & 32) == 0 ? obj : null, (i2 & 64) != 0 ? true : z);
    }
}
