package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.DisplayPageResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.SupportBannerResponseBean;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SupportBannerBean {
    private final int bannerId;
    private final String content;
    private final boolean dismissible;
    private final List<DisplayPageBean> displayPages;
    private final int pollingTimeFrameInSeconds;
    private final String url;
    private final String urlDisplayLabel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(DisplayPageBean$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportBannerBean() {
        this((String) null, false, 0, (String) null, (String) null, (List) null, 0, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.crcore.shared.net.responsebean.bsc.SupportBannerBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportBannerBean copy$default(SupportBannerBean supportBannerBean, String str, boolean z, int i, String str2, String str3, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = supportBannerBean.content;
        }
        if ((i3 & 2) != 0) {
            z = supportBannerBean.dismissible;
        }
        boolean z2 = z;
        if ((i3 & 4) != 0) {
            i = supportBannerBean.bannerId;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str2 = supportBannerBean.url;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            str3 = supportBannerBean.urlDisplayLabel;
        }
        String str5 = str3;
        if ((i3 & 32) != 0) {
            list = supportBannerBean.displayPages;
        }
        List list2 = list;
        if ((i3 & 64) != 0) {
            i2 = supportBannerBean.pollingTimeFrameInSeconds;
        }
        return supportBannerBean.copy(str, z2, i4, str4, str5, list2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.dismissible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.bannerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.urlDisplayLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DisplayPageBean> component6() {
        return this.displayPages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.pollingTimeFrameInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportBannerBean copy(@NotNull String str, boolean z, int i, @NotNull String str2, @NotNull String str3, @NotNull List<DisplayPageBean> list, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SupportBannerBean(str, z, i, str2, str3, list, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportBannerBean)) {
            return false;
        }
        SupportBannerBean supportBannerBean = (SupportBannerBean) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) supportBannerBean.content) && this.dismissible == supportBannerBean.dismissible && this.bannerId == supportBannerBean.bannerId && Intrinsics.EZpvd((Object) this.url, (Object) supportBannerBean.url) && Intrinsics.EZpvd((Object) this.urlDisplayLabel, (Object) supportBannerBean.urlDisplayLabel) && Intrinsics.EZpvd(this.displayPages, supportBannerBean.displayPages) && this.pollingTimeFrameInSeconds == supportBannerBean.pollingTimeFrameInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBannerId() {
        return this.bannerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDismissible() {
        return this.dismissible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DisplayPageBean> getDisplayPages() {
        return this.displayPages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPollingTimeFrameInSeconds() {
        return this.pollingTimeFrameInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlDisplayLabel() {
        return this.urlDisplayLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.content.hashCode() * 31) + Boolean.hashCode(this.dismissible)) * 31) + Integer.hashCode(this.bannerId)) * 31) + this.url.hashCode()) * 31) + this.urlDisplayLabel.hashCode()) * 31) + this.displayPages.hashCode()) * 31) + Integer.hashCode(this.pollingTimeFrameInSeconds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportBannerBean(content=" + this.content + ", dismissible=" + this.dismissible + ", bannerId=" + this.bannerId + ", url=" + this.url + ", urlDisplayLabel=" + this.urlDisplayLabel + ", displayPages=" + this.displayPages + ", pollingTimeFrameInSeconds=" + this.pollingTimeFrameInSeconds + ")";
    }

    public /* synthetic */ SupportBannerBean(int i, String str, boolean z, int i2, String str2, String str3, List list, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.content = "";
        } else {
            this.content = str;
        }
        if ((i & 2) == 0) {
            this.dismissible = true;
        } else {
            this.dismissible = z;
        }
        if ((i & 4) == 0) {
            this.bannerId = 0;
        } else {
            this.bannerId = i2;
        }
        if ((i & 8) == 0) {
            this.url = "";
        } else {
            this.url = str2;
        }
        if ((i & 16) == 0) {
            this.urlDisplayLabel = "";
        } else {
            this.urlDisplayLabel = str3;
        }
        if ((i & 32) == 0) {
            this.displayPages = yDY.AhwBna();
        } else {
            this.displayPages = list;
        }
        if ((i & 64) == 0) {
            this.pollingTimeFrameInSeconds = 0;
        } else {
            this.pollingTimeFrameInSeconds = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SupportBannerBean supportBannerBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) supportBannerBean.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, supportBannerBean.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !supportBannerBean.dismissible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, supportBannerBean.dismissible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || supportBannerBean.bannerId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, supportBannerBean.bannerId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) supportBannerBean.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, supportBannerBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) supportBannerBean.urlDisplayLabel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, supportBannerBean.urlDisplayLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(supportBannerBean.displayPages, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], supportBannerBean.displayPages);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && supportBannerBean.pollingTimeFrameInSeconds == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, supportBannerBean.pollingTimeFrameInSeconds);
    }

    public SupportBannerBean(@NotNull String str, boolean z, int i, @NotNull String str2, @NotNull String str3, @NotNull List<DisplayPageBean> list, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.content = str;
        this.dismissible = z;
        this.bannerId = i;
        this.url = str2;
        this.urlDisplayLabel = str3;
        this.displayPages = list;
        this.pollingTimeFrameInSeconds = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:boolean:0x000e: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r7v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
  (wrap:java.util.List:0x002c: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0028: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r11v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
 A[MD:(java.lang.String, boolean, int, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.DisplayPageBean>, int):void (m)] (LINE:9) call: com.okinc.crcore.shared.net.responsebean.bsc.SupportBannerBean.<init>(java.lang.String, boolean, int, java.lang.String, java.lang.String, java.util.List, int):void type: THIS */
    public /* synthetic */ SupportBannerBean(String str, boolean z, int i, String str2, String str3, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str2, (i3 & 16) == 0 ? str3 : "", (i3 & 32) != 0 ? yDY.AhwBna() : list, (i3 & 64) != 0 ? 0 : i2);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.SupportBannerBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SupportBannerBean> serializer() {
            return SupportBannerBean$$serializer.INSTANCE;
        }

        public final SupportBannerBean OLrzqt(@NotNull SupportBannerResponseBean supportBannerResponseBean) {
            Intrinsics.checkNotNullParameter(supportBannerResponseBean, "");
            String content = supportBannerResponseBean.getContent();
            boolean dismissible = supportBannerResponseBean.getDismissible();
            int bannerId = supportBannerResponseBean.getBannerId();
            String url = supportBannerResponseBean.getUrl();
            String urlDisplayLabel = supportBannerResponseBean.getUrlDisplayLabel();
            List<DisplayPageResponseBean> displayPages = supportBannerResponseBean.getDisplayPages();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(displayPages, 10));
            Iterator<T> it = displayPages.iterator();
            while (it.hasNext()) {
                arrayList.add(DisplayPageBean.Companion.KWHzl((DisplayPageResponseBean) it.next()));
            }
            return new SupportBannerBean(content, dismissible, bannerId, url, urlDisplayLabel, arrayList, supportBannerResponseBean.getPollingTimeFrameInSeconds());
        }
    }
}
