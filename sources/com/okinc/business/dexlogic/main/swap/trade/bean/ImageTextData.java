package com.okinc.business.dexlogic.main.swap.trade.bean;

import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22332hdP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageTextData {
    public static final int $stable = 8;
    private ConsumeData<String> chainLogoUrl;
    private DexMultiTokenInfoBean data;
    private ConsumeData<String> imageUrl;
    private ConsumeData<String> text;
    private int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImageTextData() {
        this(null, 0, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.dexlogic.main.swap.trade.bean.ImageTextData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageTextData copy$default(ImageTextData imageTextData, ConsumeData consumeData, int i, ConsumeData consumeData2, ConsumeData consumeData3, DexMultiTokenInfoBean dexMultiTokenInfoBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            consumeData = imageTextData.text;
        }
        if ((i2 & 2) != 0) {
            i = imageTextData.type;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            consumeData2 = imageTextData.imageUrl;
        }
        ConsumeData consumeData4 = consumeData2;
        if ((i2 & 8) != 0) {
            consumeData3 = imageTextData.chainLogoUrl;
        }
        ConsumeData consumeData5 = consumeData3;
        if ((i2 & 16) != 0) {
            dexMultiTokenInfoBean = imageTextData.data;
        }
        return imageTextData.copy(consumeData, i3, consumeData4, consumeData5, dexMultiTokenInfoBean);
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
    public final ConsumeData<String> component4() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component5() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageTextData copy(@NotNull ConsumeData<String> consumeData, int i, @NotNull ConsumeData<String> consumeData2, @NotNull ConsumeData<String> consumeData3, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        return new ImageTextData(consumeData, i, consumeData2, consumeData3, dexMultiTokenInfoBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageTextData)) {
            return false;
        }
        ImageTextData imageTextData = (ImageTextData) obj;
        return Intrinsics.EZpvd(this.text, imageTextData.text) && this.type == imageTextData.type && Intrinsics.EZpvd(this.imageUrl, imageTextData.imageUrl) && Intrinsics.EZpvd(this.chainLogoUrl, imageTextData.chainLogoUrl) && Intrinsics.EZpvd(this.data, imageTextData.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getData() {
        return this.data;
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
        int iHashCode4 = this.chainLogoUrl.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.data;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogoUrl(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.chainLogoUrl = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        this.data = dexMultiTokenInfoBean;
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
        return "ImageTextData(text=" + this.text + ", type=" + this.type + ", imageUrl=" + this.imageUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", data=" + this.data + ")";
    }

    public ImageTextData(@NotNull ConsumeData<String> consumeData, int i, @NotNull ConsumeData<String> consumeData2, @NotNull ConsumeData<String> consumeData3, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        this.text = consumeData;
        this.type = i;
        this.imageUrl = consumeData2;
        this.chainLogoUrl = consumeData3;
        this.data = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.bean.ConsumeData:0x0006: INVOKE ("--") STATIC call: o.hdP.EZpvd(java.lang.Object):com.okinc.business.dexlogic.bean.ConsumeData A[MD:<T>:(T):com.okinc.business.dexlogic.bean.ConsumeData<T> (m), WRAPPED] (LINE:56)) : (r4v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:int:0x000f: TERNARY null = ((wrap:int:0x000a: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r5v0 int))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:0x001a: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.bean.ConsumeData:0x0016: INVOKE ("") STATIC call: o.hdP.EZpvd(java.lang.Object):com.okinc.business.dexlogic.bean.ConsumeData A[MD:<T>:(T):com.okinc.business.dexlogic.bean.ConsumeData<T> (m), WRAPPED] (LINE:57)) : (r6v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:0x0023: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.bean.ConsumeData:0x001f: INVOKE ("") STATIC call: o.hdP.EZpvd(java.lang.Object):com.okinc.business.dexlogic.bean.ConsumeData A[MD:<T>:(T):com.okinc.business.dexlogic.bean.ConsumeData<T> (m), WRAPPED] (LINE:58)) : (r7v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r8v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
 A[MD:(com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, int, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void (m)] (LINE:55) call: com.okinc.business.dexlogic.main.swap.trade.bean.ImageTextData.<init>(com.okinc.business.dexlogic.bean.ConsumeData, int, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void type: THIS */
    public /* synthetic */ ImageTextData(ConsumeData consumeData, int i, ConsumeData consumeData2, ConsumeData consumeData3, DexMultiTokenInfoBean dexMultiTokenInfoBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C22332hdP.EZpvd("--") : consumeData, (i2 & 2) != 0 ? 3 : i, (i2 & 4) != 0 ? C22332hdP.EZpvd("") : consumeData2, (i2 & 8) != 0 ? C22332hdP.EZpvd("") : consumeData3, (i2 & 16) != 0 ? null : dexMultiTokenInfoBean);
    }
}
