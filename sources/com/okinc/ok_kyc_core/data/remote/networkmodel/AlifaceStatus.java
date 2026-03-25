package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceStatus;
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
/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AlifaceStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AlifaceStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int code;

    @SerialName("0")
    public static final AlifaceStatus NOT_STARTED = new AlifaceStatus("NOT_STARTED", 0, 0);

    @SerialName("1")
    public static final AlifaceStatus PROCESSING = new AlifaceStatus("PROCESSING", 1, 1);

    @SerialName("2")
    public static final AlifaceStatus SUCCESS = new AlifaceStatus("SUCCESS", 2, 2);

    @SerialName("3")
    public static final AlifaceStatus FAILED = new AlifaceStatus(CardSyncResponse.FAILED, 3, 3);

    @SerialName("4")
    public static final AlifaceStatus TIMEOUT = new AlifaceStatus("TIMEOUT", 4, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AlifaceStatus[] $values() {
        return new AlifaceStatus[]{NOT_STARTED, PROCESSING, SUCCESS, FAILED, TIMEOUT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AlifaceStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) AlifaceStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AlifaceStatus> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceStatus", values(), new String[]{"0", "1", "2", "3", "4"}, new Annotation[][]{null, null, null, null, null}, null);
    }

    private AlifaceStatus(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        AlifaceStatus[] alifaceStatusArr$values = $values();
        $VALUES = alifaceStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(alifaceStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ruW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AlifaceStatus._init_$_anonymous_();
            }
        });
    }

    public static AlifaceStatus valueOf(String str) {
        return (AlifaceStatus) Enum.valueOf(AlifaceStatus.class, str);
    }

    public static AlifaceStatus[] values() {
        return (AlifaceStatus[]) $VALUES.clone();
    }
}
