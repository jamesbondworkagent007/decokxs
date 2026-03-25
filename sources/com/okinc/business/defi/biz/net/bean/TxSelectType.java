package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class TxSelectType {
    public static final int $stable = 0;
    private final int groupType;
    private final String groupTypeText;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TxSelectType copy$default(TxSelectType txSelectType, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = txSelectType.groupType;
        }
        if ((i2 & 2) != 0) {
            str = txSelectType.groupTypeText;
        }
        return txSelectType.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.groupTypeText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxSelectType copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TxSelectType(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxSelectType)) {
            return false;
        }
        TxSelectType txSelectType = (TxSelectType) obj;
        return this.groupType == txSelectType.groupType && Intrinsics.EZpvd((Object) this.groupTypeText, (Object) txSelectType.groupTypeText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGroupType() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupTypeText() {
        return this.groupTypeText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.groupType) * 31) + this.groupTypeText.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxSelectType(groupType=" + this.groupType + ", groupTypeText=" + this.groupTypeText + ")";
    }

    public TxSelectType(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupType = i;
        this.groupTypeText = str;
    }
}
