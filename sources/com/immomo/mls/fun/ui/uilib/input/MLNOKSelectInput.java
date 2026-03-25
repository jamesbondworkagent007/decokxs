package com.immomo.mls.fun.ui.uilib.input;

import android.content.Context;
import android.view.View;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.input.MLNOKSelectInput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC52786wYh;
import o.C54997xbd;
import o.C55001xbh;
import o.C55009xbp;
import o.C55018xby;
import o.C55258xgZ;
import o.C55276xgr;
import o.C56403yEb;
import o.C7594aml;
import o.C7910asj;
import o.InterfaceC60044zuT;
import o.yDV;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKSelectInput extends UDView<C55018xby> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final String[] KWHzl = {"setSizeType", "disabled", "placeholder", "text", "labelText", "helperView", "errored", "helperLabelText", "helperLabelAction", "validator", "items", "onItemSelected", "setSelectItem"};
    public static final Integer[] AEQbTJ = {0, 1};
    public static final Integer[] copydefault = {48, 40, 28, 24};
    public static final String OLrzqt = MLNOKSelectInput.class.getSimpleName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int KWHzl(int i, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        return i;
    }

    @InterfaceC60044zuT
    public MLNOKSelectInput(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C55018xby AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        final C55018xby c55018xby = new C55018xby(contextAubY, null, 0, 6, null);
        C7594aml.safeAccessTypes$default(luaValueArr, AEQbTJ, 0, new Function1() { // from class: o.anB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSelectInput.AEQbTJ(c55018xby, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return c55018xby;
    }

    public static final Unit AEQbTJ(C55018xby c55018xby, int i) {
        c55018xby.setType(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSizeType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, copydefault, 0, new Function1() { // from class: o.anI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSelectInput.OLrzqt(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit OLrzqt(MLNOKSelectInput mLNOKSelectInput, int i) {
        ((C55018xby) mLNOKSelectInput.dHguZz).setSizeType(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] helperView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.anA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSelectInput.EZpvd(this.EZpvd, (android.view.View) obj);
            }
        });
        return null;
    }

    public static final Unit EZpvd(MLNOKSelectInput mLNOKSelectInput, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((C55018xby) mLNOKSelectInput.dHguZz).setSupportingView(view);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] errored(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return LuaValue.rBoolean(((C55018xby) this.dHguZz).wlaJM() == 2);
    }

    @InterfaceC60044zuT
    public final LuaValue[] helperLabelAction(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "helperLabelAction", new UDView.TaskDescription() { // from class: o.anC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSelectInput.AEQbTJ(this.OLrzqt, luaFunction);
            }
        });
        return null;
    }

    public static final void AEQbTJ(MLNOKSelectInput mLNOKSelectInput, final LuaFunction luaFunction) {
        View viewIwGUEr = ((C55018xby) mLNOKSelectInput.dHguZz).iwGUEr();
        if (viewIwGUEr == null || !(viewIwGUEr instanceof C55258xgZ)) {
            return;
        }
        ((C55258xgZ) viewIwGUEr).setOnClickListener(new View.OnClickListener() { // from class: o.anJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKSelectInput.OLrzqt(luaFunction, view);
            }
        });
    }

    public static final void OLrzqt(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] validator(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "validator", new UDView.TaskDescription() { // from class: o.anG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSelectInput.gEmmrt(this.KWHzl, luaFunction);
            }
        });
        return null;
    }

    public static final void gEmmrt(MLNOKSelectInput mLNOKSelectInput, final LuaFunction luaFunction) {
        C55009xbp c55009xbpFIwbmz = ((C55018xby) mLNOKSelectInput.dHguZz).fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.setValidator(new Function1() { // from class: o.anE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MLNOKSelectInput.EZpvd(luaFunction, (java.lang.CharSequence) obj);
                }
            });
        }
    }

    public static final CharSequence EZpvd(LuaFunction luaFunction, CharSequence charSequence) {
        String strSafeGetJavaString$default;
        LuaValue[] luaValueArrInvoke = luaFunction != null ? luaFunction.invoke(LuaValue.rString(String.valueOf(charSequence)), 1) : null;
        return (luaValueArrInvoke == null || (strSafeGetJavaString$default = C7594aml.safeGetJavaString$default(luaValueArrInvoke, 0, null, 2, null)) == null) ? "" : strSafeGetJavaString$default;
    }

    @InterfaceC60044zuT
    public final LuaValue[] items(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTable$default(luaValueArr, 0, new Function1() { // from class: o.anz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSelectInput.KWHzl(this.KWHzl, (LuaTable) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit KWHzl(MLNOKSelectInput mLNOKSelectInput, LuaTable luaTable) {
        Intrinsics.checkNotNullParameter(luaTable, "");
        List listOLrzqt = C7910asj.OLrzqt(luaTable);
        Intrinsics.copydefault(listOLrzqt, "");
        int iAEQbTJ = ((C55018xby) mLNOKSelectInput.dHguZz).AEQbTJ();
        if (iAEQbTJ == 0) {
            C55018xby c55018xby = (C55018xby) mLNOKSelectInput.dHguZz;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            Iterator it = listOLrzqt.iterator();
            while (it.hasNext()) {
                arrayList.add(new C55276xgr((String) it.next(), null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
            }
            c55018xby.setItems(CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList));
        } else if (iAEQbTJ == 1) {
            ((C55018xby) mLNOKSelectInput.dHguZz).setPopoverItems(CollectionsKt___CollectionsKt.fJNWhG((Collection) listOLrzqt));
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] onItemSelected(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "onItemSelected", new UDView.TaskDescription() { // from class: o.anD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSelectInput.OLrzqt(this.KWHzl, luaFunction);
            }
        });
        return null;
    }

    public static final void OLrzqt(MLNOKSelectInput mLNOKSelectInput, final LuaFunction luaFunction) {
        ((C55018xby) mLNOKSelectInput.dHguZz).setOnClickItem(new Function1() { // from class: o.anH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSelectInput.OLrzqt(luaFunction, (java.lang.CharSequence) obj);
            }
        });
    }

    public static final Unit OLrzqt(LuaFunction luaFunction, CharSequence charSequence) {
        String string;
        if (luaFunction != null) {
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            luaFunction.copydefault(string);
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.input.MLNOKSelectInput.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String[] copydefault() {
            return MLNOKSelectInput.KWHzl;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] disabled(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return LuaValue.rBoolean(((C55018xby) this.dHguZz).wlaJM() == 3);
        }
        ((C55018xby) this.dHguZz).setState(luaValue.toBoolean() ? 3 : 1);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] placeholder(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55018xby) this.dHguZz).setHintText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] text(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            C55001xbh c55001xbhAkhnZx = ((C55018xby) this.dHguZz).AkhnZx();
            return LuaValue.rString(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.toString() : null);
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55018xby) this.dHguZz).setText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] labelText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55018xby) this.dHguZz).setLabelText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] helperLabelText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55018xby) this.dHguZz).setLabelText(javaString);
        View viewIwGUEr = ((C55018xby) this.dHguZz).iwGUEr();
        if (viewIwGUEr == null || !(viewIwGUEr instanceof C55258xgZ)) {
            return null;
        }
        ((C55258xgZ) viewIwGUEr).setHelperLabelType(0);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSelectItem(@NotNull LuaValue[] luaValueArr) {
        int iIndexOf;
        C54997xbd c54997xbdEZpvd;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        final int i = 0;
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        int iAEQbTJ = ((C55018xby) this.dHguZz).AEQbTJ();
        if (iAEQbTJ != 0) {
            if (iAEQbTJ != 1 || (iIndexOf = ((C55018xby) this.dHguZz).KWHzl().indexOf(javaString)) < 0 || (c54997xbdEZpvd = ((C55018xby) this.dHguZz).EZpvd()) == null) {
                return null;
            }
            c54997xbdEZpvd.OLrzqt(iIndexOf);
            return null;
        }
        Iterator<C55276xgr> it = ((C55018xby) this.dHguZz).copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((Object) it.next().AhwBna(), (Object) javaString)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        C55276xgr c55276xgr = ((C55018xby) this.dHguZz).copydefault().get(i);
        AbstractC52786wYh abstractC52786wYhOLrzqt = ((C55018xby) this.dHguZz).OLrzqt();
        if (abstractC52786wYhOLrzqt == null) {
            return null;
        }
        abstractC52786wYhOLrzqt.copydefault(c55276xgr, new Function1() { // from class: o.any
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(MLNOKSelectInput.KWHzl(i, (C55276xgr) obj));
            }
        });
        return null;
    }
}
