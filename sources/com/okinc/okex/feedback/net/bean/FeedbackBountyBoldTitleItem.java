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
public final class FeedbackBountyBoldTitleItem {
    private String summary;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FeedbackBountyBoldTitleItem() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FeedbackBountyBoldTitleItem copy$default(FeedbackBountyBoldTitleItem feedbackBountyBoldTitleItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackBountyBoldTitleItem.title;
        }
        if ((i & 2) != 0) {
            str2 = feedbackBountyBoldTitleItem.summary;
        }
        return feedbackBountyBoldTitleItem.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.summary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeedbackBountyBoldTitleItem copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FeedbackBountyBoldTitleItem(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackBountyBoldTitleItem)) {
            return false;
        }
        FeedbackBountyBoldTitleItem feedbackBountyBoldTitleItem = (FeedbackBountyBoldTitleItem) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) feedbackBountyBoldTitleItem.title) && Intrinsics.EZpvd((Object) this.summary, (Object) feedbackBountyBoldTitleItem.summary);
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
        return (this.title.hashCode() * 31) + this.summary.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSummary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.summary = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeedbackBountyBoldTitleItem(title=" + this.title + ", summary=" + this.summary + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.net.bean.FeedbackBountyBoldTitleItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FeedbackBountyBoldTitleItem> serializer() {
            return FeedbackBountyBoldTitleItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeedbackBountyBoldTitleItem(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.summary = "";
        } else {
            this.summary = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(FeedbackBountyBoldTitleItem feedbackBountyBoldTitleItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) feedbackBountyBoldTitleItem.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, feedbackBountyBoldTitleItem.title);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) feedbackBountyBoldTitleItem.summary, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, feedbackBountyBoldTitleItem.summary);
    }

    public FeedbackBountyBoldTitleItem(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.summary = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:33) call: com.okinc.okex.feedback.net.bean.FeedbackBountyBoldTitleItem.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FeedbackBountyBoldTitleItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
