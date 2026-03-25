package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.WCResultStatus;
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
public final class WCResultStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WCResultStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int code;

    @SerialName(MultiTransferSignData.DEFAULT_INTERVAL)
    public static final WCResultStatus Timeout = new WCResultStatus("Timeout", 0, -1);

    @SerialName("0")
    public static final WCResultStatus Processing = new WCResultStatus("Processing", 1, 0);

    @SerialName("1")
    public static final WCResultStatus WC_Hit = new WCResultStatus("WC_Hit", 2, 1);

    @SerialName("2")
    public static final WCResultStatus WC_Miss = new WCResultStatus("WC_Miss", 3, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WCResultStatus[] $values() {
        return new WCResultStatus[]{Timeout, Processing, WC_Hit, WC_Miss};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WCResultStatus> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.WCResultStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) WCResultStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<WCResultStatus> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.WCResultStatus", values(), new String[]{MultiTransferSignData.DEFAULT_INTERVAL, "0", "1", "2"}, new Annotation[][]{null, null, null, null}, null);
    }

    private WCResultStatus(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        WCResultStatus[] wCResultStatusArr$values = $values();
        $VALUES = wCResultStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(wCResultStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rvv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return WCResultStatus._init_$_anonymous_();
            }
        });
    }

    public static WCResultStatus valueOf(String str) {
        return (WCResultStatus) Enum.valueOf(WCResultStatus.class, str);
    }

    public static WCResultStatus[] values() {
        return (WCResultStatus[]) $VALUES.clone();
    }
}
