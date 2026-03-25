package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
public abstract class FundingAssetsListItemType {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.FundingAssetsListItemType.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FundingAssetsListItemType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FundingAssetsListItemType() {
    }

    public static final class ActionBar extends FundingAssetsListItemType {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }
}
