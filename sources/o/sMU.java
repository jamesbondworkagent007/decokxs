package o;

import com.okinc.okimcore.feature.message.utility.TaskQueue$enqueue$1;
import com.okinc.okimcore.feature.message.utility.TaskQueue$init$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sMU {
    public final CoroutineDispatcher AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final kotlinx.coroutines.channels.Channel<Function2<CoroutineScope, Continuation<? super Unit>, java.lang.Object>> KWHzl;
    public final boolean OLrzqt;
    public final Function0<CoroutineScope> copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.CoroutineScope> */
    /* JADX WARN: Multi-variable type inference failed */
    public sMU(@NotNull java.lang.String str, @NotNull Function0<? extends CoroutineScope> function0, @NotNull kotlinx.coroutines.channels.Channel<Function2<CoroutineScope, Continuation<? super Unit>, java.lang.Object>> channel, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        this.valueOf = str;
        this.copydefault = function0;
        this.KWHzl = channel;
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = coroutineDispatcher2;
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 kotlin.jvm.functions.Function0)
  (wrap:kotlinx.coroutines.channels.Channel:0x000d: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.channels.Channel:0x0009: INVOKE 
  (Integer.MAX_VALUE int)
  (null kotlinx.coroutines.channels.BufferOverflow)
  (null kotlin.jvm.functions.Function1)
  (6 int)
  (null java.lang.Object)
 STATIC call: kotlinx.coroutines.channels.ChannelKt.Channel$default(int, kotlinx.coroutines.channels.BufferOverflow, kotlin.jvm.functions.Function1, int, java.lang.Object):kotlinx.coroutines.channels.Channel A[MD:(int, kotlinx.coroutines.channels.BufferOverflow, kotlin.jvm.functions.Function1, int, java.lang.Object):kotlinx.coroutines.channels.Channel (m), WRAPPED] (LINE:21)) : (r10v0 kotlinx.coroutines.channels.Channel))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x001d: TERNARY null = ((wrap:int:0x000e: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0019: INVOKE 
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0015: INVOKE (wrap:o.sDN:0x0013: SGET  A[WRAPPED] (LINE:22) o.sDN.copydefault o.sDN) VIRTUAL call: o.sDN.copydefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:22))
  (1 int)
 VIRTUAL call: kotlinx.coroutines.CoroutineDispatcher.limitedParallelism(int):kotlinx.coroutines.CoroutineDispatcher A[MD:(int):kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:22)) : (r11v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x002c: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0028: INVOKE 
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0024: INVOKE (wrap:o.sDN:0x0022: SGET  A[WRAPPED] (LINE:23) o.sDN.copydefault o.sDN) VIRTUAL call: o.sDN.copydefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:23))
  (1 int)
 VIRTUAL call: kotlinx.coroutines.CoroutineDispatcher.limitedParallelism(int):kotlinx.coroutines.CoroutineDispatcher A[MD:(int):kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:23)) : (r12v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(java.lang.String, kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.CoroutineScope>, kotlinx.coroutines.channels.Channel<kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>>, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, boolean):void (m)] (LINE:18) call: o.sMU.<init>(java.lang.String, kotlin.jvm.functions.Function0, kotlinx.coroutines.channels.Channel, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, boolean):void type: THIS */
    public /* synthetic */ sMU(java.lang.String str, Function0 function0, kotlinx.coroutines.channels.Channel channel, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function0, (i & 4) != 0 ? ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null) : channel, (i & 8) != 0 ? sDN.copydefault.copydefault().limitedParallelism(1) : coroutineDispatcher, (i & 16) != 0 ? sDN.copydefault.copydefault().limitedParallelism(1) : coroutineDispatcher2, (i & 32) != 0 ? false : z);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(C44157sFk.EZpvd(this.copydefault, this.valueOf), this.AEQbTJ, null, new TaskQueue$init$1(this, null), 2, null);
    }

    public final Job KWHzl(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return BuildersKt__Builders_commonKt.launch$default(C44157sFk.EZpvd(this.copydefault, this.valueOf), this.EZpvd, null, new TaskQueue$enqueue$1(this, function2, null), 2, null);
    }
}
