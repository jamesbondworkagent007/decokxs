package com.keystone.module;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CardanoSignRequest {
    private final List<CardanoCertKey> certKeys;
    private final String origin;
    private final String requestId;
    private final String signData;
    private final List<CardanoUtxo> utxos;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.keystone.module.CardanoSignRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardanoSignRequest copy$default(CardanoSignRequest cardanoSignRequest, String str, String str2, List list, List list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardanoSignRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = cardanoSignRequest.signData;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = cardanoSignRequest.utxos;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = cardanoSignRequest.certKeys;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            str3 = cardanoSignRequest.origin;
        }
        return cardanoSignRequest.copy(str, str4, list3, list4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardanoUtxo> component3() {
        return this.utxos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardanoCertKey> component4() {
        return this.certKeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardanoSignRequest copy(@NotNull String str, @NotNull String str2, @NotNull List<CardanoUtxo> list, @NotNull List<CardanoCertKey> list2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CardanoSignRequest(str, str2, list, list2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardanoSignRequest)) {
            return false;
        }
        CardanoSignRequest cardanoSignRequest = (CardanoSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) cardanoSignRequest.requestId) && Intrinsics.EZpvd((Object) this.signData, (Object) cardanoSignRequest.signData) && Intrinsics.EZpvd(this.utxos, cardanoSignRequest.utxos) && Intrinsics.EZpvd(this.certKeys, cardanoSignRequest.certKeys) && Intrinsics.EZpvd((Object) this.origin, (Object) cardanoSignRequest.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardanoCertKey> getCertKeys() {
        return this.certKeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardanoUtxo> getUtxos() {
        return this.utxos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.requestId.hashCode() * 31) + this.signData.hashCode()) * 31) + this.utxos.hashCode()) * 31) + this.certKeys.hashCode()) * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardanoSignRequest(requestId=" + this.requestId + ", signData=" + this.signData + ", utxos=" + this.utxos + ", certKeys=" + this.certKeys + ", origin=" + this.origin + ')';
    }

    public CardanoSignRequest(@NotNull String str, @NotNull String str2, @NotNull List<CardanoUtxo> list, @NotNull List<CardanoCertKey> list2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestId = str;
        this.signData = str2;
        this.utxos = list;
        this.certKeys = list2;
        this.origin = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.util.List)
  (r10v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.keystone.module.CardanoUtxo>, java.util.List<com.keystone.module.CardanoCertKey>, java.lang.String):void (m)] (LINE:18) call: com.keystone.module.CardanoSignRequest.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ CardanoSignRequest(String str, String str2, List list, List list2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, list2, (i & 16) != 0 ? "" : str3);
    }
}
