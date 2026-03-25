package com.okinc.trade.experience.view;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42961rgL;
import o.InterfaceC60044zuT;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public final class UDOKMarketQuoteCard extends UDView<C42961rgL> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final String[] KWHzl = {"init", "refreshContent"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @InterfaceC60044zuT
    public final LuaValue[] init(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return null;
    }

    @InterfaceC60044zuT
    public UDOKMarketQuoteCard(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.trade.experience.view.UDOKMarketQuoteCard.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String[] AEQbTJ() {
            return UDOKMarketQuoteCard.KWHzl;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42961rgL AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C42961rgL(contextAubY, null, 2, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] refreshContent(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C42961rgL) this.dHguZz).AEQbTJ();
        return null;
    }
}
