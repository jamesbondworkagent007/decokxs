package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model;

import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PayOrderApiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PayOrderEntity {
    public static final int $stable = 0;
    private final PayOrderApiModel apiModel;
    private final int index;
    private final String key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PayOrderEntity copy$default(PayOrderEntity payOrderEntity, String str, PayOrderApiModel payOrderApiModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = payOrderEntity.key;
        }
        if ((i2 & 2) != 0) {
            payOrderApiModel = payOrderEntity.apiModel;
        }
        if ((i2 & 4) != 0) {
            i = payOrderEntity.index;
        }
        return payOrderEntity.copy(str, payOrderApiModel, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayOrderApiModel component2() {
        return this.apiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayOrderEntity copy(@NotNull String str, @NotNull PayOrderApiModel payOrderApiModel, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(payOrderApiModel, "");
        return new PayOrderEntity(str, payOrderApiModel, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayOrderEntity)) {
            return false;
        }
        PayOrderEntity payOrderEntity = (PayOrderEntity) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) payOrderEntity.key) && Intrinsics.EZpvd(this.apiModel, payOrderEntity.apiModel) && this.index == payOrderEntity.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayOrderApiModel getApiModel() {
        return this.apiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.apiModel.hashCode()) * 31) + Integer.hashCode(this.index);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PayOrderEntity(key=" + this.key + ", apiModel=" + this.apiModel + ", index=" + this.index + ")";
    }

    public PayOrderEntity(@NotNull String str, @NotNull PayOrderApiModel payOrderApiModel, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(payOrderApiModel, "");
        this.key = str;
        this.apiModel = payOrderApiModel;
        this.index = i;
    }
}
