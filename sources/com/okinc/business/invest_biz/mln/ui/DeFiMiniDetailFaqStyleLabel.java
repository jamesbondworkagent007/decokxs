package com.okinc.business.invest_biz.mln.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.immomo.mls.fun.ud.view.UDLabel;
import com.okinc.business.invest_biz.mln.ui.DeFiMiniDetailFaqStyleLabel;
import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C27508jwX;
import o.C52761wXj;
import o.C55135xeI;
import o.C55210xfe;
import o.InterfaceC55228xfw;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC60044zuT
public final class DeFiMiniDetailFaqStyleLabel extends UDLabel<TextView> {
    public static final Application Companion = new Application(null);
    public static final String[] OLrzqt = {"setHtmlContent"};

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.mln.ui.DeFiMiniDetailFaqStyleLabel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] KWHzl() {
            return DeFiMiniDetailFaqStyleLabel.OLrzqt;
        }
    }

    @InterfaceC60044zuT
    public DeFiMiniDetailFaqStyleLabel(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r6v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] setHtmlContent(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null) {
            String javaString = luaValue instanceof LuaString ? ((LuaString) luaValue).toJavaString() : null;
            if (javaString != null) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
                objectRef.element = (luaValue2 == null || !(luaValue2 instanceof LuaFunction)) ? 0 : ((LuaFunction) luaValue2).toLuaFunction();
                final Context contextAubY = AubY();
                if (contextAubY == null) {
                    return null;
                }
                try {
                    C55135xeI c55135xeI = new C55135xeI(contextAubY, new InterfaceC55228xfw() { // from class: o.iOs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC55228xfw
                        public final boolean OLrzqt(java.lang.String str) {
                            return DeFiMiniDetailFaqStyleLabel.copydefault(objectRef, contextAubY, str);
                        }
                    });
                    c55135xeI.EZpvd("li", new C55210xfe(ContextCompat.getColor(contextAubY, C52761wXj.Activity.UlJrfe)));
                    Spannable spannableAEQbTJ = c55135xeI.AEQbTJ(javaString);
                    TextView textView = (TextView) f_();
                    textView.setText(spannableAEQbTJ);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                } catch (Exception unused) {
                    ((TextView) f_()).setText(javaString);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean copydefault(Ref.ObjectRef objectRef, Context context, String str) throws UnsupportedEncodingException {
        T t = objectRef.element;
        if (t != 0) {
            ((LuaFunction) t).invoke(LuaValue.rString(str));
            return true;
        }
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        Intrinsics.copydefault((Object) str);
        C27508jwX.openUrl$default(c27508jwX, context, str, false, 2, null);
        return true;
    }
}
