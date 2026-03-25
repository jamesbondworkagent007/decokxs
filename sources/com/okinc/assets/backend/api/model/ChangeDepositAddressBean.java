package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class ChangeDepositAddressBean {
    private int currencyId;
    private int id;
    private int subCurrencyId;
    private int target;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChangeDepositAddressBean copy$default(ChangeDepositAddressBean changeDepositAddressBean, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = changeDepositAddressBean.currencyId;
        }
        if ((i5 & 2) != 0) {
            i2 = changeDepositAddressBean.subCurrencyId;
        }
        if ((i5 & 4) != 0) {
            i3 = changeDepositAddressBean.id;
        }
        if ((i5 & 8) != 0) {
            i4 = changeDepositAddressBean.target;
        }
        return changeDepositAddressBean.copy(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChangeDepositAddressBean copy(int i, int i2, int i3, int i4) {
        return new ChangeDepositAddressBean(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeDepositAddressBean)) {
            return false;
        }
        ChangeDepositAddressBean changeDepositAddressBean = (ChangeDepositAddressBean) obj;
        return this.currencyId == changeDepositAddressBean.currencyId && this.subCurrencyId == changeDepositAddressBean.subCurrencyId && this.id == changeDepositAddressBean.id && this.target == changeDepositAddressBean.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.currencyId) * 31) + Integer.hashCode(this.subCurrencyId)) * 31) + Integer.hashCode(this.id)) * 31) + Integer.hashCode(this.target);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(int i) {
        this.id = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(int i) {
        this.subCurrencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTarget(int i) {
        this.target = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChangeDepositAddressBean(currencyId=" + this.currencyId + ", subCurrencyId=" + this.subCurrencyId + ", id=" + this.id + ", target=" + this.target + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.ChangeDepositAddressBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChangeDepositAddressBean> serializer() {
            return ChangeDepositAddressBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChangeDepositAddressBean(int i, int i2, int i3, int i4, int i5, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ChangeDepositAddressBean$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyId = i2;
        this.subCurrencyId = i3;
        this.id = i4;
        this.target = i5;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(ChangeDepositAddressBean changeDepositAddressBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, changeDepositAddressBean.currencyId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, changeDepositAddressBean.subCurrencyId);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, changeDepositAddressBean.id);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, changeDepositAddressBean.target);
    }

    public ChangeDepositAddressBean(int i, int i2, int i3, int i4) {
        this.currencyId = i;
        this.subCurrencyId = i2;
        this.id = i3;
        this.target = i4;
    }
}
