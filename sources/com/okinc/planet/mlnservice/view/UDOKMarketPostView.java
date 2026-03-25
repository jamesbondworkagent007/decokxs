package com.okinc.planet.mlnservice.view;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.planet.mlnservice.view.UDOKMarketPostView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.C7910asj;
import o.InterfaceC60044zuT;
import o.pUU;
import o.tUW;
import o.yDV;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC60044zuT
public final class UDOKMarketPostView extends UDView<tUW> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final String[] KWHzl = {"setPostContent"};

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.mlnservice.view.UDOKMarketPostView.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] EZpvd() {
            return UDOKMarketPostView.KWHzl;
        }
    }

    @InterfaceC60044zuT
    public UDOKMarketPostView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public tUW AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new tUW(contextAubY, null, 0, 6, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPostContent(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        List<String> listAhwBna;
        List listCopydefault;
        String javaString2;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length < 5) {
            pUU.copydefault("OKMarketPostView", "setPostContent: invalid params");
            return null;
        }
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String str = (luaValue == null || (javaString2 = luaValue.toJavaString()) == null) ? "" : javaString2;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        LuaTable luaTable = luaValue2 != null ? luaValue2.toLuaTable() : null;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        if (luaValue3 == null || (javaString = luaValue3.toJavaString()) == null) {
            javaString = "";
        }
        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
        final LuaFunction luaFunction = luaValue4 != null ? luaValue4.toLuaFunction() : null;
        LuaValue luaValue5 = (LuaValue) yDV.gEmmrt(luaValueArr, 4);
        boolean z = luaValue5 != null ? luaValue5.toBoolean() : true;
        LuaValue luaValue6 = (LuaValue) yDV.gEmmrt(luaValueArr, 5);
        boolean z2 = luaValue6 != null ? luaValue6.toBoolean() : false;
        if (luaTable == null || (listCopydefault = C7910asj.copydefault(luaTable)) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            Iterator it = listCopydefault.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next()));
            }
            listAhwBna = arrayList;
        }
        ((tUW) this.dHguZz).setTextAndAvatars(str, javaString, listAhwBna, z, z2, new Function0() { // from class: o.tTh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UDOKMarketPostView.copydefault(luaFunction);
            }
        });
        return null;
    }

    public static final Unit copydefault(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaValue.Nil()));
        }
        return Unit.INSTANCE;
    }
}
