package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus;
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
public final class MultiVendorResultStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MultiVendorResultStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int code;

    @SerialName("-2")
    public static final MultiVendorResultStatus BeginInit = new MultiVendorResultStatus("BeginInit", 0, -2);

    @SerialName(MultiTransferSignData.DEFAULT_INTERVAL)
    public static final MultiVendorResultStatus NoRecord = new MultiVendorResultStatus("NoRecord", 1, -1);

    @SerialName("0")
    public static final MultiVendorResultStatus Processing = new MultiVendorResultStatus("Processing", 2, 0);

    @SerialName("1")
    public static final MultiVendorResultStatus Conflict = new MultiVendorResultStatus("Conflict", 3, 1);

    @SerialName("2")
    public static final MultiVendorResultStatus Passed = new MultiVendorResultStatus("Passed", 4, 2);

    @SerialName("3")
    public static final MultiVendorResultStatus Error = new MultiVendorResultStatus("Error", 5, 3);

    @SerialName("4")
    public static final MultiVendorResultStatus Timeout = new MultiVendorResultStatus("Timeout", 6, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MultiVendorResultStatus[] $values() {
        return new MultiVendorResultStatus[]{BeginInit, NoRecord, Processing, Conflict, Passed, Error, Timeout};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MultiVendorResultStatus> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) MultiVendorResultStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<MultiVendorResultStatus> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus", values(), new String[]{"-2", MultiTransferSignData.DEFAULT_INTERVAL, "0", "1", "2", "3", "4"}, new Annotation[][]{null, null, null, null, null, null, null}, null);
    }

    private MultiVendorResultStatus(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        MultiVendorResultStatus[] multiVendorResultStatusArr$values = $values();
        $VALUES = multiVendorResultStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(multiVendorResultStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rvc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MultiVendorResultStatus._init_$_anonymous_();
            }
        });
    }

    public static MultiVendorResultStatus valueOf(String str) {
        return (MultiVendorResultStatus) Enum.valueOf(MultiVendorResultStatus.class, str);
    }

    public static MultiVendorResultStatus[] values() {
        return (MultiVendorResultStatus[]) $VALUES.clone();
    }
}
