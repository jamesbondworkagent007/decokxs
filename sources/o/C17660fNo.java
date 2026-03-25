package o;

import com.okinc.business.defi.wallet.passkey.common.ws.service.PasskeyWalletWSConnectionService$2;
import com.okinc.business.defi.wallet.passkey.common.ws.service.PasskeyWalletWSConnectionService$3;
import com.okinc.okuser.data.Token;
import com.okinc.websocket.connection.OKWsDoh;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@yCR
public final class C17660fNo {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C57567ykp EZpvd;
    public final C57567ykp KWHzl;
    public final CoroutineScope OLrzqt;
    public final InterfaceC47278tmy valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57567ykp copydefault(boolean z) {
        return z ? this.EZpvd : this.KWHzl;
    }

    public C17660fNo(@NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull C57567ykp c57567ykp, @NotNull C57567ykp c57567ykp2, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(c57567ykp, "");
        Intrinsics.checkNotNullParameter(c57567ykp2, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.valueOf = interfaceC47278tmy;
        this.KWHzl = c57567ykp;
        this.EZpvd = c57567ykp2;
        this.AEQbTJ = coroutineDispatcher;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
        this.OLrzqt = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new PasskeyWalletWSConnectionService$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new PasskeyWalletWSConnectionService$3(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.fNo$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fNo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r1v0 o.tmy)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0008: INVOKE 
  (wrap:kotlinx.coroutines.MainCoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getMain():kotlinx.coroutines.MainCoroutineDispatcher A[MD:():kotlinx.coroutines.MainCoroutineDispatcher (m), WRAPPED] (LINE:36))
 VIRTUAL call: kotlinx.coroutines.MainCoroutineDispatcher.getImmediate():kotlinx.coroutines.MainCoroutineDispatcher A[MD:():kotlinx.coroutines.MainCoroutineDispatcher (m), WRAPPED] (LINE:36)) : (r4v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(o.tmy, java.lang.String, java.lang.String, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:32) call: o.fNo.<init>(o.tmy, java.lang.String, java.lang.String, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ C17660fNo(InterfaceC47278tmy interfaceC47278tmy, java.lang.String str, java.lang.String str2, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC47278tmy, str, str2, (i & 8) != 0 ? Dispatchers.getMain().getImmediate() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17660fNo(@NotNull final InterfaceC47278tmy interfaceC47278tmy, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this(interfaceC47278tmy, new C57567ykp(new C57527ykB(str, true, "jwt", new Function0() { // from class: o.fNv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17660fNo.EZpvd(interfaceC47278tmy);
            }
        }, false, OKWsDoh.V5, 16, null)), new C57567ykp(new C57527ykB(str2, false, null, null, false, OKWsDoh.DEXPRI, 28, null)), coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
    }

    public static final java.util.List EZpvd(InterfaceC47278tmy interfaceC47278tmy) {
        Token tokenAhwBna = interfaceC47278tmy.AhwBna();
        return C56402yEa.EZpvd(C56423yEv.EZpvd(C56390yDp.OLrzqt("jwtToken", tokenAhwBna != null ? tokenAhwBna.getValue() : null)));
    }
}
