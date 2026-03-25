package com.okinc.assets.backend.api.model;

import com.okinc.assets.backend.api.model.FundingAssetsListItemType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AssetType {
    public static final int $stable = 8;
    private FundingAssetsListItemType listItemType;
    private FundingAssetsType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetType() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AssetType copy$default(AssetType assetType, FundingAssetsType fundingAssetsType, FundingAssetsListItemType fundingAssetsListItemType, int i, Object obj) {
        if ((i & 1) != 0) {
            fundingAssetsType = assetType.type;
        }
        if ((i & 2) != 0) {
            fundingAssetsListItemType = assetType.listItemType;
        }
        return assetType.copy(fundingAssetsType, fundingAssetsListItemType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingAssetsType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingAssetsListItemType component2() {
        return this.listItemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetType copy(FundingAssetsType fundingAssetsType, FundingAssetsListItemType fundingAssetsListItemType) {
        return new AssetType(fundingAssetsType, fundingAssetsListItemType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetType)) {
            return false;
        }
        AssetType assetType = (AssetType) obj;
        return this.type == assetType.type && Intrinsics.EZpvd(this.listItemType, assetType.listItemType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingAssetsListItemType getListItemType() {
        return this.listItemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingAssetsType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        FundingAssetsType fundingAssetsType = this.type;
        int iHashCode = fundingAssetsType == null ? 0 : fundingAssetsType.hashCode();
        FundingAssetsListItemType fundingAssetsListItemType = this.listItemType;
        return (iHashCode * 31) + (fundingAssetsListItemType != null ? fundingAssetsListItemType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListItemType(FundingAssetsListItemType fundingAssetsListItemType) {
        this.listItemType = fundingAssetsListItemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(FundingAssetsType fundingAssetsType) {
        this.type = fundingAssetsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetType(type=" + this.type + ", listItemType=" + this.listItemType + ")";
    }

    public AssetType(FundingAssetsType fundingAssetsType, FundingAssetsListItemType fundingAssetsListItemType) {
        this.type = fundingAssetsType;
        this.listItemType = fundingAssetsListItemType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:com.okinc.assets.backend.api.model.FundingAssetsType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.assets.backend.api.model.FundingAssetsType:0x0004: SGET  A[WRAPPED] (LINE:122) com.okinc.assets.backend.api.model.FundingAssetsType.NORMAL com.okinc.assets.backend.api.model.FundingAssetsType) : (r1v0 com.okinc.assets.backend.api.model.FundingAssetsType))
  (wrap:com.okinc.assets.backend.api.model.FundingAssetsListItemType:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.assets.backend.api.model.FundingAssetsListItemType:0x000a: SGET  A[WRAPPED] (LINE:123) com.okinc.assets.backend.api.model.FundingAssetsListItemType.ActionBar.EZpvd com.okinc.assets.backend.api.model.FundingAssetsListItemType$ActionBar) : (r2v0 com.okinc.assets.backend.api.model.FundingAssetsListItemType))
 A[MD:(com.okinc.assets.backend.api.model.FundingAssetsType, com.okinc.assets.backend.api.model.FundingAssetsListItemType):void (m)] (LINE:121) call: com.okinc.assets.backend.api.model.AssetType.<init>(com.okinc.assets.backend.api.model.FundingAssetsType, com.okinc.assets.backend.api.model.FundingAssetsListItemType):void type: THIS */
    public /* synthetic */ AssetType(FundingAssetsType fundingAssetsType, FundingAssetsListItemType fundingAssetsListItemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FundingAssetsType.NORMAL : fundingAssetsType, (i & 2) != 0 ? FundingAssetsListItemType.ActionBar.EZpvd : fundingAssetsListItemType);
    }
}
