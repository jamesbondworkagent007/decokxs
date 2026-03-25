package com.okinc.trade.experience.view;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42952rgC;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public final class UDOKBoostQuoteCard extends UDView<C42952rgC> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final String[] OLrzqt = {"refreshContent", "setCardPadding"};

    @InterfaceC60044zuT
    public UDOKBoostQuoteCard(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.trade.experience.view.UDOKBoostQuoteCard.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] copydefault() {
            return UDOKBoostQuoteCard.OLrzqt;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42952rgC AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C42952rgC(contextAubY, null, 2, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCardPadding(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length < 2) {
            return null;
        }
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        float f = luaValue != null ? luaValue.toFloat() : 0.0f;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        ((C42952rgC) this.dHguZz).OLrzqt(f, luaValue2 != null ? luaValue2.toFloat() : 0.0f);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] refreshContent(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C42952rgC) this.dHguZz).EZpvd();
        return null;
    }
}
