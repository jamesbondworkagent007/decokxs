package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class BridgeRedeemCallDataResponse {
    public static final int $stable = 8;
    private final BridgeRedeemCallDataObject callData;
    private final String unsignedTx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BridgeRedeemCallDataResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BridgeRedeemCallDataResponse copy$default(BridgeRedeemCallDataResponse bridgeRedeemCallDataResponse, String str, BridgeRedeemCallDataObject bridgeRedeemCallDataObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bridgeRedeemCallDataResponse.unsignedTx;
        }
        if ((i & 2) != 0) {
            bridgeRedeemCallDataObject = bridgeRedeemCallDataResponse.callData;
        }
        return bridgeRedeemCallDataResponse.copy(str, bridgeRedeemCallDataObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeRedeemCallDataObject component2() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeRedeemCallDataResponse copy(@NotNull String str, @NotNull BridgeRedeemCallDataObject bridgeRedeemCallDataObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bridgeRedeemCallDataObject, "");
        return new BridgeRedeemCallDataResponse(str, bridgeRedeemCallDataObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeRedeemCallDataResponse)) {
            return false;
        }
        BridgeRedeemCallDataResponse bridgeRedeemCallDataResponse = (BridgeRedeemCallDataResponse) obj;
        return Intrinsics.EZpvd((Object) this.unsignedTx, (Object) bridgeRedeemCallDataResponse.unsignedTx) && Intrinsics.EZpvd(this.callData, bridgeRedeemCallDataResponse.callData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeRedeemCallDataObject getCallData() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.unsignedTx.hashCode() * 31) + this.callData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BridgeRedeemCallDataResponse(unsignedTx=" + this.unsignedTx + ", callData=" + this.callData + ")";
    }

    public BridgeRedeemCallDataResponse(@NotNull String str, @NotNull BridgeRedeemCallDataObject bridgeRedeemCallDataObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bridgeRedeemCallDataObject, "");
        this.unsignedTx = str;
        this.callData = bridgeRedeemCallDataObject;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ BridgeRedeemCallDataResponse(java.lang.String r19, com.okinc.business.dexlogic.bean.BridgeRedeemCallDataObject r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r18 = this;
            r0 = r21 & 1
            if (r0 == 0) goto L7
            java.lang.String r0 = ""
            goto L9
        L7:
            r0 = r19
        L9:
            r1 = r21 & 2
            if (r1 == 0) goto L27
            com.okinc.business.dexlogic.bean.BridgeRedeemCallDataObject r1 = new com.okinc.business.dexlogic.bean.BridgeRedeemCallDataObject
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
            r16 = 8191(0x1fff, float:1.1478E-41)
            r17 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = r18
            goto L2b
        L27:
            r2 = r18
            r1 = r20
        L2b:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.dexlogic.bean.BridgeRedeemCallDataResponse.<init>(java.lang.String, com.okinc.business.dexlogic.bean.BridgeRedeemCallDataObject, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
