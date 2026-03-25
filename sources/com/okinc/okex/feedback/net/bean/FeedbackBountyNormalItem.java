package com.okinc.okex.feedback.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class FeedbackBountyNormalItem {
    private String award;
    private int iconRes;
    private String summary;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FeedbackBountyNormalItem() {
        this((String) null, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FeedbackBountyNormalItem copy$default(FeedbackBountyNormalItem feedbackBountyNormalItem, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedbackBountyNormalItem.title;
        }
        if ((i2 & 2) != 0) {
            i = feedbackBountyNormalItem.iconRes;
        }
        if ((i2 & 4) != 0) {
            str2 = feedbackBountyNormalItem.award;
        }
        if ((i2 & 8) != 0) {
            str3 = feedbackBountyNormalItem.summary;
        }
        return feedbackBountyNormalItem.copy(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.iconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.award;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.summary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeedbackBountyNormalItem copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new FeedbackBountyNormalItem(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackBountyNormalItem)) {
            return false;
        }
        FeedbackBountyNormalItem feedbackBountyNormalItem = (FeedbackBountyNormalItem) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) feedbackBountyNormalItem.title) && this.iconRes == feedbackBountyNormalItem.iconRes && Intrinsics.EZpvd((Object) this.award, (Object) feedbackBountyNormalItem.award) && Intrinsics.EZpvd((Object) this.summary, (Object) feedbackBountyNormalItem.summary);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAward() {
        return this.award;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIconRes() {
        return this.iconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.title.hashCode() * 31) + Integer.hashCode(this.iconRes)) * 31) + this.award.hashCode()) * 31) + this.summary.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAward(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.award = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconRes(int i) {
        this.iconRes = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSummary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.summary = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeedbackBountyNormalItem(title=" + this.title + ", iconRes=" + this.iconRes + ", award=" + this.award + ", summary=" + this.summary + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.net.bean.FeedbackBountyNormalItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FeedbackBountyNormalItem> serializer() {
            return FeedbackBountyNormalItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeedbackBountyNormalItem(int i, String str, int i2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.iconRes = -1;
        } else {
            this.iconRes = i2;
        }
        if ((i & 4) == 0) {
            this.award = "";
        } else {
            this.award = str2;
        }
        if ((i & 8) == 0) {
            this.summary = "";
        } else {
            this.summary = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(FeedbackBountyNormalItem feedbackBountyNormalItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) feedbackBountyNormalItem.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, feedbackBountyNormalItem.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || feedbackBountyNormalItem.iconRes != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, feedbackBountyNormalItem.iconRes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) feedbackBountyNormalItem.award, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, feedbackBountyNormalItem.award);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) feedbackBountyNormalItem.summary, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, feedbackBountyNormalItem.summary);
    }

    public FeedbackBountyNormalItem(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.iconRes = i;
        this.award = str2;
        this.summary = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:37) call: com.okinc.okex.feedback.net.bean.FeedbackBountyNormalItem.<init>(java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FeedbackBountyNormalItem(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
