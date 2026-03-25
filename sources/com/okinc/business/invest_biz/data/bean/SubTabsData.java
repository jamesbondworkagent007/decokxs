package com.okinc.business.invest_biz.data.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SubTabsData {
    public final FiltersData filterConditionVo;
    public final int size;
    public final Integer tabId;
    public final String tabName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubTabsData() {
        this((Integer) null, (String) null, (FiltersData) null, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SubTabsData copy$default(SubTabsData subTabsData, Integer num, String str, FiltersData filtersData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = subTabsData.tabId;
        }
        if ((i2 & 2) != 0) {
            str = subTabsData.tabName;
        }
        if ((i2 & 4) != 0) {
            filtersData = subTabsData.filterConditionVo;
        }
        if ((i2 & 8) != 0) {
            i = subTabsData.size;
        }
        return subTabsData.KWHzl(num, str, filtersData, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiltersData AEQbTJ() {
        return this.filterConditionVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer EZpvd() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubTabsData KWHzl(Integer num, @NotNull String str, @NotNull FiltersData filtersData, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(filtersData, "");
        return new SubTabsData(num, str, filtersData, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.tabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubTabsData)) {
            return false;
        }
        SubTabsData subTabsData = (SubTabsData) obj;
        return Intrinsics.EZpvd(this.tabId, subTabsData.tabId) && Intrinsics.EZpvd((Object) this.tabName, (Object) subTabsData.tabName) && Intrinsics.EZpvd(this.filterConditionVo, subTabsData.filterConditionVo) && this.size == subTabsData.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.tabId;
        return ((((((num == null ? 0 : num.hashCode()) * 31) + this.tabName.hashCode()) * 31) + this.filterConditionVo.hashCode()) * 31) + Integer.hashCode(this.size);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubTabsData(tabId=" + this.tabId + ", tabName=" + this.tabName + ", filterConditionVo=" + this.filterConditionVo + ", size=" + this.size + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.SubTabsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubTabsData> serializer() {
            return SubTabsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubTabsData(int i, Integer num, String str, FiltersData filtersData, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.tabId = (i & 1) == 0 ? null : num;
        if ((i & 2) == 0) {
            this.tabName = "";
        } else {
            this.tabName = str;
        }
        if ((i & 4) == 0) {
            this.filterConditionVo = new FiltersData((List) null, (List) null, (List) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
        } else {
            this.filterConditionVo = filtersData;
        }
        if ((i & 8) == 0) {
            this.size = -1;
        } else {
            this.size = i2;
        }
    }

    public static final /* synthetic */ void KWHzl(SubTabsData subTabsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subTabsData.tabId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, subTabsData.tabId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) subTabsData.tabName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, subTabsData.tabName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(subTabsData.filterConditionVo, new FiltersData((List) null, (List) null, (List) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, FiltersData$$serializer.INSTANCE, subTabsData.filterConditionVo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && subTabsData.size == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, subTabsData.size);
    }

    public SubTabsData(Integer num, @NotNull String str, @NotNull FiltersData filtersData, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(filtersData, "");
        this.tabId = num;
        this.tabName = str;
        this.filterConditionVo = filtersData;
        this.size = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.FiltersData:?: TERNARY null = ((wrap:int:0x000b: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.bean.FiltersData:0x001a: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:455) call: com.okinc.business.invest_biz.data.bean.FiltersData.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r11v0 com.okinc.business.invest_biz.data.bean.FiltersData))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r12v0 int))
 A[MD:(java.lang.Integer, java.lang.String, com.okinc.business.invest_biz.data.bean.FiltersData, int):void (m)] (LINE:449) call: com.okinc.business.invest_biz.data.bean.SubTabsData.<init>(java.lang.Integer, java.lang.String, com.okinc.business.invest_biz.data.bean.FiltersData, int):void type: THIS */
    public /* synthetic */ SubTabsData(Integer num, String str, FiltersData filtersData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? new FiltersData((List) null, (List) null, (List) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null) : filtersData, (i2 & 8) != 0 ? -1 : i);
    }
}
