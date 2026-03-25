package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle;
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
public final class NotificationButtonStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NotificationButtonStyle[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("arrow-button")
    public static final NotificationButtonStyle ARROW_BUTTON = new NotificationButtonStyle("ARROW_BUTTON", 0);

    @SerialName("full-width")
    public static final NotificationButtonStyle FULL_WIDTH = new NotificationButtonStyle("FULL_WIDTH", 1);

    @SerialName("text")
    public static final NotificationButtonStyle TEXT = new NotificationButtonStyle("TEXT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NotificationButtonStyle[] $values() {
        return new NotificationButtonStyle[]{ARROW_BUTTON, FULL_WIDTH, TEXT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NotificationButtonStyle> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) NotificationButtonStyle.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<NotificationButtonStyle> serializer() {
            return EZpvd();
        }
    }

    private NotificationButtonStyle(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle", values(), new String[]{"arrow-button", "full-width", "text"}, new Annotation[][]{null, null, null}, null);
    }

    static {
        NotificationButtonStyle[] notificationButtonStyleArr$values = $values();
        $VALUES = notificationButtonStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(notificationButtonStyleArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rvg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return NotificationButtonStyle._init_$_anonymous_();
            }
        });
    }

    public static NotificationButtonStyle valueOf(String str) {
        return (NotificationButtonStyle) Enum.valueOf(NotificationButtonStyle.class, str);
    }

    public static NotificationButtonStyle[] values() {
        return (NotificationButtonStyle[]) $VALUES.clone();
    }
}
