package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class UserGuideBean {
    private String ccy;
    private String confirm;
    private String depthCountConfirm;
    private String greekUnit;
    private String invertTradeUnit;
    private String linearTradeUnit;
    private String mgnMode;
    private String navigation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConfirm() {
        return this.confirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepthCountConfirm() {
        return this.depthCountConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGreekUnit() {
        return this.greekUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvertTradeUnit() {
        return this.invertTradeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinearTradeUnit() {
        return this.linearTradeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNavigation() {
        return this.navigation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfirm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.confirm = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepthCountConfirm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depthCountConfirm = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGreekUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.greekUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvertTradeUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.invertTradeUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinearTradeUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.linearTradeUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNavigation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.navigation = str;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.UserGuideBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserGuideBean> serializer() {
            return UserGuideBean$$serializer.INSTANCE;
        }
    }

    public UserGuideBean() {
        this.invertTradeUnit = "";
        this.linearTradeUnit = "";
        this.confirm = "";
        this.ccy = "";
        this.greekUnit = "";
        this.depthCountConfirm = "";
        this.navigation = "";
        this.mgnMode = "";
    }

    public /* synthetic */ UserGuideBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.invertTradeUnit = "";
        } else {
            this.invertTradeUnit = str;
        }
        if ((i & 2) == 0) {
            this.linearTradeUnit = "";
        } else {
            this.linearTradeUnit = str2;
        }
        if ((i & 4) == 0) {
            this.confirm = "";
        } else {
            this.confirm = str3;
        }
        if ((i & 8) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str4;
        }
        if ((i & 16) == 0) {
            this.greekUnit = "";
        } else {
            this.greekUnit = str5;
        }
        if ((i & 32) == 0) {
            this.depthCountConfirm = "";
        } else {
            this.depthCountConfirm = str6;
        }
        if ((i & 64) == 0) {
            this.navigation = "";
        } else {
            this.navigation = str7;
        }
        if ((i & 128) == 0) {
            this.mgnMode = "";
        } else {
            this.mgnMode = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(UserGuideBean userGuideBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) userGuideBean.invertTradeUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, userGuideBean.invertTradeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) userGuideBean.linearTradeUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, userGuideBean.linearTradeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) userGuideBean.confirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, userGuideBean.confirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) userGuideBean.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, userGuideBean.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) userGuideBean.greekUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, userGuideBean.greekUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) userGuideBean.depthCountConfirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, userGuideBean.depthCountConfirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) userGuideBean.navigation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, userGuideBean.navigation);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) userGuideBean.mgnMode, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, userGuideBean.mgnMode);
    }
}
