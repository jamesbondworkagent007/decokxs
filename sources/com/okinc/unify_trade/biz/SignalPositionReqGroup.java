package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SignalPositionReqGroup {
    private String algoId;
    private boolean hasWs;
    private String instId;
    private String instType;
    private boolean isInstIdList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalPositionReqGroup copy$default(SignalPositionReqGroup signalPositionReqGroup, boolean z, String str, String str2, String str3, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = signalPositionReqGroup.hasWs;
        }
        if ((i & 2) != 0) {
            str = signalPositionReqGroup.algoId;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = signalPositionReqGroup.instType;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = signalPositionReqGroup.instId;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z2 = signalPositionReqGroup.isInstIdList;
        }
        return signalPositionReqGroup.copy(z, str4, str5, str6, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hasWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isInstIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalPositionReqGroup copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SignalPositionReqGroup(z, str, str2, str3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalPositionReqGroup)) {
            return false;
        }
        SignalPositionReqGroup signalPositionReqGroup = (SignalPositionReqGroup) obj;
        return this.hasWs == signalPositionReqGroup.hasWs && Intrinsics.EZpvd((Object) this.algoId, (Object) signalPositionReqGroup.algoId) && Intrinsics.EZpvd((Object) this.instType, (Object) signalPositionReqGroup.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) signalPositionReqGroup.instId) && this.isInstIdList == signalPositionReqGroup.isInstIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasWs() {
        return this.hasWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Boolean.hashCode(this.hasWs) * 31) + this.algoId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.instId.hashCode()) * 31) + Boolean.hashCode(this.isInstIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInstIdList() {
        return this.isInstIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasWs(boolean z) {
        this.hasWs = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstIdList(boolean z) {
        this.isInstIdList = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalPositionReqGroup(hasWs=" + this.hasWs + ", algoId=" + this.algoId + ", instType=" + this.instType + ", instId=" + this.instId + ", isInstIdList=" + this.isInstIdList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalPositionReqGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalPositionReqGroup> serializer() {
            return SignalPositionReqGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalPositionReqGroup(int i, boolean z, String str, String str2, String str3, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, SignalPositionReqGroup$$serializer.INSTANCE.getDescriptor());
        }
        this.hasWs = z;
        this.algoId = str;
        this.instType = str2;
        this.instId = str3;
        if ((i & 16) == 0) {
            this.isInstIdList = false;
        } else {
            this.isInstIdList = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalPositionReqGroup signalPositionReqGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, signalPositionReqGroup.hasWs);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, signalPositionReqGroup.algoId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, signalPositionReqGroup.instType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, signalPositionReqGroup.instId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || signalPositionReqGroup.isInstIdList) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, signalPositionReqGroup.isInstIdList);
        }
    }

    public SignalPositionReqGroup(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.hasWs = z;
        this.algoId = str;
        this.instType = str2;
        this.instId = str3;
        this.isInstIdList = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 boolean)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:2067) call: com.okinc.unify_trade.biz.SignalPositionReqGroup.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ SignalPositionReqGroup(boolean z, String str, String str2, String str3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, str3, (i & 16) != 0 ? false : z2);
    }
}
