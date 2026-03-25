package com.okinc.wallet.api;

import androidx.fragment.app.FragmentActivity;
import com.okinc.wallet.api.bean.DappSupportCheck;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC58185ywX;
import o.C56444yFp;
import o.InterfaceC43217rlC;
import o.InterfaceC56445yFq;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface MpcWalletService extends InterfaceC43217rlC {
    AbstractC58185ywX<Map<String, MpcWalletAbleStatus>> AEQbTJ(@NotNull List<? extends InterfaceC9738bbJ> list);

    void AEQbTJ(@NotNull Function1<? super Boolean, Unit> function1);

    void AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super Boolean, Unit> function1);

    String EZpvd(@NotNull MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull InterfaceC9738bbJ interfaceC9738bbJ);

    void EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super Boolean, Unit> function1);

    void KWHzl(@NotNull MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super Boolean, Unit> function1);

    void KWHzl(@NotNull List<? extends InterfaceC9738bbJ> list, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super Map<String, ? extends MpcWalletAbleStatus>, Unit> function1);

    void KWHzl(@NotNull Function1<? super Boolean, Unit> function1);

    void KWHzl(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super Boolean, Unit> function1);

    void OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull Function1<? super Boolean, Unit> function1);

    Function1<Boolean, Unit> aQ_();

    Function1<Boolean, Unit> aR_();

    Function1<Boolean, Unit> aS_();

    MpcWalletAbleStatus copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ);

    void copydefault(@NotNull Function1<? super Boolean, Unit> function1);

    void copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super MpcWalletAbleStatus, Unit> function1);

    AbstractC58185ywX<DappSupportCheck> j_(@NotNull String str);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MpcWalletAbleStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MpcWalletAbleStatus[] $VALUES;
        public static final MpcWalletAbleStatus OKWMPCWalletStatusAccountDelete;
        public static final MpcWalletAbleStatus OKWMPCWalletStatusAccountFrozen;
        public static final MpcWalletAbleStatus OKWMPCWalletStatusDefault = new MpcWalletAbleStatus("OKWMPCWalletStatusDefault", 0, null, 1, null);
        public static final MpcWalletAbleStatus OKWMPCWalletStatusEscape;
        public static final MpcWalletAbleStatus OKWMPCWalletStatusNoBackUp;
        public static final MpcWalletAbleStatus OKWMPCWalletStatusNoLogin;
        public static final MpcWalletAbleStatus OKWMPCWalletStatusNormal;
        public static final MpcWalletAbleStatus OKWMPCWalletStatusRefreshed;
        public static final MpcWalletAbleStatus OKWMPCWalletStatusSwitch;
        private Object data;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MpcWalletAbleStatus[] $values() {
            return new MpcWalletAbleStatus[]{OKWMPCWalletStatusDefault, OKWMPCWalletStatusNormal, OKWMPCWalletStatusNoLogin, OKWMPCWalletStatusSwitch, OKWMPCWalletStatusRefreshed, OKWMPCWalletStatusNoBackUp, OKWMPCWalletStatusEscape, OKWMPCWalletStatusAccountDelete, OKWMPCWalletStatusAccountFrozen};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MpcWalletAbleStatus> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setData(Object obj) {
            this.data = obj;
        }

        private MpcWalletAbleStatus(String str, int i, Object obj) {
            this.data = obj;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r3v0 java.lang.Object))
 A[MD:(java.lang.String, int, java.lang.Object):void (m)] (LINE:13) call: com.okinc.wallet.api.MpcWalletService.MpcWalletAbleStatus.<init>(java.lang.String, int, java.lang.Object):void type: THIS */
        public /* synthetic */ MpcWalletAbleStatus(String str, int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 1) != 0 ? null : obj);
        }

        static {
            Object obj = null;
            int i = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            OKWMPCWalletStatusNormal = new MpcWalletAbleStatus("OKWMPCWalletStatusNormal", 1, obj, i, defaultConstructorMarker);
            Object obj2 = null;
            int i2 = 1;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            OKWMPCWalletStatusNoLogin = new MpcWalletAbleStatus("OKWMPCWalletStatusNoLogin", 2, obj2, i2, defaultConstructorMarker2);
            OKWMPCWalletStatusSwitch = new MpcWalletAbleStatus("OKWMPCWalletStatusSwitch", 3, obj, i, defaultConstructorMarker);
            OKWMPCWalletStatusRefreshed = new MpcWalletAbleStatus("OKWMPCWalletStatusRefreshed", 4, obj2, i2, defaultConstructorMarker2);
            OKWMPCWalletStatusNoBackUp = new MpcWalletAbleStatus("OKWMPCWalletStatusNoBackUp", 5, obj, i, defaultConstructorMarker);
            OKWMPCWalletStatusEscape = new MpcWalletAbleStatus("OKWMPCWalletStatusEscape", 6, obj2, i2, defaultConstructorMarker2);
            OKWMPCWalletStatusAccountDelete = new MpcWalletAbleStatus("OKWMPCWalletStatusAccountDelete", 7, obj, i, defaultConstructorMarker);
            OKWMPCWalletStatusAccountFrozen = new MpcWalletAbleStatus("OKWMPCWalletStatusAccountFrozen", 8, obj2, i2, defaultConstructorMarker2);
            MpcWalletAbleStatus[] mpcWalletAbleStatusArr$values = $values();
            $VALUES = mpcWalletAbleStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(mpcWalletAbleStatusArr$values);
        }

        public static MpcWalletAbleStatus valueOf(String str) {
            return (MpcWalletAbleStatus) Enum.valueOf(MpcWalletAbleStatus.class, str);
        }

        public static MpcWalletAbleStatus[] values() {
            return (MpcWalletAbleStatus[]) $VALUES.clone();
        }
    }
}
