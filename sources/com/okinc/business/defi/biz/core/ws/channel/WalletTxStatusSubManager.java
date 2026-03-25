package com.okinc.business.defi.biz.core.ws.channel;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxStatusSubManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C11205cFp;
import o.C12827cuN;
import o.InterfaceC58227yxM;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletTxStatusSubManager extends xZF<SubResponse> {
    public WalletTxStatusSubManager() {
        super("wallet-tx-status-toast", true, false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // o.xZF
    public boolean OLrzqt(@NotNull final List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.cGI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletTxStatusSubManager.KWHzl(this.AEQbTJ, list, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cGG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletTxStatusSubManager.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.cGF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletTxStatusSubManager.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cGM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletTxStatusSubManager.KWHzl(function12, obj);
            }
        });
        return true;
    }

    public static final Unit KWHzl(WalletTxStatusSubManager walletTxStatusSubManager, List list, AbstractC12782ctV abstractC12782ctV) {
        if (!abstractC12782ctV.zsXlph() && !abstractC12782ctV.QfsBiF()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String address = ((SubResponse) obj).getAddress();
                if (address == null) {
                    address = "";
                }
                if (abstractC12782ctV.DbNXlk(address)) {
                    arrayList.add(obj);
                }
            }
            xZF.notifySubListener$default(walletTxStatusSubManager, arrayList, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Throwable th) {
        return Unit.INSTANCE;
    }

    @Serializable
    public static final class SubResponse extends xZF.ActionBar {
        private final String address;
        private final Integer pushToastCode;
        private final List<String> pushToastParams;
        private final String statusText;
        private final String txId;
        private final Integer txStatus;
        private final Integer txType;
        private final String url;
        private final String urlText;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this((String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.txId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component3() {
            return this.txStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.statusText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.urlText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component7() {
            return this.pushToastCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component8() {
            return this.pushToastParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component9() {
            return this.txType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, List<String> list, Integer num3) {
            return new SubResponse(str, str2, num, str3, str4, str5, num2, list, num3);
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
            return Intrinsics.EZpvd((Object) this.address, (Object) subResponse.address) && Intrinsics.EZpvd((Object) this.txId, (Object) subResponse.txId) && Intrinsics.EZpvd(this.txStatus, subResponse.txStatus) && Intrinsics.EZpvd((Object) this.statusText, (Object) subResponse.statusText) && Intrinsics.EZpvd((Object) this.url, (Object) subResponse.url) && Intrinsics.EZpvd((Object) this.urlText, (Object) subResponse.urlText) && Intrinsics.EZpvd(this.pushToastCode, subResponse.pushToastCode) && Intrinsics.EZpvd(this.pushToastParams, subResponse.pushToastParams) && Intrinsics.EZpvd(this.txType, subResponse.txType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            String str = this.txId;
            return str == null ? "" : str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getPushToastCode() {
            return this.pushToastCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getPushToastParams() {
            return this.pushToastParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStatusText() {
            return this.statusText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTxId() {
            return this.txId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getTxStatus() {
            return this.txStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getTxType() {
            return this.txType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUrl() {
            return this.url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUrlText() {
            return this.urlText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.address;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.txId;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.txStatus;
            int iHashCode3 = num == null ? 0 : num.hashCode();
            String str3 = this.statusText;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.url;
            int iHashCode5 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.urlText;
            int iHashCode6 = str5 == null ? 0 : str5.hashCode();
            Integer num2 = this.pushToastCode;
            int iHashCode7 = num2 == null ? 0 : num2.hashCode();
            List<String> list = this.pushToastParams;
            int iHashCode8 = list == null ? 0 : list.hashCode();
            Integer num3 = this.txType;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num3 != null ? num3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(address=" + this.address + ", txId=" + this.txId + ", txStatus=" + this.txStatus + ", statusText=" + this.statusText + ", url=" + this.url + ", urlText=" + this.urlText + ", pushToastCode=" + this.pushToastCode + ", pushToastParams=" + this.pushToastParams + ", txType=" + this.txType + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletTxStatusSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletTxStatusSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, List list, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.address = null;
            } else {
                this.address = str;
            }
            if ((i & 2) == 0) {
                this.txId = null;
            } else {
                this.txId = str2;
            }
            if ((i & 4) == 0) {
                this.txStatus = null;
            } else {
                this.txStatus = num;
            }
            if ((i & 8) == 0) {
                this.statusText = null;
            } else {
                this.statusText = str3;
            }
            if ((i & 16) == 0) {
                this.url = null;
            } else {
                this.url = str4;
            }
            if ((i & 32) == 0) {
                this.urlText = null;
            } else {
                this.urlText = str5;
            }
            if ((i & 64) == 0) {
                this.pushToastCode = null;
            } else {
                this.pushToastCode = num2;
            }
            if ((i & 128) == 0) {
                this.pushToastParams = null;
            } else {
                this.pushToastParams = list;
            }
            if ((i & 256) == 0) {
                this.txType = null;
            } else {
                this.txType = num3;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponse.address != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subResponse.address);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subResponse.txId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subResponse.txId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subResponse.txStatus != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, subResponse.txStatus);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subResponse.statusText != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, subResponse.statusText);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || subResponse.url != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, subResponse.url);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || subResponse.urlText != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, subResponse.urlText);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || subResponse.pushToastCode != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, subResponse.pushToastCode);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || subResponse.pushToastParams != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], subResponse.pushToastParams);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && subResponse.txType == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, subResponse.txType);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.util.List<java.lang.String>, java.lang.Integer):void (m)] (LINE:47) call: com.okinc.business.defi.biz.core.ws.channel.WalletTxStatusSubManager.SubResponse.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.lang.Integer):void type: THIS */
        public /* synthetic */ SubResponse(String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, List list, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : list, (i & 256) == 0 ? num3 : null);
        }

        public SubResponse(String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, List<String> list, Integer num3) {
            this.address = str;
            this.txId = str2;
            this.txStatus = num;
            this.statusText = str3;
            this.url = str4;
            this.urlText = str5;
            this.pushToastCode = num2;
            this.pushToastParams = list;
            this.txType = num3;
        }
    }
}
