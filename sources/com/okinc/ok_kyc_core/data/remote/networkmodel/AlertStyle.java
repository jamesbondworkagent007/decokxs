package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.common.net.HttpHeaders;
import com.google.firebase.messaging.Constants;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlertStyle;
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
/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AlertStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AlertStyle[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("warning")
    public static final AlertStyle Warning = new AlertStyle(HttpHeaders.WARNING, 0);

    @SerialName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    public static final AlertStyle Error = new AlertStyle("Error", 1);

    @SerialName("info")
    public static final AlertStyle Info = new AlertStyle("Info", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AlertStyle[] $values() {
        return new AlertStyle[]{Warning, Error, Info};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AlertStyle> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AlertStyle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) AlertStyle.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AlertStyle> serializer() {
            return OLrzqt();
        }
    }

    private AlertStyle(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.AlertStyle", values(), new String[]{"warning", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "info"}, new Annotation[][]{null, null, null}, null);
    }

    static {
        AlertStyle[] alertStyleArr$values = $values();
        $VALUES = alertStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(alertStyleArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ruQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AlertStyle._init_$_anonymous_();
            }
        });
    }

    public static AlertStyle valueOf(String str) {
        return (AlertStyle) Enum.valueOf(AlertStyle.class, str);
    }

    public static AlertStyle[] values() {
        return (AlertStyle[]) $VALUES.clone();
    }
}
