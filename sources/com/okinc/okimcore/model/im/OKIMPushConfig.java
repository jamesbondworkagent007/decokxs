package com.okinc.okimcore.model.im;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes24.dex */
public final class OKIMPushConfig {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PushType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PushType[] $VALUES;
        public static final PushType HUAWEI = new PushType("HUAWEI", 0);
        public static final PushType XIAOMI = new PushType("XIAOMI", 1);
        public static final PushType GOOGLE_FCM = new PushType("GOOGLE_FCM", 2);
        public static final PushType GOOGLE_GCM = new PushType("GOOGLE_GCM", 3);
        public static final PushType MEIZU = new PushType("MEIZU", 4);
        public static final PushType VIVO = new PushType("VIVO", 5);
        public static final PushType OPPO = new PushType("OPPO", 6);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PushType[] $values() {
            return new PushType[]{HUAWEI, XIAOMI, GOOGLE_FCM, GOOGLE_GCM, MEIZU, VIVO, OPPO};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PushType> getEntries() {
            return $ENTRIES;
        }

        private PushType(String str, int i) {
        }

        static {
            PushType[] pushTypeArr$values = $values();
            $VALUES = pushTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pushTypeArr$values);
        }

        public static PushType valueOf(String str) {
            return (PushType) Enum.valueOf(PushType.class, str);
        }

        public static PushType[] values() {
            return (PushType[]) $VALUES.clone();
        }
    }
}
