package com.okinc.okimcore.model.im.inhouseim;

import com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44433sPq;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44433sPq.class)
public final class ReceiveMessageOptionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ReceiveMessageOptionType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int apiValue;
    public static final ReceiveMessageOptionType RECEIVE = new ReceiveMessageOptionType("RECEIVE", 0, 0);
    public static final ReceiveMessageOptionType DONT_RECEIVE = new ReceiveMessageOptionType("DONT_RECEIVE", 1, 1);
    public static final ReceiveMessageOptionType RECEIVE_SILENTLY = new ReceiveMessageOptionType("RECEIVE_SILENTLY", 2, 2);
    public static final ReceiveMessageOptionType UNKNOWN = new ReceiveMessageOptionType("UNKNOWN", 3, -1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ReceiveMessageOptionType[] $values() {
        return new ReceiveMessageOptionType[]{RECEIVE, DONT_RECEIVE, RECEIVE_SILENTLY, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ReceiveMessageOptionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiValue() {
        return this.apiValue;
    }

    private ReceiveMessageOptionType(String str, int i, int i2) {
        this.apiValue = i2;
    }

    static {
        ReceiveMessageOptionType[] receiveMessageOptionTypeArr$values = $values();
        $VALUES = receiveMessageOptionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(receiveMessageOptionTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sPs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ReceiveMessageOptionType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) ReceiveMessageOptionType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ReceiveMessageOptionType> serializer() {
            return KWHzl();
        }

        public final ReceiveMessageOptionType EZpvd(int i) {
            ReceiveMessageOptionType receiveMessageOptionType;
            ReceiveMessageOptionType[] receiveMessageOptionTypeArrValues = ReceiveMessageOptionType.values();
            int length = receiveMessageOptionTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    receiveMessageOptionType = null;
                    break;
                }
                receiveMessageOptionType = receiveMessageOptionTypeArrValues[i2];
                if (receiveMessageOptionType.getApiValue() == i) {
                    break;
                }
                i2++;
            }
            return receiveMessageOptionType == null ? ReceiveMessageOptionType.UNKNOWN : receiveMessageOptionType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44433sPq();
    }

    public static ReceiveMessageOptionType valueOf(String str) {
        return (ReceiveMessageOptionType) Enum.valueOf(ReceiveMessageOptionType.class, str);
    }

    public static ReceiveMessageOptionType[] values() {
        return (ReceiveMessageOptionType[]) $VALUES.clone();
    }
}
