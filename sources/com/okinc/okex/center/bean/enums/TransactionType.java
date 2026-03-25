package com.okinc.okex.center.bean.enums;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.p2p.api.OtcRouteConst;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44842seZ;
import o.C47315tni;
import o.C52761wXj;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44842seZ.class)
public final class TransactionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final Integer displayStringResId;
    private final Integer iconResId;
    private final String value;
    public static final TransactionType Deposit = new TransactionType("Deposit", 0, "deposit", Integer.valueOf(C47315tni.PendingIntent.getFieldNames), Integer.valueOf(C52761wXj.TaskDescription.DFbvW));
    public static final TransactionType Withdrawal = new TransactionType("Withdrawal", 1, "withdraw", Integer.valueOf(C47315tni.PendingIntent.zLjUOn), Integer.valueOf(C52761wXj.TaskDescription.GFUIi));
    public static final TransactionType P2P = new TransactionType(CustomMessageData.SERVICE_NAME_P2P, 2, OtcRouteConst.P2P, Integer.valueOf(C47315tni.PendingIntent.uzCIH), Integer.valueOf(C52761wXj.TaskDescription.RZMhtF));
    public static final TransactionType Unknown = new TransactionType("Unknown", 3, "", null, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionType[] $values() {
        return new TransactionType[]{Deposit, Withdrawal, P2P, Unknown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDisplayStringResId() {
        return this.displayStringResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getIconResId() {
        return this.iconResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.enums.TransactionType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) TransactionType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TransactionType> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44842seZ();
    }

    private TransactionType(String str, @StringRes int i, @DrawableRes String str2, Integer num, Integer num2) {
        this.value = str2;
        this.displayStringResId = num;
        this.iconResId = num2;
    }

    static {
        TransactionType[] transactionTypeArr$values = $values();
        $VALUES = transactionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.seX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TransactionType._init_$_anonymous_();
            }
        });
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }
}
