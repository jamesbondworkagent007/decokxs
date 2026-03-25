package com.reown.android.internal.common.connection;

import com.reown.foundation.network.ConnectionLifecycle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C58071yuP;
import o.InterfaceC58028ytZ;
import o.InterfaceC60097zve;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ManualConnectionLifecycle implements InterfaceC58028ytZ, ConnectionLifecycle {
    public final C58071yuP lifecycleRegistry;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ManualConnectionLifecycle() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC58028ytZ combineWith(@NotNull InterfaceC58028ytZ... interfaceC58028ytZArr) {
        Intrinsics.checkNotNullParameter(interfaceC58028ytZArr, "");
        return this.lifecycleRegistry.AEQbTJ(interfaceC58028ytZArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60096zvd
    public void subscribe(InterfaceC60097zve<? super InterfaceC58028ytZ.StateListAnimator> interfaceC60097zve) {
        this.lifecycleRegistry.subscribe(interfaceC60097zve);
    }

    public ManualConnectionLifecycle(@NotNull C58071yuP c58071yuP) {
        Intrinsics.checkNotNullParameter(c58071yuP, "");
        this.lifecycleRegistry = c58071yuP;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:o.yuP:?: TERNARY null = ((wrap:int:0x0001: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yuP:0x0009: CONSTRUCTOR (0 long), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(long, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:12) call: o.yuP.<init>(long, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r3v0 o.yuP))
 A[MD:(o.yuP):void (m)] (LINE:11) call: com.reown.android.internal.common.connection.ManualConnectionLifecycle.<init>(o.yuP):void type: THIS */
    public /* synthetic */ ManualConnectionLifecycle(C58071yuP c58071yuP, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C58071yuP(0L, 1, null) : c58071yuP);
    }

    public final void connect() {
        this.lifecycleRegistry.onNext(InterfaceC58028ytZ.StateListAnimator.Activity.EZpvd);
    }

    public final void disconnect() {
        this.lifecycleRegistry.onNext(new InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator.C1013StateListAnimator(null, 1, null));
    }

    @Override // com.reown.foundation.network.ConnectionLifecycle
    public StateFlow<Boolean> getOnResume() {
        return StateFlowKt.MutableStateFlow(null);
    }

    @Override // com.reown.foundation.network.ConnectionLifecycle
    public void reconnect() {
        this.lifecycleRegistry.onNext(new InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator.C1013StateListAnimator(null, 1, null));
        this.lifecycleRegistry.onNext(InterfaceC58028ytZ.StateListAnimator.Activity.EZpvd);
    }
}
