package com.okinc.business.dexlogic.main.swap.trade.bean;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class EditTextData {
    public static final int $stable = 8;
    private String checkData;
    private String content;
    private String data;
    private boolean isLimit;
    private boolean isWarning;
    private ConsumeData<String> label;
    private String maxData;
    private boolean needForbidden;
    private ConsumeData<String> originPrice;
    private boolean resetFoucs;
    private String reverseInputData;
    private String secondDataLabel;
    private ConsumeData<String> secondLabel;
    private boolean setInput;
    private int status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EditTextData() {
        this(null, null, null, null, 0, false, false, null, null, false, null, null, null, false, false, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.maxData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component12() {
        return this.originPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.reverseInputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.needForbidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.isLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component2() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
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
        return this.resetFoucs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component8() {
        return this.secondLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.secondDataLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditTextData copy(@NotNull String str, @NotNull ConsumeData<String> consumeData, @NotNull String str2, @NotNull String str3, int i, boolean z, boolean z2, @NotNull ConsumeData<String> consumeData2, @NotNull String str4, boolean z3, @NotNull String str5, @NotNull ConsumeData<String> consumeData3, @NotNull String str6, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new EditTextData(str, consumeData, str2, str3, i, z, z2, consumeData2, str4, z3, str5, consumeData3, str6, z4, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditTextData)) {
            return false;
        }
        EditTextData editTextData = (EditTextData) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) editTextData.content) && Intrinsics.EZpvd(this.label, editTextData.label) && Intrinsics.EZpvd((Object) this.data, (Object) editTextData.data) && Intrinsics.EZpvd((Object) this.checkData, (Object) editTextData.checkData) && this.status == editTextData.status && this.setInput == editTextData.setInput && this.resetFoucs == editTextData.resetFoucs && Intrinsics.EZpvd(this.secondLabel, editTextData.secondLabel) && Intrinsics.EZpvd((Object) this.secondDataLabel, (Object) editTextData.secondDataLabel) && this.isWarning == editTextData.isWarning && Intrinsics.EZpvd((Object) this.maxData, (Object) editTextData.maxData) && Intrinsics.EZpvd(this.originPrice, editTextData.originPrice) && Intrinsics.EZpvd((Object) this.reverseInputData, (Object) editTextData.reverseInputData) && this.needForbidden == editTextData.needForbidden && this.isLimit == editTextData.isLimit;
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
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromDataOrigin() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxData() {
        return this.maxData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedForbidden() {
        return this.needForbidden;
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
    public final String getReverseInputData() {
        return this.reverseInputData;
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
    public int hashCode() {
        return (((((((((((((((((((((((((((this.content.hashCode() * 31) + this.label.hashCode()) * 31) + this.data.hashCode()) * 31) + this.checkData.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Boolean.hashCode(this.setInput)) * 31) + Boolean.hashCode(this.resetFoucs)) * 31) + this.secondLabel.hashCode()) * 31) + this.secondDataLabel.hashCode()) * 31) + Boolean.hashCode(this.isWarning)) * 31) + this.maxData.hashCode()) * 31) + this.originPrice.hashCode()) * 31) + this.reverseInputData.hashCode()) * 31) + Boolean.hashCode(this.needForbidden)) * 31) + Boolean.hashCode(this.isLimit);
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
    public final void setCheckData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.checkData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.data = str;
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
    public final void setMaxData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedForbidden(boolean z) {
        this.needForbidden = z;
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
    public final void setReverseInputData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reverseInputData = str;
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
    public final void setWarning(boolean z) {
        this.isWarning = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditTextData(content=" + this.content + ", label=" + this.label + ", data=" + this.data + ", checkData=" + this.checkData + ", status=" + this.status + ", setInput=" + this.setInput + ", resetFoucs=" + this.resetFoucs + ", secondLabel=" + this.secondLabel + ", secondDataLabel=" + this.secondDataLabel + ", isWarning=" + this.isWarning + ", maxData=" + this.maxData + ", originPrice=" + this.originPrice + ", reverseInputData=" + this.reverseInputData + ", needForbidden=" + this.needForbidden + ", isLimit=" + this.isLimit + ")";
    }

    public EditTextData(@NotNull String str, @NotNull ConsumeData<String> consumeData, @NotNull String str2, @NotNull String str3, int i, boolean z, boolean z2, @NotNull ConsumeData<String> consumeData2, @NotNull String str4, boolean z3, @NotNull String str5, @NotNull ConsumeData<String> consumeData3, @NotNull String str6, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.content = str;
        this.label = consumeData;
        this.data = str2;
        this.checkData = str3;
        this.status = i;
        this.setInput = z;
        this.resetFoucs = z2;
        this.secondLabel = consumeData2;
        this.secondDataLabel = str4;
        this.isWarning = z3;
        this.maxData = str5;
        this.originPrice = consumeData3;
        this.reverseInputData = str6;
        this.needForbidden = z4;
        this.isLimit = z5;
    }

    public /* synthetic */ EditTextData(String str, ConsumeData consumeData, String str2, String str3, int i, boolean z, boolean z2, ConsumeData consumeData2, String str4, boolean z3, String str5, ConsumeData consumeData3, String str6, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        ConsumeData consumeData4;
        String str8 = (i2 & 1) != 0 ? "" : str;
        ConsumeData consumeData5 = (i2 & 2) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData;
        String str9 = (i2 & 4) != 0 ? "" : str2;
        String str10 = (i2 & 8) != 0 ? "" : str3;
        int i3 = (i2 & 16) != 0 ? 0 : i;
        boolean z6 = (i2 & 32) != 0 ? false : z;
        boolean z7 = (i2 & 64) != 0 ? false : z2;
        ConsumeData consumeData6 = (i2 & 128) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData2;
        String str11 = (i2 & 256) != 0 ? "" : str4;
        boolean z8 = (i2 & 512) != 0 ? false : z3;
        String str12 = (i2 & 1024) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str5;
        if ((i2 & 2048) != 0) {
            str7 = str12;
            consumeData4 = new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null);
        } else {
            str7 = str12;
            consumeData4 = consumeData3;
        }
        this(str8, consumeData5, str9, str10, i3, z6, z7, consumeData6, str11, z8, str7, consumeData4, (i2 & 4096) == 0 ? str6 : "", (i2 & 8192) != 0 ? false : z4, (i2 & 16384) == 0 ? z5 : false);
    }
}
