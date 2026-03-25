package com.immomo.mls.fun.ui.uilib.text;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.text.MLNHyperlinkText;
import com.okinc.uilib.hyperlink.state.HyperlinkSize;
import com.okinc.uilib.hyperlink.state.HyperlinkStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55390xiz;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public final class MLNHyperlinkText extends UDView<C55390xiz> {
    public static final Application Companion = new Application(null);
    public static final String[] OLrzqt = {"size", "text", "enabled", "showLinkIcon", "shouldShowLinkIcon", "showUnderline", "shouldShowUnderline", "type"};
    public static final Integer[] AEQbTJ = {Integer.valueOf(HyperlinkSize.SMALL.getId()), Integer.valueOf(HyperlinkSize.MEDIUM.getId()), Integer.valueOf(HyperlinkSize.LARGE.getId())};
    public static final Integer[] KWHzl = {Integer.valueOf(HyperlinkStyle.PRIMARY.getId()), Integer.valueOf(HyperlinkStyle.ACCENT.getId())};

    @InterfaceC60044zuT
    public MLNHyperlinkText(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C55390xiz AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C55390xiz c55390xiz = new C55390xiz(contextAubY, null, 0, 6, null);
        c55390xiz.setSize(HyperlinkSize.LARGE);
        return c55390xiz;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] size(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, AEQbTJ, 0, new Function1() { // from class: o.apX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNHyperlinkText.KWHzl(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit KWHzl(MLNHyperlinkText mLNHyperlinkText, int i) {
        ((C55390xiz) mLNHyperlinkText.dHguZz).setSize(HyperlinkSize.Companion.EZpvd(i));
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] type(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.OLrzqt(luaValueArr, KWHzl, 0, (Function1<? super Integer, Unit>) new Function1() { // from class: o.apS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNHyperlinkText.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        return null;
    }

    public static final Unit AEQbTJ(MLNHyperlinkText mLNHyperlinkText, int i) {
        ((C55390xiz) mLNHyperlinkText.dHguZz).setStyle(HyperlinkStyle.Companion.copydefault(i));
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] shouldShowLinkIcon(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return LuaValue.rBoolean(((C55390xiz) this.dHguZz).EZpvd());
    }

    @InterfaceC60044zuT
    public final LuaValue[] shouldShowUnderline(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return LuaValue.rBoolean(((C55390xiz) this.dHguZz).AYXKKw());
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.text.MLNHyperlinkText.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] text(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString() || (javaString = luaValue.toJavaString()) == null) {
            return null;
        }
        ((C55390xiz) this.dHguZz).setText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] showLinkIcon(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((C55390xiz) this.dHguZz).copydefault(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] showUnderline(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((C55390xiz) this.dHguZz).AEQbTJ(luaValue.toBoolean());
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] enabled(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((C55390xiz) this.dHguZz).setEnabled(luaValue.toBoolean());
        return null;
    }
}
