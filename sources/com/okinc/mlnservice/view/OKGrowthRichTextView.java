package com.okinc.mlnservice.view;

import android.widget.TextView;
import com.immomo.mls.fun.ud.view.UDView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.C43178rkQ;
import o.C7817aqw;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC60044zuT
public class OKGrowthRichTextView<U extends TextView> extends UDView<U> {
    public LuaFunction KWHzl;
    public C7817aqw OLrzqt;
    public static final String[] EZpvd = {"OKGrowthRichTextView"};
    public static final String[] AEQbTJ = {"setHtmlStr"};

    @InterfaceC60044zuT
    public OKGrowthRichTextView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(LuaValue[] luaValueArr) {
        C7817aqw c7817aqw = new C7817aqw(AubY());
        this.OLrzqt = c7817aqw;
        return c7817aqw;
    }

    @InterfaceC60044zuT
    public LuaValue[] setHtmlStr(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0].isString()) {
            String javaString = luaValueArr[0].toJavaString();
            if (luaValueArr.length >= 2 && luaValueArr[1].isFunction()) {
                this.KWHzl = luaValueArr[1].toLuaFunction();
            }
            if (this.KWHzl == null) {
                C43178rkQ.copydefault.EZpvd(f_(), javaString, null);
            } else {
                C43178rkQ.copydefault.EZpvd(f_(), javaString, new Function1() { // from class: o.rkY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return this.copydefault.OLrzqt((java.lang.String) obj);
                    }
                });
            }
        }
        return null;
    }

    public final /* synthetic */ Unit OLrzqt(String str) {
        this.KWHzl.invoke(LuaValue.varargsOf(LuaString.copydefault(str)));
        return null;
    }
}
