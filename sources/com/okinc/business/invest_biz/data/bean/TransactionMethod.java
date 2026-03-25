package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TransactionMethod {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionMethod[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("0")
    public static final TransactionMethod UNKNOWN = new TransactionMethod("UNKNOWN", 0);

    @SerialName("1")
    public static final TransactionMethod SINGLE = new TransactionMethod("SINGLE", 1);

    @SerialName("2")
    public static final TransactionMethod MULTI = new TransactionMethod("MULTI", 2);

    @SerialName("3")
    public static final TransactionMethod BOTH = new TransactionMethod("BOTH", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionMethod[] $values() {
        return new TransactionMethod[]{UNKNOWN, SINGLE, MULTI, BOTH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionMethod> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.TransactionMethod.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) TransactionMethod.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TransactionMethod> serializer() {
            return KWHzl();
        }
    }

    private TransactionMethod(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.bean.TransactionMethod", values(), new String[]{"0", "1", "2", "3"}, new Annotation[][]{null, null, null, null}, null);
    }

    static {
        TransactionMethod[] transactionMethodArr$values = $values();
        $VALUES = transactionMethodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionMethodArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TransactionMethod._init_$_anonymous_();
            }
        });
    }

    public static TransactionMethod valueOf(String str) {
        return (TransactionMethod) Enum.valueOf(TransactionMethod.class, str);
    }

    public static TransactionMethod[] values() {
        return (TransactionMethod[]) $VALUES.clone();
    }
}
