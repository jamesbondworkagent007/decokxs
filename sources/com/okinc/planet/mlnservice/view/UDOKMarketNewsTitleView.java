package com.okinc.planet.mlnservice.view;

import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import androidx.appcompat.widget.AppCompatTextView;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.planet.mlnservice.view.UDOKMarketNewsTitleView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33061mpO;
import o.C33070mpX;
import o.C46452tUw;
import o.C47501trL;
import o.C52761wXj;
import o.C55298xhM;
import o.InterfaceC60044zuT;
import o.pUU;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC60044zuT
public final class UDOKMarketNewsTitleView extends UDView<AppCompatTextView> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final String[] OLrzqt = {"setTitleContent"};

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.mlnservice.view.UDOKMarketNewsTitleView.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] copydefault() {
            return UDOKMarketNewsTitleView.OLrzqt;
        }
    }

    @InterfaceC60044zuT
    public UDOKMarketNewsTitleView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AppCompatTextView AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return new AppCompatTextView(AubY());
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitleContent(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String str = "";
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length != 2) {
            pUU.copydefault("OKMarketNewsTitleView", "setTitleContent: invalid params");
            return null;
        }
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && (javaString = luaValue.toJavaString()) != null) {
            str = javaString;
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        String javaString2 = luaValue2 != null ? luaValue2.toJavaString() : null;
        ((AppCompatTextView) this.dHguZz).setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
        ((AppCompatTextView) this.dHguZz).setIncludeFontPadding(false);
        ((AppCompatTextView) this.dHguZz).setGravity(16);
        ((AppCompatTextView) this.dHguZz).getTextAlignment();
        ((AppCompatTextView) this.dHguZz).setMaxLines(2);
        ((AppCompatTextView) this.dHguZz).setEllipsize(TextUtils.TruncateAt.END);
        if (str.length() == 0) {
            ((AppCompatTextView) this.dHguZz).setText(javaString2);
        } else {
            ((AppCompatTextView) this.dHguZz).setText(C33061mpO.setupSpanStyles$default(str + " " + javaString2, new String[]{str}, 0, null, false, new Function1() { // from class: o.tTj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDOKMarketNewsTitleView.OLrzqt(this.OLrzqt, (java.util.List) obj);
                }
            }, 14, null));
        }
        return null;
    }

    public static final Unit OLrzqt(UDOKMarketNewsTitleView uDOKMarketNewsTitleView, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TextAppearanceSpan(((AppCompatTextView) uDOKMarketNewsTitleView.dHguZz).getContext(), C47501trL.Dialog.OLrzqt));
        list.add(new C46452tUw(C33070mpX.copydefault(C52761wXj.Activity.UCQKYV), C33070mpX.copydefault(C52761wXj.Activity.RAQtXZ), C55298xhM.dp2pxFloat$default(4.0f, null, 1, null)));
        return Unit.INSTANCE;
    }
}
