package com.immomo.mls.fun.ui.item;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.item.MLNOKRegularCell;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C52761wXj;
import o.C55068xcv;
import o.C55298xhM;
import o.C7594aml;
import o.C7773aqE;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKRegularCell extends UDView<OKRegularCell> {
    public C55068xcv AYXKKw;
    public final int AhwBna;
    public final int EZpvd;
    public final int copydefault;
    public ViewGroup gEmmrt;
    public int valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public static final String[] AEQbTJ = {"setImage", "setRightImage", "setTitle", "setDescriptionText", "setRightText", "setOnClick", "setRightView", "fixedHeight", "enabled"};
    public static final String OLrzqt = MLNOKRegularCell.class.getSimpleName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull C55068xcv c55068xcv) {
        Intrinsics.checkNotNullParameter(c55068xcv, "");
        this.AYXKKw = c55068xcv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.gEmmrt = viewGroup;
    }

    @InterfaceC60044zuT
    public MLNOKRegularCell(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.copydefault = 1;
        this.EZpvd = 2;
        this.AhwBna = 4;
    }

    public final ViewGroup valueOf() {
        ViewGroup viewGroup = this.gEmmrt;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C55068xcv gEmmrt() {
        C55068xcv c55068xcv = this.AYXKKw;
        if (c55068xcv != null) {
            return c55068xcv;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public OKRegularCell AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        OKRegularCell oKRegularCell = new OKRegularCell(contextAubY, null, 0, 6, null);
        ImageView imageViewOLrzqt = oKRegularCell.OLrzqt();
        ViewGroup.LayoutParams layoutParams = imageViewOLrzqt.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            imageViewOLrzqt.setLayoutParams(layoutParams);
            oKRegularCell.setIconTint(oKRegularCell.getContext().getColorStateList(C52761wXj.Activity.DcMfJKsfEqpH));
            C7773aqE c7773aqE = new C7773aqE(oKRegularCell.getContext());
            OLrzqt(c7773aqE);
            c7773aqE.setOrientation(0);
            oKRegularCell.setGravity(16);
            Context context = c7773aqE.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C55068xcv c55068xcv = new C55068xcv(context, null, 0, 6, null);
            EZpvd(c55068xcv);
            c55068xcv.setIcon(null);
            c7773aqE.addView(c55068xcv, -2, -1);
            c7773aqE.setVisibility(8);
            oKRegularCell.addView(c7773aqE);
            return oKRegularCell;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @InterfaceC60044zuT
    public final LuaValue[] setImage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context context = ((OKRegularCell) this.dHguZz).getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C7594aml.loadImage$default(luaValueArr, context, 0, new Function1() { // from class: o.amb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKRegularCell.OLrzqt(this.EZpvd, (android.graphics.drawable.Drawable) obj);
            }
        }, 2, (Object) null);
        return null;
    }

    public static final Unit OLrzqt(MLNOKRegularCell mLNOKRegularCell, Drawable drawable) {
        ((OKRegularCell) mLNOKRegularCell.dHguZz).setIcon(drawable);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setRightImage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context context = ((OKRegularCell) this.dHguZz).getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C7594aml.loadImage$default(luaValueArr, context, 0, new Function1() { // from class: o.amh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKRegularCell.KWHzl(this.OLrzqt, (android.graphics.drawable.Drawable) obj);
            }
        }, 2, (Object) null);
        return null;
    }

    public static final Unit KWHzl(MLNOKRegularCell mLNOKRegularCell, Drawable drawable) {
        mLNOKRegularCell.gEmmrt().setIcon(drawable);
        mLNOKRegularCell.OLrzqt(mLNOKRegularCell.copydefault, drawable != null);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setRightView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        View viewSafeGetView$default = C7594aml.safeGetView$default(luaValueArr, 0, 1, null);
        ViewGroup viewGroupValueOf = valueOf();
        if (viewGroupValueOf.getChildCount() > 1) {
            viewGroupValueOf.removeViewAt(1);
        }
        if (viewSafeGetView$default != null) {
            viewGroupValueOf.addView(viewSafeGetView$default);
        }
        OLrzqt(this.AhwBna, viewSafeGetView$default != null);
        return null;
    }

    public final void OLrzqt(int i, boolean z) {
        this.valueOf = z ? i | this.valueOf : (~i) & this.valueOf;
        valueOf().setVisibility(this.valueOf != 0 ? 0 : 8);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOnClick(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "onClick", new UDView.TaskDescription() { // from class: o.amg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKRegularCell.KWHzl(this.AEQbTJ, luaFunction);
            }
        });
        return null;
    }

    public static final void KWHzl(MLNOKRegularCell mLNOKRegularCell, final LuaFunction luaFunction) {
        ((OKRegularCell) mLNOKRegularCell.dHguZz).setOnClickListener(new View.OnClickListener() { // from class: o.amc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKRegularCell.EZpvd(luaFunction, view);
            }
        });
    }

    public static final void EZpvd(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.item.MLNOKRegularCell.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] OLrzqt() {
            return MLNOKRegularCell.AEQbTJ;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((OKRegularCell) this.dHguZz).setTitle(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDescriptionText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((OKRegularCell) this.dHguZz).setDescription(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setRightText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            gEmmrt().setText((CharSequence) null);
            OLrzqt(this.EZpvd, C33129mqd.OLrzqt((CharSequence) null));
        } else {
            String javaString = luaValue.toJavaString();
            gEmmrt().setText(javaString);
            OLrzqt(this.EZpvd, C33129mqd.OLrzqt((CharSequence) javaString));
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] fixedHeight(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            ((OKRegularCell) this.dHguZz).setMinimumHeight(C55298xhM.dpInt$default(luaValue.toInt(), (Context) null, 1, (Object) null));
        }
        return null;
    }
}
