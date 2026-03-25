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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class HeaderSubData {
    public final boolean hasSubTab;
    public final List<SubTabsData> subTabVos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SubTabsData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HeaderSubData() {
        this(false, (List) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.HeaderSubData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderSubData copy$default(HeaderSubData headerSubData, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = headerSubData.hasSubTab;
        }
        if ((i & 2) != 0) {
            list = headerSubData.subTabVos;
        }
        return headerSubData.OLrzqt(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SubTabsData> AEQbTJ() {
        return this.subTabVos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeaderSubData OLrzqt(boolean z, @NotNull List<SubTabsData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new HeaderSubData(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderSubData)) {
            return false;
        }
        HeaderSubData headerSubData = (HeaderSubData) obj;
        return this.hasSubTab == headerSubData.hasSubTab && Intrinsics.EZpvd(this.subTabVos, headerSubData.subTabVos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.hasSubTab) * 31) + this.subTabVos.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HeaderSubData(hasSubTab=" + this.hasSubTab + ", subTabVos=" + this.subTabVos + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.HeaderSubData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HeaderSubData> serializer() {
            return HeaderSubData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HeaderSubData(int i, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.hasSubTab = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.subTabVos = yDY.AhwBna();
        } else {
            this.subTabVos = list;
        }
    }

    public static final /* synthetic */ void OLrzqt(HeaderSubData headerSubData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || headerSubData.hasSubTab) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, headerSubData.hasSubTab);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(headerSubData.subTabVos, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], headerSubData.subTabVos);
    }

    public HeaderSubData(boolean z, @NotNull List<SubTabsData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hasSubTab = z;
        this.subTabVos = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:445)) : (r2v0 java.util.List))
 A[MD:(boolean, java.util.List<com.okinc.business.invest_biz.data.bean.SubTabsData>):void (m)] (LINE:441) call: com.okinc.business.invest_biz.data.bean.HeaderSubData.<init>(boolean, java.util.List):void type: THIS */
    public /* synthetic */ HeaderSubData(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
