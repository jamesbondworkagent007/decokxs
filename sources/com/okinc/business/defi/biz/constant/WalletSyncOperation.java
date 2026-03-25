package com.okinc.business.defi.biz.constant;

import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class WalletSyncOperation {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletSyncOperation[] $VALUES;
    public static final ActionBar Companion;
    public static final WalletSyncOperation Rename = new WalletSyncOperation(OKGroupNotificationMessage.GROUP_OPERATION_RENAME, 0, 0);
    public static final WalletSyncOperation UpdateDefaultAddress = new WalletSyncOperation("UpdateDefaultAddress", 1, 1);
    public static final WalletSyncOperation UpgradeAddress = new WalletSyncOperation("UpgradeAddress", 2, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletSyncOperation[] $values() {
        return new WalletSyncOperation[]{Rename, UpdateDefaultAddress, UpgradeAddress};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletSyncOperation> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private WalletSyncOperation(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        WalletSyncOperation[] walletSyncOperationArr$values = $values();
        $VALUES = walletSyncOperationArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletSyncOperationArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.constant.WalletSyncOperation.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static WalletSyncOperation valueOf(String str) {
        return (WalletSyncOperation) Enum.valueOf(WalletSyncOperation.class, str);
    }

    public static WalletSyncOperation[] values() {
        return (WalletSyncOperation[]) $VALUES.clone();
    }
}
