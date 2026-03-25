package com.immomo.mls.fun.ui.uilib.search;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.search.MLNOKSearchHistoryView;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55187xfH;
import o.C56532yIw;
import o.C7594aml;
import o.C7910asj;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKSearchHistoryView extends UDView<C55187xfH> {
    public static final Application Companion = new Application(null);
    public static final String[] AEQbTJ = {"title", "items", "itemSelectedCallback", "clearCallback"};
    public static final String KWHzl = MLNOKSearchHistoryView.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKSearchHistoryView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C55187xfH AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C55187xfH(contextAubY, null, 2, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] items(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.djBIcL(luaValueArr, 0, new Function1() { // from class: o.aoN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSearchHistoryView.OLrzqt(this.KWHzl, (LuaTable) obj);
            }
        });
        return null;
    }

    public static final Unit OLrzqt(MLNOKSearchHistoryView mLNOKSearchHistoryView, LuaTable luaTable) {
        Intrinsics.checkNotNullParameter(luaTable, "");
        List listOLrzqt = C7910asj.OLrzqt(luaTable);
        Intrinsics.copydefault(listOLrzqt, "");
        ((C55187xfH) mLNOKSearchHistoryView.dHguZz).setHistoryRecordList(C56532yIw.OLrzqt(listOLrzqt));
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] itemSelectedCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "itemSelected", new UDView.TaskDescription() { // from class: o.aoO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSearchHistoryView.copydefault(this.EZpvd, luaFunction);
            }
        });
        return null;
    }

    public static final void copydefault(MLNOKSearchHistoryView mLNOKSearchHistoryView, final LuaFunction luaFunction) {
        ((C55187xfH) mLNOKSearchHistoryView.dHguZz).setOnItemSelectedCallback(new Function1() { // from class: o.aoP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSearchHistoryView.EZpvd(luaFunction, (java.lang.CharSequence) obj);
            }
        });
    }

    public static final Unit EZpvd(LuaFunction luaFunction, CharSequence charSequence) {
        if (luaFunction != null) {
            luaFunction.copydefault(String.valueOf(charSequence));
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] clearCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, Web3SecurityTrackEvent.VALUE_CLEAR, new UDView.TaskDescription() { // from class: o.aoR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSearchHistoryView.OLrzqt(this.OLrzqt, luaFunction);
            }
        });
        return null;
    }

    public static final void OLrzqt(MLNOKSearchHistoryView mLNOKSearchHistoryView, final LuaFunction luaFunction) {
        ((C55187xfH) mLNOKSearchHistoryView.dHguZz).setClearCallback(new Function0() { // from class: o.aoQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKSearchHistoryView.copydefault(luaFunction);
            }
        });
    }

    public static final Unit copydefault(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.search.MLNOKSearchHistoryView.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] KWHzl() {
            return MLNOKSearchHistoryView.AEQbTJ;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] title(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55187xfH) this.dHguZz).setTitle(javaString);
        return null;
    }
}
