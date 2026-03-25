package com.reown.android.internal.common.model.params;

import com.reown.android.internal.common.model.type.ClientParams;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public interface CoreChatParams extends ClientParams {

    @JsonClass(generateAdapter = true)
    public static final class ReceiptParams implements CoreChatParams {
        public final String receiptAuth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ReceiptParams copy$default(ReceiptParams receiptParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = receiptParams.receiptAuth;
            }
            return receiptParams.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.receiptAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ReceiptParams copy(@Json(name = "receiptAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ReceiptParams(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReceiptParams) && Intrinsics.EZpvd((Object) this.receiptAuth, (Object) ((ReceiptParams) obj).receiptAuth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReceiptAuth() {
            return this.receiptAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.receiptAuth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ReceiptParams(receiptAuth=" + this.receiptAuth + ")";
        }

        public ReceiptParams(@Json(name = "receiptAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.receiptAuth = str;
        }
    }
}
