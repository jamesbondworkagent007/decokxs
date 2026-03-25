package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.wallet.core.ws.WalletWSBaseArgsChannel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C11205cFp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletGasPriceSubManager extends WalletWSBaseArgsChannel<Application, SubResponse> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xZF
    public boolean OLrzqt(@NotNull List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return false;
    }

    public WalletGasPriceSubManager() {
        super("wallet-gas-price", false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    public static final class Application extends WalletWSBaseArgsChannel.StateListAnimator {
        public final long AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.StateListAnimator
        public String KWHzl() {
            return "";
        }

        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.StateListAnimator
        public String OLrzqt() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.StateListAnimator
        public String copydefault() {
            return "subSingInfoPrice-txConfirmPage";
        }

        public Application(long j) {
            this.AEQbTJ = j;
        }

        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.StateListAnimator
        public String AEQbTJ() {
            return String.valueOf(this.AEQbTJ);
        }
    }

    @Serializable
    public static final class SubResponse extends WalletWSBaseArgsChannel.TaskDescription {
        private String temp;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubResponse copy$default(SubResponse subResponse, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subResponse.temp;
            }
            return subResponse.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.temp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SubResponse(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubResponse) && Intrinsics.EZpvd((Object) this.temp, (Object) ((SubResponse) obj).temp);
        }

        @Override // o.xZF.ActionBar
        public String getMAddress() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.TaskDescription
        public String getMSubArgsUniqueId() {
            return "subSingInfoPrice-txConfirmPage";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            return "subSingInfoPrice-txConfirmPage";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTemp() {
            return this.temp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.temp.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTemp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.temp = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(temp=" + this.temp + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletGasPriceSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletGasPriceSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.temp = "";
            } else {
                this.temp = str;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) subResponse.temp, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 0, subResponse.temp);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:47) call: com.okinc.business.defi.biz.core.ws.channel.WalletGasPriceSubManager.SubResponse.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SubResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public SubResponse(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.temp = str;
        }
    }
}
