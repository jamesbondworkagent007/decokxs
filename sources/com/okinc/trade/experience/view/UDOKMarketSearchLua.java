package com.okinc.trade.experience.view;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42957rgH;
import o.InterfaceC60044zuT;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public final class UDOKMarketSearchLua extends UDView<C42957rgH> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final String[] OLrzqt = {"init"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @InterfaceC60044zuT
    public final LuaValue[] init(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return null;
    }

    @InterfaceC60044zuT
    public UDOKMarketSearchLua(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.trade.experience.view.UDOKMarketSearchLua.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] copydefault() {
            return UDOKMarketSearchLua.OLrzqt;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42957rgH AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C42957rgH(contextAubY, null, 2, null);
    }
}
