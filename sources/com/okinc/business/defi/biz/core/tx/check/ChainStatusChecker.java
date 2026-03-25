package com.okinc.business.defi.biz.core.tx.check;

import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.biz.net.bean.CheckTransferResp;
import com.okinc.business.defi.biz.net.bean.RegisterStatusResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.reown.android.pulse.model.EventType;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C13934dbu;
import o.C43423rox;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ChainStatusChecker {
    public static final ChainStatusChecker OLrzqt = new ChainStatusChecker();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.cmN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ChainStatusChecker.KWHzl();
        }
    });
    public static final int AEQbTJ = 8;

    private ChainStatusChecker() {
    }

    public static final C13934dbu KWHzl() {
        return new C13934dbu();
    }

    public final C13934dbu AEQbTJ() {
        return (C13934dbu) EZpvd.getValue();
    }

    /* JADX DEBUG: Type inference failed for r9v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.defi.biz.core.tx.check.ChainStatus> */
    public final AbstractC58185ywX<ChainStatus> OLrzqt(long j, @NotNull String str, @NotNull String str2, @NotNull List<? extends ChainCheckType> list) {
        Object obj;
        Object next;
        AbstractC58185ywX<Boolean> abstractC58185ywXKWHzl;
        final AbstractC58185ywX<ChainStatus> abstractC58185ywXKWHzl2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ChainCheckType) next) == ChainCheckType.CHECK_TRANSFER) {
                break;
            }
        }
        boolean z = next != null;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((ChainCheckType) next2) == ChainCheckType.CHECK_REGISTER) {
                obj = next2;
                break;
            }
        }
        boolean z2 = obj != null;
        if (z) {
            abstractC58185ywXKWHzl = OLrzqt(j);
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Boolean.TRUE);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        if (z2) {
            abstractC58185ywXKWHzl2 = OLrzqt(j, str, str2);
        } else {
            abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(ChainStatus.REGISTERED);
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        }
        final Function1 function1 = new Function1() { // from class: o.cmS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ChainStatusChecker.EZpvd(abstractC58185ywXKWHzl2, (java.lang.Boolean) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cmW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return ChainStatusChecker.KWHzl(function1, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC60096zvd KWHzl(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(AbstractC58185ywX abstractC58185ywX, Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            return abstractC58185ywX;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(ChainStatus.CANNOT_TRANSFER);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final Boolean copydefault(CheckTransferResp checkTransferResp) {
        Intrinsics.checkNotNullParameter(checkTransferResp, "");
        return Boolean.valueOf(Intrinsics.EZpvd(checkTransferResp.getResult(), Boolean.TRUE));
    }

    public static final Boolean gEmmrt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Boolean) function1.invoke(obj);
    }

    public final AbstractC58185ywX<Boolean> OLrzqt(long j) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(AEQbTJ().EZpvd(j), (Function1) null, 1, (Object) null);
        final Function1 function1 = new Function1() { // from class: o.cmR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChainStatusChecker.copydefault((CheckTransferResp) obj);
            }
        };
        AbstractC58185ywX<Boolean> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cmU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ChainStatusChecker.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public final AbstractC58185ywX<ChainStatus> OLrzqt(long j, String str, String str2) {
        if (str.length() == 0) {
            AbstractC58185ywX<ChainStatus> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((Throwable) new IllegalArgumentException("address is empty"));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C13934dbu.queryAddressRegisterStatus$default(AEQbTJ(), j, str, str2, null, 8, null), (Function1) null, 1, (Object) null);
        final Function1 function1 = new Function1() { // from class: o.cmP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChainStatusChecker.EZpvd((RegisterStatusResp) obj);
            }
        };
        AbstractC58185ywX<ChainStatus> abstractC58185ywXAEQbTJ2 = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cmO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ChainStatusChecker.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ChainStatus copydefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ChainStatus) function1.invoke(obj);
    }

    public static final ChainStatus EZpvd(RegisterStatusResp registerStatusResp) {
        Intrinsics.checkNotNullParameter(registerStatusResp, "");
        return OLrzqt.OLrzqt(registerStatusResp);
    }

    public final ChainStatus OLrzqt(@NotNull RegisterStatusResp registerStatusResp) {
        Intrinsics.checkNotNullParameter(registerStatusResp, "");
        if (Intrinsics.EZpvd(registerStatusResp.getRegister(), Boolean.TRUE)) {
            return ChainStatus.REGISTERED;
        }
        Integer status = registerStatusResp.getStatus();
        int value = Status.NONE.getValue();
        if (status == null || status.intValue() != value) {
            int value2 = Status.TIMEOUT_FAIL.getValue();
            if (status == null || status.intValue() != value2) {
                int value3 = Status.ERROR.getValue();
                if (status == null || status.intValue() != value3) {
                    int value4 = Status.SUCCESS.getValue();
                    if (status != null && status.intValue() == value4) {
                        return ChainStatus.REGISTERED;
                    }
                    return ChainStatus.REGISTERING;
                }
            }
        }
        return ChainStatus.UNREGISTERED;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private final int value;
        public static final Status NONE = new Status("NONE", 0, 0);
        public static final Status PACKAGING = new Status("PACKAGING", 1, 1);
        public static final Status OKEX_BROADCAST = new Status("OKEX_BROADCAST", 2, 2);
        public static final Status CONFIRMING = new Status("CONFIRMING", 3, 3);
        public static final Status TIMEOUT_FAIL = new Status("TIMEOUT_FAIL", 4, 4);
        public static final Status ERROR = new Status(EventType.ERROR, 5, 5);
        public static final Status SUCCESS = new Status("SUCCESS", 6, 6);
        public static final Status PENDING = new Status(CardSyncResponse.PENDING, 7, 7);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Status[] $values() {
            return new Status[]{NONE, PACKAGING, OKEX_BROADCAST, CONFIRMING, TIMEOUT_FAIL, ERROR, SUCCESS, PENDING};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Status> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private Status(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }
}
