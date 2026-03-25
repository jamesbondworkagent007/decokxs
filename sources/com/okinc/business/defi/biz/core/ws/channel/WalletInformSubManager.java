package com.okinc.business.defi.biz.core.ws.channel;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import o.C11205cFp;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletInformSubManager extends xZF<SubResponse> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xZF
    public boolean OLrzqt(@NotNull List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return false;
    }

    public WalletInformSubManager() {
        super("wallet-inform", true, false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    @Serializable
    public static final class SubResponse extends xZF.ActionBar {
        public static final int TYPE_EIP7702 = 1;
        public static final int TYPE_TEE_EXPIRED = 2;
        private final String address;
        private final JsonElement data;
        private final int type;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubResponse copy$default(SubResponse subResponse, int i, String str, JsonElement jsonElement, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = subResponse.type;
            }
            if ((i2 & 2) != 0) {
                str = subResponse.address;
            }
            if ((i2 & 4) != 0) {
                jsonElement = subResponse.data;
            }
            return subResponse.copy(i, str, jsonElement);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonElement component3() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(int i, @NotNull String str, @NotNull JsonElement jsonElement) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            return new SubResponse(i, str, jsonElement);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubResponse)) {
                return false;
            }
            SubResponse subResponse = (SubResponse) obj;
            return this.type == subResponse.type && Intrinsics.EZpvd((Object) this.address, (Object) subResponse.address) && Intrinsics.EZpvd(this.data, subResponse.data);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonElement getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Integer.hashCode(this.type) * 31) + this.address.hashCode()) * 31) + this.data.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(type=" + this.type + ", address=" + this.address + ", data=" + this.data + ")";
        }

        public /* synthetic */ SubResponse(int i, int i2, String str, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, WalletInformSubManager$SubResponse$$serializer.INSTANCE.getDescriptor());
            }
            this.type = i2;
            this.address = str;
            this.data = jsonElement;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, subResponse.type);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, subResponse.address);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, JsonElementSerializer.INSTANCE, subResponse.data);
        }

        public SubResponse(int i, @NotNull String str, @NotNull JsonElement jsonElement) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            this.type = i;
            this.address = str;
            this.data = jsonElement;
        }

        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            return toString();
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletInformSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletInformSubManager$SubResponse$$serializer.INSTANCE;
            }
        }
    }
}
