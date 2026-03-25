package com.immomo.mls.fun.ui.uilib.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.text.MLNOKHelperLabel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55258xgZ;
import o.C55298xhM;
import o.C55312xha;
import o.C55320xhi;
import o.C7594aml;
import o.C7829arH;
import o.InterfaceC60044zuT;
import o.wYC;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKHelperLabel extends UDView<C55258xgZ> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final String[] copydefault = {TtmlNode.TAG_STYLE, "text", TtmlNode.ATTR_TTS_TEXT_ALIGN, "textColor", "underlineColor", TtmlNode.ATTR_TTS_FONT_SIZE, "fontType", "lineSpacing", "lineHeight", "onIconClick", "iconColor"};
    public static final Integer[] KWHzl = {0, 1, 2};
    public static final String EZpvd = MLNOKHelperLabel.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKHelperLabel(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C55258xgZ AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C55258xgZ c55258xgZ = new C55258xgZ(contextAubY, null, 0, 6, null);
        C55312xha c55312xhaValueOf = c55258xgZ.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setIncludeFontPadding(false);
        }
        return c55258xgZ;
    }

    @InterfaceC60044zuT
    public final LuaValue[] style(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, KWHzl, 0, new Function1() { // from class: o.apV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKHelperLabel.gEmmrt(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit gEmmrt(MLNOKHelperLabel mLNOKHelperLabel, int i) {
        ((C55258xgZ) mLNOKHelperLabel.dHguZz).setHelperLabelType(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] textColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessColor$default(luaValueArr, 0, new Function1() { // from class: o.aqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKHelperLabel.djBIcL(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        }, 1, null);
        return null;
    }

    public static final Unit djBIcL(MLNOKHelperLabel mLNOKHelperLabel, int i) {
        ((C55258xgZ) mLNOKHelperLabel.dHguZz).setTextColor(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] underlineColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessColor$default(luaValueArr, 0, new Function1() { // from class: o.apZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKHelperLabel.AhwBna(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        }, 1, null);
        return null;
    }

    public static final Unit AhwBna(MLNOKHelperLabel mLNOKHelperLabel, int i) {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = ((C55258xgZ) mLNOKHelperLabel.dHguZz).valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setUnderlineColor(i);
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] onIconClick(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "onIconClick", new UDView.TaskDescription() { // from class: o.apY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKHelperLabel.EZpvd(this.AEQbTJ, luaFunction);
            }
        });
        return null;
    }

    public static final void EZpvd(MLNOKHelperLabel mLNOKHelperLabel, final LuaFunction luaFunction) {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = ((C55258xgZ) mLNOKHelperLabel.dHguZz).valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setAttachClickListener(new Function0() { // from class: o.apW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKHelperLabel.EZpvd(luaFunction);
            }
        });
    }

    public static final Unit EZpvd(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] iconColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessColor$default(luaValueArr, 0, new Function1() { // from class: o.aqe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKHelperLabel.valueOf(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        }, 1, null);
        return null;
    }

    public static final Unit valueOf(MLNOKHelperLabel mLNOKHelperLabel, int i) {
        wYC wycCopydefault = ((C55258xgZ) mLNOKHelperLabel.dHguZz).copydefault();
        if (wycCopydefault != null) {
            wycCopydefault.setImageTintList(ColorStateList.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] bgColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessColor$default(luaValueArr, 0, new Function1() { // from class: o.aqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKHelperLabel.AYXKKw(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        }, 1, null);
        return null;
    }

    public static final Unit AYXKKw(MLNOKHelperLabel mLNOKHelperLabel, int i) {
        ((C55258xgZ) mLNOKHelperLabel.dHguZz).setBackgroundColor(i);
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.text.MLNOKHelperLabel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] KWHzl() {
            return MLNOKHelperLabel.copydefault;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] text(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            ((C55258xgZ) this.dHguZz).setTextValue(null);
        } else {
            ((C55258xgZ) this.dHguZz).setTextValue(luaValue.toJavaString());
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] textAlign(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        ((C55258xgZ) this.dHguZz).setGravity(luaValue.toInt());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] fontSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isNumber()) {
            return null;
        }
        ((C55258xgZ) this.dHguZz).setTextSize(luaValue.toFloat());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] fontType(@NotNull LuaValue[] luaValueArr) {
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        C7829arH c7829arH = C7829arH.KWHzl;
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        Typeface typefaceAEQbTJ = c7829arH.AEQbTJ(javaString, contextAubY);
        if (typefaceAEQbTJ == null || (c55312xhaValueOf = ((C55258xgZ) this.dHguZz).valueOf()) == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return null;
        }
        c55320xhiKWHzl.setTypeface(typefaceAEQbTJ);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] lineSpacing(@NotNull LuaValue[] luaValueArr) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isNumber()) {
            float f = luaValue.toFloat();
            C55312xha c55312xhaValueOf = ((C55258xgZ) this.dHguZz).valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl.setLineSpacing(C55298xhM.dp$default(f, (Context) null, 1, (Object) null), 1.0f);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] lineHeight(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isNumber()) {
            ((C55258xgZ) this.dHguZz).setLineHeight(C55298xhM.dpInt$default(luaValue.toFloat(), (Context) null, 1, (Object) null));
        }
        return null;
    }
}
