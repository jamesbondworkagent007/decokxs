package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CloseCallData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final CallData callData;
    private final String unsignedTx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CloseCallData() {
        this((CallData) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CloseCallData copy$default(CloseCallData closeCallData, CallData callData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            callData = closeCallData.callData;
        }
        if ((i & 2) != 0) {
            str = closeCallData.unsignedTx;
        }
        return closeCallData.copy(callData, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallData component1() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CloseCallData copy(@NotNull CallData callData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(callData, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new CloseCallData(callData, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseCallData)) {
            return false;
        }
        CloseCallData closeCallData = (CloseCallData) obj;
        return Intrinsics.EZpvd(this.callData, closeCallData.callData) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) closeCallData.unsignedTx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallData getCallData() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.callData.hashCode() * 31) + this.unsignedTx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CloseCallData(callData=" + this.callData + ", unsignedTx=" + this.unsignedTx + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.CloseCallData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CloseCallData> serializer() {
            return CloseCallData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloseCallData(int i, CallData callData, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.callData = (i & 1) == 0 ? new CallData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 32767, (DefaultConstructorMarker) null) : callData;
        this.unsignedTx = (i & 2) == 0 ? "" : str;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CloseCallData closeCallData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(closeCallData.callData, new CallData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 32767, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, CallData$$serializer.INSTANCE, closeCallData.callData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) closeCallData.unsignedTx, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, closeCallData.unsignedTx);
    }

    public CloseCallData(@NotNull CallData callData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(callData, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.callData = callData;
        this.unsignedTx = str;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CloseCallData(com.okinc.business.dexlogic.bean.CallData r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r19 = this;
            r0 = r22 & 1
            if (r0 == 0) goto L1f
            com.okinc.business.dexlogic.bean.CallData r0 = new com.okinc.business.dexlogic.bean.CallData
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 32767(0x7fff, float:4.5916E-41)
            r18 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L21
        L1f:
            r0 = r20
        L21:
            r1 = r22 & 2
            if (r1 == 0) goto L2a
            java.lang.String r1 = ""
            r2 = r19
            goto L2e
        L2a:
            r2 = r19
            r1 = r21
        L2e:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.dexlogic.bean.CloseCallData.<init>(com.okinc.business.dexlogic.bean.CallData, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
