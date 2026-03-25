package com.okinc.business.defi.wallet.transfer.manager;

import com.okinc.business.defi.biz.net.bean.FreeGasCheckAuthorityRes;
import com.okinc.business.defi.biz.net.bean.FreeGasValuationLimit;
import com.okinc.business.defi.biz.net.bean.WalletActivityFreeGasRes;
import com.okinc.business.defi.wallet.transfer.manager.FreeGasManager;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C13934dbu;
import o.C14473dmC;
import o.C33129mqd;
import o.C35202nqq;
import o.C56390yDp;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class FreeGasManager {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.grP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FreeGasManager.AEQbTJ();
        }
    });
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public static Map<String, Pair<Integer, ArrayList<FreeGasValuationLimit>>> AEQbTJ = new LinkedHashMap();

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transfer.manager.FreeGasManager.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final C13934dbu EZpvd() {
        return (C13934dbu) this.KWHzl.getValue();
    }

    public static final C13934dbu AEQbTJ() {
        return new C13934dbu();
    }

    public static /* synthetic */ AbstractC58185ywX getUserFreeGasStatus$default(FreeGasManager freeGasManager, String str, long j, String str2, Integer num, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        return freeGasManager.AEQbTJ(str, j, str2, num);
    }

    public final AbstractC58185ywX<UserFreeGasInfo> AEQbTJ(@NotNull final String str, final long j, @NotNull final String str2, final Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C35202nqq.OLrzqt.AEQbTJ("wallet_free_gas_guard_check") && C14473dmC.EZpvd.KWHzl()) {
            AbstractC58185ywX<UserFreeGasInfo> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new UserFreeGasInfo(j, null, 0, 0, -1, null, 46, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        Pair<Integer, ArrayList<FreeGasValuationLimit>> pair = AEQbTJ.get(str);
        ArrayList<FreeGasValuationLimit> second = pair != null ? pair.getSecond() : null;
        if (second == null || second.isEmpty()) {
            AbstractC58185ywX<ResponseData<List<WalletActivityFreeGasRes>>> abstractC58185ywXCopydefault = EZpvd().copydefault();
            final Function1 function1 = new Function1() { // from class: o.grG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return FreeGasManager.OLrzqt((ResponseData) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.grI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return FreeGasManager.EZpvd(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.grK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return FreeGasManager.AEQbTJ(this.OLrzqt, j, str2, str, num, (Unit) obj);
                }
            };
            AbstractC58185ywX<UserFreeGasInfo> abstractC58185ywXKWHzl2 = abstractC58185ywXAEQbTJ.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.grJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return FreeGasManager.valueOf(function12, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }
        return EZpvd(j, str2, pair, num);
    }

    public static final Unit EZpvd(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit OLrzqt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        List<WalletActivityFreeGasRes> list = (List) responseData.getData();
        if (list == null) {
            return null;
        }
        for (WalletActivityFreeGasRes walletActivityFreeGasRes : list) {
            AEQbTJ.put(walletActivityFreeGasRes.getActivitySymbol(), C56390yDp.OLrzqt(walletActivityFreeGasRes.getActivityId(), walletActivityFreeGasRes.getActivityConfig()));
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(FreeGasManager freeGasManager, long j, String str, String str2, Integer num, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return freeGasManager.EZpvd(j, str, AEQbTJ.get(str2), num);
    }

    public final AbstractC58185ywX<UserFreeGasInfo> EZpvd(final long j, String str, Pair<Integer, ? extends ArrayList<FreeGasValuationLimit>> pair, Integer num) {
        final FreeGasValuationLimit freeGasValuationLimit;
        ArrayList<FreeGasValuationLimit> second;
        if (pair == null || (second = pair.getSecond()) == null) {
            freeGasValuationLimit = null;
        } else {
            Iterator<T> it = second.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                freeGasValuationLimit = (FreeGasValuationLimit) it.next();
                Long chainId = freeGasValuationLimit.getChainId();
                if (chainId != null && chainId.longValue() == j) {
                    if (num != null && C33129mqd.KWHzl((Collection) freeGasValuationLimit.getNotSupportSource())) {
                        List<Integer> notSupportSource = freeGasValuationLimit.getNotSupportSource();
                        Intrinsics.copydefault(notSupportSource);
                        if (notSupportSource.contains(num)) {
                            break;
                        }
                    }
                }
            }
            freeGasValuationLimit = null;
        }
        if (pair == null || freeGasValuationLimit == null) {
            AbstractC58185ywX<UserFreeGasInfo> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new UserFreeGasInfo(j, null, 0, 0, -1, null, 46, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXAEQbTJ = EZpvd().AEQbTJ(pair.getFirst(), C33129mqd.gEmmrt(Long.valueOf(j)), str, (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null);
        final Function1 function1 = new Function1() { // from class: o.grE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FreeGasManager.AEQbTJ(j, freeGasValuationLimit, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<UserFreeGasInfo> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.grH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return FreeGasManager.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final UserFreeGasInfo AEQbTJ(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (UserFreeGasInfo) function1.invoke(obj);
    }

    public static final class UserFreeGasInfo {
        public static final int $stable = 0;
        public static final int CODE_ACTIVITY_NOT_OPEN = 170003;
        public static final int CODE_EXCEED_MAX_FREE_QUOTA = 170006;
        public static final int CODE_EXCEED_MAX_TIMES_DAILY = 170004;
        public static final int CODE_NOT_SUPPORT = -1;
        public static final int CODE_SUPPORT = 0;
        public static final int CODE_VERSION_TOO_LOW = 170005;
        public static final TaskDescription Companion = new TaskDescription(null);
        private final int availableTimes;
        private final int errorCode;
        private final String errorMsg;
        private final long generalChainId;
        private final String limitGasValuation;
        private final int totalTimes;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.generalChainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.limitGasValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component3() {
            return this.totalTimes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component4() {
            return this.availableTimes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component5() {
            return this.errorCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.errorMsg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UserFreeGasInfo copy(long j, @NotNull String str, int i, int i2, int i3, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new UserFreeGasInfo(j, str, i, i2, i3, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserFreeGasInfo)) {
                return false;
            }
            UserFreeGasInfo userFreeGasInfo = (UserFreeGasInfo) obj;
            return this.generalChainId == userFreeGasInfo.generalChainId && Intrinsics.EZpvd((Object) this.limitGasValuation, (Object) userFreeGasInfo.limitGasValuation) && this.totalTimes == userFreeGasInfo.totalTimes && this.availableTimes == userFreeGasInfo.availableTimes && this.errorCode == userFreeGasInfo.errorCode && Intrinsics.EZpvd((Object) this.errorMsg, (Object) userFreeGasInfo.errorMsg);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getAvailableTimes() {
            return this.availableTimes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getErrorCode() {
            return this.errorCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getGeneralChainId() {
            return this.generalChainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLimitGasValuation() {
            return this.limitGasValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTotalTimes() {
            return this.totalTimes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((Long.hashCode(this.generalChainId) * 31) + this.limitGasValuation.hashCode()) * 31) + Integer.hashCode(this.totalTimes)) * 31) + Integer.hashCode(this.availableTimes)) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.errorMsg.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isFreeGas() {
            return this.errorCode == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UserFreeGasInfo(generalChainId=" + this.generalChainId + ", limitGasValuation=" + this.limitGasValuation + ", totalTimes=" + this.totalTimes + ", availableTimes=" + this.availableTimes + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ")";
        }

        public UserFreeGasInfo(long j, @NotNull String str, int i, int i2, int i3, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.generalChainId = j;
            this.limitGasValuation = str;
            this.totalTimes = i;
            this.availableTimes = i2;
            this.errorCode = i3;
            this.errorMsg = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r11v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r16v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(long, java.lang.String, int, int, int, java.lang.String):void (m)] (LINE:114) call: com.okinc.business.defi.wallet.transfer.manager.FreeGasManager.UserFreeGasInfo.<init>(long, java.lang.String, int, int, int, java.lang.String):void type: THIS */
        public /* synthetic */ UserFreeGasInfo(long j, String str, int i, int i2, int i3, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? -1 : i3, (i4 & 32) != 0 ? "" : str2);
        }

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transfer.manager.FreeGasManager.UserFreeGasInfo.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }
    }

    public static final UserFreeGasInfo AEQbTJ(long j, FreeGasValuationLimit freeGasValuationLimit, ResponseData responseData) {
        String errorMsg;
        Integer errorCode;
        Integer availableTimes;
        Integer totalTimes;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            String gas = freeGasValuationLimit.getGas();
            String str = gas == null ? "" : gas;
            FreeGasCheckAuthorityRes freeGasCheckAuthorityRes = (FreeGasCheckAuthorityRes) responseData.getData();
            int iIntValue = (freeGasCheckAuthorityRes == null || (totalTimes = freeGasCheckAuthorityRes.getTotalTimes()) == null) ? 0 : totalTimes.intValue();
            FreeGasCheckAuthorityRes freeGasCheckAuthorityRes2 = (FreeGasCheckAuthorityRes) responseData.getData();
            int iIntValue2 = (freeGasCheckAuthorityRes2 == null || (availableTimes = freeGasCheckAuthorityRes2.getAvailableTimes()) == null) ? 0 : availableTimes.intValue();
            FreeGasCheckAuthorityRes freeGasCheckAuthorityRes3 = (FreeGasCheckAuthorityRes) responseData.getData();
            int iIntValue3 = (freeGasCheckAuthorityRes3 == null || (errorCode = freeGasCheckAuthorityRes3.getErrorCode()) == null) ? -1 : errorCode.intValue();
            FreeGasCheckAuthorityRes freeGasCheckAuthorityRes4 = (FreeGasCheckAuthorityRes) responseData.getData();
            return new UserFreeGasInfo(j, str, iIntValue, iIntValue2, iIntValue3, (freeGasCheckAuthorityRes4 == null || (errorMsg = freeGasCheckAuthorityRes4.getErrorMsg()) == null) ? "" : errorMsg);
        }
        String gas2 = freeGasValuationLimit.getGas();
        return new UserFreeGasInfo(j, gas2 == null ? "" : gas2, 0, 0, -1, null, 44, null);
    }
}
