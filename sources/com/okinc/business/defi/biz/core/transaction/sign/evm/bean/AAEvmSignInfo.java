package com.okinc.business.defi.biz.core.transaction.sign.evm.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AAEvmSignInfo implements Parcelable {
    private final String chainId;
    private EvmSignInfoGasPrice gasPrice;
    private String nonce;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AAEvmSignInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AAEvmSignInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AAEvmSignInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AAEvmSignInfo(parcel.readString(), parcel.readString(), EvmSignInfoGasPrice.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AAEvmSignInfo[] newArray(int i) {
            return new AAEvmSignInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAEvmSignInfo() {
        this((String) null, (String) null, (EvmSignInfoGasPrice) null, 7, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmSignInfoGasPrice getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPrice(@NotNull EvmSignInfoGasPrice evmSignInfoGasPrice) {
        Intrinsics.checkNotNullParameter(evmSignInfoGasPrice, "");
        this.gasPrice = evmSignInfoGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(String str) {
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nonce);
        parcel.writeString(this.chainId);
        this.gasPrice.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.evm.bean.AAEvmSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAEvmSignInfo> serializer() {
            return AAEvmSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAEvmSignInfo(int i, String str, String str2, EvmSignInfoGasPrice evmSignInfoGasPrice, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str;
        }
        if ((i & 2) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str2;
        }
        this.gasPrice = (i & 4) == 0 ? new EvmSignInfoGasPrice((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null) : evmSignInfoGasPrice;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AAEvmSignInfo aAEvmSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || aAEvmSignInfo.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, aAEvmSignInfo.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aAEvmSignInfo.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, aAEvmSignInfo.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(aAEvmSignInfo.gasPrice, new EvmSignInfoGasPrice((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, EvmSignInfoGasPrice$$serializer.INSTANCE, aAEvmSignInfo.gasPrice);
    }

    public AAEvmSignInfo(String str, String str2, @NotNull EvmSignInfoGasPrice evmSignInfoGasPrice) {
        Intrinsics.checkNotNullParameter(evmSignInfoGasPrice, "");
        this.nonce = str;
        this.chainId = str2;
        this.gasPrice = evmSignInfoGasPrice;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AAEvmSignInfo(java.lang.String r25, java.lang.String r26, com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r24 = this;
            r0 = r28 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r0 = r1
            goto L9
        L7:
            r0 = r25
        L9:
            r2 = r28 & 2
            if (r2 == 0) goto Le
            goto L10
        Le:
            r1 = r26
        L10:
            r2 = r28 & 4
            if (r2 == 0) goto L3a
            com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice r2 = new com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice
            r3 = r2
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
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 262143(0x3ffff, float:3.6734E-40)
            r23 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = r24
            goto L3e
        L3a:
            r3 = r24
            r2 = r27
        L3e:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.defi.biz.core.transaction.sign.evm.bean.AAEvmSignInfo.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
