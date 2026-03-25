package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class AAStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AAStatus[] $VALUES;
    public static final Application Companion;
    private final int value;
    public static final AAStatus Normal = new AAStatus("Normal", 0, 0);
    public static final AAStatus ProxyAbnormal = new AAStatus("ProxyAbnormal", 1, 1);
    public static final AAStatus OwnerAbnormal = new AAStatus("OwnerAbnormal", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AAStatus[] $values() {
        return new AAStatus[]{Normal, ProxyAbnormal, OwnerAbnormal};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AAStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AAStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AAStatus[] aAStatusArr$values = $values();
        $VALUES = aAStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(aAStatusArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AAStatus.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AAStatus OLrzqt(int i) {
            if (i == 0) {
                return AAStatus.Normal;
            }
            if (i == 1) {
                return AAStatus.ProxyAbnormal;
            }
            if (i == 2) {
                return AAStatus.OwnerAbnormal;
            }
            return AAStatus.Normal;
        }
    }

    public static AAStatus valueOf(String str) {
        return (AAStatus) Enum.valueOf(AAStatus.class, str);
    }

    public static AAStatus[] values() {
        return (AAStatus[]) $VALUES.clone();
    }
}
