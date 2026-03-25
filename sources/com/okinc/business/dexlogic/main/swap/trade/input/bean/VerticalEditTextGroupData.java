package com.okinc.business.dexlogic.main.swap.trade.input.bean;

import com.okinc.business.dexlogic.bean.ConsumeData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class VerticalEditTextGroupData {
    public static final int $stable = 8;
    private String checkData;
    private String content;
    private Object data;
    private final Boolean inputCanEdit;
    private boolean isForBidden;
    private boolean isLimit;
    private boolean isWarning;
    private ConsumeData<String> label;
    private ConsumeData<String> originPrice;
    private boolean resetFoucs;
    private String secondDataLabel;
    private ConsumeData<String> secondLabel;
    private boolean setInput;
    private int status;
    private int vgLabelPaddingTop;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VerticalEditTextGroupData() {
        this(null, null, null, null, 0, false, false, false, null, null, false, 0, null, false, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.secondDataLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.vgLabelPaddingTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component13() {
        return this.originPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component15() {
        return this.inputCanEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component2() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.checkData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.setInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isForBidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.resetFoucs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component9() {
        return this.secondLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerticalEditTextGroupData copy(@NotNull String str, @NotNull ConsumeData<String> consumeData, Object obj, String str2, int i, boolean z, boolean z2, boolean z3, @NotNull ConsumeData<String> consumeData2, @NotNull String str3, boolean z4, int i2, @NotNull ConsumeData<String> consumeData3, boolean z5, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        return new VerticalEditTextGroupData(str, consumeData, obj, str2, i, z, z2, z3, consumeData2, str3, z4, i2, consumeData3, z5, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalEditTextGroupData)) {
            return false;
        }
        VerticalEditTextGroupData verticalEditTextGroupData = (VerticalEditTextGroupData) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) verticalEditTextGroupData.content) && Intrinsics.EZpvd(this.label, verticalEditTextGroupData.label) && Intrinsics.EZpvd(this.data, verticalEditTextGroupData.data) && Intrinsics.EZpvd((Object) this.checkData, (Object) verticalEditTextGroupData.checkData) && this.status == verticalEditTextGroupData.status && this.setInput == verticalEditTextGroupData.setInput && this.isForBidden == verticalEditTextGroupData.isForBidden && this.resetFoucs == verticalEditTextGroupData.resetFoucs && Intrinsics.EZpvd(this.secondLabel, verticalEditTextGroupData.secondLabel) && Intrinsics.EZpvd((Object) this.secondDataLabel, (Object) verticalEditTextGroupData.secondDataLabel) && this.isWarning == verticalEditTextGroupData.isWarning && this.vgLabelPaddingTop == verticalEditTextGroupData.vgLabelPaddingTop && Intrinsics.EZpvd(this.originPrice, verticalEditTextGroupData.originPrice) && this.isLimit == verticalEditTextGroupData.isLimit && Intrinsics.EZpvd(this.inputCanEdit, verticalEditTextGroupData.inputCanEdit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCheckData() {
        return this.checkData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getInputCanEdit() {
        return this.inputCanEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getOriginPrice() {
        return this.originPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getResetFoucs() {
        return this.resetFoucs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondDataLabel() {
        return this.secondDataLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getSecondLabel() {
        return this.secondLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSetInput() {
        return this.setInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVgLabelPaddingTop() {
        return this.vgLabelPaddingTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.content.hashCode();
        int iHashCode2 = this.label.hashCode();
        Object obj = this.data;
        int iHashCode3 = obj == null ? 0 : obj.hashCode();
        String str = this.checkData;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = Integer.hashCode(this.status);
        int iHashCode6 = Boolean.hashCode(this.setInput);
        int iHashCode7 = Boolean.hashCode(this.isForBidden);
        int iHashCode8 = Boolean.hashCode(this.resetFoucs);
        int iHashCode9 = this.secondLabel.hashCode();
        int iHashCode10 = this.secondDataLabel.hashCode();
        int iHashCode11 = Boolean.hashCode(this.isWarning);
        int iHashCode12 = Integer.hashCode(this.vgLabelPaddingTop);
        int iHashCode13 = this.originPrice.hashCode();
        int iHashCode14 = Boolean.hashCode(this.isLimit);
        Boolean bool = this.inputCanEdit;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isForBidden() {
        return this.isForBidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLimit() {
        return this.isLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isWarning() {
        return this.isWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCheckData(String str) {
        this.checkData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(Object obj) {
        this.data = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setForBidden(boolean z) {
        this.isForBidden = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLabel(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.label = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimit(boolean z) {
        this.isLimit = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginPrice(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.originPrice = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResetFoucs(boolean z) {
        this.resetFoucs = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondDataLabel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.secondDataLabel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondLabel(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.secondLabel = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSetInput(boolean z) {
        this.setInput = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVgLabelPaddingTop(int i) {
        this.vgLabelPaddingTop = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWarning(boolean z) {
        this.isWarning = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerticalEditTextGroupData(content=" + this.content + ", label=" + this.label + ", data=" + this.data + ", checkData=" + this.checkData + ", status=" + this.status + ", setInput=" + this.setInput + ", isForBidden=" + this.isForBidden + ", resetFoucs=" + this.resetFoucs + ", secondLabel=" + this.secondLabel + ", secondDataLabel=" + this.secondDataLabel + ", isWarning=" + this.isWarning + ", vgLabelPaddingTop=" + this.vgLabelPaddingTop + ", originPrice=" + this.originPrice + ", isLimit=" + this.isLimit + ", inputCanEdit=" + this.inputCanEdit + ")";
    }

    public VerticalEditTextGroupData(@NotNull String str, @NotNull ConsumeData<String> consumeData, Object obj, String str2, int i, boolean z, boolean z2, boolean z3, @NotNull ConsumeData<String> consumeData2, @NotNull String str3, boolean z4, int i2, @NotNull ConsumeData<String> consumeData3, boolean z5, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        this.content = str;
        this.label = consumeData;
        this.data = obj;
        this.checkData = str2;
        this.status = i;
        this.setInput = z;
        this.isForBidden = z2;
        this.resetFoucs = z3;
        this.secondLabel = consumeData2;
        this.secondDataLabel = str3;
        this.isWarning = z4;
        this.vgLabelPaddingTop = i2;
        this.originPrice = consumeData3;
        this.isLimit = z5;
        this.inputCanEdit = bool;
    }

    public /* synthetic */ VerticalEditTextGroupData(String str, ConsumeData consumeData, Object obj, String str2, int i, boolean z, boolean z2, boolean z3, ConsumeData consumeData2, String str3, boolean z4, int i2, ConsumeData consumeData3, boolean z5, Boolean bool, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        boolean z6;
        Boolean bool2;
        ConsumeData consumeData4;
        String str4 = (i3 & 1) != 0 ? "" : str;
        ConsumeData consumeData5 = (i3 & 2) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData;
        Object obj2 = (i3 & 4) != 0 ? null : obj;
        String str5 = (i3 & 8) != 0 ? null : str2;
        int i5 = (i3 & 16) != 0 ? 0 : i;
        boolean z7 = (i3 & 32) != 0 ? false : z;
        boolean z8 = (i3 & 64) != 0 ? false : z2;
        boolean z9 = (i3 & 128) != 0 ? false : z3;
        ConsumeData consumeData6 = (i3 & 256) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData2;
        String str6 = (i3 & 512) != 0 ? "" : str3;
        boolean z10 = (i3 & 1024) != 0 ? false : z4;
        int i6 = (i3 & 2048) != 0 ? 0 : i2;
        if ((i3 & 4096) != 0) {
            i4 = i6;
            z6 = z10;
            bool2 = null;
            consumeData4 = new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null);
        } else {
            i4 = i6;
            z6 = z10;
            bool2 = null;
            consumeData4 = consumeData3;
        }
        this(str4, consumeData5, obj2, str5, i5, z7, z8, z9, consumeData6, str6, z6, i4, consumeData4, (i3 & 8192) == 0 ? z5 : false, (i3 & 16384) == 0 ? bool : bool2);
    }
}
