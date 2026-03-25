package com.okinc.business.dexlogic.bean;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55105xdf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class LiquidityHeaderBean implements InterfaceC55105xdf {
    public static final int $stable = 8;
    private List<Object> sectionDataList;
    private boolean showSuspension;
    private String suspensionTag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidityHeaderBean() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public List<Object> getSectionDataList() {
        return this.sectionDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public boolean getShowSuspension() {
        return this.showSuspension;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public String getSuspensionTag() {
        return this.suspensionTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSectionDataList(@NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.sectionDataList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setShowSuspension(boolean z) {
        this.showSuspension = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSuspensionTag(String str) {
        this.suspensionTag = str;
    }

    public LiquidityHeaderBean(boolean z, String str, @NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.showSuspension = z;
        this.suspensionTag = str;
        this.sectionDataList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0011: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:20) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.List))
 A[MD:(boolean, java.lang.String, java.util.List<java.lang.Object>):void (m)] (LINE:17) call: com.okinc.business.dexlogic.bean.LiquidityHeaderBean.<init>(boolean, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ LiquidityHeaderBean(boolean z, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new ArrayList() : list);
    }
}
