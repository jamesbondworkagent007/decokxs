package com.immomo.mls.fun.ui.uilib.anchor;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.anchor.MLNOKAnchor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55042xcV;
import o.C7594aml;
import o.C7910asj;
import o.InterfaceC60044zuT;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKAnchor extends UDView<C55042xcV> {
    public static final Application Companion = new Application(null);
    public static final String[] copydefault = {"setIndexData", "onClickCharacter"};
    public static final String OLrzqt = MLNOKAnchor.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKAnchor(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C55042xcV AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C55042xcV(contextAubY, null, 0, 6, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setIndexData(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTable$default(luaValueArr, 0, new Function1() { // from class: o.amx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKAnchor.KWHzl(this.AEQbTJ, (LuaTable) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit KWHzl(MLNOKAnchor mLNOKAnchor, LuaTable luaTable) {
        Intrinsics.checkNotNullParameter(luaTable, "");
        C55042xcV c55042xcV = (C55042xcV) mLNOKAnchor.dHguZz;
        List<String> listOLrzqt = C7910asj.OLrzqt(luaTable);
        Intrinsics.copydefault(listOLrzqt, "");
        c55042xcV.setIndexDataList((ArrayList) listOLrzqt);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] onClickCharacter(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "onClickCharacter", new UDView.TaskDescription() { // from class: o.amt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKAnchor.EZpvd(this.KWHzl, luaFunction);
            }
        });
        return null;
    }

    public static final void EZpvd(MLNOKAnchor mLNOKAnchor, final LuaFunction luaFunction) {
        ((C55042xcV) mLNOKAnchor.dHguZz).setOnClickCharacter(new Function2() { // from class: o.ams
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MLNOKAnchor.KWHzl(luaFunction, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
            }
        });
    }

    public static final Unit KWHzl(LuaFunction luaFunction, int i, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (luaFunction != null) {
            luaFunction.EZpvd(i);
        }
        return Unit.INSTANCE;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.anchor.MLNOKAnchor.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] OLrzqt() {
            return MLNOKAnchor.copydefault;
        }
    }
}
