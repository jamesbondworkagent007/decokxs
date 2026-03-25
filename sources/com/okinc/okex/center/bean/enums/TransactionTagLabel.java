package com.okinc.okex.center.bean.enums;

import androidx.annotation.StringRes;
import com.okinc.okex.center.bean.enums.TransactionTagLabel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44835seS;
import o.C47315tni;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44835seS.class)
public final class TransactionTagLabel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionTagLabel[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final Integer displayStringResId;
    private final String value;
    public static final TransactionTagLabel Untradable = new TransactionTagLabel("Untradable", 0, "untradable", Integer.valueOf(C47315tni.PendingIntent.ffGIBT));
    public static final TransactionTagLabel Locked = new TransactionTagLabel("Locked", 1, "locked", null);
    public static final TransactionTagLabel NoTag = new TransactionTagLabel("NoTag", 2, "", null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionTagLabel[] $values() {
        return new TransactionTagLabel[]{Untradable, Locked, NoTag};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionTagLabel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDisplayStringResId() {
        return this.displayStringResId;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.enums.TransactionTagLabel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) TransactionTagLabel.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TransactionTagLabel> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44835seS();
    }

    private TransactionTagLabel(String str, @StringRes int i, String str2, Integer num) {
        this.value = str2;
        this.displayStringResId = num;
    }

    static {
        TransactionTagLabel[] transactionTagLabelArr$values = $values();
        $VALUES = transactionTagLabelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionTagLabelArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.seR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TransactionTagLabel._init_$_anonymous_();
            }
        });
    }

    public static TransactionTagLabel valueOf(String str) {
        return (TransactionTagLabel) Enum.valueOf(TransactionTagLabel.class, str);
    }

    public static TransactionTagLabel[] values() {
        return (TransactionTagLabel[]) $VALUES.clone();
    }
}
