package com.okinc.business.defi.biz.core.transaction.sign.sui.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SuiExtJson {
    public static final int $stable = 8;
    private List<SuiInputCoin> inputCoins;
    private List<SuiInputCoin> tokenInputCoins;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiExtJson */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuiExtJson copy$default(SuiExtJson suiExtJson, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = suiExtJson.inputCoins;
        }
        if ((i & 2) != 0) {
            list2 = suiExtJson.tokenInputCoins;
        }
        return suiExtJson.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiInputCoin> component1() {
        return this.inputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiInputCoin> component2() {
        return this.tokenInputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuiExtJson copy(List<SuiInputCoin> list, List<SuiInputCoin> list2) {
        return new SuiExtJson(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuiExtJson)) {
            return false;
        }
        SuiExtJson suiExtJson = (SuiExtJson) obj;
        return Intrinsics.EZpvd(this.inputCoins, suiExtJson.inputCoins) && Intrinsics.EZpvd(this.tokenInputCoins, suiExtJson.tokenInputCoins);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiInputCoin> getInputCoins() {
        return this.inputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiInputCoin> getTokenInputCoins() {
        return this.tokenInputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<SuiInputCoin> list = this.inputCoins;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<SuiInputCoin> list2 = this.tokenInputCoins;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputCoins(List<SuiInputCoin> list) {
        this.inputCoins = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenInputCoins(List<SuiInputCoin> list) {
        this.tokenInputCoins = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuiExtJson(inputCoins=" + this.inputCoins + ", tokenInputCoins=" + this.tokenInputCoins + ")";
    }

    public SuiExtJson(List<SuiInputCoin> list, List<SuiInputCoin> list2) {
        this.inputCoins = list;
        this.tokenInputCoins = list2;
    }
}
