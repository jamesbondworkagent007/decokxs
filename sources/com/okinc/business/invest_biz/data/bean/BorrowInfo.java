package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class BorrowInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String clickAction;
    public final int contentType;
    public final HoverData hoverOnData;
    public final String tipContent;
    public final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BorrowInfo() {
        this((String) null, (String) null, (String) null, (HoverData) null, 0, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BorrowInfo copy$default(BorrowInfo borrowInfo, String str, String str2, String str3, HoverData hoverData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = borrowInfo.title;
        }
        if ((i2 & 2) != 0) {
            str2 = borrowInfo.tipContent;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = borrowInfo.clickAction;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            hoverData = borrowInfo.hoverOnData;
        }
        HoverData hoverData2 = hoverData;
        if ((i2 & 16) != 0) {
            i = borrowInfo.contentType;
        }
        return borrowInfo.EZpvd(str, str4, str5, hoverData2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BorrowInfo EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, HoverData hoverData, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BorrowInfo(str, str2, str3, hoverData, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorrowInfo)) {
            return false;
        }
        BorrowInfo borrowInfo = (BorrowInfo) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) borrowInfo.title) && Intrinsics.EZpvd((Object) this.tipContent, (Object) borrowInfo.tipContent) && Intrinsics.EZpvd((Object) this.clickAction, (Object) borrowInfo.clickAction) && Intrinsics.EZpvd(this.hoverOnData, borrowInfo.hoverOnData) && this.contentType == borrowInfo.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.tipContent.hashCode();
        int iHashCode3 = this.clickAction.hashCode();
        HoverData hoverData = this.hoverOnData;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (hoverData == null ? 0 : hoverData.hashCode())) * 31) + Integer.hashCode(this.contentType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BorrowInfo(title=" + this.title + ", tipContent=" + this.tipContent + ", clickAction=" + this.clickAction + ", hoverOnData=" + this.hoverOnData + ", contentType=" + this.contentType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.BorrowInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BorrowInfo> serializer() {
            return BorrowInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BorrowInfo(int i, String str, String str2, String str3, HoverData hoverData, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.tipContent = "";
        } else {
            this.tipContent = str2;
        }
        if ((i & 4) == 0) {
            this.clickAction = "";
        } else {
            this.clickAction = str3;
        }
        if ((i & 8) == 0) {
            this.hoverOnData = null;
        } else {
            this.hoverOnData = hoverData;
        }
        if ((i & 16) == 0) {
            this.contentType = -1;
        } else {
            this.contentType = i2;
        }
    }

    public static final /* synthetic */ void OLrzqt(BorrowInfo borrowInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) borrowInfo.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, borrowInfo.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) borrowInfo.tipContent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, borrowInfo.tipContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) borrowInfo.clickAction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, borrowInfo.clickAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || borrowInfo.hoverOnData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, HoverData$$serializer.INSTANCE, borrowInfo.hoverOnData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && borrowInfo.contentType == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, borrowInfo.contentType);
    }

    public BorrowInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, HoverData hoverData, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.tipContent = str2;
        this.clickAction = str3;
        this.hoverOnData = hoverData;
        this.contentType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:com.okinc.business.invest_biz.data.bean.HoverData:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.HoverData) : (r7v0 com.okinc.business.invest_biz.data.bean.HoverData))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r8v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.HoverData, int):void (m)] (LINE:477) call: com.okinc.business.invest_biz.data.bean.BorrowInfo.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.HoverData, int):void type: THIS */
    public /* synthetic */ BorrowInfo(String str, String str2, String str3, HoverData hoverData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? null : hoverData, (i2 & 16) != 0 ? -1 : i);
    }
}
