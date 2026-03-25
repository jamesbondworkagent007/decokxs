package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class AddDepositAddressBean {
    private int currencyId;
    private boolean isIsolationAddress;
    private Integer subCurrencyId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddDepositAddressBean copy$default(AddDepositAddressBean addDepositAddressBean, int i, boolean z, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addDepositAddressBean.currencyId;
        }
        if ((i2 & 2) != 0) {
            z = addDepositAddressBean.isIsolationAddress;
        }
        if ((i2 & 4) != 0) {
            num = addDepositAddressBean.subCurrencyId;
        }
        return addDepositAddressBean.copy(i, z, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isIsolationAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddDepositAddressBean copy(int i, boolean z, Integer num) {
        return new AddDepositAddressBean(i, z, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddDepositAddressBean)) {
            return false;
        }
        AddDepositAddressBean addDepositAddressBean = (AddDepositAddressBean) obj;
        return this.currencyId == addDepositAddressBean.currencyId && this.isIsolationAddress == addDepositAddressBean.isIsolationAddress && Intrinsics.EZpvd(this.subCurrencyId, addDepositAddressBean.subCurrencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currencyId);
        int iHashCode2 = Boolean.hashCode(this.isIsolationAddress);
        Integer num = this.subCurrencyId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isIsolationAddress() {
        return this.isIsolationAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsolationAddress(boolean z) {
        this.isIsolationAddress = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(Integer num) {
        this.subCurrencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddDepositAddressBean(currencyId=" + this.currencyId + ", isIsolationAddress=" + this.isIsolationAddress + ", subCurrencyId=" + this.subCurrencyId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.AddDepositAddressBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddDepositAddressBean> serializer() {
            return AddDepositAddressBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddDepositAddressBean(int i, int i2, boolean z, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AddDepositAddressBean$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyId = i2;
        this.isIsolationAddress = z;
        this.subCurrencyId = num;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(AddDepositAddressBean addDepositAddressBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, addDepositAddressBean.currencyId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, addDepositAddressBean.isIsolationAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, addDepositAddressBean.subCurrencyId);
    }

    public AddDepositAddressBean(int i, boolean z, Integer num) {
        this.currencyId = i;
        this.isIsolationAddress = z;
        this.subCurrencyId = num;
    }
}
