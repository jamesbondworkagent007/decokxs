package com.immomo.mls.fun.ui.uilib.checkbox;

import android.content.Context;
import android.text.TextUtils;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.checkbox.MLNOKCheckBox;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.wYK;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKCheckBox extends UDView<wYK> {
    public final Integer[] EZpvd;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final String[] copydefault = {"setSize", "title", "styleTitle", "enabled", "selected", "statusDidChangeCallback", "singleLine"};
    public static final String OLrzqt = MLNOKCheckBox.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKCheckBox(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.EZpvd = new Integer[]{-4, -5};
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public wYK AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        wYK wyk = new wYK(contextAubY, null, 0, 6, null);
        wyk.setSingleLine(true);
        wyk.setEllipsize(TextUtils.TruncateAt.END);
        return wyk;
    }

    @InterfaceC60044zuT
    public final LuaValue[] styleTitle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        V v = this.dHguZz;
        Intrinsics.checkNotNullExpressionValue(v, "");
        C7594aml.safeSetStyleText$default((TextView) v, luaValueArr, 0, 2, null);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] statusDidChangeCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "statusDidChangeCallback", new UDView.TaskDescription() { // from class: o.amN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKCheckBox.EZpvd(this.OLrzqt, luaFunction);
            }
        });
        return null;
    }

    public static final void EZpvd(final MLNOKCheckBox mLNOKCheckBox, final LuaFunction luaFunction) {
        ((wYK) mLNOKCheckBox.dHguZz).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.amQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                MLNOKCheckBox.OLrzqt(luaFunction, mLNOKCheckBox, compoundButton, z);
            }
        });
    }

    public static final void OLrzqt(LuaFunction luaFunction, MLNOKCheckBox mLNOKCheckBox, CompoundButton compoundButton, boolean z) {
        if (luaFunction != null) {
            luaFunction.AEQbTJ(mLNOKCheckBox);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.checkbox.MLNOKCheckBox.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] OLrzqt() {
            return MLNOKCheckBox.copydefault;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(this.EZpvd, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((wYK) this.dHguZz).setOKDSSize(num.intValue());
        return null;
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
        ((wYK) this.dHguZz).setText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] selected(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return LuaValue.rBoolean(((wYK) this.dHguZz).isChecked());
        }
        ((wYK) this.dHguZz).setChecked(luaValue.toBoolean());
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] enabled(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return LuaValue.rBoolean(((wYK) this.dHguZz).isEnabled());
        }
        ((wYK) this.dHguZz).setEnabled(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] singleLine(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((wYK) this.dHguZz).setSingleLine(luaValue.toBoolean());
        ((wYK) this.dHguZz).setEllipsize(TextUtils.TruncateAt.END);
        return null;
    }
}
