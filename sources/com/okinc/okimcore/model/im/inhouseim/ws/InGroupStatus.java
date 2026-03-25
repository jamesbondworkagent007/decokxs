package com.okinc.okimcore.model.im.inhouseim.ws;

import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C33129mqd;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.sPD;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = sPD.class)
public final class InGroupStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InGroupStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final InGroupStatus IN_GROUP = new InGroupStatus("IN_GROUP", 0, 1);
    public static final InGroupStatus NOT_IN_GROUP = new InGroupStatus("NOT_IN_GROUP", 1, 0);
    public static final InGroupStatus UNKNOWN = new InGroupStatus("UNKNOWN", 2, -1);
    private final int apiValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InGroupStatus[] $values() {
        return new InGroupStatus[]{IN_GROUP, NOT_IN_GROUP, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InGroupStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiValue() {
        return this.apiValue;
    }

    private InGroupStatus(String str, int i, int i2) {
        this.apiValue = i2;
    }

    static {
        InGroupStatus[] inGroupStatusArr$values = $values();
        $VALUES = inGroupStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inGroupStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sPG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InGroupStatus._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) InGroupStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InGroupStatus> serializer() {
            return AEQbTJ();
        }

        public final InGroupStatus OLrzqt(@NotNull Object obj) {
            InGroupStatus inGroupStatus;
            Intrinsics.checkNotNullParameter(obj, "");
            InGroupStatus[] inGroupStatusArrValues = InGroupStatus.values();
            int length = inGroupStatusArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    inGroupStatus = null;
                    break;
                }
                inGroupStatus = inGroupStatusArrValues[i];
                if (inGroupStatus.getApiValue() == C33129mqd.AhwBna(obj)) {
                    break;
                }
                i++;
            }
            return inGroupStatus == null ? InGroupStatus.UNKNOWN : inGroupStatus;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new sPD();
    }

    public static InGroupStatus valueOf(String str) {
        return (InGroupStatus) Enum.valueOf(InGroupStatus.class, str);
    }

    public static InGroupStatus[] values() {
        return (InGroupStatus[]) $VALUES.clone();
    }
}
