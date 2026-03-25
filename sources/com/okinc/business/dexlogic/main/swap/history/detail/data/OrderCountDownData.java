package com.okinc.business.dexlogic.main.swap.history.detail.data;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class OrderCountDownData {
    public static final int $stable = 8;
    private String abnormalStatus;
    private ConsumeData<Long> countDown;
    private Object data;
    private ConsumeData<String> state;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderCountDownData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.main.swap.history.detail.data.OrderCountDownData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderCountDownData copy$default(OrderCountDownData orderCountDownData, ConsumeData consumeData, ConsumeData consumeData2, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            consumeData = orderCountDownData.state;
        }
        if ((i & 2) != 0) {
            consumeData2 = orderCountDownData.countDown;
        }
        if ((i & 4) != 0) {
            str = orderCountDownData.abnormalStatus;
        }
        if ((i & 8) != 0) {
            obj = orderCountDownData.data;
        }
        return orderCountDownData.copy(consumeData, consumeData2, str, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component1() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Long> component2() {
        return this.countDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.abnormalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderCountDownData copy(@NotNull ConsumeData<String> consumeData, @NotNull ConsumeData<Long> consumeData2, @NotNull String str, Object obj) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new OrderCountDownData(consumeData, consumeData2, str, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCountDownData)) {
            return false;
        }
        OrderCountDownData orderCountDownData = (OrderCountDownData) obj;
        return Intrinsics.EZpvd(this.state, orderCountDownData.state) && Intrinsics.EZpvd(this.countDown, orderCountDownData.countDown) && Intrinsics.EZpvd((Object) this.abnormalStatus, (Object) orderCountDownData.abnormalStatus) && Intrinsics.EZpvd(this.data, orderCountDownData.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbnormalStatus() {
        return this.abnormalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Long> getCountDown() {
        return this.countDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.state.hashCode();
        int iHashCode2 = this.countDown.hashCode();
        int iHashCode3 = this.abnormalStatus.hashCode();
        Object obj = this.data;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAbnormalStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.abnormalStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountDown(@NotNull ConsumeData<Long> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.countDown = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(Object obj) {
        this.data = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.state = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderCountDownData(state=" + this.state + ", countDown=" + this.countDown + ", abnormalStatus=" + this.abnormalStatus + ", data=" + this.data + ")";
    }

    public OrderCountDownData(@NotNull ConsumeData<String> consumeData, @NotNull ConsumeData<Long> consumeData2, @NotNull String str, Object obj) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.state = consumeData;
        this.countDown = consumeData2;
        this.abnormalStatus = str;
        this.data = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.bean.ConsumeData:0x000b: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) ("0"))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:16) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r6v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x000e: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.bean.ConsumeData:0x001a: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (0 long))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:17) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0021: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0023: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r9v0 java.lang.Object))
 A[MD:(com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.Long>, java.lang.String, java.lang.Object):void (m)] (LINE:15) call: com.okinc.business.dexlogic.main.swap.history.detail.data.OrderCountDownData.<init>(com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, java.lang.String, java.lang.Object):void type: THIS */
    public /* synthetic */ OrderCountDownData(ConsumeData consumeData, ConsumeData consumeData2, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConsumeData((Object) "0", false, 2, (DefaultConstructorMarker) null) : consumeData, (i & 2) != 0 ? new ConsumeData((Object) 0L, false, 2, (DefaultConstructorMarker) null) : consumeData2, (i & 4) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str, (i & 8) != 0 ? null : obj);
    }
}
