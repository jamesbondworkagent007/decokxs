package com.okinc.okex.center.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class SuggestedActionBean {
    private final String actionDescription;
    private final String actionTitle;
    private final SelfServiceToolBean selfServiceTool;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SuggestedActionBean copy$default(SuggestedActionBean suggestedActionBean, String str, String str2, SelfServiceToolBean selfServiceToolBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestedActionBean.actionTitle;
        }
        if ((i & 2) != 0) {
            str2 = suggestedActionBean.actionDescription;
        }
        if ((i & 4) != 0) {
            selfServiceToolBean = suggestedActionBean.selfServiceTool;
        }
        return suggestedActionBean.copy(str, str2, selfServiceToolBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.actionTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.actionDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceToolBean component3() {
        return this.selfServiceTool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuggestedActionBean copy(@NotNull String str, @NotNull String str2, SelfServiceToolBean selfServiceToolBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SuggestedActionBean(str, str2, selfServiceToolBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedActionBean)) {
            return false;
        }
        SuggestedActionBean suggestedActionBean = (SuggestedActionBean) obj;
        return Intrinsics.EZpvd((Object) this.actionTitle, (Object) suggestedActionBean.actionTitle) && Intrinsics.EZpvd((Object) this.actionDescription, (Object) suggestedActionBean.actionDescription) && Intrinsics.EZpvd(this.selfServiceTool, suggestedActionBean.selfServiceTool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActionDescription() {
        return this.actionDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceToolBean getSelfServiceTool() {
        return this.selfServiceTool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.actionTitle.hashCode();
        int iHashCode2 = this.actionDescription.hashCode();
        SelfServiceToolBean selfServiceToolBean = this.selfServiceTool;
        return (((iHashCode * 31) + iHashCode2) * 31) + (selfServiceToolBean == null ? 0 : selfServiceToolBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuggestedActionBean(actionTitle=" + this.actionTitle + ", actionDescription=" + this.actionDescription + ", selfServiceTool=" + this.selfServiceTool + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.SuggestedActionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SuggestedActionBean> serializer() {
            return SuggestedActionBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SuggestedActionBean(int i, String str, String str2, SelfServiceToolBean selfServiceToolBean, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, SuggestedActionBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.actionTitle = "";
        } else {
            this.actionTitle = str;
        }
        if ((i & 2) == 0) {
            this.actionDescription = "";
        } else {
            this.actionDescription = str2;
        }
        this.selfServiceTool = selfServiceToolBean;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SuggestedActionBean suggestedActionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) suggestedActionBean.actionTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, suggestedActionBean.actionTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) suggestedActionBean.actionDescription, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, suggestedActionBean.actionDescription);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, SelfServiceToolBean$$serializer.INSTANCE, suggestedActionBean.selfServiceTool);
    }

    public SuggestedActionBean(@NotNull String str, @NotNull String str2, SelfServiceToolBean selfServiceToolBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.actionTitle = str;
        this.actionDescription = str2;
        this.selfServiceTool = selfServiceToolBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (r4v0 com.okinc.okex.center.bean.SelfServiceToolBean)
 A[MD:(java.lang.String, java.lang.String, com.okinc.okex.center.bean.SelfServiceToolBean):void (m)] (LINE:11) call: com.okinc.okex.center.bean.SuggestedActionBean.<init>(java.lang.String, java.lang.String, com.okinc.okex.center.bean.SelfServiceToolBean):void type: THIS */
    public /* synthetic */ SuggestedActionBean(String str, String str2, SelfServiceToolBean selfServiceToolBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, selfServiceToolBean);
    }
}
